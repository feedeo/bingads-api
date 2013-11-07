/**
 * BasicHttpBinding_IBulkServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class BasicHttpBinding_IBulkServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v9.campaignmanagement.IBulkService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DownloadCampaignsByAccountIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DownloadCampaignsByAccountIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DownloadCampaignsByAccountIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DownloadCampaignsByAccountIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DownloadCampaignsByAccountIdsResponse"));
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
        oper.setName("DownloadCampaignsByCampaignIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DownloadCampaignsByCampaignIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DownloadCampaignsByCampaignIdsRequest"), com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DownloadCampaignsByCampaignIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DownloadCampaignsByCampaignIdsResponse"));
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
        oper.setName("GetDownloadStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetDownloadStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetDownloadStatusRequest"), com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetDownloadStatusResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetDownloadStatusResponse"));
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
        oper.setName("GetBulkUploadUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetBulkUploadUrlRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBulkUploadUrlRequest"), com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBulkUploadUrlResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetBulkUploadUrlResponse"));
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
        oper.setName("GetBulkUploadStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetBulkUploadStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBulkUploadStatusRequest"), com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBulkUploadStatusResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GetBulkUploadStatusResponse"));
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

    }

    public BasicHttpBinding_IBulkServiceStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_IBulkServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IBulkServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.schemas.arrays.ArrayOflong.class;
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

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DownloadCampaignsByAccountIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DownloadCampaignsByAccountIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DownloadCampaignsByCampaignIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DownloadCampaignsByCampaignIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBulkUploadStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBulkUploadStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBulkUploadUrlRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBulkUploadUrlResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetDownloadStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetDownloadStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfBatchError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfBatchError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCampaignScope");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfOperationError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ArrayOfOperationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BatchError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.BatchError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BulkDownloadEntity");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignScope");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.CampaignScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DataScope");
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

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DownloadFileType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.DownloadFileType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.EditorialError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "OperationError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.OperationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PerformanceStatsDateRange");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.PerformanceStatsDateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ReportTimePeriod");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ReportTimePeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ResponseMode");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.campaignmanagement.ResponseMode.class;
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

    public com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DownloadCampaignsByAccountIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DownloadCampaignsByAccountIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsResponse.class);
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

    public com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DownloadCampaignsByCampaignIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DownloadCampaignsByCampaignIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsResponse.class);
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

    public com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusResponse getDownloadStatus(com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetDownloadStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDownloadStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusResponse.class);
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

    public com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlResponse getBulkUploadUrl(com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBulkUploadUrl");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBulkUploadUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlResponse.class);
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

    public com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusResponse getBulkUploadStatus(com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBulkUploadStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBulkUploadStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusResponse.class);
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
