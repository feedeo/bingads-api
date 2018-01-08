/**
 * BasicHttpBinding_ICampaignManagementServiceStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class BasicHttpBinding_ICampaignManagementServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v11.campaignmanagement.ICampaignManagementService {
    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[99];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
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

    public BasicHttpBinding_ICampaignManagementServiceStub(javax.xml.rpc.Service service) {
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
        addBindings4();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddCampaignsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddCampaignsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddCampaignsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddCampaignsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddCampaignsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCampaignsByAccountId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetCampaignsByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignsByAccountIdRequest"), com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignsByAccountIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetCampaignsByAccountIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCampaignsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetCampaignsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetCampaignsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteCampaignsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteCampaignsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteCampaignsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateCampaignsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateCampaignsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateCampaignsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNegativeSitesByCampaignIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetNegativeSitesByCampaignIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeSitesByCampaignIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeSitesByCampaignIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetNegativeSitesByCampaignIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetNegativeSitesToCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetNegativeSitesToCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetNegativeSitesToCampaignsRequest"), com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetNegativeSitesToCampaignsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetNegativeSitesToCampaignsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetConfigValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetConfigValueRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConfigValueRequest"), com.microsoft.bingads.v11.campaignmanagement.GetConfigValueRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConfigValueResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetConfigValueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetConfigValueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBSCCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetBSCCountriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBSCCountriesRequest"), com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBSCCountriesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetBSCCountriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAdGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdGroupsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdGroupsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddAdGroupsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAdGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdGroupsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdGroupsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAdGroupsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdGroupsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdGroupsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdGroupsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdGroupsByCampaignId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdGroupsByCampaignIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupsByCampaignIdRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupsByCampaignIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdGroupsByCampaignIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAdGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdGroupsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdGroupsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateAdGroupsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNegativeSitesByAdGroupIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetNegativeSitesByAdGroupIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeSitesByAdGroupIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeSitesByAdGroupIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetNegativeSitesByAdGroupIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetNegativeSitesToAdGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetNegativeSitesToAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetNegativeSitesToAdGroupsRequest"), com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetNegativeSitesToAdGroupsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetNegativeSitesToAdGroupsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGeoLocationsFileUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetGeoLocationsFileUrlRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetGeoLocationsFileUrlRequest"), com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetGeoLocationsFileUrlResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetGeoLocationsFileUrlResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddAdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddAdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddAdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddAdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                true
        ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteAdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteAdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdsByEditorialStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdsByEditorialStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByEditorialStatusRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByEditorialStatusResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdsByEditorialStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdsByAdGroupId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdsByAdGroupIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByAdGroupIdRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByAdGroupIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdsByAdGroupIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateAdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateAdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateAdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateAdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                true
        ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddKeywordsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddKeywordsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddKeywordsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddKeywordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddKeywordsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                true
        ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteKeywordsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteKeywordsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteKeywordsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordsByEditorialStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetKeywordsByEditorialStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByEditorialStatusRequest"), com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByEditorialStatusResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetKeywordsByEditorialStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetKeywordsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetKeywordsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordsByAdGroupId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetKeywordsByAdGroupIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByAdGroupIdRequest"), com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByAdGroupIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetKeywordsByAdGroupIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateKeywordsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateKeywordsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateKeywordsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                true
        ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AppealEditorialRejections");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AppealEditorialRejectionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AppealEditorialRejectionsRequest"), com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AppealEditorialRejectionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AppealEditorialRejectionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEditorialReasonsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetEditorialReasonsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetEditorialReasonsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetEditorialReasonsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetEditorialReasonsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountMigrationStatuses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAccountMigrationStatusesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAccountMigrationStatusesRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAccountMigrationStatusesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAccountMigrationStatusesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetAccountProperties");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetAccountPropertiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetAccountPropertiesRequest"), com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetAccountPropertiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetAccountPropertiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountProperties");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAccountPropertiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAccountPropertiesRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAccountPropertiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAccountPropertiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAdExtensions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddAdExtensionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdExtensionsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdExtensionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddAdExtensionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdExtensionsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdExtensionsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdExtensionsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAdExtensions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateAdExtensionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdExtensionsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdExtensionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateAdExtensionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                true
        ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAdExtensions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAdExtensionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdExtensionsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdExtensionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAdExtensionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdExtensionsEditorialReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdExtensionsEditorialReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsEditorialReasonsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsEditorialReasonsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdExtensionsEditorialReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetAdExtensionsAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetAdExtensionsAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetAdExtensionsAssociationsRequest"), com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetAdExtensionsAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetAdExtensionsAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                true
        ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdExtensionsAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdExtensionsAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsAssociationsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdExtensionsAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAdExtensionsAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAdExtensionsAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdExtensionsAssociationsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdExtensionsAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAdExtensionsAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdExtensionIdsByAccountId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdExtensionIdsByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionIdsByAccountIdRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionIdsByAccountIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdExtensionIdsByAccountIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddMedia");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddMediaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddMediaRequest"), com.microsoft.bingads.v11.campaignmanagement.AddMediaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddMediaResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddMediaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddMediaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteMedia");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteMediaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteMediaRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteMediaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteMediaResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteMediaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteMediaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMediaByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetMediaByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetMediaByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMediaMetaDataByAccountId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetMediaMetaDataByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaMetaDataByAccountIdRequest"), com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaMetaDataByAccountIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetMediaMetaDataByAccountIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMediaMetaDataByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetMediaMetaDataByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaMetaDataByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaMetaDataByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetMediaMetaDataByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMediaAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetMediaAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaAssociationsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetMediaAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdGroupCriterionsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdGroupCriterionsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupCriterionsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupCriterionsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAdGroupCriterionsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAdGroupCriterions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddAdGroupCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdGroupCriterionsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdGroupCriterionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddAdGroupCriterionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                true
        ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAdGroupCriterions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateAdGroupCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdGroupCriterionsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdGroupCriterionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateAdGroupCriterionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"),
                true
        ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAdGroupCriterions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAdGroupCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdGroupCriterionsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdGroupCriterionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAdGroupCriterionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApplyProductPartitionActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApplyProductPartitionActionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">ApplyProductPartitionActionsRequest"), com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">ApplyProductPartitionActionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApplyProductPartitionActionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBMCStoresByCustomerId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetBMCStoresByCustomerIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBMCStoresByCustomerIdRequest"), com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBMCStoresByCustomerIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetBMCStoresByCustomerIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddNegativeKeywordsToEntities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddNegativeKeywordsToEntitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddNegativeKeywordsToEntitiesRequest"), com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddNegativeKeywordsToEntitiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddNegativeKeywordsToEntitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNegativeKeywordsByEntityIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetNegativeKeywordsByEntityIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeKeywordsByEntityIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeKeywordsByEntityIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetNegativeKeywordsByEntityIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteNegativeKeywordsFromEntities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteNegativeKeywordsFromEntitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteNegativeKeywordsFromEntitiesRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteNegativeKeywordsFromEntitiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteNegativeKeywordsFromEntitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSharedEntitiesByAccountId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetSharedEntitiesByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntitiesByAccountIdRequest"), com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntitiesByAccountIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetSharedEntitiesByAccountIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddSharedEntity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddSharedEntityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddSharedEntityRequest"), com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddSharedEntityResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddSharedEntityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetListItemsBySharedList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetListItemsBySharedListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetListItemsBySharedListRequest"), com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetListItemsBySharedListResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetListItemsBySharedListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddListItemsToSharedList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddListItemsToSharedListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddListItemsToSharedListRequest"), com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddListItemsToSharedListResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddListItemsToSharedListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateSharedEntities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateSharedEntitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateSharedEntitiesRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateSharedEntitiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateSharedEntitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteListItemsFromSharedList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteListItemsFromSharedListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteListItemsFromSharedListRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteListItemsFromSharedListResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteListItemsFromSharedListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetSharedEntityAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetSharedEntityAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetSharedEntityAssociationsRequest"), com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetSharedEntityAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetSharedEntityAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSharedEntityAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteSharedEntityAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteSharedEntityAssociationsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteSharedEntityAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteSharedEntityAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSharedEntityAssociationsBySharedEntityIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetSharedEntityAssociationsBySharedEntityIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntityAssociationsBySharedEntityIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntityAssociationsBySharedEntityIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetSharedEntityAssociationsBySharedEntityIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSharedEntityAssociationsByEntityIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetSharedEntityAssociationsByEntityIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntityAssociationsByEntityIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntityAssociationsByEntityIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetSharedEntityAssociationsByEntityIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSharedEntities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteSharedEntitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteSharedEntitiesRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteSharedEntitiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteSharedEntitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCampaignSizesByAccountId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetCampaignSizesByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignSizesByAccountIdRequest"), com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignSizesByAccountIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetCampaignSizesByAccountIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddCampaignCriterions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddCampaignCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddCampaignCriterionsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddCampaignCriterionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddCampaignCriterionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCampaignCriterions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateCampaignCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateCampaignCriterionsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateCampaignCriterionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateCampaignCriterionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCampaignCriterions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteCampaignCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteCampaignCriterionsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteCampaignCriterionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteCampaignCriterionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCampaignCriterionsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetCampaignCriterionsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignCriterionsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignCriterionsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetCampaignCriterionsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddBudgets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddBudgetsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddBudgetsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddBudgetsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddBudgetsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddBudgetsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddBudgetsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateBudgets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateBudgetsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateBudgetsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateBudgetsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateBudgetsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteBudgets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteBudgetsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteBudgetsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteBudgetsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteBudgetsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBudgetsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetBudgetsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBudgetsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBudgetsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetBudgetsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCampaignIdsByBudgetIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetCampaignIdsByBudgetIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignIdsByBudgetIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignIdsByBudgetIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetCampaignIdsByBudgetIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAudiences");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddAudiencesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAudiencesRequest"), com.microsoft.bingads.v11.campaignmanagement.AddAudiencesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAudiencesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddAudiencesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddAudiencesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[79] = oper;

    }

    private static void _initOperationDesc9() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAudiences");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateAudiencesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAudiencesRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAudiencesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateAudiencesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAudiences");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAudiencesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAudiencesRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAudiencesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteAudiencesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAudiencesByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAudiencesByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAudiencesByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAudiencesByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetAudiencesByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUetTagsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetUetTagsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetUetTagsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetUetTagsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetUetTagsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddUetTags");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddUetTagsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddUetTagsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddUetTagsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddUetTagsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddUetTagsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddUetTagsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateUetTags");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateUetTagsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateUetTagsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateUetTagsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateUetTagsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetConversionGoalsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetConversionGoalsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConversionGoalsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConversionGoalsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetConversionGoalsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetConversionGoalsByTagIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetConversionGoalsByTagIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConversionGoalsByTagIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConversionGoalsByTagIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetConversionGoalsByTagIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddConversionGoals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddConversionGoalsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddConversionGoalsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddConversionGoalsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddConversionGoalsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateConversionGoals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateConversionGoalsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateConversionGoalsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateConversionGoalsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateConversionGoalsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[89] = oper;

    }

    private static void _initOperationDesc10() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApplyOfflineConversions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApplyOfflineConversionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">ApplyOfflineConversionsRequest"), com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">ApplyOfflineConversionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApplyOfflineConversionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddLabelsRequest"), com.microsoft.bingads.v11.campaignmanagement.AddLabelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddLabelsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.AddLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AddLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteLabelsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteLabelsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateLabelsRequest"), com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateLabelsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLabelsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetLabelsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelsByIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetLabelsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetLabelAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetLabelAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetLabelAssociationsRequest"), com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetLabelAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SetLabelAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteLabelAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteLabelAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteLabelAssociationsRequest"), com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteLabelAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeleteLabelAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLabelAssociationsByEntityIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetLabelAssociationsByEntityIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelAssociationsByEntityIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelAssociationsByEntityIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetLabelAssociationsByEntityIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLabelAssociationsByLabelIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetLabelAssociationsByLabelIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelAssociationsByLabelIdsRequest"), com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelAssociationsByLabelIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GetLabelAssociationsByLabelIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail"),
                true
        ));
        _operations[98] = oper;

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
        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "AppUrl");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.AppUrl.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "ArrayOfAppUrl");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.AppUrl[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "AppUrl");
        qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "AppUrl");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "ArrayOfCustomParameter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.CustomParameter[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CustomParameter");
        qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CustomParameter");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "ArrayOfEntityIdToParentIdAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.EntityIdToParentIdAssociation[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "EntityIdToParentIdAssociation");
        qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "EntityIdToParentIdAssociation");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "ArrayOfRuleItem");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.RuleItem[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItem");
        qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItem");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "ArrayOfRuleItemGroup");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.RuleItemGroup[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup");
        qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "ArrayOfWebpageCondition");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.WebpageCondition[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "WebpageCondition");
        qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "WebpageCondition");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CustomEventsRule");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.CustomEventsRule.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CustomParameter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.CustomParameter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CustomParameters");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.CustomParameters.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "EntityIdToParentIdAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.EntityIdToParentIdAssociation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "PageVisitorsRule");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.PageVisitorsRule.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "PageVisitorsWhoDidNotVisitAnotherPageRule");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.PageVisitorsWhoDidNotVisitAnotherPageRule.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "PageVisitorsWhoVisitedAnotherPageRule");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.PageVisitorsWhoVisitedAnotherPageRule.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RemarketingRule");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.RemarketingRule.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItem");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.RuleItem.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.RuleItemGroup.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "StringRuleItem");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.StringRuleItem.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Webpage");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.Webpage.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "WebpageCondition");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.WebpageCondition.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "WebpageParameter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.datacontracts.WebpageParameter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
        qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring.class;
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
        cls = com.microsoft.bingads.v11.adapi.AdApiError.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.adapi.AdApiFaultDetail.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "ApplicationFault");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.adapi.ApplicationFault.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.adapi.AdApiError[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiError");
        qName2 = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiError");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdExtensionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdExtensionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdGroupCriterionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdGroupCriterionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdGroupsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdGroupsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddAdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddAdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAudiencesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddAudiencesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAudiencesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddAudiencesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddBudgetsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddBudgetsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddBudgetsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddBudgetsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddCampaignCriterionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddCampaignCriterionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddCampaignsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddCampaignsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddCampaignsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddCampaignsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddConversionGoalsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddConversionGoalsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddKeywordsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddKeywordsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddKeywordsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddKeywordsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddLabelsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddLabelsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddLabelsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddLabelsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddListItemsToSharedListRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddListItemsToSharedListResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddMediaRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddMediaRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddMediaResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddMediaResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddNegativeKeywordsToEntitiesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddNegativeKeywordsToEntitiesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddSharedEntityRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddSharedEntityResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddUetTagsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddUetTagsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddUetTagsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AddUetTagsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AppealEditorialRejectionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AppealEditorialRejectionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">ApplyOfflineConversionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">ApplyOfflineConversionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">ApplyProductPartitionActionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">ApplyProductPartitionActionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdExtensionsAssociationsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdExtensionsAssociationsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdExtensionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdExtensionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdGroupCriterionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdGroupCriterionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdGroupsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdGroupsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAudiencesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAudiencesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteBudgetsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteBudgetsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteCampaignCriterionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteCampaignCriterionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteCampaignsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteCampaignsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteKeywordsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteKeywordsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteLabelAssociationsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteLabelAssociationsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteLabelsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteLabelsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteListItemsFromSharedListRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteListItemsFromSharedListResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteMediaRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteMediaRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteMediaResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteMediaResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteNegativeKeywordsFromEntitiesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteNegativeKeywordsFromEntitiesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteSharedEntitiesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteSharedEntitiesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesResponse.class;
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
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteSharedEntityAssociationsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteSharedEntityAssociationsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAccountMigrationStatusesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAccountMigrationStatusesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAccountPropertiesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAccountPropertiesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionIdsByAccountIdRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionIdsByAccountIdResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsAssociationsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsAssociationsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsEditorialReasonsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsEditorialReasonsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupCriterionsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupCriterionsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupsByCampaignIdRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupsByCampaignIdResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdGroupsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByAdGroupIdRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByAdGroupIdResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByEditorialStatusRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByEditorialStatusResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAudiencesByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAudiencesByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBMCStoresByCustomerIdRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBMCStoresByCustomerIdResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBSCCountriesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBSCCountriesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBudgetsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBudgetsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignCriterionsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignCriterionsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignIdsByBudgetIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignIdsByBudgetIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignsByAccountIdRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignsByAccountIdResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignSizesByAccountIdRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignSizesByAccountIdResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConfigValueRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetConfigValueRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConfigValueResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetConfigValueResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConversionGoalsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConversionGoalsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConversionGoalsByTagIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConversionGoalsByTagIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetEditorialReasonsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetEditorialReasonsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetGeoLocationsFileUrlRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetGeoLocationsFileUrlResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByAdGroupIdRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByAdGroupIdResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByEditorialStatusRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByEditorialStatusResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetKeywordsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelAssociationsByEntityIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelAssociationsByEntityIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelAssociationsByLabelIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelAssociationsByLabelIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetListItemsBySharedListRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetListItemsBySharedListResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaAssociationsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaAssociationsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaMetaDataByAccountIdRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaMetaDataByAccountIdResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaMetaDataByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaMetaDataByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeKeywordsByEntityIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeKeywordsByEntityIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeSitesByAdGroupIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeSitesByAdGroupIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeSitesByCampaignIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetNegativeSitesByCampaignIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntitiesByAccountIdRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntitiesByAccountIdResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntityAssociationsByEntityIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntityAssociationsByEntityIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntityAssociationsBySharedEntityIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntityAssociationsBySharedEntityIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetUetTagsByIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetUetTagsByIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetAccountPropertiesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetAccountPropertiesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetAdExtensionsAssociationsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetAdExtensionsAssociationsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetLabelAssociationsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetLabelAssociationsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetNegativeSitesToAdGroupsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetNegativeSitesToAdGroupsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetNegativeSitesToCampaignsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetNegativeSitesToCampaignsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

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
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetSharedEntityAssociationsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetSharedEntityAssociationsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdExtensionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdExtensionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdGroupCriterionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdGroupCriterionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdGroupsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdGroupsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateAdsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateAdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAudiencesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAudiencesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateBudgetsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateBudgetsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateCampaignCriterionsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateCampaignCriterionsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateCampaignsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateCampaignsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateConversionGoalsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateConversionGoalsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateKeywordsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateKeywordsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateLabelsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateLabelsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateSharedEntitiesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateSharedEntitiesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateUetTagsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateUetTagsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountMigrationStatusesInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AccountMigrationStatusesInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountProperty");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AccountProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountPropertyName");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AccountPropertyName.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Ad");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Ad.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdDistribution");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Address");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Address.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdEditorialStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdEditorialStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionAssociation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionAssociationCollection");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionAssociationCollection.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionEditorialReason");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionEditorialReason.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionEditorialReasonCollection");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionEditorialReasonCollection.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionEditorialStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionEditorialStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionIdentity");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionIdentity.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionIdToEntityIdAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionIdToEntityIdAssociation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionsTypeFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroup");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroup.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupAdditionalField");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterionAction");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionAction.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterionEditorialStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionEditorialStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterionStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterionType");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupNegativeSites");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroupNegativeSites.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroupStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdRotation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdRotation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdRotationType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdRotationType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AgeCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AgeCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AgeRange");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AgeRange.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ApiFaultDetail");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AppAdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AppAdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AppealStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AppealStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AppInstallAd");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AppInstallAd.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AppInstallGoal");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AppInstallGoal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAccountMigrationStatusesInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AccountMigrationStatusesInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountMigrationStatusesInfo");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountMigrationStatusesInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAccountProperty");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AccountProperty[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountProperty");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountProperty");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAccountPropertyName");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AccountPropertyName[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountPropertyName");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountPropertyName");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAd");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Ad[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Ad");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Ad");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtension[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtension");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtension");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdExtensionAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionAssociation[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionAssociation");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionAssociation");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdExtensionAssociationCollection");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionAssociationCollection[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionAssociationCollection");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionAssociationCollection");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdExtensionEditorialReason");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionEditorialReason[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionEditorialReason");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionEditorialReason");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdExtensionEditorialReasonCollection");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionEditorialReasonCollection[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionEditorialReasonCollection");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionEditorialReasonCollection");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdExtensionIdentity");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionIdentity[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionIdentity");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionIdentity");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdExtensionIdToEntityIdAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdExtensionIdToEntityIdAssociation[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionIdToEntityIdAssociation");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionIdToEntityIdAssociation");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdGroup");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroup[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroup");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroup");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdGroupCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterion[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterion");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterion");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdGroupCriterionAction");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionAction[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterionAction");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterionAction");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdGroupNegativeSites");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdGroupNegativeSites[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupNegativeSites");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupNegativeSites");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAdType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AdType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdType");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdType");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfArrayOfMediaAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MediaAssociation[][].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfMediaAssociation");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfMediaAssociation");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfAudience");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Audience[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Audience");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Audience");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfBatchError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BatchError[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchError");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchError");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfBatchErrorCollection");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchErrorCollection");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchErrorCollection");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfBMCStore");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BMCStore[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BMCStore");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BMCStore");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfBudget");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Budget[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Budget");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Budget");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfCampaign");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Campaign[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Campaign");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Campaign");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfCampaignCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CampaignCriterion[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignCriterion");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignCriterion");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfCampaignNegativeSites");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CampaignNegativeSites[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignNegativeSites");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignNegativeSites");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfCampaignSize");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CampaignSize[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignSize");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignSize");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfConversionGoal");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ConversionGoal[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoal");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoal");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfDayTime");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DayTime[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DayTime");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DayTime");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfEditorialError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EditorialError[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialError");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialError");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfEditorialReason");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EditorialReason[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialReason");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialReason");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfEditorialReasonCollection");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EditorialReasonCollection[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialReasonCollection");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialReasonCollection");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfEntityNegativeKeyword");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EntityNegativeKeyword[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityNegativeKeyword");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityNegativeKeyword");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfIdCollection");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.IdCollection[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IdCollection");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IdCollection");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfKeyword");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Keyword[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Keyword");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Keyword");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfLabel");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Label[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Label");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Label");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfLabelAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.LabelAssociation[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelAssociation");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelAssociation");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfMedia");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Media[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Media");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Media");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfMediaAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MediaAssociation[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaAssociation");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaAssociation");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfMediaMetaData");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MediaMetaData[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaMetaData");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaMetaData");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfMediaRepresentation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MediaRepresentation[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaRepresentation");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaRepresentation");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfMigrationStatusInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MigrationStatusInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MigrationStatusInfo");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MigrationStatusInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfNegativeKeyword");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.NegativeKeyword[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NegativeKeyword");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NegativeKeyword");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfOfflineConversion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.OfflineConversion[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OfflineConversion");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OfflineConversion");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfOperationError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.OperationError[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OperationError");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OperationError");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfPriceTableRow");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.PriceTableRow[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceTableRow");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceTableRow");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfProductCondition");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ProductCondition[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ProductCondition");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ProductCondition");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfSetting");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Setting[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Setting");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Setting");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfSharedEntity");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SharedEntity[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntity");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntity");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfSharedEntityAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SharedEntityAssociation[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntityAssociation");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntityAssociation");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfSharedListItem");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SharedListItem[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedListItem");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedListItem");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfSiteLink");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SiteLink[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SiteLink");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SiteLink");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ArrayOfUetTag");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UetTag[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UetTag");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UetTag");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AssociationType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AssociationType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Audience");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Audience.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceAdditionalField");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.AudienceCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceType");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BatchError.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchErrorCollection");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Bid");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Bid.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BiddableAdGroupCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BiddableCampaignCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BiddingScheme");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BiddingScheme.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BidMultiplier");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BidMultiplier.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BMCStore");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BMCStore.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Budget");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Budget.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BudgetLimitType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BusinessGeoCodeStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.BusinessGeoCodeStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CallAdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CallAdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CalloutAdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CalloutAdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Campaign");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Campaign.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CampaignCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignCriterionStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignCriterionType");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignNegativeSites");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CampaignNegativeSites.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignSize");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CampaignSize.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CampaignStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignType");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoal");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ConversionGoal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalCountType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ConversionGoalCountType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalRevenue");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenue.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalRevenueType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenueType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ConversionGoalStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalTrackingStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ConversionGoalTrackingStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalType");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Criterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Criterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CriterionBid");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CriterionBid.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CustomAudience");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.CustomAudience.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Date");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Date.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Day");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Day.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DayTime");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DayTime.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DayTimeCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DayTimeCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DeviceCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DeviceCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DistanceUnit");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DistanceUnit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DurationGoal");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DurationGoal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DynamicSearchAd");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DynamicSearchAd.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DynamicSearchAdsSetting");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.DynamicSearchAdsSetting.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EditorialError.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialReason");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EditorialReason.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialReasonCollection");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EditorialReasonCollection.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EnhancedCpcBiddingScheme");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EnhancedCpcBiddingScheme.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityNegativeKeyword");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EntityNegativeKeyword.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityScope");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EntityScope.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EntityType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EventGoal");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.EventGoal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ExpandedTextAd");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ExpandedTextAd.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ExpressionOperator");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FixedBid");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.FixedBid.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GenderCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GenderCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GenderType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GenderType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GeoPoint");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.GeoPoint.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IdCollection");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.IdCollection.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Image");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Image.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ImageAdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ImageAdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ImageMediaRepresentation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ImageMediaRepresentation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "InheritFromParentBiddingScheme");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.InheritFromParentBiddingScheme.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "InMarketAudience");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.InMarketAudience.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "InStoreTransactionGoal");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.InStoreTransactionGoal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IntentOption");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.IntentOption.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ItemAction");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ItemAction.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Keyword");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Keyword.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "KeywordAdditionalField");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "KeywordEditorialStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.KeywordEditorialStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "KeywordStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.KeywordStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Label");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Label.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.LabelAssociation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LocationAdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.LocationAdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LocationCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.LocationCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LocationIntentCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.LocationIntentCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ManualCpcBiddingScheme");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ManualCpcBiddingScheme.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MatchType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MatchType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MaxClicksBiddingScheme");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MaxClicksBiddingScheme.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MaxConversionsBiddingScheme");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MaxConversionsBiddingScheme.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Media");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Media.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings4() {
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
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MediaAssociation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaEnabledEntityFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaMetaData");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MediaMetaData.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaRepresentation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MediaRepresentation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MigrationStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MigrationStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MigrationStatusInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.MigrationStatusInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Minute");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Minute.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NegativeAdGroupCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.NegativeAdGroupCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NegativeCampaignCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.NegativeCampaignCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NegativeKeyword");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.NegativeKeyword.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NegativeKeywordList");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.NegativeKeywordList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Network");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Network.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NumberOperator");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.NumberOperator.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OfflineConversion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.OfflineConversion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OfflineConversionGoal");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.OfflineConversionGoal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OperationError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.OperationError.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PagesViewedPerVisitGoal");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.PagesViewedPerVisitGoal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Paging");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Paging.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceAdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.PriceAdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceExtensionType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.PriceExtensionType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceQualifier");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.PriceQualifier.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceTableRow");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.PriceTableRow.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceUnit");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.PriceUnit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PricingModel");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.PricingModel.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ProductAd");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ProductAd.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ProductCondition");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ProductCondition.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ProductPartition");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ProductPartition.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ProductPartitionType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ProductPartitionType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ProductScope");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ProductScope.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "RadiusCriterion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.RadiusCriterion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "RemarketingList");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.RemarketingList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "RemarketingTargetingSetting");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.RemarketingTargetingSetting.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ReviewAdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ReviewAdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Schedule");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Schedule.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Setting");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Setting.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntity");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SharedEntity.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntityAssociation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SharedEntityAssociation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedList");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SharedList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedListItem");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SharedListItem.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ShoppingSetting");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ShoppingSetting.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SiteLink");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SiteLink.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Sitelink2AdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.Sitelink2AdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SiteLinksAdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.SiteLinksAdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StringOperator");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.StringOperator.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StructuredSnippetAdExtension");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.StructuredSnippetAdExtension.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TargetCpaBiddingScheme");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.TargetCpaBiddingScheme.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TextAd");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.TextAd.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UetTag");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UetTag.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UetTagTrackingStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UetTagTrackingStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UrlGoal");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.UrlGoal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ValueOperator");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.ValueOperator.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "WebpageConditionOperand");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.campaignmanagement.WebpageConditionOperand.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

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

    public com.microsoft.bingads.v11.campaignmanagement.AddCampaignsResponse addCampaigns(com.microsoft.bingads.v11.campaignmanagement.AddCampaignsRequest parameters) throws java.rmi.RemoteException {
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddCampaignsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddCampaignsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdResponse getCampaignsByAccountId(com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdRequest parameters) throws java.rmi.RemoteException {
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsResponse getCampaignsByIds(com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsRequest parameters) throws java.rmi.RemoteException {
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsResponse deleteCampaigns(com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsRequest parameters) throws java.rmi.RemoteException {
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsResponse updateCampaigns(com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsRequest parameters) throws java.rmi.RemoteException {
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
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsResponse getNegativeSitesByCampaignIds(com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsRequest parameters) throws java.rmi.RemoteException {
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsResponse setNegativeSitesToCampaigns(com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsRequest parameters) throws java.rmi.RemoteException {
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
                    return (com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetConfigValueResponse getConfigValue(com.microsoft.bingads.v11.campaignmanagement.GetConfigValueRequest parameters) throws java.rmi.RemoteException {
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetConfigValueResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetConfigValueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetConfigValueResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesResponse getBSCCountries(com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBSCCountries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBSCCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsResponse addAdGroups(com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsResponse deleteAdGroups(com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsResponse getAdGroupsByIds(com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdResponse getAdGroupsByCampaignId(com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsResponse updateAdGroups(com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse getNegativeSitesByAdGroupIds(com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsResponse setNegativeSitesToAdGroups(com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlResponse getGeoLocationsFileUrl(com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetGeoLocationsFileUrl");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetGeoLocationsFileUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddAdsResponse addAds(com.microsoft.bingads.v11.campaignmanagement.AddAdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddAdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddAdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddAdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteAdsResponse deleteAds(com.microsoft.bingads.v11.campaignmanagement.DeleteAdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteAdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusResponse getAdsByEditorialStatus(com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsResponse getAdsByIds(com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdResponse getAdsByAdGroupId(com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateAdsResponse updateAds(com.microsoft.bingads.v11.campaignmanagement.UpdateAdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateAdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateAdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateAdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddKeywordsResponse addKeywords(com.microsoft.bingads.v11.campaignmanagement.AddKeywordsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddKeywordsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddKeywordsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsResponse deleteKeywords(com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusResponse getKeywordsByEditorialStatus(com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsResponse getKeywordsByIds(com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdResponse getKeywordsByAdGroupId(com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsResponse updateKeywords(com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsResponse appealEditorialRejections(com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsResponse getEditorialReasonsByIds(com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesResponse getAccountMigrationStatuses(com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesResponse setAccountProperties(com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetAccountProperties");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetAccountProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesResponse getAccountProperties(com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAccountProperties");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAccountProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsResponse addAdExtensions(com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsResponse getAdExtensionsByIds(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsResponse updateAdExtensions(com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsResponse deleteAdExtensions(com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasons(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsResponse setAdExtensionsAssociations(com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsResponse getAdExtensionsAssociations(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsResponse deleteAdExtensionsAssociations(com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdResponse getAdExtensionIdsByAccountId(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddMediaResponse addMedia(com.microsoft.bingads.v11.campaignmanagement.AddMediaRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddMediaResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddMediaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddMediaResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteMediaResponse deleteMedia(com.microsoft.bingads.v11.campaignmanagement.DeleteMediaRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteMediaResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteMediaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteMediaResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsResponse getMediaByIds(com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdResponse getMediaMetaDataByAccountId(com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsResponse getMediaMetaDataByIds(com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsResponse getMediaAssociations(com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIds(com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsResponse addAdGroupCriterions(com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsResponse updateAdGroupCriterions(com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsResponse deleteAdGroupCriterions(com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsResponse applyProductPartitionActions(com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdResponse getBMCStoresByCustomerId(com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntities(com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIds(com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse deleteNegativeKeywordsFromEntities(com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdResponse getSharedEntitiesByAccountId(com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityResponse addSharedEntity(com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListResponse getListItemsBySharedList(com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListResponse addListItemsToSharedList(com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesResponse updateSharedEntities(com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListResponse deleteListItemsFromSharedList(com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsResponse setSharedEntityAssociations(com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsResponse deleteSharedEntityAssociations(com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIds(com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIds(com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesResponse deleteSharedEntities(com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdResponse getCampaignSizesByAccountId(com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsResponse addCampaignCriterions(com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsResponse updateCampaignCriterions(com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsResponse deleteCampaignCriterions(com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIds(com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
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
                    return (com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddBudgetsResponse addBudgets(com.microsoft.bingads.v11.campaignmanagement.AddBudgetsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddBudgets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddBudgets"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddBudgetsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddBudgetsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddBudgetsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsResponse updateBudgets(com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateBudgets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateBudgets"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsResponse deleteBudgets(com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteBudgets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteBudgets"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsResponse getBudgetsByIds(com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBudgetsByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBudgetsByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsResponse getCampaignIdsByBudgetIds(com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetCampaignIdsByBudgetIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCampaignIdsByBudgetIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddAudiencesResponse addAudiences(com.microsoft.bingads.v11.campaignmanagement.AddAudiencesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddAudiences");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddAudiences"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddAudiencesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddAudiencesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddAudiencesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesResponse updateAudiences(com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateAudiences");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAudiences"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesResponse deleteAudiences(com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteAudiences");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAudiences"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsResponse getAudiencesByIds(com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAudiencesByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAudiencesByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsResponse getUetTagsByIds(com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetUetTagsByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetUetTagsByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddUetTagsResponse addUetTags(com.microsoft.bingads.v11.campaignmanagement.AddUetTagsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddUetTags");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddUetTags"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddUetTagsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddUetTagsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddUetTagsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsResponse updateUetTags(com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateUetTags");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateUetTags"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsResponse getConversionGoalsByIds(com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetConversionGoalsByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetConversionGoalsByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsResponse getConversionGoalsByTagIds(com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetConversionGoalsByTagIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetConversionGoalsByTagIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsResponse addConversionGoals(com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddConversionGoals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddConversionGoals"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsResponse updateConversionGoals(com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateConversionGoals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateConversionGoals"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsResponse applyOfflineConversions(com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ApplyOfflineConversions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ApplyOfflineConversions"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.AddLabelsResponse addLabels(com.microsoft.bingads.v11.campaignmanagement.AddLabelsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddLabels");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddLabelsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.AddLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.AddLabelsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsResponse deleteLabels(com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteLabels");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsResponse updateLabels(com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateLabels");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsResponse getLabelsByIds(com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetLabelsByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetLabelsByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsResponse setLabelAssociations(com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetLabelAssociations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetLabelAssociations"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsResponse deleteLabelAssociations(com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteLabelAssociations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteLabelAssociations"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsResponse getLabelAssociationsByEntityIds(com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetLabelAssociationsByEntityIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetLabelAssociationsByEntityIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsResponse getLabelAssociationsByLabelIds(com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetLabelAssociationsByLabelIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetLabelAssociationsByLabelIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

}
