/**
 * Predicate.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement.entities;

public class Predicate implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Predicate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Predicate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "PredicateOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String field;
    private com.microsoft.bingads.v11.customermanagement.entities.PredicateOperator operator;
    private java.lang.String value;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public Predicate() {
    }


    public Predicate(
            java.lang.String field,
            com.microsoft.bingads.v11.customermanagement.entities.PredicateOperator operator,
            java.lang.String value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
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
     * Gets the field value for this Predicate.
     *
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }

    /**
     * Sets the field value for this Predicate.
     *
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }

    /**
     * Gets the operator value for this Predicate.
     *
     * @return operator
     */
    public com.microsoft.bingads.v11.customermanagement.entities.PredicateOperator getOperator() {
        return operator;
    }

    /**
     * Sets the operator value for this Predicate.
     *
     * @param operator
     */
    public void setOperator(com.microsoft.bingads.v11.customermanagement.entities.PredicateOperator operator) {
        this.operator = operator;
    }

    /**
     * Gets the value value for this Predicate.
     *
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Sets the value value for this Predicate.
     *
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Predicate)) return false;
        Predicate other = (Predicate) obj;
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
                ((this.operator == null && other.getOperator() == null) ||
                        (this.operator != null &&
                                this.operator.equals(other.getOperator()))) &&
                ((this.value == null && other.getValue() == null) ||
                        (this.value != null &&
                                this.value.equals(other.getValue())));
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
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
