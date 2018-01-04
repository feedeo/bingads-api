/**
 * BudgetPoint.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class BudgetPoint implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(BudgetPoint.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPoint"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("budgetAmount");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetAmount"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("budgetPointType");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPointType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPointType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("estimatedWeeklyClicks");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedWeeklyClicks"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("estimatedWeeklyCost");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedWeeklyCost"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("estimatedWeeklyImpressions");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedWeeklyImpressions"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Double budgetAmount;
  private com.microsoft.bingads.v10.adinsight.entity.BudgetPointType budgetPointType;
  private java.lang.Double estimatedWeeklyClicks;
  private java.lang.Double estimatedWeeklyCost;
  private java.lang.Double estimatedWeeklyImpressions;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public BudgetPoint() {
  }

  public BudgetPoint(
          java.lang.Double budgetAmount,
          com.microsoft.bingads.v10.adinsight.entity.BudgetPointType budgetPointType,
          java.lang.Double estimatedWeeklyClicks,
          java.lang.Double estimatedWeeklyCost,
          java.lang.Double estimatedWeeklyImpressions) {
    this.budgetAmount = budgetAmount;
    this.budgetPointType = budgetPointType;
    this.estimatedWeeklyClicks = estimatedWeeklyClicks;
    this.estimatedWeeklyCost = estimatedWeeklyCost;
    this.estimatedWeeklyImpressions = estimatedWeeklyImpressions;
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
   * Gets the budgetAmount value for this BudgetPoint.
   *
   * @return budgetAmount
   */
  public java.lang.Double getBudgetAmount() {
    return budgetAmount;
  }

  /**
   * Sets the budgetAmount value for this BudgetPoint.
   *
   * @param budgetAmount
   */
  public void setBudgetAmount(java.lang.Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   * Gets the budgetPointType value for this BudgetPoint.
   *
   * @return budgetPointType
   */
  public com.microsoft.bingads.v10.adinsight.entity.BudgetPointType getBudgetPointType() {
    return budgetPointType;
  }

  /**
   * Sets the budgetPointType value for this BudgetPoint.
   *
   * @param budgetPointType
   */
  public void setBudgetPointType(com.microsoft.bingads.v10.adinsight.entity.BudgetPointType budgetPointType) {
    this.budgetPointType = budgetPointType;
  }

  /**
   * Gets the estimatedWeeklyClicks value for this BudgetPoint.
   *
   * @return estimatedWeeklyClicks
   */
  public java.lang.Double getEstimatedWeeklyClicks() {
    return estimatedWeeklyClicks;
  }

  /**
   * Sets the estimatedWeeklyClicks value for this BudgetPoint.
   *
   * @param estimatedWeeklyClicks
   */
  public void setEstimatedWeeklyClicks(java.lang.Double estimatedWeeklyClicks) {
    this.estimatedWeeklyClicks = estimatedWeeklyClicks;
  }

  /**
   * Gets the estimatedWeeklyCost value for this BudgetPoint.
   *
   * @return estimatedWeeklyCost
   */
  public java.lang.Double getEstimatedWeeklyCost() {
    return estimatedWeeklyCost;
  }

  /**
   * Sets the estimatedWeeklyCost value for this BudgetPoint.
   *
   * @param estimatedWeeklyCost
   */
  public void setEstimatedWeeklyCost(java.lang.Double estimatedWeeklyCost) {
    this.estimatedWeeklyCost = estimatedWeeklyCost;
  }

  /**
   * Gets the estimatedWeeklyImpressions value for this BudgetPoint.
   *
   * @return estimatedWeeklyImpressions
   */
  public java.lang.Double getEstimatedWeeklyImpressions() {
    return estimatedWeeklyImpressions;
  }

  /**
   * Sets the estimatedWeeklyImpressions value for this BudgetPoint.
   *
   * @param estimatedWeeklyImpressions
   */
  public void setEstimatedWeeklyImpressions(java.lang.Double estimatedWeeklyImpressions) {
    this.estimatedWeeklyImpressions = estimatedWeeklyImpressions;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof BudgetPoint)) return false;
    BudgetPoint other = (BudgetPoint) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.budgetAmount == null && other.getBudgetAmount() == null) ||
                    (this.budgetAmount != null &&
                            this.budgetAmount.equals(other.getBudgetAmount()))) &&
            ((this.budgetPointType == null && other.getBudgetPointType() == null) ||
                    (this.budgetPointType != null &&
                            this.budgetPointType.equals(other.getBudgetPointType()))) &&
            ((this.estimatedWeeklyClicks == null && other.getEstimatedWeeklyClicks() == null) ||
                    (this.estimatedWeeklyClicks != null &&
                            this.estimatedWeeklyClicks.equals(other.getEstimatedWeeklyClicks()))) &&
            ((this.estimatedWeeklyCost == null && other.getEstimatedWeeklyCost() == null) ||
                    (this.estimatedWeeklyCost != null &&
                            this.estimatedWeeklyCost.equals(other.getEstimatedWeeklyCost()))) &&
            ((this.estimatedWeeklyImpressions == null && other.getEstimatedWeeklyImpressions() == null) ||
                    (this.estimatedWeeklyImpressions != null &&
                            this.estimatedWeeklyImpressions.equals(other.getEstimatedWeeklyImpressions())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getBudgetAmount() != null) {
      _hashCode += getBudgetAmount().hashCode();
    }
    if (getBudgetPointType() != null) {
      _hashCode += getBudgetPointType().hashCode();
    }
    if (getEstimatedWeeklyClicks() != null) {
      _hashCode += getEstimatedWeeklyClicks().hashCode();
    }
    if (getEstimatedWeeklyCost() != null) {
      _hashCode += getEstimatedWeeklyCost().hashCode();
    }
    if (getEstimatedWeeklyImpressions() != null) {
      _hashCode += getEstimatedWeeklyImpressions().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
