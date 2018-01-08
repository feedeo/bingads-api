/**
 * GetAccessibleCustomerResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class GetAccessibleCustomerResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetAccessibleCustomerResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetAccessibleCustomerResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessibleCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "AccessibleCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ValidFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.Customer accessibleCustomer;
    private java.lang.Integer validFields;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetAccessibleCustomerResponse() {
    }


    public GetAccessibleCustomerResponse(
            com.microsoft.bingads.v11.customermanagement.entities.Customer accessibleCustomer,
            java.lang.Integer validFields) {
        this.accessibleCustomer = accessibleCustomer;
        this.validFields = validFields;
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
     * Gets the accessibleCustomer value for this GetAccessibleCustomerResponse.
     *
     * @return accessibleCustomer
     */
    public com.microsoft.bingads.v11.customermanagement.entities.Customer getAccessibleCustomer() {
        return accessibleCustomer;
    }

    /**
     * Sets the accessibleCustomer value for this GetAccessibleCustomerResponse.
     *
     * @param accessibleCustomer
     */
    public void setAccessibleCustomer(com.microsoft.bingads.v11.customermanagement.entities.Customer accessibleCustomer) {
        this.accessibleCustomer = accessibleCustomer;
    }

    /**
     * Gets the validFields value for this GetAccessibleCustomerResponse.
     *
     * @return validFields
     */
    public java.lang.Integer getValidFields() {
        return validFields;
    }

    /**
     * Sets the validFields value for this GetAccessibleCustomerResponse.
     *
     * @param validFields
     */
    public void setValidFields(java.lang.Integer validFields) {
        this.validFields = validFields;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccessibleCustomerResponse)) return false;
        GetAccessibleCustomerResponse other = (GetAccessibleCustomerResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accessibleCustomer == null && other.getAccessibleCustomer() == null) ||
                        (this.accessibleCustomer != null &&
                                this.accessibleCustomer.equals(other.getAccessibleCustomer()))) &&
                ((this.validFields == null && other.getValidFields() == null) ||
                        (this.validFields != null &&
                                this.validFields.equals(other.getValidFields())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccessibleCustomer() != null) {
            _hashCode += getAccessibleCustomer().hashCode();
        }
        if (getValidFields() != null) {
            _hashCode += getValidFields().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
