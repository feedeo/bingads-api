/**
 * ArrayOfKeywordDemographicResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordDemographicResult  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordDemographicResult[] keywordDemographicResult;

    public ArrayOfKeywordDemographicResult() {
    }

    public ArrayOfKeywordDemographicResult(
           com.microsoft.bingads.v9.datacontracts.KeywordDemographicResult[] keywordDemographicResult) {
           this.keywordDemographicResult = keywordDemographicResult;
    }


    /**
     * Gets the keywordDemographicResult value for this ArrayOfKeywordDemographicResult.
     * 
     * @return keywordDemographicResult
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordDemographicResult[] getKeywordDemographicResult() {
        return keywordDemographicResult;
    }


    /**
     * Sets the keywordDemographicResult value for this ArrayOfKeywordDemographicResult.
     * 
     * @param keywordDemographicResult
     */
    public void setKeywordDemographicResult(com.microsoft.bingads.v9.datacontracts.KeywordDemographicResult[] keywordDemographicResult) {
        this.keywordDemographicResult = keywordDemographicResult;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordDemographicResult getKeywordDemographicResult(int i) {
        return this.keywordDemographicResult[i];
    }

    public void setKeywordDemographicResult(int i, com.microsoft.bingads.v9.datacontracts.KeywordDemographicResult _value) {
        this.keywordDemographicResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordDemographicResult)) return false;
        ArrayOfKeywordDemographicResult other = (ArrayOfKeywordDemographicResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordDemographicResult==null && other.getKeywordDemographicResult()==null) || 
             (this.keywordDemographicResult!=null &&
              java.util.Arrays.equals(this.keywordDemographicResult, other.getKeywordDemographicResult())));
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
        if (getKeywordDemographicResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordDemographicResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordDemographicResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordDemographicResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordDemographicResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordDemographicResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordDemographicResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordDemographicResult"));
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
