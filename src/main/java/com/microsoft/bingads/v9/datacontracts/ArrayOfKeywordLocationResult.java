/**
 * ArrayOfKeywordLocationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordLocationResult  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordLocationResult[] keywordLocationResult;

    public ArrayOfKeywordLocationResult() {
    }

    public ArrayOfKeywordLocationResult(
           com.microsoft.bingads.v9.datacontracts.KeywordLocationResult[] keywordLocationResult) {
           this.keywordLocationResult = keywordLocationResult;
    }


    /**
     * Gets the keywordLocationResult value for this ArrayOfKeywordLocationResult.
     * 
     * @return keywordLocationResult
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordLocationResult[] getKeywordLocationResult() {
        return keywordLocationResult;
    }


    /**
     * Sets the keywordLocationResult value for this ArrayOfKeywordLocationResult.
     * 
     * @param keywordLocationResult
     */
    public void setKeywordLocationResult(com.microsoft.bingads.v9.datacontracts.KeywordLocationResult[] keywordLocationResult) {
        this.keywordLocationResult = keywordLocationResult;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordLocationResult getKeywordLocationResult(int i) {
        return this.keywordLocationResult[i];
    }

    public void setKeywordLocationResult(int i, com.microsoft.bingads.v9.datacontracts.KeywordLocationResult _value) {
        this.keywordLocationResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordLocationResult)) return false;
        ArrayOfKeywordLocationResult other = (ArrayOfKeywordLocationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordLocationResult==null && other.getKeywordLocationResult()==null) || 
             (this.keywordLocationResult!=null &&
              java.util.Arrays.equals(this.keywordLocationResult, other.getKeywordLocationResult())));
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
        if (getKeywordLocationResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordLocationResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordLocationResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordLocationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordLocationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordLocationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordLocationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordLocationResult"));
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
