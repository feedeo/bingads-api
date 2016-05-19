/**
 * SuggestKeywordsForUrlRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class SuggestKeywordsForUrlRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(SuggestKeywordsForUrlRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsForUrlRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("url");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Url"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("language");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Language"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("maxKeywords");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "MaxKeywords"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("minConfidenceScore");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "MinConfidenceScore"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("excludeBrand");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ExcludeBrand"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String url;
  private java.lang.String language;
  private java.lang.Integer maxKeywords;
  private java.lang.Double minConfidenceScore;
  private java.lang.Boolean excludeBrand;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public SuggestKeywordsForUrlRequest() {
  }

  public SuggestKeywordsForUrlRequest(
          java.lang.String url,
          java.lang.String language,
          java.lang.Integer maxKeywords,
          java.lang.Double minConfidenceScore,
          java.lang.Boolean excludeBrand) {
    this.url = url;
    this.language = language;
    this.maxKeywords = maxKeywords;
    this.minConfidenceScore = minConfidenceScore;
    this.excludeBrand = excludeBrand;
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
   * Gets the url value for this SuggestKeywordsForUrlRequest.
   *
   * @return url
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Sets the url value for this SuggestKeywordsForUrlRequest.
   *
   * @param url
   */
  public void setUrl(java.lang.String url) {
    this.url = url;
  }

  /**
   * Gets the language value for this SuggestKeywordsForUrlRequest.
   *
   * @return language
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * Sets the language value for this SuggestKeywordsForUrlRequest.
   *
   * @param language
   */
  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  /**
   * Gets the maxKeywords value for this SuggestKeywordsForUrlRequest.
   *
   * @return maxKeywords
   */
  public java.lang.Integer getMaxKeywords() {
    return maxKeywords;
  }

  /**
   * Sets the maxKeywords value for this SuggestKeywordsForUrlRequest.
   *
   * @param maxKeywords
   */
  public void setMaxKeywords(java.lang.Integer maxKeywords) {
    this.maxKeywords = maxKeywords;
  }

  /**
   * Gets the minConfidenceScore value for this SuggestKeywordsForUrlRequest.
   *
   * @return minConfidenceScore
   */
  public java.lang.Double getMinConfidenceScore() {
    return minConfidenceScore;
  }

  /**
   * Sets the minConfidenceScore value for this SuggestKeywordsForUrlRequest.
   *
   * @param minConfidenceScore
   */
  public void setMinConfidenceScore(java.lang.Double minConfidenceScore) {
    this.minConfidenceScore = minConfidenceScore;
  }

  /**
   * Gets the excludeBrand value for this SuggestKeywordsForUrlRequest.
   *
   * @return excludeBrand
   */
  public java.lang.Boolean getExcludeBrand() {
    return excludeBrand;
  }

  /**
   * Sets the excludeBrand value for this SuggestKeywordsForUrlRequest.
   *
   * @param excludeBrand
   */
  public void setExcludeBrand(java.lang.Boolean excludeBrand) {
    this.excludeBrand = excludeBrand;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof SuggestKeywordsForUrlRequest)) return false;
    SuggestKeywordsForUrlRequest other = (SuggestKeywordsForUrlRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.url == null && other.getUrl() == null) ||
                    (this.url != null &&
                            this.url.equals(other.getUrl()))) &&
            ((this.language == null && other.getLanguage() == null) ||
                    (this.language != null &&
                            this.language.equals(other.getLanguage()))) &&
            ((this.maxKeywords == null && other.getMaxKeywords() == null) ||
                    (this.maxKeywords != null &&
                            this.maxKeywords.equals(other.getMaxKeywords()))) &&
            ((this.minConfidenceScore == null && other.getMinConfidenceScore() == null) ||
                    (this.minConfidenceScore != null &&
                            this.minConfidenceScore.equals(other.getMinConfidenceScore()))) &&
            ((this.excludeBrand == null && other.getExcludeBrand() == null) ||
                    (this.excludeBrand != null &&
                            this.excludeBrand.equals(other.getExcludeBrand())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getUrl() != null) {
      _hashCode += getUrl().hashCode();
    }
    if (getLanguage() != null) {
      _hashCode += getLanguage().hashCode();
    }
    if (getMaxKeywords() != null) {
      _hashCode += getMaxKeywords().hashCode();
    }
    if (getMinConfidenceScore() != null) {
      _hashCode += getMinConfidenceScore().hashCode();
    }
    if (getExcludeBrand() != null) {
      _hashCode += getExcludeBrand().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
