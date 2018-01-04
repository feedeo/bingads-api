/**
 * GetNegativeSitesByCampaignIdsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetNegativeSitesByCampaignIdsResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetNegativeSitesByCampaignIdsResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetNegativeSitesByCampaignIdsResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignNegativeSites");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignNegativeSites"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignNegativeSites"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignNegativeSites"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("partialErrors");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PartialErrors"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites[] campaignNegativeSites;
  private com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetNegativeSitesByCampaignIdsResponse() {
  }

  public GetNegativeSitesByCampaignIdsResponse(
          com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites[] campaignNegativeSites,
          com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors) {
    this.campaignNegativeSites = campaignNegativeSites;
    this.partialErrors = partialErrors;
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
   * Gets the campaignNegativeSites value for this GetNegativeSitesByCampaignIdsResponse.
   *
   * @return campaignNegativeSites
   */
  public com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites[] getCampaignNegativeSites() {
    return campaignNegativeSites;
  }

  /**
   * Sets the campaignNegativeSites value for this GetNegativeSitesByCampaignIdsResponse.
   *
   * @param campaignNegativeSites
   */
  public void setCampaignNegativeSites(com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites[] campaignNegativeSites) {
    this.campaignNegativeSites = campaignNegativeSites;
  }

  /**
   * Gets the partialErrors value for this GetNegativeSitesByCampaignIdsResponse.
   *
   * @return partialErrors
   */
  public com.microsoft.bingads.v10.campaignmanagement.BatchError[] getPartialErrors() {
    return partialErrors;
  }

  /**
   * Sets the partialErrors value for this GetNegativeSitesByCampaignIdsResponse.
   *
   * @param partialErrors
   */
  public void setPartialErrors(com.microsoft.bingads.v10.campaignmanagement.BatchError[] partialErrors) {
    this.partialErrors = partialErrors;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetNegativeSitesByCampaignIdsResponse)) return false;
    GetNegativeSitesByCampaignIdsResponse other = (GetNegativeSitesByCampaignIdsResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.campaignNegativeSites == null && other.getCampaignNegativeSites() == null) ||
                    (this.campaignNegativeSites != null &&
                            java.util.Arrays.equals(this.campaignNegativeSites, other.getCampaignNegativeSites()))) &&
            ((this.partialErrors == null && other.getPartialErrors() == null) ||
                    (this.partialErrors != null &&
                            java.util.Arrays.equals(this.partialErrors, other.getPartialErrors())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getCampaignNegativeSites() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getCampaignNegativeSites());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getCampaignNegativeSites(), i);
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
    __hashCodeCalc = false;
    return _hashCode;
  }

}
