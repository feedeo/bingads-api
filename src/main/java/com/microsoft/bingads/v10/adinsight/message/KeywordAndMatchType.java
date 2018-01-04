/**
 * KeywordAndMatchType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.message;

public class KeywordAndMatchType implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(KeywordAndMatchType.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "KeywordAndMatchType"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywordText");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "KeywordText"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("matchTypes");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "MatchTypes"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String keywordText;
  private com.microsoft.bingads.v10.adinsight.entity.MatchType[] matchTypes;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public KeywordAndMatchType() {
  }

  public KeywordAndMatchType(
          java.lang.String keywordText,
          com.microsoft.bingads.v10.adinsight.entity.MatchType[] matchTypes) {
    this.keywordText = keywordText;
    this.matchTypes = matchTypes;
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
   * Gets the keywordText value for this KeywordAndMatchType.
   *
   * @return keywordText
   */
  public java.lang.String getKeywordText() {
    return keywordText;
  }

  /**
   * Sets the keywordText value for this KeywordAndMatchType.
   *
   * @param keywordText
   */
  public void setKeywordText(java.lang.String keywordText) {
    this.keywordText = keywordText;
  }

  /**
   * Gets the matchTypes value for this KeywordAndMatchType.
   *
   * @return matchTypes
   */
  public com.microsoft.bingads.v10.adinsight.entity.MatchType[] getMatchTypes() {
    return matchTypes;
  }

  /**
   * Sets the matchTypes value for this KeywordAndMatchType.
   *
   * @param matchTypes
   */
  public void setMatchTypes(com.microsoft.bingads.v10.adinsight.entity.MatchType[] matchTypes) {
    this.matchTypes = matchTypes;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof KeywordAndMatchType)) return false;
    KeywordAndMatchType other = (KeywordAndMatchType) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.keywordText == null && other.getKeywordText() == null) ||
                    (this.keywordText != null &&
                            this.keywordText.equals(other.getKeywordText()))) &&
            ((this.matchTypes == null && other.getMatchTypes() == null) ||
                    (this.matchTypes != null &&
                            java.util.Arrays.equals(this.matchTypes, other.getMatchTypes())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getKeywordText() != null) {
      _hashCode += getKeywordText().hashCode();
    }
    if (getMatchTypes() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getMatchTypes());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getMatchTypes(), i);
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
