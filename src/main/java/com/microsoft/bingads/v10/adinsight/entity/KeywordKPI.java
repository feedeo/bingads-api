/**
 * KeywordKPI.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class KeywordKPI implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(KeywordKPI.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordKPI"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("device");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Device"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("matchType");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adPosition");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdPosition"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdPosition"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("clicks");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Clicks"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("impressions");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Impressions"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("averageCPC");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AverageCPC"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("CTR");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "CTR"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("totalCost");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "TotalCost"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("averageBid");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AverageBid"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String device;
  private com.microsoft.bingads.v10.adinsight.entity.MatchType matchType;
  private com.microsoft.bingads.v10.adinsight.entity.AdPosition adPosition;
  private java.lang.Integer clicks;
  private java.lang.Long impressions;
  private java.lang.Double averageCPC;
  private java.lang.Double CTR;
  private java.lang.Double totalCost;
  private java.lang.Double averageBid;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public KeywordKPI() {
  }

  public KeywordKPI(
          java.lang.String device,
          com.microsoft.bingads.v10.adinsight.entity.MatchType matchType,
          com.microsoft.bingads.v10.adinsight.entity.AdPosition adPosition,
          java.lang.Integer clicks,
          java.lang.Long impressions,
          java.lang.Double averageCPC,
          java.lang.Double CTR,
          java.lang.Double totalCost,
          java.lang.Double averageBid) {
    this.device = device;
    this.matchType = matchType;
    this.adPosition = adPosition;
    this.clicks = clicks;
    this.impressions = impressions;
    this.averageCPC = averageCPC;
    this.CTR = CTR;
    this.totalCost = totalCost;
    this.averageBid = averageBid;
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
   * Gets the device value for this KeywordKPI.
   *
   * @return device
   */
  public java.lang.String getDevice() {
    return device;
  }

  /**
   * Sets the device value for this KeywordKPI.
   *
   * @param device
   */
  public void setDevice(java.lang.String device) {
    this.device = device;
  }

  /**
   * Gets the matchType value for this KeywordKPI.
   *
   * @return matchType
   */
  public com.microsoft.bingads.v10.adinsight.entity.MatchType getMatchType() {
    return matchType;
  }

  /**
   * Sets the matchType value for this KeywordKPI.
   *
   * @param matchType
   */
  public void setMatchType(com.microsoft.bingads.v10.adinsight.entity.MatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * Gets the adPosition value for this KeywordKPI.
   *
   * @return adPosition
   */
  public com.microsoft.bingads.v10.adinsight.entity.AdPosition getAdPosition() {
    return adPosition;
  }

  /**
   * Sets the adPosition value for this KeywordKPI.
   *
   * @param adPosition
   */
  public void setAdPosition(com.microsoft.bingads.v10.adinsight.entity.AdPosition adPosition) {
    this.adPosition = adPosition;
  }

  /**
   * Gets the clicks value for this KeywordKPI.
   *
   * @return clicks
   */
  public java.lang.Integer getClicks() {
    return clicks;
  }

  /**
   * Sets the clicks value for this KeywordKPI.
   *
   * @param clicks
   */
  public void setClicks(java.lang.Integer clicks) {
    this.clicks = clicks;
  }

  /**
   * Gets the impressions value for this KeywordKPI.
   *
   * @return impressions
   */
  public java.lang.Long getImpressions() {
    return impressions;
  }

  /**
   * Sets the impressions value for this KeywordKPI.
   *
   * @param impressions
   */
  public void setImpressions(java.lang.Long impressions) {
    this.impressions = impressions;
  }

  /**
   * Gets the averageCPC value for this KeywordKPI.
   *
   * @return averageCPC
   */
  public java.lang.Double getAverageCPC() {
    return averageCPC;
  }

  /**
   * Sets the averageCPC value for this KeywordKPI.
   *
   * @param averageCPC
   */
  public void setAverageCPC(java.lang.Double averageCPC) {
    this.averageCPC = averageCPC;
  }

  /**
   * Gets the CTR value for this KeywordKPI.
   *
   * @return CTR
   */
  public java.lang.Double getCTR() {
    return CTR;
  }

  /**
   * Sets the CTR value for this KeywordKPI.
   *
   * @param CTR
   */
  public void setCTR(java.lang.Double CTR) {
    this.CTR = CTR;
  }

  /**
   * Gets the totalCost value for this KeywordKPI.
   *
   * @return totalCost
   */
  public java.lang.Double getTotalCost() {
    return totalCost;
  }

  /**
   * Sets the totalCost value for this KeywordKPI.
   *
   * @param totalCost
   */
  public void setTotalCost(java.lang.Double totalCost) {
    this.totalCost = totalCost;
  }

  /**
   * Gets the averageBid value for this KeywordKPI.
   *
   * @return averageBid
   */
  public java.lang.Double getAverageBid() {
    return averageBid;
  }

  /**
   * Sets the averageBid value for this KeywordKPI.
   *
   * @param averageBid
   */
  public void setAverageBid(java.lang.Double averageBid) {
    this.averageBid = averageBid;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof KeywordKPI)) return false;
    KeywordKPI other = (KeywordKPI) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.device == null && other.getDevice() == null) ||
                    (this.device != null &&
                            this.device.equals(other.getDevice()))) &&
            ((this.matchType == null && other.getMatchType() == null) ||
                    (this.matchType != null &&
                            this.matchType.equals(other.getMatchType()))) &&
            ((this.adPosition == null && other.getAdPosition() == null) ||
                    (this.adPosition != null &&
                            this.adPosition.equals(other.getAdPosition()))) &&
            ((this.clicks == null && other.getClicks() == null) ||
                    (this.clicks != null &&
                            this.clicks.equals(other.getClicks()))) &&
            ((this.impressions == null && other.getImpressions() == null) ||
                    (this.impressions != null &&
                            this.impressions.equals(other.getImpressions()))) &&
            ((this.averageCPC == null && other.getAverageCPC() == null) ||
                    (this.averageCPC != null &&
                            this.averageCPC.equals(other.getAverageCPC()))) &&
            ((this.CTR == null && other.getCTR() == null) ||
                    (this.CTR != null &&
                            this.CTR.equals(other.getCTR()))) &&
            ((this.totalCost == null && other.getTotalCost() == null) ||
                    (this.totalCost != null &&
                            this.totalCost.equals(other.getTotalCost()))) &&
            ((this.averageBid == null && other.getAverageBid() == null) ||
                    (this.averageBid != null &&
                            this.averageBid.equals(other.getAverageBid())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getDevice() != null) {
      _hashCode += getDevice().hashCode();
    }
    if (getMatchType() != null) {
      _hashCode += getMatchType().hashCode();
    }
    if (getAdPosition() != null) {
      _hashCode += getAdPosition().hashCode();
    }
    if (getClicks() != null) {
      _hashCode += getClicks().hashCode();
    }
    if (getImpressions() != null) {
      _hashCode += getImpressions().hashCode();
    }
    if (getAverageCPC() != null) {
      _hashCode += getAverageCPC().hashCode();
    }
    if (getCTR() != null) {
      _hashCode += getCTR().hashCode();
    }
    if (getTotalCost() != null) {
      _hashCode += getTotalCost().hashCode();
    }
    if (getAverageBid() != null) {
      _hashCode += getAverageBid().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
