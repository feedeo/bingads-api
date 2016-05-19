/**
 * UpdateClientLinksRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class UpdateClientLinksRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(UpdateClientLinksRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", ">UpdateClientLinksRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("clientLinks");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "ClientLinks"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ClientLink"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ClientLink"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v9.customermanagement.entities.ClientLink[] clientLinks;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public UpdateClientLinksRequest() {
  }

  public UpdateClientLinksRequest(
          com.microsoft.bingads.v9.customermanagement.entities.ClientLink[] clientLinks) {
    this.clientLinks = clientLinks;
  }

  /**
   * Return type metadata object
   */
  public static org.apache.axis.description.TypeDesc getTypeDesc() {
    return typeDesc;
  }

  /**
   * Get Custom Serializer
   */
  public static org.apache.axis.encoding.Serializer getSerializer(
          java.lang.String mechType,
          java.lang.Class _javaType,
          javax.xml.namespace.QName _xmlType) {
    return
            new org.apache.axis.encoding.ser.BeanSerializer(
                    _javaType, _xmlType, typeDesc);
  }

  /**
   * Get Custom Deserializer
   */
  public static org.apache.axis.encoding.Deserializer getDeserializer(
          java.lang.String mechType,
          java.lang.Class _javaType,
          javax.xml.namespace.QName _xmlType) {
    return
            new org.apache.axis.encoding.ser.BeanDeserializer(
                    _javaType, _xmlType, typeDesc);
  }

  /**
   * Gets the clientLinks value for this UpdateClientLinksRequest.
   *
   * @return clientLinks
   */
  public com.microsoft.bingads.v9.customermanagement.entities.ClientLink[] getClientLinks() {
    return clientLinks;
  }

  /**
   * Sets the clientLinks value for this UpdateClientLinksRequest.
   *
   * @param clientLinks
   */
  public void setClientLinks(com.microsoft.bingads.v9.customermanagement.entities.ClientLink[] clientLinks) {
    this.clientLinks = clientLinks;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof UpdateClientLinksRequest)) return false;
    UpdateClientLinksRequest other = (UpdateClientLinksRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.clientLinks == null && other.getClientLinks() == null) ||
                    (this.clientLinks != null &&
                            java.util.Arrays.equals(this.clientLinks, other.getClientLinks())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getClientLinks() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getClientLinks());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getClientLinks(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
