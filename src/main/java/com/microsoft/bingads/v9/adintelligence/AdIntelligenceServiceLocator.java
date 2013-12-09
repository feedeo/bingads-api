/**
 * AdIntelligenceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class AdIntelligenceServiceLocator extends org.apache.axis.client.Service implements com.microsoft.bingads.v9.adintelligence.AdIntelligenceService {

    public AdIntelligenceServiceLocator() {
    }


    public AdIntelligenceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdIntelligenceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IAdIntelligenceService
    private java.lang.String BasicHttpBinding_IAdIntelligenceService_address = "https://api.bingads.microsoft.com/Api/Advertiser/AdIntelligence/V9/AdIntelligenceService.svc";

    public java.lang.String getBasicHttpBinding_IAdIntelligenceServiceAddress() {
        return BasicHttpBinding_IAdIntelligenceService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IAdIntelligenceServiceWSDDServiceName = "BasicHttpBinding_IAdIntelligenceService";

    public java.lang.String getBasicHttpBinding_IAdIntelligenceServiceWSDDServiceName() {
        return BasicHttpBinding_IAdIntelligenceServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IAdIntelligenceServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IAdIntelligenceServiceWSDDServiceName = name;
    }

    public com.microsoft.bingads.v9.adintelligence.IAdIntelligenceService getBasicHttpBinding_IAdIntelligenceService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IAdIntelligenceService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IAdIntelligenceService(endpoint);
    }

    public com.microsoft.bingads.v9.adintelligence.IAdIntelligenceService getBasicHttpBinding_IAdIntelligenceService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.bingads.v9.adintelligence.BasicHttpBinding_IAdIntelligenceServiceStub _stub = new com.microsoft.bingads.v9.adintelligence.BasicHttpBinding_IAdIntelligenceServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IAdIntelligenceServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IAdIntelligenceServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IAdIntelligenceService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.microsoft.bingads.v9.adintelligence.IAdIntelligenceService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.bingads.v9.adintelligence.BasicHttpBinding_IAdIntelligenceServiceStub _stub = new com.microsoft.bingads.v9.adintelligence.BasicHttpBinding_IAdIntelligenceServiceStub(new java.net.URL(BasicHttpBinding_IAdIntelligenceService_address), this);
                _stub.setPortName(getBasicHttpBinding_IAdIntelligenceServiceWSDDServiceName());
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
        if ("BasicHttpBinding_IAdIntelligenceService".equals(inputPortName)) {
            return getBasicHttpBinding_IAdIntelligenceService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "AdIntelligenceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "BasicHttpBinding_IAdIntelligenceService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IAdIntelligenceService".equals(portName)) {
            setBasicHttpBinding_IAdIntelligenceServiceEndpointAddress(address);
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
