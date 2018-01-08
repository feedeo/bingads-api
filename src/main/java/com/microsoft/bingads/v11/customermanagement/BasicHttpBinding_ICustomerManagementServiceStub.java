/**
 * BasicHttpBinding_ICustomerManagementServiceStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class BasicHttpBinding_ICustomerManagementServiceStub extends org.apache.axis.client.Stub implements com.microsoft.bingads.v11.customermanagement.ICustomerManagementService {
    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[33];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    public BasicHttpBinding_ICustomerManagementServiceStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public BasicHttpBinding_ICustomerManagementServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_ICustomerManagementServiceStub(javax.xml.rpc.Service service) {
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
        oper.setName("GetAccountsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetAccountsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccountsInfoRequest"), com.microsoft.bingads.v11.customermanagement.GetAccountsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccountsInfoResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.GetAccountsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetAccountsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindAccounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "FindAccountsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">FindAccountsRequest"), com.microsoft.bingads.v11.customermanagement.FindAccountsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">FindAccountsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.FindAccountsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "FindAccountsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "AddAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddAccountRequest"), com.microsoft.bingads.v11.customermanagement.AddAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddAccountResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.AddAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "AddAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdateAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateAccountRequest"), com.microsoft.bingads.v11.customermanagement.UpdateAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateAccountResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.UpdateAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdateAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        oper.setName("GetCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetCustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomerRequest"), com.microsoft.bingads.v11.customermanagement.GetCustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomerResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.GetCustomerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetCustomerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        oper.setName("UpdateCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdateCustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateCustomerRequest"), com.microsoft.bingads.v11.customermanagement.UpdateCustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateCustomerResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.UpdateCustomerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdateCustomerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        oper.setName("SignupCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SignupCustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SignupCustomerRequest"), com.microsoft.bingads.v11.customermanagement.SignupCustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SignupCustomerResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.SignupCustomerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SignupCustomerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        oper.setName("GetAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccountRequest"), com.microsoft.bingads.v11.customermanagement.GetAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccountResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.GetAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomersInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetCustomersInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomersInfoRequest"), com.microsoft.bingads.v11.customermanagement.GetCustomersInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomersInfoResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.GetCustomersInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetCustomersInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "DeleteAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteAccountRequest"), com.microsoft.bingads.v11.customermanagement.DeleteAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteAccountResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.DeleteAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "DeleteAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "DeleteCustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteCustomerRequest"), com.microsoft.bingads.v11.customermanagement.DeleteCustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteCustomerResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.DeleteCustomerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "DeleteCustomerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdateUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateUserRequest"), com.microsoft.bingads.v11.customermanagement.UpdateUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateUserResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.UpdateUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdateUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateUserRoles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdateUserRolesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateUserRolesRequest"), com.microsoft.bingads.v11.customermanagement.UpdateUserRolesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateUserRolesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.UpdateUserRolesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdateUserRolesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetUserRequest"), com.microsoft.bingads.v11.customermanagement.GetUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetUserResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.GetUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurrentUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetCurrentUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCurrentUserRequest"), com.microsoft.bingads.v11.customermanagement.GetCurrentUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCurrentUserResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.GetCurrentUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetCurrentUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "DeleteUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteUserRequest"), com.microsoft.bingads.v11.customermanagement.DeleteUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteUserResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.DeleteUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "DeleteUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUsersInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetUsersInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetUsersInfoRequest"), com.microsoft.bingads.v11.customermanagement.GetUsersInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetUsersInfoResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.GetUsersInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetUsersInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomerPilotFeatures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetCustomerPilotFeaturesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomerPilotFeaturesRequest"), com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomerPilotFeaturesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetCustomerPilotFeaturesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPilotFeaturesCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetPilotFeaturesCountriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetPilotFeaturesCountriesRequest"), com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetPilotFeaturesCountriesResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetPilotFeaturesCountriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccessibleCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetAccessibleCustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccessibleCustomerRequest"), com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccessibleCustomerResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "GetAccessibleCustomerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindAccountsOrCustomersInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "FindAccountsOrCustomersInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">FindAccountsOrCustomersInfoRequest"), com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">FindAccountsOrCustomersInfoResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "FindAccountsOrCustomersInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpgradeCustomerToAgency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpgradeCustomerToAgencyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpgradeCustomerToAgencyRequest"), com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpgradeCustomerToAgencyResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpgradeCustomerToAgencyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddPrepayAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "AddPrepayAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddPrepayAccountRequest"), com.microsoft.bingads.v11.customermanagement.AddPrepayAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddPrepayAccountResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.AddPrepayAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "AddPrepayAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdatePrepayAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdatePrepayAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdatePrepayAccountRequest"), com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdatePrepayAccountResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdatePrepayAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MapCustomerIdToExternalCustomerId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "MapCustomerIdToExternalCustomerIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">MapCustomerIdToExternalCustomerIdRequest"), com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">MapCustomerIdToExternalCustomerIdResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "MapCustomerIdToExternalCustomerIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MapAccountIdToExternalAccountIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "MapAccountIdToExternalAccountIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">MapAccountIdToExternalAccountIdsRequest"), com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">MapAccountIdToExternalAccountIdsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "MapAccountIdToExternalAccountIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchCustomers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SearchCustomersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchCustomersRequest"), com.microsoft.bingads.v11.customermanagement.SearchCustomersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchCustomersResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.SearchCustomersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SearchCustomersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddClientLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "AddClientLinksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddClientLinksRequest"), com.microsoft.bingads.v11.customermanagement.AddClientLinksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddClientLinksResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.AddClientLinksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "AddClientLinksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateClientLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdateClientLinksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateClientLinksRequest"), com.microsoft.bingads.v11.customermanagement.UpdateClientLinksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateClientLinksResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.UpdateClientLinksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UpdateClientLinksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchClientLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SearchClientLinksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchClientLinksRequest"), com.microsoft.bingads.v11.customermanagement.SearchClientLinksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchClientLinksResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.SearchClientLinksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SearchClientLinksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[29] = oper;

    }

    private static void _initOperationDesc4() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchAccounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SearchAccountsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchAccountsRequest"), com.microsoft.bingads.v11.customermanagement.SearchAccountsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchAccountsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.SearchAccountsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SearchAccountsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendUserInvitation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SendUserInvitationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SendUserInvitationRequest"), com.microsoft.bingads.v11.customermanagement.SendUserInvitationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SendUserInvitationResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.SendUserInvitationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SendUserInvitationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchUserInvitations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SearchUserInvitationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchUserInvitationsRequest"), com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchUserInvitationsResponse"));
        oper.setReturnClass(com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "SearchUserInvitationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApiFault"),
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
        _operations[32] = oper;

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

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Account");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.Account.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AccountFinancialStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.AccountFinancialStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AccountInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.AccountInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AccountInfoWithCustomerData");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.AccountInfoWithCustomerData.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AccountLifeCycleStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.AccountLifeCycleStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AccountType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.AccountType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Address");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.Address.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AdvertiserAccount");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.AdvertiserAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ApplicationType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.ApplicationType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfAccount");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.Account[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Account");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Account");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfAccountInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.AccountInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AccountInfo");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AccountInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfAccountInfoWithCustomerData");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.AccountInfoWithCustomerData[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AccountInfoWithCustomerData");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AccountInfoWithCustomerData");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfClientLink");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.ClientLink[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ClientLink");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ClientLink");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfCustomer");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.Customer[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Customer");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Customer");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfCustomerInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.CustomerInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerInfo");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerInfo");
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

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfPilotFeature");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.PilotFeature[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "PilotFeature");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "PilotFeature");
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

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfUserInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.UserInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserInfo");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ArrayOfUserInvitation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.UserInvitation[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserInvitation");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserInvitation");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ClientLink");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.ClientLink.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ClientLinkStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.ClientLinkStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ContactInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.ContactInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CurrencyType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.CurrencyType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Customer");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.Customer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerFinancialStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.CustomerFinancialStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.CustomerInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerLifeCycleStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.CustomerLifeCycleStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "DateRange");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.DateRange.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "EmailFormat");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.EmailFormat.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Industry");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.Industry.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "LanguageType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.LanguageType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "LCID");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.LCID.class;
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

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "PaymentMethodType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.PaymentMethodType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "PersonName");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.PersonName.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "PilotFeature");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.PilotFeature.class;
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

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "SecretQuestion");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.SecretQuestion.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ServiceLevel");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.ServiceLevel.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "SortOrder");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.SortOrder.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "TimeZoneType");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.TimeZoneType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "User");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.User.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserInfo");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.UserInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserInvitation");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.UserInvitation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserLifeCycleStatus");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.UserLifeCycleStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserRole");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.entities.UserRole.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ApiFault");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.exception.ApiFault.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ArrayOfArrayOfOperationError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.exception.OperationError[][].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ArrayOfOperationError");
        qName2 = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "ArrayOfOperationError");
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

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Exception", "OperationError");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.exception.OperationError.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddAccountRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.AddAccountRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddAccountResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.AddAccountResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddClientLinksRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.AddClientLinksRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddClientLinksResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.AddClientLinksResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddPrepayAccountRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.AddPrepayAccountRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">AddPrepayAccountResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.AddPrepayAccountResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteAccountRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.DeleteAccountRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteAccountResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.DeleteAccountResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteCustomerRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.DeleteCustomerRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteCustomerResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.DeleteCustomerResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteUserRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.DeleteUserRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">DeleteUserResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.DeleteUserResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">FindAccountsOrCustomersInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">FindAccountsOrCustomersInfoResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">FindAccountsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.FindAccountsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">FindAccountsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.FindAccountsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccessibleCustomerRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccessibleCustomerResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccountRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetAccountRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccountResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetAccountResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccountsInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetAccountsInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccountsInfoResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetAccountsInfoResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCurrentUserRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetCurrentUserRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCurrentUserResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetCurrentUserResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomerPilotFeaturesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomerPilotFeaturesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomerRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetCustomerRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomerResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetCustomerResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomersInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetCustomersInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomersInfoResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetCustomersInfoResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetPilotFeaturesCountriesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetPilotFeaturesCountriesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetUserRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetUserRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetUserResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetUserResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetUsersInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetUsersInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetUsersInfoResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.GetUsersInfoResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">MapAccountIdToExternalAccountIdsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsRequest.class;
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
        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">MapAccountIdToExternalAccountIdsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">MapCustomerIdToExternalCustomerIdRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">MapCustomerIdToExternalCustomerIdResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchAccountsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SearchAccountsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchAccountsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SearchAccountsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchClientLinksRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SearchClientLinksRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchClientLinksResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SearchClientLinksResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchCustomersRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SearchCustomersRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchCustomersResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SearchCustomersResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchUserInvitationsRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchUserInvitationsResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SendUserInvitationRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SendUserInvitationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SendUserInvitationResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SendUserInvitationResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SignupCustomerRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SignupCustomerRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SignupCustomerResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.SignupCustomerResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateAccountRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdateAccountRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateAccountResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdateAccountResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateClientLinksRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdateClientLinksRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateClientLinksResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdateClientLinksResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateCustomerRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdateCustomerRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateCustomerResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdateCustomerResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdatePrepayAccountRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdatePrepayAccountResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateUserRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdateUserRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateUserResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdateUserResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateUserRolesRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdateUserRolesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateUserRolesResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpdateUserRolesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpgradeCustomerToAgencyRequest");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpgradeCustomerToAgencyResponse");
        cachedSerQNames.add(qName);
        cls = com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyResponse.class;
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

    public com.microsoft.bingads.v11.customermanagement.GetAccountsInfoResponse getAccountsInfo(com.microsoft.bingads.v11.customermanagement.GetAccountsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAccountsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAccountsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.GetAccountsInfoResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.GetAccountsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.GetAccountsInfoResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.FindAccountsResponse findAccounts(com.microsoft.bingads.v11.customermanagement.FindAccountsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FindAccounts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindAccounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.FindAccountsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.FindAccountsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.FindAccountsResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.AddAccountResponse addAccount(com.microsoft.bingads.v11.customermanagement.AddAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.AddAccountResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.AddAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.AddAccountResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.UpdateAccountResponse updateAccount(com.microsoft.bingads.v11.customermanagement.UpdateAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.UpdateAccountResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.UpdateAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.UpdateAccountResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.GetCustomerResponse getCustomer(com.microsoft.bingads.v11.customermanagement.GetCustomerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetCustomer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.GetCustomerResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.GetCustomerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.GetCustomerResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.UpdateCustomerResponse updateCustomer(com.microsoft.bingads.v11.customermanagement.UpdateCustomerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateCustomer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.UpdateCustomerResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.UpdateCustomerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.UpdateCustomerResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.SignupCustomerResponse signupCustomer(com.microsoft.bingads.v11.customermanagement.SignupCustomerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SignupCustomer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SignupCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.SignupCustomerResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.SignupCustomerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.SignupCustomerResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.GetAccountResponse getAccount(com.microsoft.bingads.v11.customermanagement.GetAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.GetAccountResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.GetAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.GetAccountResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.GetCustomersInfoResponse getCustomersInfo(com.microsoft.bingads.v11.customermanagement.GetCustomersInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetCustomersInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustomersInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.GetCustomersInfoResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.GetCustomersInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.GetCustomersInfoResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.DeleteAccountResponse deleteAccount(com.microsoft.bingads.v11.customermanagement.DeleteAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.DeleteAccountResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.DeleteAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.DeleteAccountResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.DeleteCustomerResponse deleteCustomer(com.microsoft.bingads.v11.customermanagement.DeleteCustomerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteCustomer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.DeleteCustomerResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.DeleteCustomerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.DeleteCustomerResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.UpdateUserResponse updateUser(com.microsoft.bingads.v11.customermanagement.UpdateUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.UpdateUserResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.UpdateUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.UpdateUserResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.UpdateUserRolesResponse updateUserRoles(com.microsoft.bingads.v11.customermanagement.UpdateUserRolesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateUserRoles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateUserRoles"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.UpdateUserRolesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.UpdateUserRolesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.UpdateUserRolesResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.GetUserResponse getUser(com.microsoft.bingads.v11.customermanagement.GetUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.GetUserResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.GetUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.GetUserResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.GetCurrentUserResponse getCurrentUser(com.microsoft.bingads.v11.customermanagement.GetCurrentUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetCurrentUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCurrentUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.GetCurrentUserResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.GetCurrentUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.GetCurrentUserResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.DeleteUserResponse deleteUser(com.microsoft.bingads.v11.customermanagement.DeleteUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.DeleteUserResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.DeleteUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.DeleteUserResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.GetUsersInfoResponse getUsersInfo(com.microsoft.bingads.v11.customermanagement.GetUsersInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetUsersInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetUsersInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.GetUsersInfoResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.GetUsersInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.GetUsersInfoResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesResponse getCustomerPilotFeatures(com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetCustomerPilotFeatures");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustomerPilotFeatures"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesResponse getPilotFeaturesCountries(com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetPilotFeaturesCountries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPilotFeaturesCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerResponse getAccessibleCustomer(com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetAccessibleCustomer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAccessibleCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoResponse findAccountsOrCustomersInfo(com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FindAccountsOrCustomersInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindAccountsOrCustomersInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyResponse upgradeCustomerToAgency(com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpgradeCustomerToAgency");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpgradeCustomerToAgency"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.AddPrepayAccountResponse addPrepayAccount(com.microsoft.bingads.v11.customermanagement.AddPrepayAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddPrepayAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddPrepayAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.AddPrepayAccountResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.AddPrepayAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.AddPrepayAccountResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountResponse updatePrepayAccount(com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdatePrepayAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdatePrepayAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdResponse mapCustomerIdToExternalCustomerId(com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("MapCustomerIdToExternalCustomerId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MapCustomerIdToExternalCustomerId"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsResponse mapAccountIdToExternalAccountIds(com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("MapAccountIdToExternalAccountIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MapAccountIdToExternalAccountIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.SearchCustomersResponse searchCustomers(com.microsoft.bingads.v11.customermanagement.SearchCustomersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SearchCustomers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchCustomers"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.SearchCustomersResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.SearchCustomersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.SearchCustomersResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.AddClientLinksResponse addClientLinks(com.microsoft.bingads.v11.customermanagement.AddClientLinksRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddClientLinks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddClientLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.AddClientLinksResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.AddClientLinksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.AddClientLinksResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.UpdateClientLinksResponse updateClientLinks(com.microsoft.bingads.v11.customermanagement.UpdateClientLinksRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateClientLinks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateClientLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.UpdateClientLinksResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.UpdateClientLinksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.UpdateClientLinksResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.SearchClientLinksResponse searchClientLinks(com.microsoft.bingads.v11.customermanagement.SearchClientLinksRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SearchClientLinks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchClientLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.SearchClientLinksResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.SearchClientLinksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.SearchClientLinksResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.SearchAccountsResponse searchAccounts(com.microsoft.bingads.v11.customermanagement.SearchAccountsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SearchAccounts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchAccounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.SearchAccountsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.SearchAccountsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.SearchAccountsResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.SendUserInvitationResponse sendUserInvitation(com.microsoft.bingads.v11.customermanagement.SendUserInvitationRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SendUserInvitation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SendUserInvitation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.SendUserInvitationResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.SendUserInvitationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.SendUserInvitationResponse.class);
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

    public com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsResponse searchUserInvitations(com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SearchUserInvitations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchUserInvitations"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsResponse.class);
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
