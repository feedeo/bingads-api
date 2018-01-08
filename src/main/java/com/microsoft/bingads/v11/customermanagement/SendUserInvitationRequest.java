/**
 * SendUserInvitationRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class SendUserInvitationRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SendUserInvitationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SendUserInvitationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInvitation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "UserInvitation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserInvitation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.UserInvitation userInvitation;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public SendUserInvitationRequest() {
    }

    public SendUserInvitationRequest(
            com.microsoft.bingads.v11.customermanagement.entities.UserInvitation userInvitation) {
        this.userInvitation = userInvitation;
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
     * Gets the userInvitation value for this SendUserInvitationRequest.
     *
     * @return userInvitation
     */
    public com.microsoft.bingads.v11.customermanagement.entities.UserInvitation getUserInvitation() {
        return userInvitation;
    }

    /**
     * Sets the userInvitation value for this SendUserInvitationRequest.
     *
     * @param userInvitation
     */
    public void setUserInvitation(com.microsoft.bingads.v11.customermanagement.entities.UserInvitation userInvitation) {
        this.userInvitation = userInvitation;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendUserInvitationRequest)) return false;
        SendUserInvitationRequest other = (SendUserInvitationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.userInvitation == null && other.getUserInvitation() == null) ||
                        (this.userInvitation != null &&
                                this.userInvitation.equals(other.getUserInvitation())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUserInvitation() != null) {
            _hashCode += getUserInvitation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
