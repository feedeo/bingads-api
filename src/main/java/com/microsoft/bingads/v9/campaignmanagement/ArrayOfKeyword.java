/**
 * ArrayOfKeyword.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfKeyword  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.Keyword[] keyword;

    public ArrayOfKeyword() {
    }

    public ArrayOfKeyword(
           com.microsoft.bingads.v9.campaignmanagement.Keyword[] keyword) {
           this.keyword = keyword;
    }


    /**
     * Gets the keyword value for this ArrayOfKeyword.
     * 
     * @return keyword
     */
    public com.microsoft.bingads.v9.campaignmanagement.Keyword[] getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this ArrayOfKeyword.
     * 
     * @param keyword
     */
    public void setKeyword(com.microsoft.bingads.v9.campaignmanagement.Keyword[] keyword) {
        this.keyword = keyword;
    }

    public com.microsoft.bingads.v9.campaignmanagement.Keyword getKeyword(int i) {
        return this.keyword[i];
    }

    public void setKeyword(int i, com.microsoft.bingads.v9.campaignmanagement.Keyword _value) {
        this.keyword[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeyword)) return false;
        ArrayOfKeyword other = (ArrayOfKeyword) obj;
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
              java.util.Arrays.equals(this.keyword, other.getKeyword())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyword());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyword(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeyword.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfKeyword"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Keyword"));
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
