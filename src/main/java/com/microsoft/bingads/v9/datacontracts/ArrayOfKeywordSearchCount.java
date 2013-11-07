/**
 * ArrayOfKeywordSearchCount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordSearchCount  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordSearchCount[] keywordSearchCount;

    public ArrayOfKeywordSearchCount() {
    }

    public ArrayOfKeywordSearchCount(
           com.microsoft.bingads.v9.datacontracts.KeywordSearchCount[] keywordSearchCount) {
           this.keywordSearchCount = keywordSearchCount;
    }


    /**
     * Gets the keywordSearchCount value for this ArrayOfKeywordSearchCount.
     * 
     * @return keywordSearchCount
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordSearchCount[] getKeywordSearchCount() {
        return keywordSearchCount;
    }


    /**
     * Sets the keywordSearchCount value for this ArrayOfKeywordSearchCount.
     * 
     * @param keywordSearchCount
     */
    public void setKeywordSearchCount(com.microsoft.bingads.v9.datacontracts.KeywordSearchCount[] keywordSearchCount) {
        this.keywordSearchCount = keywordSearchCount;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordSearchCount getKeywordSearchCount(int i) {
        return this.keywordSearchCount[i];
    }

    public void setKeywordSearchCount(int i, com.microsoft.bingads.v9.datacontracts.KeywordSearchCount _value) {
        this.keywordSearchCount[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordSearchCount)) return false;
        ArrayOfKeywordSearchCount other = (ArrayOfKeywordSearchCount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordSearchCount==null && other.getKeywordSearchCount()==null) || 
             (this.keywordSearchCount!=null &&
              java.util.Arrays.equals(this.keywordSearchCount, other.getKeywordSearchCount())));
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
        if (getKeywordSearchCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordSearchCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordSearchCount(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordSearchCount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordSearchCount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordSearchCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordSearchCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordSearchCount"));
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
