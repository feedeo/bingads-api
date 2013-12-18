package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.client.Stub;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:50
 */
public class ServiceInvocationHandler<T extends java.rmi.Remote> implements InvocationHandler {
    private BingAdsSession session;
    private T service;
    private BeforeInvokeInterceptor<T> beforeInvokeInterceptor;
    private ReturnValueInterceptor<T> returnValueInterceptor;

    public ServiceInvocationHandler(BingAdsSession session,
                                    T service,
                                    BeforeInvokeInterceptor<T> beforeInvokeInterceptor,
                                    ReturnValueInterceptor<T> returnValueInterceptor) {
        this.session = session;
        this.service = service;
        this.beforeInvokeInterceptor = beforeInvokeInterceptor;
        this.returnValueInterceptor = returnValueInterceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvokeInterceptor.intercept(session, service);

        SoapCallReturnInfo soapCallReturnInfo = makeCall(method, args);

        returnValueInterceptor.intercept(session, service, soapCallReturnInfo);

        Throwable throwable = soapCallReturnInfo.getThrowable();
        if (throwable != null) {
            throw throwable;
        }

        return soapCallReturnInfo.getReturnValue();
    }

    private SoapCallReturnInfo makeCall(Method method, Object[] args) {
        SoapCallReturnInfo soapCallReturnInfo = new SoapCallReturnInfo();

        synchronized (service) {
            Object returnValue = null;
            try {
                returnValue = method.invoke(service, args);
                soapCallReturnInfo.setReturnValue(returnValue);
            } catch (InvocationTargetException e) {
                soapCallReturnInfo.setThrowable(e.getTargetException());
            } catch (Throwable t) {
                soapCallReturnInfo.setThrowable(t);
            } finally {
                if (service instanceof Stub) {
                    Stub stub = (Stub) service;
                    MessageContext messageContext = getMessageContext(stub);
                    try {
                        soapCallReturnInfo.setUrl(getUrl(stub));
                        soapCallReturnInfo.setMethodName(getMethodName(stub));
                        soapCallReturnInfo.setServiceName(getServiceName(stub));
                        soapCallReturnInfo.setSoapRequestXml(getSoapRequestXml(messageContext));
                    } catch (AxisFault e) {
                        soapCallReturnInfo.setThrowable(e);
                    }
                    try {
                        soapCallReturnInfo.setSoapResponseXml(getSoapResponseXml(messageContext));
                    } catch (AxisFault e) {
                        soapCallReturnInfo.setThrowable(e);
                    }
                }
            }
            return soapCallReturnInfo;
        }
    }

    private String getUrl(Stub stub) {
        if (stub == null || stub._getCall() == null) {
            return null;
        }
        return stub._getCall().getTargetEndpointAddress();
    }

    private String getMethodName(Stub stub) {
        if (stub == null || stub._getCall() == null || stub._getCall().getOperationName() == null) {
            return null;
        }
        return stub._getCall().getOperationName().getLocalPart();
    }

    private String getServiceName(Stub stub) {
        if (stub == null || stub.getPortName() == null) {
            return null;
        }
        return stub.getPortName().getLocalPart();
    }

    private String getSoapRequestXml(MessageContext messageContext) throws AxisFault {
        if (messageContext == null || messageContext.getRequestMessage() == null) {
            return null;
        }
        return messageContext.getRequestMessage().getSOAPPartAsString();
    }

    private String getSoapResponseXml(MessageContext messageContext) throws AxisFault {
        if (messageContext == null || messageContext.getResponseMessage() == null) {
            return null;
        }
        return messageContext.getResponseMessage().getSOAPPartAsString();
    }

    private MessageContext getMessageContext(Stub stub) {
        if (stub == null || stub._getCall() == null) {
            return null;
        }
        return stub._getCall().getMessageContext();
    }
}
