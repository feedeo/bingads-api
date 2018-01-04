/**
 * SearchCountsByAttributes.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class SearchCountsByAttributes implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(SearchCountsByAttributes.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SearchCountsByAttributes"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("device");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Device"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("historicalSearchCounts");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "HistoricalSearchCounts"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "HistoricalSearchCountPeriodic"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "HistoricalSearchCountPeriodic"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String device;
  private com.microsoft.bingads.v10.adinsight.entity.HistoricalSearchCountPeriodic[] historicalSearchCounts;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public SearchCountsByAttributes() {
  }

  public SearchCountsByAttributes(
          java.lang.String device,
          com.microsoft.bingads.v10.adinsight.entity.HistoricalSearchCountPeriodic[] historicalSearchCounts) {
    this.device = device;
    this.historicalSearchCounts = historicalSearchCounts;
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
   * Gets the device value for this SearchCountsByAttributes.
   *
   * @return device
   */
  public java.lang.String getDevice() {
    return device;
  }

  /**
   * Sets the device value for this SearchCountsByAttributes.
   *
   * @param device
   */
  public void setDevice(java.lang.String device) {
    this.device = device;
  }

  /**
   * Gets the historicalSearchCounts value for this SearchCountsByAttributes.
   *
   * @return historicalSearchCounts
   */
  public com.microsoft.bingads.v10.adinsight.entity.HistoricalSearchCountPeriodic[] getHistoricalSearchCounts() {
    return historicalSearchCounts;
  }

  /**
   * Sets the historicalSearchCounts value for this SearchCountsByAttributes.
   *
   * @param historicalSearchCounts
   */
  public void setHistoricalSearchCounts(com.microsoft.bingads.v10.adinsight.entity.HistoricalSearchCountPeriodic[] historicalSearchCounts) {
    this.historicalSearchCounts = historicalSearchCounts;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof SearchCountsByAttributes)) return false;
    SearchCountsByAttributes other = (SearchCountsByAttributes) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.device == null && other.getDevice() == null) ||
                    (this.device != null &&
                            this.device.equals(other.getDevice()))) &&
            ((this.historicalSearchCounts == null && other.getHistoricalSearchCounts() == null) ||
                    (this.historicalSearchCounts != null &&
                            java.util.Arrays.equals(this.historicalSearchCounts, other.getHistoricalSearchCounts())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getDevice() != null) {
      _hashCode += getDevice().hashCode();
    }
    if (getHistoricalSearchCounts() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getHistoricalSearchCounts());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getHistoricalSearchCounts(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
