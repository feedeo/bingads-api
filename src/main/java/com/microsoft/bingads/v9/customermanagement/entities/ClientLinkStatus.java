/**
 * ClientLinkStatus.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class ClientLinkStatus implements java.io.Serializable {
  private static java.util.HashMap _table_ = new java.util.HashMap();

  public static final java.lang.String _LinkPending = "LinkPending";
  public static final java.lang.String _LinkCanceled = "LinkCanceled";
  public static final java.lang.String _LinkExpired = "LinkExpired";
  public static final java.lang.String _LinkAccepted = "LinkAccepted";
  public static final java.lang.String _LinkDeclined = "LinkDeclined";
  public static final java.lang.String _LinkInProgress = "LinkInProgress";
  public static final java.lang.String _Active = "Active";
  public static final java.lang.String _LinkFailed = "LinkFailed";
  public static final java.lang.String _UnlinkRequested = "UnlinkRequested";
  public static final java.lang.String _UnlinkPending = "UnlinkPending";
  public static final java.lang.String _UnlinkCanceled = "UnlinkCanceled";
  public static final java.lang.String _UnlinkInProgress = "UnlinkInProgress";
  public static final java.lang.String _Inactive = "Inactive";
  public static final java.lang.String _UnlinkFailed = "UnlinkFailed";
  public static final ClientLinkStatus LinkPending = new ClientLinkStatus(_LinkPending);
  public static final ClientLinkStatus LinkCanceled = new ClientLinkStatus(_LinkCanceled);
  public static final ClientLinkStatus LinkExpired = new ClientLinkStatus(_LinkExpired);
  public static final ClientLinkStatus LinkAccepted = new ClientLinkStatus(_LinkAccepted);
  public static final ClientLinkStatus LinkDeclined = new ClientLinkStatus(_LinkDeclined);
  public static final ClientLinkStatus LinkInProgress = new ClientLinkStatus(_LinkInProgress);
  public static final ClientLinkStatus Active = new ClientLinkStatus(_Active);
  public static final ClientLinkStatus LinkFailed = new ClientLinkStatus(_LinkFailed);
  public static final ClientLinkStatus UnlinkRequested = new ClientLinkStatus(_UnlinkRequested);
  public static final ClientLinkStatus UnlinkPending = new ClientLinkStatus(_UnlinkPending);
  public static final ClientLinkStatus UnlinkCanceled = new ClientLinkStatus(_UnlinkCanceled);
  public static final ClientLinkStatus UnlinkInProgress = new ClientLinkStatus(_UnlinkInProgress);
  public static final ClientLinkStatus Inactive = new ClientLinkStatus(_Inactive);
  public static final ClientLinkStatus UnlinkFailed = new ClientLinkStatus(_UnlinkFailed);
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(ClientLinkStatus.class);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ClientLinkStatus"));
  }

  private java.lang.String _value_;

  // Constructor
  protected ClientLinkStatus(java.lang.String value) {
    _value_ = value;
    _table_.put(_value_, this);
  }

  public static ClientLinkStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
    ClientLinkStatus enumeration = (ClientLinkStatus)
            _table_.get(value);
    if (enumeration == null) throw new java.lang.IllegalArgumentException();
    return enumeration;
  }

  public static ClientLinkStatus fromString(java.lang.String value)
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
