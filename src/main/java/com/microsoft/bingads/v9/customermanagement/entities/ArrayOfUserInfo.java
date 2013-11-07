/**
 * ArrayOfUserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class ArrayOfUserInfo  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.UserInfo[] userInfo;

    public ArrayOfUserInfo() {
    }

    public ArrayOfUserInfo(
           com.microsoft.bingads.v9.customermanagement.entities.UserInfo[] userInfo) {
           this.userInfo = userInfo;
    }


    /**
     * Gets the userInfo value for this ArrayOfUserInfo.
     * 
     * @return userInfo
     */
    public com.microsoft.bingads.v9.customermanagement.entities.UserInfo[] getUserInfo() {
        return userInfo;
    }


    /**
     * Sets the userInfo value for this ArrayOfUserInfo.
     * 
     * @param userInfo
     */
    public void setUserInfo(com.microsoft.bingads.v9.customermanagement.entities.UserInfo[] userInfo) {
        this.userInfo = userInfo;
    }

    public com.microsoft.bingads.v9.customermanagement.entities.UserInfo getUserInfo(int i) {
        return this.userInfo[i];
    }

    public void setUserInfo(int i, com.microsoft.bingads.v9.customermanagement.entities.UserInfo _value) {
        this.userInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfUserInfo)) return false;
        ArrayOfUserInfo other = (ArrayOfUserInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userInfo==null && other.getUserInfo()==null) || 
             (this.userInfo!=null &&
              java.util.Arrays.equals(this.userInfo, other.getUserInfo())));
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
        if (getUserInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfUserInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfUserInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "UserInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "UserInfo"));
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
