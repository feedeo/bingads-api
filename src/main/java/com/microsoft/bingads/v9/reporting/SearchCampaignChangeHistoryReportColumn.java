/**
 * SearchCampaignChangeHistoryReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class SearchCampaignChangeHistoryReportColumn implements java.io.Serializable {
    public static final java.lang.String _DateTime = "DateTime";
    public static final java.lang.String _AccountId = "AccountId";
    public static final java.lang.String _AccountName = "AccountName";
    public static final java.lang.String _AccountNumber = "AccountNumber";
    public static final java.lang.String _ChangedBy = "ChangedBy";
    public static final java.lang.String _CampaignName = "CampaignName";
    public static final java.lang.String _CampaignId = "CampaignId";
    public static final java.lang.String _AdGroupName = "AdGroupName";
    public static final java.lang.String _AdGroupId = "AdGroupId";
    public static final java.lang.String _AdTitle = "AdTitle";
    public static final java.lang.String _AdDescription = "AdDescription";
    public static final java.lang.String _DisplayUrl = "DisplayUrl";
    public static final java.lang.String _Keyword = "Keyword";
    public static final java.lang.String _ItemChanged = "ItemChanged";
    public static final java.lang.String _AttributeChanged = "AttributeChanged";
    public static final java.lang.String _HowChanged = "HowChanged";
    public static final java.lang.String _OldValue = "OldValue";
    public static final java.lang.String _NewValue = "NewValue";
    public static final SearchCampaignChangeHistoryReportColumn DateTime = new SearchCampaignChangeHistoryReportColumn(_DateTime);
    public static final SearchCampaignChangeHistoryReportColumn AccountId = new SearchCampaignChangeHistoryReportColumn(_AccountId);
    public static final SearchCampaignChangeHistoryReportColumn AccountName = new SearchCampaignChangeHistoryReportColumn(_AccountName);
    public static final SearchCampaignChangeHistoryReportColumn AccountNumber = new SearchCampaignChangeHistoryReportColumn(_AccountNumber);
    public static final SearchCampaignChangeHistoryReportColumn ChangedBy = new SearchCampaignChangeHistoryReportColumn(_ChangedBy);
    public static final SearchCampaignChangeHistoryReportColumn CampaignName = new SearchCampaignChangeHistoryReportColumn(_CampaignName);
    public static final SearchCampaignChangeHistoryReportColumn CampaignId = new SearchCampaignChangeHistoryReportColumn(_CampaignId);
    public static final SearchCampaignChangeHistoryReportColumn AdGroupName = new SearchCampaignChangeHistoryReportColumn(_AdGroupName);
    public static final SearchCampaignChangeHistoryReportColumn AdGroupId = new SearchCampaignChangeHistoryReportColumn(_AdGroupId);
    public static final SearchCampaignChangeHistoryReportColumn AdTitle = new SearchCampaignChangeHistoryReportColumn(_AdTitle);
    public static final SearchCampaignChangeHistoryReportColumn AdDescription = new SearchCampaignChangeHistoryReportColumn(_AdDescription);
    public static final SearchCampaignChangeHistoryReportColumn DisplayUrl = new SearchCampaignChangeHistoryReportColumn(_DisplayUrl);
    public static final SearchCampaignChangeHistoryReportColumn Keyword = new SearchCampaignChangeHistoryReportColumn(_Keyword);
    public static final SearchCampaignChangeHistoryReportColumn ItemChanged = new SearchCampaignChangeHistoryReportColumn(_ItemChanged);
    public static final SearchCampaignChangeHistoryReportColumn AttributeChanged = new SearchCampaignChangeHistoryReportColumn(_AttributeChanged);
    public static final SearchCampaignChangeHistoryReportColumn HowChanged = new SearchCampaignChangeHistoryReportColumn(_HowChanged);
    public static final SearchCampaignChangeHistoryReportColumn OldValue = new SearchCampaignChangeHistoryReportColumn(_OldValue);
    public static final SearchCampaignChangeHistoryReportColumn NewValue = new SearchCampaignChangeHistoryReportColumn(_NewValue);
    private static java.util.HashMap _table_ = new java.util.HashMap();
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SearchCampaignChangeHistoryReportColumn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchCampaignChangeHistoryReportColumn"));
    }

    private java.lang.String _value_;

    // Constructor
    protected SearchCampaignChangeHistoryReportColumn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static SearchCampaignChangeHistoryReportColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchCampaignChangeHistoryReportColumn enumeration = (SearchCampaignChangeHistoryReportColumn)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static SearchCampaignChangeHistoryReportColumn fromString(java.lang.String value)
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
