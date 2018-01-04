/**
 * AudiencePerformanceReportColumn.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class AudiencePerformanceReportColumn implements java.io.Serializable {
  public static final java.lang.String _AccountName = "AccountName";
  public static final java.lang.String _AccountNumber = "AccountNumber";
  public static final java.lang.String _AccountId = "AccountId";
  public static final java.lang.String _TimePeriod = "TimePeriod";
  public static final java.lang.String _CampaignName = "CampaignName";
  public static final java.lang.String _CampaignId = "CampaignId";
  public static final java.lang.String _AdGroupName = "AdGroupName";
  public static final java.lang.String _AdGroupId = "AdGroupId";
  public static final java.lang.String _AudienceId = "AudienceId";
  public static final java.lang.String _AudienceName = "AudienceName";
  public static final java.lang.String _AssociationStatus = "AssociationStatus";
  public static final java.lang.String _BidAdjustment = "BidAdjustment";
  public static final java.lang.String _TargetingSetting = "TargetingSetting";
  public static final java.lang.String _Impressions = "Impressions";
  public static final java.lang.String _Clicks = "Clicks";
  public static final java.lang.String _Ctr = "Ctr";
  public static final java.lang.String _AverageCpc = "AverageCpc";
  public static final java.lang.String _Spend = "Spend";
  public static final java.lang.String _AveragePosition = "AveragePosition";
  public static final java.lang.String _Conversions = "Conversions";
  public static final java.lang.String _ConversionRate = "ConversionRate";
  public static final java.lang.String _CostPerConversion = "CostPerConversion";
  public static final java.lang.String _Revenue = "Revenue";
  public static final java.lang.String _ReturnOnAdSpend = "ReturnOnAdSpend";
  public static final java.lang.String _RevenuePerConversion = "RevenuePerConversion";
  public static final java.lang.String _AccountStatus = "AccountStatus";
  public static final java.lang.String _CampaignStatus = "CampaignStatus";
  public static final java.lang.String _AdGroupStatus = "AdGroupStatus";
  public static final AudiencePerformanceReportColumn AccountName = new AudiencePerformanceReportColumn(_AccountName);
  public static final AudiencePerformanceReportColumn AccountNumber = new AudiencePerformanceReportColumn(_AccountNumber);
  public static final AudiencePerformanceReportColumn AccountId = new AudiencePerformanceReportColumn(_AccountId);
  public static final AudiencePerformanceReportColumn TimePeriod = new AudiencePerformanceReportColumn(_TimePeriod);
  public static final AudiencePerformanceReportColumn CampaignName = new AudiencePerformanceReportColumn(_CampaignName);
  public static final AudiencePerformanceReportColumn CampaignId = new AudiencePerformanceReportColumn(_CampaignId);
  public static final AudiencePerformanceReportColumn AdGroupName = new AudiencePerformanceReportColumn(_AdGroupName);
  public static final AudiencePerformanceReportColumn AdGroupId = new AudiencePerformanceReportColumn(_AdGroupId);
  public static final AudiencePerformanceReportColumn AudienceId = new AudiencePerformanceReportColumn(_AudienceId);
  public static final AudiencePerformanceReportColumn AudienceName = new AudiencePerformanceReportColumn(_AudienceName);
  public static final AudiencePerformanceReportColumn AssociationStatus = new AudiencePerformanceReportColumn(_AssociationStatus);
  public static final AudiencePerformanceReportColumn BidAdjustment = new AudiencePerformanceReportColumn(_BidAdjustment);
  public static final AudiencePerformanceReportColumn TargetingSetting = new AudiencePerformanceReportColumn(_TargetingSetting);
  public static final AudiencePerformanceReportColumn Impressions = new AudiencePerformanceReportColumn(_Impressions);
  public static final AudiencePerformanceReportColumn Clicks = new AudiencePerformanceReportColumn(_Clicks);
  public static final AudiencePerformanceReportColumn Ctr = new AudiencePerformanceReportColumn(_Ctr);
  public static final AudiencePerformanceReportColumn AverageCpc = new AudiencePerformanceReportColumn(_AverageCpc);
  public static final AudiencePerformanceReportColumn Spend = new AudiencePerformanceReportColumn(_Spend);
  public static final AudiencePerformanceReportColumn AveragePosition = new AudiencePerformanceReportColumn(_AveragePosition);
  public static final AudiencePerformanceReportColumn Conversions = new AudiencePerformanceReportColumn(_Conversions);
  public static final AudiencePerformanceReportColumn ConversionRate = new AudiencePerformanceReportColumn(_ConversionRate);
  public static final AudiencePerformanceReportColumn CostPerConversion = new AudiencePerformanceReportColumn(_CostPerConversion);
  public static final AudiencePerformanceReportColumn Revenue = new AudiencePerformanceReportColumn(_Revenue);
  public static final AudiencePerformanceReportColumn ReturnOnAdSpend = new AudiencePerformanceReportColumn(_ReturnOnAdSpend);
  public static final AudiencePerformanceReportColumn RevenuePerConversion = new AudiencePerformanceReportColumn(_RevenuePerConversion);
  public static final AudiencePerformanceReportColumn AccountStatus = new AudiencePerformanceReportColumn(_AccountStatus);
  public static final AudiencePerformanceReportColumn CampaignStatus = new AudiencePerformanceReportColumn(_CampaignStatus);
  public static final AudiencePerformanceReportColumn AdGroupStatus = new AudiencePerformanceReportColumn(_AdGroupStatus);
  private static java.util.HashMap _table_ = new java.util.HashMap();
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AudiencePerformanceReportColumn.class);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AudiencePerformanceReportColumn"));
  }

  private java.lang.String _value_;

  // Constructor
  protected AudiencePerformanceReportColumn(java.lang.String value) {
    _value_ = value;
    _table_.put(_value_, this);
  }

  public static AudiencePerformanceReportColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
    AudiencePerformanceReportColumn enumeration = (AudiencePerformanceReportColumn)
            _table_.get(value);
    if (enumeration == null) throw new java.lang.IllegalArgumentException();
    return enumeration;
  }

  public static AudiencePerformanceReportColumn fromString(java.lang.String value)
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
