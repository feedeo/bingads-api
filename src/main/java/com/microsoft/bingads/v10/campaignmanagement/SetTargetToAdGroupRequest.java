/**
 * SetTargetToAdGroupRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class SetTargetToAdGroupRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(SetTargetToAdGroupRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetTargetToAdGroupRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("targetId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "TargetId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("replaceAssociation");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ReplaceAssociation"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long adGroupId;
  private java.lang.Long targetId;
  private java.lang.Boolean replaceAssociation;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public SetTargetToAdGroupRequest() {
  }

  public SetTargetToAdGroupRequest(
          java.lang.Long adGroupId,
          java.lang.Long targetId,
          java.lang.Boolean replaceAssociation) {
    this.adGroupId = adGroupId;
    this.targetId = targetId;
    this.replaceAssociation = replaceAssociation;
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
   * Gets the adGroupId value for this SetTargetToAdGroupRequest.
   *
   * @return adGroupId
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the adGroupId value for this SetTargetToAdGroupRequest.
   *
   * @param adGroupId
   */
  public void setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Gets the targetId value for this SetTargetToAdGroupRequest.
   *
   * @return targetId
   */
  public java.lang.Long getTargetId() {
    return targetId;
  }

  /**
   * Sets the targetId value for this SetTargetToAdGroupRequest.
   *
   * @param targetId
   */
  public void setTargetId(java.lang.Long targetId) {
    this.targetId = targetId;
  }

  /**
   * Gets the replaceAssociation value for this SetTargetToAdGroupRequest.
   *
   * @return replaceAssociation
   */
  public java.lang.Boolean getReplaceAssociation() {
    return replaceAssociation;
  }

  /**
   * Sets the replaceAssociation value for this SetTargetToAdGroupRequest.
   *
   * @param replaceAssociation
   */
  public void setReplaceAssociation(java.lang.Boolean replaceAssociation) {
    this.replaceAssociation = replaceAssociation;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof SetTargetToAdGroupRequest)) return false;
    SetTargetToAdGroupRequest other = (SetTargetToAdGroupRequest) obj;
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
            ((this.targetId == null && other.getTargetId() == null) ||
                    (this.targetId != null &&
                            this.targetId.equals(other.getTargetId()))) &&
            ((this.replaceAssociation == null && other.getReplaceAssociation() == null) ||
                    (this.replaceAssociation != null &&
                            this.replaceAssociation.equals(other.getReplaceAssociation())));
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
    if (getTargetId() != null) {
      _hashCode += getTargetId().hashCode();
    }
    if (getReplaceAssociation() != null) {
      _hashCode += getReplaceAssociation().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
