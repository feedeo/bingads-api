package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;

import java.rmi.Remote;

/**
 * User: maglju
 * Date: 2013-12-17
 * Time: 10:30
 */
public class InterceptorFactory {

    public <T extends Remote> BeforeInvokeInterceptor<T> createCredentialRefreshInterceptor(StubHeaderSetterService stubHeaderSetterService, String apiNamespace) {
        return new CredentialRefreshInterceptor<T>(stubHeaderSetterService, apiNamespace);
    }

    public <T extends Remote> BeforeInvokeInterceptor<T> createDefaultBeforeInterceptor() {
        return new NoopBeforeInvokeInterceptor<T>();
    }

    public <T extends Remote> ReturnValueInterceptor<T> createLoggingInterceptor() {
        return new LoggingInterceptor<T>();
    }
}
