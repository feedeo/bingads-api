/**
 * DateRange.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class DateRange implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(DateRange.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DateRange"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("maxDate");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MaxDate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("minDate");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MinDate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String maxDate;
  private java.lang.String minDate;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public DateRange() {
  }

  public DateRange(
          java.lang.String maxDate,
          java.lang.String minDate) {
    this.maxDate = maxDate;
    this.minDate = minDate;
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
   * Gets the maxDate value for this DateRange.
   *
   * @return maxDate
   */
  public java.lang.String getMaxDate() {
    return maxDate;
  }

  /**
   * Sets the maxDate value for this DateRange.
   *
   * @param maxDate
   */
  public void setMaxDate(java.lang.String maxDate) {
    this.maxDate = maxDate;
  }

  /**
   * Gets the minDate value for this DateRange.
   *
   * @return minDate
   */
  public java.lang.String getMinDate() {
    return minDate;
  }

  /**
   * Sets the minDate value for this DateRange.
   *
   * @param minDate
   */
  public void setMinDate(java.lang.String minDate) {
    this.minDate = minDate;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof DateRange)) return false;
    DateRange other = (DateRange) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.maxDate == null && other.getMaxDate() == null) ||
                    (this.maxDate != null &&
                            this.maxDate.equals(other.getMaxDate()))) &&
            ((this.minDate == null && other.getMinDate() == null) ||
                    (this.minDate != null &&
                            this.minDate.equals(other.getMinDate())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getMaxDate() != null) {
      _hashCode += getMaxDate().hashCode();
    }
    if (getMinDate() != null) {
      _hashCode += getMinDate().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
