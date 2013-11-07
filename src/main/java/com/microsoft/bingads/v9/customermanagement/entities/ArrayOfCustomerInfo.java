/**
 * ArrayOfCustomerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class ArrayOfCustomerInfo  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.CustomerInfo[] customerInfo;

    public ArrayOfCustomerInfo() {
    }

    public ArrayOfCustomerInfo(
           com.microsoft.bingads.v9.customermanagement.entities.CustomerInfo[] customerInfo) {
           this.customerInfo = customerInfo;
    }


    /**
     * Gets the customerInfo value for this ArrayOfCustomerInfo.
     * 
     * @return customerInfo
     */
    public com.microsoft.bingads.v9.customermanagement.entities.CustomerInfo[] getCustomerInfo() {
        return customerInfo;
    }


    /**
     * Sets the customerInfo value for this ArrayOfCustomerInfo.
     * 
     * @param customerInfo
     */
    public void setCustomerInfo(com.microsoft.bingads.v9.customermanagement.entities.CustomerInfo[] customerInfo) {
        this.customerInfo = customerInfo;
    }

    public com.microsoft.bingads.v9.customermanagement.entities.CustomerInfo getCustomerInfo(int i) {
        return this.customerInfo[i];
    }

    public void setCustomerInfo(int i, com.microsoft.bingads.v9.customermanagement.entities.CustomerInfo _value) {
        this.customerInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCustomerInfo)) return false;
        ArrayOfCustomerInfo other = (ArrayOfCustomerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerInfo==null && other.getCustomerInfo()==null) || 
             (this.customerInfo!=null &&
              java.util.Arrays.equals(this.customerInfo, other.getCustomerInfo())));
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
        if (getCustomerInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCustomerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfCustomerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "CustomerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "CustomerInfo"));
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
