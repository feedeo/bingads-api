/**
 * ArrayOfKeywordPerformance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordPerformance  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordPerformance[] keywordPerformance;

    public ArrayOfKeywordPerformance() {
    }

    public ArrayOfKeywordPerformance(
           com.microsoft.bingads.v9.datacontracts.KeywordPerformance[] keywordPerformance) {
           this.keywordPerformance = keywordPerformance;
    }


    /**
     * Gets the keywordPerformance value for this ArrayOfKeywordPerformance.
     * 
     * @return keywordPerformance
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordPerformance[] getKeywordPerformance() {
        return keywordPerformance;
    }


    /**
     * Sets the keywordPerformance value for this ArrayOfKeywordPerformance.
     * 
     * @param keywordPerformance
     */
    public void setKeywordPerformance(com.microsoft.bingads.v9.datacontracts.KeywordPerformance[] keywordPerformance) {
        this.keywordPerformance = keywordPerformance;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordPerformance getKeywordPerformance(int i) {
        return this.keywordPerformance[i];
    }

    public void setKeywordPerformance(int i, com.microsoft.bingads.v9.datacontracts.KeywordPerformance _value) {
        this.keywordPerformance[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordPerformance)) return false;
        ArrayOfKeywordPerformance other = (ArrayOfKeywordPerformance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordPerformance==null && other.getKeywordPerformance()==null) || 
             (this.keywordPerformance!=null &&
              java.util.Arrays.equals(this.keywordPerformance, other.getKeywordPerformance())));
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
        if (getKeywordPerformance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordPerformance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordPerformance(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordPerformance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordPerformance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordPerformance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordPerformance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordPerformance"));
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
