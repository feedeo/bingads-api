/**
 * AdType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AdType implements java.io.Serializable {
    public static final java.lang.String _Text = "Text";
    public static final java.lang.String _Image = "Image";
    public static final java.lang.String _Product = "Product";
    public static final java.lang.String _AppInstall = "AppInstall";
    public static final java.lang.String _ExpandedText = "ExpandedText";
    public static final java.lang.String _DynamicSearch = "DynamicSearch";
    public static final AdType Text = new AdType(_Text);
    public static final AdType Image = new AdType(_Image);
    public static final AdType Product = new AdType(_Product);
    public static final AdType AppInstall = new AdType(_AppInstall);
    public static final AdType ExpandedText = new AdType(_ExpandedText);
    public static final AdType DynamicSearch = new AdType(_DynamicSearch);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdType"));
    }

    private java.lang.String _value_;

    // Constructor
    protected AdType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static AdType fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        AdType enumeration = (AdType)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static AdType fromString(java.lang.String value)
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
