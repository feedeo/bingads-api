/**
 * CallDetailReportColumn.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class CallDetailReportColumn implements java.io.Serializable {
    public static final java.lang.String _AccountName = "AccountName";
    public static final java.lang.String _CampaignName = "CampaignName";
    public static final java.lang.String _AdGroupName = "AdGroupName";
    public static final java.lang.String _StartTime = "StartTime";
    public static final java.lang.String _EndTime = "EndTime";
    public static final java.lang.String _Duration = "Duration";
    public static final java.lang.String _CallStatus = "CallStatus";
    public static final java.lang.String _CallTypeName = "CallTypeName";
    public static final java.lang.String _AreaCode = "AreaCode";
    public static final java.lang.String _City = "City";
    public static final java.lang.String _State = "State";
    public static final java.lang.String _AccountId = "AccountId";
    public static final java.lang.String _CampaignId = "CampaignId";
    public static final java.lang.String _AdGroupId = "AdGroupId";
    public static final java.lang.String _AccountStatus = "AccountStatus";
    public static final java.lang.String _CampaignStatus = "CampaignStatus";
    public static final java.lang.String _AdGroupStatus = "AdGroupStatus";
    public static final CallDetailReportColumn AccountName = new CallDetailReportColumn(_AccountName);
    public static final CallDetailReportColumn CampaignName = new CallDetailReportColumn(_CampaignName);
    public static final CallDetailReportColumn AdGroupName = new CallDetailReportColumn(_AdGroupName);
    public static final CallDetailReportColumn StartTime = new CallDetailReportColumn(_StartTime);
    public static final CallDetailReportColumn EndTime = new CallDetailReportColumn(_EndTime);
    public static final CallDetailReportColumn Duration = new CallDetailReportColumn(_Duration);
    public static final CallDetailReportColumn CallStatus = new CallDetailReportColumn(_CallStatus);
    public static final CallDetailReportColumn CallTypeName = new CallDetailReportColumn(_CallTypeName);
    public static final CallDetailReportColumn AreaCode = new CallDetailReportColumn(_AreaCode);
    public static final CallDetailReportColumn City = new CallDetailReportColumn(_City);
    public static final CallDetailReportColumn State = new CallDetailReportColumn(_State);
    public static final CallDetailReportColumn AccountId = new CallDetailReportColumn(_AccountId);
    public static final CallDetailReportColumn CampaignId = new CallDetailReportColumn(_CampaignId);
    public static final CallDetailReportColumn AdGroupId = new CallDetailReportColumn(_AdGroupId);
    public static final CallDetailReportColumn AccountStatus = new CallDetailReportColumn(_AccountStatus);
    public static final CallDetailReportColumn CampaignStatus = new CallDetailReportColumn(_CampaignStatus);
    public static final CallDetailReportColumn AdGroupStatus = new CallDetailReportColumn(_AdGroupStatus);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CallDetailReportColumn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CallDetailReportColumn"));
    }

    private java.lang.String _value_;

    // Constructor
    protected CallDetailReportColumn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static CallDetailReportColumn fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        CallDetailReportColumn enumeration = (CallDetailReportColumn)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static CallDetailReportColumn fromString(java.lang.String value)
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
