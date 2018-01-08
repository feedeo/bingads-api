/**
 * AgeRange.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AgeRange implements java.io.Serializable {
    public static final java.lang.String _ZeroToSeventeen = "ZeroToSeventeen";
    public static final java.lang.String _EighteenToTwentyFour = "EighteenToTwentyFour";
    public static final java.lang.String _TwentyFiveToThirtyFour = "TwentyFiveToThirtyFour";
    public static final java.lang.String _ThirtyFiveToFourtyNine = "ThirtyFiveToFourtyNine";
    public static final java.lang.String _FiftyToSixtyFour = "FiftyToSixtyFour";
    public static final java.lang.String _SixtyFiveAndAbove = "SixtyFiveAndAbove";
    public static final java.lang.String _ThirteenToSeventeen = "ThirteenToSeventeen";
    public static final AgeRange ZeroToSeventeen = new AgeRange(_ZeroToSeventeen);
    public static final AgeRange EighteenToTwentyFour = new AgeRange(_EighteenToTwentyFour);
    public static final AgeRange TwentyFiveToThirtyFour = new AgeRange(_TwentyFiveToThirtyFour);
    public static final AgeRange ThirtyFiveToFourtyNine = new AgeRange(_ThirtyFiveToFourtyNine);
    public static final AgeRange FiftyToSixtyFour = new AgeRange(_FiftyToSixtyFour);
    public static final AgeRange SixtyFiveAndAbove = new AgeRange(_SixtyFiveAndAbove);
    public static final AgeRange ThirteenToSeventeen = new AgeRange(_ThirteenToSeventeen);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AgeRange.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AgeRange"));
    }

    private java.lang.String _value_;

    // Constructor
    protected AgeRange(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static AgeRange fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        AgeRange enumeration = (AgeRange)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static AgeRange fromString(java.lang.String value)
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
