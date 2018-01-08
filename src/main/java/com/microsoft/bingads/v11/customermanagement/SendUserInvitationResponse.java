/**
 * SendUserInvitationResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class SendUserInvitationResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SendUserInvitationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SendUserInvitationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInvitationId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UserInvitationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long userInvitationId;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public SendUserInvitationResponse() {
    }

    public SendUserInvitationResponse(
            java.lang.Long userInvitationId) {
        this.userInvitationId = userInvitationId;
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
                new org.apache.axis.encoding.ser.BeanSerializer(
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
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the userInvitationId value for this SendUserInvitationResponse.
     *
     * @return userInvitationId
     */
    public java.lang.Long getUserInvitationId() {
        return userInvitationId;
    }

    /**
     * Sets the userInvitationId value for this SendUserInvitationResponse.
     *
     * @param userInvitationId
     */
    public void setUserInvitationId(java.lang.Long userInvitationId) {
        this.userInvitationId = userInvitationId;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendUserInvitationResponse)) return false;
        SendUserInvitationResponse other = (SendUserInvitationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.userInvitationId == null && other.getUserInvitationId() == null) ||
                        (this.userInvitationId != null &&
                                this.userInvitationId.equals(other.getUserInvitationId())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUserInvitationId() != null) {
            _hashCode += getUserInvitationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
