/**
 * DeleteCampaignCriterionsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class DeleteCampaignCriterionsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(DeleteCampaignCriterionsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteCampaignCriterionsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignCriterionIds");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignCriterionIds"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("criterionType");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CriterionType"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignCriterionType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private long[] campaignCriterionIds;
  private java.lang.String[] criterionType;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public DeleteCampaignCriterionsRequest() {
  }

  public DeleteCampaignCriterionsRequest(
          long[] campaignCriterionIds,
          java.lang.String[] criterionType) {
    this.campaignCriterionIds = campaignCriterionIds;
    this.criterionType = criterionType;
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
   * Gets the campaignCriterionIds value for this DeleteCampaignCriterionsRequest.
   *
   * @return campaignCriterionIds
   */
  public long[] getCampaignCriterionIds() {
    return campaignCriterionIds;
  }

  /**
   * Sets the campaignCriterionIds value for this DeleteCampaignCriterionsRequest.
   *
   * @param campaignCriterionIds
   */
  public void setCampaignCriterionIds(long[] campaignCriterionIds) {
    this.campaignCriterionIds = campaignCriterionIds;
  }

  /**
   * Gets the criterionType value for this DeleteCampaignCriterionsRequest.
   *
   * @return criterionType
   */
  public java.lang.String[] getCriterionType() {
    return criterionType;
  }

  /**
   * Sets the criterionType value for this DeleteCampaignCriterionsRequest.
   *
   * @param criterionType
   */
  public void setCriterionType(java.lang.String[] criterionType) {
    this.criterionType = criterionType;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof DeleteCampaignCriterionsRequest)) return false;
    DeleteCampaignCriterionsRequest other = (DeleteCampaignCriterionsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.campaignCriterionIds == null && other.getCampaignCriterionIds() == null) ||
                    (this.campaignCriterionIds != null &&
                            java.util.Arrays.equals(this.campaignCriterionIds, other.getCampaignCriterionIds()))) &&
            ((this.criterionType == null && other.getCriterionType() == null) ||
                    (this.criterionType != null &&
                            java.util.Arrays.equals(this.criterionType, other.getCriterionType())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getCampaignCriterionIds() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getCampaignCriterionIds());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getCampaignCriterionIds(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getCriterionType() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getCriterionType());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getCriterionType(), i);
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
