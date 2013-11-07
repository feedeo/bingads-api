/**
 * CustomerManagementServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class CustomerManagementServiceLocator extends org.apache.axis.client.Service implements com.microsoft.bingads.v9.customermanagement.CustomerManagementService {

    public CustomerManagementServiceLocator() {
    }


    public CustomerManagementServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerManagementServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ICustomerManagementService
    private java.lang.String BasicHttpBinding_ICustomerManagementService_address = "https://clientcenter.api.bingads.microsoft.com/Api/CustomerManagement/v9/CustomerManagementService.svc";

    public java.lang.String getBasicHttpBinding_ICustomerManagementServiceAddress() {
        return BasicHttpBinding_ICustomerManagementService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ICustomerManagementServiceWSDDServiceName = "BasicHttpBinding_ICustomerManagementService";

    public java.lang.String getBasicHttpBinding_ICustomerManagementServiceWSDDServiceName() {
        return BasicHttpBinding_ICustomerManagementServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_ICustomerManagementServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ICustomerManagementServiceWSDDServiceName = name;
    }

    public com.microsoft.bingads.v9.customermanagement.ICustomerManagementService getBasicHttpBinding_ICustomerManagementService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ICustomerManagementService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ICustomerManagementService(endpoint);
    }

    public com.microsoft.bingads.v9.customermanagement.ICustomerManagementService getBasicHttpBinding_ICustomerManagementService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.bingads.v9.customermanagement.BasicHttpBinding_ICustomerManagementServiceStub _stub = new com.microsoft.bingads.v9.customermanagement.BasicHttpBinding_ICustomerManagementServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ICustomerManagementServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ICustomerManagementServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ICustomerManagementService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.microsoft.bingads.v9.customermanagement.ICustomerManagementService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.bingads.v9.customermanagement.BasicHttpBinding_ICustomerManagementServiceStub _stub = new com.microsoft.bingads.v9.customermanagement.BasicHttpBinding_ICustomerManagementServiceStub(new java.net.URL(BasicHttpBinding_ICustomerManagementService_address), this);
                _stub.setPortName(getBasicHttpBinding_ICustomerManagementServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_ICustomerManagementService".equals(inputPortName)) {
            return getBasicHttpBinding_ICustomerManagementService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "CustomerManagementService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "BasicHttpBinding_ICustomerManagementService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ICustomerManagementService".equals(portName)) {
            setBasicHttpBinding_ICustomerManagementServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
