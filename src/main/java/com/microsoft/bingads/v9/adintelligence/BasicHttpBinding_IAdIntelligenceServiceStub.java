/**
 * BasicHttpBinding_IAdIntelligenceServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class BasicHttpBinding_IAdIntelligenceServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v9.adintelligence.IAdIntelligenceService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPublisherKeywordPerformance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetPublisherKeywordPerformanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetPublisherKeywordPerformanceRequest"), com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetPublisherKeywordPerformanceResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetPublisherKeywordPerformanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SuggestKeywordsForUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "SuggestKeywordsForUrlRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">SuggestKeywordsForUrlRequest"), com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">SuggestKeywordsForUrlResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "SuggestKeywordsForUrlResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEstimatedBidByKeywordIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetEstimatedBidByKeywordIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedBidByKeywordIdsRequest"), com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedBidByKeywordIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetEstimatedBidByKeywordIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEstimatedPositionByKeywordIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetEstimatedPositionByKeywordIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordIdsRequest"), com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetEstimatedPositionByKeywordIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEstimatedBidByKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetEstimatedBidByKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedBidByKeywordsRequest"), com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedBidByKeywordsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetEstimatedBidByKeywordsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEstimatedPositionByKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetEstimatedPositionByKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordsRequest"), com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetEstimatedPositionByKeywordsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHistoricalSearchCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetHistoricalSearchCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalSearchCountRequest"), com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalSearchCountResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetHistoricalSearchCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHistoricalKeywordPerformance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetHistoricalKeywordPerformanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalKeywordPerformanceRequest"), com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalKeywordPerformanceResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetHistoricalKeywordPerformanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SuggestKeywordsFromExistingKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "SuggestKeywordsFromExistingKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">SuggestKeywordsFromExistingKeywordsRequest"), com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">SuggestKeywordsFromExistingKeywordsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "SuggestKeywordsFromExistingKeywordsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetKeywordLocationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordLocationsRequest"), com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordLocationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetKeywordLocationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetKeywordCategoriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordCategoriesRequest"), com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordCategoriesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetKeywordCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordDemographics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetKeywordDemographicsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordDemographicsRequest"), com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordDemographicsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetKeywordDemographicsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordBidLandscape");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetKeywordBidLandscapeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordBidLandscapeRequest"), com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordBidLandscapeResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetKeywordBidLandscapeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdGroupBidLandscape");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetAdGroupBidLandscapeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetAdGroupBidLandscapeRequest"), com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetAdGroupBidLandscapeResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetAdGroupBidLandscapeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.adintelligence.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[13] = oper;

    }

    public BasicHttpBinding_IAdIntelligenceServiceStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_IAdIntelligenceServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IAdIntelligenceServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdGroupBidLandscape");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscape.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdGroupBidLandscapeInput");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscapeInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdGroupBidLandscapeType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscapeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdGroupEstimatedBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.AdGroupEstimatedBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdPosition");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.AdPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfAdGroupBidLandscape");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfAdGroupBidLandscape.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfAdGroupBidLandscapeInput");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfAdGroupBidLandscapeInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfBidLandscapePoint");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfBidLandscapePoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfEstimatedBidAndTraffic");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfEstimatedBidAndTraffic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfEstimatedPositionAndTraffic");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfEstimatedPositionAndTraffic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfHistoricalSearchCountPeriodic");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfHistoricalSearchCountPeriodic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordAndConfidence");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordAndConfidence.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordAndMatchType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordAndMatchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordBidLandscape");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordBidLandscape.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordCategory");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordCategoryResult");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordCategoryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordDemographicResult");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordDemographicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordEstimatedBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordEstimatedBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordEstimatedPosition");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordEstimatedPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordHistoricalPerformance");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordHistoricalPerformance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordIdEstimatedBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordIdEstimatedBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordIdEstimatedPosition");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordIdEstimatedPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordKPI");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordKPI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordLocation");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordLocationResult");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordLocationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordPerformance");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordPerformance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordSearchCount");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordSearchCount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordSuggestion");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordSuggestion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfMatchType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfMatchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "BidLandscapePoint");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.BidLandscapePoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Currency");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.Currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "DayMonthAndYear");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.DayMonthAndYear.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "EstimatedBidAndTraffic");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.EstimatedBidAndTraffic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "EstimatedPositionAndTraffic");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.EstimatedPositionAndTraffic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "HistoricalSearchCountPeriodic");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.HistoricalSearchCountPeriodic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordAndConfidence");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordAndConfidence.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordAndMatchType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordBidLandscape");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordBidLandscape.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordCategory");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordCategoryResult");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordCategoryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordDemographic");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordDemographic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordDemographicResult");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordDemographicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordEstimatedBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordEstimatedPosition");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordEstimatedPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordHistoricalPerformance");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordHistoricalPerformance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordIdEstimatedBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordIdEstimatedPosition");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordKPI");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordKPI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordLocation");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordLocationResult");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordLocationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordPerformance");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordPerformance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordSearchCount");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordSearchCount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordSuggestion");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.KeywordSuggestion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "MatchType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.MatchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Scale");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.Scale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "TargetAdPosition");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.TargetAdPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "TimeInterval");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.TimeInterval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.schemas.arrays.ArrayOflong.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adapi.AdApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adapi.AdApiFaultDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "ApplicationFault");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adapi.ApplicationFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adapi.ArrayOfAdApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetAdGroupBidLandscapeRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetAdGroupBidLandscapeResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedBidByKeywordIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedBidByKeywordIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedBidByKeywordsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedBidByKeywordsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalKeywordPerformanceRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalKeywordPerformanceResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalSearchCountRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalSearchCountResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordBidLandscapeRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordBidLandscapeResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordCategoriesRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordDemographicsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordDemographicsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordLocationsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordLocationsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetPublisherKeywordPerformanceRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetPublisherKeywordPerformanceResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">SuggestKeywordsForUrlRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">SuggestKeywordsForUrlResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">SuggestKeywordsFromExistingKeywordsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">SuggestKeywordsFromExistingKeywordsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ApiFaultDetail");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.ApiFaultDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ArrayOfBatchError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.ArrayOfBatchError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "ArrayOfOperationError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.ArrayOfOperationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "BatchError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.BatchError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "OperationError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.adintelligence.OperationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceResponse getPublisherKeywordPerformance(com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetPublisherKeywordPerformance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPublisherKeywordPerformance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetPublisherKeywordPerformanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlResponse suggestKeywordsForUrl(com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SuggestKeywordsForUrl");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SuggestKeywordsForUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.SuggestKeywordsForUrlResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsResponse getEstimatedBidByKeywordIds(com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetEstimatedBidByKeywordIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetEstimatedBidByKeywordIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordIdsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsResponse getEstimatedPositionByKeywordIds(com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetEstimatedPositionByKeywordIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetEstimatedPositionByKeywordIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordIdsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsResponse getEstimatedBidByKeywords(com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetEstimatedBidByKeywords");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetEstimatedBidByKeywords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetEstimatedBidByKeywordsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsResponse getEstimatedPositionByKeywords(com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetEstimatedPositionByKeywords");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetEstimatedPositionByKeywords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetEstimatedPositionByKeywordsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountResponse getHistoricalSearchCount(com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetHistoricalSearchCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetHistoricalSearchCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetHistoricalSearchCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceResponse getHistoricalKeywordPerformance(com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetHistoricalKeywordPerformance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetHistoricalKeywordPerformance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetHistoricalKeywordPerformanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsResponse suggestKeywordsFromExistingKeywords(com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SuggestKeywordsFromExistingKeywords");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SuggestKeywordsFromExistingKeywords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.SuggestKeywordsFromExistingKeywordsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsResponse getKeywordLocations(com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetKeywordLocations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetKeywordLocationsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesResponse getKeywordCategories(com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetKeywordCategories");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetKeywordCategoriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsResponse getKeywordDemographics(com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetKeywordDemographics");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordDemographics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetKeywordDemographicsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeResponse getKeywordBidLandscape(com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetKeywordBidLandscape");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordBidLandscape"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetKeywordBidLandscapeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeResponse getAdGroupBidLandscape(com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.adintelligence.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAdGroupBidLandscape");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdGroupBidLandscape"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.adintelligence.GetAdGroupBidLandscapeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adapi.AdApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adapi.AdApiFaultDetail) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.adintelligence.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
