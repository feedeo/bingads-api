/**
 * OptimizerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public class OptimizerServiceLocator extends org.apache.axis.client.Service implements com.microsoft.bingads.v9.optimizer.OptimizerService {

    public OptimizerServiceLocator() {
    }


    public OptimizerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OptimizerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IOptimizerService
    private java.lang.String BasicHttpBinding_IOptimizerService_address = "https://api.bingads.microsoft.com/Api/Advertiser/Optimizer/V9/OptimizerService.svc";

    public java.lang.String getBasicHttpBinding_IOptimizerServiceAddress() {
        return BasicHttpBinding_IOptimizerService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IOptimizerServiceWSDDServiceName = "BasicHttpBinding_IOptimizerService";

    public java.lang.String getBasicHttpBinding_IOptimizerServiceWSDDServiceName() {
        return BasicHttpBinding_IOptimizerServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IOptimizerServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IOptimizerServiceWSDDServiceName = name;
    }

    public com.microsoft.bingads.v9.optimizer.IOptimizerService getBasicHttpBinding_IOptimizerService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IOptimizerService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IOptimizerService(endpoint);
    }

    public com.microsoft.bingads.v9.optimizer.IOptimizerService getBasicHttpBinding_IOptimizerService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.bingads.v9.optimizer.BasicHttpBinding_IOptimizerServiceStub _stub = new com.microsoft.bingads.v9.optimizer.BasicHttpBinding_IOptimizerServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IOptimizerServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IOptimizerServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IOptimizerService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.microsoft.bingads.v9.optimizer.IOptimizerService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.bingads.v9.optimizer.BasicHttpBinding_IOptimizerServiceStub _stub = new com.microsoft.bingads.v9.optimizer.BasicHttpBinding_IOptimizerServiceStub(new java.net.URL(BasicHttpBinding_IOptimizerService_address), this);
                _stub.setPortName(getBasicHttpBinding_IOptimizerServiceWSDDServiceName());
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
        if ("BasicHttpBinding_IOptimizerService".equals(inputPortName)) {
            return getBasicHttpBinding_IOptimizerService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "OptimizerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "BasicHttpBinding_IOptimizerService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IOptimizerService".equals(portName)) {
            setBasicHttpBinding_IOptimizerServiceEndpointAddress(address);
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
