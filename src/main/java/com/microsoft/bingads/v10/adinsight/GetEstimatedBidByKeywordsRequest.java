/**
 * GetEstimatedBidByKeywordsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class GetEstimatedBidByKeywordsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetEstimatedBidByKeywordsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetEstimatedBidByKeywordsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywords");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Keywords"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "KeywordAndMatchType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "KeywordAndMatchType"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("targetPositionForAds");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "TargetPositionForAds"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "TargetAdPosition"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("language");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Language"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("publisherCountries");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "PublisherCountries"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("currency");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Currency"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Currency"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignId");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "CampaignId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupId");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "AdGroupId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("entityLevelBid");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "EntityLevelBid"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.message.KeywordAndMatchType[] keywords;
  private com.microsoft.bingads.v10.adinsight.entity.TargetAdPosition targetPositionForAds;
  private java.lang.String language;
  private java.lang.String[] publisherCountries;
  private com.microsoft.bingads.v10.adinsight.entity.Currency currency;
  private java.lang.Long campaignId;
  private java.lang.Long adGroupId;
  private java.lang.String entityLevelBid;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetEstimatedBidByKeywordsRequest() {
  }

  public GetEstimatedBidByKeywordsRequest(
          com.microsoft.bingads.v10.adinsight.message.KeywordAndMatchType[] keywords,
          com.microsoft.bingads.v10.adinsight.entity.TargetAdPosition targetPositionForAds,
          java.lang.String language,
          java.lang.String[] publisherCountries,
          com.microsoft.bingads.v10.adinsight.entity.Currency currency,
          java.lang.Long campaignId,
          java.lang.Long adGroupId,
          java.lang.String entityLevelBid) {
    this.keywords = keywords;
    this.targetPositionForAds = targetPositionForAds;
    this.language = language;
    this.publisherCountries = publisherCountries;
    this.currency = currency;
    this.campaignId = campaignId;
    this.adGroupId = adGroupId;
    this.entityLevelBid = entityLevelBid;
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
   * Gets the keywords value for this GetEstimatedBidByKeywordsRequest.
   *
   * @return keywords
   */
  public com.microsoft.bingads.v10.adinsight.message.KeywordAndMatchType[] getKeywords() {
    return keywords;
  }

  /**
   * Sets the keywords value for this GetEstimatedBidByKeywordsRequest.
   *
   * @param keywords
   */
  public void setKeywords(com.microsoft.bingads.v10.adinsight.message.KeywordAndMatchType[] keywords) {
    this.keywords = keywords;
  }

  /**
   * Gets the targetPositionForAds value for this GetEstimatedBidByKeywordsRequest.
   *
   * @return targetPositionForAds
   */
  public com.microsoft.bingads.v10.adinsight.entity.TargetAdPosition getTargetPositionForAds() {
    return targetPositionForAds;
  }

  /**
   * Sets the targetPositionForAds value for this GetEstimatedBidByKeywordsRequest.
   *
   * @param targetPositionForAds
   */
  public void setTargetPositionForAds(com.microsoft.bingads.v10.adinsight.entity.TargetAdPosition targetPositionForAds) {
    this.targetPositionForAds = targetPositionForAds;
  }

  /**
   * Gets the language value for this GetEstimatedBidByKeywordsRequest.
   *
   * @return language
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * Sets the language value for this GetEstimatedBidByKeywordsRequest.
   *
   * @param language
   */
  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  /**
   * Gets the publisherCountries value for this GetEstimatedBidByKeywordsRequest.
   *
   * @return publisherCountries
   */
  public java.lang.String[] getPublisherCountries() {
    return publisherCountries;
  }

  /**
   * Sets the publisherCountries value for this GetEstimatedBidByKeywordsRequest.
   *
   * @param publisherCountries
   */
  public void setPublisherCountries(java.lang.String[] publisherCountries) {
    this.publisherCountries = publisherCountries;
  }

  /**
   * Gets the currency value for this GetEstimatedBidByKeywordsRequest.
   *
   * @return currency
   */
  public com.microsoft.bingads.v10.adinsight.entity.Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the currency value for this GetEstimatedBidByKeywordsRequest.
   *
   * @param currency
   */
  public void setCurrency(com.microsoft.bingads.v10.adinsight.entity.Currency currency) {
    this.currency = currency;
  }

  /**
   * Gets the campaignId value for this GetEstimatedBidByKeywordsRequest.
   *
   * @return campaignId
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the campaignId value for this GetEstimatedBidByKeywordsRequest.
   *
   * @param campaignId
   */
  public void setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Gets the adGroupId value for this GetEstimatedBidByKeywordsRequest.
   *
   * @return adGroupId
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the adGroupId value for this GetEstimatedBidByKeywordsRequest.
   *
   * @param adGroupId
   */
  public void setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Gets the entityLevelBid value for this GetEstimatedBidByKeywordsRequest.
   *
   * @return entityLevelBid
   */
  public java.lang.String getEntityLevelBid() {
    return entityLevelBid;
  }

  /**
   * Sets the entityLevelBid value for this GetEstimatedBidByKeywordsRequest.
   *
   * @param entityLevelBid
   */
  public void setEntityLevelBid(java.lang.String entityLevelBid) {
    this.entityLevelBid = entityLevelBid;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetEstimatedBidByKeywordsRequest)) return false;
    GetEstimatedBidByKeywordsRequest other = (GetEstimatedBidByKeywordsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.keywords == null && other.getKeywords() == null) ||
                    (this.keywords != null &&
                            java.util.Arrays.equals(this.keywords, other.getKeywords()))) &&
            ((this.targetPositionForAds == null && other.getTargetPositionForAds() == null) ||
                    (this.targetPositionForAds != null &&
                            this.targetPositionForAds.equals(other.getTargetPositionForAds()))) &&
            ((this.language == null && other.getLanguage() == null) ||
                    (this.language != null &&
                            this.language.equals(other.getLanguage()))) &&
            ((this.publisherCountries == null && other.getPublisherCountries() == null) ||
                    (this.publisherCountries != null &&
                            java.util.Arrays.equals(this.publisherCountries, other.getPublisherCountries()))) &&
            ((this.currency == null && other.getCurrency() == null) ||
                    (this.currency != null &&
                            this.currency.equals(other.getCurrency()))) &&
            ((this.campaignId == null && other.getCampaignId() == null) ||
                    (this.campaignId != null &&
                            this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adGroupId == null && other.getAdGroupId() == null) ||
                    (this.adGroupId != null &&
                            this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.entityLevelBid == null && other.getEntityLevelBid() == null) ||
                    (this.entityLevelBid != null &&
                            this.entityLevelBid.equals(other.getEntityLevelBid())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getKeywords() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getKeywords());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getKeywords(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getTargetPositionForAds() != null) {
      _hashCode += getTargetPositionForAds().hashCode();
    }
    if (getLanguage() != null) {
      _hashCode += getLanguage().hashCode();
    }
    if (getPublisherCountries() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getPublisherCountries());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getPublisherCountries(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getCurrency() != null) {
      _hashCode += getCurrency().hashCode();
    }
    if (getCampaignId() != null) {
      _hashCode += getCampaignId().hashCode();
    }
    if (getAdGroupId() != null) {
      _hashCode += getAdGroupId().hashCode();
    }
    if (getEntityLevelBid() != null) {
      _hashCode += getEntityLevelBid().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
