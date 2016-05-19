/**
 * AdGroupCriterionAction.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class AdGroupCriterionAction implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AdGroupCriterionAction.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionAction"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("action");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Action"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ItemAction"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupCriterion");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterion"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterion"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.ItemAction action;
  private com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion adGroupCriterion;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AdGroupCriterionAction() {
  }

  public AdGroupCriterionAction(
          com.microsoft.bingads.v10.campaignmanagement.ItemAction action,
          com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion adGroupCriterion) {
    this.action = action;
    this.adGroupCriterion = adGroupCriterion;
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
   * Gets the action value for this AdGroupCriterionAction.
   *
   * @return action
   */
  public com.microsoft.bingads.v10.campaignmanagement.ItemAction getAction() {
    return action;
  }

  /**
   * Sets the action value for this AdGroupCriterionAction.
   *
   * @param action
   */
  public void setAction(com.microsoft.bingads.v10.campaignmanagement.ItemAction action) {
    this.action = action;
  }

  /**
   * Gets the adGroupCriterion value for this AdGroupCriterionAction.
   *
   * @return adGroupCriterion
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion getAdGroupCriterion() {
    return adGroupCriterion;
  }

  /**
   * Sets the adGroupCriterion value for this AdGroupCriterionAction.
   *
   * @param adGroupCriterion
   */
  public void setAdGroupCriterion(com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion adGroupCriterion) {
    this.adGroupCriterion = adGroupCriterion;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AdGroupCriterionAction)) return false;
    AdGroupCriterionAction other = (AdGroupCriterionAction) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.action == null && other.getAction() == null) ||
                    (this.action != null &&
                            this.action.equals(other.getAction()))) &&
            ((this.adGroupCriterion == null && other.getAdGroupCriterion() == null) ||
                    (this.adGroupCriterion != null &&
                            this.adGroupCriterion.equals(other.getAdGroupCriterion())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAction() != null) {
      _hashCode += getAction().hashCode();
    }
    if (getAdGroupCriterion() != null) {
      _hashCode += getAdGroupCriterion().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
