package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import com.google.api.client.auth.oauth2.Credential;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:44
 */
public class CredentialRefreshProxyFactory {
    public <T extends java.rmi.Remote> T addCredentialRefreshProxy(BingAdsSession session, T service, Class<T> serviceClass) {
        InvocationHandler handler = new CredentialRefreshInvocationHandler(session);
        return (T) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                                          new Class[] { serviceClass },
                                          handler);
    }
}
