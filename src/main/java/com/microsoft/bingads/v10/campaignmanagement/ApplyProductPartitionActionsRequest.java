/**
 * ApplyProductPartitionActionsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class ApplyProductPartitionActionsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(ApplyProductPartitionActionsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">ApplyProductPartitionActionsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("criterionActions");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CriterionActions"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionAction"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionAction"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionAction[] criterionActions;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public ApplyProductPartitionActionsRequest() {
  }

  public ApplyProductPartitionActionsRequest(
          com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionAction[] criterionActions) {
    this.criterionActions = criterionActions;
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
   * Gets the criterionActions value for this ApplyProductPartitionActionsRequest.
   *
   * @return criterionActions
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionAction[] getCriterionActions() {
    return criterionActions;
  }

  /**
   * Sets the criterionActions value for this ApplyProductPartitionActionsRequest.
   *
   * @param criterionActions
   */
  public void setCriterionActions(com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionAction[] criterionActions) {
    this.criterionActions = criterionActions;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof ApplyProductPartitionActionsRequest)) return false;
    ApplyProductPartitionActionsRequest other = (ApplyProductPartitionActionsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.criterionActions == null && other.getCriterionActions() == null) ||
                    (this.criterionActions != null &&
                            java.util.Arrays.equals(this.criterionActions, other.getCriterionActions())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getCriterionActions() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getCriterionActions());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getCriterionActions(), i);
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
