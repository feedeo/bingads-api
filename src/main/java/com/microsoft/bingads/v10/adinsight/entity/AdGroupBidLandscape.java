/**
 * AdGroupBidLandscape.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class AdGroupBidLandscape implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AdGroupBidLandscape.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscape"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupId");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupBidLandscapeType");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("startDate");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "StartDate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DayMonthAndYear"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("endDate");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EndDate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DayMonthAndYear"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("bidLandscapePoints");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidLandscapePoints"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidLandscapePoint"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidLandscapePoint"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long adGroupId;
  private com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeType adGroupBidLandscapeType;
  private com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear startDate;
  private com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear endDate;
  private com.microsoft.bingads.v10.adinsight.entity.BidLandscapePoint[] bidLandscapePoints;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AdGroupBidLandscape() {
  }

  public AdGroupBidLandscape(
          java.lang.Long adGroupId,
          com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeType adGroupBidLandscapeType,
          com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear startDate,
          com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear endDate,
          com.microsoft.bingads.v10.adinsight.entity.BidLandscapePoint[] bidLandscapePoints) {
    this.adGroupId = adGroupId;
    this.adGroupBidLandscapeType = adGroupBidLandscapeType;
    this.startDate = startDate;
    this.endDate = endDate;
    this.bidLandscapePoints = bidLandscapePoints;
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
   * Gets the adGroupId value for this AdGroupBidLandscape.
   *
   * @return adGroupId
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the adGroupId value for this AdGroupBidLandscape.
   *
   * @param adGroupId
   */
  public void setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Gets the adGroupBidLandscapeType value for this AdGroupBidLandscape.
   *
   * @return adGroupBidLandscapeType
   */
  public com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeType getAdGroupBidLandscapeType() {
    return adGroupBidLandscapeType;
  }

  /**
   * Sets the adGroupBidLandscapeType value for this AdGroupBidLandscape.
   *
   * @param adGroupBidLandscapeType
   */
  public void setAdGroupBidLandscapeType(com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeType adGroupBidLandscapeType) {
    this.adGroupBidLandscapeType = adGroupBidLandscapeType;
  }

  /**
   * Gets the startDate value for this AdGroupBidLandscape.
   *
   * @return startDate
   */
  public com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear getStartDate() {
    return startDate;
  }

  /**
   * Sets the startDate value for this AdGroupBidLandscape.
   *
   * @param startDate
   */
  public void setStartDate(com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear startDate) {
    this.startDate = startDate;
  }

  /**
   * Gets the endDate value for this AdGroupBidLandscape.
   *
   * @return endDate
   */
  public com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear getEndDate() {
    return endDate;
  }

  /**
   * Sets the endDate value for this AdGroupBidLandscape.
   *
   * @param endDate
   */
  public void setEndDate(com.microsoft.bingads.v10.adinsight.entity.DayMonthAndYear endDate) {
    this.endDate = endDate;
  }

  /**
   * Gets the bidLandscapePoints value for this AdGroupBidLandscape.
   *
   * @return bidLandscapePoints
   */
  public com.microsoft.bingads.v10.adinsight.entity.BidLandscapePoint[] getBidLandscapePoints() {
    return bidLandscapePoints;
  }

  /**
   * Sets the bidLandscapePoints value for this AdGroupBidLandscape.
   *
   * @param bidLandscapePoints
   */
  public void setBidLandscapePoints(com.microsoft.bingads.v10.adinsight.entity.BidLandscapePoint[] bidLandscapePoints) {
    this.bidLandscapePoints = bidLandscapePoints;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AdGroupBidLandscape)) return false;
    AdGroupBidLandscape other = (AdGroupBidLandscape) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.adGroupId == null && other.getAdGroupId() == null) ||
                    (this.adGroupId != null &&
                            this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.adGroupBidLandscapeType == null && other.getAdGroupBidLandscapeType() == null) ||
                    (this.adGroupBidLandscapeType != null &&
                            this.adGroupBidLandscapeType.equals(other.getAdGroupBidLandscapeType()))) &&
            ((this.startDate == null && other.getStartDate() == null) ||
                    (this.startDate != null &&
                            this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate == null && other.getEndDate() == null) ||
                    (this.endDate != null &&
                            this.endDate.equals(other.getEndDate()))) &&
            ((this.bidLandscapePoints == null && other.getBidLandscapePoints() == null) ||
                    (this.bidLandscapePoints != null &&
                            java.util.Arrays.equals(this.bidLandscapePoints, other.getBidLandscapePoints())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAdGroupId() != null) {
      _hashCode += getAdGroupId().hashCode();
    }
    if (getAdGroupBidLandscapeType() != null) {
      _hashCode += getAdGroupBidLandscapeType().hashCode();
    }
    if (getStartDate() != null) {
      _hashCode += getStartDate().hashCode();
    }
    if (getEndDate() != null) {
      _hashCode += getEndDate().hashCode();
    }
    if (getBidLandscapePoints() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getBidLandscapePoints());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getBidLandscapePoints(), i);
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
