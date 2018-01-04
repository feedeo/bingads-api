/**
 * EstimatedBidAndTraffic.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class EstimatedBidAndTraffic implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(EstimatedBidAndTraffic.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedBidAndTraffic"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("minClicksPerWeek");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MinClicksPerWeek"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("maxClicksPerWeek");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MaxClicksPerWeek"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("averageCPC");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AverageCPC"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("minImpressionsPerWeek");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MinImpressionsPerWeek"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("maxImpressionsPerWeek");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MaxImpressionsPerWeek"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("CTR");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "CTR"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("minTotalCostPerWeek");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MinTotalCostPerWeek"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("maxTotalCostPerWeek");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MaxTotalCostPerWeek"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("currency");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Currency"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Currency"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("matchType");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("estimatedMinBid");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedMinBid"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Double minClicksPerWeek;
  private java.lang.Double maxClicksPerWeek;
  private java.lang.Double averageCPC;
  private java.lang.Long minImpressionsPerWeek;
  private java.lang.Long maxImpressionsPerWeek;
  private java.lang.Double CTR;
  private java.lang.Double minTotalCostPerWeek;
  private java.lang.Double maxTotalCostPerWeek;
  private com.microsoft.bingads.v10.adinsight.entity.Currency currency;
  private com.microsoft.bingads.v10.adinsight.entity.MatchType matchType;
  private java.lang.Double estimatedMinBid;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public EstimatedBidAndTraffic() {
  }

  public EstimatedBidAndTraffic(
          java.lang.Double minClicksPerWeek,
          java.lang.Double maxClicksPerWeek,
          java.lang.Double averageCPC,
          java.lang.Long minImpressionsPerWeek,
          java.lang.Long maxImpressionsPerWeek,
          java.lang.Double CTR,
          java.lang.Double minTotalCostPerWeek,
          java.lang.Double maxTotalCostPerWeek,
          com.microsoft.bingads.v10.adinsight.entity.Currency currency,
          com.microsoft.bingads.v10.adinsight.entity.MatchType matchType,
          java.lang.Double estimatedMinBid) {
    this.minClicksPerWeek = minClicksPerWeek;
    this.maxClicksPerWeek = maxClicksPerWeek;
    this.averageCPC = averageCPC;
    this.minImpressionsPerWeek = minImpressionsPerWeek;
    this.maxImpressionsPerWeek = maxImpressionsPerWeek;
    this.CTR = CTR;
    this.minTotalCostPerWeek = minTotalCostPerWeek;
    this.maxTotalCostPerWeek = maxTotalCostPerWeek;
    this.currency = currency;
    this.matchType = matchType;
    this.estimatedMinBid = estimatedMinBid;
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
   * Gets the minClicksPerWeek value for this EstimatedBidAndTraffic.
   *
   * @return minClicksPerWeek
   */
  public java.lang.Double getMinClicksPerWeek() {
    return minClicksPerWeek;
  }

  /**
   * Sets the minClicksPerWeek value for this EstimatedBidAndTraffic.
   *
   * @param minClicksPerWeek
   */
  public void setMinClicksPerWeek(java.lang.Double minClicksPerWeek) {
    this.minClicksPerWeek = minClicksPerWeek;
  }

  /**
   * Gets the maxClicksPerWeek value for this EstimatedBidAndTraffic.
   *
   * @return maxClicksPerWeek
   */
  public java.lang.Double getMaxClicksPerWeek() {
    return maxClicksPerWeek;
  }

  /**
   * Sets the maxClicksPerWeek value for this EstimatedBidAndTraffic.
   *
   * @param maxClicksPerWeek
   */
  public void setMaxClicksPerWeek(java.lang.Double maxClicksPerWeek) {
    this.maxClicksPerWeek = maxClicksPerWeek;
  }

  /**
   * Gets the averageCPC value for this EstimatedBidAndTraffic.
   *
   * @return averageCPC
   */
  public java.lang.Double getAverageCPC() {
    return averageCPC;
  }

  /**
   * Sets the averageCPC value for this EstimatedBidAndTraffic.
   *
   * @param averageCPC
   */
  public void setAverageCPC(java.lang.Double averageCPC) {
    this.averageCPC = averageCPC;
  }

  /**
   * Gets the minImpressionsPerWeek value for this EstimatedBidAndTraffic.
   *
   * @return minImpressionsPerWeek
   */
  public java.lang.Long getMinImpressionsPerWeek() {
    return minImpressionsPerWeek;
  }

  /**
   * Sets the minImpressionsPerWeek value for this EstimatedBidAndTraffic.
   *
   * @param minImpressionsPerWeek
   */
  public void setMinImpressionsPerWeek(java.lang.Long minImpressionsPerWeek) {
    this.minImpressionsPerWeek = minImpressionsPerWeek;
  }

  /**
   * Gets the maxImpressionsPerWeek value for this EstimatedBidAndTraffic.
   *
   * @return maxImpressionsPerWeek
   */
  public java.lang.Long getMaxImpressionsPerWeek() {
    return maxImpressionsPerWeek;
  }

  /**
   * Sets the maxImpressionsPerWeek value for this EstimatedBidAndTraffic.
   *
   * @param maxImpressionsPerWeek
   */
  public void setMaxImpressionsPerWeek(java.lang.Long maxImpressionsPerWeek) {
    this.maxImpressionsPerWeek = maxImpressionsPerWeek;
  }

  /**
   * Gets the CTR value for this EstimatedBidAndTraffic.
   *
   * @return CTR
   */
  public java.lang.Double getCTR() {
    return CTR;
  }

  /**
   * Sets the CTR value for this EstimatedBidAndTraffic.
   *
   * @param CTR
   */
  public void setCTR(java.lang.Double CTR) {
    this.CTR = CTR;
  }

  /**
   * Gets the minTotalCostPerWeek value for this EstimatedBidAndTraffic.
   *
   * @return minTotalCostPerWeek
   */
  public java.lang.Double getMinTotalCostPerWeek() {
    return minTotalCostPerWeek;
  }

  /**
   * Sets the minTotalCostPerWeek value for this EstimatedBidAndTraffic.
   *
   * @param minTotalCostPerWeek
   */
  public void setMinTotalCostPerWeek(java.lang.Double minTotalCostPerWeek) {
    this.minTotalCostPerWeek = minTotalCostPerWeek;
  }

  /**
   * Gets the maxTotalCostPerWeek value for this EstimatedBidAndTraffic.
   *
   * @return maxTotalCostPerWeek
   */
  public java.lang.Double getMaxTotalCostPerWeek() {
    return maxTotalCostPerWeek;
  }

  /**
   * Sets the maxTotalCostPerWeek value for this EstimatedBidAndTraffic.
   *
   * @param maxTotalCostPerWeek
   */
  public void setMaxTotalCostPerWeek(java.lang.Double maxTotalCostPerWeek) {
    this.maxTotalCostPerWeek = maxTotalCostPerWeek;
  }

  /**
   * Gets the currency value for this EstimatedBidAndTraffic.
   *
   * @return currency
   */
  public com.microsoft.bingads.v10.adinsight.entity.Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the currency value for this EstimatedBidAndTraffic.
   *
   * @param currency
   */
  public void setCurrency(com.microsoft.bingads.v10.adinsight.entity.Currency currency) {
    this.currency = currency;
  }

  /**
   * Gets the matchType value for this EstimatedBidAndTraffic.
   *
   * @return matchType
   */
  public com.microsoft.bingads.v10.adinsight.entity.MatchType getMatchType() {
    return matchType;
  }

  /**
   * Sets the matchType value for this EstimatedBidAndTraffic.
   *
   * @param matchType
   */
  public void setMatchType(com.microsoft.bingads.v10.adinsight.entity.MatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * Gets the estimatedMinBid value for this EstimatedBidAndTraffic.
   *
   * @return estimatedMinBid
   */
  public java.lang.Double getEstimatedMinBid() {
    return estimatedMinBid;
  }

  /**
   * Sets the estimatedMinBid value for this EstimatedBidAndTraffic.
   *
   * @param estimatedMinBid
   */
  public void setEstimatedMinBid(java.lang.Double estimatedMinBid) {
    this.estimatedMinBid = estimatedMinBid;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof EstimatedBidAndTraffic)) return false;
    EstimatedBidAndTraffic other = (EstimatedBidAndTraffic) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.minClicksPerWeek == null && other.getMinClicksPerWeek() == null) ||
                    (this.minClicksPerWeek != null &&
                            this.minClicksPerWeek.equals(other.getMinClicksPerWeek()))) &&
            ((this.maxClicksPerWeek == null && other.getMaxClicksPerWeek() == null) ||
                    (this.maxClicksPerWeek != null &&
                            this.maxClicksPerWeek.equals(other.getMaxClicksPerWeek()))) &&
            ((this.averageCPC == null && other.getAverageCPC() == null) ||
                    (this.averageCPC != null &&
                            this.averageCPC.equals(other.getAverageCPC()))) &&
            ((this.minImpressionsPerWeek == null && other.getMinImpressionsPerWeek() == null) ||
                    (this.minImpressionsPerWeek != null &&
                            this.minImpressionsPerWeek.equals(other.getMinImpressionsPerWeek()))) &&
            ((this.maxImpressionsPerWeek == null && other.getMaxImpressionsPerWeek() == null) ||
                    (this.maxImpressionsPerWeek != null &&
                            this.maxImpressionsPerWeek.equals(other.getMaxImpressionsPerWeek()))) &&
            ((this.CTR == null && other.getCTR() == null) ||
                    (this.CTR != null &&
                            this.CTR.equals(other.getCTR()))) &&
            ((this.minTotalCostPerWeek == null && other.getMinTotalCostPerWeek() == null) ||
                    (this.minTotalCostPerWeek != null &&
                            this.minTotalCostPerWeek.equals(other.getMinTotalCostPerWeek()))) &&
            ((this.maxTotalCostPerWeek == null && other.getMaxTotalCostPerWeek() == null) ||
                    (this.maxTotalCostPerWeek != null &&
                            this.maxTotalCostPerWeek.equals(other.getMaxTotalCostPerWeek()))) &&
            ((this.currency == null && other.getCurrency() == null) ||
                    (this.currency != null &&
                            this.currency.equals(other.getCurrency()))) &&
            ((this.matchType == null && other.getMatchType() == null) ||
                    (this.matchType != null &&
                            this.matchType.equals(other.getMatchType()))) &&
            ((this.estimatedMinBid == null && other.getEstimatedMinBid() == null) ||
                    (this.estimatedMinBid != null &&
                            this.estimatedMinBid.equals(other.getEstimatedMinBid())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getMinClicksPerWeek() != null) {
      _hashCode += getMinClicksPerWeek().hashCode();
    }
    if (getMaxClicksPerWeek() != null) {
      _hashCode += getMaxClicksPerWeek().hashCode();
    }
    if (getAverageCPC() != null) {
      _hashCode += getAverageCPC().hashCode();
    }
    if (getMinImpressionsPerWeek() != null) {
      _hashCode += getMinImpressionsPerWeek().hashCode();
    }
    if (getMaxImpressionsPerWeek() != null) {
      _hashCode += getMaxImpressionsPerWeek().hashCode();
    }
    if (getCTR() != null) {
      _hashCode += getCTR().hashCode();
    }
    if (getMinTotalCostPerWeek() != null) {
      _hashCode += getMinTotalCostPerWeek().hashCode();
    }
    if (getMaxTotalCostPerWeek() != null) {
      _hashCode += getMaxTotalCostPerWeek().hashCode();
    }
    if (getCurrency() != null) {
      _hashCode += getCurrency().hashCode();
    }
    if (getMatchType() != null) {
      _hashCode += getMatchType().hashCode();
    }
    if (getEstimatedMinBid() != null) {
      _hashCode += getEstimatedMinBid().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
