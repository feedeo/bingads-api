package com.feedeo.bingadsapi.impl;

import com.microsoft.bingads.v9.campaignmanagement.CampaignManagementServiceLocator;
import com.microsoft.bingads.v9.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.v9.customermanagement.CustomerManagementServiceLocator;
import com.microsoft.bingads.v9.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.v9.reporting.IReportingService;
import com.microsoft.bingads.v9.reporting.ReportingServiceLocator;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.fest.assertions.Assertions.assertThat;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 08:57
 */
public class ServiceInstantiatorTest {
    private ServiceInstantiator target;

    @Before
    public void setUp() throws Exception {
        target = new ServiceInstantiator();
    }

    @Test
    public void shouldInstantiateCampaignManagementService() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ICampaignManagementService service = target.instantiateService(new CampaignManagementServiceLocator(), ICampaignManagementService.class);

        assertThat(service).isNotNull();
        assertThat(service).isInstanceOf(ICampaignManagementService.class);
    }

    @Test
    public void shouldInstantiateCustomerManagementService() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ICustomerManagementService service = target.instantiateService(new CustomerManagementServiceLocator(), ICustomerManagementService.class);

        assertThat(service).isNotNull();
        assertThat(service).isInstanceOf(ICustomerManagementService.class);
    }

    @Test
    public void shouldInstantiateReportingService() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        IReportingService service = target.instantiateService(new ReportingServiceLocator(), IReportingService.class);

        assertThat(service).isNotNull();
        assertThat(service).isInstanceOf(IReportingService.class);
    }

}
