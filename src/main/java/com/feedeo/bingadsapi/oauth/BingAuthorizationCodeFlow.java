package com.feedeo.bingadsapi.oauth;

import com.feedeo.bingadsapi.constants.BingOAuthConstants;
import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.CredentialRefreshListener;
import com.google.api.client.auth.oauth2.CredentialStore;
import com.google.api.client.auth.oauth2.StoredCredential;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;

import java.io.IOException;
import java.util.Collection;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 12:44
 */
public class BingAuthorizationCodeFlow extends AuthorizationCodeFlow {
    public BingAuthorizationCodeFlow(Credential.AccessMethod method,
                                     HttpTransport transport,
                                     JsonFactory jsonFactory,
                                     GenericUrl tokenServerUrl,
                                     HttpExecuteInterceptor clientAuthentication,
                                     String clientId,
                                     String authorizationServerEncodedUrl) {
        super(method, transport, jsonFactory, tokenServerUrl, clientAuthentication, clientId, authorizationServerEncodedUrl);
    }

    protected BingAuthorizationCodeFlow(Builder builder) {
        super(builder);
    }

    public static class Builder extends AuthorizationCodeFlow.Builder {

        /**
         * @param transport    HTTP transport
         * @param jsonFactory  JSON factory
         * @param clientId     client identifier
         * @param clientSecret client secret
         */
        public Builder(HttpTransport transport,
                       JsonFactory jsonFactory,
                       String clientId,
                       String clientSecret) {
            super(BearerToken.authorizationHeaderAccessMethod(),
                  transport,
                  jsonFactory,
                  new GenericUrl(BingOAuthConstants.TOKEN_SERVER_URL),
                  new ClientParametersAuthentication(clientId, clientSecret),
                  clientId,
                  BingOAuthConstants.AUTHORIZATION_SERVER_URL);
        }

        @Override
        public BingAuthorizationCodeFlow build() {
            return new BingAuthorizationCodeFlow(this);
        }

        @Override
        public Builder setMethod(Credential.AccessMethod method) {
            return (Builder) super.setMethod(method);
        }

        @Override
        public Builder setTransport(HttpTransport transport) {
            return (Builder) super.setTransport(transport);
        }

        @Override
        public Builder setJsonFactory(JsonFactory jsonFactory) {
            return (Builder) super.setJsonFactory(jsonFactory);
        }

        @Override
        public Builder setTokenServerUrl(GenericUrl tokenServerUrl) {
            return (Builder) super.setTokenServerUrl(tokenServerUrl);
        }

        @Override
        public Builder setClientAuthentication(HttpExecuteInterceptor clientAuthentication) {
            return (Builder) super.setClientAuthentication(clientAuthentication);
        }

        @Override
        public Builder setClientId(String clientId) {
            return (Builder) super.setClientId(clientId);
        }

        @Override
        public Builder setAuthorizationServerEncodedUrl(String authorizationServerEncodedUrl) {
            return (Builder) super.setAuthorizationServerEncodedUrl(authorizationServerEncodedUrl);
        }

        @Override
        public Builder setClock(Clock clock) {
            return (Builder) super.setClock(clock);
        }

        @Override
        public Builder setCredentialStore(CredentialStore credentialStore) {
            return (Builder) super.setCredentialStore(credentialStore);
        }

        @Override
        public Builder setDataStoreFactory(DataStoreFactory dataStoreFactory) throws IOException {
            return (Builder) super.setDataStoreFactory(dataStoreFactory);
        }

        @Override
        public Builder setCredentialDataStore(DataStore<StoredCredential> credentialDataStore) {
            return (Builder) super.setCredentialDataStore(credentialDataStore);
        }

        @Override
        public Builder setRequestInitializer(HttpRequestInitializer requestInitializer) {
            return (Builder) super.setRequestInitializer(requestInitializer);
        }

        @Override
        public Builder setScopes(Collection<String> scopes) {
            return (Builder) super.setScopes(scopes);
        }

        @Override
        public Builder setCredentialCreatedListener(CredentialCreatedListener credentialCreatedListener) {
            return (Builder) super.setCredentialCreatedListener(credentialCreatedListener);
        }

        @Override
        public Builder addRefreshListener(CredentialRefreshListener refreshListener) {
            return (Builder) super.addRefreshListener(refreshListener);
        }

        @Override
        public Builder setRefreshListeners(Collection<CredentialRefreshListener> refreshListeners) {
            return (Builder) super.setRefreshListeners(refreshListeners);
        }
    }

}
