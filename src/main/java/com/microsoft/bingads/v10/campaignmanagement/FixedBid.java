/**
 * FixedBid.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class FixedBid extends com.microsoft.bingads.v10.campaignmanagement.CriterionBid implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(FixedBid.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "FixedBid"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("bid");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Bid"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Bid"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.Bid bid;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public FixedBid() {
  }

  public FixedBid(
          java.lang.String type,
          com.microsoft.bingads.v10.campaignmanagement.Bid bid) {
    super(
            type);
    this.bid = bid;
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
   * Gets the bid value for this FixedBid.
   *
   * @return bid
   */
  public com.microsoft.bingads.v10.campaignmanagement.Bid getBid() {
    return bid;
  }

  /**
   * Sets the bid value for this FixedBid.
   *
   * @param bid
   */
  public void setBid(com.microsoft.bingads.v10.campaignmanagement.Bid bid) {
    this.bid = bid;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof FixedBid)) return false;
    FixedBid other = (FixedBid) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.bid == null && other.getBid() == null) ||
                    (this.bid != null &&
                            this.bid.equals(other.getBid())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getBid() != null) {
      _hashCode += getBid().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
