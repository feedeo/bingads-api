/**
 * KeywordLocation.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class KeywordLocation implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(KeywordLocation.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocation"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("device");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Device"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("location");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Location"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("percentage");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Percentage"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String device;
  private java.lang.String location;
  private java.lang.Double percentage;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public KeywordLocation() {
  }

  public KeywordLocation(
          java.lang.String device,
          java.lang.String location,
          java.lang.Double percentage) {
    this.device = device;
    this.location = location;
    this.percentage = percentage;
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
   * Gets the device value for this KeywordLocation.
   *
   * @return device
   */
  public java.lang.String getDevice() {
    return device;
  }

  /**
   * Sets the device value for this KeywordLocation.
   *
   * @param device
   */
  public void setDevice(java.lang.String device) {
    this.device = device;
  }

  /**
   * Gets the location value for this KeywordLocation.
   *
   * @return location
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Sets the location value for this KeywordLocation.
   *
   * @param location
   */
  public void setLocation(java.lang.String location) {
    this.location = location;
  }

  /**
   * Gets the percentage value for this KeywordLocation.
   *
   * @return percentage
   */
  public java.lang.Double getPercentage() {
    return percentage;
  }

  /**
   * Sets the percentage value for this KeywordLocation.
   *
   * @param percentage
   */
  public void setPercentage(java.lang.Double percentage) {
    this.percentage = percentage;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof KeywordLocation)) return false;
    KeywordLocation other = (KeywordLocation) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.device == null && other.getDevice() == null) ||
                    (this.device != null &&
                            this.device.equals(other.getDevice()))) &&
            ((this.location == null && other.getLocation() == null) ||
                    (this.location != null &&
                            this.location.equals(other.getLocation()))) &&
            ((this.percentage == null && other.getPercentage() == null) ||
                    (this.percentage != null &&
                            this.percentage.equals(other.getPercentage())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getDevice() != null) {
      _hashCode += getDevice().hashCode();
    }
    if (getLocation() != null) {
      _hashCode += getLocation().hashCode();
    }
    if (getPercentage() != null) {
      _hashCode += getPercentage().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
