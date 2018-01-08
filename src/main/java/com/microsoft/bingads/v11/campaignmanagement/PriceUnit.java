/**
 * PriceUnit.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class PriceUnit implements java.io.Serializable {
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _PerHour = "PerHour";
    public static final java.lang.String _PerDay = "PerDay";
    public static final java.lang.String _PerWeek = "PerWeek";
    public static final java.lang.String _PerMonth = "PerMonth";
    public static final java.lang.String _PerYear = "PerYear";
    public static final java.lang.String _None = "None";
    public static final java.lang.String _PerNight = "PerNight";
    public static final PriceUnit Unknown = new PriceUnit(_Unknown);
    public static final PriceUnit PerHour = new PriceUnit(_PerHour);
    public static final PriceUnit PerDay = new PriceUnit(_PerDay);
    public static final PriceUnit PerWeek = new PriceUnit(_PerWeek);
    public static final PriceUnit PerMonth = new PriceUnit(_PerMonth);
    public static final PriceUnit PerYear = new PriceUnit(_PerYear);
    public static final PriceUnit None = new PriceUnit(_None);
    public static final PriceUnit PerNight = new PriceUnit(_PerNight);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PriceUnit.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceUnit"));
    }

    private java.lang.String _value_;

    // Constructor
    protected PriceUnit(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static PriceUnit fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        PriceUnit enumeration = (PriceUnit)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static PriceUnit fromString(java.lang.String value)
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
