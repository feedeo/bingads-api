/**
 * GetAdGroupsByIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetAdGroupsByIdsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetAdGroupsByIdsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetAdGroupsByIdsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupIds");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupIds"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("returnAdditionalFields");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ReturnAdditionalFields"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupAdditionalField"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long campaignId;
  private long[] adGroupIds;
  private java.lang.String[] returnAdditionalFields;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetAdGroupsByIdsRequest() {
  }

  public GetAdGroupsByIdsRequest(
          java.lang.Long campaignId,
          long[] adGroupIds,
          java.lang.String[] returnAdditionalFields) {
    this.campaignId = campaignId;
    this.adGroupIds = adGroupIds;
    this.returnAdditionalFields = returnAdditionalFields;
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
   * Gets the campaignId value for this GetAdGroupsByIdsRequest.
   *
   * @return campaignId
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the campaignId value for this GetAdGroupsByIdsRequest.
   *
   * @param campaignId
   */
  public void setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Gets the adGroupIds value for this GetAdGroupsByIdsRequest.
   *
   * @return adGroupIds
   */
  public long[] getAdGroupIds() {
    return adGroupIds;
  }

  /**
   * Sets the adGroupIds value for this GetAdGroupsByIdsRequest.
   *
   * @param adGroupIds
   */
  public void setAdGroupIds(long[] adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   * Gets the returnAdditionalFields value for this GetAdGroupsByIdsRequest.
   *
   * @return returnAdditionalFields
   */
  public java.lang.String[] getReturnAdditionalFields() {
    return returnAdditionalFields;
  }

  /**
   * Sets the returnAdditionalFields value for this GetAdGroupsByIdsRequest.
   *
   * @param returnAdditionalFields
   */
  public void setReturnAdditionalFields(java.lang.String[] returnAdditionalFields) {
    this.returnAdditionalFields = returnAdditionalFields;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetAdGroupsByIdsRequest)) return false;
    GetAdGroupsByIdsRequest other = (GetAdGroupsByIdsRequest) obj;
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
            ((this.adGroupIds == null && other.getAdGroupIds() == null) ||
                    (this.adGroupIds != null &&
                            java.util.Arrays.equals(this.adGroupIds, other.getAdGroupIds()))) &&
            ((this.returnAdditionalFields == null && other.getReturnAdditionalFields() == null) ||
                    (this.returnAdditionalFields != null &&
                            java.util.Arrays.equals(this.returnAdditionalFields, other.getReturnAdditionalFields())));
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
    if (getAdGroupIds() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getAdGroupIds());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupIds(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getReturnAdditionalFields() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getReturnAdditionalFields());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getReturnAdditionalFields(), i);
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
