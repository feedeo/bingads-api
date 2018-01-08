/**
 * OrderBy.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement.entities;

public class OrderBy implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(OrderBy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "OrderBy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Field"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "OrderByField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Order"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "SortOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.OrderByField field;
    private com.microsoft.bingads.v11.customermanagement.entities.SortOrder order;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public OrderBy() {
    }


    public OrderBy(
            com.microsoft.bingads.v11.customermanagement.entities.OrderByField field,
            com.microsoft.bingads.v11.customermanagement.entities.SortOrder order) {
        this.field = field;
        this.order = order;
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
     * Gets the field value for this OrderBy.
     *
     * @return field
     */
    public com.microsoft.bingads.v11.customermanagement.entities.OrderByField getField() {
        return field;
    }

    /**
     * Sets the field value for this OrderBy.
     *
     * @param field
     */
    public void setField(com.microsoft.bingads.v11.customermanagement.entities.OrderByField field) {
        this.field = field;
    }

    /**
     * Gets the order value for this OrderBy.
     *
     * @return order
     */
    public com.microsoft.bingads.v11.customermanagement.entities.SortOrder getOrder() {
        return order;
    }

    /**
     * Sets the order value for this OrderBy.
     *
     * @param order
     */
    public void setOrder(com.microsoft.bingads.v11.customermanagement.entities.SortOrder order) {
        this.order = order;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderBy)) return false;
        OrderBy other = (OrderBy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.field == null && other.getField() == null) ||
                        (this.field != null &&
                                this.field.equals(other.getField()))) &&
                ((this.order == null && other.getOrder() == null) ||
                        (this.order != null &&
                                this.order.equals(other.getOrder())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
