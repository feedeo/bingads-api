/**
 * ArrayOfKeywordAndMatchType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordAndMatchType  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType[] keywordAndMatchType;

    public ArrayOfKeywordAndMatchType() {
    }

    public ArrayOfKeywordAndMatchType(
           com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType[] keywordAndMatchType) {
           this.keywordAndMatchType = keywordAndMatchType;
    }


    /**
     * Gets the keywordAndMatchType value for this ArrayOfKeywordAndMatchType.
     * 
     * @return keywordAndMatchType
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType[] getKeywordAndMatchType() {
        return keywordAndMatchType;
    }


    /**
     * Sets the keywordAndMatchType value for this ArrayOfKeywordAndMatchType.
     * 
     * @param keywordAndMatchType
     */
    public void setKeywordAndMatchType(com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType[] keywordAndMatchType) {
        this.keywordAndMatchType = keywordAndMatchType;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType getKeywordAndMatchType(int i) {
        return this.keywordAndMatchType[i];
    }

    public void setKeywordAndMatchType(int i, com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType _value) {
        this.keywordAndMatchType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordAndMatchType)) return false;
        ArrayOfKeywordAndMatchType other = (ArrayOfKeywordAndMatchType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordAndMatchType==null && other.getKeywordAndMatchType()==null) || 
             (this.keywordAndMatchType!=null &&
              java.util.Arrays.equals(this.keywordAndMatchType, other.getKeywordAndMatchType())));
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
        if (getKeywordAndMatchType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordAndMatchType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordAndMatchType(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordAndMatchType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordAndMatchType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordAndMatchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordAndMatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordAndMatchType"));
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
