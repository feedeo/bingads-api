/**
 * AppUrl.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.datacontracts;

public class AppUrl implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AppUrl.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "AppUrl"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("osType");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "OsType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("url");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "Url"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String osType;
  private java.lang.String url;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AppUrl() {
  }

  public AppUrl(
          java.lang.String osType,
          java.lang.String url) {
    this.osType = osType;
    this.url = url;
  }

  /**
   * Return type metadata object
   */
  public static org.apache.axis.description.TypeDesc getTypeDesc() {
    return typeDesc;
  }

  /**
   * Get Custom Serializer
   */
  public static org.apache.axis.encoding.Serializer getSerializer(
          java.lang.String mechType,
          java.lang.Class _javaType,
          javax.xml.namespace.QName _xmlType) {
    return
            new org.apache.axis.encoding.ser.BeanSerializer(
                    _javaType, _xmlType, typeDesc);
  }

  /**
   * Get Custom Deserializer
   */
  public static org.apache.axis.encoding.Deserializer getDeserializer(
          java.lang.String mechType,
          java.lang.Class _javaType,
          javax.xml.namespace.QName _xmlType) {
    return
            new org.apache.axis.encoding.ser.BeanDeserializer(
                    _javaType, _xmlType, typeDesc);
  }

  /**
   * Gets the osType value for this AppUrl.
   *
   * @return osType
   */
  public java.lang.String getOsType() {
    return osType;
  }

  /**
   * Sets the osType value for this AppUrl.
   *
   * @param osType
   */
  public void setOsType(java.lang.String osType) {
    this.osType = osType;
  }

  /**
   * Gets the url value for this AppUrl.
   *
   * @return url
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Sets the url value for this AppUrl.
   *
   * @param url
   */
  public void setUrl(java.lang.String url) {
    this.url = url;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AppUrl)) return false;
    AppUrl other = (AppUrl) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.osType == null && other.getOsType() == null) ||
                    (this.osType != null &&
                            this.osType.equals(other.getOsType()))) &&
            ((this.url == null && other.getUrl() == null) ||
                    (this.url != null &&
                            this.url.equals(other.getUrl())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getOsType() != null) {
      _hashCode += getOsType().hashCode();
    }
    if (getUrl() != null) {
      _hashCode += getUrl().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
