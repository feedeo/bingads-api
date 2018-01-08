/**
 * SearchCustomersResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class SearchCustomersResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SearchCustomersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchCustomersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "Customers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Customer"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.Customer[] customers;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public SearchCustomersResponse() {
    }

    public SearchCustomersResponse(
            com.microsoft.bingads.v11.customermanagement.entities.Customer[] customers) {
        this.customers = customers;
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
     * Gets the customers value for this SearchCustomersResponse.
     *
     * @return customers
     */
    public com.microsoft.bingads.v11.customermanagement.entities.Customer[] getCustomers() {
        return customers;
    }

    /**
     * Sets the customers value for this SearchCustomersResponse.
     *
     * @param customers
     */
    public void setCustomers(com.microsoft.bingads.v11.customermanagement.entities.Customer[] customers) {
        this.customers = customers;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchCustomersResponse)) return false;
        SearchCustomersResponse other = (SearchCustomersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.customers == null && other.getCustomers() == null) ||
                        (this.customers != null &&
                                java.util.Arrays.equals(this.customers, other.getCustomers())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomers() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCustomers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomers(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
