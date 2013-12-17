package com.feedeo.bingadsapi.service;

import com.feedeo.bingadsapi.impl.BeforeInvokeInterceptor;
import com.feedeo.bingadsapi.impl.InterceptorFactory;
import com.feedeo.bingadsapi.impl.LocatorInstantiator;
import com.feedeo.bingadsapi.impl.ReturnValueInterceptor;
import com.feedeo.bingadsapi.impl.ServiceInstantiator;
import com.feedeo.bingadsapi.impl.ServiceInvocationProxyFactory;
import com.feedeo.bingadsapi.impl.StubHeaderSetterService;
import com.feedeo.bingadsapi.session.BingAdsSession;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

import java.rmi.Remote;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 08:36
 */
public class BingAdsServices {

    private LocatorInstantiator locatorInstantiator;
    private ServiceInstantiator serviceInstantiator;
    private StubHeaderSetterService stubHeaderSetterService;
    private ServiceInvocationProxyFactory serviceInvocationProxyFactory;
    private InterceptorFactory interceptorFactory;

    // For testing
    public BingAdsServices(LocatorInstantiator locatorInstantiator,
                           ServiceInstantiator serviceInstantiator,
                           StubHeaderSetterService stubHeaderSetterService,
                           ServiceInvocationProxyFactory serviceInvocationProxyFactory,
                           InterceptorFactory interceptorFactory) {
        this.locatorInstantiator = locatorInstantiator;
        this.serviceInstantiator = serviceInstantiator;
        this.stubHeaderSetterService = stubHeaderSetterService;
        this.serviceInvocationProxyFactory = serviceInvocationProxyFactory;
        this.interceptorFactory = interceptorFactory;
    }

    public BingAdsServices() {
        locatorInstantiator = new LocatorInstantiator();
        serviceInstantiator = new ServiceInstantiator();
        stubHeaderSetterService = new StubHeaderSetterService();
        serviceInvocationProxyFactory = new ServiceInvocationProxyFactory();
        interceptorFactory = new InterceptorFactory();
    }

    public <T extends java.rmi.Remote> T getService(BingAdsSession session, Class<T> serviceClass) {
        try {
            Service locator = locatorInstantiator.instantiateLocator(serviceClass);
            T service = serviceInstantiator.instantiateService(locator, serviceClass);
            String namespaceURI = locator.getServiceName().getNamespaceURI();
            stubHeaderSetterService.setHeaders((Stub) service, session, namespaceURI);

            BeforeInvokeInterceptor<T> beforeInterceptor = createBeforeInterceptor(session, namespaceURI);
            ReturnValueInterceptor<T> returnValueInterceptor = createReturnValueInterceptor();

            return serviceInvocationProxyFactory.createServiceProxy(session, service, serviceClass, beforeInterceptor, returnValueInterceptor);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private <T extends Remote> BeforeInvokeInterceptor<T> createBeforeInterceptor(BingAdsSession session, String namespaceURI) {
        if (session.hasOAuth2Credential()) {
            return interceptorFactory.createCredentialRefreshInterceptor(stubHeaderSetterService, namespaceURI);
        } else {
            return interceptorFactory.createDefaultBeforeInterceptor();
        }
    }

    private <T extends Remote> ReturnValueInterceptor<T> createReturnValueInterceptor() {
        return interceptorFactory.createLoggingInterceptor();
    }
}
