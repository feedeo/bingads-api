/**
 * BroadMatchKeywordOpportunity.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class BroadMatchKeywordOpportunity extends com.microsoft.bingads.v10.adinsight.entity.KeywordOpportunity implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(BroadMatchKeywordOpportunity.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BroadMatchKeywordOpportunity"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("averageCPC");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AverageCPC"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("averageCTR");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AverageCTR"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("clickShare");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ClickShare"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("impressionShare");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ImpressionShare"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("referenceKeywordBid");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ReferenceKeywordBid"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("referenceKeywordId");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ReferenceKeywordId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("referenceKeywordMatchType");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ReferenceKeywordMatchType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("searchQueryKPIs");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SearchQueryKPIs"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BroadMatchSearchQueryKPI"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BroadMatchSearchQueryKPI"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Double averageCPC;
  private java.lang.Double averageCTR;
  private java.lang.Double clickShare;
  private java.lang.Double impressionShare;
  private java.lang.Double referenceKeywordBid;
  private java.lang.Long referenceKeywordId;
  private java.lang.Integer referenceKeywordMatchType;
  private com.microsoft.bingads.v10.adinsight.entity.BroadMatchSearchQueryKPI[] searchQueryKPIs;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public BroadMatchKeywordOpportunity() {
  }

  public BroadMatchKeywordOpportunity(
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
          java.lang.String suggestedKeyword,
          java.lang.Double averageCPC,
          java.lang.Double averageCTR,
          java.lang.Double clickShare,
          java.lang.Double impressionShare,
          java.lang.Double referenceKeywordBid,
          java.lang.Long referenceKeywordId,
          java.lang.Integer referenceKeywordMatchType,
          com.microsoft.bingads.v10.adinsight.entity.BroadMatchSearchQueryKPI[] searchQueryKPIs) {
    super(
            opportunityKey,
            adGroupId,
            adGroupName,
            campaignId,
            campaignName,
            competition,
            estimatedIncreaseInClicks,
            estimatedIncreaseInCost,
            estimatedIncreaseInImpressions,
            matchType,
            monthlySearches,
            suggestedBid,
            suggestedKeyword);
    this.averageCPC = averageCPC;
    this.averageCTR = averageCTR;
    this.clickShare = clickShare;
    this.impressionShare = impressionShare;
    this.referenceKeywordBid = referenceKeywordBid;
    this.referenceKeywordId = referenceKeywordId;
    this.referenceKeywordMatchType = referenceKeywordMatchType;
    this.searchQueryKPIs = searchQueryKPIs;
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
   * Gets the averageCPC value for this BroadMatchKeywordOpportunity.
   *
   * @return averageCPC
   */
  public java.lang.Double getAverageCPC() {
    return averageCPC;
  }

  /**
   * Sets the averageCPC value for this BroadMatchKeywordOpportunity.
   *
   * @param averageCPC
   */
  public void setAverageCPC(java.lang.Double averageCPC) {
    this.averageCPC = averageCPC;
  }

  /**
   * Gets the averageCTR value for this BroadMatchKeywordOpportunity.
   *
   * @return averageCTR
   */
  public java.lang.Double getAverageCTR() {
    return averageCTR;
  }

  /**
   * Sets the averageCTR value for this BroadMatchKeywordOpportunity.
   *
   * @param averageCTR
   */
  public void setAverageCTR(java.lang.Double averageCTR) {
    this.averageCTR = averageCTR;
  }

  /**
   * Gets the clickShare value for this BroadMatchKeywordOpportunity.
   *
   * @return clickShare
   */
  public java.lang.Double getClickShare() {
    return clickShare;
  }

  /**
   * Sets the clickShare value for this BroadMatchKeywordOpportunity.
   *
   * @param clickShare
   */
  public void setClickShare(java.lang.Double clickShare) {
    this.clickShare = clickShare;
  }

  /**
   * Gets the impressionShare value for this BroadMatchKeywordOpportunity.
   *
   * @return impressionShare
   */
  public java.lang.Double getImpressionShare() {
    return impressionShare;
  }

  /**
   * Sets the impressionShare value for this BroadMatchKeywordOpportunity.
   *
   * @param impressionShare
   */
  public void setImpressionShare(java.lang.Double impressionShare) {
    this.impressionShare = impressionShare;
  }

  /**
   * Gets the referenceKeywordBid value for this BroadMatchKeywordOpportunity.
   *
   * @return referenceKeywordBid
   */
  public java.lang.Double getReferenceKeywordBid() {
    return referenceKeywordBid;
  }

  /**
   * Sets the referenceKeywordBid value for this BroadMatchKeywordOpportunity.
   *
   * @param referenceKeywordBid
   */
  public void setReferenceKeywordBid(java.lang.Double referenceKeywordBid) {
    this.referenceKeywordBid = referenceKeywordBid;
  }

  /**
   * Gets the referenceKeywordId value for this BroadMatchKeywordOpportunity.
   *
   * @return referenceKeywordId
   */
  public java.lang.Long getReferenceKeywordId() {
    return referenceKeywordId;
  }

  /**
   * Sets the referenceKeywordId value for this BroadMatchKeywordOpportunity.
   *
   * @param referenceKeywordId
   */
  public void setReferenceKeywordId(java.lang.Long referenceKeywordId) {
    this.referenceKeywordId = referenceKeywordId;
  }

  /**
   * Gets the referenceKeywordMatchType value for this BroadMatchKeywordOpportunity.
   *
   * @return referenceKeywordMatchType
   */
  public java.lang.Integer getReferenceKeywordMatchType() {
    return referenceKeywordMatchType;
  }

  /**
   * Sets the referenceKeywordMatchType value for this BroadMatchKeywordOpportunity.
   *
   * @param referenceKeywordMatchType
   */
  public void setReferenceKeywordMatchType(java.lang.Integer referenceKeywordMatchType) {
    this.referenceKeywordMatchType = referenceKeywordMatchType;
  }

  /**
   * Gets the searchQueryKPIs value for this BroadMatchKeywordOpportunity.
   *
   * @return searchQueryKPIs
   */
  public com.microsoft.bingads.v10.adinsight.entity.BroadMatchSearchQueryKPI[] getSearchQueryKPIs() {
    return searchQueryKPIs;
  }

  /**
   * Sets the searchQueryKPIs value for this BroadMatchKeywordOpportunity.
   *
   * @param searchQueryKPIs
   */
  public void setSearchQueryKPIs(com.microsoft.bingads.v10.adinsight.entity.BroadMatchSearchQueryKPI[] searchQueryKPIs) {
    this.searchQueryKPIs = searchQueryKPIs;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof BroadMatchKeywordOpportunity)) return false;
    BroadMatchKeywordOpportunity other = (BroadMatchKeywordOpportunity) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.averageCPC == null && other.getAverageCPC() == null) ||
                    (this.averageCPC != null &&
                            this.averageCPC.equals(other.getAverageCPC()))) &&
            ((this.averageCTR == null && other.getAverageCTR() == null) ||
                    (this.averageCTR != null &&
                            this.averageCTR.equals(other.getAverageCTR()))) &&
            ((this.clickShare == null && other.getClickShare() == null) ||
                    (this.clickShare != null &&
                            this.clickShare.equals(other.getClickShare()))) &&
            ((this.impressionShare == null && other.getImpressionShare() == null) ||
                    (this.impressionShare != null &&
                            this.impressionShare.equals(other.getImpressionShare()))) &&
            ((this.referenceKeywordBid == null && other.getReferenceKeywordBid() == null) ||
                    (this.referenceKeywordBid != null &&
                            this.referenceKeywordBid.equals(other.getReferenceKeywordBid()))) &&
            ((this.referenceKeywordId == null && other.getReferenceKeywordId() == null) ||
                    (this.referenceKeywordId != null &&
                            this.referenceKeywordId.equals(other.getReferenceKeywordId()))) &&
            ((this.referenceKeywordMatchType == null && other.getReferenceKeywordMatchType() == null) ||
                    (this.referenceKeywordMatchType != null &&
                            this.referenceKeywordMatchType.equals(other.getReferenceKeywordMatchType()))) &&
            ((this.searchQueryKPIs == null && other.getSearchQueryKPIs() == null) ||
                    (this.searchQueryKPIs != null &&
                            java.util.Arrays.equals(this.searchQueryKPIs, other.getSearchQueryKPIs())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getAverageCPC() != null) {
      _hashCode += getAverageCPC().hashCode();
    }
    if (getAverageCTR() != null) {
      _hashCode += getAverageCTR().hashCode();
    }
    if (getClickShare() != null) {
      _hashCode += getClickShare().hashCode();
    }
    if (getImpressionShare() != null) {
      _hashCode += getImpressionShare().hashCode();
    }
    if (getReferenceKeywordBid() != null) {
      _hashCode += getReferenceKeywordBid().hashCode();
    }
    if (getReferenceKeywordId() != null) {
      _hashCode += getReferenceKeywordId().hashCode();
    }
    if (getReferenceKeywordMatchType() != null) {
      _hashCode += getReferenceKeywordMatchType().hashCode();
    }
    if (getSearchQueryKPIs() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getSearchQueryKPIs());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getSearchQueryKPIs(), i);
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
