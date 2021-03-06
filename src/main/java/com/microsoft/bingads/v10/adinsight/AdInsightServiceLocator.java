/**
 * AdInsightServiceLocator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class AdInsightServiceLocator extends org.apache.axis.client.Service implements com.microsoft.bingads.v10.adinsight.AdInsightService {

  // Use to get a proxy class for BasicHttpBinding_IAdInsightService
  private java.lang.String BasicHttpBinding_IAdInsightService_address = "https://adinsight.api.bingads.microsoft.com/Api/Advertiser/AdInsight/V10/AdInsightService.svc";
  // The WSDD service name defaults to the port name.
  private java.lang.String BasicHttpBinding_IAdInsightServiceWSDDServiceName = "BasicHttpBinding_IAdInsightService";
  private java.util.HashSet ports = null;

  public AdInsightServiceLocator() {
  }

  public AdInsightServiceLocator(org.apache.axis.EngineConfiguration config) {
    super(config);
  }

  public AdInsightServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
    super(wsdlLoc, sName);
  }

  public java.lang.String getBasicHttpBinding_IAdInsightServiceAddress() {
    return BasicHttpBinding_IAdInsightService_address;
  }

  public java.lang.String getBasicHttpBinding_IAdInsightServiceWSDDServiceName() {
    return BasicHttpBinding_IAdInsightServiceWSDDServiceName;
  }

  public void setBasicHttpBinding_IAdInsightServiceWSDDServiceName(java.lang.String name) {
    BasicHttpBinding_IAdInsightServiceWSDDServiceName = name;
  }

  public com.microsoft.bingads.v10.adinsight.IAdInsightService getBasicHttpBinding_IAdInsightService() throws javax.xml.rpc.ServiceException {
    java.net.URL endpoint;
    try {
      endpoint = new java.net.URL(BasicHttpBinding_IAdInsightService_address);
    } catch (java.net.MalformedURLException e) {
      throw new javax.xml.rpc.ServiceException(e);
    }
    return getBasicHttpBinding_IAdInsightService(endpoint);
  }

  public com.microsoft.bingads.v10.adinsight.IAdInsightService getBasicHttpBinding_IAdInsightService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
    try {
      com.microsoft.bingads.v10.adinsight.BasicHttpBinding_IAdInsightServiceStub _stub = new com.microsoft.bingads.v10.adinsight.BasicHttpBinding_IAdInsightServiceStub(portAddress, this);
      _stub.setPortName(getBasicHttpBinding_IAdInsightServiceWSDDServiceName());
      return _stub;
    } catch (org.apache.axis.AxisFault e) {
      return null;
    }
  }

  public void setBasicHttpBinding_IAdInsightServiceEndpointAddress(java.lang.String address) {
    BasicHttpBinding_IAdInsightService_address = address;
  }

  /**
   * For the given interface, get the stub implementation.
   * If this service has no port for the given interface,
   * then ServiceException is thrown.
   */
  public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
    try {
      if (com.microsoft.bingads.v10.adinsight.IAdInsightService.class.isAssignableFrom(serviceEndpointInterface)) {
        com.microsoft.bingads.v10.adinsight.BasicHttpBinding_IAdInsightServiceStub _stub = new com.microsoft.bingads.v10.adinsight.BasicHttpBinding_IAdInsightServiceStub(new java.net.URL(BasicHttpBinding_IAdInsightService_address), this);
        _stub.setPortName(getBasicHttpBinding_IAdInsightServiceWSDDServiceName());
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
    if ("BasicHttpBinding_IAdInsightService".equals(inputPortName)) {
      return getBasicHttpBinding_IAdInsightService();
    } else {
      java.rmi.Remote _stub = getPort(serviceEndpointInterface);
      ((org.apache.axis.client.Stub) _stub).setPortName(portName);
      return _stub;
    }
  }

  public javax.xml.namespace.QName getServiceName() {
    return new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "AdInsightService");
  }

  public java.util.Iterator getPorts() {
    if (ports == null) {
      ports = new java.util.HashSet();
      ports.add(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "BasicHttpBinding_IAdInsightService"));
    }
    return ports.iterator();
  }

  /**
   * Set the endpoint address for the specified port name.
   */
  public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

    if ("BasicHttpBinding_IAdInsightService".equals(portName)) {
      setBasicHttpBinding_IAdInsightServiceEndpointAddress(address);
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
