/**
 * UpdateCustomerRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class UpdateCustomerRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateCustomerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">UpdateCustomerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.Customer customer;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public UpdateCustomerRequest() {
    }

    public UpdateCustomerRequest(
            com.microsoft.bingads.v11.customermanagement.entities.Customer customer) {
        this.customer = customer;
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
     * Gets the customer value for this UpdateCustomerRequest.
     *
     * @return customer
     */
    public com.microsoft.bingads.v11.customermanagement.entities.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer value for this UpdateCustomerRequest.
     *
     * @param customer
     */
    public void setCustomer(com.microsoft.bingads.v11.customermanagement.entities.Customer customer) {
        this.customer = customer;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCustomerRequest)) return false;
        UpdateCustomerRequest other = (UpdateCustomerRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.customer == null && other.getCustomer() == null) ||
                        (this.customer != null &&
                                this.customer.equals(other.getCustomer())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
