/**
 * TargetInfo.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class TargetInfo implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(TargetInfo.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "TargetInfo"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("id");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Id"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("name");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Name"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long id;
  private java.lang.String name;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public TargetInfo() {
  }

  public TargetInfo(
          java.lang.Long id,
          java.lang.String name) {
    this.id = id;
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
   * Gets the id value for this TargetInfo.
   *
   * @return id
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the id value for this TargetInfo.
   *
   * @param id
   */
  public void setId(java.lang.Long id) {
    this.id = id;
  }

  /**
   * Gets the name value for this TargetInfo.
   *
   * @return name
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the name value for this TargetInfo.
   *
   * @param name
   */
  public void setName(java.lang.String name) {
    this.name = name;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof TargetInfo)) return false;
    TargetInfo other = (TargetInfo) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.id == null && other.getId() == null) ||
                    (this.id != null &&
                            this.id.equals(other.getId()))) &&
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
    if (getId() != null) {
      _hashCode += getId().hashCode();
    }
    if (getName() != null) {
      _hashCode += getName().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
