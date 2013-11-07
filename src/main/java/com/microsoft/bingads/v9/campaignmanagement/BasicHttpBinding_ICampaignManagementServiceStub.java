/**
 * BasicHttpBinding_ICampaignManagementServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class BasicHttpBinding_ICampaignManagementServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v9.campaignmanagement.ICampaignManagementService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[67];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddCampaignsRequest"), com.microsoft.bingads.v9.campaignmanagement.AddCampaignsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddCampaignsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.AddCampaignsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddCampaignsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCampaignsByAccountId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetCampaignsByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetCampaignsByAccountIdRequest"), com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByAccountIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetCampaignsByAccountIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByAccountIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetCampaignsByAccountIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCampaignsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetCampaignsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetCampaignsByIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetCampaignsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetCampaignsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteCampaignsRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteCampaignsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteCampaignsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteCampaignsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteCampaignsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateCampaignsRequest"), com.microsoft.bingads.v9.campaignmanagement.UpdateCampaignsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateCampaignsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.UpdateCampaignsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateCampaignsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNegativeKeywordsByCampaignIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetNegativeKeywordsByCampaignIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeKeywordsByCampaignIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByCampaignIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeKeywordsByCampaignIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByCampaignIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetNegativeKeywordsByCampaignIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetNegativeKeywordsToCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetNegativeKeywordsToCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeKeywordsToCampaignsRequest"), com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToCampaignsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeKeywordsToCampaignsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToCampaignsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetNegativeKeywordsToCampaignsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNegativeSitesByCampaignIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetNegativeSitesByCampaignIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeSitesByCampaignIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByCampaignIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeSitesByCampaignIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByCampaignIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetNegativeSitesByCampaignIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetNegativeSitesToCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetNegativeSitesToCampaignsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeSitesToCampaignsRequest"), com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToCampaignsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeSitesToCampaignsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToCampaignsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetNegativeSitesToCampaignsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAdGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdGroupsRequest"), com.microsoft.bingads.v9.campaignmanagement.AddAdGroupsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdGroupsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.AddAdGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddAdGroupsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAdGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdGroupsRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdGroupsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteAdGroupsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdGroupsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdGroupsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupsByIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdGroupsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdGroupsByCampaignId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdGroupsByCampaignIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupsByCampaignIdRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByCampaignIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupsByCampaignIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByCampaignIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdGroupsByCampaignIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubmitAdGroupForApproval");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SubmitAdGroupForApprovalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SubmitAdGroupForApprovalRequest"), com.microsoft.bingads.v9.campaignmanagement.SubmitAdGroupForApprovalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SubmitAdGroupForApprovalResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.SubmitAdGroupForApprovalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SubmitAdGroupForApprovalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAdGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdGroupsRequest"), com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdGroupsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateAdGroupsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNegativeKeywordsByAdGroupIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetNegativeKeywordsByAdGroupIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeKeywordsByAdGroupIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByAdGroupIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeKeywordsByAdGroupIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByAdGroupIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetNegativeKeywordsByAdGroupIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetNegativeKeywordsToAdGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetNegativeKeywordsToAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeKeywordsToAdGroupsRequest"), com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToAdGroupsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeKeywordsToAdGroupsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToAdGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetNegativeKeywordsToAdGroupsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNegativeSitesByAdGroupIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetNegativeSitesByAdGroupIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeSitesByAdGroupIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeSitesByAdGroupIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetNegativeSitesByAdGroupIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetNegativeSitesToAdGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetNegativeSitesToAdGroupsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeSitesToAdGroupsRequest"), com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToAdGroupsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeSitesToAdGroupsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToAdGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetNegativeSitesToAdGroupsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddTargetsToLibrary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddTargetsToLibraryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddTargetsToLibraryRequest"), com.microsoft.bingads.v9.campaignmanagement.AddTargetsToLibraryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddTargetsToLibraryResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.AddTargetsToLibraryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddTargetsToLibraryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateTargetsInLibrary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateTargetsInLibraryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateTargetsInLibraryRequest"), com.microsoft.bingads.v9.campaignmanagement.UpdateTargetsInLibraryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateTargetsInLibraryResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.UpdateTargetsInLibraryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateTargetsInLibraryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteTargetsFromLibrary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteTargetsFromLibraryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetsFromLibraryRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteTargetsFromLibraryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetsFromLibraryResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteTargetsFromLibraryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteTargetsFromLibraryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTargetsInfoFromLibrary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetTargetsInfoFromLibraryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsInfoFromLibraryRequest"), com.microsoft.bingads.v9.campaignmanagement.GetTargetsInfoFromLibraryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsInfoFromLibraryResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetTargetsInfoFromLibraryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetTargetsInfoFromLibraryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTargetsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetTargetsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetTargetsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetTargetsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetTargetsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetTargetToAdGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetTargetToAdGroupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetTargetToAdGroupRequest"), com.microsoft.bingads.v9.campaignmanagement.SetTargetToAdGroupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetTargetToAdGroupResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.SetTargetToAdGroupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetTargetToAdGroupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteTargetFromAdGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteTargetFromAdGroupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetFromAdGroupRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromAdGroupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetFromAdGroupResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromAdGroupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteTargetFromAdGroupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTargetsByAdGroupIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetTargetsByAdGroupIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByAdGroupIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetTargetsByAdGroupIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByAdGroupIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetTargetsByAdGroupIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetTargetsByAdGroupIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetTargetToCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetTargetToCampaignRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetTargetToCampaignRequest"), com.microsoft.bingads.v9.campaignmanagement.SetTargetToCampaignRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetTargetToCampaignResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.SetTargetToCampaignResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetTargetToCampaignResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteTargetFromCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteTargetFromCampaignRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetFromCampaignRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromCampaignRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetFromCampaignResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromCampaignResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteTargetFromCampaignResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTargetsByCampaignIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetTargetsByCampaignIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByCampaignIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetTargetsByCampaignIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByCampaignIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetTargetsByCampaignIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetTargetsByCampaignIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddAdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdsRequest"), com.microsoft.bingads.v9.campaignmanagement.AddAdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.AddAdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddAdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteAdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdsRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteAdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteAdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteAdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdsByEditorialStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdsByEditorialStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByEditorialStatusRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdsByEditorialStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByEditorialStatusResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdsByEditorialStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdsByEditorialStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdsByAdGroupId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdsByAdGroupIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByAdGroupIdRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdsByAdGroupIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByAdGroupIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdsByAdGroupIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdsByAdGroupIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateAdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdsRequest"), com.microsoft.bingads.v9.campaignmanagement.UpdateAdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.UpdateAdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateAdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddKeywordsRequest"), com.microsoft.bingads.v9.campaignmanagement.AddKeywordsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddKeywordsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.AddKeywordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddKeywordsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteKeywordsRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteKeywordsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteKeywordsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteKeywordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteKeywordsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordsByEditorialStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetKeywordsByEditorialStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByEditorialStatusRequest"), com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByEditorialStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByEditorialStatusResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByEditorialStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetKeywordsByEditorialStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetKeywordsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetKeywordsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordsByAdGroupId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetKeywordsByAdGroupIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByAdGroupIdRequest"), com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByAdGroupIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByAdGroupIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByAdGroupIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetKeywordsByAdGroupIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateKeywordsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateKeywordsRequest"), com.microsoft.bingads.v9.campaignmanagement.UpdateKeywordsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateKeywordsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.UpdateKeywordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateKeywordsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AppealEditorialRejections");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AppealEditorialRejectionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AppealEditorialRejectionsRequest"), com.microsoft.bingads.v9.campaignmanagement.AppealEditorialRejectionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AppealEditorialRejectionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.AppealEditorialRejectionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AppealEditorialRejectionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddSitePlacements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddSitePlacementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddSitePlacementsRequest"), com.microsoft.bingads.v9.campaignmanagement.AddSitePlacementsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddSitePlacementsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.AddSitePlacementsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddSitePlacementsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSitePlacements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteSitePlacementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteSitePlacementsRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteSitePlacementsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteSitePlacementsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteSitePlacementsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteSitePlacementsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSitePlacementsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetSitePlacementsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetSitePlacementsByIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetSitePlacementsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetSitePlacementsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSitePlacementsByAdGroupId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetSitePlacementsByAdGroupIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetSitePlacementsByAdGroupIdRequest"), com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByAdGroupIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetSitePlacementsByAdGroupIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByAdGroupIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetSitePlacementsByAdGroupIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateSitePlacements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateSitePlacementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateSitePlacementsRequest"), com.microsoft.bingads.v9.campaignmanagement.UpdateSitePlacementsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateSitePlacementsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.UpdateSitePlacementsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateSitePlacementsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPlacementDetailsForUrls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetPlacementDetailsForUrlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetPlacementDetailsForUrlsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetPlacementDetailsForUrlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetPlacementDetailsForUrlsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetPlacementDetailsForUrlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetPlacementDetailsForUrlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEditorialReasonsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetEditorialReasonsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetEditorialReasonsByIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetEditorialReasonsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetEditorialReasonsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetEditorialReasonsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetEditorialReasonsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAdExtensions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddAdExtensionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdExtensionsRequest"), com.microsoft.bingads.v9.campaignmanagement.AddAdExtensionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdExtensionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.AddAdExtensionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddAdExtensionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdExtensionsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdExtensionsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsByIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdExtensionsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAdExtensions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateAdExtensionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdExtensionsRequest"), com.microsoft.bingads.v9.campaignmanagement.UpdateAdExtensionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdExtensionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.UpdateAdExtensionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateAdExtensionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAdExtensions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteAdExtensionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdExtensionsRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdExtensionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteAdExtensionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdExtensionsEditorialReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdExtensionsEditorialReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsEditorialReasonsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsEditorialReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsEditorialReasonsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsEditorialReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdExtensionsEditorialReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetAdExtensionsAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetAdExtensionsAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetAdExtensionsAssociationsRequest"), com.microsoft.bingads.v9.campaignmanagement.SetAdExtensionsAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetAdExtensionsAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.SetAdExtensionsAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SetAdExtensionsAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdExtensionsAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdExtensionsAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsAssociationsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdExtensionsAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAdExtensionsAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteAdExtensionsAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdExtensionsAssociationsRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsAssociationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdExtensionsAssociationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsAssociationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteAdExtensionsAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdExtensionIdsByAccountId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdExtensionIdsByAccountIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionIdsByAccountIdRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionIdsByAccountIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionIdsByAccountIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionIdsByAccountIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdExtensionIdsByAccountIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddMedia");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddMediaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddMediaRequest"), com.microsoft.bingads.v9.campaignmanagement.AddMediaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddMediaResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.AddMediaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddMediaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMediaByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetMediaByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetMediaByIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetMediaByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetMediaByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetMediaByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetMediaByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdGroupCriterionsByIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdGroupCriterionsByIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupCriterionsByIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupCriterionsByIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdGroupCriterionsByIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdGroupCriterionsByAdGroupId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdGroupCriterionsByAdGroupIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupCriterionsByAdGroupIdRequest"), com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByAdGroupIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupCriterionsByAdGroupIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByAdGroupIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetAdGroupCriterionsByAdGroupIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAdGroupCriterions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddAdGroupCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdGroupCriterionsRequest"), com.microsoft.bingads.v9.campaignmanagement.AddAdGroupCriterionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdGroupCriterionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.AddAdGroupCriterionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AddAdGroupCriterionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAdGroupCriterions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateAdGroupCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdGroupCriterionsRequest"), com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupCriterionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdGroupCriterionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupCriterionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "UpdateAdGroupCriterionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAdGroupCriterions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteAdGroupCriterionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdGroupCriterionsRequest"), com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupCriterionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdGroupCriterionsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupCriterionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeleteAdGroupCriterionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBMCStoresByCustomerId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetBMCStoresByCustomerIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBMCStoresByCustomerIdRequest"), com.microsoft.bingads.v9.campaignmanagement.GetBMCStoresByCustomerIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBMCStoresByCustomerIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetBMCStoresByCustomerIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetBMCStoresByCustomerIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[66] = oper;

    }

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
        addBindings0();
        addBindings1();
        addBindings2();
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
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.schemas.generic.ArrayOfKeyValuePairOfstringstring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System", "ArrayOfNullableOflong");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.datacontracts.ArrayOfNullableOflong.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdExtensionsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddAdExtensionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdExtensionsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddAdExtensionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdGroupCriterionsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddAdGroupCriterionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdGroupCriterionsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddAdGroupCriterionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdGroupsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddAdGroupsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdGroupsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddAdGroupsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddAdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddAdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddCampaignsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddCampaignsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddCampaignsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddCampaignsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddKeywordsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddKeywordsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddKeywordsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddKeywordsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddMediaRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddMediaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddMediaResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddMediaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddSitePlacementsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddSitePlacementsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddSitePlacementsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddSitePlacementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddTargetsToLibraryRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddTargetsToLibraryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddTargetsToLibraryResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AddTargetsToLibraryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AppealEditorialRejectionsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AppealEditorialRejectionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AppealEditorialRejectionsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AppealEditorialRejectionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdExtensionsAssociationsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsAssociationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdExtensionsAssociationsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsAssociationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdExtensionsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdExtensionsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdGroupCriterionsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupCriterionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdGroupCriterionsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupCriterionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdGroupsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdGroupsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteAdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteAdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteCampaignsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteCampaignsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteCampaignsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteCampaignsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteKeywordsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteKeywordsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteKeywordsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteKeywordsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteSitePlacementsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteSitePlacementsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteSitePlacementsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteSitePlacementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetFromAdGroupRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromAdGroupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetFromAdGroupResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromAdGroupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetFromCampaignRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromCampaignRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetFromCampaignResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromCampaignResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetsFromLibraryRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteTargetsFromLibraryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteTargetsFromLibraryResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeleteTargetsFromLibraryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionIdsByAccountIdRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionIdsByAccountIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionIdsByAccountIdResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionIdsByAccountIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsAssociationsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsAssociationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsAssociationsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsAssociationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsByIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsByIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsByIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsByIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsEditorialReasonsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsEditorialReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsEditorialReasonsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsEditorialReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupCriterionsByAdGroupIdRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByAdGroupIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupCriterionsByAdGroupIdResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByAdGroupIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupCriterionsByIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupCriterionsByIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupsByCampaignIdRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByCampaignIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupsByCampaignIdResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByCampaignIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupsByIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupsByIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByAdGroupIdRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdsByAdGroupIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByAdGroupIdResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdsByAdGroupIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByEditorialStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdsByEditorialStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByEditorialStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdsByEditorialStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdsByIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdsByIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetAdsByIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBMCStoresByCustomerIdRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetBMCStoresByCustomerIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBMCStoresByCustomerIdResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetBMCStoresByCustomerIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetCampaignsByAccountIdRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByAccountIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetCampaignsByAccountIdResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByAccountIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetCampaignsByIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetCampaignsByIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetEditorialReasonsByIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetEditorialReasonsByIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetEditorialReasonsByIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetEditorialReasonsByIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByAdGroupIdRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByAdGroupIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByAdGroupIdResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByAdGroupIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByEditorialStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByEditorialStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByEditorialStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByEditorialStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetMediaByIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetMediaByIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetMediaByIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetMediaByIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeKeywordsByAdGroupIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByAdGroupIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeKeywordsByAdGroupIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByAdGroupIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeKeywordsByCampaignIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByCampaignIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeKeywordsByCampaignIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByCampaignIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeSitesByAdGroupIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeSitesByAdGroupIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeSitesByCampaignIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByCampaignIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeSitesByCampaignIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByCampaignIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetPlacementDetailsForUrlsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetPlacementDetailsForUrlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetPlacementDetailsForUrlsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetPlacementDetailsForUrlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetSitePlacementsByAdGroupIdRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByAdGroupIdRequest.class;
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
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetSitePlacementsByAdGroupIdResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByAdGroupIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetSitePlacementsByIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetSitePlacementsByIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByAdGroupIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetTargetsByAdGroupIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByAdGroupIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetTargetsByAdGroupIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByCampaignIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetTargetsByCampaignIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByCampaignIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetTargetsByCampaignIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetTargetsByIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetTargetsByIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsInfoFromLibraryRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetTargetsInfoFromLibraryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsInfoFromLibraryResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetTargetsInfoFromLibraryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetAdExtensionsAssociationsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetAdExtensionsAssociationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetAdExtensionsAssociationsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetAdExtensionsAssociationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeKeywordsToAdGroupsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToAdGroupsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeKeywordsToAdGroupsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToAdGroupsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeKeywordsToCampaignsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToCampaignsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeKeywordsToCampaignsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToCampaignsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeSitesToAdGroupsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToAdGroupsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeSitesToAdGroupsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToAdGroupsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeSitesToCampaignsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToCampaignsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeSitesToCampaignsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToCampaignsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetTargetToAdGroupRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetTargetToAdGroupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetTargetToAdGroupResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetTargetToAdGroupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetTargetToCampaignRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetTargetToCampaignRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetTargetToCampaignResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SetTargetToCampaignResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SubmitAdGroupForApprovalRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SubmitAdGroupForApprovalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SubmitAdGroupForApprovalResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SubmitAdGroupForApprovalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdExtensionsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateAdExtensionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdExtensionsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateAdExtensionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdGroupCriterionsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupCriterionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdGroupCriterionsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupCriterionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdGroupsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdGroupsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateAdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateAdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateCampaignsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateCampaignsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateCampaignsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateCampaignsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateKeywordsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateKeywordsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateKeywordsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateKeywordsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateSitePlacementsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateSitePlacementsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateSitePlacementsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateSitePlacementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateTargetsInLibraryRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateTargetsInLibraryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateTargetsInLibraryResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.UpdateTargetsInLibraryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Ad");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Ad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdDistribution");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Address");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdEditorialStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdEditorialStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtension");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdExtension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionAssociation");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionAssociationCollection");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociationCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionEditorialReason");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionEditorialReasonCollection");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialReasonCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionEditorialStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionIdentity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdExtensionIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionIdToEntityIdAssociation");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdExtensionIdToEntityIdAssociation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdExtensionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionsTypeFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroup");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterion");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterionEditorialStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterionEditorialStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterionStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupNegativeKeywords");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdGroupNegativeKeywords.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupNegativeSites");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdGroupNegativeSites.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdGroupStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdRotation");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdRotation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdRotationType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdRotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AgeRange");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AgeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AgeTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AgeTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AgeTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AgeTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AppealStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AppealStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAd");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtension");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionAssociation");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionAssociation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionAssociationCollection");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionAssociationCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionEditorialReason");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionEditorialReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionEditorialReasonCollection");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionEditorialReasonCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionIdentity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionIdToEntityIdAssociation");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionIdToEntityIdAssociation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdGroup");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdGroupCriterion");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdGroupCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdGroupNegativeKeywords");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdGroupNegativeKeywords.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdGroupNegativeSites");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdGroupNegativeSites.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAgeTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfAgeTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfArrayOfPlacementDetail");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfArrayOfPlacementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfBatchError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfBatchError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfBMCStore");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfBMCStore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCampaign");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCampaignNegativeKeywords");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeKeywords.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCampaignNegativeSites");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeSites.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCityTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfCityTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCountryTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfCountryTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfDayTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfDayTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfDeviceOSTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfDeviceOSTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfDimension");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfDimension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfEditorialError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfEditorialError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfEditorialReason");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfEditorialReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfEditorialReasonCollection");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfEditorialReasonCollection.class;
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
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfGenderTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfGenderTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfHourTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfHourTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfKeyword");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfKeyword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfMedia");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfMedia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfMediaType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfMediaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfMetroAreaTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfMetroAreaTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfOperationError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfOperationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfPlacementDetail");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfPlacementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfProductCondition");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfProductCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfProductConditionCollection");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfProductConditionCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfRadiusTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfRadiusTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfSiteLink");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfSiteLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfSitePlacement");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfSitePlacement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfStateTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfStateTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfTargetInfo");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfTargetInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AssociationType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.AssociationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BatchError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.BatchError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Bid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Bid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BiddableAdGroupCriterion");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.BiddableAdGroupCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BiddingModel");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.BiddingModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BMCStore");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.BMCStore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BudgetLimitType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.BudgetLimitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BusinessGeoCodeStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.BusinessGeoCodeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CallAdExtension");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.CallAdExtension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Campaign");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Campaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignNegativeKeywords");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.CampaignNegativeKeywords.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignNegativeSites");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.CampaignNegativeSites.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.CampaignStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CityTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.CityTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CityTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.CityTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CountryTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.CountryTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CountryTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.CountryTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Criterion");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Criterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CriterionBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.CriterionBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CriterionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Date");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Day");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Day.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DayTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DayTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DayTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DayTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeviceOSTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeviceOSTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeviceOSTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DeviceOSTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Dimension");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Dimension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialApiFaultDetail");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.EditorialError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialReason");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.EditorialReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialReasonCollection");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.EditorialReasonCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EntityType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.EntityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "FixedBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.FixedBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GenderTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GenderTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GenderTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GenderTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GenderType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GeoPoint");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GeoPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "HourRange");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.HourRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "HourTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.HourTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "HourTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.HourTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Image");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Image.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ImpressionsPerDayRange");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ImpressionsPerDayRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Keyword");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Keyword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "KeywordEditorialStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.KeywordEditorialStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "KeywordStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.KeywordStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "LocationAdExtension");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.LocationAdExtension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "LocationTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.LocationTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "MatchType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.MatchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Media");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Media.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "MediaType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.MediaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "MetroAreaTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.MetroAreaTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "MetroAreaTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.MetroAreaTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "MobileAd");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.MobileAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Network");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Network.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "OperationError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.OperationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PlacementDetail");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.PlacementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PricingModel");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.PricingModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Product");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ProductAd");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ProductAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ProductAdExtension");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ProductAdExtension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ProductCondition");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ProductCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ProductConditionCollection");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ProductConditionCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "RadiusTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.RadiusTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "RadiusTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.RadiusTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SiteLink");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SiteLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SiteLinksAdExtension");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SiteLinksAdExtension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SitePlacement");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SitePlacement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SitePlacementStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.SitePlacementStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "StateTarget");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.StateTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "StateTargetBid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.StateTargetBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Target");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.Target.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "TargetInfo");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.TargetInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "TextAd");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.TextAd.class;
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

    public com.microsoft.bingads.v9.campaignmanagement.AddCampaignsResponse addCampaigns(com.microsoft.bingads.v9.campaignmanagement.AddCampaignsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.AddCampaignsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.AddCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.AddCampaignsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByAccountIdResponse getCampaignsByAccountId(com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByAccountIdRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByAccountIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByAccountIdResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsResponse getCampaignsByIds(com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetCampaignsByIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteCampaignsResponse deleteCampaigns(com.microsoft.bingads.v9.campaignmanagement.DeleteCampaignsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteCampaignsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteCampaignsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.UpdateCampaignsResponse updateCampaigns(com.microsoft.bingads.v9.campaignmanagement.UpdateCampaignsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateCampaignsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.UpdateCampaignsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByCampaignIdsResponse getNegativeKeywordsByCampaignIds(com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByCampaignIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetNegativeKeywordsByCampaignIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetNegativeKeywordsByCampaignIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByCampaignIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByCampaignIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByCampaignIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToCampaignsResponse setNegativeKeywordsToCampaigns(com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToCampaignsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetNegativeKeywordsToCampaigns");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetNegativeKeywordsToCampaigns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToCampaignsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToCampaignsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByCampaignIdsResponse getNegativeSitesByCampaignIds(com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByCampaignIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetNegativeSitesByCampaignIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetNegativeSitesByCampaignIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByCampaignIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByCampaignIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByCampaignIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToCampaignsResponse setNegativeSitesToCampaigns(com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToCampaignsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetNegativeSitesToCampaigns");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetNegativeSitesToCampaigns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToCampaignsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToCampaignsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToCampaignsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.AddAdGroupsResponse addAdGroups(com.microsoft.bingads.v9.campaignmanagement.AddAdGroupsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.AddAdGroupsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.AddAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.AddAdGroupsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupsResponse deleteAdGroups(com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByIdsResponse getAdGroupsByIds(com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByCampaignIdResponse getAdGroupsByCampaignId(com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByCampaignIdRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByCampaignIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByCampaignIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdGroupsByCampaignIdResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.SubmitAdGroupForApprovalResponse submitAdGroupForApproval(com.microsoft.bingads.v9.campaignmanagement.SubmitAdGroupForApprovalRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SubmitAdGroupForApproval");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubmitAdGroupForApproval"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.SubmitAdGroupForApprovalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.SubmitAdGroupForApprovalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.SubmitAdGroupForApprovalResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupsResponse updateAdGroups(com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateAdGroups");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAdGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByAdGroupIdsResponse getNegativeKeywordsByAdGroupIds(com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByAdGroupIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetNegativeKeywordsByAdGroupIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetNegativeKeywordsByAdGroupIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByAdGroupIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByAdGroupIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetNegativeKeywordsByAdGroupIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToAdGroupsResponse setNegativeKeywordsToAdGroups(com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToAdGroupsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetNegativeKeywordsToAdGroups");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetNegativeKeywordsToAdGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToAdGroupsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.SetNegativeKeywordsToAdGroupsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse getNegativeSitesByAdGroupIds(com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetNegativeSitesByAdGroupIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetNegativeSitesByAdGroupIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToAdGroupsResponse setNegativeSitesToAdGroups(com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToAdGroupsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetNegativeSitesToAdGroups");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetNegativeSitesToAdGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToAdGroupsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToAdGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.SetNegativeSitesToAdGroupsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.AddTargetsToLibraryResponse addTargetsToLibrary(com.microsoft.bingads.v9.campaignmanagement.AddTargetsToLibraryRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddTargetsToLibrary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddTargetsToLibrary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.AddTargetsToLibraryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.AddTargetsToLibraryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.AddTargetsToLibraryResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.UpdateTargetsInLibraryResponse updateTargetsInLibrary(com.microsoft.bingads.v9.campaignmanagement.UpdateTargetsInLibraryRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateTargetsInLibrary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateTargetsInLibrary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateTargetsInLibraryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateTargetsInLibraryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.UpdateTargetsInLibraryResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteTargetsFromLibraryResponse deleteTargetsFromLibrary(com.microsoft.bingads.v9.campaignmanagement.DeleteTargetsFromLibraryRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteTargetsFromLibrary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteTargetsFromLibrary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteTargetsFromLibraryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteTargetsFromLibraryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteTargetsFromLibraryResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetTargetsInfoFromLibraryResponse getTargetsInfoFromLibrary(com.microsoft.bingads.v9.campaignmanagement.GetTargetsInfoFromLibraryRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetTargetsInfoFromLibrary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetTargetsInfoFromLibrary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetTargetsInfoFromLibraryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetTargetsInfoFromLibraryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetTargetsInfoFromLibraryResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetTargetsByIdsResponse getTargetsByIds(com.microsoft.bingads.v9.campaignmanagement.GetTargetsByIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetTargetsByIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetTargetsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetTargetsByIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.SetTargetToAdGroupResponse setTargetToAdGroup(com.microsoft.bingads.v9.campaignmanagement.SetTargetToAdGroupRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetTargetToAdGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetTargetToAdGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.SetTargetToAdGroupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.SetTargetToAdGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.SetTargetToAdGroupResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromAdGroupResponse deleteTargetFromAdGroup(com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromAdGroupRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteTargetFromAdGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteTargetFromAdGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromAdGroupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromAdGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromAdGroupResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetTargetsByAdGroupIdsResponse getTargetsByAdGroupIds(com.microsoft.bingads.v9.campaignmanagement.GetTargetsByAdGroupIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetTargetsByAdGroupIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetTargetsByAdGroupIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetTargetsByAdGroupIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetTargetsByAdGroupIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetTargetsByAdGroupIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.SetTargetToCampaignResponse setTargetToCampaign(com.microsoft.bingads.v9.campaignmanagement.SetTargetToCampaignRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetTargetToCampaign");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetTargetToCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.SetTargetToCampaignResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.SetTargetToCampaignResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.SetTargetToCampaignResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromCampaignResponse deleteTargetFromCampaign(com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromCampaignRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteTargetFromCampaign");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteTargetFromCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromCampaignResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromCampaignResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteTargetFromCampaignResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetTargetsByCampaignIdsResponse getTargetsByCampaignIds(com.microsoft.bingads.v9.campaignmanagement.GetTargetsByCampaignIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetTargetsByCampaignIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetTargetsByCampaignIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetTargetsByCampaignIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetTargetsByCampaignIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetTargetsByCampaignIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.AddAdsResponse addAds(com.microsoft.bingads.v9.campaignmanagement.AddAdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddAds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddAds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.AddAdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.AddAdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.AddAdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteAdsResponse deleteAds(com.microsoft.bingads.v9.campaignmanagement.DeleteAdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteAds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteAdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteAdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteAdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdsByEditorialStatusResponse getAdsByEditorialStatus(com.microsoft.bingads.v9.campaignmanagement.GetAdsByEditorialStatusRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAdsByEditorialStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdsByEditorialStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdsByEditorialStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdsByEditorialStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdsByEditorialStatusResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdsByIdsResponse getAdsByIds(com.microsoft.bingads.v9.campaignmanagement.GetAdsByIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAdsByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdsByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdsByIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdsByIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdsByAdGroupIdResponse getAdsByAdGroupId(com.microsoft.bingads.v9.campaignmanagement.GetAdsByAdGroupIdRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAdsByAdGroupId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdsByAdGroupId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdsByAdGroupIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdsByAdGroupIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdsByAdGroupIdResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.UpdateAdsResponse updateAds(com.microsoft.bingads.v9.campaignmanagement.UpdateAdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateAds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateAdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateAdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.UpdateAdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.AddKeywordsResponse addKeywords(com.microsoft.bingads.v9.campaignmanagement.AddKeywordsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddKeywords");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddKeywords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.AddKeywordsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.AddKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.AddKeywordsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteKeywordsResponse deleteKeywords(com.microsoft.bingads.v9.campaignmanagement.DeleteKeywordsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteKeywords");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteKeywords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteKeywordsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteKeywordsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByEditorialStatusResponse getKeywordsByEditorialStatus(com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByEditorialStatusRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetKeywordsByEditorialStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordsByEditorialStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByEditorialStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByEditorialStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByEditorialStatusResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByIdsResponse getKeywordsByIds(com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetKeywordsByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordsByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByAdGroupIdResponse getKeywordsByAdGroupId(com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByAdGroupIdRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetKeywordsByAdGroupId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordsByAdGroupId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByAdGroupIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByAdGroupIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetKeywordsByAdGroupIdResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.UpdateKeywordsResponse updateKeywords(com.microsoft.bingads.v9.campaignmanagement.UpdateKeywordsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateKeywords");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateKeywords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateKeywordsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateKeywordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.UpdateKeywordsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.AppealEditorialRejectionsResponse appealEditorialRejections(com.microsoft.bingads.v9.campaignmanagement.AppealEditorialRejectionsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AppealEditorialRejections");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AppealEditorialRejections"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.AppealEditorialRejectionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.AppealEditorialRejectionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.AppealEditorialRejectionsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.AddSitePlacementsResponse addSitePlacements(com.microsoft.bingads.v9.campaignmanagement.AddSitePlacementsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddSitePlacements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddSitePlacements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.AddSitePlacementsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.AddSitePlacementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.AddSitePlacementsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteSitePlacementsResponse deleteSitePlacements(com.microsoft.bingads.v9.campaignmanagement.DeleteSitePlacementsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteSitePlacements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSitePlacements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteSitePlacementsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteSitePlacementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteSitePlacementsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByIdsResponse getSitePlacementsByIds(com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetSitePlacementsByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSitePlacementsByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByAdGroupIdResponse getSitePlacementsByAdGroupId(com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByAdGroupIdRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetSitePlacementsByAdGroupId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSitePlacementsByAdGroupId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByAdGroupIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByAdGroupIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetSitePlacementsByAdGroupIdResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.UpdateSitePlacementsResponse updateSitePlacements(com.microsoft.bingads.v9.campaignmanagement.UpdateSitePlacementsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateSitePlacements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateSitePlacements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateSitePlacementsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateSitePlacementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.UpdateSitePlacementsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetPlacementDetailsForUrlsResponse getPlacementDetailsForUrls(com.microsoft.bingads.v9.campaignmanagement.GetPlacementDetailsForUrlsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetPlacementDetailsForUrls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPlacementDetailsForUrls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetPlacementDetailsForUrlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetPlacementDetailsForUrlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetPlacementDetailsForUrlsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetEditorialReasonsByIdsResponse getEditorialReasonsByIds(com.microsoft.bingads.v9.campaignmanagement.GetEditorialReasonsByIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetEditorialReasonsByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetEditorialReasonsByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetEditorialReasonsByIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetEditorialReasonsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetEditorialReasonsByIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.AddAdExtensionsResponse addAdExtensions(com.microsoft.bingads.v9.campaignmanagement.AddAdExtensionsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddAdExtensions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddAdExtensions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.AddAdExtensionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.AddAdExtensionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.AddAdExtensionsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsByIdsResponse getAdExtensionsByIds(com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsByIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAdExtensionsByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdExtensionsByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsByIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsByIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.UpdateAdExtensionsResponse updateAdExtensions(com.microsoft.bingads.v9.campaignmanagement.UpdateAdExtensionsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateAdExtensions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAdExtensions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateAdExtensionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateAdExtensionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.UpdateAdExtensionsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsResponse deleteAdExtensions(com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteAdExtensions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAdExtensions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasons(com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsEditorialReasonsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAdExtensionsEditorialReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdExtensionsEditorialReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsEditorialReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsEditorialReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsEditorialReasonsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.SetAdExtensionsAssociationsResponse setAdExtensionsAssociations(com.microsoft.bingads.v9.campaignmanagement.SetAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetAdExtensionsAssociations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetAdExtensionsAssociations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.SetAdExtensionsAssociationsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.SetAdExtensionsAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.SetAdExtensionsAssociationsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsAssociationsResponse getAdExtensionsAssociations(com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAdExtensionsAssociations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdExtensionsAssociations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsAssociationsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionsAssociationsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsAssociationsResponse deleteAdExtensionsAssociations(com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteAdExtensionsAssociations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAdExtensionsAssociations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsAssociationsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsAssociationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteAdExtensionsAssociationsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionIdsByAccountIdResponse getAdExtensionIdsByAccountId(com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionIdsByAccountIdRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAdExtensionIdsByAccountId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdExtensionIdsByAccountId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionIdsByAccountIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionIdsByAccountIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdExtensionIdsByAccountIdResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.AddMediaResponse addMedia(com.microsoft.bingads.v9.campaignmanagement.AddMediaRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddMedia");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddMedia"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.AddMediaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.AddMediaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.AddMediaResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetMediaByIdsResponse getMediaByIds(com.microsoft.bingads.v9.campaignmanagement.GetMediaByIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetMediaByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMediaByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetMediaByIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetMediaByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetMediaByIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIds(com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAdGroupCriterionsByIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdGroupCriterionsByIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByIdsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByAdGroupIdResponse getAdGroupCriterionsByAdGroupId(com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByAdGroupIdRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAdGroupCriterionsByAdGroupId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdGroupCriterionsByAdGroupId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByAdGroupIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByAdGroupIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetAdGroupCriterionsByAdGroupIdResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.AddAdGroupCriterionsResponse addAdGroupCriterions(com.microsoft.bingads.v9.campaignmanagement.AddAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.AddAdGroupCriterionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.AddAdGroupCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.AddAdGroupCriterionsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupCriterionsResponse updateAdGroupCriterions(com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupCriterionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.UpdateAdGroupCriterionsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.EditorialApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupCriterionsResponse deleteAdGroupCriterions(com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupCriterionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupCriterionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DeleteAdGroupCriterionsResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.campaignmanagement.GetBMCStoresByCustomerIdResponse getBMCStoresByCustomerId(com.microsoft.bingads.v9.campaignmanagement.GetBMCStoresByCustomerIdRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBMCStoresByCustomerId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBMCStoresByCustomerId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetBMCStoresByCustomerIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetBMCStoresByCustomerIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetBMCStoresByCustomerIdResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
