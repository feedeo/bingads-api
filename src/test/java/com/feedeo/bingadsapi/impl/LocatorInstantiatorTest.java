package com.feedeo.bingadsapi.impl;

import com.microsoft.bingads.v9.campaignmanagement.CampaignManagementServiceLocator;
import com.microsoft.bingads.v9.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.v9.customermanagement.CustomerManagementServiceLocator;
import com.microsoft.bingads.v9.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.v9.reporting.IReportingService;
import com.microsoft.bingads.v9.reporting.ReportingServiceLocator;
import org.apache.axis.client.Service;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 08:51
 */
public class LocatorInstantiatorTest {
    private LocatorInstantiator target;

    @Before
    public void setUp() throws Exception {
        target = new LocatorInstantiator();
    }

    @Test
    public void shouldInstantiateCampaignManagementServiceLocator() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Service serviceLocator = target.instantiateLocator(ICampaignManagementService.class);

        assertThat(serviceLocator).isNotNull();
        assertThat(serviceLocator).isInstanceOf(CampaignManagementServiceLocator.class);
    }

    @Test
    public void shouldInstantiateCustomerManagementServiceLocator() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Service serviceLocator = target.instantiateLocator(ICustomerManagementService.class);

        assertThat(serviceLocator).isNotNull();
        assertThat(serviceLocator).isInstanceOf(CustomerManagementServiceLocator.class);
    }

    @Test
    public void shouldInstantiateReportingServiceLocator() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Service serviceLocator = target.instantiateLocator(IReportingService.class);

        assertThat(serviceLocator).isNotNull();
        assertThat(serviceLocator).isInstanceOf(ReportingServiceLocator.class);
    }

}
