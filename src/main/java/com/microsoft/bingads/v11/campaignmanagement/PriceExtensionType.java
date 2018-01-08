/**
 * PriceExtensionType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class PriceExtensionType implements java.io.Serializable {
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Brands = "Brands";
    public static final java.lang.String _Events = "Events";
    public static final java.lang.String _Locations = "Locations";
    public static final java.lang.String _Neighborhoods = "Neighborhoods";
    public static final java.lang.String _ProductCategories = "ProductCategories";
    public static final java.lang.String _ProductTiers = "ProductTiers";
    public static final java.lang.String _Services = "Services";
    public static final java.lang.String _ServiceCategories = "ServiceCategories";
    public static final java.lang.String _ServiceTiers = "ServiceTiers";
    public static final PriceExtensionType Unknown = new PriceExtensionType(_Unknown);
    public static final PriceExtensionType Brands = new PriceExtensionType(_Brands);
    public static final PriceExtensionType Events = new PriceExtensionType(_Events);
    public static final PriceExtensionType Locations = new PriceExtensionType(_Locations);
    public static final PriceExtensionType Neighborhoods = new PriceExtensionType(_Neighborhoods);
    public static final PriceExtensionType ProductCategories = new PriceExtensionType(_ProductCategories);
    public static final PriceExtensionType ProductTiers = new PriceExtensionType(_ProductTiers);
    public static final PriceExtensionType Services = new PriceExtensionType(_Services);
    public static final PriceExtensionType ServiceCategories = new PriceExtensionType(_ServiceCategories);
    public static final PriceExtensionType ServiceTiers = new PriceExtensionType(_ServiceTiers);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PriceExtensionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceExtensionType"));
    }

    private java.lang.String _value_;

    // Constructor
    protected PriceExtensionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static PriceExtensionType fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        PriceExtensionType enumeration = (PriceExtensionType)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static PriceExtensionType fromString(java.lang.String value)
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
