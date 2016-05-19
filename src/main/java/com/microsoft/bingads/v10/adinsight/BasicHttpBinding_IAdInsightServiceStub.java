/**
 * BasicHttpBinding_IAdInsightServiceStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class BasicHttpBinding_IAdInsightServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v10.adinsight.IAdInsightService {
  static org.apache.axis.description.OperationDesc[] _operations;

  static {
    _operations = new org.apache.axis.description.OperationDesc[17];
    _initOperationDesc1();
    _initOperationDesc2();
  }

  private java.util.Vector cachedSerClasses = new java.util.Vector();
  private java.util.Vector cachedSerQNames = new java.util.Vector();
  private java.util.Vector cachedSerFactories = new java.util.Vector();
  private java.util.Vector cachedDeserFactories = new java.util.Vector();

  public BasicHttpBinding_IAdInsightServiceStub() throws org.apache.axis.AxisFault {
    this(null);
  }

  public BasicHttpBinding_IAdInsightServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
    this(service);
    super.cachedEndpoint = endpointURL;
  }

  public BasicHttpBinding_IAdInsightServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
    if (service == null) {
      super.service = new org.apache.axis.client.Service();
    } else {
      super.service = service;
    }
    ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.1");
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
    addBindings0();
    addBindings1();
  }

  private static void _initOperationDesc1() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetBidOpportunities");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetBidOpportunitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidOpportunitiesRequest"), com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidOpportunitiesResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetBidOpportunitiesResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[0] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetBudgetOpportunities");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetBudgetOpportunitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBudgetOpportunitiesRequest"), com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBudgetOpportunitiesResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetBudgetOpportunitiesResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[1] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetKeywordOpportunities");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetKeywordOpportunitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordOpportunitiesRequest"), com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordOpportunitiesResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetKeywordOpportunitiesResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[2] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetEstimatedBidByKeywordIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetEstimatedBidByKeywordIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedBidByKeywordIdsRequest"), com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedBidByKeywordIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetEstimatedBidByKeywordIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[3] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetEstimatedPositionByKeywordIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetEstimatedPositionByKeywordIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedPositionByKeywordIdsRequest"), com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedPositionByKeywordIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetEstimatedPositionByKeywordIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[4] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetEstimatedBidByKeywords");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetEstimatedBidByKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedBidByKeywordsRequest"), com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedBidByKeywordsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetEstimatedBidByKeywordsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[5] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetEstimatedPositionByKeywords");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetEstimatedPositionByKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedPositionByKeywordsRequest"), com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedPositionByKeywordsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetEstimatedPositionByKeywordsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[6] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetBidLandscapeByAdGroupIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetBidLandscapeByAdGroupIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidLandscapeByAdGroupIdsRequest"), com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidLandscapeByAdGroupIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetBidLandscapeByAdGroupIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[7] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetBidLandscapeByKeywordIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetBidLandscapeByKeywordIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidLandscapeByKeywordIdsRequest"), com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidLandscapeByKeywordIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetBidLandscapeByKeywordIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[8] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetHistoricalKeywordPerformance");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetHistoricalKeywordPerformanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetHistoricalKeywordPerformanceRequest"), com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetHistoricalKeywordPerformanceResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetHistoricalKeywordPerformanceResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[9] = oper;

  }

  private static void _initOperationDesc2() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetHistoricalSearchCount");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetHistoricalSearchCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetHistoricalSearchCountRequest"), com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetHistoricalSearchCountResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetHistoricalSearchCountResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[10] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetKeywordCategories");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetKeywordCategoriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordCategoriesRequest"), com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordCategoriesResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetKeywordCategoriesResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[11] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetKeywordDemographics");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetKeywordDemographicsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordDemographicsRequest"), com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordDemographicsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetKeywordDemographicsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[12] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetKeywordLocations");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetKeywordLocationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordLocationsRequest"), com.microsoft.bingads.v10.adinsight.GetKeywordLocationsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordLocationsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetKeywordLocationsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetKeywordLocationsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[13] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("SuggestKeywordsForUrl");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "SuggestKeywordsForUrlRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsForUrlRequest"), com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsForUrlResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "SuggestKeywordsForUrlResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[14] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("SuggestKeywordsFromExistingKeywords");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "SuggestKeywordsFromExistingKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsFromExistingKeywordsRequest"), com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsFromExistingKeywordsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "SuggestKeywordsFromExistingKeywordsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[15] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetAuctionInsightData");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetAuctionInsightDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetAuctionInsightDataRequest"), com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetAuctionInsightDataResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "GetAuctionInsightDataResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.adinsight.ApiFaultDetail",
            new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[16] = oper;

  }

  private void addBindings0() {
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
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscape");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscape.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeInput");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeInput.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdPosition");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AdPosition.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfAdGroupBidLandscape");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscape[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscape");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscape");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfAdGroupBidLandscapeInput");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeInput[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeInput");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeInput");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfAuctionInsightKPINode");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AuctionInsightKPINode[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightKPINode");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightKPINode");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfAuctionInsightV2Entity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AuctionInsightV2Entity[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightV2Entity");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightV2Entity");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfBidLandscapePoint");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BidLandscapePoint[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidLandscapePoint");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidLandscapePoint");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfBidOpportunity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BidOpportunity[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidOpportunity");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidOpportunity");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfBroadMatchSearchQueryKPI");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BroadMatchSearchQueryKPI[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BroadMatchSearchQueryKPI");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BroadMatchSearchQueryKPI");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfBudgetOpportunity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BudgetOpportunity[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetOpportunity");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetOpportunity");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfBudgetPoint");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BudgetPoint[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPoint");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPoint");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfEstimatedBidAndTraffic");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.EstimatedBidAndTraffic[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedBidAndTraffic");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedBidAndTraffic");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfEstimatedPositionAndTraffic");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.EstimatedPositionAndTraffic[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedPositionAndTraffic");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedPositionAndTraffic");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfField");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.Field[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfHistoricalSearchCountPeriodic");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.HistoricalSearchCountPeriodic[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "HistoricalSearchCountPeriodic");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "HistoricalSearchCountPeriodic");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordAndConfidence");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordAndConfidence[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordAndConfidence");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordAndConfidence");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordBidLandscape");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordBidLandscape[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordBidLandscape");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordBidLandscape");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordCategory");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordCategory[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordCategory");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordCategory");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordCategoryResult");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordCategoryResult[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordCategoryResult");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordCategoryResult");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordDemographic");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordDemographic[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordDemographic");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordDemographic");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordDemographicResult");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordDemographicResult[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordDemographicResult");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordDemographicResult");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordEstimatedBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordEstimatedBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordEstimatedBid");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordEstimatedBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordEstimatedPosition");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordEstimatedPosition[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordEstimatedPosition");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordEstimatedPosition");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordHistoricalPerformance");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordHistoricalPerformance[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordHistoricalPerformance");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordHistoricalPerformance");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordIdEstimatedBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordIdEstimatedBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordIdEstimatedBid");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordIdEstimatedBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordIdEstimatedPosition");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordIdEstimatedPosition[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordIdEstimatedPosition");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordIdEstimatedPosition");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordKPI");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordKPI[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordKPI");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordKPI");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordLocation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordLocation[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocation");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocation");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordLocationResult");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordLocationResult[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocationResult");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocationResult");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordOpportunity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordOpportunity[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordOpportunity");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordOpportunity");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordSearchCount");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordSearchCount[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSearchCount");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSearchCount");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordSuggestion");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordSuggestion[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSuggestion");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSuggestion");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfMatchType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.MatchType[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfOrderBy");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.OrderBy[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "OrderBy");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "OrderBy");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfPredicate");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.Predicate[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Predicate");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Predicate");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfSearchCountsByAttributes");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.SearchCountsByAttributes[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SearchCountsByAttributes");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SearchCountsByAttributes");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightKPINode");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AuctionInsightKPINode.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightResult");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AuctionInsightResult.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightV2Entity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.AuctionInsightV2Entity.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidLandscapePoint");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BidLandscapePoint.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidOpportunity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BidOpportunity.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidOpportunityType");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BroadMatchKeywordOpportunity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BroadMatchKeywordOpportunity.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BroadMatchSearchQueryKPI");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BroadMatchSearchQueryKPI.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetLimitType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BudgetLimitType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetOpportunity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BudgetOpportunity.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPoint");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BudgetPoint.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPointType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.BudgetPointType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Currency");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.Currency.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DateRange");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.DateRange.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DayMonthAndYear");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedBidAndTraffic");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.EstimatedBidAndTraffic.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedPositionAndTraffic");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.EstimatedPositionAndTraffic.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.Field.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "HistoricalSearchCountPeriodic");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.HistoricalSearchCountPeriodic.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordAndConfidence");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordAndConfidence.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordBidLandscape");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordBidLandscape.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordCategory");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordCategory.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordCategoryResult");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordCategoryResult.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordDemographic");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordDemographic.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordDemographicResult");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordDemographicResult.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordEstimatedBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordEstimatedBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordEstimatedPosition");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordEstimatedPosition.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordHistoricalPerformance");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordHistoricalPerformance.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordIdEstimatedBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordIdEstimatedBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordIdEstimatedPosition");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordIdEstimatedPosition.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordKPI");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordKPI.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordLocation.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocationResult");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordLocationResult.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordOpportunity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordOpportunity.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordOpportunityType");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSearchCount");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordSearchCount.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSuggestion");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.KeywordSuggestion.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.MatchType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Operator");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.Operator.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Opportunity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.Opportunity.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "OrderBy");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.OrderBy.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Paging");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.Paging.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Predicate");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.Predicate.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SearchCountsByAttributes");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.SearchCountsByAttributes.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Selector");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.Selector.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SortOrder");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.SortOrder.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "TargetAdPosition");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.TargetAdPosition.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "TimeInterval");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.entity.TimeInterval.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "ArrayOfKeywordAndMatchType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.message.KeywordAndMatchType[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "KeywordAndMatchType");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "KeywordAndMatchType");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "KeywordAndMatchType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.message.KeywordAndMatchType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    cachedSerQNames.add(qName);
    cls = long[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
    qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
    qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adapi.AdApiError.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adapi.AdApiFaultDetail.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "ApplicationFault");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adapi.ApplicationFault.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adapi.AdApiError[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiError");
    qName2 = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiError");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdInsight/v10", "ArrayOfBatchError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.BatchError[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdInsight/v10", "BatchError");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdInsight/v10", "BatchError");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdInsight/v10", "ArrayOfOperationError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.OperationError[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdInsight/v10", "OperationError");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdInsight/v10", "OperationError");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdInsight/v10", "BatchError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.BatchError.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/AdInsight/v10", "OperationError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.OperationError.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetAuctionInsightDataRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetAuctionInsightDataResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

  }

  private void addBindings1() {
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
    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidLandscapeByAdGroupIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidLandscapeByAdGroupIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidLandscapeByKeywordIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidLandscapeByKeywordIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidOpportunitiesRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidOpportunitiesResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBudgetOpportunitiesRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBudgetOpportunitiesResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedBidByKeywordIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedBidByKeywordIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedBidByKeywordsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedBidByKeywordsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedPositionByKeywordIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedPositionByKeywordIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedPositionByKeywordsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedPositionByKeywordsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetHistoricalKeywordPerformanceRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetHistoricalKeywordPerformanceResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetHistoricalSearchCountRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetHistoricalSearchCountResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordCategoriesRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordCategoriesResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordDemographicsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordDemographicsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordLocationsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetKeywordLocationsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordLocationsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetKeywordLocationsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordOpportunitiesRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordOpportunitiesResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsForUrlRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsForUrlResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsFromExistingKeywordsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsFromExistingKeywordsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.adinsight.ApiFaultDetail.class;
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
            } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
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
    } catch (java.lang.Throwable _t) {
      throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesResponse getBidOpportunities(com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[0]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetBidOpportunities");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetBidOpportunities"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetBidOpportunitiesResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesResponse getBudgetOpportunities(com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[1]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetBudgetOpportunities");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetBudgetOpportunities"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetBudgetOpportunitiesResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesResponse getKeywordOpportunities(com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[2]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetKeywordOpportunities");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordOpportunities"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetKeywordOpportunitiesResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsResponse getEstimatedBidByKeywordIds(com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[3]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetEstimatedBidByKeywordIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetEstimatedBidByKeywordIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsResponse getEstimatedPositionByKeywordIds(com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[4]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetEstimatedPositionByKeywordIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetEstimatedPositionByKeywordIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsResponse getEstimatedBidByKeywords(com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[5]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetEstimatedBidByKeywords");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetEstimatedBidByKeywords"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetEstimatedBidByKeywordsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsResponse getEstimatedPositionByKeywords(com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[6]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetEstimatedPositionByKeywords");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetEstimatedPositionByKeywords"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetEstimatedPositionByKeywordsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsResponse getBidLandscapeByAdGroupIds(com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[7]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetBidLandscapeByAdGroupIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetBidLandscapeByAdGroupIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetBidLandscapeByAdGroupIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsResponse getBidLandscapeByKeywordIds(com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[8]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetBidLandscapeByKeywordIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetBidLandscapeByKeywordIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetBidLandscapeByKeywordIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceResponse getHistoricalKeywordPerformance(com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[9]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetHistoricalKeywordPerformance");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetHistoricalKeywordPerformance"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetHistoricalKeywordPerformanceResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountResponse getHistoricalSearchCount(com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[10]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetHistoricalSearchCount");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetHistoricalSearchCount"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetHistoricalSearchCountResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesResponse getKeywordCategories(com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[11]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetKeywordCategories");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordCategories"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetKeywordCategoriesResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsResponse getKeywordDemographics(com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[12]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetKeywordDemographics");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordDemographics"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetKeywordDemographicsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetKeywordLocationsResponse getKeywordLocations(com.microsoft.bingads.v10.adinsight.GetKeywordLocationsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[13]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetKeywordLocations");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordLocations"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetKeywordLocationsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetKeywordLocationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetKeywordLocationsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlResponse suggestKeywordsForUrl(com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[14]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("SuggestKeywordsForUrl");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "SuggestKeywordsForUrl"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.SuggestKeywordsForUrlResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsResponse suggestKeywordsFromExistingKeywords(com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[15]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("SuggestKeywordsFromExistingKeywords");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "SuggestKeywordsFromExistingKeywords"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.SuggestKeywordsFromExistingKeywordsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataResponse getAuctionInsightData(com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[16]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAuctionInsightData");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAuctionInsightData"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.adinsight.GetAuctionInsightDataResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adinsight.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adinsight.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

}
