/**
 * BulkServiceLocator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class BulkServiceLocator extends org.apache.axis.client.Service implements com.microsoft.bingads.v10.campaignmanagement.BulkService {

  // Use to get a proxy class for BasicHttpBinding_IBulkService
  private java.lang.String BasicHttpBinding_IBulkService_address = "https://bulk.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/V10/BulkService.svc";
  // The WSDD service name defaults to the port name.
  private java.lang.String BasicHttpBinding_IBulkServiceWSDDServiceName = "BasicHttpBinding_IBulkService";
  private java.util.HashSet ports = null;

  public BulkServiceLocator() {
  }

  public BulkServiceLocator(org.apache.axis.EngineConfiguration config) {
    super(config);
  }

  public BulkServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
    super(wsdlLoc, sName);
  }

  public java.lang.String getBasicHttpBinding_IBulkServiceAddress() {
    return BasicHttpBinding_IBulkService_address;
  }

  public java.lang.String getBasicHttpBinding_IBulkServiceWSDDServiceName() {
    return BasicHttpBinding_IBulkServiceWSDDServiceName;
  }

  public void setBasicHttpBinding_IBulkServiceWSDDServiceName(java.lang.String name) {
    BasicHttpBinding_IBulkServiceWSDDServiceName = name;
  }

  public com.microsoft.bingads.v10.campaignmanagement.IBulkService getBasicHttpBinding_IBulkService() throws javax.xml.rpc.ServiceException {
    java.net.URL endpoint;
    try {
      endpoint = new java.net.URL(BasicHttpBinding_IBulkService_address);
    } catch (java.net.MalformedURLException e) {
      throw new javax.xml.rpc.ServiceException(e);
    }
    return getBasicHttpBinding_IBulkService(endpoint);
  }

  public com.microsoft.bingads.v10.campaignmanagement.IBulkService getBasicHttpBinding_IBulkService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
    try {
      com.microsoft.bingads.v10.campaignmanagement.BasicHttpBinding_IBulkServiceStub _stub = new com.microsoft.bingads.v10.campaignmanagement.BasicHttpBinding_IBulkServiceStub(portAddress, this);
      _stub.setPortName(getBasicHttpBinding_IBulkServiceWSDDServiceName());
      return _stub;
    } catch (org.apache.axis.AxisFault e) {
      return null;
    }
  }

  public void setBasicHttpBinding_IBulkServiceEndpointAddress(java.lang.String address) {
    BasicHttpBinding_IBulkService_address = address;
  }

  /**
   * For the given interface, get the stub implementation.
   * If this service has no port for the given interface,
   * then ServiceException is thrown.
   */
  public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
    try {
      if (com.microsoft.bingads.v10.campaignmanagement.IBulkService.class.isAssignableFrom(serviceEndpointInterface)) {
        com.microsoft.bingads.v10.campaignmanagement.BasicHttpBinding_IBulkServiceStub _stub = new com.microsoft.bingads.v10.campaignmanagement.BasicHttpBinding_IBulkServiceStub(new java.net.URL(BasicHttpBinding_IBulkService_address), this);
        _stub.setPortName(getBasicHttpBinding_IBulkServiceWSDDServiceName());
        return _stub;
      }
    } catch (java.lang.Throwable t) {
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
    if ("BasicHttpBinding_IBulkService".equals(inputPortName)) {
      return getBasicHttpBinding_IBulkService();
    } else {
      java.rmi.Remote _stub = getPort(serviceEndpointInterface);
      ((org.apache.axis.client.Stub) _stub).setPortName(portName);
      return _stub;
    }
  }

  public javax.xml.namespace.QName getServiceName() {
    return new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BulkService");
  }

  public java.util.Iterator getPorts() {
    if (ports == null) {
      ports = new java.util.HashSet();
      ports.add(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BasicHttpBinding_IBulkService"));
    }
    return ports.iterator();
  }

  /**
   * Set the endpoint address for the specified port name.
   */
  public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

    if ("BasicHttpBinding_IBulkService".equals(portName)) {
      setBasicHttpBinding_IBulkServiceEndpointAddress(address);
    } else { // Unknown Port Name
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
