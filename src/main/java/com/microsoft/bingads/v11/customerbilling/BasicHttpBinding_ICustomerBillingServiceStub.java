/**
 * BasicHttpBinding_ICustomerBillingServiceStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customerbilling;

public class BasicHttpBinding_ICustomerBillingServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v11.customerbilling.ICustomerBillingService {
    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    public BasicHttpBinding_ICustomerBillingServiceStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public BasicHttpBinding_ICustomerBillingServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_ICustomerBillingServiceStub(javax.xml.rpc.Service service) {
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

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">AddInsertionOrderRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.AddInsertionOrderRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">AddInsertionOrderResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.AddInsertionOrderResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetAccountMonthlySpendRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetAccountMonthlySpendResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetBillingDocumentsInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetBillingDocumentsInfoResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetBillingDocumentsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetBillingDocumentsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetDisplayInvoicesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetDisplayInvoicesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetInsertionOrdersByAccountRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetInsertionOrdersByAccountResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetKOHIOInvoicesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetKOHIOInvoicesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">SearchInsertionOrdersRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">SearchInsertionOrdersResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">UpdateInsertionOrderRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">UpdateInsertionOrderResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfBillingDocument");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.BillingDocument[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "BillingDocument");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "BillingDocument");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfBillingDocumentInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.BillingDocumentInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "BillingDocumentInfo");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "BillingDocumentInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfInsertionOrder");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.InsertionOrder[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "InsertionOrder");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "InsertionOrder");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfOrderBy");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.OrderBy[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "OrderBy");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "OrderBy");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfPredicate");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.Predicate[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Predicate");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Predicate");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "BillingDocument");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.BillingDocument.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "BillingDocumentInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.BillingDocumentInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "DataType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.DataType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "InsertionOrder");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.InsertionOrder.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "InsertionOrderStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.InsertionOrderStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "OrderBy");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.OrderBy.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "OrderByField");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.OrderByField.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Paging");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.Paging.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Predicate");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.Predicate.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "PredicateOperator");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.PredicateOperator.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "SortOrder");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.SortOrder.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiBatchFault");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.exception.ApiFault.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ArrayOfBatchError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.exception.BatchError[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "BatchError");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "BatchError");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ArrayOfOperationError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.exception.OperationError[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "OperationError");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "OperationError");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "BatchError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.exception.BatchError.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "OperationError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.exception.OperationError.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBillingDocumentsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetBillingDocumentsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetBillingDocumentsInfoRequest"), com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetBillingDocumentsInfoResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetBillingDocumentsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiBatchFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiBatchFault"),
                true
        ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBillingDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetBillingDocumentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetBillingDocumentsRequest"), com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetBillingDocumentsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetBillingDocumentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiBatchFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiBatchFault"),
                true
        ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDisplayInvoices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetDisplayInvoicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetDisplayInvoicesRequest"), com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetDisplayInvoicesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetDisplayInvoicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiBatchFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiBatchFault"),
                true
        ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddInsertionOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "AddInsertionOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">AddInsertionOrderRequest"), com.microsoft.bingads.v11.customerbilling.AddInsertionOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">AddInsertionOrderResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customerbilling.AddInsertionOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "AddInsertionOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateInsertionOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "UpdateInsertionOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">UpdateInsertionOrderRequest"), com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">UpdateInsertionOrderResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "UpdateInsertionOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInsertionOrdersByAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetInsertionOrdersByAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetInsertionOrdersByAccountRequest"), com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetInsertionOrdersByAccountResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetInsertionOrdersByAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchInsertionOrders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "SearchInsertionOrdersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">SearchInsertionOrdersRequest"), com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">SearchInsertionOrdersResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "SearchInsertionOrdersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKOHIOInvoices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetKOHIOInvoicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetKOHIOInvoicesRequest"), com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetKOHIOInvoicesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetKOHIOInvoicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiBatchFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiBatchFault"),
                true
        ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountMonthlySpend");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetAccountMonthlySpendRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetAccountMonthlySpendRequest"), com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetAccountMonthlySpendResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "GetAccountMonthlySpendResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "ApiFault"),
                "com.microsoft.bingads.v11.customermanagement.exception.ApiFault",
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                "com.microsoft.bingads.v11.adapi.AdApiFaultDetail",
                new javax.xml.namespace.QName("https://adapi.microsoft.com", "AdApiFaultDetail"),
                true
        ));
        _operations[8] = oper;

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

    public com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoResponse getBillingDocumentsInfo(com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBillingDocumentsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBillingDocumentsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiFault) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsResponse getBillingDocuments(com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBillingDocuments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBillingDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiFault) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesResponse getDisplayInvoices(com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetDisplayInvoices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDisplayInvoices"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiFault) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.customerbilling.AddInsertionOrderResponse addInsertionOrder(com.microsoft.bingads.v11.customerbilling.AddInsertionOrderRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddInsertionOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddInsertionOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customerbilling.AddInsertionOrderResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customerbilling.AddInsertionOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customerbilling.AddInsertionOrderResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiFault) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderResponse updateInsertionOrder(com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateInsertionOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateInsertionOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiFault) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountResponse getInsertionOrdersByAccount(com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetInsertionOrdersByAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetInsertionOrdersByAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiFault) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersResponse searchInsertionOrders(com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SearchInsertionOrders");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchInsertionOrders"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiFault) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesResponse getKOHIOInvoices(com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetKOHIOInvoices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKOHIOInvoices"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiFault) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiBatchFault) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendResponse getAccountMonthlySpend(com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAccountMonthlySpend");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAccountMonthlySpend"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.customermanagement.exception.ApiFault) {
                    throw (com.microsoft.bingads.v11.customermanagement.exception.ApiFault) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof com.microsoft.bingads.v11.adapi.AdApiFaultDetail) {
                    throw (com.microsoft.bingads.v11.adapi.AdApiFaultDetail) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

}
