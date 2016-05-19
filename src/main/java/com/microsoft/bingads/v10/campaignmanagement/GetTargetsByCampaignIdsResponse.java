/**
 * GetTargetsByCampaignIdsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetTargetsByCampaignIdsResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetTargetsByCampaignIdsResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetTargetsByCampaignIdsResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("partialErrors");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PartialErrors"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("targets");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Targets"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Target"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Target"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors;
  private com.microsoft.bingads.v10.campaignmanagement.Target[] targets;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetTargetsByCampaignIdsResponse() {
  }

  public GetTargetsByCampaignIdsResponse(
          com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors,
          com.microsoft.bingads.v10.campaignmanagement.Target[] targets) {
    this.partialErrors = partialErrors;
    this.targets = targets;
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
   * Gets the partialErrors value for this GetTargetsByCampaignIdsResponse.
   *
   * @return partialErrors
   */
  public com.microsoft.bingads.v10.campaignmanagement.BatchError[] getPartialErrors() {
    return partialErrors;
  }

  /**
   * Sets the partialErrors value for this GetTargetsByCampaignIdsResponse.
   *
   * @param partialErrors
   */
  public void setPartialErrors(com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors) {
    this.partialErrors = partialErrors;
  }

  /**
   * Gets the targets value for this GetTargetsByCampaignIdsResponse.
   *
   * @return targets
   */
  public com.microsoft.bingads.v10.campaignmanagement.Target[] getTargets() {
    return targets;
  }

  /**
   * Sets the targets value for this GetTargetsByCampaignIdsResponse.
   *
   * @param targets
   */
  public void setTargets(com.microsoft.bingads.v10.campaignmanagement.Target[] targets) {
    this.targets = targets;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetTargetsByCampaignIdsResponse)) return false;
    GetTargetsByCampaignIdsResponse other = (GetTargetsByCampaignIdsResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.partialErrors == null && other.getPartialErrors() == null) ||
                    (this.partialErrors != null &&
                            java.util.Arrays.equals(this.partialErrors, other.getPartialErrors()))) &&
            ((this.targets == null && other.getTargets() == null) ||
                    (this.targets != null &&
                            java.util.Arrays.equals(this.targets, other.getTargets())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
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
    if (getTargets() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getTargets());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getTargets(), i);
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
