/**
 * ICustomerBillingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customerbilling;

public interface ICustomerBillingService extends java.rmi.Remote {
    public com.microsoft.bingads.v9.customerbilling.GetBillingDocumentsInfoResponse getBillingDocumentsInfo(com.microsoft.bingads.v9.customerbilling.GetBillingDocumentsInfoRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.customermanagement.exception.ApiFault, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.customermanagement.exception.ApiBatchFault;
    public com.microsoft.bingads.v9.customerbilling.GetBillingDocumentsResponse getBillingDocuments(com.microsoft.bingads.v9.customerbilling.GetBillingDocumentsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.customermanagement.exception.ApiFault, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.customermanagement.exception.ApiBatchFault;
    public com.microsoft.bingads.v9.customerbilling.GetDisplayInvoicesResponse getDisplayInvoices(com.microsoft.bingads.v9.customerbilling.GetDisplayInvoicesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.customermanagement.exception.ApiFault, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.customermanagement.exception.ApiBatchFault;
    public com.microsoft.bingads.v9.customerbilling.AddInsertionOrderResponse addInsertionOrder(com.microsoft.bingads.v9.customerbilling.AddInsertionOrderRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.customermanagement.exception.ApiFault, com.microsoft.bingads.v9.adapi.AdApiFaultDetail;
    public com.microsoft.bingads.v9.customerbilling.UpdateInsertionOrderResponse updateInsertionOrder(com.microsoft.bingads.v9.customerbilling.UpdateInsertionOrderRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.customermanagement.exception.ApiFault, com.microsoft.bingads.v9.adapi.AdApiFaultDetail;
    public com.microsoft.bingads.v9.customerbilling.GetInsertionOrdersByAccountResponse getInsertionOrdersByAccount(com.microsoft.bingads.v9.customerbilling.GetInsertionOrdersByAccountRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.customermanagement.exception.ApiFault;
    public com.microsoft.bingads.v9.customerbilling.GetKOHIOInvoicesResponse getKOHIOInvoices(com.microsoft.bingads.v9.customerbilling.GetKOHIOInvoicesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.customermanagement.exception.ApiFault, com.microsoft.bingads.v9.customermanagement.exception.ApiBatchFault;
    public com.microsoft.bingads.v9.customerbilling.GetAccountMonthlySpendResponse getAccountMonthlySpend(com.microsoft.bingads.v9.customerbilling.GetAccountMonthlySpendRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.customermanagement.exception.ApiFault, com.microsoft.bingads.v9.adapi.AdApiFaultDetail;
}
