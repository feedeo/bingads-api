package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import com.microsoft.bingads.v9.campaignmanagement.BasicHttpBinding_ICampaignManagementServiceStub;
import com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsRequest;
import com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsResponse;
import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.client.Call;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.xml.namespace.QName;
import java.lang.reflect.Method;
import java.rmi.Remote;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.same;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * User: maglju
 * Date: 2013-12-17
 * Time: 09:22
 */
@RunWith(MockitoJUnitRunner.class)
public class ServiceInvocationHandlerTest {
    private ServiceInvocationHandler<Remote> target;

    @Mock
    private BingAdsSession session;

    @Mock
    private BasicHttpBinding_ICampaignManagementServiceStub service;

    @Mock
    private BeforeInvokeInterceptor<Remote> beforeInvokeInterceptor;

    @Mock
    private ReturnValueInterceptor<Remote> returnValueInterceptor;

    @Mock
    private Object proxy;

    @Mock
    private GetCampaignsByIdsResponse response;

    @Mock
    private Call call;

    @Mock
    private MessageContext messageContext;

    @Mock
    private Message requestMessage, responseMessage;

    @Captor
    private ArgumentCaptor<SoapCallReturnInfo> soapCallReturnInfoCaptor;

    private Method method;
    private Object[] parameters;
    private GetCampaignsByIdsRequest parameter;
    private String url;
    private QName methodName;
    private QName serviceName;
    private String soapRequest, soapResponse;

    @Before
    public void setUp() throws Exception {
        method = service.getClass().getMethod("getCampaignsByIds", GetCampaignsByIdsRequest.class);
        parameter = new GetCampaignsByIdsRequest();
        parameters = new Object[] { parameter };
        url = "url";
        methodName = new QName("methodName");
        serviceName = new QName("serviceName");
        soapRequest = "soapRequest";
        soapResponse = "soapResponse";

        when(service.getCampaignsByIds(any(GetCampaignsByIdsRequest.class))).thenReturn(response);
        when(service._getCall()).thenReturn(call);
        when(call.getMessageContext()).thenReturn(messageContext);
        when(call.getTargetEndpointAddress()).thenReturn(url);
        when(call.getOperationName()).thenReturn(methodName);
        when(service.getPortName()).thenReturn(serviceName);
        when(messageContext.getRequestMessage()).thenReturn(requestMessage);
        when(messageContext.getResponseMessage()).thenReturn(responseMessage);
        when(requestMessage.getSOAPPartAsString()).thenReturn(soapRequest);
        when(responseMessage.getSOAPPartAsString()).thenReturn(soapResponse);

        target = new ServiceInvocationHandler<Remote>(session, service, beforeInvokeInterceptor, returnValueInterceptor);
    }

    @Test
    public void shouldInvokeBeforeInterceptor() throws Throwable {
        target.invoke(proxy, method, parameters);

        verify(beforeInvokeInterceptor).intercept(session, service);
    }

    @Test
    public void shouldInvokeService() throws Throwable {
        Object result = target.invoke(proxy, method, parameters);

        assertThat(result).isSameAs(response);
        verify(service).getCampaignsByIds(parameter);
    }

    @Test
    public void shouldInvokeReturnValueInterceptor() throws Throwable {
        target.invoke(proxy, method, parameters);

        verify(returnValueInterceptor).intercept(same(session), same(service), soapCallReturnInfoCaptor.capture());

        SoapCallReturnInfo soapCallReturnInfo = soapCallReturnInfoCaptor.getValue();
        assertThat(soapCallReturnInfo.getReturnValue()).isSameAs(response);
        assertThat(soapCallReturnInfo.getUrl()).isEqualTo(url);
        assertThat(soapCallReturnInfo.getServiceName()).isEqualTo(serviceName.getLocalPart());
        assertThat(soapCallReturnInfo.getMethodName()).isEqualTo(methodName.getLocalPart());
        assertThat(soapCallReturnInfo.getSoapRequestXml()).isEqualTo(soapRequest);
        assertThat(soapCallReturnInfo.getSoapResponseXml()).isEqualTo(soapResponse);
    }

    @Test(expected = AxisFault.class)
    public void shouldInvokeReturnValueInterceptorWithInvocationTargetException() throws Throwable {
        AxisFault inducedException = new AxisFault("Induced");
        when(service.getCampaignsByIds(any(GetCampaignsByIdsRequest.class))).thenThrow(inducedException);

        try {
            target.invoke(proxy, method, parameters);
        } catch (AxisFault e) {
            verify(returnValueInterceptor).intercept(same(session), same(service), soapCallReturnInfoCaptor.capture());

            SoapCallReturnInfo soapCallReturnInfo = soapCallReturnInfoCaptor.getValue();
            assertThat(soapCallReturnInfo.getReturnValue()).isNull();
            assertThat(soapCallReturnInfo.getUrl()).isEqualTo(url);
            assertThat(soapCallReturnInfo.getServiceName()).isEqualTo(serviceName.getLocalPart());
            assertThat(soapCallReturnInfo.getMethodName()).isEqualTo(methodName.getLocalPart());
            assertThat(soapCallReturnInfo.getSoapRequestXml()).isEqualTo(soapRequest);
            assertThat(soapCallReturnInfo.getSoapResponseXml()).isEqualTo(soapResponse);
            assertThat(soapCallReturnInfo.getThrowable()).isSameAs(inducedException);
            throw e;
        }
    }

    @Test
    public void shouldInvokeInterceptorsAndServiceInRightOrder() throws Throwable {
        target.invoke(proxy, method, parameters);

        InOrder inOrder = Mockito.inOrder(service, beforeInvokeInterceptor, returnValueInterceptor);

        inOrder.verify(beforeInvokeInterceptor).intercept(session, service);
        inOrder.verify(service).getCampaignsByIds(parameter);
        inOrder.verify(returnValueInterceptor).intercept(same(session), same(service), any(SoapCallReturnInfo.class));
    }
}
