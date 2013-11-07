/**
 * BasicHttpBinding_IReportingServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class BasicHttpBinding_IReportingServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v9.reporting.IReportingService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubmitGenerateReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SubmitGenerateReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", ">SubmitGenerateReportRequest"), com.microsoft.bingads.v9.reporting.SubmitGenerateReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", ">SubmitGenerateReportResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.reporting.SubmitGenerateReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SubmitGenerateReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.reporting.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PollGenerateReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "PollGenerateReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", ">PollGenerateReportRequest"), com.microsoft.bingads.v9.reporting.PollGenerateReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", ">PollGenerateReportResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.reporting.PollGenerateReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "PollGenerateReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.reporting.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[1] = oper;

    }

    public BasicHttpBinding_IReportingServiceStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_IReportingServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IReportingServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int");
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
            cls = com.microsoft.bingads.v9.adapi.AdApiError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiError");
            qName2 = new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", ">PollGenerateReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.PollGenerateReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", ">PollGenerateReportResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.PollGenerateReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", ">SubmitGenerateReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SubmitGenerateReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", ">SubmitGenerateReportResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SubmitGenerateReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AccountPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AccountPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AccountPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountReportScope");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AccountReportScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountThroughAdGroupReportScope");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AccountThroughAdGroupReportScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountThroughCampaignReportScope");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AccountThroughCampaignReportScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDistributionReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDynamicTextPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdDynamicTextPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDynamicTextPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdDynamicTextPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDynamicTextPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdDynamicTextPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByAdReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionByAdReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByAdReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionByAdReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByAdReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionByAdReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByKeywordReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionByKeywordReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByKeywordReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionByKeywordReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByKeywordReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionByKeywordReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdGroupPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdGroupPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdGroupPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupReportScope");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdGroupReportScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupStatusReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdStatusReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdTypeReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AgeGenderDemographicReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AgeGenderDemographicReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AgeGenderDemographicReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AgeGenderDemographicReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AgeGenderDemographicReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AgeGenderDemographicReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ApiFaultDetail");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ApiFaultDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAccountPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AccountPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdDynamicTextPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdDynamicTextPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDynamicTextPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDynamicTextPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdExtensionByAdReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionByAdReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByAdReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByAdReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdExtensionByKeywordReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionByKeywordReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByKeywordReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByKeywordReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdExtensionDimensionReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdGroupPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdGroupPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdGroupReportScope");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdGroupReportScope[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupReportScope");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupReportScope");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AdPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAgeGenderDemographicReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.AgeGenderDemographicReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AgeGenderDemographicReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AgeGenderDemographicReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfBatchError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.BatchError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BatchError");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BatchError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfBudgetSummaryReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.BudgetSummaryReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfCallDetailReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.CallDetailReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CallDetailReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CallDetailReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfCampaignPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.CampaignPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfCampaignReportScope");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.CampaignReportScope[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignReportScope");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignReportScope");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfConversionPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ConversionPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ConversionPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ConversionPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfDestinationUrlPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.DestinationUrlPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DestinationUrlPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DestinationUrlPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfGeographicalLocationReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.GeographicalLocationReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GeographicalLocationReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GeographicalLocationReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfGoalsAndFunnelsReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.GoalsAndFunnelsReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfKeywordPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfKeywordPerformanceReportSort");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.KeywordPerformanceReportSort[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportSort");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportSort");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfNegativeKeywordConflictReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.NegativeKeywordConflictReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "NegativeKeywordConflictReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "NegativeKeywordConflictReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfOperationError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.OperationError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "OperationError");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "OperationError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfProductTargetPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ProductTargetPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ProductTargetPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ProductTargetPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfPublisherUsagePerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.PublisherUsagePerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "PublisherUsagePerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "PublisherUsagePerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfRichAdComponentPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.RichAdComponentPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfSearchCampaignChangeHistoryReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SearchCampaignChangeHistoryReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchCampaignChangeHistoryReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchCampaignChangeHistoryReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfSearchQueryPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SearchQueryPerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryPerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryPerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfShareOfVoiceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ShareOfVoiceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ShareOfVoiceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ShareOfVoiceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfSitePerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SitePerformanceReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SitePerformanceReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SitePerformanceReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfTacticChannelReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.TacticChannelReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfTrafficSourcesReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.TrafficSourcesReportColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TrafficSourcesReportColumn");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TrafficSourcesReportColumn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BatchError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.BatchError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BidMatchTypeReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.BudgetSummaryReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.BudgetSummaryReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportTime");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.BudgetSummaryReportTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportTimePeriod");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.BudgetSummaryReportTimePeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CallDetailReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.CallDetailReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CallDetailReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.CallDetailReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.CampaignPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.CampaignPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.CampaignPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignReportScope");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.CampaignReportScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignStatusReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ChangeEntityReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ChangeTypeReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ComponentTypeFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ConversionPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ConversionPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ConversionPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ConversionPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ConversionPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ConversionPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Date");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeliveredMatchTypeReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DestinationUrlPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.DestinationUrlPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DestinationUrlPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.DestinationUrlPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DestinationUrlPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.DestinationUrlPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeviceOSReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

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
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeviceTypeReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GeographicalLocationReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.GeographicalLocationReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GeographicalLocationReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.GeographicalLocationReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GeographicalLocationReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.GeographicalLocationReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.GoalsAndFunnelsReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.GoalsAndFunnelsReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.GoalsAndFunnelsReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.KeywordPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.KeywordPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportSort");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.KeywordPerformanceReportSort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "NegativeKeywordConflictReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.NegativeKeywordConflictReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "NegativeKeywordConflictReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.NegativeKeywordConflictReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "NonHourlyReportAggregation");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.NonHourlyReportAggregation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "OperationError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.OperationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "PricingModelReportFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ProductTargetPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ProductTargetPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ProductTargetPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ProductTargetPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ProductTargetPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ProductTargetPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "PublisherUsagePerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.PublisherUsagePerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "PublisherUsagePerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.PublisherUsagePerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "PublisherUsagePerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.PublisherUsagePerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportAggregation");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ReportAggregation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportFormat");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ReportFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportLanguage");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ReportLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportRequestStatus");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ReportRequestStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportRequestStatusType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ReportRequestStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportTime");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ReportTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportTimePeriod");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ReportTimePeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.RichAdComponentPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.RichAdComponentPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.RichAdComponentPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdSubTypeFilter");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchCampaignChangeHistoryReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SearchCampaignChangeHistoryReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchCampaignChangeHistoryReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SearchCampaignChangeHistoryReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchCampaignChangeHistoryReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SearchCampaignChangeHistoryReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryPerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SearchQueryPerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryPerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SearchQueryPerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryPerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SearchQueryPerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryReportAggregation");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SearchQueryReportAggregation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ShareOfVoiceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ShareOfVoiceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ShareOfVoiceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ShareOfVoiceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ShareOfVoiceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.ShareOfVoiceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SitePerformanceReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SitePerformanceReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SitePerformanceReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SitePerformanceReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SitePerformanceReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SitePerformanceReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.TacticChannelReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.TacticChannelReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.TacticChannelReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TrafficSourcesReportColumn");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.TrafficSourcesReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TrafficSourcesReportFilter");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.TrafficSourcesReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TrafficSourcesReportRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.reporting.TrafficSourcesReportRequest.class;
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

    public com.microsoft.bingads.v9.reporting.SubmitGenerateReportResponse submitGenerateReport(com.microsoft.bingads.v9.reporting.SubmitGenerateReportRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.reporting.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SubmitGenerateReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubmitGenerateReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.reporting.SubmitGenerateReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.reporting.SubmitGenerateReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.reporting.SubmitGenerateReportResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.reporting.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.reporting.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.reporting.PollGenerateReportResponse pollGenerateReport(com.microsoft.bingads.v9.reporting.PollGenerateReportRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.reporting.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PollGenerateReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PollGenerateReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.reporting.PollGenerateReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.reporting.PollGenerateReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.reporting.PollGenerateReportResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.reporting.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.reporting.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
