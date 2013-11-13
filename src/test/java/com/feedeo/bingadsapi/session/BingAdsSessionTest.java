package com.feedeo.bingadsapi.session;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.fest.assertions.Assertions.assertThat;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 12:39
 */
public class BingAdsSessionTest {
    private long accountId, customerId, refreshWindowSeconds;
    private String developerToken, username, password;
    private Credential credential;

    @Before
    public void setUp() {
        accountId = 3248423L;
        customerId = 9393L;
        refreshWindowSeconds = 30;
        developerToken = "developerToken";
        username = "username";
        password = "password";
        credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    }

    @Test
    public void shouldBuildSession() throws IOException {
        BingAdsSession target = new BingAdsSession.Builder()
                .withAccountId(accountId)
                .withCustomerId(customerId)
                .withDeveloperToken(developerToken)
                .withOAuth2Credential(credential)
                .withRefreshWindowSeconds(refreshWindowSeconds)
                .withUsernamePassword(username, password)
                .build();

        assertThat(target.getAccountId()).isEqualTo(accountId);
        assertThat(target.getCustomerId()).isEqualTo(customerId);
        assertThat(target.getDeveloperToken()).isEqualTo(developerToken);
        assertThat(target.getOAuth2Credential()).isSameAs(credential);
        assertThat(target.getRefreshWindowSeconds()).isEqualTo(refreshWindowSeconds);
        assertThat(target.getUsername()).isEqualTo(username);
        assertThat(target.getPassword()).isEqualTo(password);
    }

    @Test
    public void shouldBuildSessionWithDefaultRefreshWindow() throws IOException {
        BingAdsSession target = new BingAdsSession.Builder()
                .withAccountId(accountId)
                .withCustomerId(customerId)
                .withDeveloperToken(developerToken)
                .withOAuth2Credential(credential)
                .withUsernamePassword(username, password)
                .build();

        assertThat(target.getAccountId()).isEqualTo(accountId);
        assertThat(target.getCustomerId()).isEqualTo(customerId);
        assertThat(target.getDeveloperToken()).isEqualTo(developerToken);
        assertThat(target.getOAuth2Credential()).isSameAs(credential);
        assertThat(target.getRefreshWindowSeconds()).isEqualTo(60);
        assertThat(target.getUsername()).isEqualTo(username);
        assertThat(target.getPassword()).isEqualTo(password);
    }

}
