package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:44
 */
public class CredentialRefreshProxyFactory {
    public <T extends java.rmi.Remote> T addCredentialRefreshProxy(BingAdsSession session,
                                                                   T service,
                                                                   Class<T> serviceClass,
                                                                   StubHeaderSetterService stubHeaderSetterService,
                                                                   String apiNamespace) {
        InvocationHandler handler = new CredentialRefreshInvocationHandler<T>(session, service, stubHeaderSetterService, apiNamespace);
        return (T) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                                          new Class[] { serviceClass },
                                          handler);
    }
}
