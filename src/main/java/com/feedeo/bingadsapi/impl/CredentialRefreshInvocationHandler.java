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
public class CredentialRefreshInvocationHandler implements InvocationHandler {
    private static final Logger log = Logger.getLogger(CredentialRefreshInvocationHandler.class);

    private BingAdsSession session;

    public CredentialRefreshInvocationHandler(BingAdsSession session) {
        this.session = session;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(isCredentialRefreshable(session.getOAuth2Credential(), session.getRefreshWindowSeconds())) {
            log.debug("Refreshing token for BingAds session for account id " + session.getAccountId() + " and customer id " + session.getCustomerId());
            session.getOAuth2Credential().refreshToken();
        }

        return method.invoke(proxy, args);
    }

    private boolean isCredentialRefreshable(Credential credential, long refreshWindowSeconds) {
        return credential.getAccessToken() == null ||
               (credential.getExpiresInSeconds() != null && credential.getExpiresInSeconds() <= refreshWindowSeconds);
    }
}
