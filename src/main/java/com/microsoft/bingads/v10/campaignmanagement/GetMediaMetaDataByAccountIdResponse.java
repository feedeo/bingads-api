/**
 * GetMediaMetaDataByAccountIdResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetMediaMetaDataByAccountIdResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetMediaMetaDataByAccountIdResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaMetaDataByAccountIdResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("mediaMetaData");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaMetaData"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaMetaData"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaMetaData"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.MediaMetaData[] mediaMetaData;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetMediaMetaDataByAccountIdResponse() {
  }

  public GetMediaMetaDataByAccountIdResponse(
          com.microsoft.bingads.v10.campaignmanagement.MediaMetaData[] mediaMetaData) {
    this.mediaMetaData = mediaMetaData;
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
   * Gets the mediaMetaData value for this GetMediaMetaDataByAccountIdResponse.
   *
   * @return mediaMetaData
   */
  public com.microsoft.bingads.v10.campaignmanagement.MediaMetaData[] getMediaMetaData() {
    return mediaMetaData;
  }

  /**
   * Sets the mediaMetaData value for this GetMediaMetaDataByAccountIdResponse.
   *
   * @param mediaMetaData
   */
  public void setMediaMetaData(com.microsoft.bingads.v10.campaignmanagement.MediaMetaData[] mediaMetaData) {
    this.mediaMetaData = mediaMetaData;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetMediaMetaDataByAccountIdResponse)) return false;
    GetMediaMetaDataByAccountIdResponse other = (GetMediaMetaDataByAccountIdResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.mediaMetaData == null && other.getMediaMetaData() == null) ||
                    (this.mediaMetaData != null &&
                            java.util.Arrays.equals(this.mediaMetaData, other.getMediaMetaData())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getMediaMetaData() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getMediaMetaData());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getMediaMetaData(), i);
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
