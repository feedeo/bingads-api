package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.testing.http.FixedClock;
import com.microsoft.bingads.v9.campaignmanagement.BasicHttpBinding_ICampaignManagementServiceStub;
import com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsRequest;
import com.microsoft.bingads.v9.campaignmanagement.ICampaignManagementService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.reflect.Method;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:59
 */
@RunWith(MockitoJUnitRunner.class)
public class CredentialRefreshInvocationHandlerTest {
    private CredentialRefreshInvocationHandler target;

    @Mock
    private BingAdsSession session;

    @Mock
    private BasicHttpBinding_ICampaignManagementServiceStub service;

    @Mock
    private StubHeaderSetterService stubHeaderSetterService;

    private Credential credential;
    private Method method;
    private Object[] parameters;
    private GetCampaignsByIdsRequest parameter;
    private long expirationTimeMillis;
    private String apiNamespace;

    @Before
    public void setUp() throws Exception {
        expirationTimeMillis = 0L;
        apiNamespace = "namespace";
        credential = spy(new Credential.Builder(BearerToken.authorizationHeaderAccessMethod())
                .setClock(new FixedClock(expirationTimeMillis))
                .build());
        credential.setExpirationTimeMilliseconds(expirationTimeMillis);
        credential.setAccessToken("accessToken");
        method = service.getClass().getMethod("getCampaignsByIds", GetCampaignsByIdsRequest.class);
        parameter = new GetCampaignsByIdsRequest();
        parameters = new Object[] { parameter };

        when(session.getOAuth2Credential()).thenReturn(credential);
        when(session.getRefreshWindowSeconds()).thenReturn(60L);

        target = new CredentialRefreshInvocationHandler<ICampaignManagementService>(session, service, stubHeaderSetterService, apiNamespace);
    }

    @Test
    public void shouldInvokeMethod() throws Throwable {
        credential.setExpirationTimeMilliseconds(expirationTimeMillis + 61*1000L);
        target.invoke(target, method, parameters);

        InOrder inOrder = Mockito.inOrder(service, credential, stubHeaderSetterService);
        inOrder.verify(stubHeaderSetterService).updateHeaders(service, session, apiNamespace);
        inOrder.verify(service).getCampaignsByIds(parameter);
        verify(credential, never()).refreshToken();
    }

    @Test
    public void shouldRefreshTokenAndInvokeMethod() throws Throwable {
        credential.setAccessToken("accessToken");

        target.invoke(target, method, parameters);

        InOrder inOrder = Mockito.inOrder(service, credential, stubHeaderSetterService);
        inOrder.verify(credential).refreshToken();
        inOrder.verify(stubHeaderSetterService).updateHeaders(service, session, apiNamespace);
        inOrder.verify(service).getCampaignsByIds(parameter);
    }



}
