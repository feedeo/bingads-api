/**
 * KeywordEstimatedBid.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class KeywordEstimatedBid implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(KeywordEstimatedBid.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordEstimatedBid"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keyword");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Keyword"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("estimatedBids");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedBids"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedBidAndTraffic"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedBidAndTraffic"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String keyword;
  private com.microsoft.bingads.v10.adinsight.entity.EstimatedBidAndTraffic[] estimatedBids;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public KeywordEstimatedBid() {
  }

  public KeywordEstimatedBid(
          java.lang.String keyword,
          com.microsoft.bingads.v10.adinsight.entity.EstimatedBidAndTraffic[] estimatedBids) {
    this.keyword = keyword;
    this.estimatedBids = estimatedBids;
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
   * Gets the keyword value for this KeywordEstimatedBid.
   *
   * @return keyword
   */
  public java.lang.String getKeyword() {
    return keyword;
  }

  /**
   * Sets the keyword value for this KeywordEstimatedBid.
   *
   * @param keyword
   */
  public void setKeyword(java.lang.String keyword) {
    this.keyword = keyword;
  }

  /**
   * Gets the estimatedBids value for this KeywordEstimatedBid.
   *
   * @return estimatedBids
   */
  public com.microsoft.bingads.v10.adinsight.entity.EstimatedBidAndTraffic[] getEstimatedBids() {
    return estimatedBids;
  }

  /**
   * Sets the estimatedBids value for this KeywordEstimatedBid.
   *
   * @param estimatedBids
   */
  public void setEstimatedBids(com.microsoft.bingads.v10.adinsight.entity.EstimatedBidAndTraffic[] estimatedBids) {
    this.estimatedBids = estimatedBids;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof KeywordEstimatedBid)) return false;
    KeywordEstimatedBid other = (KeywordEstimatedBid) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.keyword == null && other.getKeyword() == null) ||
                    (this.keyword != null &&
                            this.keyword.equals(other.getKeyword()))) &&
            ((this.estimatedBids == null && other.getEstimatedBids() == null) ||
                    (this.estimatedBids != null &&
                            java.util.Arrays.equals(this.estimatedBids, other.getEstimatedBids())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getKeyword() != null) {
      _hashCode += getKeyword().hashCode();
    }
    if (getEstimatedBids() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getEstimatedBids());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedBids(), i);
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
