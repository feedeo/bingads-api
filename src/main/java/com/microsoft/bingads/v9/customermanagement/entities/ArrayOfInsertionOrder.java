/**
 * ArrayOfInsertionOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class ArrayOfInsertionOrder  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.InsertionOrder[] insertionOrder;

    public ArrayOfInsertionOrder() {
    }

    public ArrayOfInsertionOrder(
           com.microsoft.bingads.v9.customermanagement.entities.InsertionOrder[] insertionOrder) {
           this.insertionOrder = insertionOrder;
    }


    /**
     * Gets the insertionOrder value for this ArrayOfInsertionOrder.
     * 
     * @return insertionOrder
     */
    public com.microsoft.bingads.v9.customermanagement.entities.InsertionOrder[] getInsertionOrder() {
        return insertionOrder;
    }


    /**
     * Sets the insertionOrder value for this ArrayOfInsertionOrder.
     * 
     * @param insertionOrder
     */
    public void setInsertionOrder(com.microsoft.bingads.v9.customermanagement.entities.InsertionOrder[] insertionOrder) {
        this.insertionOrder = insertionOrder;
    }

    public com.microsoft.bingads.v9.customermanagement.entities.InsertionOrder getInsertionOrder(int i) {
        return this.insertionOrder[i];
    }

    public void setInsertionOrder(int i, com.microsoft.bingads.v9.customermanagement.entities.InsertionOrder _value) {
        this.insertionOrder[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfInsertionOrder)) return false;
        ArrayOfInsertionOrder other = (ArrayOfInsertionOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertionOrder==null && other.getInsertionOrder()==null) || 
             (this.insertionOrder!=null &&
              java.util.Arrays.equals(this.insertionOrder, other.getInsertionOrder())));
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
        if (getInsertionOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsertionOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsertionOrder(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfInsertionOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfInsertionOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertionOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "InsertionOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "InsertionOrder"));
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
