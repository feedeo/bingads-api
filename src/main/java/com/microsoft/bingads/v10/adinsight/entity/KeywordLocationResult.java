/**
 * KeywordLocationResult.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class KeywordLocationResult implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(KeywordLocationResult.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocationResult"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keyword");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Keyword"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywordLocations");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocations"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocation"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocation"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String keyword;
  private com.microsoft.bingads.v10.adinsight.entity.KeywordLocation[] keywordLocations;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public KeywordLocationResult() {
  }

  public KeywordLocationResult(
          java.lang.String keyword,
          com.microsoft.bingads.v10.adinsight.entity.KeywordLocation[] keywordLocations) {
    this.keyword = keyword;
    this.keywordLocations = keywordLocations;
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
   * Gets the keyword value for this KeywordLocationResult.
   *
   * @return keyword
   */
  public java.lang.String getKeyword() {
    return keyword;
  }

  /**
   * Sets the keyword value for this KeywordLocationResult.
   *
   * @param keyword
   */
  public void setKeyword(java.lang.String keyword) {
    this.keyword = keyword;
  }

  /**
   * Gets the keywordLocations value for this KeywordLocationResult.
   *
   * @return keywordLocations
   */
  public com.microsoft.bingads.v10.adinsight.entity.KeywordLocation[] getKeywordLocations() {
    return keywordLocations;
  }

  /**
   * Sets the keywordLocations value for this KeywordLocationResult.
   *
   * @param keywordLocations
   */
  public void setKeywordLocations(com.microsoft.bingads.v10.adinsight.entity.KeywordLocation[] keywordLocations) {
    this.keywordLocations = keywordLocations;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof KeywordLocationResult)) return false;
    KeywordLocationResult other = (KeywordLocationResult) obj;
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
            ((this.keywordLocations == null && other.getKeywordLocations() == null) ||
                    (this.keywordLocations != null &&
                            java.util.Arrays.equals(this.keywordLocations, other.getKeywordLocations())));
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
    if (getKeywordLocations() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getKeywordLocations());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getKeywordLocations(), i);
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
