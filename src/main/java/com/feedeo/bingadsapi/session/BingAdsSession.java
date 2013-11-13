package com.feedeo.bingadsapi.session;

import com.google.api.client.auth.oauth2.Credential;

import java.io.IOException;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 08:25
 */
public class BingAdsSession {
    private String developerToken;
    private Long accountId;
    private Long customerId;
    private String username;
    private String password;
    private Credential oAuth2Credential;
    private long refreshWindowSeconds;

    public BingAdsSession(Builder builder) throws IOException {
        this.developerToken = builder.developerToken;
        this.accountId = builder.accountId;
        this.customerId = builder.customerId;
        this.username = builder.username;
        this.password = builder.password;
        this.oAuth2Credential = builder.oAuth2Credential;
        this.refreshWindowSeconds = builder.refreshWindowSeconds;
    }

    public String getDeveloperToken() {
        return developerToken;
    }

    public Long getAccountId() {
        return accountId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean hasOAuth2Credential() {
        return oAuth2Credential != null;
    }

    public Credential getOAuth2Credential() {
        return oAuth2Credential;
    }

    public boolean hasAccountId() {
        return accountId != null;
    }

    public boolean hasCustomerId() {
        return customerId != null;
    }

    public long getRefreshWindowSeconds() {
        return refreshWindowSeconds;
    }

    public static class Builder {
        private String developerToken;
        private Long accountId;
        private Long customerId;
        private String username;
        private String password;
        private Credential oAuth2Credential;
        private long refreshWindowSeconds;

        public Builder() {
            refreshWindowSeconds = 60;
        }

        public Builder withDeveloperToken(String developerToken) {
            this.developerToken = developerToken;
            return this;
        }

        public Builder withUsernamePassword(String username, String password) {
            this.username = username;
            this.password = password;
            return this;
        }

        public Builder withOAuth2Credential(Credential oAuth2Credential) {
            this.oAuth2Credential = oAuth2Credential;
            return this;
        }

        public Builder withAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder withCustomerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder withRefreshWindowSeconds(long seconds) {
            this.refreshWindowSeconds = seconds;
            return this;
        }

        public BingAdsSession build() throws IOException {
            return new BingAdsSession(this);
        }
    }
}
