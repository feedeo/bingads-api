/**
 * ArrayOfAccountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class ArrayOfAccountInfo  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.AccountInfo[] accountInfo;

    public ArrayOfAccountInfo() {
    }

    public ArrayOfAccountInfo(
           com.microsoft.bingads.v9.customermanagement.entities.AccountInfo[] accountInfo) {
           this.accountInfo = accountInfo;
    }


    /**
     * Gets the accountInfo value for this ArrayOfAccountInfo.
     * 
     * @return accountInfo
     */
    public com.microsoft.bingads.v9.customermanagement.entities.AccountInfo[] getAccountInfo() {
        return accountInfo;
    }


    /**
     * Sets the accountInfo value for this ArrayOfAccountInfo.
     * 
     * @param accountInfo
     */
    public void setAccountInfo(com.microsoft.bingads.v9.customermanagement.entities.AccountInfo[] accountInfo) {
        this.accountInfo = accountInfo;
    }

    public com.microsoft.bingads.v9.customermanagement.entities.AccountInfo getAccountInfo(int i) {
        return this.accountInfo[i];
    }

    public void setAccountInfo(int i, com.microsoft.bingads.v9.customermanagement.entities.AccountInfo _value) {
        this.accountInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAccountInfo)) return false;
        ArrayOfAccountInfo other = (ArrayOfAccountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountInfo==null && other.getAccountInfo()==null) || 
             (this.accountInfo!=null &&
              java.util.Arrays.equals(this.accountInfo, other.getAccountInfo())));
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
        if (getAccountInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAccountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfAccountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "AccountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "AccountInfo"));
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
