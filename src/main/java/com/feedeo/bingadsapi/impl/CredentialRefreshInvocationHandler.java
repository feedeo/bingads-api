package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import com.google.api.client.auth.oauth2.Credential;
import org.apache.axis.client.Stub;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:50
 */
public class CredentialRefreshInvocationHandler<T extends java.rmi.Remote> implements InvocationHandler {
    private static final Logger log = Logger.getLogger(CredentialRefreshInvocationHandler.class);

    private BingAdsSession session;
    private T service;
    private StubHeaderSetterService stubHeaderSetterService;
    private String apiNamespace;

    public CredentialRefreshInvocationHandler(BingAdsSession session, T service, StubHeaderSetterService stubHeaderSetterService, String apiNamespace) {
        this.session = session;
        this.service = service;
        this.stubHeaderSetterService = stubHeaderSetterService;
        this.apiNamespace = apiNamespace;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(isCredentialRefreshable(session.getOAuth2Credential(), session.getRefreshWindowSeconds())) {
            log.debug("Refreshing token for BingAds session for account id " + session.getAccountId() + " and customer id " + session.getCustomerId());
            log.debug("Current token: " + session.getOAuth2Credential().getAccessToken());
            session.getOAuth2Credential().refreshToken();
            stubHeaderSetterService.updateAuthenticationToken((Stub) service, session, apiNamespace);
            log.debug("Refreshed token: " + session.getOAuth2Credential().getAccessToken());
        }

        if (service instanceof Stub) {
            Stub stub = (Stub) service;
            log.debug("Invoking service with authentication header: " + stub.getHeader(apiNamespace, "AuthenticationToken"));
        }
        return method.invoke(service, args);
    }

    private boolean isCredentialRefreshable(Credential credential, long refreshWindowSeconds) {
        return credential.getAccessToken() == null ||
               (credential.getExpiresInSeconds() != null && credential.getExpiresInSeconds() <= refreshWindowSeconds);
    }
}
