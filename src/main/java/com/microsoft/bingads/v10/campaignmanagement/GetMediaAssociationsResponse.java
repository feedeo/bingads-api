/**
 * GetMediaAssociationsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetMediaAssociationsResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetMediaAssociationsResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetMediaAssociationsResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("mediaAssociations");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaAssociations"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaAssociation"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaAssociation"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("partialErrors");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PartialErrors"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.MediaAssociation[][] mediaAssociations;
  private com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetMediaAssociationsResponse() {
  }

  public GetMediaAssociationsResponse(
          com.microsoft.bingads.v10.campaignmanagement.MediaAssociation[][] mediaAssociations,
          com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors) {
    this.mediaAssociations = mediaAssociations;
    this.partialErrors = partialErrors;
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
   * Gets the mediaAssociations value for this GetMediaAssociationsResponse.
   *
   * @return mediaAssociations
   */
  public com.microsoft.bingads.v10.campaignmanagement.MediaAssociation[][] getMediaAssociations() {
    return mediaAssociations;
  }

  /**
   * Sets the mediaAssociations value for this GetMediaAssociationsResponse.
   *
   * @param mediaAssociations
   */
  public void setMediaAssociations(com.microsoft.bingads.v10.campaignmanagement.MediaAssociation[][] mediaAssociations) {
    this.mediaAssociations = mediaAssociations;
  }

  /**
   * Gets the partialErrors value for this GetMediaAssociationsResponse.
   *
   * @return partialErrors
   */
  public com.microsoft.bingads.v10.campaignmanagement.BatchError[] getPartialErrors() {
    return partialErrors;
  }

  /**
   * Sets the partialErrors value for this GetMediaAssociationsResponse.
   *
   * @param partialErrors
   */
  public void setPartialErrors(com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors) {
    this.partialErrors = partialErrors;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetMediaAssociationsResponse)) return false;
    GetMediaAssociationsResponse other = (GetMediaAssociationsResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.mediaAssociations == null && other.getMediaAssociations() == null) ||
                    (this.mediaAssociations != null &&
                            java.util.Arrays.equals(this.mediaAssociations, other.getMediaAssociations()))) &&
            ((this.partialErrors == null && other.getPartialErrors() == null) ||
                    (this.partialErrors != null &&
                            java.util.Arrays.equals(this.partialErrors, other.getPartialErrors())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getMediaAssociations() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getMediaAssociations());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getMediaAssociations(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getPartialErrors() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getPartialErrors());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getPartialErrors(), i);
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
