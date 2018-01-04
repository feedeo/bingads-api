/**
 * KeywordOpportunity.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class KeywordOpportunity extends com.microsoft.bingads.v10.adinsight.entity.Opportunity implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(KeywordOpportunity.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordOpportunity"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupId");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupName");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupName"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignId");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "CampaignId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignName");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "CampaignName"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("competition");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Competition"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("estimatedIncreaseInClicks");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedIncreaseInClicks"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("estimatedIncreaseInCost");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedIncreaseInCost"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("estimatedIncreaseInImpressions");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedIncreaseInImpressions"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("matchType");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("monthlySearches");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MonthlySearches"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("suggestedBid");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SuggestedBid"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("suggestedKeyword");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SuggestedKeyword"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long adGroupId;
  private java.lang.String adGroupName;
  private java.lang.Long campaignId;
  private java.lang.String campaignName;
  private java.lang.Double competition;
  private java.lang.Double estimatedIncreaseInClicks;
  private java.lang.Double estimatedIncreaseInCost;
  private java.lang.Long estimatedIncreaseInImpressions;
  private java.lang.Integer matchType;
  private java.lang.Long monthlySearches;
  private java.lang.Double suggestedBid;
  private java.lang.String suggestedKeyword;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public KeywordOpportunity() {
  }

  public KeywordOpportunity(
          java.lang.String opportunityKey,
          java.lang.Long adGroupId,
          java.lang.String adGroupName,
          java.lang.Long campaignId,
          java.lang.String campaignName,
          java.lang.Double competition,
          java.lang.Double estimatedIncreaseInClicks,
          java.lang.Double estimatedIncreaseInCost,
          java.lang.Long estimatedIncreaseInImpressions,
          java.lang.Integer matchType,
          java.lang.Long monthlySearches,
          java.lang.Double suggestedBid,
          java.lang.String suggestedKeyword) {
    super(
            opportunityKey);
    this.adGroupId = adGroupId;
    this.adGroupName = adGroupName;
    this.campaignId = campaignId;
    this.campaignName = campaignName;
    this.competition = competition;
    this.estimatedIncreaseInClicks = estimatedIncreaseInClicks;
    this.estimatedIncreaseInCost = estimatedIncreaseInCost;
    this.estimatedIncreaseInImpressions = estimatedIncreaseInImpressions;
    this.matchType = matchType;
    this.monthlySearches = monthlySearches;
    this.suggestedBid = suggestedBid;
    this.suggestedKeyword = suggestedKeyword;
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
   * Gets the adGroupId value for this KeywordOpportunity.
   *
   * @return adGroupId
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the adGroupId value for this KeywordOpportunity.
   *
   * @param adGroupId
   */
  public void setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Gets the adGroupName value for this KeywordOpportunity.
   *
   * @return adGroupName
   */
  public java.lang.String getAdGroupName() {
    return adGroupName;
  }

  /**
   * Sets the adGroupName value for this KeywordOpportunity.
   *
   * @param adGroupName
   */
  public void setAdGroupName(java.lang.String adGroupName) {
    this.adGroupName = adGroupName;
  }

  /**
   * Gets the campaignId value for this KeywordOpportunity.
   *
   * @return campaignId
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the campaignId value for this KeywordOpportunity.
   *
   * @param campaignId
   */
  public void setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Gets the campaignName value for this KeywordOpportunity.
   *
   * @return campaignName
   */
  public java.lang.String getCampaignName() {
    return campaignName;
  }

  /**
   * Sets the campaignName value for this KeywordOpportunity.
   *
   * @param campaignName
   */
  public void setCampaignName(java.lang.String campaignName) {
    this.campaignName = campaignName;
  }

  /**
   * Gets the competition value for this KeywordOpportunity.
   *
   * @return competition
   */
  public java.lang.Double getCompetition() {
    return competition;
  }

  /**
   * Sets the competition value for this KeywordOpportunity.
   *
   * @param competition
   */
  public void setCompetition(java.lang.Double competition) {
    this.competition = competition;
  }

  /**
   * Gets the estimatedIncreaseInClicks value for this KeywordOpportunity.
   *
   * @return estimatedIncreaseInClicks
   */
  public java.lang.Double getEstimatedIncreaseInClicks() {
    return estimatedIncreaseInClicks;
  }

  /**
   * Sets the estimatedIncreaseInClicks value for this KeywordOpportunity.
   *
   * @param estimatedIncreaseInClicks
   */
  public void setEstimatedIncreaseInClicks(java.lang.Double estimatedIncreaseInClicks) {
    this.estimatedIncreaseInClicks = estimatedIncreaseInClicks;
  }

  /**
   * Gets the estimatedIncreaseInCost value for this KeywordOpportunity.
   *
   * @return estimatedIncreaseInCost
   */
  public java.lang.Double getEstimatedIncreaseInCost() {
    return estimatedIncreaseInCost;
  }

  /**
   * Sets the estimatedIncreaseInCost value for this KeywordOpportunity.
   *
   * @param estimatedIncreaseInCost
   */
  public void setEstimatedIncreaseInCost(java.lang.Double estimatedIncreaseInCost) {
    this.estimatedIncreaseInCost = estimatedIncreaseInCost;
  }

  /**
   * Gets the estimatedIncreaseInImpressions value for this KeywordOpportunity.
   *
   * @return estimatedIncreaseInImpressions
   */
  public java.lang.Long getEstimatedIncreaseInImpressions() {
    return estimatedIncreaseInImpressions;
  }

  /**
   * Sets the estimatedIncreaseInImpressions value for this KeywordOpportunity.
   *
   * @param estimatedIncreaseInImpressions
   */
  public void setEstimatedIncreaseInImpressions(java.lang.Long estimatedIncreaseInImpressions) {
    this.estimatedIncreaseInImpressions = estimatedIncreaseInImpressions;
  }

  /**
   * Gets the matchType value for this KeywordOpportunity.
   *
   * @return matchType
   */
  public java.lang.Integer getMatchType() {
    return matchType;
  }

  /**
   * Sets the matchType value for this KeywordOpportunity.
   *
   * @param matchType
   */
  public void setMatchType(java.lang.Integer matchType) {
    this.matchType = matchType;
  }

  /**
   * Gets the monthlySearches value for this KeywordOpportunity.
   *
   * @return monthlySearches
   */
  public java.lang.Long getMonthlySearches() {
    return monthlySearches;
  }

  /**
   * Sets the monthlySearches value for this KeywordOpportunity.
   *
   * @param monthlySearches
   */
  public void setMonthlySearches(java.lang.Long monthlySearches) {
    this.monthlySearches = monthlySearches;
  }

  /**
   * Gets the suggestedBid value for this KeywordOpportunity.
   *
   * @return suggestedBid
   */
  public java.lang.Double getSuggestedBid() {
    return suggestedBid;
  }

  /**
   * Sets the suggestedBid value for this KeywordOpportunity.
   *
   * @param suggestedBid
   */
  public void setSuggestedBid(java.lang.Double suggestedBid) {
    this.suggestedBid = suggestedBid;
  }

  /**
   * Gets the suggestedKeyword value for this KeywordOpportunity.
   *
   * @return suggestedKeyword
   */
  public java.lang.String getSuggestedKeyword() {
    return suggestedKeyword;
  }

  /**
   * Sets the suggestedKeyword value for this KeywordOpportunity.
   *
   * @param suggestedKeyword
   */
  public void setSuggestedKeyword(java.lang.String suggestedKeyword) {
    this.suggestedKeyword = suggestedKeyword;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof KeywordOpportunity)) return false;
    KeywordOpportunity other = (KeywordOpportunity) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.adGroupId == null && other.getAdGroupId() == null) ||
                    (this.adGroupId != null &&
                            this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.adGroupName == null && other.getAdGroupName() == null) ||
                    (this.adGroupName != null &&
                            this.adGroupName.equals(other.getAdGroupName()))) &&
            ((this.campaignId == null && other.getCampaignId() == null) ||
                    (this.campaignId != null &&
                            this.campaignId.equals(other.getCampaignId()))) &&
            ((this.campaignName == null && other.getCampaignName() == null) ||
                    (this.campaignName != null &&
                            this.campaignName.equals(other.getCampaignName()))) &&
            ((this.competition == null && other.getCompetition() == null) ||
                    (this.competition != null &&
                            this.competition.equals(other.getCompetition()))) &&
            ((this.estimatedIncreaseInClicks == null && other.getEstimatedIncreaseInClicks() == null) ||
                    (this.estimatedIncreaseInClicks != null &&
                            this.estimatedIncreaseInClicks.equals(other.getEstimatedIncreaseInClicks()))) &&
            ((this.estimatedIncreaseInCost == null && other.getEstimatedIncreaseInCost() == null) ||
                    (this.estimatedIncreaseInCost != null &&
                            this.estimatedIncreaseInCost.equals(other.getEstimatedIncreaseInCost()))) &&
            ((this.estimatedIncreaseInImpressions == null && other.getEstimatedIncreaseInImpressions() == null) ||
                    (this.estimatedIncreaseInImpressions != null &&
                            this.estimatedIncreaseInImpressions.equals(other.getEstimatedIncreaseInImpressions()))) &&
            ((this.matchType == null && other.getMatchType() == null) ||
                    (this.matchType != null &&
                            this.matchType.equals(other.getMatchType()))) &&
            ((this.monthlySearches == null && other.getMonthlySearches() == null) ||
                    (this.monthlySearches != null &&
                            this.monthlySearches.equals(other.getMonthlySearches()))) &&
            ((this.suggestedBid == null && other.getSuggestedBid() == null) ||
                    (this.suggestedBid != null &&
                            this.suggestedBid.equals(other.getSuggestedBid()))) &&
            ((this.suggestedKeyword == null && other.getSuggestedKeyword() == null) ||
                    (this.suggestedKeyword != null &&
                            this.suggestedKeyword.equals(other.getSuggestedKeyword())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getAdGroupId() != null) {
      _hashCode += getAdGroupId().hashCode();
    }
    if (getAdGroupName() != null) {
      _hashCode += getAdGroupName().hashCode();
    }
    if (getCampaignId() != null) {
      _hashCode += getCampaignId().hashCode();
    }
    if (getCampaignName() != null) {
      _hashCode += getCampaignName().hashCode();
    }
    if (getCompetition() != null) {
      _hashCode += getCompetition().hashCode();
    }
    if (getEstimatedIncreaseInClicks() != null) {
      _hashCode += getEstimatedIncreaseInClicks().hashCode();
    }
    if (getEstimatedIncreaseInCost() != null) {
      _hashCode += getEstimatedIncreaseInCost().hashCode();
    }
    if (getEstimatedIncreaseInImpressions() != null) {
      _hashCode += getEstimatedIncreaseInImpressions().hashCode();
    }
    if (getMatchType() != null) {
      _hashCode += getMatchType().hashCode();
    }
    if (getMonthlySearches() != null) {
      _hashCode += getMonthlySearches().hashCode();
    }
    if (getSuggestedBid() != null) {
      _hashCode += getSuggestedBid().hashCode();
    }
    if (getSuggestedKeyword() != null) {
      _hashCode += getSuggestedKeyword().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
