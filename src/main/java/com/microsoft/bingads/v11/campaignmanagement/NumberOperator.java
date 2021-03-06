/**
 * NumberOperator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class NumberOperator implements java.io.Serializable {
    public static final java.lang.String _None = "None";
    public static final java.lang.String _Equals = "Equals";
    public static final java.lang.String _GreaterThan = "GreaterThan";
    public static final java.lang.String _LessThan = "LessThan";
    public static final java.lang.String _GreaterThanEqualTo = "GreaterThanEqualTo";
    public static final java.lang.String _LessThanEqualTo = "LessThanEqualTo";
    public static final NumberOperator None = new NumberOperator(_None);
    public static final NumberOperator Equals = new NumberOperator(_Equals);
    public static final NumberOperator GreaterThan = new NumberOperator(_GreaterThan);
    public static final NumberOperator LessThan = new NumberOperator(_LessThan);
    public static final NumberOperator GreaterThanEqualTo = new NumberOperator(_GreaterThanEqualTo);
    public static final NumberOperator LessThanEqualTo = new NumberOperator(_LessThanEqualTo);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(NumberOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NumberOperator"));
    }

    private java.lang.String _value_;

    // Constructor
    protected NumberOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static NumberOperator fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        NumberOperator enumeration = (NumberOperator)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static NumberOperator fromString(java.lang.String value)
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
