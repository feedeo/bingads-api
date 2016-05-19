/**
 * DayTimeTargetBid.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class DayTimeTargetBid implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(DayTimeTargetBid.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DayTimeTargetBid"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("bidAdjustment");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BidAdjustment"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("day");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Day"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Day"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("fromHour");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "FromHour"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("fromMinute");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "FromMinute"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Minute"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("toHour");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ToHour"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("toMinute");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ToMinute"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Minute"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private int bidAdjustment;
  private com.microsoft.bingads.v10.campaignmanagement.Day day;
  private int fromHour;
  private com.microsoft.bingads.v10.campaignmanagement.Minute fromMinute;
  private int toHour;
  private com.microsoft.bingads.v10.campaignmanagement.Minute toMinute;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public DayTimeTargetBid() {
  }

  public DayTimeTargetBid(
          int bidAdjustment,
          com.microsoft.bingads.v10.campaignmanagement.Day day,
          int fromHour,
          com.microsoft.bingads.v10.campaignmanagement.Minute fromMinute,
          int toHour,
          com.microsoft.bingads.v10.campaignmanagement.Minute toMinute) {
    this.bidAdjustment = bidAdjustment;
    this.day = day;
    this.fromHour = fromHour;
    this.fromMinute = fromMinute;
    this.toHour = toHour;
    this.toMinute = toMinute;
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
   * Gets the bidAdjustment value for this DayTimeTargetBid.
   *
   * @return bidAdjustment
   */
  public int getBidAdjustment() {
    return bidAdjustment;
  }

  /**
   * Sets the bidAdjustment value for this DayTimeTargetBid.
   *
   * @param bidAdjustment
   */
  public void setBidAdjustment(int bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
  }

  /**
   * Gets the day value for this DayTimeTargetBid.
   *
   * @return day
   */
  public com.microsoft.bingads.v10.campaignmanagement.Day getDay() {
    return day;
  }

  /**
   * Sets the day value for this DayTimeTargetBid.
   *
   * @param day
   */
  public void setDay(com.microsoft.bingads.v10.campaignmanagement.Day day) {
    this.day = day;
  }

  /**
   * Gets the fromHour value for this DayTimeTargetBid.
   *
   * @return fromHour
   */
  public int getFromHour() {
    return fromHour;
  }

  /**
   * Sets the fromHour value for this DayTimeTargetBid.
   *
   * @param fromHour
   */
  public void setFromHour(int fromHour) {
    this.fromHour = fromHour;
  }

  /**
   * Gets the fromMinute value for this DayTimeTargetBid.
   *
   * @return fromMinute
   */
  public com.microsoft.bingads.v10.campaignmanagement.Minute getFromMinute() {
    return fromMinute;
  }

  /**
   * Sets the fromMinute value for this DayTimeTargetBid.
   *
   * @param fromMinute
   */
  public void setFromMinute(com.microsoft.bingads.v10.campaignmanagement.Minute fromMinute) {
    this.fromMinute = fromMinute;
  }

  /**
   * Gets the toHour value for this DayTimeTargetBid.
   *
   * @return toHour
   */
  public int getToHour() {
    return toHour;
  }

  /**
   * Sets the toHour value for this DayTimeTargetBid.
   *
   * @param toHour
   */
  public void setToHour(int toHour) {
    this.toHour = toHour;
  }

  /**
   * Gets the toMinute value for this DayTimeTargetBid.
   *
   * @return toMinute
   */
  public com.microsoft.bingads.v10.campaignmanagement.Minute getToMinute() {
    return toMinute;
  }

  /**
   * Sets the toMinute value for this DayTimeTargetBid.
   *
   * @param toMinute
   */
  public void setToMinute(com.microsoft.bingads.v10.campaignmanagement.Minute toMinute) {
    this.toMinute = toMinute;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof DayTimeTargetBid)) return false;
    DayTimeTargetBid other = (DayTimeTargetBid) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            this.bidAdjustment == other.getBidAdjustment() &&
            ((this.day == null && other.getDay() == null) ||
                    (this.day != null &&
                            this.day.equals(other.getDay()))) &&
            this.fromHour == other.getFromHour() &&
            ((this.fromMinute == null && other.getFromMinute() == null) ||
                    (this.fromMinute != null &&
                            this.fromMinute.equals(other.getFromMinute()))) &&
            this.toHour == other.getToHour() &&
            ((this.toMinute == null && other.getToMinute() == null) ||
                    (this.toMinute != null &&
                            this.toMinute.equals(other.getToMinute())));
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
    if (getDay() != null) {
      _hashCode += getDay().hashCode();
    }
    _hashCode += getFromHour();
    if (getFromMinute() != null) {
      _hashCode += getFromMinute().hashCode();
    }
    _hashCode += getToHour();
    if (getToMinute() != null) {
      _hashCode += getToMinute().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
