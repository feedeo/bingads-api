/**
 * HistoricalSearchCountPeriodic.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class HistoricalSearchCountPeriodic implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(HistoricalSearchCountPeriodic.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "HistoricalSearchCountPeriodic"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("searchCount");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SearchCount"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("dayMonthAndYear");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DayMonthAndYear"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DayMonthAndYear"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long searchCount;
  private com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear dayMonthAndYear;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public HistoricalSearchCountPeriodic() {
  }

  public HistoricalSearchCountPeriodic(
          java.lang.Long searchCount,
          com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear dayMonthAndYear) {
    this.searchCount = searchCount;
    this.dayMonthAndYear = dayMonthAndYear;
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
   * Gets the searchCount value for this HistoricalSearchCountPeriodic.
   *
   * @return searchCount
   */
  public java.lang.Long getSearchCount() {
    return searchCount;
  }

  /**
   * Sets the searchCount value for this HistoricalSearchCountPeriodic.
   *
   * @param searchCount
   */
  public void setSearchCount(java.lang.Long searchCount) {
    this.searchCount = searchCount;
  }

  /**
   * Gets the dayMonthAndYear value for this HistoricalSearchCountPeriodic.
   *
   * @return dayMonthAndYear
   */
  public com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear getDayMonthAndYear() {
    return dayMonthAndYear;
  }

  /**
   * Sets the dayMonthAndYear value for this HistoricalSearchCountPeriodic.
   *
   * @param dayMonthAndYear
   */
  public void setDayMonthAndYear(com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear dayMonthAndYear) {
    this.dayMonthAndYear = dayMonthAndYear;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof HistoricalSearchCountPeriodic)) return false;
    HistoricalSearchCountPeriodic other = (HistoricalSearchCountPeriodic) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.searchCount == null && other.getSearchCount() == null) ||
                    (this.searchCount != null &&
                            this.searchCount.equals(other.getSearchCount()))) &&
            ((this.dayMonthAndYear == null && other.getDayMonthAndYear() == null) ||
                    (this.dayMonthAndYear != null &&
                            this.dayMonthAndYear.equals(other.getDayMonthAndYear())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getSearchCount() != null) {
      _hashCode += getSearchCount().hashCode();
    }
    if (getDayMonthAndYear() != null) {
      _hashCode += getDayMonthAndYear().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
