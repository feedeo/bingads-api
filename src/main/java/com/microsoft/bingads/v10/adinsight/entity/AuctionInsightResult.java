/**
 * AuctionInsightResult.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class AuctionInsightResult implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AuctionInsightResult.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightResult"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("totalNumEntries");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "TotalNumEntries"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("entries");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Entries"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightV2Entity"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightV2Entity"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("usedImpressions");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "UsedImpressions"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("usedKeywords");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "UsedKeywords"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Integer totalNumEntries;
  private com.microsoft.bingads.v10.adinsight.entity.AuctionInsightV2Entity[] entries;
  private java.lang.Double usedImpressions;
  private java.lang.Double usedKeywords;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AuctionInsightResult() {
  }

  public AuctionInsightResult(
          java.lang.Integer totalNumEntries,
          com.microsoft.bingads.v10.adinsight.entity.AuctionInsightV2Entity[] entries,
          java.lang.Double usedImpressions,
          java.lang.Double usedKeywords) {
    this.totalNumEntries = totalNumEntries;
    this.entries = entries;
    this.usedImpressions = usedImpressions;
    this.usedKeywords = usedKeywords;
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
   * Gets the totalNumEntries value for this AuctionInsightResult.
   *
   * @return totalNumEntries
   */
  public java.lang.Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  /**
   * Sets the totalNumEntries value for this AuctionInsightResult.
   *
   * @param totalNumEntries
   */
  public void setTotalNumEntries(java.lang.Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  /**
   * Gets the entries value for this AuctionInsightResult.
   *
   * @return entries
   */
  public com.microsoft.bingads.v10.adinsight.entity.AuctionInsightV2Entity[] getEntries() {
    return entries;
  }

  /**
   * Sets the entries value for this AuctionInsightResult.
   *
   * @param entries
   */
  public void setEntries(com.microsoft.bingads.v10.adinsight.entity.AuctionInsightV2Entity[] entries) {
    this.entries = entries;
  }

  /**
   * Gets the usedImpressions value for this AuctionInsightResult.
   *
   * @return usedImpressions
   */
  public java.lang.Double getUsedImpressions() {
    return usedImpressions;
  }

  /**
   * Sets the usedImpressions value for this AuctionInsightResult.
   *
   * @param usedImpressions
   */
  public void setUsedImpressions(java.lang.Double usedImpressions) {
    this.usedImpressions = usedImpressions;
  }

  /**
   * Gets the usedKeywords value for this AuctionInsightResult.
   *
   * @return usedKeywords
   */
  public java.lang.Double getUsedKeywords() {
    return usedKeywords;
  }

  /**
   * Sets the usedKeywords value for this AuctionInsightResult.
   *
   * @param usedKeywords
   */
  public void setUsedKeywords(java.lang.Double usedKeywords) {
    this.usedKeywords = usedKeywords;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AuctionInsightResult)) return false;
    AuctionInsightResult other = (AuctionInsightResult) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.totalNumEntries == null && other.getTotalNumEntries() == null) ||
                    (this.totalNumEntries != null &&
                            this.totalNumEntries.equals(other.getTotalNumEntries()))) &&
            ((this.entries == null && other.getEntries() == null) ||
                    (this.entries != null &&
                            java.util.Arrays.equals(this.entries, other.getEntries()))) &&
            ((this.usedImpressions == null && other.getUsedImpressions() == null) ||
                    (this.usedImpressions != null &&
                            this.usedImpressions.equals(other.getUsedImpressions()))) &&
            ((this.usedKeywords == null && other.getUsedKeywords() == null) ||
                    (this.usedKeywords != null &&
                            this.usedKeywords.equals(other.getUsedKeywords())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getTotalNumEntries() != null) {
      _hashCode += getTotalNumEntries().hashCode();
    }
    if (getEntries() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getEntries());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getEntries(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getUsedImpressions() != null) {
      _hashCode += getUsedImpressions().hashCode();
    }
    if (getUsedKeywords() != null) {
      _hashCode += getUsedKeywords().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
