package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import com.google.api.client.auth.oauth2.Credential;
import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:50
 */
public class ServiceInvocationHandler<T extends java.rmi.Remote> implements InvocationHandler {
    private static final Logger log = Logger.getLogger(ServiceInvocationHandler.class);

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
        if(throwable != null) {
            throw throwable;
        }

        return soapCallReturnInfo.getReturnValue();
    }

    private SoapCallReturnInfo makeCall(Method method, Object[] args) {
        SoapCallReturnInfo soapCallReturnInfo = new SoapCallReturnInfo();

        Object returnValue;

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
                MessageContext messageContext = stub._getCall().getMessageContext();
                try {
                    soapCallReturnInfo.setUrl(stub._getCall().getTargetEndpointAddress());
                    soapCallReturnInfo.setMethodName(stub._getCall().getOperationName().getLocalPart());
                    soapCallReturnInfo.setServiceName(stub.getPortName().getLocalPart());
                    soapCallReturnInfo.setSoapRequestXml(messageContext.getRequestMessage().getSOAPPartAsString());
                } catch (AxisFault e) {
                    soapCallReturnInfo.setThrowable(e);
                }
                try {
                    soapCallReturnInfo.setSoapResponseXml(messageContext.getResponseMessage().getSOAPPartAsString());
                } catch (AxisFault e) {
                    soapCallReturnInfo.setThrowable(e);
                }
            }
        }
        return soapCallReturnInfo;
    }
}
