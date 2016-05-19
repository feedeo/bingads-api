/**
 * KeywordBidLandscape.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class KeywordBidLandscape implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(KeywordBidLandscape.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordBidLandscape"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywordId");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("startDate");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "StartDate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DayMonthAndYear"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("endDate");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EndDate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DayMonthAndYear"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("bidLandscapePoints");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidLandscapePoints"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidLandscapePoint"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidLandscapePoint"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long keywordId;
  private com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear startDate;
  private com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear endDate;
  private com.microsoft.bingads.v10.adinsight.entity.BidLandscapePoint[] bidLandscapePoints;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public KeywordBidLandscape() {
  }

  public KeywordBidLandscape(
          java.lang.Long keywordId,
          com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear startDate,
          com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear endDate,
          com.microsoft.bingads.v10.adinsight.entity.BidLandscapePoint[] bidLandscapePoints) {
    this.keywordId = keywordId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.bidLandscapePoints = bidLandscapePoints;
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
   * Gets the keywordId value for this KeywordBidLandscape.
   *
   * @return keywordId
   */
  public java.lang.Long getKeywordId() {
    return keywordId;
  }

  /**
   * Sets the keywordId value for this KeywordBidLandscape.
   *
   * @param keywordId
   */
  public void setKeywordId(java.lang.Long keywordId) {
    this.keywordId = keywordId;
  }

  /**
   * Gets the startDate value for this KeywordBidLandscape.
   *
   * @return startDate
   */
  public com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear getStartDate() {
    return startDate;
  }

  /**
   * Sets the startDate value for this KeywordBidLandscape.
   *
   * @param startDate
   */
  public void setStartDate(com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear startDate) {
    this.startDate = startDate;
  }

  /**
   * Gets the endDate value for this KeywordBidLandscape.
   *
   * @return endDate
   */
  public com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear getEndDate() {
    return endDate;
  }

  /**
   * Sets the endDate value for this KeywordBidLandscape.
   *
   * @param endDate
   */
  public void setEndDate(com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear endDate) {
    this.endDate = endDate;
  }

  /**
   * Gets the bidLandscapePoints value for this KeywordBidLandscape.
   *
   * @return bidLandscapePoints
   */
  public com.microsoft.bingads.v10.adinsight.entity.BidLandscapePoint[] getBidLandscapePoints() {
    return bidLandscapePoints;
  }

  /**
   * Sets the bidLandscapePoints value for this KeywordBidLandscape.
   *
   * @param bidLandscapePoints
   */
  public void setBidLandscapePoints(com.microsoft.bingads.v10.adinsight.entity.BidLandscapePoint[] bidLandscapePoints) {
    this.bidLandscapePoints = bidLandscapePoints;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof KeywordBidLandscape)) return false;
    KeywordBidLandscape other = (KeywordBidLandscape) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.keywordId == null && other.getKeywordId() == null) ||
                    (this.keywordId != null &&
                            this.keywordId.equals(other.getKeywordId()))) &&
            ((this.startDate == null && other.getStartDate() == null) ||
                    (this.startDate != null &&
                            this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate == null && other.getEndDate() == null) ||
                    (this.endDate != null &&
                            this.endDate.equals(other.getEndDate()))) &&
            ((this.bidLandscapePoints == null && other.getBidLandscapePoints() == null) ||
                    (this.bidLandscapePoints != null &&
                            java.util.Arrays.equals(this.bidLandscapePoints, other.getBidLandscapePoints())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getKeywordId() != null) {
      _hashCode += getKeywordId().hashCode();
    }
    if (getStartDate() != null) {
      _hashCode += getStartDate().hashCode();
    }
    if (getEndDate() != null) {
      _hashCode += getEndDate().hashCode();
    }
    if (getBidLandscapePoints() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getBidLandscapePoints());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getBidLandscapePoints(), i);
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
