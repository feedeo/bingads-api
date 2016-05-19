/**
 * CountryTargetBid.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class CountryTargetBid implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(CountryTargetBid.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CountryTargetBid"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("bidAdjustment");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BidAdjustment"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("countryAndRegion");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CountryAndRegion"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("isExcluded");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "IsExcluded"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private int bidAdjustment;
  private java.lang.String countryAndRegion;
  private boolean isExcluded;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public CountryTargetBid() {
  }

  public CountryTargetBid(
          int bidAdjustment,
          java.lang.String countryAndRegion,
          boolean isExcluded) {
    this.bidAdjustment = bidAdjustment;
    this.countryAndRegion = countryAndRegion;
    this.isExcluded = isExcluded;
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
   * Gets the bidAdjustment value for this CountryTargetBid.
   *
   * @return bidAdjustment
   */
  public int getBidAdjustment() {
    return bidAdjustment;
  }

  /**
   * Sets the bidAdjustment value for this CountryTargetBid.
   *
   * @param bidAdjustment
   */
  public void setBidAdjustment(int bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
  }

  /**
   * Gets the countryAndRegion value for this CountryTargetBid.
   *
   * @return countryAndRegion
   */
  public java.lang.String getCountryAndRegion() {
    return countryAndRegion;
  }

  /**
   * Sets the countryAndRegion value for this CountryTargetBid.
   *
   * @param countryAndRegion
   */
  public void setCountryAndRegion(java.lang.String countryAndRegion) {
    this.countryAndRegion = countryAndRegion;
  }

  /**
   * Gets the isExcluded value for this CountryTargetBid.
   *
   * @return isExcluded
   */
  public boolean isIsExcluded() {
    return isExcluded;
  }

  /**
   * Sets the isExcluded value for this CountryTargetBid.
   *
   * @param isExcluded
   */
  public void setIsExcluded(boolean isExcluded) {
    this.isExcluded = isExcluded;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof CountryTargetBid)) return false;
    CountryTargetBid other = (CountryTargetBid) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            this.bidAdjustment == other.getBidAdjustment() &&
            ((this.countryAndRegion == null && other.getCountryAndRegion() == null) ||
                    (this.countryAndRegion != null &&
                            this.countryAndRegion.equals(other.getCountryAndRegion()))) &&
            this.isExcluded == other.isIsExcluded();
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
    if (getCountryAndRegion() != null) {
      _hashCode += getCountryAndRegion().hashCode();
    }
    _hashCode += (isIsExcluded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
    __hashCodeCalc = false;
    return _hashCode;
  }

}
