/**
 * ICustomerBillingService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customerbilling;

public interface ICustomerBillingService extends java.rmi.Remote {
    com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoResponse getBillingDocumentsInfo(com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsResponse getBillingDocuments(com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesResponse getDisplayInvoices(com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customerbilling.AddInsertionOrderResponse addInsertionOrder(com.microsoft.bingads.v11.customerbilling.AddInsertionOrderRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderResponse updateInsertionOrder(com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountResponse getInsertionOrdersByAccount(com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersResponse searchInsertionOrders(com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesResponse getKOHIOInvoices(com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendResponse getAccountMonthlySpend(com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendRequest parameters) throws java.rmi.RemoteException;
}
