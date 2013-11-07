/**
 * ArrayOfKeywordOpportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class ArrayOfKeywordOpportunity  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.KeywordOpportunity[] keywordOpportunity;

    public ArrayOfKeywordOpportunity() {
    }

    public ArrayOfKeywordOpportunity(
           com.microsoft.bingads.v9.optimizer.entities.KeywordOpportunity[] keywordOpportunity) {
           this.keywordOpportunity = keywordOpportunity;
    }


    /**
     * Gets the keywordOpportunity value for this ArrayOfKeywordOpportunity.
     * 
     * @return keywordOpportunity
     */
    public com.microsoft.bingads.v9.optimizer.entities.KeywordOpportunity[] getKeywordOpportunity() {
        return keywordOpportunity;
    }


    /**
     * Sets the keywordOpportunity value for this ArrayOfKeywordOpportunity.
     * 
     * @param keywordOpportunity
     */
    public void setKeywordOpportunity(com.microsoft.bingads.v9.optimizer.entities.KeywordOpportunity[] keywordOpportunity) {
        this.keywordOpportunity = keywordOpportunity;
    }

    public com.microsoft.bingads.v9.optimizer.entities.KeywordOpportunity getKeywordOpportunity(int i) {
        return this.keywordOpportunity[i];
    }

    public void setKeywordOpportunity(int i, com.microsoft.bingads.v9.optimizer.entities.KeywordOpportunity _value) {
        this.keywordOpportunity[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordOpportunity)) return false;
        ArrayOfKeywordOpportunity other = (ArrayOfKeywordOpportunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordOpportunity==null && other.getKeywordOpportunity()==null) || 
             (this.keywordOpportunity!=null &&
              java.util.Arrays.equals(this.keywordOpportunity, other.getKeywordOpportunity())));
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
        if (getKeywordOpportunity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordOpportunity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordOpportunity(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordOpportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfKeywordOpportunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordOpportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "KeywordOpportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "KeywordOpportunity"));
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
