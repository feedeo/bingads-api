/**
 * BiddableAdGroupCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class BiddableAdGroupCriterion extends com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(BiddableAdGroupCriterion.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BiddableAdGroupCriterion"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("criterionBid");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CriterionBid"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CriterionBid"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("destinationUrl");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DestinationUrl"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("editorialStatus");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialStatus"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionEditorialStatus"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("finalAppUrls");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "FinalAppUrls"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "AppUrl"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "AppUrl"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("finalMobileUrls");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "FinalMobileUrls"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("finalUrls");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "FinalUrls"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("trackingUrlTemplate");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "TrackingUrlTemplate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("urlCustomParameters");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UrlCustomParameters"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "CustomParameters"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.CriterionBid criterionBid;
  private java.lang.String destinationUrl;
  private com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionEditorialStatus editorialStatus;
  private com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls;
  private java.lang.String[] finalMobileUrls;
  private java.lang.String[] finalUrls;
  private java.lang.String trackingUrlTemplate;
  private com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public BiddableAdGroupCriterion() {
  }

  public BiddableAdGroupCriterion(
          java.lang.Long adGroupId,
          com.microsoft.bingads.v10.campaignmanagement.Criterion criterion,
          java.lang.Long id,
          com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionStatus status,
          java.lang.String type,
          com.microsoft.bingads.v10.campaignmanagement.CriterionBid criterionBid,
          java.lang.String destinationUrl,
          com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionEditorialStatus editorialStatus,
          com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls,
          java.lang.String[] finalMobileUrls,
          java.lang.String[] finalUrls,
          java.lang.String trackingUrlTemplate,
          com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters) {
    super(
            adGroupId,
            criterion,
            id,
            status,
            type);
    this.criterionBid = criterionBid;
    this.destinationUrl = destinationUrl;
    this.editorialStatus = editorialStatus;
    this.finalAppUrls = finalAppUrls;
    this.finalMobileUrls = finalMobileUrls;
    this.finalUrls = finalUrls;
    this.trackingUrlTemplate = trackingUrlTemplate;
    this.urlCustomParameters = urlCustomParameters;
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
   * Gets the criterionBid value for this BiddableAdGroupCriterion.
   *
   * @return criterionBid
   */
  public com.microsoft.bingads.v10.campaignmanagement.CriterionBid getCriterionBid() {
    return criterionBid;
  }

  /**
   * Sets the criterionBid value for this BiddableAdGroupCriterion.
   *
   * @param criterionBid
   */
  public void setCriterionBid(com.microsoft.bingads.v10.campaignmanagement.CriterionBid criterionBid) {
    this.criterionBid = criterionBid;
  }

  /**
   * Gets the destinationUrl value for this BiddableAdGroupCriterion.
   *
   * @return destinationUrl
   */
  public java.lang.String getDestinationUrl() {
    return destinationUrl;
  }

  /**
   * Sets the destinationUrl value for this BiddableAdGroupCriterion.
   *
   * @param destinationUrl
   */
  public void setDestinationUrl(java.lang.String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  /**
   * Gets the editorialStatus value for this BiddableAdGroupCriterion.
   *
   * @return editorialStatus
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionEditorialStatus getEditorialStatus() {
    return editorialStatus;
  }

  /**
   * Sets the editorialStatus value for this BiddableAdGroupCriterion.
   *
   * @param editorialStatus
   */
  public void setEditorialStatus(com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionEditorialStatus editorialStatus) {
    this.editorialStatus = editorialStatus;
  }

  /**
   * Gets the finalAppUrls value for this BiddableAdGroupCriterion.
   *
   * @return finalAppUrls
   */
  public com.microsoft.bingads.v10.datacontracts.AppUrl[] getFinalAppUrls() {
    return finalAppUrls;
  }

  /**
   * Sets the finalAppUrls value for this BiddableAdGroupCriterion.
   *
   * @param finalAppUrls
   */
  public void setFinalAppUrls(com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls) {
    this.finalAppUrls = finalAppUrls;
  }

  /**
   * Gets the finalMobileUrls value for this BiddableAdGroupCriterion.
   *
   * @return finalMobileUrls
   */
  public java.lang.String[] getFinalMobileUrls() {
    return finalMobileUrls;
  }

  /**
   * Sets the finalMobileUrls value for this BiddableAdGroupCriterion.
   *
   * @param finalMobileUrls
   */
  public void setFinalMobileUrls(java.lang.String[] finalMobileUrls) {
    this.finalMobileUrls = finalMobileUrls;
  }

  /**
   * Gets the finalUrls value for this BiddableAdGroupCriterion.
   *
   * @return finalUrls
   */
  public java.lang.String[] getFinalUrls() {
    return finalUrls;
  }

  /**
   * Sets the finalUrls value for this BiddableAdGroupCriterion.
   *
   * @param finalUrls
   */
  public void setFinalUrls(java.lang.String[] finalUrls) {
    this.finalUrls = finalUrls;
  }

  /**
   * Gets the trackingUrlTemplate value for this BiddableAdGroupCriterion.
   *
   * @return trackingUrlTemplate
   */
  public java.lang.String getTrackingUrlTemplate() {
    return trackingUrlTemplate;
  }

  /**
   * Sets the trackingUrlTemplate value for this BiddableAdGroupCriterion.
   *
   * @param trackingUrlTemplate
   */
  public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
    this.trackingUrlTemplate = trackingUrlTemplate;
  }

  /**
   * Gets the urlCustomParameters value for this BiddableAdGroupCriterion.
   *
   * @return urlCustomParameters
   */
  public com.microsoft.bingads.v10.datacontracts.CustomParameters getUrlCustomParameters() {
    return urlCustomParameters;
  }

  /**
   * Sets the urlCustomParameters value for this BiddableAdGroupCriterion.
   *
   * @param urlCustomParameters
   */
  public void setUrlCustomParameters(com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters) {
    this.urlCustomParameters = urlCustomParameters;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof BiddableAdGroupCriterion)) return false;
    BiddableAdGroupCriterion other = (BiddableAdGroupCriterion) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.criterionBid == null && other.getCriterionBid() == null) ||
                    (this.criterionBid != null &&
                            this.criterionBid.equals(other.getCriterionBid()))) &&
            ((this.destinationUrl == null && other.getDestinationUrl() == null) ||
                    (this.destinationUrl != null &&
                            this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.editorialStatus == null && other.getEditorialStatus() == null) ||
                    (this.editorialStatus != null &&
                            this.editorialStatus.equals(other.getEditorialStatus()))) &&
            ((this.finalAppUrls == null && other.getFinalAppUrls() == null) ||
                    (this.finalAppUrls != null &&
                            java.util.Arrays.equals(this.finalAppUrls, other.getFinalAppUrls()))) &&
            ((this.finalMobileUrls == null && other.getFinalMobileUrls() == null) ||
                    (this.finalMobileUrls != null &&
                            java.util.Arrays.equals(this.finalMobileUrls, other.getFinalMobileUrls()))) &&
            ((this.finalUrls == null && other.getFinalUrls() == null) ||
                    (this.finalUrls != null &&
                            java.util.Arrays.equals(this.finalUrls, other.getFinalUrls()))) &&
            ((this.trackingUrlTemplate == null && other.getTrackingUrlTemplate() == null) ||
                    (this.trackingUrlTemplate != null &&
                            this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
            ((this.urlCustomParameters == null && other.getUrlCustomParameters() == null) ||
                    (this.urlCustomParameters != null &&
                            this.urlCustomParameters.equals(other.getUrlCustomParameters())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getCriterionBid() != null) {
      _hashCode += getCriterionBid().hashCode();
    }
    if (getDestinationUrl() != null) {
      _hashCode += getDestinationUrl().hashCode();
    }
    if (getEditorialStatus() != null) {
      _hashCode += getEditorialStatus().hashCode();
    }
    if (getFinalAppUrls() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getFinalAppUrls());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getFinalAppUrls(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getFinalMobileUrls() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getFinalMobileUrls());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getFinalMobileUrls(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getFinalUrls() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getFinalUrls());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getFinalUrls(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getTrackingUrlTemplate() != null) {
      _hashCode += getTrackingUrlTemplate().hashCode();
    }
    if (getUrlCustomParameters() != null) {
      _hashCode += getUrlCustomParameters().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
