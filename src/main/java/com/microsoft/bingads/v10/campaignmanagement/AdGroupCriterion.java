/**
 * AdGroupCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class AdGroupCriterion implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AdGroupCriterion.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterion"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("criterion");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Criterion"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Criterion"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("id");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Id"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("status");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Status"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionStatus"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("type");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Type"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long adGroupId;
  private com.microsoft.bingads.v10.campaignmanagement.Criterion criterion;
  private java.lang.Long id;
  private com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionStatus status;
  private java.lang.String type;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AdGroupCriterion() {
  }

  public AdGroupCriterion(
          java.lang.Long adGroupId,
          com.microsoft.bingads.v10.campaignmanagement.Criterion criterion,
          java.lang.Long id,
          com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionStatus status,
          java.lang.String type) {
    this.adGroupId = adGroupId;
    this.criterion = criterion;
    this.id = id;
    this.status = status;
    this.type = type;
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
   * Gets the adGroupId value for this AdGroupCriterion.
   *
   * @return adGroupId
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the adGroupId value for this AdGroupCriterion.
   *
   * @param adGroupId
   */
  public void setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Gets the criterion value for this AdGroupCriterion.
   *
   * @return criterion
   */
  public com.microsoft.bingads.v10.campaignmanagement.Criterion getCriterion() {
    return criterion;
  }

  /**
   * Sets the criterion value for this AdGroupCriterion.
   *
   * @param criterion
   */
  public void setCriterion(com.microsoft.bingads.v10.campaignmanagement.Criterion criterion) {
    this.criterion = criterion;
  }

  /**
   * Gets the id value for this AdGroupCriterion.
   *
   * @return id
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the id value for this AdGroupCriterion.
   *
   * @param id
   */
  public void setId(java.lang.Long id) {
    this.id = id;
  }

  /**
   * Gets the status value for this AdGroupCriterion.
   *
   * @return status
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionStatus getStatus() {
    return status;
  }

  /**
   * Sets the status value for this AdGroupCriterion.
   *
   * @param status
   */
  public void setStatus(com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionStatus status) {
    this.status = status;
  }

  /**
   * Gets the type value for this AdGroupCriterion.
   *
   * @return type
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Sets the type value for this AdGroupCriterion.
   *
   * @param type
   */
  public void setType(java.lang.String type) {
    this.type = type;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AdGroupCriterion)) return false;
    AdGroupCriterion other = (AdGroupCriterion) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.adGroupId == null && other.getAdGroupId() == null) ||
                    (this.adGroupId != null &&
                            this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.criterion == null && other.getCriterion() == null) ||
                    (this.criterion != null &&
                            this.criterion.equals(other.getCriterion()))) &&
            ((this.id == null && other.getId() == null) ||
                    (this.id != null &&
                            this.id.equals(other.getId()))) &&
            ((this.status == null && other.getStatus() == null) ||
                    (this.status != null &&
                            this.status.equals(other.getStatus()))) &&
            ((this.type == null && other.getType() == null) ||
                    (this.type != null &&
                            this.type.equals(other.getType())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAdGroupId() != null) {
      _hashCode += getAdGroupId().hashCode();
    }
    if (getCriterion() != null) {
      _hashCode += getCriterion().hashCode();
    }
    if (getId() != null) {
      _hashCode += getId().hashCode();
    }
    if (getStatus() != null) {
      _hashCode += getStatus().hashCode();
    }
    if (getType() != null) {
      _hashCode += getType().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
