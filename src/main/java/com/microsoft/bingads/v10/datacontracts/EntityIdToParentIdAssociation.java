/**
 * EntityIdToParentIdAssociation.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.datacontracts;

public class EntityIdToParentIdAssociation implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(EntityIdToParentIdAssociation.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "EntityIdToParentIdAssociation"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("entityId");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "EntityId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("parentId");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ParentId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long entityId;
  private java.lang.Long parentId;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public EntityIdToParentIdAssociation() {
  }

  public EntityIdToParentIdAssociation(
          java.lang.Long entityId,
          java.lang.Long parentId) {
    this.entityId = entityId;
    this.parentId = parentId;
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
   * Gets the entityId value for this EntityIdToParentIdAssociation.
   *
   * @return entityId
   */
  public java.lang.Long getEntityId() {
    return entityId;
  }

  /**
   * Sets the entityId value for this EntityIdToParentIdAssociation.
   *
   * @param entityId
   */
  public void setEntityId(java.lang.Long entityId) {
    this.entityId = entityId;
  }

  /**
   * Gets the parentId value for this EntityIdToParentIdAssociation.
   *
   * @return parentId
   */
  public java.lang.Long getParentId() {
    return parentId;
  }

  /**
   * Sets the parentId value for this EntityIdToParentIdAssociation.
   *
   * @param parentId
   */
  public void setParentId(java.lang.Long parentId) {
    this.parentId = parentId;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof EntityIdToParentIdAssociation)) return false;
    EntityIdToParentIdAssociation other = (EntityIdToParentIdAssociation) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.entityId == null && other.getEntityId() == null) ||
                    (this.entityId != null &&
                            this.entityId.equals(other.getEntityId()))) &&
            ((this.parentId == null && other.getParentId() == null) ||
                    (this.parentId != null &&
                            this.parentId.equals(other.getParentId())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getEntityId() != null) {
      _hashCode += getEntityId().hashCode();
    }
    if (getParentId() != null) {
      _hashCode += getParentId().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
