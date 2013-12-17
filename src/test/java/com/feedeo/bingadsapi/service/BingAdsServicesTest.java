package com.feedeo.bingadsapi.service;

import com.feedeo.bingadsapi.impl.BeforeInvokeInterceptor;
import com.feedeo.bingadsapi.impl.InterceptorFactory;
import com.feedeo.bingadsapi.impl.LocatorInstantiator;
import com.feedeo.bingadsapi.impl.ReturnValueInterceptor;
import com.feedeo.bingadsapi.impl.ServiceInstantiator;
import com.feedeo.bingadsapi.impl.ServiceInvocationProxyFactory;
import com.feedeo.bingadsapi.impl.StubHeaderSetterService;
import com.feedeo.bingadsapi.session.BingAdsSession;
import com.microsoft.bingads.v9.campaignmanagement.BasicHttpBinding_ICampaignManagementServiceStub;
import com.microsoft.bingads.v9.campaignmanagement.CampaignManagementServiceLocator;
import com.microsoft.bingads.v9.campaignmanagement.ICampaignManagementService;
import org.apache.axis.client.Service;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.xml.namespace.QName;
import java.rmi.Remote;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 09:29
 */
@RunWith(MockitoJUnitRunner.class)
public class BingAdsServicesTest {
    private BingAdsServices target;

    @Mock
    private LocatorInstantiator locatorInstantiator;

    @Mock
    private ServiceInstantiator serviceInstantiator;

    @Mock
    private StubHeaderSetterService stubHeaderSetterService;

    @Mock
    private ServiceInvocationProxyFactory serviceInvocationProxyFactory;

    @Mock
    private BingAdsSession session;

    @Mock
    private CampaignManagementServiceLocator locator;

    @Mock
    private BasicHttpBinding_ICampaignManagementServiceStub service;

    @Mock
    private ICampaignManagementService proxiedService;

    @Mock
    private BeforeInvokeInterceptor<ICampaignManagementService> credentialBeforeInvokeInterceptor;

    @Mock
    private BeforeInvokeInterceptor<ICampaignManagementService> defaultBeforeInvokeInterceptor;

    @Mock
    private ReturnValueInterceptor<ICampaignManagementService> returnValueInterceptor;

    @Mock
    private InterceptorFactory interceptorFactory;

    private String namespace;

    @Before
    public void setUp() throws Exception {
        namespace = "namespace";
        QName serviceName = new QName(namespace, "local");

        when(locatorInstantiator.instantiateLocator(any(Class.class))).thenReturn(locator);
        when(serviceInstantiator.instantiateService(any(Service.class), any(Class.class))).thenReturn(service);
        when(locator.getServiceName()).thenReturn(serviceName);
        when(serviceInvocationProxyFactory.createServiceProxy(any(BingAdsSession.class),
                                                              any(Remote.class),
                                                              any(Class.class),
                                                              any(BeforeInvokeInterceptor.class),
                                                              any(ReturnValueInterceptor.class))).thenReturn(proxiedService);
        when(interceptorFactory.<ICampaignManagementService>createCredentialRefreshInterceptor(any(StubHeaderSetterService.class), anyString()))
                .thenReturn(credentialBeforeInvokeInterceptor);
        when(interceptorFactory.<ICampaignManagementService>createDefaultBeforeInterceptor()).thenReturn(defaultBeforeInvokeInterceptor);
        when(interceptorFactory.<ICampaignManagementService>createLoggingInterceptor()).thenReturn(returnValueInterceptor);

        target = new BingAdsServices(locatorInstantiator,
                                     serviceInstantiator,
                                     stubHeaderSetterService,
                                     serviceInvocationProxyFactory,
                                     interceptorFactory);
    }

    @Test
    public void shouldInstantiateLocator() throws Exception {
        target.getService(session, ICampaignManagementService.class);

        verify(locatorInstantiator).instantiateLocator(ICampaignManagementService.class);
    }

    @Test
    public void shouldSetHeadersOnService() {
        target.getService(session, ICampaignManagementService.class);

        verify(stubHeaderSetterService).setHeaders(service, session, namespace);
    }

    @Test
    public void shouldWrapServiceInProxyAndReturnProxiedServiceWhenNoOAuth() {
        when(session.hasOAuth2Credential()).thenReturn(false);

        ICampaignManagementService result = target.getService(session, ICampaignManagementService.class);

        assertThat(result).isSameAs(proxiedService);
        verify(serviceInvocationProxyFactory).createServiceProxy(session,
                                                                 service,
                                                                 ICampaignManagementService.class,
                                                                 defaultBeforeInvokeInterceptor,
                                                                 returnValueInterceptor);
    }

    @Test
    public void shouldWrapServiceInProxyAndReturnProxiedService() {
        when(session.hasOAuth2Credential()).thenReturn(true);

        ICampaignManagementService result = target.getService(session, ICampaignManagementService.class);

        assertThat(result).isSameAs(proxiedService);
        verify(serviceInvocationProxyFactory).createServiceProxy(session,
                                                                 service,
                                                                 ICampaignManagementService.class,
                                                                 credentialBeforeInvokeInterceptor,
                                                                 returnValueInterceptor);
    }

    @Test(expected = RuntimeException.class)
    public void shouldRethrowRuntimeException() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        RuntimeException inducedException = new RuntimeException();
        when(locatorInstantiator.instantiateLocator(any(Class.class))).thenThrow(inducedException);

        try {
            target.getService(session, ICampaignManagementService.class);
        } catch (RuntimeException e) {
            assertThat(e).isSameAs(inducedException);
            throw e;
        }

    }

    @Test(expected = RuntimeException.class)
    public void shouldWrapExceptionInRuntimeException() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        ClassNotFoundException inducedException = new ClassNotFoundException();
        when(locatorInstantiator.instantiateLocator(any(Class.class))).thenThrow(inducedException);

        try {
            target.getService(session, ICampaignManagementService.class);
        } catch (RuntimeException e) {
            assertThat(e.getCause()).isSameAs(inducedException);
            throw e;
        }

    }


}
