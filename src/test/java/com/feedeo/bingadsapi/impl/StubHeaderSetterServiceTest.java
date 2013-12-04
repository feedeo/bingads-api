package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anySet;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:07
 */
@RunWith(MockitoJUnitRunner.class)
public class StubHeaderSetterServiceTest {
    private StubHeaderSetterService target;

    @Mock
    private Stub service;

    @Mock
    private BingAdsSession session;

    @Mock
    private SOAPHeaderElement authHeader;

    private String apiNamespace, developerToken, accessToken, username, password;
    private Credential credential;
    private long accountId, customerId;

    @Before
    public void setUp() throws Exception {
        apiNamespace = "namespace";
        developerToken = "developerToken";
        accessToken = "accessToken";
        username = "username";
        password = "password";
        accountId = 3483232L;
        customerId = 9934021L;

        credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
        credential.setAccessToken(accessToken);

        doReturn(developerToken).when(session).getDeveloperToken();
        doReturn(username).when(session).getUsername();
        doReturn(password).when(session).getPassword();
        doReturn(accountId).when(session).getAccountId();
        doReturn(customerId).when(session).getCustomerId();

        target = new StubHeaderSetterService();
    }

    @Test
    public void shouldClearExistingHeadersOnStub() {
        target.setHeaders(service, session, apiNamespace);

        verify(service).clearHeaders();
    }


    @Test
    public void shouldAddDeveloperTokenHeader() {
        target.setHeaders(service, session, apiNamespace);

        verify(service).setHeader(apiNamespace, "DeveloperToken", developerToken);
    }

    @Test
    public void shouldAddAuthenticationTokenIfPresent() {
        when(session.hasOAuth2Credential()).thenReturn(true);
        when(session.getOAuth2Credential()).thenReturn(credential);

        target.setHeaders(service, session, apiNamespace);

        verify(service).setHeader(apiNamespace, "AuthenticationToken", accessToken);
        verify(service, never()).setHeader(anyString(), eq("UserName"), anyString());
        verify(service, never()).setHeader(anyString(), eq("Password"), anyString());
    }

    @Test
    public void shouldUpdateAuthenticationTokenIfPresent() {
        when(session.hasOAuth2Credential()).thenReturn(true);
        when(session.getOAuth2Credential()).thenReturn(credential);
        when(service.getHeader(anyString(), anyString())).thenReturn(authHeader);

        target.updateAuthenticationToken(service, session, apiNamespace);

        verify(authHeader).setValue(accessToken);
    }

    @Test
    public void shouldCreateAuthenticationTokenIfNoneWhenUpdating() {
        when(session.hasOAuth2Credential()).thenReturn(true);
        when(session.getOAuth2Credential()).thenReturn(credential);
        when(service.getHeader(anyString(), anyString())).thenReturn(null);

        target.updateAuthenticationToken(service, session, apiNamespace);

        verify(service).setHeader(apiNamespace, "AuthenticationToken", accessToken);
    }

    @Test
    public void shouldAddUsernameAndPasswordIfAuthenticationTokenNotPresent() {
        when(session.hasOAuth2Credential()).thenReturn(false);

        target.setHeaders(service, session, apiNamespace);

        verify(service).setHeader(apiNamespace, "UserName", username);
        verify(service).setHeader(apiNamespace, "Password", password);
        verify(service, never()).setHeader(anyString(), eq("AuthenticationToken"), anyString());
    }

    @Test
    public void shouldSetAccountIdIfPresent() {
        when(session.hasAccountId()).thenReturn(true);

        target.setHeaders(service, session, apiNamespace);

        verify(service).setHeader(apiNamespace, "CustomerAccountId", String.valueOf(accountId));
    }

    @Test
    public void shouldNotSetAccountIdIfNotPresent() {
        when(session.hasAccountId()).thenReturn(false);

        target.setHeaders(service, session, apiNamespace);

        verify(service, never()).setHeader(anyString(), eq("CustomerAccountId"), anyString());
    }

    @Test
    public void shouldSetCustomerIdIfPresent() {
        when(session.hasCustomerId()).thenReturn(true);

        target.setHeaders(service, session, apiNamespace);

        verify(service).setHeader(apiNamespace, "CustomerId", String.valueOf(customerId));
    }

    @Test
    public void shouldNotSetCustomerIdIfNotPresent() {
        when(session.hasCustomerId()).thenReturn(false);

        target.setHeaders(service, session, apiNamespace);

        verify(service, never()).setHeader(anyString(), eq("CustomerId"), anyString());
    }


}
