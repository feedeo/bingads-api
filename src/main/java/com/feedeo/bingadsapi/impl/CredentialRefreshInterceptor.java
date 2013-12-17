package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import com.google.api.client.auth.oauth2.Credential;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:50
 */
public class CredentialRefreshInterceptor<T extends java.rmi.Remote> implements BeforeInvokeInterceptor<T> {
    private static final Logger log = Logger.getLogger(CredentialRefreshInterceptor.class);

    private StubHeaderSetterService stubHeaderSetterService;
    private String apiNamespace;

    public CredentialRefreshInterceptor(StubHeaderSetterService stubHeaderSetterService, String apiNamespace) {
        this.stubHeaderSetterService = stubHeaderSetterService;
        this.apiNamespace = apiNamespace;
    }

    @Override
    public void intercept(BingAdsSession session, T service) throws IOException {
        synchronized (session.getOAuth2Credential()) {
            if (isCredentialRefreshable(session.getOAuth2Credential(), session.getRefreshWindowSeconds())) {
                log.debug("Refreshing token for BingAds session for account id " + session.getAccountId() + " and customer id " + session.getCustomerId());
                session.getOAuth2Credential().refreshToken();
            }

            // Always set the authentication header since the token may have been refreshed by a different thread
            stubHeaderSetterService.updateHeaders((Stub) service, session, apiNamespace);
        }
    }

    private boolean isCredentialRefreshable(Credential credential, long refreshWindowSeconds) {
        return credential.getAccessToken() == null ||
               (credential.getExpiresInSeconds() != null && credential.getExpiresInSeconds() <= refreshWindowSeconds);
    }
}
