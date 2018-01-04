/**
 * MigrationStatus.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class MigrationStatus implements java.io.Serializable {
  private static java.util.HashMap _table_ = new java.util.HashMap();

  public static final java.lang.String _NotInPilot = "NotInPilot";
  public static final java.lang.String _NotStarted = "NotStarted";
  public static final java.lang.String _InProgress = "InProgress";
  public static final java.lang.String _Completed = "Completed";
  public static final MigrationStatus NotInPilot = new MigrationStatus(_NotInPilot);
  public static final MigrationStatus NotStarted = new MigrationStatus(_NotStarted);
  public static final MigrationStatus InProgress = new MigrationStatus(_InProgress);
  public static final MigrationStatus Completed = new MigrationStatus(_Completed);
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(MigrationStatus.class);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MigrationStatus"));
  }

  private java.lang.String _value_;

  // Constructor
  protected MigrationStatus(java.lang.String value) {
    _value_ = value;
    _table_.put(_value_, this);
  }

  public static MigrationStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
    MigrationStatus enumeration = (MigrationStatus)
            _table_.get(value);
    if (enumeration == null) throw new java.lang.IllegalArgumentException();
    return enumeration;
  }

  public static MigrationStatus fromString(java.lang.String value)
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
