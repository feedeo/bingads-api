/**
 * BasicHttpBinding_ICampaignManagementServiceStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class BasicHttpBinding_ICampaignManagementServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v10.campaignmanagement.ICampaignManagementService {
  static org.apache.axis.description.OperationDesc[] _operations;

  static {
    _operations = new org.apache.axis.description.OperationDesc[87];
    _initOperationDesc1();
    _initOperationDesc2();
    _initOperationDesc3();
    _initOperationDesc4();
    _initOperationDesc5();
    _initOperationDesc6();
    _initOperationDesc7();
    _initOperationDesc8();
    _initOperationDesc9();
  }

  private java.util.Vector cachedSerClasses = new java.util.Vector();
  private java.util.Vector cachedSerQNames = new java.util.Vector();
  private java.util.Vector cachedSerFactories = new java.util.Vector();
  private java.util.Vector cachedDeserFactories = new java.util.Vector();

  public BasicHttpBinding_ICampaignManagementServiceStub() throws org.apache.axis.AxisFault {
    this(null);
  }

  public BasicHttpBinding_ICampaignManagementServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
    this(service);
    super.cachedEndpoint = endpointURL;
  }

  public BasicHttpBinding_ICampaignManagementServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
    addBindings2();
    addBindings3();
  }

  private static void _initOperationDesc1() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddCampaigns");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddCampaignsRequest"), com.microsoft.bingads.v10.campaignmanagement.AddCampaignsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddCampaignsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddCampaignsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddCampaignsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("GetCampaignsByAccountId");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetCampaignsByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignsByAccountIdRequest"), com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignsByAccountIdResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetCampaignsByAccountIdResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("GetCampaignsByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetCampaignsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignsByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignsByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetCampaignsByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("DeleteCampaigns");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteCampaignsRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteCampaignsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteCampaignsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("UpdateCampaigns");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateCampaignsRequest"), com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateCampaignsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateCampaignsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("GetNegativeSitesByCampaignIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetNegativeSitesByCampaignIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeSitesByCampaignIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeSitesByCampaignIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetNegativeSitesByCampaignIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("SetNegativeSitesToCampaigns");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetNegativeSitesToCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetNegativeSitesToCampaignsRequest"), com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetNegativeSitesToCampaignsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetNegativeSitesToCampaignsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("GetConfigValue");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetConfigValueRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetConfigValueRequest"), com.microsoft.bingads.v10.campaignmanagement.GetConfigValueRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetConfigValueResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetConfigValueResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetConfigValueResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("AddAdGroups");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdGroupsRequest"), com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdGroupsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddAdGroupsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("DeleteAdGroups");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdGroupsRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdGroupsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteAdGroupsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("GetAdGroupsByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdGroupsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupsByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupsByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdGroupsByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("GetAdGroupsByCampaignId");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdGroupsByCampaignIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupsByCampaignIdRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupsByCampaignIdResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdGroupsByCampaignIdResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("UpdateAdGroups");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdGroupsRequest"), com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdGroupsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateAdGroupsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("GetNegativeSitesByAdGroupIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetNegativeSitesByAdGroupIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeSitesByAdGroupIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeSitesByAdGroupIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetNegativeSitesByAdGroupIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("SetNegativeSitesToAdGroups");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetNegativeSitesToAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetNegativeSitesToAdGroupsRequest"), com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetNegativeSitesToAdGroupsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetNegativeSitesToAdGroupsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("DeleteTargetsFromLibrary");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteTargetsFromLibraryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetsFromLibraryRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetsFromLibraryResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteTargetsFromLibraryResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
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
    oper.setName("GetTargetsInfoFromLibrary");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetTargetsInfoFromLibraryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsInfoFromLibraryRequest"), com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsInfoFromLibraryResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetTargetsInfoFromLibraryResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[16] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("SetTargetToAdGroup");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetTargetToAdGroupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetTargetToAdGroupRequest"), com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetTargetToAdGroupResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetTargetToAdGroupResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[17] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteTargetFromAdGroup");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteTargetFromAdGroupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetFromAdGroupRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetFromAdGroupResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteTargetFromAdGroupResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[18] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("SetTargetToCampaign");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetTargetToCampaignRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetTargetToCampaignRequest"), com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetTargetToCampaignResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetTargetToCampaignResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[19] = oper;

  }

  private static void _initOperationDesc3() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteTargetFromCampaign");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteTargetFromCampaignRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetFromCampaignRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetFromCampaignResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteTargetFromCampaignResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[20] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddTargetsToLibrary");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddTargetsToLibraryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddTargetsToLibraryRequest"), com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddTargetsToLibraryResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddTargetsToLibraryResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[21] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("UpdateTargetsInLibrary");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateTargetsInLibraryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateTargetsInLibraryRequest"), com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateTargetsInLibraryResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateTargetsInLibraryResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[22] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetTargetsByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetTargetsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetTargetsByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[23] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetTargetsByAdGroupIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetTargetsByAdGroupIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByAdGroupIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByAdGroupIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetTargetsByAdGroupIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[24] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetTargetsByCampaignIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetTargetsByCampaignIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByCampaignIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByCampaignIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetTargetsByCampaignIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[25] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddAds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddAdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdsRequest"), com.microsoft.bingads.v10.campaignmanagement.AddAdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddAdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddAdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[26] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteAds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteAdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdsRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteAdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteAdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteAdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[27] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetAdsByEditorialStatus");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdsByEditorialStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByEditorialStatusRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByEditorialStatusResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdsByEditorialStatusResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[28] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetAdsByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdsByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[29] = oper;

  }

  private static void _initOperationDesc4() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetAdsByAdGroupId");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdsByAdGroupIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByAdGroupIdRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByAdGroupIdResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdsByAdGroupIdResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[30] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("UpdateAds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateAdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdsRequest"), com.microsoft.bingads.v10.campaignmanagement.UpdateAdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.UpdateAdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateAdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[31] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddKeywords");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddKeywordsRequest"), com.microsoft.bingads.v10.campaignmanagement.AddKeywordsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddKeywordsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddKeywordsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddKeywordsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[32] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteKeywords");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteKeywordsRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteKeywordsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteKeywordsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[33] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetKeywordsByEditorialStatus");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetKeywordsByEditorialStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByEditorialStatusRequest"), com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByEditorialStatusResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetKeywordsByEditorialStatusResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[34] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetKeywordsByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetKeywordsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetKeywordsByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[35] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetKeywordsByAdGroupId");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetKeywordsByAdGroupIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByAdGroupIdRequest"), com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByAdGroupIdResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetKeywordsByAdGroupIdResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[36] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("UpdateKeywords");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateKeywordsRequest"), com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateKeywordsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateKeywordsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[37] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AppealEditorialRejections");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppealEditorialRejectionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AppealEditorialRejectionsRequest"), com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AppealEditorialRejectionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppealEditorialRejectionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[38] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddSitePlacements");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddSitePlacementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddSitePlacementsRequest"), com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddSitePlacementsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddSitePlacementsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[39] = oper;

  }

  private static void _initOperationDesc5() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteSitePlacements");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteSitePlacementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSitePlacementsRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSitePlacementsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteSitePlacementsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[40] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetSitePlacementsByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetSitePlacementsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSitePlacementsByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSitePlacementsByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetSitePlacementsByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[41] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetSitePlacementsByAdGroupId");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetSitePlacementsByAdGroupIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSitePlacementsByAdGroupIdRequest"), com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSitePlacementsByAdGroupIdResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetSitePlacementsByAdGroupIdResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[42] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("UpdateSitePlacements");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateSitePlacementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateSitePlacementsRequest"), com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateSitePlacementsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateSitePlacementsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[43] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetPlacementDetailsForUrls");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetPlacementDetailsForUrlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetPlacementDetailsForUrlsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetPlacementDetailsForUrlsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetPlacementDetailsForUrlsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[44] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetEditorialReasonsByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetEditorialReasonsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetEditorialReasonsByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetEditorialReasonsByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetEditorialReasonsByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[45] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetAccountMigrationStatuses");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAccountMigrationStatusesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAccountMigrationStatusesRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAccountMigrationStatusesResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAccountMigrationStatusesResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[46] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddAdExtensions");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddAdExtensionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdExtensionsRequest"), com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdExtensionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddAdExtensionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[47] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetAdExtensionsByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdExtensionsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdExtensionsByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[48] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("UpdateAdExtensions");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateAdExtensionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdExtensionsRequest"), com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdExtensionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateAdExtensionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[49] = oper;

  }

  private static void _initOperationDesc6() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteAdExtensions");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteAdExtensionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdExtensionsRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdExtensionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteAdExtensionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[50] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetAdExtensionsEditorialReasons");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdExtensionsEditorialReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsEditorialReasonsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsEditorialReasonsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdExtensionsEditorialReasonsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[51] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("SetAdExtensionsAssociations");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetAdExtensionsAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetAdExtensionsAssociationsRequest"), com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetAdExtensionsAssociationsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetAdExtensionsAssociationsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[52] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetAdExtensionsAssociations");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdExtensionsAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsAssociationsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsAssociationsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdExtensionsAssociationsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[53] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteAdExtensionsAssociations");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteAdExtensionsAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdExtensionsAssociationsRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdExtensionsAssociationsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteAdExtensionsAssociationsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[54] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetAdExtensionIdsByAccountId");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdExtensionIdsByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionIdsByAccountIdRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionIdsByAccountIdResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdExtensionIdsByAccountIdResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[55] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddMedia");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddMediaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddMediaRequest"), com.microsoft.bingads.v10.campaignmanagement.AddMediaRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddMediaResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddMediaResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddMediaResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[56] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteMedia");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteMediaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteMediaRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteMediaRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteMediaResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteMediaResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteMediaResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[57] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetMediaByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetMediaByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetMediaByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[58] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetMediaMetaDataByAccountId");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetMediaMetaDataByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaMetaDataByAccountIdRequest"), com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaMetaDataByAccountIdResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetMediaMetaDataByAccountIdResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[59] = oper;

  }

  private static void _initOperationDesc7() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetMediaMetaDataByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetMediaMetaDataByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaMetaDataByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaMetaDataByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetMediaMetaDataByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[60] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetMediaAssociations");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetMediaAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaAssociationsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaAssociationsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetMediaAssociationsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[61] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetAdGroupCriterionsByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdGroupCriterionsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupCriterionsByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupCriterionsByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetAdGroupCriterionsByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[62] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddAdGroupCriterions");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddAdGroupCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdGroupCriterionsRequest"), com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdGroupCriterionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddAdGroupCriterionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[63] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("UpdateAdGroupCriterions");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateAdGroupCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdGroupCriterionsRequest"), com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdGroupCriterionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateAdGroupCriterionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[64] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteAdGroupCriterions");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteAdGroupCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdGroupCriterionsRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdGroupCriterionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteAdGroupCriterionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[65] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("ApplyProductPartitionActions");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApplyProductPartitionActionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">ApplyProductPartitionActionsRequest"), com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">ApplyProductPartitionActionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApplyProductPartitionActionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[66] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetBMCStoresByCustomerId");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetBMCStoresByCustomerIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBMCStoresByCustomerIdRequest"), com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBMCStoresByCustomerIdResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetBMCStoresByCustomerIdResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[67] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddNegativeKeywordsToEntities");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddNegativeKeywordsToEntitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddNegativeKeywordsToEntitiesRequest"), com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddNegativeKeywordsToEntitiesResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddNegativeKeywordsToEntitiesResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[68] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetNegativeKeywordsByEntityIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetNegativeKeywordsByEntityIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeKeywordsByEntityIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeKeywordsByEntityIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetNegativeKeywordsByEntityIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[69] = oper;

  }

  private static void _initOperationDesc8() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteNegativeKeywordsFromEntities");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteNegativeKeywordsFromEntitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteNegativeKeywordsFromEntitiesRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteNegativeKeywordsFromEntitiesResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteNegativeKeywordsFromEntitiesResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[70] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetSharedEntitiesByAccountId");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetSharedEntitiesByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntitiesByAccountIdRequest"), com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntitiesByAccountIdResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetSharedEntitiesByAccountIdResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[71] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddSharedEntity");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddSharedEntityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddSharedEntityRequest"), com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddSharedEntityResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddSharedEntityResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[72] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetListItemsBySharedList");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetListItemsBySharedListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetListItemsBySharedListRequest"), com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetListItemsBySharedListResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetListItemsBySharedListResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[73] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddListItemsToSharedList");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddListItemsToSharedListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddListItemsToSharedListRequest"), com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddListItemsToSharedListResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddListItemsToSharedListResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[74] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("UpdateSharedEntities");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateSharedEntitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateSharedEntitiesRequest"), com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateSharedEntitiesResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateSharedEntitiesResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[75] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteListItemsFromSharedList");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteListItemsFromSharedListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteListItemsFromSharedListRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteListItemsFromSharedListResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteListItemsFromSharedListResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[76] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("SetSharedEntityAssociations");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetSharedEntityAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetSharedEntityAssociationsRequest"), com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetSharedEntityAssociationsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SetSharedEntityAssociationsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[77] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteSharedEntityAssociations");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteSharedEntityAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSharedEntityAssociationsRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSharedEntityAssociationsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteSharedEntityAssociationsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[78] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetSharedEntityAssociationsBySharedEntityIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetSharedEntityAssociationsBySharedEntityIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntityAssociationsBySharedEntityIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntityAssociationsBySharedEntityIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetSharedEntityAssociationsBySharedEntityIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[79] = oper;

  }

  private static void _initOperationDesc9() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetSharedEntityAssociationsByEntityIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetSharedEntityAssociationsByEntityIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntityAssociationsByEntityIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntityAssociationsByEntityIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetSharedEntityAssociationsByEntityIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[80] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteSharedEntities");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteSharedEntitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSharedEntitiesRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSharedEntitiesResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteSharedEntitiesResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[81] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetCampaignSizesByAccountId");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetCampaignSizesByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignSizesByAccountIdRequest"), com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignSizesByAccountIdResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetCampaignSizesByAccountIdResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[82] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("AddCampaignCriterions");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddCampaignCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddCampaignCriterionsRequest"), com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddCampaignCriterionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AddCampaignCriterionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[83] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("UpdateCampaignCriterions");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateCampaignCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateCampaignCriterionsRequest"), com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateCampaignCriterionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UpdateCampaignCriterionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[84] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DeleteCampaignCriterions");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteCampaignCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteCampaignCriterionsRequest"), com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteCampaignCriterionsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeleteCampaignCriterionsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[85] = oper;

    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("GetCampaignCriterionsByIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetCampaignCriterionsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignCriterionsByIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignCriterionsByIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetCampaignCriterionsByIdsResponse"));
    oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            "com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail",
            new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail"),
            true
    ));
    oper.addFault(new org.apache.axis.description.FaultDesc(
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            "com.microsoft.bingads.v10.adapi.AdApiFaultDetail",
            new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
            true
    ));
    _operations[86] = oper;

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
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "AppUrl");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.AppUrl.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ArrayOfAppUrl");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.AppUrl[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "AppUrl");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "AppUrl");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ArrayOfCustomParameter");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.CustomParameter[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "CustomParameter");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "CustomParameter");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ArrayOfEntityIdToParentIdAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.EntityIdToParentIdAssociation[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "EntityIdToParentIdAssociation");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "EntityIdToParentIdAssociation");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "BiddingScheme");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.BiddingScheme.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "CustomParameter");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.CustomParameter.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "CustomParameters");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.CustomParameters.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "EnhancedCpcBiddingScheme");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.EnhancedCpcBiddingScheme.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "EntityIdToParentIdAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.EntityIdToParentIdAssociation.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "InheritFromParentBiddingScheme");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.InheritFromParentBiddingScheme.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ManualCpcBiddingScheme");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.ManualCpcBiddingScheme.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "MaxClicksBiddingScheme");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.MaxClicksBiddingScheme.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "MaxConversionsBiddingScheme");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.MaxConversionsBiddingScheme.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "TargetCpaBiddingScheme");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.datacontracts.TargetCpaBiddingScheme.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System", "ArrayOfNullableOflong");
    cachedSerQNames.add(qName);
    cls = long[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
    qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System", "long");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdExtensionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdExtensionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdGroupCriterionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdGroupCriterionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdGroupsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdGroupsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddAdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddAdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddCampaignCriterionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddCampaignCriterionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddCampaignsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddCampaignsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddCampaignsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddCampaignsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddKeywordsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddKeywordsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddKeywordsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddKeywordsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddListItemsToSharedListRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddListItemsToSharedListResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddMediaRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddMediaRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddMediaResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddMediaResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddNegativeKeywordsToEntitiesRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddNegativeKeywordsToEntitiesResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddSharedEntityRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddSharedEntityResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddSitePlacementsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddSitePlacementsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddTargetsToLibraryRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddTargetsToLibraryResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AppealEditorialRejectionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AppealEditorialRejectionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">ApplyProductPartitionActionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">ApplyProductPartitionActionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdExtensionsAssociationsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdExtensionsAssociationsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdExtensionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdExtensionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdGroupCriterionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdGroupCriterionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdGroupsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdGroupsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteAdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteAdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteAdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteCampaignCriterionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteCampaignCriterionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteCampaignsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteCampaignsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteKeywordsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteKeywordsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteListItemsFromSharedListRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteListItemsFromSharedListResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteMediaRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteMediaRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteMediaResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteMediaResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteNegativeKeywordsFromEntitiesRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteNegativeKeywordsFromEntitiesResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSharedEntitiesRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSharedEntitiesResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSharedEntityAssociationsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSharedEntityAssociationsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSitePlacementsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteSitePlacementsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetFromAdGroupRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetFromAdGroupResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetFromCampaignRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetFromCampaignResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetsFromLibraryRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetsFromLibraryResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAccountMigrationStatusesRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAccountMigrationStatusesResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionIdsByAccountIdRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionIdsByAccountIdResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsAssociationsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsAssociationsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsEditorialReasonsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdExtensionsEditorialReasonsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupCriterionsByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupCriterionsByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupsByCampaignIdRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdRequest.class;
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
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupsByCampaignIdResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupsByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupsByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByAdGroupIdRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByAdGroupIdResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByEditorialStatusRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByEditorialStatusResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdsByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBMCStoresByCustomerIdRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBMCStoresByCustomerIdResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignCriterionsByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignCriterionsByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignsByAccountIdRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignsByAccountIdResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignsByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignsByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignSizesByAccountIdRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignSizesByAccountIdResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetConfigValueRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetConfigValueRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetConfigValueResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetConfigValueResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetEditorialReasonsByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetEditorialReasonsByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByAdGroupIdRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByAdGroupIdResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByEditorialStatusRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByEditorialStatusResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetKeywordsByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetListItemsBySharedListRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetListItemsBySharedListResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaAssociationsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaAssociationsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaMetaDataByAccountIdRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaMetaDataByAccountIdResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaMetaDataByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaMetaDataByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeKeywordsByEntityIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeKeywordsByEntityIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeSitesByAdGroupIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeSitesByAdGroupIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeSitesByCampaignIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeSitesByCampaignIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetPlacementDetailsForUrlsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetPlacementDetailsForUrlsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntitiesByAccountIdRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntitiesByAccountIdResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntityAssociationsByEntityIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntityAssociationsByEntityIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntityAssociationsBySharedEntityIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntityAssociationsBySharedEntityIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSitePlacementsByAdGroupIdRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSitePlacementsByAdGroupIdResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSitePlacementsByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSitePlacementsByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByAdGroupIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByAdGroupIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByCampaignIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByCampaignIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsInfoFromLibraryRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsInfoFromLibraryResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetAdExtensionsAssociationsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetAdExtensionsAssociationsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetNegativeSitesToAdGroupsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetNegativeSitesToAdGroupsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetNegativeSitesToCampaignsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetNegativeSitesToCampaignsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetSharedEntityAssociationsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetSharedEntityAssociationsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetTargetToAdGroupRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetTargetToAdGroupResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetTargetToCampaignRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetTargetToCampaignResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdExtensionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdExtensionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdGroupCriterionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdGroupCriterionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdGroupsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdGroupsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateAdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateAdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateCampaignCriterionsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateCampaignCriterionsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateCampaignsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateCampaignsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateKeywordsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateKeywordsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateSharedEntitiesRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateSharedEntitiesResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateSitePlacementsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateSitePlacementsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateTargetsInLibraryRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateTargetsInLibraryResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AccountMigrationStatusesInfo");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AccountMigrationStatusesInfo.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Ad");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Ad.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdDistribution");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

  }

  private void addBindings2() {
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
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Address");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Address.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdEditorialStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdEditorialStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtension.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionAssociation.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionAssociationCollection");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionAssociationCollection.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionEditorialReason");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionEditorialReason.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionEditorialReasonCollection");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionEditorialReasonCollection.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionEditorialStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionEditorialStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdentity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionIdentity.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdToEntityIdAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionIdToEntityIdAssociation.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionsTypeFilter");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroup");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroup.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupAdditionalField");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterion");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionAction");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionAction.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionEditorialStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionEditorialStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupNegativeSites");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroupNegativeSites.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroupStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdRotation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdRotation.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdRotationType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdRotationType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AgeRange");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AgeRange.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AgeTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AgeTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AgeTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AgeTargetBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppAdExtension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AppAdExtension.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppealStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AppealStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppInstallAd");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AppInstallAd.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAccountMigrationStatusesInfo");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AccountMigrationStatusesInfo[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AccountMigrationStatusesInfo");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AccountMigrationStatusesInfo");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAd");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Ad[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Ad");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Ad");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtension[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtension");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtension");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionAssociation[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionAssociation");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionAssociation");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionAssociationCollection");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionAssociationCollection[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionAssociationCollection");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionAssociationCollection");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionEditorialReason");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionEditorialReason[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionEditorialReason");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionEditorialReason");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionEditorialReasonCollection");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionEditorialReasonCollection[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionEditorialReasonCollection");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionEditorialReasonCollection");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionIdentity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionIdentity[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdentity");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdentity");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionIdToEntityIdAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdExtensionIdToEntityIdAssociation[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdToEntityIdAssociation");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdToEntityIdAssociation");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdGroup");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroup[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroup");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroup");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdGroupCriterion");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterion");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterion");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdGroupCriterionAction");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionAction[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionAction");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionAction");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdGroupNegativeSites");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdGroupNegativeSites[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupNegativeSites");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupNegativeSites");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AdType[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdType");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdType");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAgeTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AgeTargetBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AgeTargetBid");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AgeTargetBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfArrayOfMediaAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MediaAssociation[][].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaAssociation");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaAssociation");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfArrayOfPlacementDetail");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.PlacementDetail[][].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfPlacementDetail");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfPlacementDetail");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfBatchError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BatchError[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfBatchErrorCollection");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BatchErrorCollection[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchErrorCollection");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchErrorCollection");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfBMCStore");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BMCStore[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BMCStore");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BMCStore");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCampaign");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Campaign[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Campaign");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Campaign");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCampaignCriterion");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CampaignCriterion[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignCriterion");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignCriterion");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCampaignNegativeSites");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignNegativeSites");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignNegativeSites");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCampaignSize");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CampaignSize[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignSize");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignSize");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCityTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CityTargetBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CityTargetBid");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CityTargetBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCountryTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CountryTargetBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CountryTargetBid");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CountryTargetBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfDayTimeTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DayTimeTargetBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DayTimeTargetBid");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DayTimeTargetBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfDeviceOSTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeviceOSTargetBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOSTargetBid");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOSTargetBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfDimension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Dimension[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Dimension");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Dimension");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfEditorialError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EditorialError[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialError");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialError");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfEditorialReason");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EditorialReason[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialReason");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialReason");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfEditorialReasonCollection");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EditorialReasonCollection[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialReasonCollection");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialReasonCollection");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfEntityNegativeKeyword");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EntityNegativeKeyword[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EntityNegativeKeyword");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EntityNegativeKeyword");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfGenderTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GenderTargetBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderTargetBid");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderTargetBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfIdCollection");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.IdCollection[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "IdCollection");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "IdCollection");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfKeyword");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Keyword[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Keyword");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Keyword");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMedia");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Media[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Media");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Media");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MediaAssociation[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaAssociation");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaAssociation");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaMetaData");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MediaMetaData[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaMetaData");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaMetaData");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaRepresentation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MediaRepresentation[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaRepresentation");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaRepresentation");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MediaType[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaType");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaType");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMetroAreaTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MetroAreaTargetBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MetroAreaTargetBid");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MetroAreaTargetBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMigrationStatusInfo");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MigrationStatusInfo[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MigrationStatusInfo");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MigrationStatusInfo");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfNegativeKeyword");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.NegativeKeyword[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeKeyword");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeKeyword");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfOperationError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.OperationError[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "OperationError");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "OperationError");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfPlacementDetail");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.PlacementDetail[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PlacementDetail");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PlacementDetail");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfPostalCodeTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.PostalCodeTargetBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PostalCodeTargetBid");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PostalCodeTargetBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfProductCondition");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ProductCondition[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductCondition");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductCondition");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfRadiusTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.RadiusTargetBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "RadiusTargetBid");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "RadiusTargetBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSetting");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Setting[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Setting");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Setting");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSharedEntity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SharedEntity[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntity");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntity");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSharedEntityAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SharedEntityAssociation[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntityAssociation");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntityAssociation");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSharedListItem");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SharedListItem[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedListItem");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedListItem");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSiteLink");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SiteLink[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SiteLink");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SiteLink");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSitePlacement");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SitePlacement[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SitePlacement");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SitePlacement");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfStateTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.StateTargetBid[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "StateTargetBid");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "StateTargetBid");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Target[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Target");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Target");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfTargetInfo");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.TargetInfo[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "TargetInfo");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "TargetInfo");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AssociationType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.AssociationType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BatchError.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchErrorCollection");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BatchErrorCollection.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Bid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Bid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BiddableAdGroupCriterion");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BiddableAdGroupCriterion.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BiddingModel");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BiddingModel.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BMCStore");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BMCStore.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BudgetLimitType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BudgetLimitType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BusinessGeoCodeStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BusinessGeoCodeStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CallAdExtension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CallAdExtension.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CalloutAdExtension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CalloutAdExtension.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

  }

  private void addBindings3() {
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
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Campaign");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Campaign.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignAdditionalField");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignCriterion");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CampaignCriterion.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignCriterionType");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignNegativeSites");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignSize");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CampaignSize.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CampaignStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignType");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CityTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CityTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CityTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CityTargetBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CountryTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CountryTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CountryTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CountryTargetBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Criterion");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Criterion.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CriterionBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CriterionBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CriterionType");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Date");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Date.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Day");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Day.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DayTimeTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DayTimeTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DayTimeTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DayTimeTargetBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOSTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeviceOSTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOSTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DeviceOSTargetBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Dimension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Dimension.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DistanceUnit");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DistanceUnit.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EditorialError.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialReason");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EditorialReason.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialReasonCollection");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EditorialReasonCollection.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EntityNegativeKeyword");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EntityNegativeKeyword.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EntityType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EntityType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "FixedBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.FixedBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GenderTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GenderTargetBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GenderType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GeoPoint");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GeoPoint.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "IdCollection");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.IdCollection.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Image");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Image.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ImageAdExtension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ImageAdExtension.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ImageMediaRepresentation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ImageMediaRepresentation.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ImpressionsPerDayRange");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ImpressionsPerDayRange.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "IntentOption");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.IntentOption.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ItemAction");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ItemAction.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Keyword");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Keyword.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "KeywordEditorialStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.KeywordEditorialStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "KeywordStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.KeywordStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "LocationAdExtension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.LocationAdExtension.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "LocationTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.LocationTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MatchType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MatchType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Media");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Media.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MediaAssociation.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaEnabledEntityFilter");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaMetaData");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MediaMetaData.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaRepresentation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MediaRepresentation.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MediaType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MetroAreaTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MetroAreaTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MetroAreaTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MetroAreaTargetBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MigrationStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MigrationStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MigrationStatusInfo");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.MigrationStatusInfo.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Minute");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Minute.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeAdGroupCriterion");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.NegativeAdGroupCriterion.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeCampaignCriterion");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.NegativeCampaignCriterion.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeKeyword");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.NegativeKeyword.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeKeywordList");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.NegativeKeywordList.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Network");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Network.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "OperationError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.OperationError.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PlacementDetail");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.PlacementDetail.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PostalCodeTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.PostalCodeTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PostalCodeTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.PostalCodeTargetBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PricingModel");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.PricingModel.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductAd");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ProductAd.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductCondition");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ProductCondition.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductPartition");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ProductPartition.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductPartitionType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ProductPartitionType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductScope");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ProductScope.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "RadiusTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.RadiusTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "RadiusTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.RadiusTargetBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ReviewAdExtension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ReviewAdExtension.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Setting");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Setting.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntity");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SharedEntity.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntityAssociation");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SharedEntityAssociation.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedList");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SharedList.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedListItem");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SharedListItem.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ShoppingSetting");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ShoppingSetting.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SiteLink");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SiteLink.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SiteLinksAdExtension");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SiteLinksAdExtension.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SitePlacement");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SitePlacement.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SitePlacementStatus");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.SitePlacementStatus.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "StateTarget");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.StateTarget.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "StateTargetBid");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.StateTargetBid.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Target");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.Target.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "TargetInfo");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.TargetInfo.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "TextAd");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.TextAd.class;
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

  public com.microsoft.bingads.v10.campaignmanagement.AddCampaignsResponse addCampaigns(com.microsoft.bingads.v10.campaignmanagement.AddCampaignsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[0]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddCampaigns");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddCampaigns"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddCampaignsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddCampaignsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdResponse getCampaignsByAccountId(com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[1]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetCampaignsByAccountId");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetCampaignsByAccountId"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsResponse getCampaignsByIds(com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[2]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetCampaignsByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetCampaignsByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsResponse deleteCampaigns(com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[3]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteCampaigns");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCampaigns"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsResponse updateCampaigns(com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[4]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("UpdateCampaigns");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "UpdateCampaigns"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsResponse getNegativeSitesByCampaignIds(com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[5]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetNegativeSitesByCampaignIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetNegativeSitesByCampaignIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsResponse setNegativeSitesToCampaigns(com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[6]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("SetNegativeSitesToCampaigns");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "SetNegativeSitesToCampaigns"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetConfigValueResponse getConfigValue(com.microsoft.bingads.v10.campaignmanagement.GetConfigValueRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[7]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetConfigValue");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetConfigValue"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetConfigValueResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetConfigValueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetConfigValueResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsResponse addAdGroups(com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[8]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddAdGroups");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddAdGroups"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsResponse deleteAdGroups(com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[9]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteAdGroups");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAdGroups"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsResponse getAdGroupsByIds(com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[10]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAdGroupsByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAdGroupsByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdResponse getAdGroupsByCampaignId(com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[11]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAdGroupsByCampaignId");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAdGroupsByCampaignId"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsResponse updateAdGroups(com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[12]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("UpdateAdGroups");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAdGroups"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse getNegativeSitesByAdGroupIds(com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[13]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetNegativeSitesByAdGroupIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetNegativeSitesByAdGroupIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsResponse setNegativeSitesToAdGroups(com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[14]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("SetNegativeSitesToAdGroups");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "SetNegativeSitesToAdGroups"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryResponse deleteTargetsFromLibrary(com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[15]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteTargetsFromLibrary");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteTargetsFromLibrary"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryResponse getTargetsInfoFromLibrary(com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[16]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetTargetsInfoFromLibrary");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetTargetsInfoFromLibrary"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupResponse setTargetToAdGroup(com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[17]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("SetTargetToAdGroup");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "SetTargetToAdGroup"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupResponse deleteTargetFromAdGroup(com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[18]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteTargetFromAdGroup");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteTargetFromAdGroup"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignResponse setTargetToCampaign(com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[19]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("SetTargetToCampaign");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "SetTargetToCampaign"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignResponse deleteTargetFromCampaign(com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[20]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteTargetFromCampaign");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteTargetFromCampaign"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryResponse addTargetsToLibrary(com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[21]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddTargetsToLibrary");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddTargetsToLibrary"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryResponse updateTargetsInLibrary(com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[22]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("UpdateTargetsInLibrary");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "UpdateTargetsInLibrary"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsResponse getTargetsByIds(com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[23]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetTargetsByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetTargetsByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsResponse getTargetsByAdGroupIds(com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[24]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetTargetsByAdGroupIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetTargetsByAdGroupIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsResponse getTargetsByCampaignIds(com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[25]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetTargetsByCampaignIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetTargetsByCampaignIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddAdsResponse addAds(com.microsoft.bingads.v10.campaignmanagement.AddAdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[26]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddAds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddAds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddAdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddAdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddAdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteAdsResponse deleteAds(com.microsoft.bingads.v10.campaignmanagement.DeleteAdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[27]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteAds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteAdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteAdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteAdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusResponse getAdsByEditorialStatus(com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[28]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAdsByEditorialStatus");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAdsByEditorialStatus"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsResponse getAdsByIds(com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[29]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAdsByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAdsByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdResponse getAdsByAdGroupId(com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[30]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAdsByAdGroupId");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAdsByAdGroupId"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.UpdateAdsResponse updateAds(com.microsoft.bingads.v10.campaignmanagement.UpdateAdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[31]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("UpdateAds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateAdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateAdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.UpdateAdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddKeywordsResponse addKeywords(com.microsoft.bingads.v10.campaignmanagement.AddKeywordsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[32]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddKeywords");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddKeywords"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddKeywordsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddKeywordsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsResponse deleteKeywords(com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[33]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteKeywords");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteKeywords"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusResponse getKeywordsByEditorialStatus(com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[34]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetKeywordsByEditorialStatus");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordsByEditorialStatus"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsResponse getKeywordsByIds(com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[35]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetKeywordsByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordsByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdResponse getKeywordsByAdGroupId(com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[36]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetKeywordsByAdGroupId");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordsByAdGroupId"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsResponse updateKeywords(com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[37]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("UpdateKeywords");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "UpdateKeywords"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsResponse appealEditorialRejections(com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[38]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AppealEditorialRejections");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AppealEditorialRejections"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsResponse addSitePlacements(com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[39]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddSitePlacements");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddSitePlacements"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsResponse deleteSitePlacements(com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[40]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteSitePlacements");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSitePlacements"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsResponse getSitePlacementsByIds(com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[41]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetSitePlacementsByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetSitePlacementsByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdResponse getSitePlacementsByAdGroupId(com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[42]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetSitePlacementsByAdGroupId");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetSitePlacementsByAdGroupId"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsResponse updateSitePlacements(com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[43]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("UpdateSitePlacements");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "UpdateSitePlacements"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsResponse getPlacementDetailsForUrls(com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[44]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetPlacementDetailsForUrls");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetPlacementDetailsForUrls"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsResponse getEditorialReasonsByIds(com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[45]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetEditorialReasonsByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetEditorialReasonsByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesResponse getAccountMigrationStatuses(com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[46]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAccountMigrationStatuses");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAccountMigrationStatuses"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsResponse addAdExtensions(com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[47]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddAdExtensions");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddAdExtensions"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsResponse getAdExtensionsByIds(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[48]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAdExtensionsByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAdExtensionsByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsResponse updateAdExtensions(com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[49]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("UpdateAdExtensions");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAdExtensions"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsResponse deleteAdExtensions(com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[50]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteAdExtensions");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAdExtensions"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasons(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[51]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAdExtensionsEditorialReasons");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAdExtensionsEditorialReasons"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsResponse setAdExtensionsAssociations(com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[52]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("SetAdExtensionsAssociations");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "SetAdExtensionsAssociations"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsResponse getAdExtensionsAssociations(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[53]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAdExtensionsAssociations");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAdExtensionsAssociations"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsResponse deleteAdExtensionsAssociations(com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[54]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteAdExtensionsAssociations");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAdExtensionsAssociations"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdResponse getAdExtensionIdsByAccountId(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[55]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAdExtensionIdsByAccountId");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAdExtensionIdsByAccountId"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddMediaResponse addMedia(com.microsoft.bingads.v10.campaignmanagement.AddMediaRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[56]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddMedia");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddMedia"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddMediaResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddMediaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddMediaResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteMediaResponse deleteMedia(com.microsoft.bingads.v10.campaignmanagement.DeleteMediaRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[57]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteMedia");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteMedia"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteMediaResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteMediaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteMediaResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsResponse getMediaByIds(com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[58]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetMediaByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetMediaByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdResponse getMediaMetaDataByAccountId(com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[59]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetMediaMetaDataByAccountId");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetMediaMetaDataByAccountId"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsResponse getMediaMetaDataByIds(com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[60]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetMediaMetaDataByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetMediaMetaDataByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsResponse getMediaAssociations(com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[61]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetMediaAssociations");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetMediaAssociations"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIds(com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[62]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetAdGroupCriterionsByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetAdGroupCriterionsByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsResponse addAdGroupCriterions(com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[63]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddAdGroupCriterions");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddAdGroupCriterions"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsResponse updateAdGroupCriterions(com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[64]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("UpdateAdGroupCriterions");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAdGroupCriterions"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsResponse deleteAdGroupCriterions(com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[65]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteAdGroupCriterions");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAdGroupCriterions"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsResponse applyProductPartitionActions(com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[66]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("ApplyProductPartitionActions");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "ApplyProductPartitionActions"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdResponse getBMCStoresByCustomerId(com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[67]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetBMCStoresByCustomerId");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetBMCStoresByCustomerId"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntities(com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[68]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddNegativeKeywordsToEntities");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddNegativeKeywordsToEntities"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIds(com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[69]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetNegativeKeywordsByEntityIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetNegativeKeywordsByEntityIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse deleteNegativeKeywordsFromEntities(com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[70]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteNegativeKeywordsFromEntities");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteNegativeKeywordsFromEntities"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdResponse getSharedEntitiesByAccountId(com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[71]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetSharedEntitiesByAccountId");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetSharedEntitiesByAccountId"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityResponse addSharedEntity(com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[72]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddSharedEntity");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddSharedEntity"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListResponse getListItemsBySharedList(com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[73]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetListItemsBySharedList");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetListItemsBySharedList"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListResponse addListItemsToSharedList(com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[74]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddListItemsToSharedList");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddListItemsToSharedList"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesResponse updateSharedEntities(com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[75]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("UpdateSharedEntities");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "UpdateSharedEntities"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListResponse deleteListItemsFromSharedList(com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[76]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteListItemsFromSharedList");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteListItemsFromSharedList"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsResponse setSharedEntityAssociations(com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[77]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("SetSharedEntityAssociations");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "SetSharedEntityAssociations"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsResponse deleteSharedEntityAssociations(com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[78]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteSharedEntityAssociations");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSharedEntityAssociations"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIds(com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[79]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetSharedEntityAssociationsBySharedEntityIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetSharedEntityAssociationsBySharedEntityIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIds(com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[80]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetSharedEntityAssociationsByEntityIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetSharedEntityAssociationsByEntityIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesResponse deleteSharedEntities(com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[81]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteSharedEntities");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSharedEntities"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdResponse getCampaignSizesByAccountId(com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[82]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetCampaignSizesByAccountId");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetCampaignSizesByAccountId"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsResponse addCampaignCriterions(com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[83]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("AddCampaignCriterions");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "AddCampaignCriterions"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsResponse updateCampaignCriterions(com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[84]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("UpdateCampaignCriterions");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "UpdateCampaignCriterions"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsResponse deleteCampaignCriterions(com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[85]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("DeleteCampaignCriterions");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCampaignCriterions"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

  public com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIds(com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[86]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetCampaignCriterionsByIds");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetCampaignCriterionsByIds"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsResponse.class);
        }
      }
    } catch (org.apache.axis.AxisFault axisFaultException) {
      if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
          throw (java.rmi.RemoteException) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) {
          throw (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
        }
        if (axisFaultException.detail instanceof com.microsoft.bingads.v10.adapi.AdApiFaultDetail) {
          throw (com.microsoft.bingads.v10.adapi.AdApiFaultDetail) axisFaultException.detail;
        }
      }
      throw axisFaultException;
    }
  }

}
