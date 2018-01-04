/**
 * BudgetOpportunity.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class BudgetOpportunity extends com.microsoft.bingads.v10.adinsight.entity.Opportunity implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(BudgetOpportunity.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetOpportunity"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("budgetPoints");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPoints"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPoint"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPoint"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("budgetType");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetLimitType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignId");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "CampaignId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("currentBudget");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "CurrentBudget"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("increaseInClicks");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "IncreaseInClicks"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("increaseInImpressions");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "IncreaseInImpressions"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("percentageIncreaseInClicks");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "PercentageIncreaseInClicks"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("percentageIncreaseInImpressions");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "PercentageIncreaseInImpressions"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("recommendedBudget");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "RecommendedBudget"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.entity.BudgetPoint[] budgetPoints;
  private com.microsoft.bingads.v10.adinsight.entity.BudgetLimitType budgetType;
  private java.lang.Long campaignId;
  private java.lang.Double currentBudget;
  private java.lang.Double increaseInClicks;
  private java.lang.Long increaseInImpressions;
  private java.lang.Integer percentageIncreaseInClicks;
  private java.lang.Integer percentageIncreaseInImpressions;
  private java.lang.Double recommendedBudget;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public BudgetOpportunity() {
  }

  public BudgetOpportunity(
          java.lang.String opportunityKey,
          com.microsoft.bingads.v10.adinsight.entity.BudgetPoint[] budgetPoints,
          com.microsoft.bingads.v10.adinsight.entity.BudgetLimitType budgetType,
          java.lang.Long campaignId,
          java.lang.Double currentBudget,
          java.lang.Double increaseInClicks,
          java.lang.Long increaseInImpressions,
          java.lang.Integer percentageIncreaseInClicks,
          java.lang.Integer percentageIncreaseInImpressions,
          java.lang.Double recommendedBudget) {
    super(
            opportunityKey);
    this.budgetPoints = budgetPoints;
    this.budgetType = budgetType;
    this.campaignId = campaignId;
    this.currentBudget = currentBudget;
    this.increaseInClicks = increaseInClicks;
    this.increaseInImpressions = increaseInImpressions;
    this.percentageIncreaseInClicks = percentageIncreaseInClicks;
    this.percentageIncreaseInImpressions = percentageIncreaseInImpressions;
    this.recommendedBudget = recommendedBudget;
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
   * Gets the budgetPoints value for this BudgetOpportunity.
   *
   * @return budgetPoints
   */
  public com.microsoft.bingads.v10.adinsight.entity.BudgetPoint[] getBudgetPoints() {
    return budgetPoints;
  }

  /**
   * Sets the budgetPoints value for this BudgetOpportunity.
   *
   * @param budgetPoints
   */
  public void setBudgetPoints(com.microsoft.bingads.v10.adinsight.entity.BudgetPoint[] budgetPoints) {
    this.budgetPoints = budgetPoints;
  }

  /**
   * Gets the budgetType value for this BudgetOpportunity.
   *
   * @return budgetType
   */
  public com.microsoft.bingads.v10.adinsight.entity.BudgetLimitType getBudgetType() {
    return budgetType;
  }

  /**
   * Sets the budgetType value for this BudgetOpportunity.
   *
   * @param budgetType
   */
  public void setBudgetType(com.microsoft.bingads.v10.adinsight.entity.BudgetLimitType budgetType) {
    this.budgetType = budgetType;
  }

  /**
   * Gets the campaignId value for this BudgetOpportunity.
   *
   * @return campaignId
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the campaignId value for this BudgetOpportunity.
   *
   * @param campaignId
   */
  public void setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Gets the currentBudget value for this BudgetOpportunity.
   *
   * @return currentBudget
   */
  public java.lang.Double getCurrentBudget() {
    return currentBudget;
  }

  /**
   * Sets the currentBudget value for this BudgetOpportunity.
   *
   * @param currentBudget
   */
  public void setCurrentBudget(java.lang.Double currentBudget) {
    this.currentBudget = currentBudget;
  }

  /**
   * Gets the increaseInClicks value for this BudgetOpportunity.
   *
   * @return increaseInClicks
   */
  public java.lang.Double getIncreaseInClicks() {
    return increaseInClicks;
  }

  /**
   * Sets the increaseInClicks value for this BudgetOpportunity.
   *
   * @param increaseInClicks
   */
  public void setIncreaseInClicks(java.lang.Double increaseInClicks) {
    this.increaseInClicks = increaseInClicks;
  }

  /**
   * Gets the increaseInImpressions value for this BudgetOpportunity.
   *
   * @return increaseInImpressions
   */
  public java.lang.Long getIncreaseInImpressions() {
    return increaseInImpressions;
  }

  /**
   * Sets the increaseInImpressions value for this BudgetOpportunity.
   *
   * @param increaseInImpressions
   */
  public void setIncreaseInImpressions(java.lang.Long increaseInImpressions) {
    this.increaseInImpressions = increaseInImpressions;
  }

  /**
   * Gets the percentageIncreaseInClicks value for this BudgetOpportunity.
   *
   * @return percentageIncreaseInClicks
   */
  public java.lang.Integer getPercentageIncreaseInClicks() {
    return percentageIncreaseInClicks;
  }

  /**
   * Sets the percentageIncreaseInClicks value for this BudgetOpportunity.
   *
   * @param percentageIncreaseInClicks
   */
  public void setPercentageIncreaseInClicks(java.lang.Integer percentageIncreaseInClicks) {
    this.percentageIncreaseInClicks = percentageIncreaseInClicks;
  }

  /**
   * Gets the percentageIncreaseInImpressions value for this BudgetOpportunity.
   *
   * @return percentageIncreaseInImpressions
   */
  public java.lang.Integer getPercentageIncreaseInImpressions() {
    return percentageIncreaseInImpressions;
  }

  /**
   * Sets the percentageIncreaseInImpressions value for this BudgetOpportunity.
   *
   * @param percentageIncreaseInImpressions
   */
  public void setPercentageIncreaseInImpressions(java.lang.Integer percentageIncreaseInImpressions) {
    this.percentageIncreaseInImpressions = percentageIncreaseInImpressions;
  }

  /**
   * Gets the recommendedBudget value for this BudgetOpportunity.
   *
   * @return recommendedBudget
   */
  public java.lang.Double getRecommendedBudget() {
    return recommendedBudget;
  }

  /**
   * Sets the recommendedBudget value for this BudgetOpportunity.
   *
   * @param recommendedBudget
   */
  public void setRecommendedBudget(java.lang.Double recommendedBudget) {
    this.recommendedBudget = recommendedBudget;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof BudgetOpportunity)) return false;
    BudgetOpportunity other = (BudgetOpportunity) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.budgetPoints == null && other.getBudgetPoints() == null) ||
                    (this.budgetPoints != null &&
                            java.util.Arrays.equals(this.budgetPoints, other.getBudgetPoints()))) &&
            ((this.budgetType == null && other.getBudgetType() == null) ||
                    (this.budgetType != null &&
                            this.budgetType.equals(other.getBudgetType()))) &&
            ((this.campaignId == null && other.getCampaignId() == null) ||
                    (this.campaignId != null &&
                            this.campaignId.equals(other.getCampaignId()))) &&
            ((this.currentBudget == null && other.getCurrentBudget() == null) ||
                    (this.currentBudget != null &&
                            this.currentBudget.equals(other.getCurrentBudget()))) &&
            ((this.increaseInClicks == null && other.getIncreaseInClicks() == null) ||
                    (this.increaseInClicks != null &&
                            this.increaseInClicks.equals(other.getIncreaseInClicks()))) &&
            ((this.increaseInImpressions == null && other.getIncreaseInImpressions() == null) ||
                    (this.increaseInImpressions != null &&
                            this.increaseInImpressions.equals(other.getIncreaseInImpressions()))) &&
            ((this.percentageIncreaseInClicks == null && other.getPercentageIncreaseInClicks() == null) ||
                    (this.percentageIncreaseInClicks != null &&
                            this.percentageIncreaseInClicks.equals(other.getPercentageIncreaseInClicks()))) &&
            ((this.percentageIncreaseInImpressions == null && other.getPercentageIncreaseInImpressions() == null) ||
                    (this.percentageIncreaseInImpressions != null &&
                            this.percentageIncreaseInImpressions.equals(other.getPercentageIncreaseInImpressions()))) &&
            ((this.recommendedBudget == null && other.getRecommendedBudget() == null) ||
                    (this.recommendedBudget != null &&
                            this.recommendedBudget.equals(other.getRecommendedBudget())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getBudgetPoints() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getBudgetPoints());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getBudgetPoints(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getBudgetType() != null) {
      _hashCode += getBudgetType().hashCode();
    }
    if (getCampaignId() != null) {
      _hashCode += getCampaignId().hashCode();
    }
    if (getCurrentBudget() != null) {
      _hashCode += getCurrentBudget().hashCode();
    }
    if (getIncreaseInClicks() != null) {
      _hashCode += getIncreaseInClicks().hashCode();
    }
    if (getIncreaseInImpressions() != null) {
      _hashCode += getIncreaseInImpressions().hashCode();
    }
    if (getPercentageIncreaseInClicks() != null) {
      _hashCode += getPercentageIncreaseInClicks().hashCode();
    }
    if (getPercentageIncreaseInImpressions() != null) {
      _hashCode += getPercentageIncreaseInImpressions().hashCode();
    }
    if (getRecommendedBudget() != null) {
      _hashCode += getRecommendedBudget().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
