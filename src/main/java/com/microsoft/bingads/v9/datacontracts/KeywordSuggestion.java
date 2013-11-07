/**
 * KeywordSuggestion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class KeywordSuggestion  implements java.io.Serializable {
    private java.lang.String keyword;

    private com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordAndConfidence suggestionsAndConfidence;

    public KeywordSuggestion() {
    }

    public KeywordSuggestion(
           java.lang.String keyword,
           com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordAndConfidence suggestionsAndConfidence) {
           this.keyword = keyword;
           this.suggestionsAndConfidence = suggestionsAndConfidence;
    }


    /**
     * Gets the keyword value for this KeywordSuggestion.
     * 
     * @return keyword
     */
    public java.lang.String getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this KeywordSuggestion.
     * 
     * @param keyword
     */
    public void setKeyword(java.lang.String keyword) {
        this.keyword = keyword;
    }


    /**
     * Gets the suggestionsAndConfidence value for this KeywordSuggestion.
     * 
     * @return suggestionsAndConfidence
     */
    public com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordAndConfidence getSuggestionsAndConfidence() {
        return suggestionsAndConfidence;
    }


    /**
     * Sets the suggestionsAndConfidence value for this KeywordSuggestion.
     * 
     * @param suggestionsAndConfidence
     */
    public void setSuggestionsAndConfidence(com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordAndConfidence suggestionsAndConfidence) {
        this.suggestionsAndConfidence = suggestionsAndConfidence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeywordSuggestion)) return false;
        KeywordSuggestion other = (KeywordSuggestion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword()))) &&
            ((this.suggestionsAndConfidence==null && other.getSuggestionsAndConfidence()==null) || 
             (this.suggestionsAndConfidence!=null &&
              this.suggestionsAndConfidence.equals(other.getSuggestionsAndConfidence())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        if (getSuggestionsAndConfidence() != null) {
            _hashCode += getSuggestionsAndConfidence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeywordSuggestion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordSuggestion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestionsAndConfidence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "SuggestionsAndConfidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordAndConfidence"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
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
          new  org.apache.axis.encoding.ser.BeanSerializer(
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
