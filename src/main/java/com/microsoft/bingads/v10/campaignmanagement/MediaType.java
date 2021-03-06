/**
 * MediaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class MediaType implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(MediaType.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaType"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("dimensions");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Dimensions"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Dimension"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Dimension"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("name");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Name"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.Dimension[] dimensions;
  private java.lang.String name;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public MediaType() {
  }

  public MediaType(
          com.microsoft.bingads.v10.campaignmanagement.Dimension[] dimensions,
          java.lang.String name) {
    this.dimensions = dimensions;
    this.name = name;
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
   * Gets the dimensions value for this MediaType.
   *
   * @return dimensions
   */
  public com.microsoft.bingads.v10.campaignmanagement.Dimension[] getDimensions() {
    return dimensions;
  }

  /**
   * Sets the dimensions value for this MediaType.
   *
   * @param dimensions
   */
  public void setDimensions(com.microsoft.bingads.v10.campaignmanagement.Dimension[] dimensions) {
    this.dimensions = dimensions;
  }

  /**
   * Gets the name value for this MediaType.
   *
   * @return name
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the name value for this MediaType.
   *
   * @param name
   */
  public void setName(java.lang.String name) {
    this.name = name;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof MediaType)) return false;
    MediaType other = (MediaType) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.dimensions == null && other.getDimensions() == null) ||
                    (this.dimensions != null &&
                            java.util.Arrays.equals(this.dimensions, other.getDimensions()))) &&
            ((this.name == null && other.getName() == null) ||
                    (this.name != null &&
                            this.name.equals(other.getName())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getDimensions() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getDimensions());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getDimensions(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getName() != null) {
      _hashCode += getName().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
