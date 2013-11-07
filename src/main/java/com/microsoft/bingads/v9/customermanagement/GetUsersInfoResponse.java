/**
 * GetUsersInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class GetUsersInfoResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.ArrayOfUserInfo usersInfo;

    public GetUsersInfoResponse() {
    }

    public GetUsersInfoResponse(
           com.microsoft.bingads.v9.customermanagement.entities.ArrayOfUserInfo usersInfo) {
           this.usersInfo = usersInfo;
    }


    /**
     * Gets the usersInfo value for this GetUsersInfoResponse.
     * 
     * @return usersInfo
     */
    public com.microsoft.bingads.v9.customermanagement.entities.ArrayOfUserInfo getUsersInfo() {
        return usersInfo;
    }


    /**
     * Sets the usersInfo value for this GetUsersInfoResponse.
     * 
     * @param usersInfo
     */
    public void setUsersInfo(com.microsoft.bingads.v9.customermanagement.entities.ArrayOfUserInfo usersInfo) {
        this.usersInfo = usersInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUsersInfoResponse)) return false;
        GetUsersInfoResponse other = (GetUsersInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usersInfo==null && other.getUsersInfo()==null) || 
             (this.usersInfo!=null &&
              this.usersInfo.equals(other.getUsersInfo())));
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
        if (getUsersInfo() != null) {
            _hashCode += getUsersInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUsersInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", ">GetUsersInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usersInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "UsersInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfUserInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
