/**
 * SuggestKeywordsFromExistingKeywordsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class SuggestKeywordsFromExistingKeywordsResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordSuggestion keywordSuggestions;

    public SuggestKeywordsFromExistingKeywordsResponse() {
    }

    public SuggestKeywordsFromExistingKeywordsResponse(
           com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordSuggestion keywordSuggestions) {
           this.keywordSuggestions = keywordSuggestions;
    }


    /**
     * Gets the keywordSuggestions value for this SuggestKeywordsFromExistingKeywordsResponse.
     * 
     * @return keywordSuggestions
     */
    public com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordSuggestion getKeywordSuggestions() {
        return keywordSuggestions;
    }


    /**
     * Sets the keywordSuggestions value for this SuggestKeywordsFromExistingKeywordsResponse.
     * 
     * @param keywordSuggestions
     */
    public void setKeywordSuggestions(com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordSuggestion keywordSuggestions) {
        this.keywordSuggestions = keywordSuggestions;
    }

    private java.lang.Object __equalsCalc = null;
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
            ((this.keywordSuggestions==null && other.getKeywordSuggestions()==null) || 
             (this.keywordSuggestions!=null &&
              this.keywordSuggestions.equals(other.getKeywordSuggestions())));
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
        if (getKeywordSuggestions() != null) {
            _hashCode += getKeywordSuggestions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuggestKeywordsFromExistingKeywordsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">SuggestKeywordsFromExistingKeywordsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordSuggestions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "KeywordSuggestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordSuggestion"));
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
