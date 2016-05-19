/**
 * Ad.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class Ad implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(Ad.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Ad"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("devicePreference");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DevicePreference"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("editorialStatus");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialStatus"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdEditorialStatus"));
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
    elemField.setFieldName("forwardCompatibilityMap");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ForwardCompatibilityMap"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("id");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Id"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("status");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Status"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdStatus"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("trackingUrlTemplate");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "TrackingUrlTemplate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("type");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Type"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdType"));
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

  private java.lang.Long devicePreference;
  private com.microsoft.bingads.v10.campaignmanagement.AdEditorialStatus editorialStatus;
  private com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls;
  private java.lang.String[] finalMobileUrls;
  private java.lang.String[] finalUrls;
  private com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
  private java.lang.Long id;
  private com.microsoft.bingads.v10.campaignmanagement.AdStatus status;
  private java.lang.String trackingUrlTemplate;
  private com.microsoft.bingads.v10.campaignmanagement.AdType type;
  private com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public Ad() {
  }

  public Ad(
          java.lang.Long devicePreference,
          com.microsoft.bingads.v10.campaignmanagement.AdEditorialStatus editorialStatus,
          com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls,
          java.lang.String[] finalMobileUrls,
          java.lang.String[] finalUrls,
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Long id,
          com.microsoft.bingads.v10.campaignmanagement.AdStatus status,
          java.lang.String trackingUrlTemplate,
          com.microsoft.bingads.v10.campaignmanagement.AdType type,
          com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters) {
    this.devicePreference = devicePreference;
    this.editorialStatus = editorialStatus;
    this.finalAppUrls = finalAppUrls;
    this.finalMobileUrls = finalMobileUrls;
    this.finalUrls = finalUrls;
    this.forwardCompatibilityMap = forwardCompatibilityMap;
    this.id = id;
    this.status = status;
    this.trackingUrlTemplate = trackingUrlTemplate;
    this.type = type;
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
   * Gets the devicePreference value for this Ad.
   *
   * @return devicePreference
   */
  public java.lang.Long getDevicePreference() {
    return devicePreference;
  }

  /**
   * Sets the devicePreference value for this Ad.
   *
   * @param devicePreference
   */
  public void setDevicePreference(java.lang.Long devicePreference) {
    this.devicePreference = devicePreference;
  }

  /**
   * Gets the editorialStatus value for this Ad.
   *
   * @return editorialStatus
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdEditorialStatus getEditorialStatus() {
    return editorialStatus;
  }

  /**
   * Sets the editorialStatus value for this Ad.
   *
   * @param editorialStatus
   */
  public void setEditorialStatus(com.microsoft.bingads.v10.campaignmanagement.AdEditorialStatus editorialStatus) {
    this.editorialStatus = editorialStatus;
  }

  /**
   * Gets the finalAppUrls value for this Ad.
   *
   * @return finalAppUrls
   */
  public com.microsoft.bingads.v10.datacontracts.AppUrl[] getFinalAppUrls() {
    return finalAppUrls;
  }

  /**
   * Sets the finalAppUrls value for this Ad.
   *
   * @param finalAppUrls
   */
  public void setFinalAppUrls(com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls) {
    this.finalAppUrls = finalAppUrls;
  }

  /**
   * Gets the finalMobileUrls value for this Ad.
   *
   * @return finalMobileUrls
   */
  public java.lang.String[] getFinalMobileUrls() {
    return finalMobileUrls;
  }

  /**
   * Sets the finalMobileUrls value for this Ad.
   *
   * @param finalMobileUrls
   */
  public void setFinalMobileUrls(java.lang.String[] finalMobileUrls) {
    this.finalMobileUrls = finalMobileUrls;
  }

  /**
   * Gets the finalUrls value for this Ad.
   *
   * @return finalUrls
   */
  public java.lang.String[] getFinalUrls() {
    return finalUrls;
  }

  /**
   * Sets the finalUrls value for this Ad.
   *
   * @param finalUrls
   */
  public void setFinalUrls(java.lang.String[] finalUrls) {
    this.finalUrls = finalUrls;
  }

  /**
   * Gets the forwardCompatibilityMap value for this Ad.
   *
   * @return forwardCompatibilityMap
   */
  public com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
    return forwardCompatibilityMap;
  }

  /**
   * Sets the forwardCompatibilityMap value for this Ad.
   *
   * @param forwardCompatibilityMap
   */
  public void setForwardCompatibilityMap(com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
    this.forwardCompatibilityMap = forwardCompatibilityMap;
  }

  /**
   * Gets the id value for this Ad.
   *
   * @return id
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the id value for this Ad.
   *
   * @param id
   */
  public void setId(java.lang.Long id) {
    this.id = id;
  }

  /**
   * Gets the status value for this Ad.
   *
   * @return status
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdStatus getStatus() {
    return status;
  }

  /**
   * Sets the status value for this Ad.
   *
   * @param status
   */
  public void setStatus(com.microsoft.bingads.v10.campaignmanagement.AdStatus status) {
    this.status = status;
  }

  /**
   * Gets the trackingUrlTemplate value for this Ad.
   *
   * @return trackingUrlTemplate
   */
  public java.lang.String getTrackingUrlTemplate() {
    return trackingUrlTemplate;
  }

  /**
   * Sets the trackingUrlTemplate value for this Ad.
   *
   * @param trackingUrlTemplate
   */
  public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
    this.trackingUrlTemplate = trackingUrlTemplate;
  }

  /**
   * Gets the type value for this Ad.
   *
   * @return type
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdType getType() {
    return type;
  }

  /**
   * Sets the type value for this Ad.
   *
   * @param type
   */
  public void setType(com.microsoft.bingads.v10.campaignmanagement.AdType type) {
    this.type = type;
  }

  /**
   * Gets the urlCustomParameters value for this Ad.
   *
   * @return urlCustomParameters
   */
  public com.microsoft.bingads.v10.datacontracts.CustomParameters getUrlCustomParameters() {
    return urlCustomParameters;
  }

  /**
   * Sets the urlCustomParameters value for this Ad.
   *
   * @param urlCustomParameters
   */
  public void setUrlCustomParameters(com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters) {
    this.urlCustomParameters = urlCustomParameters;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof Ad)) return false;
    Ad other = (Ad) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.devicePreference == null && other.getDevicePreference() == null) ||
                    (this.devicePreference != null &&
                            this.devicePreference.equals(other.getDevicePreference()))) &&
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
            ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                    (this.forwardCompatibilityMap != null &&
                            java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.id == null && other.getId() == null) ||
                    (this.id != null &&
                            this.id.equals(other.getId()))) &&
            ((this.status == null && other.getStatus() == null) ||
                    (this.status != null &&
                            this.status.equals(other.getStatus()))) &&
            ((this.trackingUrlTemplate == null && other.getTrackingUrlTemplate() == null) ||
                    (this.trackingUrlTemplate != null &&
                            this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
            ((this.type == null && other.getType() == null) ||
                    (this.type != null &&
                            this.type.equals(other.getType()))) &&
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
    int _hashCode = 1;
    if (getDevicePreference() != null) {
      _hashCode += getDevicePreference().hashCode();
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
    if (getForwardCompatibilityMap() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getId() != null) {
      _hashCode += getId().hashCode();
    }
    if (getStatus() != null) {
      _hashCode += getStatus().hashCode();
    }
    if (getTrackingUrlTemplate() != null) {
      _hashCode += getTrackingUrlTemplate().hashCode();
    }
    if (getType() != null) {
      _hashCode += getType().hashCode();
    }
    if (getUrlCustomParameters() != null) {
      _hashCode += getUrlCustomParameters().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
