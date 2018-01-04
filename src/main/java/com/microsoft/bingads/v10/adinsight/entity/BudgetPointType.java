/**
 * BudgetPointType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class BudgetPointType implements java.io.Serializable {
  private static java.util.HashMap _table_ = new java.util.HashMap();

  public static final java.lang.String _Current = "Current";
  public static final java.lang.String _Suggested = "Suggested";
  public static final java.lang.String _Maximum = "Maximum";
  public static final java.lang.String _Other = "Other";
  public static final BudgetPointType Current = new BudgetPointType(_Current);
  public static final BudgetPointType Suggested = new BudgetPointType(_Suggested);
  public static final BudgetPointType Maximum = new BudgetPointType(_Maximum);
  public static final BudgetPointType Other = new BudgetPointType(_Other);
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(BudgetPointType.class);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPointType"));
  }

  private java.lang.String _value_;

  // Constructor
  protected BudgetPointType(java.lang.String value) {
    _value_ = value;
    _table_.put(_value_, this);
  }

  public static BudgetPointType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
    BudgetPointType enumeration = (BudgetPointType)
            _table_.get(value);
    if (enumeration == null) throw new java.lang.IllegalArgumentException();
    return enumeration;
  }

  public static BudgetPointType fromString(java.lang.String value)
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
