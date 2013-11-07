/**
 * IAdIntelligenceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public interface IAdIntelligenceService extends java.rmi.Remote {
    public com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceResponse getPublisherKeywordPerformance(com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlResponse suggestKeywordsForUrl(com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsResponse getEstimatedBidByKeywordIds(com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsResponse getEstimatedPositionByKeywordIds(com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsResponse getEstimatedBidByKeywords(com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsResponse getEstimatedPositionByKeywords(com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountResponse getHistoricalSearchCount(com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceResponse getHistoricalKeywordPerformance(com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsResponse suggestKeywordsFromExistingKeywords(com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsResponse getKeywordLocations(com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesResponse getKeywordCategories(com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsResponse getKeywordDemographics(com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeResponse getKeywordBidLandscape(com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
    public com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeResponse getAdGroupBidLandscape(com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail;
}
