/**
 * SearchInsertionOrdersResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customerbilling;

public class SearchInsertionOrdersResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SearchInsertionOrdersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">SearchInsertionOrdersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertionOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "InsertionOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "InsertionOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "InsertionOrder"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.InsertionOrder[] insertionOrders;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public SearchInsertionOrdersResponse() {
    }

    public SearchInsertionOrdersResponse(
            com.microsoft.bingads.v11.customermanagement.entities.InsertionOrder[] insertionOrders) {
        this.insertionOrders = insertionOrders;
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
     * Gets the insertionOrders value for this SearchInsertionOrdersResponse.
     *
     * @return insertionOrders
     */
    public com.microsoft.bingads.v11.customermanagement.entities.InsertionOrder[] getInsertionOrders() {
        return insertionOrders;
    }

    /**
     * Sets the insertionOrders value for this SearchInsertionOrdersResponse.
     *
     * @param insertionOrders
     */
    public void setInsertionOrders(com.microsoft.bingads.v11.customermanagement.entities.InsertionOrder[] insertionOrders) {
        this.insertionOrders = insertionOrders;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchInsertionOrdersResponse)) return false;
        SearchInsertionOrdersResponse other = (SearchInsertionOrdersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.insertionOrders == null && other.getInsertionOrders() == null) ||
                        (this.insertionOrders != null &&
                                java.util.Arrays.equals(this.insertionOrders, other.getInsertionOrders())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInsertionOrders() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getInsertionOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsertionOrders(), i);
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
