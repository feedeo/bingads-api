/**
 * ShoppingSetting.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class ShoppingSetting extends com.microsoft.bingads.v10.campaignmanagement.Setting implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(ShoppingSetting.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ShoppingSetting"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("priority");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Priority"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("salesCountryCode");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SalesCountryCode"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("storeId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "StoreId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Integer priority;
  private java.lang.String salesCountryCode;
  private java.lang.Long storeId;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public ShoppingSetting() {
  }

  public ShoppingSetting(
          java.lang.String type,
          java.lang.Integer priority,
          java.lang.String salesCountryCode,
          java.lang.Long storeId) {
    super(
            type);
    this.priority = priority;
    this.salesCountryCode = salesCountryCode;
    this.storeId = storeId;
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
   * Gets the priority value for this ShoppingSetting.
   *
   * @return priority
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Sets the priority value for this ShoppingSetting.
   *
   * @param priority
   */
  public void setPriority(java.lang.Integer priority) {
    this.priority = priority;
  }

  /**
   * Gets the salesCountryCode value for this ShoppingSetting.
   *
   * @return salesCountryCode
   */
  public java.lang.String getSalesCountryCode() {
    return salesCountryCode;
  }

  /**
   * Sets the salesCountryCode value for this ShoppingSetting.
   *
   * @param salesCountryCode
   */
  public void setSalesCountryCode(java.lang.String salesCountryCode) {
    this.salesCountryCode = salesCountryCode;
  }

  /**
   * Gets the storeId value for this ShoppingSetting.
   *
   * @return storeId
   */
  public java.lang.Long getStoreId() {
    return storeId;
  }

  /**
   * Sets the storeId value for this ShoppingSetting.
   *
   * @param storeId
   */
  public void setStoreId(java.lang.Long storeId) {
    this.storeId = storeId;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof ShoppingSetting)) return false;
    ShoppingSetting other = (ShoppingSetting) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.priority == null && other.getPriority() == null) ||
                    (this.priority != null &&
                            this.priority.equals(other.getPriority()))) &&
            ((this.salesCountryCode == null && other.getSalesCountryCode() == null) ||
                    (this.salesCountryCode != null &&
                            this.salesCountryCode.equals(other.getSalesCountryCode()))) &&
            ((this.storeId == null && other.getStoreId() == null) ||
                    (this.storeId != null &&
                            this.storeId.equals(other.getStoreId())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getPriority() != null) {
      _hashCode += getPriority().hashCode();
    }
    if (getSalesCountryCode() != null) {
      _hashCode += getSalesCountryCode().hashCode();
    }
    if (getStoreId() != null) {
      _hashCode += getStoreId().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
