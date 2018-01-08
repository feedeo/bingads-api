/**
 * PriceQualifier.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class PriceQualifier implements java.io.Serializable {
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _From = "From";
    public static final java.lang.String _UpTo = "UpTo";
    public static final java.lang.String _None = "None";
    public static final java.lang.String _Average = "Average";
    public static final PriceQualifier Unknown = new PriceQualifier(_Unknown);
    public static final PriceQualifier From = new PriceQualifier(_From);
    public static final PriceQualifier UpTo = new PriceQualifier(_UpTo);
    public static final PriceQualifier None = new PriceQualifier(_None);
    public static final PriceQualifier Average = new PriceQualifier(_Average);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PriceQualifier.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceQualifier"));
    }

    private java.lang.String _value_;

    // Constructor
    protected PriceQualifier(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static PriceQualifier fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        PriceQualifier enumeration = (PriceQualifier)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static PriceQualifier fromString(java.lang.String value)
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
