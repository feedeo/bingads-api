/**
 * CampaignCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class CampaignCriterion implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(CampaignCriterion.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignCriterion"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("bidAdjustment");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BidAdjustment"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
    elemField.setFieldName("forwardCompatibilityMap");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ForwardCompatibilityMap"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("id");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Id"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

  private java.lang.Integer bidAdjustment;
  private long campaignId;
  private com.microsoft.bingads.v10.campaignmanagement.Criterion criterion;
  private com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
  private java.lang.Long id;
  private java.lang.String type;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public CampaignCriterion() {
  }

  public CampaignCriterion(
          java.lang.Integer bidAdjustment,
          long campaignId,
          com.microsoft.bingads.v10.campaignmanagement.Criterion criterion,
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Long id,
          java.lang.String type) {
    this.bidAdjustment = bidAdjustment;
    this.campaignId = campaignId;
    this.criterion = criterion;
    this.forwardCompatibilityMap = forwardCompatibilityMap;
    this.id = id;
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
   * Gets the bidAdjustment value for this CampaignCriterion.
   *
   * @return bidAdjustment
   */
  public java.lang.Integer getBidAdjustment() {
    return bidAdjustment;
  }

  /**
   * Sets the bidAdjustment value for this CampaignCriterion.
   *
   * @param bidAdjustment
   */
  public void setBidAdjustment(java.lang.Integer bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
  }

  /**
   * Gets the campaignId value for this CampaignCriterion.
   *
   * @return campaignId
   */
  public long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the campaignId value for this CampaignCriterion.
   *
   * @param campaignId
   */
  public void setCampaignId(long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Gets the criterion value for this CampaignCriterion.
   *
   * @return criterion
   */
  public com.microsoft.bingads.v10.campaignmanagement.Criterion getCriterion() {
    return criterion;
  }

  /**
   * Sets the criterion value for this CampaignCriterion.
   *
   * @param criterion
   */
  public void setCriterion(com.microsoft.bingads.v10.campaignmanagement.Criterion criterion) {
    this.criterion = criterion;
  }

  /**
   * Gets the forwardCompatibilityMap value for this CampaignCriterion.
   *
   * @return forwardCompatibilityMap
   */
  public com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
    return forwardCompatibilityMap;
  }

  /**
   * Sets the forwardCompatibilityMap value for this CampaignCriterion.
   *
   * @param forwardCompatibilityMap
   */
  public void setForwardCompatibilityMap(com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
    this.forwardCompatibilityMap = forwardCompatibilityMap;
  }

  /**
   * Gets the id value for this CampaignCriterion.
   *
   * @return id
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the id value for this CampaignCriterion.
   *
   * @param id
   */
  public void setId(java.lang.Long id) {
    this.id = id;
  }

  /**
   * Gets the type value for this CampaignCriterion.
   *
   * @return type
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Sets the type value for this CampaignCriterion.
   *
   * @param type
   */
  public void setType(java.lang.String type) {
    this.type = type;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof CampaignCriterion)) return false;
    CampaignCriterion other = (CampaignCriterion) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.bidAdjustment == null && other.getBidAdjustment() == null) ||
                    (this.bidAdjustment != null &&
                            this.bidAdjustment.equals(other.getBidAdjustment()))) &&
            this.campaignId == other.getCampaignId() &&
            ((this.criterion == null && other.getCriterion() == null) ||
                    (this.criterion != null &&
                            this.criterion.equals(other.getCriterion()))) &&
            ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                    (this.forwardCompatibilityMap != null &&
                            java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.id == null && other.getId() == null) ||
                    (this.id != null &&
                            this.id.equals(other.getId()))) &&
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
    if (getBidAdjustment() != null) {
      _hashCode += getBidAdjustment().hashCode();
    }
    _hashCode += new Long(getCampaignId()).hashCode();
    if (getCriterion() != null) {
      _hashCode += getCriterion().hashCode();
    }
    if (getForwardCompatibilityMap() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getId() != null) {
      _hashCode += getId().hashCode();
    }
    if (getType() != null) {
      _hashCode += getType().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
