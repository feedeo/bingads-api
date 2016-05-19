/**
 * AddSharedEntityResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class AddSharedEntityResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AddSharedEntityResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddSharedEntityResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("listItemIds");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ListItemIds"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("partialErrors");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PartialErrors"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("sharedEntityId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntityId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private long[] listItemIds;
  private com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors;
  private java.lang.Long sharedEntityId;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AddSharedEntityResponse() {
  }

  public AddSharedEntityResponse(
          long[] listItemIds,
          com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors,
          java.lang.Long sharedEntityId) {
    this.listItemIds = listItemIds;
    this.partialErrors = partialErrors;
    this.sharedEntityId = sharedEntityId;
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
   * Gets the listItemIds value for this AddSharedEntityResponse.
   *
   * @return listItemIds
   */
  public long[] getListItemIds() {
    return listItemIds;
  }

  /**
   * Sets the listItemIds value for this AddSharedEntityResponse.
   *
   * @param listItemIds
   */
  public void setListItemIds(long[] listItemIds) {
    this.listItemIds = listItemIds;
  }

  /**
   * Gets the partialErrors value for this AddSharedEntityResponse.
   *
   * @return partialErrors
   */
  public com.microsoft.bingads.v10.campaignmanagement.BatchError[] getPartialErrors() {
    return partialErrors;
  }

  /**
   * Sets the partialErrors value for this AddSharedEntityResponse.
   *
   * @param partialErrors
   */
  public void setPartialErrors(com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors) {
    this.partialErrors = partialErrors;
  }

  /**
   * Gets the sharedEntityId value for this AddSharedEntityResponse.
   *
   * @return sharedEntityId
   */
  public java.lang.Long getSharedEntityId() {
    return sharedEntityId;
  }

  /**
   * Sets the sharedEntityId value for this AddSharedEntityResponse.
   *
   * @param sharedEntityId
   */
  public void setSharedEntityId(java.lang.Long sharedEntityId) {
    this.sharedEntityId = sharedEntityId;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AddSharedEntityResponse)) return false;
    AddSharedEntityResponse other = (AddSharedEntityResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.listItemIds == null && other.getListItemIds() == null) ||
                    (this.listItemIds != null &&
                            java.util.Arrays.equals(this.listItemIds, other.getListItemIds()))) &&
            ((this.partialErrors == null && other.getPartialErrors() == null) ||
                    (this.partialErrors != null &&
                            java.util.Arrays.equals(this.partialErrors, other.getPartialErrors()))) &&
            ((this.sharedEntityId == null && other.getSharedEntityId() == null) ||
                    (this.sharedEntityId != null &&
                            this.sharedEntityId.equals(other.getSharedEntityId())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getListItemIds() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getListItemIds());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getListItemIds(), i);
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
    if (getSharedEntityId() != null) {
      _hashCode += getSharedEntityId().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
