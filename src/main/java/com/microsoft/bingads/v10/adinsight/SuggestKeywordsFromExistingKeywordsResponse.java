/**
 * SuggestKeywordsFromExistingKeywordsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class SuggestKeywordsFromExistingKeywordsResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(SuggestKeywordsFromExistingKeywordsResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsFromExistingKeywordsResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywordSuggestions");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "KeywordSuggestions"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSuggestion"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSuggestion"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.entity.KeywordSuggestion[] keywordSuggestions;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public SuggestKeywordsFromExistingKeywordsResponse() {
  }

  public SuggestKeywordsFromExistingKeywordsResponse(
          com.microsoft.bingads.v10.adinsight.entity.KeywordSuggestion[] keywordSuggestions) {
    this.keywordSuggestions = keywordSuggestions;
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
   * Gets the keywordSuggestions value for this SuggestKeywordsFromExistingKeywordsResponse.
   *
   * @return keywordSuggestions
   */
  public com.microsoft.bingads.v10.adinsight.entity.KeywordSuggestion[] getKeywordSuggestions() {
    return keywordSuggestions;
  }

  /**
   * Sets the keywordSuggestions value for this SuggestKeywordsFromExistingKeywordsResponse.
   *
   * @param keywordSuggestions
   */
  public void setKeywordSuggestions(com.microsoft.bingads.v10.adinsight.entity.KeywordSuggestion[] keywordSuggestions) {
    this.keywordSuggestions = keywordSuggestions;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof SuggestKeywordsFromExistingKeywordsResponse)) return false;
    SuggestKeywordsFromExistingKeywordsResponse other = (SuggestKeywordsFromExistingKeywordsResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.keywordSuggestions == null && other.getKeywordSuggestions() == null) ||
                    (this.keywordSuggestions != null &&
                            java.util.Arrays.equals(this.keywordSuggestions, other.getKeywordSuggestions())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getKeywordSuggestions() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getKeywordSuggestions());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getKeywordSuggestions(), i);
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
