/**
 * DayMonthAndYear.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class DayMonthAndYear implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(DayMonthAndYear.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DayMonthAndYear"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("day");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Day"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("month");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Month"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("year");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Year"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Integer day;
  private java.lang.Integer month;
  private java.lang.Integer year;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public DayMonthAndYear() {
  }

  public DayMonthAndYear(
          java.lang.Integer day,
          java.lang.Integer month,
          java.lang.Integer year) {
    this.day = day;
    this.month = month;
    this.year = year;
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
   * Gets the day value for this DayMonthAndYear.
   *
   * @return day
   */
  public java.lang.Integer getDay() {
    return day;
  }

  /**
   * Sets the day value for this DayMonthAndYear.
   *
   * @param day
   */
  public void setDay(java.lang.Integer day) {
    this.day = day;
  }

  /**
   * Gets the month value for this DayMonthAndYear.
   *
   * @return month
   */
  public java.lang.Integer getMonth() {
    return month;
  }

  /**
   * Sets the month value for this DayMonthAndYear.
   *
   * @param month
   */
  public void setMonth(java.lang.Integer month) {
    this.month = month;
  }

  /**
   * Gets the year value for this DayMonthAndYear.
   *
   * @return year
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * Sets the year value for this DayMonthAndYear.
   *
   * @param year
   */
  public void setYear(java.lang.Integer year) {
    this.year = year;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof DayMonthAndYear)) return false;
    DayMonthAndYear other = (DayMonthAndYear) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.day == null && other.getDay() == null) ||
                    (this.day != null &&
                            this.day.equals(other.getDay()))) &&
            ((this.month == null && other.getMonth() == null) ||
                    (this.month != null &&
                            this.month.equals(other.getMonth()))) &&
            ((this.year == null && other.getYear() == null) ||
                    (this.year != null &&
                            this.year.equals(other.getYear())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getDay() != null) {
      _hashCode += getDay().hashCode();
    }
    if (getMonth() != null) {
      _hashCode += getMonth().hashCode();
    }
    if (getYear() != null) {
      _hashCode += getYear().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
