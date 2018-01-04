/**
 * NegativeCampaignCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class NegativeCampaignCriterion extends com.microsoft.bingads.v10.campaignmanagement.CampaignCriterion implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(NegativeCampaignCriterion.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeCampaignCriterion"));
  }

  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public NegativeCampaignCriterion() {
  }

  public NegativeCampaignCriterion(
          java.lang.Integer bidAdjustment,
          long campaignId,
          com.microsoft.bingads.v10.campaignmanagement.Criterion criterion,
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Long id,
          java.lang.String type) {
    super(
            bidAdjustment,
            campaignId,
            criterion,
            forwardCompatibilityMap,
            id,
            type);
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

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof NegativeCampaignCriterion)) return false;
    NegativeCampaignCriterion other = (NegativeCampaignCriterion) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj);
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    __hashCodeCalc = false;
    return _hashCode;
  }

}
