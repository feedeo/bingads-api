package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import com.google.api.client.auth.oauth2.Credential;
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
        synchronized (session.getOAuth2Credential()) {
            if (isCredentialRefreshable(session.getOAuth2Credential(), session.getRefreshWindowSeconds())) {
                log.debug("Refreshing token for BingAds session for account id " + session.getAccountId() + " and customer id " + session.getCustomerId());
                session.getOAuth2Credential().refreshToken();
            }

            // Always set the authentication header since the token may have been refreshed by a different thread
            stubHeaderSetterService.updateHeaders((Stub) service, session, apiNamespace);
        }

        if (log.isTraceEnabled() && service instanceof Stub) {
            Stub stub = (Stub) service;
            SOAPHeaderElement authHeader = stub.getHeader(apiNamespace, "AuthenticationToken");
            String token = authHeader == null ? null : authHeader.getValue();
            log.trace("Invoking service method " + method.getName() + " using credential " + session.getOAuth2Credential() + " with access token " + token);
        }

        try {
            return method.invoke(service, args);
        } catch (InvocationTargetException e) {
            log.debug("Error while invoking method " + service.getClass().getName() + "." + method.getName() + "(" + getClassNames(args) + ")\n" +
                      "service: " + service + "\n" +
                      "args: " + getArgs(args) + "\n" +
                      "AuthenticationHeader: " + getAuthHeader(service),
                      e);
            throw e.getCause();
        }
    }

    private SOAPHeaderElement getAuthHeader(T service) {
        if (service instanceof Stub) {
            Stub stub = (Stub) service;
            return stub.getHeader(apiNamespace, "AuthenticationToken");
        }
        return null;
    }

    private String getClassNames(Object[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            if (i > 0) {
                sb.append(", ");
            }
            if (arg == null) {
                sb.append("null");
            } else {
                sb.append(arg.getClass().getName());
            }
        }

        return sb.toString();
    }

    private String getArgs(Object[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(arg);
        }

        return sb.toString();
    }

    private boolean isCredentialRefreshable(Credential credential, long refreshWindowSeconds) {
        return credential.getAccessToken() == null ||
               (credential.getExpiresInSeconds() != null && credential.getExpiresInSeconds() <= refreshWindowSeconds);
    }
}
