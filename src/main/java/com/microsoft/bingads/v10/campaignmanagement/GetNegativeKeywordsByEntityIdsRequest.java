/**
 * GetNegativeKeywordsByEntityIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetNegativeKeywordsByEntityIdsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetNegativeKeywordsByEntityIdsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeKeywordsByEntityIdsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("entityIds");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EntityIds"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("entityType");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EntityType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("parentEntityId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ParentEntityId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private long[] entityIds;
  private java.lang.String entityType;
  private java.lang.Long parentEntityId;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetNegativeKeywordsByEntityIdsRequest() {
  }

  public GetNegativeKeywordsByEntityIdsRequest(
          long[] entityIds,
          java.lang.String entityType,
          java.lang.Long parentEntityId) {
    this.entityIds = entityIds;
    this.entityType = entityType;
    this.parentEntityId = parentEntityId;
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
   * Gets the entityIds value for this GetNegativeKeywordsByEntityIdsRequest.
   *
   * @return entityIds
   */
  public long[] getEntityIds() {
    return entityIds;
  }

  /**
   * Sets the entityIds value for this GetNegativeKeywordsByEntityIdsRequest.
   *
   * @param entityIds
   */
  public void setEntityIds(long[] entityIds) {
    this.entityIds = entityIds;
  }

  /**
   * Gets the entityType value for this GetNegativeKeywordsByEntityIdsRequest.
   *
   * @return entityType
   */
  public java.lang.String getEntityType() {
    return entityType;
  }

  /**
   * Sets the entityType value for this GetNegativeKeywordsByEntityIdsRequest.
   *
   * @param entityType
   */
  public void setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
  }

  /**
   * Gets the parentEntityId value for this GetNegativeKeywordsByEntityIdsRequest.
   *
   * @return parentEntityId
   */
  public java.lang.Long getParentEntityId() {
    return parentEntityId;
  }

  /**
   * Sets the parentEntityId value for this GetNegativeKeywordsByEntityIdsRequest.
   *
   * @param parentEntityId
   */
  public void setParentEntityId(java.lang.Long parentEntityId) {
    this.parentEntityId = parentEntityId;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetNegativeKeywordsByEntityIdsRequest)) return false;
    GetNegativeKeywordsByEntityIdsRequest other = (GetNegativeKeywordsByEntityIdsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.entityIds == null && other.getEntityIds() == null) ||
                    (this.entityIds != null &&
                            java.util.Arrays.equals(this.entityIds, other.getEntityIds()))) &&
            ((this.entityType == null && other.getEntityType() == null) ||
                    (this.entityType != null &&
                            this.entityType.equals(other.getEntityType()))) &&
            ((this.parentEntityId == null && other.getParentEntityId() == null) ||
                    (this.parentEntityId != null &&
                            this.parentEntityId.equals(other.getParentEntityId())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getEntityIds() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getEntityIds());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getEntityIds(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getEntityType() != null) {
      _hashCode += getEntityType().hashCode();
    }
    if (getParentEntityId() != null) {
      _hashCode += getParentEntityId().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
