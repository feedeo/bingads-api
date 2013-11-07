/**
 * ArrayOfKeywordAndConfidence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordAndConfidence  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordAndConfidence[] keywordAndConfidence;

    public ArrayOfKeywordAndConfidence() {
    }

    public ArrayOfKeywordAndConfidence(
           com.microsoft.bingads.v9.datacontracts.KeywordAndConfidence[] keywordAndConfidence) {
           this.keywordAndConfidence = keywordAndConfidence;
    }


    /**
     * Gets the keywordAndConfidence value for this ArrayOfKeywordAndConfidence.
     * 
     * @return keywordAndConfidence
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordAndConfidence[] getKeywordAndConfidence() {
        return keywordAndConfidence;
    }


    /**
     * Sets the keywordAndConfidence value for this ArrayOfKeywordAndConfidence.
     * 
     * @param keywordAndConfidence
     */
    public void setKeywordAndConfidence(com.microsoft.bingads.v9.datacontracts.KeywordAndConfidence[] keywordAndConfidence) {
        this.keywordAndConfidence = keywordAndConfidence;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordAndConfidence getKeywordAndConfidence(int i) {
        return this.keywordAndConfidence[i];
    }

    public void setKeywordAndConfidence(int i, com.microsoft.bingads.v9.datacontracts.KeywordAndConfidence _value) {
        this.keywordAndConfidence[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordAndConfidence)) return false;
        ArrayOfKeywordAndConfidence other = (ArrayOfKeywordAndConfidence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordAndConfidence==null && other.getKeywordAndConfidence()==null) || 
             (this.keywordAndConfidence!=null &&
              java.util.Arrays.equals(this.keywordAndConfidence, other.getKeywordAndConfidence())));
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
        if (getKeywordAndConfidence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordAndConfidence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordAndConfidence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordAndConfidence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordAndConfidence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordAndConfidence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordAndConfidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordAndConfidence"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
