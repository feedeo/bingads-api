/**
 * WebpageConditionOperand.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class WebpageConditionOperand implements java.io.Serializable {
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Url = "Url";
    public static final java.lang.String _Category = "Category";
    public static final java.lang.String _PageTitle = "PageTitle";
    public static final java.lang.String _PageContent = "PageContent";
    public static final WebpageConditionOperand Unknown = new WebpageConditionOperand(_Unknown);
    public static final WebpageConditionOperand Url = new WebpageConditionOperand(_Url);
    public static final WebpageConditionOperand Category = new WebpageConditionOperand(_Category);
    public static final WebpageConditionOperand PageTitle = new WebpageConditionOperand(_PageTitle);
    public static final WebpageConditionOperand PageContent = new WebpageConditionOperand(_PageContent);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(WebpageConditionOperand.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "WebpageConditionOperand"));
    }

    private java.lang.String _value_;

    // Constructor
    protected WebpageConditionOperand(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static WebpageConditionOperand fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        WebpageConditionOperand enumeration = (WebpageConditionOperand)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static WebpageConditionOperand fromString(java.lang.String value)
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
