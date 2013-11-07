/**
 * ArrayOfAccountInfoWithCustomerData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class ArrayOfAccountInfoWithCustomerData  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.AccountInfoWithCustomerData[] accountInfoWithCustomerData;

    public ArrayOfAccountInfoWithCustomerData() {
    }

    public ArrayOfAccountInfoWithCustomerData(
           com.microsoft.bingads.v9.customermanagement.entities.AccountInfoWithCustomerData[] accountInfoWithCustomerData) {
           this.accountInfoWithCustomerData = accountInfoWithCustomerData;
    }


    /**
     * Gets the accountInfoWithCustomerData value for this ArrayOfAccountInfoWithCustomerData.
     * 
     * @return accountInfoWithCustomerData
     */
    public com.microsoft.bingads.v9.customermanagement.entities.AccountInfoWithCustomerData[] getAccountInfoWithCustomerData() {
        return accountInfoWithCustomerData;
    }


    /**
     * Sets the accountInfoWithCustomerData value for this ArrayOfAccountInfoWithCustomerData.
     * 
     * @param accountInfoWithCustomerData
     */
    public void setAccountInfoWithCustomerData(com.microsoft.bingads.v9.customermanagement.entities.AccountInfoWithCustomerData[] accountInfoWithCustomerData) {
        this.accountInfoWithCustomerData = accountInfoWithCustomerData;
    }

    public com.microsoft.bingads.v9.customermanagement.entities.AccountInfoWithCustomerData getAccountInfoWithCustomerData(int i) {
        return this.accountInfoWithCustomerData[i];
    }

    public void setAccountInfoWithCustomerData(int i, com.microsoft.bingads.v9.customermanagement.entities.AccountInfoWithCustomerData _value) {
        this.accountInfoWithCustomerData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAccountInfoWithCustomerData)) return false;
        ArrayOfAccountInfoWithCustomerData other = (ArrayOfAccountInfoWithCustomerData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountInfoWithCustomerData==null && other.getAccountInfoWithCustomerData()==null) || 
             (this.accountInfoWithCustomerData!=null &&
              java.util.Arrays.equals(this.accountInfoWithCustomerData, other.getAccountInfoWithCustomerData())));
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
        if (getAccountInfoWithCustomerData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountInfoWithCustomerData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountInfoWithCustomerData(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAccountInfoWithCustomerData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfAccountInfoWithCustomerData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInfoWithCustomerData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "AccountInfoWithCustomerData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "AccountInfoWithCustomerData"));
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
