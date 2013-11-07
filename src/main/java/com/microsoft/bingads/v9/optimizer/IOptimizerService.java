/**
 * IOptimizerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public interface IOptimizerService extends java.rmi.Remote {
    public com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesResponse getBudgetOpportunities(com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail;
    public com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeResponse getBudgetLandscape(com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail;
    public com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesResponse getBidOpportunities(com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail;
    public com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesResponse getKeywordOpportunities(com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail;
    public com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesResponse getBroadMatchOpportunities(com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail;
    public com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesResponse getBroadMatchSearchQueries(com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail;
    public com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersResponse applyOpportunityModifiers(com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail;
    public com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesResponse applyOpportunities(com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail;
}
