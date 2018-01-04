/**
 * StateTargetBid.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class StateTargetBid implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(StateTargetBid.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "StateTargetBid"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("bidAdjustment");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BidAdjustment"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("isExcluded");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "IsExcluded"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("state");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "State"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private int bidAdjustment;
  private boolean isExcluded;
  private java.lang.String state;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public StateTargetBid() {
  }

  public StateTargetBid(
          int bidAdjustment,
          boolean isExcluded,
          java.lang.String state) {
    this.bidAdjustment = bidAdjustment;
    this.isExcluded = isExcluded;
    this.state = state;
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
   * Gets the bidAdjustment value for this StateTargetBid.
   *
   * @return bidAdjustment
   */
  public int getBidAdjustment() {
    return bidAdjustment;
  }

  /**
   * Sets the bidAdjustment value for this StateTargetBid.
   *
   * @param bidAdjustment
   */
  public void setBidAdjustment(int bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
  }

  /**
   * Gets the isExcluded value for this StateTargetBid.
   *
   * @return isExcluded
   */
  public boolean isIsExcluded() {
    return isExcluded;
  }

  /**
   * Sets the isExcluded value for this StateTargetBid.
   *
   * @param isExcluded
   */
  public void setIsExcluded(boolean isExcluded) {
    this.isExcluded = isExcluded;
  }

  /**
   * Gets the state value for this StateTargetBid.
   *
   * @return state
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Sets the state value for this StateTargetBid.
   *
   * @param state
   */
  public void setState(java.lang.String state) {
    this.state = state;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof StateTargetBid)) return false;
    StateTargetBid other = (StateTargetBid) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            this.bidAdjustment == other.getBidAdjustment() &&
            this.isExcluded == other.isIsExcluded() &&
            ((this.state == null && other.getState() == null) ||
                    (this.state != null &&
                            this.state.equals(other.getState())));
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
    _hashCode += (isIsExcluded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
    if (getState() != null) {
      _hashCode += getState().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
