/**
 * BasicHttpBinding_IReportingServiceStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class BasicHttpBinding_IReportingServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v11.reporting.IReportingService {
    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    public BasicHttpBinding_IReportingServiceStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public BasicHttpBinding_IReportingServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IReportingServiceStub(javax.xml.rpc.Service service) {
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
        oper.setName("SubmitGenerateReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SubmitGenerateReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", ">SubmitGenerateReportRequest"), com.microsoft.bingads.v11.reporting.SubmitGenerateReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", ">SubmitGenerateReportResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.reporting.SubmitGenerateReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SubmitGenerateReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.reporting.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ApiFaultDetail"),
                true
        ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PollGenerateReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "PollGenerateReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", ">PollGenerateReportRequest"), com.microsoft.bingads.v11.reporting.PollGenerateReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", ">PollGenerateReportResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.reporting.PollGenerateReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "PollGenerateReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ApiFaultDetail"),
                "com.microsoft.bingads.v11.reporting.ApiFaultDetail",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ApiFaultDetail"),
                true
        ));
        _operations[1] = oper;

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

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", ">PollGenerateReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.PollGenerateReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", ">PollGenerateReportResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.PollGenerateReportResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", ">SubmitGenerateReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SubmitGenerateReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", ">SubmitGenerateReportResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SubmitGenerateReportResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AccountPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AccountPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AccountPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountReportScope");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AccountReportScope.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountStatusReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountThroughAdGroupReportScope");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AccountThroughAdGroupReportScope.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountThroughCampaignReportScope");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AccountThroughCampaignReportScope.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdDistributionReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdDynamicTextPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdDynamicTextPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdDynamicTextPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdDynamicTextPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdDynamicTextPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdDynamicTextPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByAdReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionByAdReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByAdReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionByAdReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByAdReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionByAdReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByKeywordReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionByKeywordReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByKeywordReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionByKeywordReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByKeywordReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionByKeywordReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionDetailReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionDetailReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionDetailReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionDetailReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionDetailReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionDetailReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdGroupPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdGroupPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdGroupPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupReportScope");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdGroupReportScope.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupStatusReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdStatusReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdTypeReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AgeGenderDemographicReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AgeGenderDemographicReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AgeGenderDemographicReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AgeGenderDemographicReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AgeGenderDemographicReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AgeGenderDemographicReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ApiFaultDetail");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ApiFaultDetail.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfAccountPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AccountPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfAdDynamicTextPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdDynamicTextPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdDynamicTextPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdDynamicTextPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfAdExtensionByAdReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionByAdReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByAdReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByAdReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfAdExtensionByKeywordReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionByKeywordReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByKeywordReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionByKeywordReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfAdExtensionDetailReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdExtensionDetailReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionDetailReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdExtensionDetailReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfAdGroupPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdGroupPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfAdGroupReportScope");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdGroupReportScope[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupReportScope");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupReportScope");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfAdPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AdPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfAgeGenderDemographicReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AgeGenderDemographicReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AgeGenderDemographicReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AgeGenderDemographicReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfAudiencePerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AudiencePerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AudiencePerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AudiencePerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfBatchError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.BatchError[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BatchError");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BatchError");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfBudgetSummaryReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.BudgetSummaryReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BudgetSummaryReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BudgetSummaryReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfCallDetailReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.CallDetailReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CallDetailReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CallDetailReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfCampaignPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.CampaignPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfCampaignReportScope");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.CampaignReportScope[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignReportScope");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignReportScope");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfConversionPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ConversionPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ConversionPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ConversionPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfDestinationUrlPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DestinationUrlPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DestinationUrlPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DestinationUrlPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfDSAAutoTargetPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSAAutoTargetPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSAAutoTargetPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSAAutoTargetPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfDSACategoryPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSACategoryPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSACategoryPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSACategoryPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfDSASearchQueryPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSASearchQueryPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSASearchQueryPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSASearchQueryPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfGeographicPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.GeographicPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "GeographicPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "GeographicPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfGoalsAndFunnelsReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.GoalsAndFunnelsReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "GoalsAndFunnelsReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "GoalsAndFunnelsReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfKeywordPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.KeywordPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfKeywordPerformanceReportSort");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.KeywordPerformanceReportSort[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordPerformanceReportSort");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordPerformanceReportSort");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfNegativeKeywordConflictReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "NegativeKeywordConflictReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "NegativeKeywordConflictReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfOperationError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.OperationError[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "OperationError");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "OperationError");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfProductDimensionPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductDimensionPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductDimensionPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductDimensionPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfProductPartitionPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductPartitionPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductPartitionPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductPartitionPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfProductPartitionUnitPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductPartitionUnitPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductPartitionUnitPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductPartitionUnitPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfProductSearchQueryPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductSearchQueryPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductSearchQueryPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductSearchQueryPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfPublisherUsagePerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.PublisherUsagePerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "PublisherUsagePerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "PublisherUsagePerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfSearchCampaignChangeHistoryReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SearchCampaignChangeHistoryReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchCampaignChangeHistoryReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchCampaignChangeHistoryReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfSearchQueryPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SearchQueryPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchQueryPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchQueryPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfShareOfVoiceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ShareOfVoiceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ShareOfVoiceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ShareOfVoiceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ArrayOfUserLocationPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.UserLocationPerformanceReportColumn[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "UserLocationPerformanceReportColumn");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "UserLocationPerformanceReportColumn");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AudiencePerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AudiencePerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AudiencePerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AudiencePerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AudiencePerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.AudiencePerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BatchError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.BatchError.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BidMatchTypeReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BidStrategyTypeReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BudgetSummaryReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.BudgetSummaryReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BudgetSummaryReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.BudgetSummaryReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BudgetSummaryReportTime");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.BudgetSummaryReportTime.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BudgetSummaryReportTimePeriod");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.BudgetSummaryReportTimePeriod.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CallDetailReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.CallDetailReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CallDetailReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.CallDetailReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CallDetailReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.CallDetailReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.CampaignPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.CampaignPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.CampaignPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignReportScope");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.CampaignReportScope.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignStatusReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ChangeEntityReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ChangeTypeReportFilter");
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
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ConversionPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ConversionPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ConversionPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ConversionPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ConversionPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ConversionPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Date");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.Date.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeliveredMatchTypeReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DestinationUrlPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DestinationUrlPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DestinationUrlPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DestinationUrlPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DestinationUrlPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DestinationUrlPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeviceOSReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeviceTypeReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSAAutoTargetPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSAAutoTargetPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSAAutoTargetPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSAAutoTargetPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSAAutoTargetPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSAAutoTargetPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSACategoryPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSACategoryPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSACategoryPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSACategoryPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSACategoryPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSACategoryPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSASearchQueryPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSASearchQueryPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSASearchQueryPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSASearchQueryPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSASearchQueryPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.DSASearchQueryPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DynamicAdTargetStatusReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "GeographicPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.GeographicPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "GeographicPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.GeographicPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "GeographicPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.GeographicPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "GoalsAndFunnelsReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.GoalsAndFunnelsReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "GoalsAndFunnelsReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.GoalsAndFunnelsReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "GoalsAndFunnelsReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.GoalsAndFunnelsReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.KeywordPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.KeywordPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.KeywordPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordPerformanceReportSort");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.KeywordPerformanceReportSort.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordStatusReportFilter");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "NegativeKeywordConflictReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "NegativeKeywordConflictReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "NegativeKeywordConflictReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "NonHourlyReportAggregation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.NonHourlyReportAggregation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "OperationError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.OperationError.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductDimensionPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductDimensionPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductDimensionPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductDimensionPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductDimensionPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductDimensionPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductPartitionPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductPartitionPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductPartitionPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductPartitionPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductPartitionPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductPartitionPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductPartitionUnitPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductPartitionUnitPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductPartitionUnitPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductPartitionUnitPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductPartitionUnitPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductPartitionUnitPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductSearchQueryPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductSearchQueryPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductSearchQueryPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductSearchQueryPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ProductSearchQueryPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ProductSearchQueryPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "PublisherUsagePerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.PublisherUsagePerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "PublisherUsagePerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.PublisherUsagePerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "PublisherUsagePerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.PublisherUsagePerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportAggregation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ReportAggregation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportFormat");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ReportFormat.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportLanguage");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ReportLanguage.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportRequestStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ReportRequestStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportRequestStatusType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ReportRequestStatusType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportTime");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ReportTime.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportTimePeriod");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ReportTimePeriod.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchCampaignChangeHistoryReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SearchCampaignChangeHistoryReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchCampaignChangeHistoryReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SearchCampaignChangeHistoryReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchCampaignChangeHistoryReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SearchCampaignChangeHistoryReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchQueryPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SearchQueryPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchQueryPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SearchQueryPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchQueryPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SearchQueryPerformanceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SearchQueryReportAggregation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SearchQueryReportAggregation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ShareOfVoiceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ShareOfVoiceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ShareOfVoiceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ShareOfVoiceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ShareOfVoiceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.ShareOfVoiceReportRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "SortOrder");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.SortOrder.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "UserLocationPerformanceReportColumn");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.UserLocationPerformanceReportColumn.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "UserLocationPerformanceReportFilter");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.UserLocationPerformanceReportFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "UserLocationPerformanceReportRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.reporting.UserLocationPerformanceReportRequest.class;
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

    public com.microsoft.bingads.v11.reporting.SubmitGenerateReportResponse submitGenerateReport(com.microsoft.bingads.v11.reporting.SubmitGenerateReportRequest parameters) throws java.rmi.RemoteException {
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
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.reporting.SubmitGenerateReportResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.reporting.SubmitGenerateReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.reporting.SubmitGenerateReportResponse.class);
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
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.reporting.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.reporting.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.reporting.PollGenerateReportResponse pollGenerateReport(com.microsoft.bingads.v11.reporting.PollGenerateReportRequest parameters) throws java.rmi.RemoteException {
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
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.reporting.PollGenerateReportResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.reporting.PollGenerateReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.reporting.PollGenerateReportResponse.class);
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
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.reporting.ApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.reporting.ApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

}
