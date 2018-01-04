/**
 * ImageAdExtension.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class ImageAdExtension extends com.microsoft.bingads.v10.campaignmanagement.AdExtension implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(ImageAdExtension.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ImageAdExtension"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("alternativeText");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AlternativeText"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("description");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Description"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
    elemField.setFieldName("imageMediaIds");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ImageMediaIds"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
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

  private java.lang.String alternativeText;
  private java.lang.String description;
  private java.lang.String destinationUrl;
  private com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls;
  private java.lang.String[] finalMobileUrls;
  private java.lang.String[] finalUrls;
  private long[] imageMediaIds;
  private java.lang.String trackingUrlTemplate;
  private com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public ImageAdExtension() {
  }

  public ImageAdExtension(
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Long id,
          com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus status,
          java.lang.String type,
          java.lang.Integer version,
          java.lang.String alternativeText,
          java.lang.String description,
          java.lang.String destinationUrl,
          com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls,
          java.lang.String[] finalMobileUrls,
          java.lang.String[] finalUrls,
          long[] imageMediaIds,
          java.lang.String trackingUrlTemplate,
          com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters) {
    super(
            forwardCompatibilityMap,
            id,
            status,
            type,
            version);
    this.alternativeText = alternativeText;
    this.description = description;
    this.destinationUrl = destinationUrl;
    this.finalAppUrls = finalAppUrls;
    this.finalMobileUrls = finalMobileUrls;
    this.finalUrls = finalUrls;
    this.imageMediaIds = imageMediaIds;
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
   * Gets the alternativeText value for this ImageAdExtension.
   *
   * @return alternativeText
   */
  public java.lang.String getAlternativeText() {
    return alternativeText;
  }

  /**
   * Sets the alternativeText value for this ImageAdExtension.
   *
   * @param alternativeText
   */
  public void setAlternativeText(java.lang.String alternativeText) {
    this.alternativeText = alternativeText;
  }

  /**
   * Gets the description value for this ImageAdExtension.
   *
   * @return description
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the description value for this ImageAdExtension.
   *
   * @param description
   */
  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  /**
   * Gets the destinationUrl value for this ImageAdExtension.
   *
   * @return destinationUrl
   */
  public java.lang.String getDestinationUrl() {
    return destinationUrl;
  }

  /**
   * Sets the destinationUrl value for this ImageAdExtension.
   *
   * @param destinationUrl
   */
  public void setDestinationUrl(java.lang.String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  /**
   * Gets the finalAppUrls value for this ImageAdExtension.
   *
   * @return finalAppUrls
   */
  public com.microsoft.bingads.v10.datacontracts.AppUrl[] getFinalAppUrls() {
    return finalAppUrls;
  }

  /**
   * Sets the finalAppUrls value for this ImageAdExtension.
   *
   * @param finalAppUrls
   */
  public void setFinalAppUrls(com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls) {
    this.finalAppUrls = finalAppUrls;
  }

  /**
   * Gets the finalMobileUrls value for this ImageAdExtension.
   *
   * @return finalMobileUrls
   */
  public java.lang.String[] getFinalMobileUrls() {
    return finalMobileUrls;
  }

  /**
   * Sets the finalMobileUrls value for this ImageAdExtension.
   *
   * @param finalMobileUrls
   */
  public void setFinalMobileUrls(java.lang.String[] finalMobileUrls) {
    this.finalMobileUrls = finalMobileUrls;
  }

  /**
   * Gets the finalUrls value for this ImageAdExtension.
   *
   * @return finalUrls
   */
  public java.lang.String[] getFinalUrls() {
    return finalUrls;
  }

  /**
   * Sets the finalUrls value for this ImageAdExtension.
   *
   * @param finalUrls
   */
  public void setFinalUrls(java.lang.String[] finalUrls) {
    this.finalUrls = finalUrls;
  }

  /**
   * Gets the imageMediaIds value for this ImageAdExtension.
   *
   * @return imageMediaIds
   */
  public long[] getImageMediaIds() {
    return imageMediaIds;
  }

  /**
   * Sets the imageMediaIds value for this ImageAdExtension.
   *
   * @param imageMediaIds
   */
  public void setImageMediaIds(long[] imageMediaIds) {
    this.imageMediaIds = imageMediaIds;
  }

  /**
   * Gets the trackingUrlTemplate value for this ImageAdExtension.
   *
   * @return trackingUrlTemplate
   */
  public java.lang.String getTrackingUrlTemplate() {
    return trackingUrlTemplate;
  }

  /**
   * Sets the trackingUrlTemplate value for this ImageAdExtension.
   *
   * @param trackingUrlTemplate
   */
  public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
    this.trackingUrlTemplate = trackingUrlTemplate;
  }

  /**
   * Gets the urlCustomParameters value for this ImageAdExtension.
   *
   * @return urlCustomParameters
   */
  public com.microsoft.bingads.v10.datacontracts.CustomParameters getUrlCustomParameters() {
    return urlCustomParameters;
  }

  /**
   * Sets the urlCustomParameters value for this ImageAdExtension.
   *
   * @param urlCustomParameters
   */
  public void setUrlCustomParameters(com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters) {
    this.urlCustomParameters = urlCustomParameters;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof ImageAdExtension)) return false;
    ImageAdExtension other = (ImageAdExtension) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.alternativeText == null && other.getAlternativeText() == null) ||
                    (this.alternativeText != null &&
                            this.alternativeText.equals(other.getAlternativeText()))) &&
            ((this.description == null && other.getDescription() == null) ||
                    (this.description != null &&
                            this.description.equals(other.getDescription()))) &&
            ((this.destinationUrl == null && other.getDestinationUrl() == null) ||
                    (this.destinationUrl != null &&
                            this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.finalAppUrls == null && other.getFinalAppUrls() == null) ||
                    (this.finalAppUrls != null &&
                            java.util.Arrays.equals(this.finalAppUrls, other.getFinalAppUrls()))) &&
            ((this.finalMobileUrls == null && other.getFinalMobileUrls() == null) ||
                    (this.finalMobileUrls != null &&
                            java.util.Arrays.equals(this.finalMobileUrls, other.getFinalMobileUrls()))) &&
            ((this.finalUrls == null && other.getFinalUrls() == null) ||
                    (this.finalUrls != null &&
                            java.util.Arrays.equals(this.finalUrls, other.getFinalUrls()))) &&
            ((this.imageMediaIds == null && other.getImageMediaIds() == null) ||
                    (this.imageMediaIds != null &&
                            java.util.Arrays.equals(this.imageMediaIds, other.getImageMediaIds()))) &&
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
    if (getAlternativeText() != null) {
      _hashCode += getAlternativeText().hashCode();
    }
    if (getDescription() != null) {
      _hashCode += getDescription().hashCode();
    }
    if (getDestinationUrl() != null) {
      _hashCode += getDestinationUrl().hashCode();
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
    if (getImageMediaIds() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getImageMediaIds());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getImageMediaIds(), i);
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
