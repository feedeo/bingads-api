/**
 * BasicHttpBinding_IOptimizerServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public class BasicHttpBinding_IOptimizerServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v9.optimizer.IOptimizerService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBudgetOpportunities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetBudgetOpportunitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBudgetOpportunitiesRequest"), com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBudgetOpportunitiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetBudgetOpportunitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.optimizer.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBudgetLandscape");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetBudgetLandscapeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBudgetLandscapeRequest"), com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBudgetLandscapeResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetBudgetLandscapeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.optimizer.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBidOpportunities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetBidOpportunitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBidOpportunitiesRequest"), com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBidOpportunitiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetBidOpportunitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.optimizer.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeywordOpportunities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetKeywordOpportunitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetKeywordOpportunitiesRequest"), com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetKeywordOpportunitiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetKeywordOpportunitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.optimizer.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBroadMatchOpportunities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetBroadMatchOpportunitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBroadMatchOpportunitiesRequest"), com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBroadMatchOpportunitiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetBroadMatchOpportunitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.optimizer.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBroadMatchSearchQueries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetBroadMatchSearchQueriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBroadMatchSearchQueriesRequest"), com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBroadMatchSearchQueriesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "GetBroadMatchSearchQueriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.optimizer.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApplyOpportunityModifiers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApplyOpportunityModifiersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">ApplyOpportunityModifiersRequest"), com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">ApplyOpportunityModifiersResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApplyOpportunityModifiersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.optimizer.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApplyOpportunities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApplyOpportunitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">ApplyOpportunitiesRequest"), com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">ApplyOpportunitiesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApplyOpportunitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                      "com.microsoft.bingads.v9.adapi.AdApiFaultDetail",
                      new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"),
                      "com.microsoft.bingads.v9.optimizer.ApiFaultDetail",
                      new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail"), 
                      true
                     ));
        _operations[7] = oper;

    }

    public BasicHttpBinding_IOptimizerServiceStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_IOptimizerServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IOptimizerServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AppliedResult");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.AppliedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfAppliedResult");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.AppliedResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AppliedResult");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AppliedResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBidOpportunity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BidOpportunity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BidOpportunity");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BidOpportunity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBroadMatchOpportunity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BroadMatchOpportunity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchOpportunity");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchOpportunity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBroadMatchSearchQuery");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQuery[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQuery");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQuery");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBroadMatchSearchQueryKPI");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQueryKPI");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQueryKPI");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBudgetLandscapePoint");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BudgetLandscapePoint[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetLandscapePoint");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetLandscapePoint");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBudgetOpportunity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BudgetOpportunity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetOpportunity");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetOpportunity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBudgetPoint");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BudgetPoint[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPoint");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPoint");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfCampaignBudgetLandscape");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.CampaignBudgetLandscape[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CampaignBudgetLandscape");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CampaignBudgetLandscape");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfKeywordOpportunity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.KeywordOpportunity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "KeywordOpportunity");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "KeywordOpportunity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfOpportunityModifier");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.OpportunityModifier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "OpportunityModifier");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "OpportunityModifier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BidOpportunity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BidOpportunity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchAppliedResult");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BroadMatchAppliedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchOpportunity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BroadMatchOpportunity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchOpportunityModifier");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BroadMatchOpportunityModifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQuery");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQueryKPI");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetLandscapePoint");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BudgetLandscapePoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetOpportunity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BudgetOpportunity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPoint");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BudgetPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPointType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.BudgetPointType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CampaignBudgetLandscape");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.CampaignBudgetLandscape.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "KeywordOpportunity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.KeywordOpportunity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "Opportunity");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.Opportunity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "OpportunityAction");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.OpportunityAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "OpportunityModifier");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.entities.OpportunityModifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts", "BudgetLimitType");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.enums.BudgetLimitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">ApplyOpportunitiesRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">ApplyOpportunitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">ApplyOpportunityModifiersRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">ApplyOpportunityModifiersResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBidOpportunitiesRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBidOpportunitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBroadMatchOpportunitiesRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBroadMatchOpportunitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBroadMatchSearchQueriesRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBroadMatchSearchQueriesResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBudgetLandscapeRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBudgetLandscapeResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBudgetOpportunitiesRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBudgetOpportunitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetKeywordOpportunitiesRequest");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetKeywordOpportunitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.ApiFaultDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ArrayOfBatchError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.BatchError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "BatchError");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "BatchError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ArrayOfOperationError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.OperationError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "OperationError");
            qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "OperationError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "BatchError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.BatchError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "OperationError");
            cachedSerQNames.add(qName);
            cls = com.microsoft.bingads.v9.optimizer.OperationError.class;
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

    public com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesResponse getBudgetOpportunities(com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBudgetOpportunities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBudgetOpportunities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.optimizer.GetBudgetOpportunitiesResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.optimizer.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.optimizer.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeResponse getBudgetLandscape(com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBudgetLandscape");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBudgetLandscape"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.optimizer.GetBudgetLandscapeResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.optimizer.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.optimizer.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesResponse getBidOpportunities(com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBidOpportunities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBidOpportunities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.optimizer.GetBidOpportunitiesResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.optimizer.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.optimizer.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesResponse getKeywordOpportunities(com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetKeywordOpportunities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKeywordOpportunities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.optimizer.GetKeywordOpportunitiesResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.optimizer.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.optimizer.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesResponse getBroadMatchOpportunities(com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBroadMatchOpportunities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBroadMatchOpportunities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.optimizer.GetBroadMatchOpportunitiesResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.optimizer.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.optimizer.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesResponse getBroadMatchSearchQueries(com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBroadMatchSearchQueries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBroadMatchSearchQueries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.optimizer.GetBroadMatchSearchQueriesResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.optimizer.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.optimizer.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersResponse applyOpportunityModifiers(com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ApplyOpportunityModifiers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ApplyOpportunityModifiers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.optimizer.ApplyOpportunityModifiersResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.optimizer.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.optimizer.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesResponse applyOpportunities(com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.optimizer.ApiFaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ApplyOpportunities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ApplyOpportunities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v9.optimizer.ApplyOpportunitiesResponse.class);
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
        if (axisFaultException.detail instanceof com.microsoft.bingads.v9.optimizer.ApiFaultDetail) {
              throw (com.microsoft.bingads.v9.optimizer.ApiFaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
