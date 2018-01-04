/**
 * GetSharedEntitiesByAccountIdRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetSharedEntitiesByAccountIdRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetSharedEntitiesByAccountIdRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntitiesByAccountIdRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("sharedEntityType");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntityType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String sharedEntityType;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetSharedEntitiesByAccountIdRequest() {
  }

  public GetSharedEntitiesByAccountIdRequest(
          java.lang.String sharedEntityType) {
    this.sharedEntityType = sharedEntityType;
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
   * Gets the sharedEntityType value for this GetSharedEntitiesByAccountIdRequest.
   *
   * @return sharedEntityType
   */
  public java.lang.String getSharedEntityType() {
    return sharedEntityType;
  }

  /**
   * Sets the sharedEntityType value for this GetSharedEntitiesByAccountIdRequest.
   *
   * @param sharedEntityType
   */
  public void setSharedEntityType(java.lang.String sharedEntityType) {
    this.sharedEntityType = sharedEntityType;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetSharedEntitiesByAccountIdRequest)) return false;
    GetSharedEntitiesByAccountIdRequest other = (GetSharedEntitiesByAccountIdRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.sharedEntityType == null && other.getSharedEntityType() == null) ||
                    (this.sharedEntityType != null &&
                            this.sharedEntityType.equals(other.getSharedEntityType())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getSharedEntityType() != null) {
      _hashCode += getSharedEntityType().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
