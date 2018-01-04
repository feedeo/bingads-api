/**
 * AdGroup.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class AdGroup implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AdGroup.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroup"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adDistribution");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdDistribution"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdDistribution"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adRotation");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdRotation"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdRotation"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("biddingModel");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BiddingModel"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BiddingModel"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("biddingScheme");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BiddingScheme"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "BiddingScheme"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("contentMatchBid");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ContentMatchBid"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Bid"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("endDate");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "EndDate"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Date"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
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
    elemField.setFieldName("language");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Language"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("name");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Name"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("nativeBidAdjustment");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "NativeBidAdjustment"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("network");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Network"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Network"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("pricingModel");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PricingModel"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PricingModel"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("searchBid");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SearchBid"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Bid"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("settings");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Settings"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Setting"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Setting"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("startDate");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "StartDate"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Date"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("status");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Status"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupStatus"));
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
    elemField.setFieldName("urlCustomParameters");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "UrlCustomParameters"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "CustomParameters"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String[] adDistribution;
  private com.microsoft.bingads.v10.campaignmanagement.AdRotation adRotation;
  private com.microsoft.bingads.v10.campaignmanagement.BiddingModel biddingModel;
  private com.microsoft.bingads.v10.datacontracts.BiddingScheme biddingScheme;
  private com.microsoft.bingads.v10.campaignmanagement.Bid contentMatchBid;
  private com.microsoft.bingads.v10.campaignmanagement.Date endDate;
  private com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
  private java.lang.Long id;
  private java.lang.String language;
  private java.lang.String name;
  private java.lang.Integer nativeBidAdjustment;
  private com.microsoft.bingads.v10.campaignmanagement.Network network;
  private com.microsoft.bingads.v10.campaignmanagement.PricingModel pricingModel;
  private com.microsoft.bingads.v10.campaignmanagement.Bid searchBid;
  private com.microsoft.bingads.v10.campaignmanagement.Setting[] settings;
  private com.microsoft.bingads.v10.campaignmanagement.Date startDate;
  private com.microsoft.bingads.v10.campaignmanagement.AdGroupStatus status;
  private java.lang.String trackingUrlTemplate;
  private com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AdGroup() {
  }

  public AdGroup(
          java.lang.String[] adDistribution,
          com.microsoft.bingads.v10.campaignmanagement.AdRotation adRotation,
          com.microsoft.bingads.v10.campaignmanagement.BiddingModel biddingModel,
          com.microsoft.bingads.v10.datacontracts.BiddingScheme biddingScheme,
          com.microsoft.bingads.v10.campaignmanagement.Bid contentMatchBid,
          com.microsoft.bingads.v10.campaignmanagement.Date endDate,
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Long id,
          java.lang.String language,
          java.lang.String name,
          java.lang.Integer nativeBidAdjustment,
          com.microsoft.bingads.v10.campaignmanagement.Network network,
          com.microsoft.bingads.v10.campaignmanagement.PricingModel pricingModel,
          com.microsoft.bingads.v10.campaignmanagement.Bid searchBid,
          com.microsoft.bingads.v10.campaignmanagement.Setting[] settings,
          com.microsoft.bingads.v10.campaignmanagement.Date startDate,
          com.microsoft.bingads.v10.campaignmanagement.AdGroupStatus status,
          java.lang.String trackingUrlTemplate,
          com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters) {
    this.adDistribution = adDistribution;
    this.adRotation = adRotation;
    this.biddingModel = biddingModel;
    this.biddingScheme = biddingScheme;
    this.contentMatchBid = contentMatchBid;
    this.endDate = endDate;
    this.forwardCompatibilityMap = forwardCompatibilityMap;
    this.id = id;
    this.language = language;
    this.name = name;
    this.nativeBidAdjustment = nativeBidAdjustment;
    this.network = network;
    this.pricingModel = pricingModel;
    this.searchBid = searchBid;
    this.settings = settings;
    this.startDate = startDate;
    this.status = status;
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
   * Gets the adDistribution value for this AdGroup.
   *
   * @return adDistribution
   */
  public java.lang.String[] getAdDistribution() {
    return adDistribution;
  }

  /**
   * Sets the adDistribution value for this AdGroup.
   *
   * @param adDistribution
   */
  public void setAdDistribution(java.lang.String[] adDistribution) {
    this.adDistribution = adDistribution;
  }

  /**
   * Gets the adRotation value for this AdGroup.
   *
   * @return adRotation
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdRotation getAdRotation() {
    return adRotation;
  }

  /**
   * Sets the adRotation value for this AdGroup.
   *
   * @param adRotation
   */
  public void setAdRotation(com.microsoft.bingads.v10.campaignmanagement.AdRotation adRotation) {
    this.adRotation = adRotation;
  }

  /**
   * Gets the biddingModel value for this AdGroup.
   *
   * @return biddingModel
   */
  public com.microsoft.bingads.v10.campaignmanagement.BiddingModel getBiddingModel() {
    return biddingModel;
  }

  /**
   * Sets the biddingModel value for this AdGroup.
   *
   * @param biddingModel
   */
  public void setBiddingModel(com.microsoft.bingads.v10.campaignmanagement.BiddingModel biddingModel) {
    this.biddingModel = biddingModel;
  }

  /**
   * Gets the biddingScheme value for this AdGroup.
   *
   * @return biddingScheme
   */
  public com.microsoft.bingads.v10.datacontracts.BiddingScheme getBiddingScheme() {
    return biddingScheme;
  }

  /**
   * Sets the biddingScheme value for this AdGroup.
   *
   * @param biddingScheme
   */
  public void setBiddingScheme(com.microsoft.bingads.v10.datacontracts.BiddingScheme biddingScheme) {
    this.biddingScheme = biddingScheme;
  }

  /**
   * Gets the contentMatchBid value for this AdGroup.
   *
   * @return contentMatchBid
   */
  public com.microsoft.bingads.v10.campaignmanagement.Bid getContentMatchBid() {
    return contentMatchBid;
  }

  /**
   * Sets the contentMatchBid value for this AdGroup.
   *
   * @param contentMatchBid
   */
  public void setContentMatchBid(com.microsoft.bingads.v10.campaignmanagement.Bid contentMatchBid) {
    this.contentMatchBid = contentMatchBid;
  }

  /**
   * Gets the endDate value for this AdGroup.
   *
   * @return endDate
   */
  public com.microsoft.bingads.v10.campaignmanagement.Date getEndDate() {
    return endDate;
  }

  /**
   * Sets the endDate value for this AdGroup.
   *
   * @param endDate
   */
  public void setEndDate(com.microsoft.bingads.v10.campaignmanagement.Date endDate) {
    this.endDate = endDate;
  }

  /**
   * Gets the forwardCompatibilityMap value for this AdGroup.
   *
   * @return forwardCompatibilityMap
   */
  public com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
    return forwardCompatibilityMap;
  }

  /**
   * Sets the forwardCompatibilityMap value for this AdGroup.
   *
   * @param forwardCompatibilityMap
   */
  public void setForwardCompatibilityMap(com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
    this.forwardCompatibilityMap = forwardCompatibilityMap;
  }

  /**
   * Gets the id value for this AdGroup.
   *
   * @return id
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the id value for this AdGroup.
   *
   * @param id
   */
  public void setId(java.lang.Long id) {
    this.id = id;
  }

  /**
   * Gets the language value for this AdGroup.
   *
   * @return language
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * Sets the language value for this AdGroup.
   *
   * @param language
   */
  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  /**
   * Gets the name value for this AdGroup.
   *
   * @return name
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the name value for this AdGroup.
   *
   * @param name
   */
  public void setName(java.lang.String name) {
    this.name = name;
  }

  /**
   * Gets the nativeBidAdjustment value for this AdGroup.
   *
   * @return nativeBidAdjustment
   */
  public java.lang.Integer getNativeBidAdjustment() {
    return nativeBidAdjustment;
  }

  /**
   * Sets the nativeBidAdjustment value for this AdGroup.
   *
   * @param nativeBidAdjustment
   */
  public void setNativeBidAdjustment(java.lang.Integer nativeBidAdjustment) {
    this.nativeBidAdjustment = nativeBidAdjustment;
  }

  /**
   * Gets the network value for this AdGroup.
   *
   * @return network
   */
  public com.microsoft.bingads.v10.campaignmanagement.Network getNetwork() {
    return network;
  }

  /**
   * Sets the network value for this AdGroup.
   *
   * @param network
   */
  public void setNetwork(com.microsoft.bingads.v10.campaignmanagement.Network network) {
    this.network = network;
  }

  /**
   * Gets the pricingModel value for this AdGroup.
   *
   * @return pricingModel
   */
  public com.microsoft.bingads.v10.campaignmanagement.PricingModel getPricingModel() {
    return pricingModel;
  }

  /**
   * Sets the pricingModel value for this AdGroup.
   *
   * @param pricingModel
   */
  public void setPricingModel(com.microsoft.bingads.v10.campaignmanagement.PricingModel pricingModel) {
    this.pricingModel = pricingModel;
  }

  /**
   * Gets the searchBid value for this AdGroup.
   *
   * @return searchBid
   */
  public com.microsoft.bingads.v10.campaignmanagement.Bid getSearchBid() {
    return searchBid;
  }

  /**
   * Sets the searchBid value for this AdGroup.
   *
   * @param searchBid
   */
  public void setSearchBid(com.microsoft.bingads.v10.campaignmanagement.Bid searchBid) {
    this.searchBid = searchBid;
  }

  /**
   * Gets the settings value for this AdGroup.
   *
   * @return settings
   */
  public com.microsoft.bingads.v10.campaignmanagement.Setting[] getSettings() {
    return settings;
  }

  /**
   * Sets the settings value for this AdGroup.
   *
   * @param settings
   */
  public void setSettings(com.microsoft.bingads.v10.campaignmanagement.Setting[] settings) {
    this.settings = settings;
  }

  /**
   * Gets the startDate value for this AdGroup.
   *
   * @return startDate
   */
  public com.microsoft.bingads.v10.campaignmanagement.Date getStartDate() {
    return startDate;
  }

  /**
   * Sets the startDate value for this AdGroup.
   *
   * @param startDate
   */
  public void setStartDate(com.microsoft.bingads.v10.campaignmanagement.Date startDate) {
    this.startDate = startDate;
  }

  /**
   * Gets the status value for this AdGroup.
   *
   * @return status
   */
  public com.microsoft.bingads.v10.campaignmanagement.AdGroupStatus getStatus() {
    return status;
  }

  /**
   * Sets the status value for this AdGroup.
   *
   * @param status
   */
  public void setStatus(com.microsoft.bingads.v10.campaignmanagement.AdGroupStatus status) {
    this.status = status;
  }

  /**
   * Gets the trackingUrlTemplate value for this AdGroup.
   *
   * @return trackingUrlTemplate
   */
  public java.lang.String getTrackingUrlTemplate() {
    return trackingUrlTemplate;
  }

  /**
   * Sets the trackingUrlTemplate value for this AdGroup.
   *
   * @param trackingUrlTemplate
   */
  public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
    this.trackingUrlTemplate = trackingUrlTemplate;
  }

  /**
   * Gets the urlCustomParameters value for this AdGroup.
   *
   * @return urlCustomParameters
   */
  public com.microsoft.bingads.v10.datacontracts.CustomParameters getUrlCustomParameters() {
    return urlCustomParameters;
  }

  /**
   * Sets the urlCustomParameters value for this AdGroup.
   *
   * @param urlCustomParameters
   */
  public void setUrlCustomParameters(com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters) {
    this.urlCustomParameters = urlCustomParameters;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AdGroup)) return false;
    AdGroup other = (AdGroup) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.adDistribution == null && other.getAdDistribution() == null) ||
                    (this.adDistribution != null &&
                            java.util.Arrays.equals(this.adDistribution, other.getAdDistribution()))) &&
            ((this.adRotation == null && other.getAdRotation() == null) ||
                    (this.adRotation != null &&
                            this.adRotation.equals(other.getAdRotation()))) &&
            ((this.biddingModel == null && other.getBiddingModel() == null) ||
                    (this.biddingModel != null &&
                            this.biddingModel.equals(other.getBiddingModel()))) &&
            ((this.biddingScheme == null && other.getBiddingScheme() == null) ||
                    (this.biddingScheme != null &&
                            this.biddingScheme.equals(other.getBiddingScheme()))) &&
            ((this.contentMatchBid == null && other.getContentMatchBid() == null) ||
                    (this.contentMatchBid != null &&
                            this.contentMatchBid.equals(other.getContentMatchBid()))) &&
            ((this.endDate == null && other.getEndDate() == null) ||
                    (this.endDate != null &&
                            this.endDate.equals(other.getEndDate()))) &&
            ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                    (this.forwardCompatibilityMap != null &&
                            java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.id == null && other.getId() == null) ||
                    (this.id != null &&
                            this.id.equals(other.getId()))) &&
            ((this.language == null && other.getLanguage() == null) ||
                    (this.language != null &&
                            this.language.equals(other.getLanguage()))) &&
            ((this.name == null && other.getName() == null) ||
                    (this.name != null &&
                            this.name.equals(other.getName()))) &&
            ((this.nativeBidAdjustment == null && other.getNativeBidAdjustment() == null) ||
                    (this.nativeBidAdjustment != null &&
                            this.nativeBidAdjustment.equals(other.getNativeBidAdjustment()))) &&
            ((this.network == null && other.getNetwork() == null) ||
                    (this.network != null &&
                            this.network.equals(other.getNetwork()))) &&
            ((this.pricingModel == null && other.getPricingModel() == null) ||
                    (this.pricingModel != null &&
                            this.pricingModel.equals(other.getPricingModel()))) &&
            ((this.searchBid == null && other.getSearchBid() == null) ||
                    (this.searchBid != null &&
                            this.searchBid.equals(other.getSearchBid()))) &&
            ((this.settings == null && other.getSettings() == null) ||
                    (this.settings != null &&
                            java.util.Arrays.equals(this.settings, other.getSettings()))) &&
            ((this.startDate == null && other.getStartDate() == null) ||
                    (this.startDate != null &&
                            this.startDate.equals(other.getStartDate()))) &&
            ((this.status == null && other.getStatus() == null) ||
                    (this.status != null &&
                            this.status.equals(other.getStatus()))) &&
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
    int _hashCode = 1;
    if (getAdDistribution() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getAdDistribution());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getAdDistribution(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getAdRotation() != null) {
      _hashCode += getAdRotation().hashCode();
    }
    if (getBiddingModel() != null) {
      _hashCode += getBiddingModel().hashCode();
    }
    if (getBiddingScheme() != null) {
      _hashCode += getBiddingScheme().hashCode();
    }
    if (getContentMatchBid() != null) {
      _hashCode += getContentMatchBid().hashCode();
    }
    if (getEndDate() != null) {
      _hashCode += getEndDate().hashCode();
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
    if (getLanguage() != null) {
      _hashCode += getLanguage().hashCode();
    }
    if (getName() != null) {
      _hashCode += getName().hashCode();
    }
    if (getNativeBidAdjustment() != null) {
      _hashCode += getNativeBidAdjustment().hashCode();
    }
    if (getNetwork() != null) {
      _hashCode += getNetwork().hashCode();
    }
    if (getPricingModel() != null) {
      _hashCode += getPricingModel().hashCode();
    }
    if (getSearchBid() != null) {
      _hashCode += getSearchBid().hashCode();
    }
    if (getSettings() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getSettings());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getSettings(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getStartDate() != null) {
      _hashCode += getStartDate().hashCode();
    }
    if (getStatus() != null) {
      _hashCode += getStatus().hashCode();
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
