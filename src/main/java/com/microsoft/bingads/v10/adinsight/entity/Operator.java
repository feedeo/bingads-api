/**
 * Operator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class Operator implements java.io.Serializable {
  private static java.util.HashMap _table_ = new java.util.HashMap();

  public static final java.lang.String _EQUALS = "EQUALS";
  public static final java.lang.String _NOT_EQUALS = "NOT_EQUALS";
  public static final java.lang.String _IN = "IN";
  public static final java.lang.String _NOT_IN = "NOT_IN";
  public static final java.lang.String _GREATER_THAN = "GREATER_THAN";
  public static final java.lang.String _GREATER_THAN_EQUALS = "GREATER_THAN_EQUALS";
  public static final java.lang.String _LESS_THAN = "LESS_THAN";
  public static final java.lang.String _LESS_THAN_EQUALS = "LESS_THAN_EQUALS";
  public static final java.lang.String _STARTS_WITH = "STARTS_WITH";
  public static final java.lang.String _STARTS_WITH_IGNORE_CASE = "STARTS_WITH_IGNORE_CASE";
  public static final java.lang.String _CONTAINS = "CONTAINS";
  public static final java.lang.String _CONTAINS_IGNORE_CASE = "CONTAINS_IGNORE_CASE";
  public static final java.lang.String _DOES_NOT_CONTAIN = "DOES_NOT_CONTAIN";
  public static final java.lang.String _DOES_NOT_CONTAIN_IGNORE_CASE = "DOES_NOT_CONTAIN_IGNORE_CASE";
  public static final java.lang.String _UNKNOWN = "UNKNOWN";
  public static final Operator EQUALS = new Operator(_EQUALS);
  public static final Operator NOT_EQUALS = new Operator(_NOT_EQUALS);
  public static final Operator IN = new Operator(_IN);
  public static final Operator NOT_IN = new Operator(_NOT_IN);
  public static final Operator GREATER_THAN = new Operator(_GREATER_THAN);
  public static final Operator GREATER_THAN_EQUALS = new Operator(_GREATER_THAN_EQUALS);
  public static final Operator LESS_THAN = new Operator(_LESS_THAN);
  public static final Operator LESS_THAN_EQUALS = new Operator(_LESS_THAN_EQUALS);
  public static final Operator STARTS_WITH = new Operator(_STARTS_WITH);
  public static final Operator STARTS_WITH_IGNORE_CASE = new Operator(_STARTS_WITH_IGNORE_CASE);
  public static final Operator CONTAINS = new Operator(_CONTAINS);
  public static final Operator CONTAINS_IGNORE_CASE = new Operator(_CONTAINS_IGNORE_CASE);
  public static final Operator DOES_NOT_CONTAIN = new Operator(_DOES_NOT_CONTAIN);
  public static final Operator DOES_NOT_CONTAIN_IGNORE_CASE = new Operator(_DOES_NOT_CONTAIN_IGNORE_CASE);
  public static final Operator UNKNOWN = new Operator(_UNKNOWN);
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(Operator.class);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Operator"));
  }

  private java.lang.String _value_;

  // Constructor
  protected Operator(java.lang.String value) {
    _value_ = value;
    _table_.put(_value_, this);
  }

  public static Operator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
    Operator enumeration = (Operator)
            _table_.get(value);
    if (enumeration == null) throw new java.lang.IllegalArgumentException();
    return enumeration;
  }

  public static Operator fromString(java.lang.String value)
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
