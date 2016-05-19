/**
 * Field.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class Field implements java.io.Serializable {
  public static final java.lang.String _UNKNOW = "UNKNOW";
  public static final java.lang.String _BidLandscape = "BidLandscape";
  public static final java.lang.String _BidSuggestion = "BidSuggestion";
  public static final java.lang.String _EntityAuctionInsight = "EntityAuctionInsight";
  public static final java.lang.String _AggregatedAuctionInsight = "AggregatedAuctionInsight";
  public static final java.lang.String _AuctionInsightAvailableChildren = "AuctionInsightAvailableChildren";
  public static final java.lang.String _TopMover = "TopMover";
  public static final java.lang.String _AccountId = "AccountId";
  public static final java.lang.String _CampaignId = "CampaignId";
  public static final java.lang.String _AdGroupId = "AdGroupId";
  public static final java.lang.String _KeywordId = "KeywordId";
  public static final java.lang.String _TimeInterval = "TimeInterval";
  public static final Field UNKNOW = new Field(_UNKNOW);
  public static final Field BidLandscape = new Field(_BidLandscape);
  public static final Field BidSuggestion = new Field(_BidSuggestion);
  public static final Field EntityAuctionInsight = new Field(_EntityAuctionInsight);
  public static final Field AggregatedAuctionInsight = new Field(_AggregatedAuctionInsight);
  public static final Field AuctionInsightAvailableChildren = new Field(_AuctionInsightAvailableChildren);
  public static final Field TopMover = new Field(_TopMover);
  public static final Field AccountId = new Field(_AccountId);
  public static final Field CampaignId = new Field(_CampaignId);
  public static final Field AdGroupId = new Field(_AdGroupId);
  public static final Field KeywordId = new Field(_KeywordId);
  public static final Field TimeInterval = new Field(_TimeInterval);
  private static java.util.HashMap _table_ = new java.util.HashMap();
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(Field.class);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field"));
  }

  private java.lang.String _value_;

  // Constructor
  protected Field(java.lang.String value) {
    _value_ = value;
    _table_.put(_value_, this);
  }

  public static Field fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
    Field enumeration = (Field)
            _table_.get(value);
    if (enumeration == null) throw new java.lang.IllegalArgumentException();
    return enumeration;
  }

  public static Field fromString(java.lang.String value)
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
