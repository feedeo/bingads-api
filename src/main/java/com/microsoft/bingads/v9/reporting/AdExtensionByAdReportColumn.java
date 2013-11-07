/**
 * AdExtensionByAdReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class AdExtensionByAdReportColumn implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdExtensionByAdReportColumn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AccountName = "AccountName";
    public static final java.lang.String _TimePeriod = "TimePeriod";
    public static final java.lang.String _CampaignName = "CampaignName";
    public static final java.lang.String _CampaignId = "CampaignId";
    public static final java.lang.String _AdGroupName = "AdGroupName";
    public static final java.lang.String _AdGroupId = "AdGroupId";
    public static final java.lang.String _AdTitle = "AdTitle";
    public static final java.lang.String _AdId = "AdId";
    public static final java.lang.String _AdExtensionType = "AdExtensionType";
    public static final java.lang.String _DeviceType = "DeviceType";
    public static final java.lang.String _DeviceOS = "DeviceOS";
    public static final java.lang.String _ClickType = "ClickType";
    public static final java.lang.String _Impressions = "Impressions";
    public static final java.lang.String _Clicks = "Clicks";
    public static final java.lang.String _TotalClicks = "TotalClicks";
    public static final java.lang.String _Conversions = "Conversions";
    public static final java.lang.String _Ctr = "Ctr";
    public static final java.lang.String _AverageCpc = "AverageCpc";
    public static final java.lang.String _ConversionRate = "ConversionRate";
    public static final java.lang.String _Spend = "Spend";
    public static final java.lang.String _AdExtensionId = "AdExtensionId";
    public static final java.lang.String _AdExtensionVersion = "AdExtensionVersion";
    public static final java.lang.String _AccountNumber = "AccountNumber";
    public static final java.lang.String _AccountId = "AccountId";
    public static final AdExtensionByAdReportColumn AccountName = new AdExtensionByAdReportColumn(_AccountName);
    public static final AdExtensionByAdReportColumn TimePeriod = new AdExtensionByAdReportColumn(_TimePeriod);
    public static final AdExtensionByAdReportColumn CampaignName = new AdExtensionByAdReportColumn(_CampaignName);
    public static final AdExtensionByAdReportColumn CampaignId = new AdExtensionByAdReportColumn(_CampaignId);
    public static final AdExtensionByAdReportColumn AdGroupName = new AdExtensionByAdReportColumn(_AdGroupName);
    public static final AdExtensionByAdReportColumn AdGroupId = new AdExtensionByAdReportColumn(_AdGroupId);
    public static final AdExtensionByAdReportColumn AdTitle = new AdExtensionByAdReportColumn(_AdTitle);
    public static final AdExtensionByAdReportColumn AdId = new AdExtensionByAdReportColumn(_AdId);
    public static final AdExtensionByAdReportColumn AdExtensionType = new AdExtensionByAdReportColumn(_AdExtensionType);
    public static final AdExtensionByAdReportColumn DeviceType = new AdExtensionByAdReportColumn(_DeviceType);
    public static final AdExtensionByAdReportColumn DeviceOS = new AdExtensionByAdReportColumn(_DeviceOS);
    public static final AdExtensionByAdReportColumn ClickType = new AdExtensionByAdReportColumn(_ClickType);
    public static final AdExtensionByAdReportColumn Impressions = new AdExtensionByAdReportColumn(_Impressions);
    public static final AdExtensionByAdReportColumn Clicks = new AdExtensionByAdReportColumn(_Clicks);
    public static final AdExtensionByAdReportColumn TotalClicks = new AdExtensionByAdReportColumn(_TotalClicks);
    public static final AdExtensionByAdReportColumn Conversions = new AdExtensionByAdReportColumn(_Conversions);
    public static final AdExtensionByAdReportColumn Ctr = new AdExtensionByAdReportColumn(_Ctr);
    public static final AdExtensionByAdReportColumn AverageCpc = new AdExtensionByAdReportColumn(_AverageCpc);
    public static final AdExtensionByAdReportColumn ConversionRate = new AdExtensionByAdReportColumn(_ConversionRate);
    public static final AdExtensionByAdReportColumn Spend = new AdExtensionByAdReportColumn(_Spend);
    public static final AdExtensionByAdReportColumn AdExtensionId = new AdExtensionByAdReportColumn(_AdExtensionId);
    public static final AdExtensionByAdReportColumn AdExtensionVersion = new AdExtensionByAdReportColumn(_AdExtensionVersion);
    public static final AdExtensionByAdReportColumn AccountNumber = new AdExtensionByAdReportColumn(_AccountNumber);
    public static final AdExtensionByAdReportColumn AccountId = new AdExtensionByAdReportColumn(_AccountId);
    public java.lang.String getValue() { return _value_;}
    public static AdExtensionByAdReportColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdExtensionByAdReportColumn enumeration = (AdExtensionByAdReportColumn)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdExtensionByAdReportColumn fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
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
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdExtensionByAdReportColumn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByAdReportColumn"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
