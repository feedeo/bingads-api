/**
 * GeographicalLocationReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class GeographicalLocationReportColumn implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GeographicalLocationReportColumn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AccountName = "AccountName";
    public static final java.lang.String _AccountNumber = "AccountNumber";
    public static final java.lang.String _TimePeriod = "TimePeriod";
    public static final java.lang.String _CampaignName = "CampaignName";
    public static final java.lang.String _AdGroupName = "AdGroupName";
    public static final java.lang.String _Country = "Country";
    public static final java.lang.String _State = "State";
    public static final java.lang.String _MetroArea = "MetroArea";
    public static final java.lang.String _CurrencyCode = "CurrencyCode";
    public static final java.lang.String _AdDistribution = "AdDistribution";
    public static final java.lang.String _Impressions = "Impressions";
    public static final java.lang.String _Clicks = "Clicks";
    public static final java.lang.String _Ctr = "Ctr";
    public static final java.lang.String _AverageCpc = "AverageCpc";
    public static final java.lang.String _Spend = "Spend";
    public static final java.lang.String _AveragePosition = "AveragePosition";
    public static final java.lang.String _AverageCpm = "AverageCpm";
    public static final java.lang.String _ProximityTargetLocation = "ProximityTargetLocation";
    public static final java.lang.String _Radius = "Radius";
    public static final java.lang.String _Language = "Language";
    public static final java.lang.String _City = "City";
    public static final java.lang.String _QueryIntentCountry = "QueryIntentCountry";
    public static final java.lang.String _QueryIntentState = "QueryIntentState";
    public static final java.lang.String _QueryIntentCity = "QueryIntentCity";
    public static final java.lang.String _QueryIntentDMA = "QueryIntentDMA";
    public static final GeographicalLocationReportColumn AccountName = new GeographicalLocationReportColumn(_AccountName);
    public static final GeographicalLocationReportColumn AccountNumber = new GeographicalLocationReportColumn(_AccountNumber);
    public static final GeographicalLocationReportColumn TimePeriod = new GeographicalLocationReportColumn(_TimePeriod);
    public static final GeographicalLocationReportColumn CampaignName = new GeographicalLocationReportColumn(_CampaignName);
    public static final GeographicalLocationReportColumn AdGroupName = new GeographicalLocationReportColumn(_AdGroupName);
    public static final GeographicalLocationReportColumn Country = new GeographicalLocationReportColumn(_Country);
    public static final GeographicalLocationReportColumn State = new GeographicalLocationReportColumn(_State);
    public static final GeographicalLocationReportColumn MetroArea = new GeographicalLocationReportColumn(_MetroArea);
    public static final GeographicalLocationReportColumn CurrencyCode = new GeographicalLocationReportColumn(_CurrencyCode);
    public static final GeographicalLocationReportColumn AdDistribution = new GeographicalLocationReportColumn(_AdDistribution);
    public static final GeographicalLocationReportColumn Impressions = new GeographicalLocationReportColumn(_Impressions);
    public static final GeographicalLocationReportColumn Clicks = new GeographicalLocationReportColumn(_Clicks);
    public static final GeographicalLocationReportColumn Ctr = new GeographicalLocationReportColumn(_Ctr);
    public static final GeographicalLocationReportColumn AverageCpc = new GeographicalLocationReportColumn(_AverageCpc);
    public static final GeographicalLocationReportColumn Spend = new GeographicalLocationReportColumn(_Spend);
    public static final GeographicalLocationReportColumn AveragePosition = new GeographicalLocationReportColumn(_AveragePosition);
    public static final GeographicalLocationReportColumn AverageCpm = new GeographicalLocationReportColumn(_AverageCpm);
    public static final GeographicalLocationReportColumn ProximityTargetLocation = new GeographicalLocationReportColumn(_ProximityTargetLocation);
    public static final GeographicalLocationReportColumn Radius = new GeographicalLocationReportColumn(_Radius);
    public static final GeographicalLocationReportColumn Language = new GeographicalLocationReportColumn(_Language);
    public static final GeographicalLocationReportColumn City = new GeographicalLocationReportColumn(_City);
    public static final GeographicalLocationReportColumn QueryIntentCountry = new GeographicalLocationReportColumn(_QueryIntentCountry);
    public static final GeographicalLocationReportColumn QueryIntentState = new GeographicalLocationReportColumn(_QueryIntentState);
    public static final GeographicalLocationReportColumn QueryIntentCity = new GeographicalLocationReportColumn(_QueryIntentCity);
    public static final GeographicalLocationReportColumn QueryIntentDMA = new GeographicalLocationReportColumn(_QueryIntentDMA);
    public java.lang.String getValue() { return _value_;}
    public static GeographicalLocationReportColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GeographicalLocationReportColumn enumeration = (GeographicalLocationReportColumn)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GeographicalLocationReportColumn fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GeographicalLocationReportColumn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GeographicalLocationReportColumn"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
