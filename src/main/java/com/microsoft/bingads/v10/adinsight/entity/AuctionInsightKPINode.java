/**
 * AuctionInsightKPINode.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class AuctionInsightKPINode implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AuctionInsightKPINode.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightKPINode"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("dimensionNames");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DimensionNames"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("impressionShare");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ImpressionShare"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("overlapRate");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "OverlapRate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("averagePosition");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AveragePosition"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("aboveRate");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AboveRate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("topOfPageRate");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "TopOfPageRate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String[] dimensionNames;
  private java.lang.Double impressionShare;
  private java.lang.Double overlapRate;
  private java.lang.Double averagePosition;
  private java.lang.Double aboveRate;
  private java.lang.Double topOfPageRate;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AuctionInsightKPINode() {
  }

  public AuctionInsightKPINode(
          java.lang.String[] dimensionNames,
          java.lang.Double impressionShare,
          java.lang.Double overlapRate,
          java.lang.Double averagePosition,
          java.lang.Double aboveRate,
          java.lang.Double topOfPageRate) {
    this.dimensionNames = dimensionNames;
    this.impressionShare = impressionShare;
    this.overlapRate = overlapRate;
    this.averagePosition = averagePosition;
    this.aboveRate = aboveRate;
    this.topOfPageRate = topOfPageRate;
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
   * Gets the dimensionNames value for this AuctionInsightKPINode.
   *
   * @return dimensionNames
   */
  public java.lang.String[] getDimensionNames() {
    return dimensionNames;
  }

  /**
   * Sets the dimensionNames value for this AuctionInsightKPINode.
   *
   * @param dimensionNames
   */
  public void setDimensionNames(java.lang.String[] dimensionNames) {
    this.dimensionNames = dimensionNames;
  }

  /**
   * Gets the impressionShare value for this AuctionInsightKPINode.
   *
   * @return impressionShare
   */
  public java.lang.Double getImpressionShare() {
    return impressionShare;
  }

  /**
   * Sets the impressionShare value for this AuctionInsightKPINode.
   *
   * @param impressionShare
   */
  public void setImpressionShare(java.lang.Double impressionShare) {
    this.impressionShare = impressionShare;
  }

  /**
   * Gets the overlapRate value for this AuctionInsightKPINode.
   *
   * @return overlapRate
   */
  public java.lang.Double getOverlapRate() {
    return overlapRate;
  }

  /**
   * Sets the overlapRate value for this AuctionInsightKPINode.
   *
   * @param overlapRate
   */
  public void setOverlapRate(java.lang.Double overlapRate) {
    this.overlapRate = overlapRate;
  }

  /**
   * Gets the averagePosition value for this AuctionInsightKPINode.
   *
   * @return averagePosition
   */
  public java.lang.Double getAveragePosition() {
    return averagePosition;
  }

  /**
   * Sets the averagePosition value for this AuctionInsightKPINode.
   *
   * @param averagePosition
   */
  public void setAveragePosition(java.lang.Double averagePosition) {
    this.averagePosition = averagePosition;
  }

  /**
   * Gets the aboveRate value for this AuctionInsightKPINode.
   *
   * @return aboveRate
   */
  public java.lang.Double getAboveRate() {
    return aboveRate;
  }

  /**
   * Sets the aboveRate value for this AuctionInsightKPINode.
   *
   * @param aboveRate
   */
  public void setAboveRate(java.lang.Double aboveRate) {
    this.aboveRate = aboveRate;
  }

  /**
   * Gets the topOfPageRate value for this AuctionInsightKPINode.
   *
   * @return topOfPageRate
   */
  public java.lang.Double getTopOfPageRate() {
    return topOfPageRate;
  }

  /**
   * Sets the topOfPageRate value for this AuctionInsightKPINode.
   *
   * @param topOfPageRate
   */
  public void setTopOfPageRate(java.lang.Double topOfPageRate) {
    this.topOfPageRate = topOfPageRate;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AuctionInsightKPINode)) return false;
    AuctionInsightKPINode other = (AuctionInsightKPINode) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.dimensionNames == null && other.getDimensionNames() == null) ||
                    (this.dimensionNames != null &&
                            java.util.Arrays.equals(this.dimensionNames, other.getDimensionNames()))) &&
            ((this.impressionShare == null && other.getImpressionShare() == null) ||
                    (this.impressionShare != null &&
                            this.impressionShare.equals(other.getImpressionShare()))) &&
            ((this.overlapRate == null && other.getOverlapRate() == null) ||
                    (this.overlapRate != null &&
                            this.overlapRate.equals(other.getOverlapRate()))) &&
            ((this.averagePosition == null && other.getAveragePosition() == null) ||
                    (this.averagePosition != null &&
                            this.averagePosition.equals(other.getAveragePosition()))) &&
            ((this.aboveRate == null && other.getAboveRate() == null) ||
                    (this.aboveRate != null &&
                            this.aboveRate.equals(other.getAboveRate()))) &&
            ((this.topOfPageRate == null && other.getTopOfPageRate() == null) ||
                    (this.topOfPageRate != null &&
                            this.topOfPageRate.equals(other.getTopOfPageRate())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getDimensionNames() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getDimensionNames());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getDimensionNames(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getImpressionShare() != null) {
      _hashCode += getImpressionShare().hashCode();
    }
    if (getOverlapRate() != null) {
      _hashCode += getOverlapRate().hashCode();
    }
    if (getAveragePosition() != null) {
      _hashCode += getAveragePosition().hashCode();
    }
    if (getAboveRate() != null) {
      _hashCode += getAboveRate().hashCode();
    }
    if (getTopOfPageRate() != null) {
      _hashCode += getTopOfPageRate().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
