package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:44
 */
public class ServiceInvocationProxyFactory {
    public <T extends java.rmi.Remote> T createServiceProxy(BingAdsSession session,
                                                            T service,
                                                            Class<T> serviceClass,
                                                            BeforeInvokeInterceptor<T> beforeInvokeInterceptor,
                                                            ReturnValueInterceptor<T> returnValueInterceptor) {
        InvocationHandler handler = new ServiceInvocationHandler<T>(session, service, beforeInvokeInterceptor, returnValueInterceptor);
        return (T) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                                          new Class[] { serviceClass },
                                          handler);
    }
}
