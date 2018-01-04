/**
 * ProductOfferPerformanceReportColumn.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ProductOfferPerformanceReportColumn implements java.io.Serializable {
  public static final java.lang.String _TimePeriod = "TimePeriod";
  public static final java.lang.String _AccountName = "AccountName";
  public static final java.lang.String _AccountNumber = "AccountNumber";
  public static final java.lang.String _AdGroupName = "AdGroupName";
  public static final java.lang.String _AdGroupId = "AdGroupId";
  public static final java.lang.String _AdId = "AdId";
  public static final java.lang.String _AdStatus = "AdStatus";
  public static final java.lang.String _CampaignName = "CampaignName";
  public static final java.lang.String _CurrencyCode = "CurrencyCode";
  public static final java.lang.String _DeviceType = "DeviceType";
  public static final java.lang.String _Language = "Language";
  public static final java.lang.String _MerchantProductId = "MerchantProductId";
  public static final java.lang.String _SellerName = "SellerName";
  public static final java.lang.String _Impressions = "Impressions";
  public static final java.lang.String _Clicks = "Clicks";
  public static final java.lang.String _Ctr = "Ctr";
  public static final java.lang.String _AverageCpc = "AverageCpc";
  public static final java.lang.String _Spend = "Spend";
  public static final java.lang.String _AverageCpm = "AverageCpm";
  public static final java.lang.String _AccountStatus = "AccountStatus";
  public static final java.lang.String _CampaignStatus = "CampaignStatus";
  public static final java.lang.String _AdGroupStatus = "AdGroupStatus";
  public static final ProductOfferPerformanceReportColumn TimePeriod = new ProductOfferPerformanceReportColumn(_TimePeriod);
  public static final ProductOfferPerformanceReportColumn AccountName = new ProductOfferPerformanceReportColumn(_AccountName);
  public static final ProductOfferPerformanceReportColumn AccountNumber = new ProductOfferPerformanceReportColumn(_AccountNumber);
  public static final ProductOfferPerformanceReportColumn AdGroupName = new ProductOfferPerformanceReportColumn(_AdGroupName);
  public static final ProductOfferPerformanceReportColumn AdGroupId = new ProductOfferPerformanceReportColumn(_AdGroupId);
  public static final ProductOfferPerformanceReportColumn AdId = new ProductOfferPerformanceReportColumn(_AdId);
  public static final ProductOfferPerformanceReportColumn AdStatus = new ProductOfferPerformanceReportColumn(_AdStatus);
  public static final ProductOfferPerformanceReportColumn CampaignName = new ProductOfferPerformanceReportColumn(_CampaignName);
  public static final ProductOfferPerformanceReportColumn CurrencyCode = new ProductOfferPerformanceReportColumn(_CurrencyCode);
  public static final ProductOfferPerformanceReportColumn DeviceType = new ProductOfferPerformanceReportColumn(_DeviceType);
  public static final ProductOfferPerformanceReportColumn Language = new ProductOfferPerformanceReportColumn(_Language);
  public static final ProductOfferPerformanceReportColumn MerchantProductId = new ProductOfferPerformanceReportColumn(_MerchantProductId);
  public static final ProductOfferPerformanceReportColumn SellerName = new ProductOfferPerformanceReportColumn(_SellerName);
  public static final ProductOfferPerformanceReportColumn Impressions = new ProductOfferPerformanceReportColumn(_Impressions);
  public static final ProductOfferPerformanceReportColumn Clicks = new ProductOfferPerformanceReportColumn(_Clicks);
  public static final ProductOfferPerformanceReportColumn Ctr = new ProductOfferPerformanceReportColumn(_Ctr);
  public static final ProductOfferPerformanceReportColumn AverageCpc = new ProductOfferPerformanceReportColumn(_AverageCpc);
  public static final ProductOfferPerformanceReportColumn Spend = new ProductOfferPerformanceReportColumn(_Spend);
  public static final ProductOfferPerformanceReportColumn AverageCpm = new ProductOfferPerformanceReportColumn(_AverageCpm);
  public static final ProductOfferPerformanceReportColumn AccountStatus = new ProductOfferPerformanceReportColumn(_AccountStatus);
  public static final ProductOfferPerformanceReportColumn CampaignStatus = new ProductOfferPerformanceReportColumn(_CampaignStatus);
  public static final ProductOfferPerformanceReportColumn AdGroupStatus = new ProductOfferPerformanceReportColumn(_AdGroupStatus);
  private static java.util.HashMap _table_ = new java.util.HashMap();
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(ProductOfferPerformanceReportColumn.class);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ProductOfferPerformanceReportColumn"));
  }

  private java.lang.String _value_;

  // Constructor
  protected ProductOfferPerformanceReportColumn(java.lang.String value) {
    _value_ = value;
    _table_.put(_value_, this);
  }

  public static ProductOfferPerformanceReportColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
    ProductOfferPerformanceReportColumn enumeration = (ProductOfferPerformanceReportColumn)
            _table_.get(value);
    if (enumeration == null) throw new java.lang.IllegalArgumentException();
    return enumeration;
  }

  public static ProductOfferPerformanceReportColumn fromString(java.lang.String value)
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
