/**
 * SetNegativeSitesToCampaignsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class SetNegativeSitesToCampaignsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(SetNegativeSitesToCampaignsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">SetNegativeSitesToCampaignsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("accountId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AccountId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignNegativeSites");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignNegativeSites"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignNegativeSites"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignNegativeSites"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long accountId;
  private com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites[] campaignNegativeSites;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public SetNegativeSitesToCampaignsRequest() {
  }

  public SetNegativeSitesToCampaignsRequest(
          java.lang.Long accountId,
          com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites[] campaignNegativeSites) {
    this.accountId = accountId;
    this.campaignNegativeSites = campaignNegativeSites;
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
   * Gets the accountId value for this SetNegativeSitesToCampaignsRequest.
   *
   * @return accountId
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Sets the accountId value for this SetNegativeSitesToCampaignsRequest.
   *
   * @param accountId
   */
  public void setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
  }

  /**
   * Gets the campaignNegativeSites value for this SetNegativeSitesToCampaignsRequest.
   *
   * @return campaignNegativeSites
   */
  public com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites[] getCampaignNegativeSites() {
    return campaignNegativeSites;
  }

  /**
   * Sets the campaignNegativeSites value for this SetNegativeSitesToCampaignsRequest.
   *
   * @param campaignNegativeSites
   */
  public void setCampaignNegativeSites(com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites[] campaignNegativeSites) {
    this.campaignNegativeSites = campaignNegativeSites;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof SetNegativeSitesToCampaignsRequest)) return false;
    SetNegativeSitesToCampaignsRequest other = (SetNegativeSitesToCampaignsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.accountId == null && other.getAccountId() == null) ||
                    (this.accountId != null &&
                            this.accountId.equals(other.getAccountId()))) &&
            ((this.campaignNegativeSites == null && other.getCampaignNegativeSites() == null) ||
                    (this.campaignNegativeSites != null &&
                            java.util.Arrays.equals(this.campaignNegativeSites, other.getCampaignNegativeSites())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAccountId() != null) {
      _hashCode += getAccountId().hashCode();
    }
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
    __hashCodeCalc = false;
    return _hashCode;
  }

}
