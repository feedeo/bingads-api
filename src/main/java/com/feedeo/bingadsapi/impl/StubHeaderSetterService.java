package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:06
 */
public class StubHeaderSetterService {
    private static final String CUSTOMER_ACCOUNT_ID = "CustomerAccountId";
    private static final String CUSTOMER_ID = "CustomerId";
    private static final String PASSWORD = "Password";
    private static final String USER_NAME = "UserName";
    private static final String DEVELOPER_TOKEN = "DeveloperToken";
    private static final String AUTHENTICATION_TOKEN = "AuthenticationToken";

    public void setHeaders(Stub service, BingAdsSession session, String apiNamespace) {
        service.clearHeaders();
        service.setHeader(apiNamespace, DEVELOPER_TOKEN, session.getDeveloperToken());
        addCredentialHeaders(service, session, apiNamespace);
        addAccountHeaders(service, session, apiNamespace);
    }

    public void updateHeaders(Stub service, BingAdsSession session, String apiNamespace) {
        if (session.hasOAuth2Credential()) {
            SOAPHeaderElement authenticationHeader = service.getHeader(apiNamespace, AUTHENTICATION_TOKEN);
            if(authenticationHeader != null) {
                String currentAccessToken = authenticationHeader.getValue();
                if(currentAccessToken != null && !currentAccessToken.equals(session.getOAuth2Credential().getAccessToken())) {
                    setHeaders(service, session, apiNamespace);
                }
            } else {
                setHeaders(service, session, apiNamespace);
            }
        }
    }

    private void addCredentialHeaders(Stub service, BingAdsSession session, String apiNamespace) {
        if (session.hasOAuth2Credential()) {
            service.setHeader(apiNamespace, AUTHENTICATION_TOKEN, session.getOAuth2Credential().getAccessToken());
        } else {
            service.setHeader(apiNamespace, USER_NAME, session.getUsername());
            service.setHeader(apiNamespace, PASSWORD, session.getPassword());
        }
    }

    private void addAccountHeaders(Stub service, BingAdsSession session, String apiNamespace) {
        if (session.hasAccountId()) {
            service.setHeader(apiNamespace, CUSTOMER_ACCOUNT_ID, String.valueOf(session.getAccountId()));
        }
        if (session.hasCustomerId()) {
            service.setHeader(apiNamespace, CUSTOMER_ID, String.valueOf(session.getCustomerId()));
        }
    }

}
