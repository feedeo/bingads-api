/**
 * InsertionOrderStatus.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class InsertionOrderStatus implements java.io.Serializable {
  public static final java.lang.String _PendingSystemReview = "PendingSystemReview";
  public static final java.lang.String _PendingUserReview = "PendingUserReview";
  public static final java.lang.String _Active = "Active";
  public static final java.lang.String _Declined = "Declined";
  public static final java.lang.String _Expired = "Expired";
  public static final java.lang.String _Canceled = "Canceled";
  public static final InsertionOrderStatus PendingSystemReview = new InsertionOrderStatus(_PendingSystemReview);
  public static final InsertionOrderStatus PendingUserReview = new InsertionOrderStatus(_PendingUserReview);
  public static final InsertionOrderStatus Active = new InsertionOrderStatus(_Active);
  public static final InsertionOrderStatus Declined = new InsertionOrderStatus(_Declined);
  public static final InsertionOrderStatus Expired = new InsertionOrderStatus(_Expired);
  public static final InsertionOrderStatus Canceled = new InsertionOrderStatus(_Canceled);
  private static java.util.HashMap _table_ = new java.util.HashMap();
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(InsertionOrderStatus.class);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "InsertionOrderStatus"));
  }

  private java.lang.String _value_;

  // Constructor
  protected InsertionOrderStatus(java.lang.String value) {
    _value_ = value;
    _table_.put(_value_, this);
  }

  public static InsertionOrderStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
    InsertionOrderStatus enumeration = (InsertionOrderStatus)
            _table_.get(value);
    if (enumeration == null) throw new java.lang.IllegalArgumentException();
    return enumeration;
  }

  public static InsertionOrderStatus fromString(java.lang.String value)
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
