package com.feedeo.bingadsapi.service;

import com.feedeo.bingadsapi.impl.CredentialRefreshProxyFactory;
import com.feedeo.bingadsapi.impl.LocatorInstantiator;
import com.feedeo.bingadsapi.impl.ServiceInstantiator;
import com.feedeo.bingadsapi.impl.StubHeaderSetterService;
import com.feedeo.bingadsapi.session.BingAdsSession;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 08:36
 */
public class BingAdsServices {

    private LocatorInstantiator locatorInstantiator;
    private ServiceInstantiator serviceInstantiator;
    private StubHeaderSetterService stubHeaderSetterService;
    private CredentialRefreshProxyFactory credentialRefreshProxyFactory;

    // For testing
    public BingAdsServices(LocatorInstantiator locatorInstantiator,
                           ServiceInstantiator serviceInstantiator,
                           StubHeaderSetterService stubHeaderSetterService,
                           CredentialRefreshProxyFactory credentialRefreshProxyFactory) {
        this.locatorInstantiator = locatorInstantiator;
        this.serviceInstantiator = serviceInstantiator;
        this.stubHeaderSetterService = stubHeaderSetterService;
        this.credentialRefreshProxyFactory = credentialRefreshProxyFactory;
    }

    public BingAdsServices() {
        locatorInstantiator = new LocatorInstantiator();
        serviceInstantiator = new ServiceInstantiator();
        stubHeaderSetterService = new StubHeaderSetterService();
        credentialRefreshProxyFactory = new CredentialRefreshProxyFactory();
    }

    public <T extends java.rmi.Remote> T getService(BingAdsSession session, Class<T> serviceClass) {
        try {
            Service locator = locatorInstantiator.instantiateLocator(serviceClass);
            T service = serviceInstantiator.instantiateService(locator, serviceClass);
            stubHeaderSetterService.setHeaders((Stub) service, session, locator.getServiceName().getNamespaceURI());

            if(session.hasOAuth2Credential()) {
                service = credentialRefreshProxyFactory.addCredentialRefreshProxy(session, service, serviceClass);
            }
            return service;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
