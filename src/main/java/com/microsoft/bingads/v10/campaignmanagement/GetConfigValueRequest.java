/**
 * GetConfigValueRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetConfigValueRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetConfigValueRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetConfigValueRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("configKey");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ConfigKey"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String configKey;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetConfigValueRequest() {
  }

  public GetConfigValueRequest(
          java.lang.String configKey) {
    this.configKey = configKey;
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
   * Gets the configKey value for this GetConfigValueRequest.
   *
   * @return configKey
   */
  public java.lang.String getConfigKey() {
    return configKey;
  }

  /**
   * Sets the configKey value for this GetConfigValueRequest.
   *
   * @param configKey
   */
  public void setConfigKey(java.lang.String configKey) {
    this.configKey = configKey;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetConfigValueRequest)) return false;
    GetConfigValueRequest other = (GetConfigValueRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.configKey == null && other.getConfigKey() == null) ||
                    (this.configKey != null &&
                            this.configKey.equals(other.getConfigKey())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getConfigKey() != null) {
      _hashCode += getConfigKey().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
