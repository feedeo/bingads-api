package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import com.google.api.client.auth.oauth2.Credential;
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

    public CredentialRefreshInvocationHandler(BingAdsSession session, T service) {
        this.session = session;
        this.service = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(isCredentialRefreshable(session.getOAuth2Credential(), session.getRefreshWindowSeconds())) {
            log.debug("Refreshing token for BingAds session for account id " + session.getAccountId() + " and customer id " + session.getCustomerId());
            session.getOAuth2Credential().refreshToken();
        }

        return method.invoke(service, args);
    }

    private boolean isCredentialRefreshable(Credential credential, long refreshWindowSeconds) {
        return credential.getAccessToken() == null ||
               (credential.getExpiresInSeconds() != null && credential.getExpiresInSeconds() <= refreshWindowSeconds);
    }
}
