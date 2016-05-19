/**
 * SuggestKeywordsFromExistingKeywordsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class SuggestKeywordsFromExistingKeywordsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(SuggestKeywordsFromExistingKeywordsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">SuggestKeywordsFromExistingKeywordsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywords");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Keywords"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
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
    elemField.setFieldName("maxSuggestionsPerKeyword");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "MaxSuggestionsPerKeyword"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("suggestionType");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "SuggestionType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("removeDuplicates");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "RemoveDuplicates"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("excludeBrand");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "ExcludeBrand"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
    elemField.setFieldName("campaignId");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "CampaignId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String[] keywords;
  private java.lang.String language;
  private java.lang.String[] publisherCountries;
  private java.lang.Integer maxSuggestionsPerKeyword;
  private java.lang.Integer suggestionType;
  private java.lang.Boolean removeDuplicates;
  private java.lang.Boolean excludeBrand;
  private java.lang.Long adGroupId;
  private java.lang.Long campaignId;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public SuggestKeywordsFromExistingKeywordsRequest() {
  }

  public SuggestKeywordsFromExistingKeywordsRequest(
          java.lang.String[] keywords,
          java.lang.String language,
          java.lang.String[] publisherCountries,
          java.lang.Integer maxSuggestionsPerKeyword,
          java.lang.Integer suggestionType,
          java.lang.Boolean removeDuplicates,
          java.lang.Boolean excludeBrand,
          java.lang.Long adGroupId,
          java.lang.Long campaignId) {
    this.keywords = keywords;
    this.language = language;
    this.publisherCountries = publisherCountries;
    this.maxSuggestionsPerKeyword = maxSuggestionsPerKeyword;
    this.suggestionType = suggestionType;
    this.removeDuplicates = removeDuplicates;
    this.excludeBrand = excludeBrand;
    this.adGroupId = adGroupId;
    this.campaignId = campaignId;
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
   * Gets the keywords value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @return keywords
   */
  public java.lang.String[] getKeywords() {
    return keywords;
  }

  /**
   * Sets the keywords value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @param keywords
   */
  public void setKeywords(java.lang.String[] keywords) {
    this.keywords = keywords;
  }

  /**
   * Gets the language value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @return language
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * Sets the language value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @param language
   */
  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  /**
   * Gets the publisherCountries value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @return publisherCountries
   */
  public java.lang.String[] getPublisherCountries() {
    return publisherCountries;
  }

  /**
   * Sets the publisherCountries value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @param publisherCountries
   */
  public void setPublisherCountries(java.lang.String[] publisherCountries) {
    this.publisherCountries = publisherCountries;
  }

  /**
   * Gets the maxSuggestionsPerKeyword value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @return maxSuggestionsPerKeyword
   */
  public java.lang.Integer getMaxSuggestionsPerKeyword() {
    return maxSuggestionsPerKeyword;
  }

  /**
   * Sets the maxSuggestionsPerKeyword value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @param maxSuggestionsPerKeyword
   */
  public void setMaxSuggestionsPerKeyword(java.lang.Integer maxSuggestionsPerKeyword) {
    this.maxSuggestionsPerKeyword = maxSuggestionsPerKeyword;
  }

  /**
   * Gets the suggestionType value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @return suggestionType
   */
  public java.lang.Integer getSuggestionType() {
    return suggestionType;
  }

  /**
   * Sets the suggestionType value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @param suggestionType
   */
  public void setSuggestionType(java.lang.Integer suggestionType) {
    this.suggestionType = suggestionType;
  }

  /**
   * Gets the removeDuplicates value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @return removeDuplicates
   */
  public java.lang.Boolean getRemoveDuplicates() {
    return removeDuplicates;
  }

  /**
   * Sets the removeDuplicates value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @param removeDuplicates
   */
  public void setRemoveDuplicates(java.lang.Boolean removeDuplicates) {
    this.removeDuplicates = removeDuplicates;
  }

  /**
   * Gets the excludeBrand value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @return excludeBrand
   */
  public java.lang.Boolean getExcludeBrand() {
    return excludeBrand;
  }

  /**
   * Sets the excludeBrand value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @param excludeBrand
   */
  public void setExcludeBrand(java.lang.Boolean excludeBrand) {
    this.excludeBrand = excludeBrand;
  }

  /**
   * Gets the adGroupId value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @return adGroupId
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the adGroupId value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @param adGroupId
   */
  public void setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Gets the campaignId value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @return campaignId
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the campaignId value for this SuggestKeywordsFromExistingKeywordsRequest.
   *
   * @param campaignId
   */
  public void setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof SuggestKeywordsFromExistingKeywordsRequest)) return false;
    SuggestKeywordsFromExistingKeywordsRequest other = (SuggestKeywordsFromExistingKeywordsRequest) obj;
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
            ((this.language == null && other.getLanguage() == null) ||
                    (this.language != null &&
                            this.language.equals(other.getLanguage()))) &&
            ((this.publisherCountries == null && other.getPublisherCountries() == null) ||
                    (this.publisherCountries != null &&
                            java.util.Arrays.equals(this.publisherCountries, other.getPublisherCountries()))) &&
            ((this.maxSuggestionsPerKeyword == null && other.getMaxSuggestionsPerKeyword() == null) ||
                    (this.maxSuggestionsPerKeyword != null &&
                            this.maxSuggestionsPerKeyword.equals(other.getMaxSuggestionsPerKeyword()))) &&
            ((this.suggestionType == null && other.getSuggestionType() == null) ||
                    (this.suggestionType != null &&
                            this.suggestionType.equals(other.getSuggestionType()))) &&
            ((this.removeDuplicates == null && other.getRemoveDuplicates() == null) ||
                    (this.removeDuplicates != null &&
                            this.removeDuplicates.equals(other.getRemoveDuplicates()))) &&
            ((this.excludeBrand == null && other.getExcludeBrand() == null) ||
                    (this.excludeBrand != null &&
                            this.excludeBrand.equals(other.getExcludeBrand()))) &&
            ((this.adGroupId == null && other.getAdGroupId() == null) ||
                    (this.adGroupId != null &&
                            this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.campaignId == null && other.getCampaignId() == null) ||
                    (this.campaignId != null &&
                            this.campaignId.equals(other.getCampaignId())));
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
    if (getMaxSuggestionsPerKeyword() != null) {
      _hashCode += getMaxSuggestionsPerKeyword().hashCode();
    }
    if (getSuggestionType() != null) {
      _hashCode += getSuggestionType().hashCode();
    }
    if (getRemoveDuplicates() != null) {
      _hashCode += getRemoveDuplicates().hashCode();
    }
    if (getExcludeBrand() != null) {
      _hashCode += getExcludeBrand().hashCode();
    }
    if (getAdGroupId() != null) {
      _hashCode += getAdGroupId().hashCode();
    }
    if (getCampaignId() != null) {
      _hashCode += getCampaignId().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
