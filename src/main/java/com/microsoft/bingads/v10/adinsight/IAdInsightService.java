/**
 * IAdInsightService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public interface IAdInsightService extends java.rmi.Remote {
  com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesResponse getBidOpportunities(com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesResponse getBudgetOpportunities(com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesResponse getKeywordOpportunities(com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsResponse getEstimatedBidByKeywordIds(com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsResponse getEstimatedPositionByKeywordIds(com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsResponse getEstimatedBidByKeywords(com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsResponse getEstimatedPositionByKeywords(com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsResponse getBidLandscapeByAdGroupIds(com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsResponse getBidLandscapeByKeywordIds(com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceResponse getHistoricalKeywordPerformance(com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountResponse getHistoricalSearchCount(com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesResponse getKeywordCategories(com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsResponse getKeywordDemographics(com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetKeywordLocationsResponse getKeywordLocations(com.microsoft.bingads.v10.adinsight.GetKeywordLocationsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlResponse suggestKeywordsForUrl(com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsResponse suggestKeywordsFromExistingKeywords(com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataResponse getAuctionInsightData(com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataRequest parameters) throws java.rmi.RemoteException;
}
