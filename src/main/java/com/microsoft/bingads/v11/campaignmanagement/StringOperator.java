/**
 * StringOperator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class StringOperator implements java.io.Serializable {
    public static final java.lang.String _None = "None";
    public static final java.lang.String _Equals = "Equals";
    public static final java.lang.String _Contains = "Contains";
    public static final java.lang.String _BeginsWith = "BeginsWith";
    public static final java.lang.String _EndsWith = "EndsWith";
    public static final java.lang.String _NotEquals = "NotEquals";
    public static final java.lang.String _DoesNotContain = "DoesNotContain";
    public static final java.lang.String _DoesNotBeginWith = "DoesNotBeginWith";
    public static final java.lang.String _DoesNotEndWith = "DoesNotEndWith";
    public static final StringOperator None = new StringOperator(_None);
    public static final StringOperator Equals = new StringOperator(_Equals);
    public static final StringOperator Contains = new StringOperator(_Contains);
    public static final StringOperator BeginsWith = new StringOperator(_BeginsWith);
    public static final StringOperator EndsWith = new StringOperator(_EndsWith);
    public static final StringOperator NotEquals = new StringOperator(_NotEquals);
    public static final StringOperator DoesNotContain = new StringOperator(_DoesNotContain);
    public static final StringOperator DoesNotBeginWith = new StringOperator(_DoesNotBeginWith);
    public static final StringOperator DoesNotEndWith = new StringOperator(_DoesNotEndWith);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(StringOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StringOperator"));
    }

    private java.lang.String _value_;

    // Constructor
    protected StringOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static StringOperator fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        StringOperator enumeration = (StringOperator)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static StringOperator fromString(java.lang.String value)
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
