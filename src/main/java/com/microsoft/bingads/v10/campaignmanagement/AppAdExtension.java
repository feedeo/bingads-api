/**
 * AppAdExtension.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class AppAdExtension extends com.microsoft.bingads.v10.campaignmanagement.AdExtension implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AppAdExtension.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppAdExtension"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("appPlatform");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppPlatform"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("appStoreId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppStoreId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("destinationUrl");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DestinationUrl"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("devicePreference");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DevicePreference"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("displayText");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DisplayText"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

  private java.lang.String appPlatform;
  private java.lang.String appStoreId;
  private java.lang.String destinationUrl;
  private java.lang.Long devicePreference;
  private java.lang.String displayText;
  private com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls;
  private java.lang.String[] finalMobileUrls;
  private java.lang.String[] finalUrls;
  private java.lang.String trackingUrlTemplate;
  private com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AppAdExtension() {
  }

  public AppAdExtension(
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Long id,
          com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus status,
          java.lang.String type,
          java.lang.Integer version,
          java.lang.String appPlatform,
          java.lang.String appStoreId,
          java.lang.String destinationUrl,
          java.lang.Long devicePreference,
          java.lang.String displayText,
          com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls,
          java.lang.String[] finalMobileUrls,
          java.lang.String[] finalUrls,
          java.lang.String trackingUrlTemplate,
          com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters) {
    super(
            forwardCompatibilityMap,
            id,
            status,
            type,
            version);
    this.appPlatform = appPlatform;
    this.appStoreId = appStoreId;
    this.destinationUrl = destinationUrl;
    this.devicePreference = devicePreference;
    this.displayText = displayText;
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
   * Gets the appPlatform value for this AppAdExtension.
   *
   * @return appPlatform
   */
  public java.lang.String getAppPlatform() {
    return appPlatform;
  }

  /**
   * Sets the appPlatform value for this AppAdExtension.
   *
   * @param appPlatform
   */
  public void setAppPlatform(java.lang.String appPlatform) {
    this.appPlatform = appPlatform;
  }

  /**
   * Gets the appStoreId value for this AppAdExtension.
   *
   * @return appStoreId
   */
  public java.lang.String getAppStoreId() {
    return appStoreId;
  }

  /**
   * Sets the appStoreId value for this AppAdExtension.
   *
   * @param appStoreId
   */
  public void setAppStoreId(java.lang.String appStoreId) {
    this.appStoreId = appStoreId;
  }

  /**
   * Gets the destinationUrl value for this AppAdExtension.
   *
   * @return destinationUrl
   */
  public java.lang.String getDestinationUrl() {
    return destinationUrl;
  }

  /**
   * Sets the destinationUrl value for this AppAdExtension.
   *
   * @param destinationUrl
   */
  public void setDestinationUrl(java.lang.String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  /**
   * Gets the devicePreference value for this AppAdExtension.
   *
   * @return devicePreference
   */
  public java.lang.Long getDevicePreference() {
    return devicePreference;
  }

  /**
   * Sets the devicePreference value for this AppAdExtension.
   *
   * @param devicePreference
   */
  public void setDevicePreference(java.lang.Long devicePreference) {
    this.devicePreference = devicePreference;
  }

  /**
   * Gets the displayText value for this AppAdExtension.
   *
   * @return displayText
   */
  public java.lang.String getDisplayText() {
    return displayText;
  }

  /**
   * Sets the displayText value for this AppAdExtension.
   *
   * @param displayText
   */
  public void setDisplayText(java.lang.String displayText) {
    this.displayText = displayText;
  }

  /**
   * Gets the finalAppUrls value for this AppAdExtension.
   *
   * @return finalAppUrls
   */
  public com.microsoft.bingads.v10.datacontracts.AppUrl[] getFinalAppUrls() {
    return finalAppUrls;
  }

  /**
   * Sets the finalAppUrls value for this AppAdExtension.
   *
   * @param finalAppUrls
   */
  public void setFinalAppUrls(com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls) {
    this.finalAppUrls = finalAppUrls;
  }

  /**
   * Gets the finalMobileUrls value for this AppAdExtension.
   *
   * @return finalMobileUrls
   */
  public java.lang.String[] getFinalMobileUrls() {
    return finalMobileUrls;
  }

  /**
   * Sets the finalMobileUrls value for this AppAdExtension.
   *
   * @param finalMobileUrls
   */
  public void setFinalMobileUrls(java.lang.String[] finalMobileUrls) {
    this.finalMobileUrls = finalMobileUrls;
  }

  /**
   * Gets the finalUrls value for this AppAdExtension.
   *
   * @return finalUrls
   */
  public java.lang.String[] getFinalUrls() {
    return finalUrls;
  }

  /**
   * Sets the finalUrls value for this AppAdExtension.
   *
   * @param finalUrls
   */
  public void setFinalUrls(java.lang.String[] finalUrls) {
    this.finalUrls = finalUrls;
  }

  /**
   * Gets the trackingUrlTemplate value for this AppAdExtension.
   *
   * @return trackingUrlTemplate
   */
  public java.lang.String getTrackingUrlTemplate() {
    return trackingUrlTemplate;
  }

  /**
   * Sets the trackingUrlTemplate value for this AppAdExtension.
   *
   * @param trackingUrlTemplate
   */
  public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
    this.trackingUrlTemplate = trackingUrlTemplate;
  }

  /**
   * Gets the urlCustomParameters value for this AppAdExtension.
   *
   * @return urlCustomParameters
   */
  public com.microsoft.bingads.v10.datacontracts.CustomParameters getUrlCustomParameters() {
    return urlCustomParameters;
  }

  /**
   * Sets the urlCustomParameters value for this AppAdExtension.
   *
   * @param urlCustomParameters
   */
  public void setUrlCustomParameters(com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters) {
    this.urlCustomParameters = urlCustomParameters;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AppAdExtension)) return false;
    AppAdExtension other = (AppAdExtension) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.appPlatform == null && other.getAppPlatform() == null) ||
                    (this.appPlatform != null &&
                            this.appPlatform.equals(other.getAppPlatform()))) &&
            ((this.appStoreId == null && other.getAppStoreId() == null) ||
                    (this.appStoreId != null &&
                            this.appStoreId.equals(other.getAppStoreId()))) &&
            ((this.destinationUrl == null && other.getDestinationUrl() == null) ||
                    (this.destinationUrl != null &&
                            this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.devicePreference == null && other.getDevicePreference() == null) ||
                    (this.devicePreference != null &&
                            this.devicePreference.equals(other.getDevicePreference()))) &&
            ((this.displayText == null && other.getDisplayText() == null) ||
                    (this.displayText != null &&
                            this.displayText.equals(other.getDisplayText()))) &&
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
    if (getAppPlatform() != null) {
      _hashCode += getAppPlatform().hashCode();
    }
    if (getAppStoreId() != null) {
      _hashCode += getAppStoreId().hashCode();
    }
    if (getDestinationUrl() != null) {
      _hashCode += getDestinationUrl().hashCode();
    }
    if (getDevicePreference() != null) {
      _hashCode += getDevicePreference().hashCode();
    }
    if (getDisplayText() != null) {
      _hashCode += getDisplayText().hashCode();
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
