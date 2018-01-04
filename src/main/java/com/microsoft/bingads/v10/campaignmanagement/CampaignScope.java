/**
 * CampaignScope.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class CampaignScope implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(CampaignScope.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignScope"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("parentAccountId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ParentAccountId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long campaignId;
  private java.lang.Long parentAccountId;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public CampaignScope() {
  }

  public CampaignScope(
          java.lang.Long campaignId,
          java.lang.Long parentAccountId) {
    this.campaignId = campaignId;
    this.parentAccountId = parentAccountId;
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
   * Gets the campaignId value for this CampaignScope.
   *
   * @return campaignId
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the campaignId value for this CampaignScope.
   *
   * @param campaignId
   */
  public void setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Gets the parentAccountId value for this CampaignScope.
   *
   * @return parentAccountId
   */
  public java.lang.Long getParentAccountId() {
    return parentAccountId;
  }

  /**
   * Sets the parentAccountId value for this CampaignScope.
   *
   * @param parentAccountId
   */
  public void setParentAccountId(java.lang.Long parentAccountId) {
    this.parentAccountId = parentAccountId;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof CampaignScope)) return false;
    CampaignScope other = (CampaignScope) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.campaignId == null && other.getCampaignId() == null) ||
                    (this.campaignId != null &&
                            this.campaignId.equals(other.getCampaignId()))) &&
            ((this.parentAccountId == null && other.getParentAccountId() == null) ||
                    (this.parentAccountId != null &&
                            this.parentAccountId.equals(other.getParentAccountId())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getCampaignId() != null) {
      _hashCode += getCampaignId().hashCode();
    }
    if (getParentAccountId() != null) {
      _hashCode += getParentAccountId().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
