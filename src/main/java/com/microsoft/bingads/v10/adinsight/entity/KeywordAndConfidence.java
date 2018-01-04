/**
 * KeywordAndConfidence.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class KeywordAndConfidence implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(KeywordAndConfidence.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordAndConfidence"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("suggestedKeyword");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SuggestedKeyword"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("confidenceScore");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ConfidenceScore"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String suggestedKeyword;
  private java.lang.Double confidenceScore;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public KeywordAndConfidence() {
  }

  public KeywordAndConfidence(
          java.lang.String suggestedKeyword,
          java.lang.Double confidenceScore) {
    this.suggestedKeyword = suggestedKeyword;
    this.confidenceScore = confidenceScore;
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
   * Gets the suggestedKeyword value for this KeywordAndConfidence.
   *
   * @return suggestedKeyword
   */
  public java.lang.String getSuggestedKeyword() {
    return suggestedKeyword;
  }

  /**
   * Sets the suggestedKeyword value for this KeywordAndConfidence.
   *
   * @param suggestedKeyword
   */
  public void setSuggestedKeyword(java.lang.String suggestedKeyword) {
    this.suggestedKeyword = suggestedKeyword;
  }

  /**
   * Gets the confidenceScore value for this KeywordAndConfidence.
   *
   * @return confidenceScore
   */
  public java.lang.Double getConfidenceScore() {
    return confidenceScore;
  }

  /**
   * Sets the confidenceScore value for this KeywordAndConfidence.
   *
   * @param confidenceScore
   */
  public void setConfidenceScore(java.lang.Double confidenceScore) {
    this.confidenceScore = confidenceScore;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof KeywordAndConfidence)) return false;
    KeywordAndConfidence other = (KeywordAndConfidence) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.suggestedKeyword == null && other.getSuggestedKeyword() == null) ||
                    (this.suggestedKeyword != null &&
                            this.suggestedKeyword.equals(other.getSuggestedKeyword()))) &&
            ((this.confidenceScore == null && other.getConfidenceScore() == null) ||
                    (this.confidenceScore != null &&
                            this.confidenceScore.equals(other.getConfidenceScore())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getSuggestedKeyword() != null) {
      _hashCode += getSuggestedKeyword().hashCode();
    }
    if (getConfidenceScore() != null) {
      _hashCode += getConfidenceScore().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
