/**
 * GetMediaMetaDataByAccountIdRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetMediaMetaDataByAccountIdRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetMediaMetaDataByAccountIdRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaMetaDataByAccountIdRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("mediaEnabledEntities");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaEnabledEntities"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaEnabledEntityFilter"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String[] mediaEnabledEntities;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetMediaMetaDataByAccountIdRequest() {
  }

  public GetMediaMetaDataByAccountIdRequest(
          java.lang.String[] mediaEnabledEntities) {
    this.mediaEnabledEntities = mediaEnabledEntities;
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
   * Gets the mediaEnabledEntities value for this GetMediaMetaDataByAccountIdRequest.
   *
   * @return mediaEnabledEntities
   */
  public java.lang.String[] getMediaEnabledEntities() {
    return mediaEnabledEntities;
  }

  /**
   * Sets the mediaEnabledEntities value for this GetMediaMetaDataByAccountIdRequest.
   *
   * @param mediaEnabledEntities
   */
  public void setMediaEnabledEntities(java.lang.String[] mediaEnabledEntities) {
    this.mediaEnabledEntities = mediaEnabledEntities;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetMediaMetaDataByAccountIdRequest)) return false;
    GetMediaMetaDataByAccountIdRequest other = (GetMediaMetaDataByAccountIdRequest) obj;
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
                            java.util.Arrays.equals(this.mediaEnabledEntities, other.getMediaEnabledEntities())));
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
    __hashCodeCalc = false;
    return _hashCode;
  }

}
