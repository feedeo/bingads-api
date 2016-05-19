/**
 * GenderTargetBid.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GenderTargetBid implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GenderTargetBid.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderTargetBid"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("bidAdjustment");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BidAdjustment"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("gender");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Gender"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderType"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private int bidAdjustment;
  private com.microsoft.bingads.v10.campaignmanagement.GenderType gender;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GenderTargetBid() {
  }

  public GenderTargetBid(
          int bidAdjustment,
          com.microsoft.bingads.v10.campaignmanagement.GenderType gender) {
    this.bidAdjustment = bidAdjustment;
    this.gender = gender;
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
   * Gets the bidAdjustment value for this GenderTargetBid.
   *
   * @return bidAdjustment
   */
  public int getBidAdjustment() {
    return bidAdjustment;
  }

  /**
   * Sets the bidAdjustment value for this GenderTargetBid.
   *
   * @param bidAdjustment
   */
  public void setBidAdjustment(int bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
  }

  /**
   * Gets the gender value for this GenderTargetBid.
   *
   * @return gender
   */
  public com.microsoft.bingads.v10.campaignmanagement.GenderType getGender() {
    return gender;
  }

  /**
   * Sets the gender value for this GenderTargetBid.
   *
   * @param gender
   */
  public void setGender(com.microsoft.bingads.v10.campaignmanagement.GenderType gender) {
    this.gender = gender;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GenderTargetBid)) return false;
    GenderTargetBid other = (GenderTargetBid) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            this.bidAdjustment == other.getBidAdjustment() &&
            ((this.gender == null && other.getGender() == null) ||
                    (this.gender != null &&
                            this.gender.equals(other.getGender())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    _hashCode += getBidAdjustment();
    if (getGender() != null) {
      _hashCode += getGender().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
