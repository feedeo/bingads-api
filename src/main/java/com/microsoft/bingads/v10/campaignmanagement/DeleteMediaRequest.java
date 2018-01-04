/**
 * DeleteMediaRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class DeleteMediaRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(DeleteMediaRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteMediaRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("accountId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AccountId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

  private java.lang.Long accountId;
  private long[] mediaIds;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public DeleteMediaRequest() {
  }

  public DeleteMediaRequest(
          java.lang.Long accountId,
          long[] mediaIds) {
    this.accountId = accountId;
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
   * Gets the accountId value for this DeleteMediaRequest.
   *
   * @return accountId
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Sets the accountId value for this DeleteMediaRequest.
   *
   * @param accountId
   */
  public void setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
  }

  /**
   * Gets the mediaIds value for this DeleteMediaRequest.
   *
   * @return mediaIds
   */
  public long[] getMediaIds() {
    return mediaIds;
  }

  /**
   * Sets the mediaIds value for this DeleteMediaRequest.
   *
   * @param mediaIds
   */
  public void setMediaIds(long[] mediaIds) {
    this.mediaIds = mediaIds;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof DeleteMediaRequest)) return false;
    DeleteMediaRequest other = (DeleteMediaRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.accountId == null && other.getAccountId() == null) ||
                    (this.accountId != null &&
                            this.accountId.equals(other.getAccountId()))) &&
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
    if (getAccountId() != null) {
      _hashCode += getAccountId().hashCode();
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
