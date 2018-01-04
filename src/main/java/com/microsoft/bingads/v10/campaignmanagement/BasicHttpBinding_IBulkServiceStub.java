/**
 * BasicHttpBinding_IBulkServiceStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class BasicHttpBinding_IBulkServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v10.campaignmanagement.IBulkService {
  static org.apache.axis.description.OperationDesc[] _operations;

  static {
    _operations = new org.apache.axis.description.OperationDesc[5];
    _initOperationDesc1();
  }

  private java.util.Vector cachedSerClasses = new java.util.Vector();
  private java.util.Vector cachedSerQNames = new java.util.Vector();
  private java.util.Vector cachedSerFactories = new java.util.Vector();
  private java.util.Vector cachedDeserFactories = new java.util.Vector();

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

    qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    cachedSerQNames.add(qName);
    cls = long[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
    qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long");
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

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DownloadCampaignsByAccountIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DownloadCampaignsByAccountIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DownloadCampaignsByCampaignIdsRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DownloadCampaignsByCampaignIdsResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkDownloadStatusRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkDownloadStatusResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkUploadStatusRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkUploadStatusResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkUploadUrlRequest");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlRequest.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkUploadUrlResponse");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlResponse.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfBatchError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BatchError[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError");
    cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
    cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCampaignScope");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CampaignScope[].class;
    cachedSerClasses.add(cls);
    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignScope");
    qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignScope");
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

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.BatchError.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BulkDownloadEntity");
    cachedSerQNames.add(qName);
    cls = java.lang.String[].class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(simplelistsf);
    cachedDeserFactories.add(simplelistdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignScope");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CampaignScope.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CompressionType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.CompressionType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DataScope");
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

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DownloadFileType");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.DownloadFileType.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.EditorialError.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "OperationError");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.OperationError.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PerformanceStatsDateRange");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.PerformanceStatsDateRange.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(beansf);
    cachedDeserFactories.add(beandf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ReportTimePeriod");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ReportTimePeriod.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

    qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ResponseMode");
    cachedSerQNames.add(qName);
    cls = com.microsoft.bingads.v10.campaignmanagement.ResponseMode.class;
    cachedSerClasses.add(cls);
    cachedSerFactories.add(enumsf);
    cachedDeserFactories.add(enumdf);

  }

  private static void _initOperationDesc1() {
    org.apache.axis.description.OperationDesc oper;
    org.apache.axis.description.ParameterDesc param;
    oper = new org.apache.axis.description.OperationDesc();
    oper.setName("DownloadCampaignsByAccountIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DownloadCampaignsByAccountIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DownloadCampaignsByAccountIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DownloadCampaignsByAccountIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DownloadCampaignsByAccountIdsResponse"));
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
    oper.setName("DownloadCampaignsByCampaignIds");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DownloadCampaignsByCampaignIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DownloadCampaignsByCampaignIdsRequest"), com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DownloadCampaignsByCampaignIdsResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DownloadCampaignsByCampaignIdsResponse"));
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
    oper.setName("GetBulkDownloadStatus");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetBulkDownloadStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkDownloadStatusRequest"), com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkDownloadStatusResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetBulkDownloadStatusResponse"));
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
    oper.setName("GetBulkUploadUrl");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetBulkUploadUrlRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkUploadUrlRequest"), com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkUploadUrlResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetBulkUploadUrlResponse"));
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
    oper.setName("GetBulkUploadStatus");
    param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetBulkUploadStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkUploadStatusRequest"), com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusRequest.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkUploadStatusResponse"));
    oper.setReturnClass(com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusResponse.class);
    oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GetBulkUploadStatusResponse"));
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

  public com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsRequest parameters) throws java.rmi.RemoteException {
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
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsResponse.class);
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

  public com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsRequest parameters) throws java.rmi.RemoteException {
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
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsResponse.class);
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

  public com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusResponse getBulkDownloadStatus(com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusRequest parameters) throws java.rmi.RemoteException {
    if (super.cachedEndpoint == null) {
      throw new org.apache.axis.NoEndPointException();
    }
    org.apache.axis.client.Call _call = createCall();
    _call.setOperation(_operations[2]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("GetBulkDownloadStatus");
    _call.setEncodingStyle(null);
    _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
    _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new javax.xml.namespace.QName("", "GetBulkDownloadStatus"));

    setRequestHeaders(_call);
    setAttachments(_call);
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusResponse.class);
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

  public com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlResponse getBulkUploadUrl(com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlRequest parameters) throws java.rmi.RemoteException {
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
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlResponse.class);
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

  public com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusResponse getBulkUploadStatus(com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusRequest parameters) throws java.rmi.RemoteException {
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
    try {
      java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException) _resp;
      } else {
        extractAttachments(_call);
        try {
          return (com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusResponse) _resp;
        } catch (java.lang.Exception _exception) {
          return (com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusResponse.class);
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
