/**
 * GetMediaAssociationsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetMediaAssociationsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetMediaAssociationsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaAssociationsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("mediaEnabledEntities");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaEnabledEntities"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaEnabledEntityFilter"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("mediaIds");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaIds"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String[] mediaEnabledEntities;
  private long[] mediaIds;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetMediaAssociationsRequest() {
  }

  public GetMediaAssociationsRequest(
          java.lang.String[] mediaEnabledEntities,
          long[] mediaIds) {
    this.mediaEnabledEntities = mediaEnabledEntities;
    this.mediaIds = mediaIds;
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
   * Gets the mediaEnabledEntities value for this GetMediaAssociationsRequest.
   *
   * @return mediaEnabledEntities
   */
  public java.lang.String[] getMediaEnabledEntities() {
    return mediaEnabledEntities;
  }

  /**
   * Sets the mediaEnabledEntities value for this GetMediaAssociationsRequest.
   *
   * @param mediaEnabledEntities
   */
  public void setMediaEnabledEntities(java.lang.String[] mediaEnabledEntities) {
    this.mediaEnabledEntities = mediaEnabledEntities;
  }

  /**
   * Gets the mediaIds value for this GetMediaAssociationsRequest.
   *
   * @return mediaIds
   */
  public long[] getMediaIds() {
    return mediaIds;
  }

  /**
   * Sets the mediaIds value for this GetMediaAssociationsRequest.
   *
   * @param mediaIds
   */
  public void setMediaIds(long[] mediaIds) {
    this.mediaIds = mediaIds;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetMediaAssociationsRequest)) return false;
    GetMediaAssociationsRequest other = (GetMediaAssociationsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.mediaEnabledEntities == null && other.getMediaEnabledEntities() == null) ||
                    (this.mediaEnabledEntities != null &&
                            java.util.Arrays.equals(this.mediaEnabledEntities, other.getMediaEnabledEntities()))) &&
            ((this.mediaIds == null && other.getMediaIds() == null) ||
                    (this.mediaIds != null &&
                            java.util.Arrays.equals(this.mediaIds, other.getMediaIds())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getMediaEnabledEntities() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getMediaEnabledEntities());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getMediaEnabledEntities(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getMediaIds() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getMediaIds());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getMediaIds(), i);
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
