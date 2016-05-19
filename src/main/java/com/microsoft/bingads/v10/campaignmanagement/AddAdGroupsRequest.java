/**
 * AddAdGroupsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class AddAdGroupsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AddAdGroupsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddAdGroupsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroups");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroups"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroup"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroup"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long campaignId;
  private com.microsoft.bingads.v10.campaignmanagement.AdGroup[] adGroups;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AddAdGroupsRequest() {
  }

  public AddAdGroupsRequest(
          java.lang.Long campaignId,
          com.microsoft.bingads.v10.campaignmanagement.AdGroup[] adGroups) {
    this.campaignId = campaignId;
    this.adGroups = adGroups;
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
   * Gets the campaignId value for this AddAdGroupsRequest.
   *
   * @return campaignId
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the campaignId value for this AddAdGroupsRequest.
   *
   * @param campaignId
   */
  public void setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Gets the adGroups value for this AddAdGroupsRequest.
   *
   * @return adGroups
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdGroup[] getAdGroups() {
    return adGroups;
  }

  /**
   * Sets the adGroups value for this AddAdGroupsRequest.
   *
   * @param adGroups
   */
  public void setAdGroups(com.microsoft.bingads.v10.campaignmanagement.AdGroup[] adGroups) {
    this.adGroups = adGroups;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AddAdGroupsRequest)) return false;
    AddAdGroupsRequest other = (AddAdGroupsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.campaignId == null && other.getCampaignId() == null) ||
                    (this.campaignId != null &&
                            this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adGroups == null && other.getAdGroups() == null) ||
                    (this.adGroups != null &&
                            java.util.Arrays.equals(this.adGroups, other.getAdGroups())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getCampaignId() != null) {
      _hashCode += getCampaignId().hashCode();
    }
    if (getAdGroups() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getAdGroups());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getAdGroups(), i);
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
