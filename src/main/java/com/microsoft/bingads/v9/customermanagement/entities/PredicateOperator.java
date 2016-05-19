/**
 * PredicateOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class PredicateOperator implements java.io.Serializable {
    public static final java.lang.String _Equals = "Equals";
    public static final java.lang.String _NotEquals = "NotEquals";
    public static final java.lang.String _Contains = "Contains";
    public static final java.lang.String _In = "In";
    public static final java.lang.String _GreaterThanEquals = "GreaterThanEquals";
    public static final java.lang.String _LessThanEquals = "LessThanEquals";
    public static final java.lang.String _StartsWith = "StartsWith";
    public static final java.lang.String _NotContains = "NotContains";
    public static final PredicateOperator Equals = new PredicateOperator(_Equals);
    public static final PredicateOperator NotEquals = new PredicateOperator(_NotEquals);
    public static final PredicateOperator Contains = new PredicateOperator(_Contains);
    public static final PredicateOperator In = new PredicateOperator(_In);
    public static final PredicateOperator GreaterThanEquals = new PredicateOperator(_GreaterThanEquals);
    public static final PredicateOperator LessThanEquals = new PredicateOperator(_LessThanEquals);
    public static final PredicateOperator StartsWith = new PredicateOperator(_StartsWith);
    public static final PredicateOperator NotContains = new PredicateOperator(_NotContains);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PredicateOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "PredicateOperator"));
    }

    private java.lang.String _value_;
    // Constructor
    protected PredicateOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static PredicateOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PredicateOperator enumeration = (PredicateOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static PredicateOperator fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }

    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }

    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    public java.lang.String getValue() {
        return _value_;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {
        return _value_;
    }

    public java.lang.Object readResolve() throws java.io.ObjectStreamException {
        return fromValue(_value_);
    }

}
