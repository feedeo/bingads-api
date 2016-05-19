/**
 * AuctionInsightV2Entity.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class AuctionInsightV2Entity implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AuctionInsightV2Entity.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightV2Entity"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("displayDomain");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DisplayDomain"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("aggregatedKPI");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AggregatedKPI"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightKPINode"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("KPIs");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KPIs"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightKPINode"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightKPINode"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String displayDomain;
  private com.microsoft.bingads.v10.adinsight.entity.AuctionInsightKPINode aggregatedKPI;
  private com.microsoft.bingads.v10.adinsight.entity.AuctionInsightKPINode[] KPIs;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AuctionInsightV2Entity() {
  }

  public AuctionInsightV2Entity(
          java.lang.String displayDomain,
          com.microsoft.bingads.v10.adinsight.entity.AuctionInsightKPINode aggregatedKPI,
          com.microsoft.bingads.v10.adinsight.entity.AuctionInsightKPINode[] KPIs) {
    this.displayDomain = displayDomain;
    this.aggregatedKPI = aggregatedKPI;
    this.KPIs = KPIs;
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
   * Gets the displayDomain value for this AuctionInsightV2Entity.
   *
   * @return displayDomain
   */
  public java.lang.String getDisplayDomain() {
    return displayDomain;
  }

  /**
   * Sets the displayDomain value for this AuctionInsightV2Entity.
   *
   * @param displayDomain
   */
  public void setDisplayDomain(java.lang.String displayDomain) {
    this.displayDomain = displayDomain;
  }

  /**
   * Gets the aggregatedKPI value for this AuctionInsightV2Entity.
   *
   * @return aggregatedKPI
   */
  public com.microsoft.bingads.v10.adinsight.entity.AuctionInsightKPINode getAggregatedKPI() {
    return aggregatedKPI;
  }

  /**
   * Sets the aggregatedKPI value for this AuctionInsightV2Entity.
   *
   * @param aggregatedKPI
   */
  public void setAggregatedKPI(com.microsoft.bingads.v10.adinsight.entity.AuctionInsightKPINode aggregatedKPI) {
    this.aggregatedKPI = aggregatedKPI;
  }

  /**
   * Gets the KPIs value for this AuctionInsightV2Entity.
   *
   * @return KPIs
   */
  public com.microsoft.bingads.v10.adinsight.entity.AuctionInsightKPINode[] getKPIs() {
    return KPIs;
  }

  /**
   * Sets the KPIs value for this AuctionInsightV2Entity.
   *
   * @param KPIs
   */
  public void setKPIs(com.microsoft.bingads.v10.adinsight.entity.AuctionInsightKPINode[] KPIs) {
    this.KPIs = KPIs;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AuctionInsightV2Entity)) return false;
    AuctionInsightV2Entity other = (AuctionInsightV2Entity) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.displayDomain == null && other.getDisplayDomain() == null) ||
                    (this.displayDomain != null &&
                            this.displayDomain.equals(other.getDisplayDomain()))) &&
            ((this.aggregatedKPI == null && other.getAggregatedKPI() == null) ||
                    (this.aggregatedKPI != null &&
                            this.aggregatedKPI.equals(other.getAggregatedKPI()))) &&
            ((this.KPIs == null && other.getKPIs() == null) ||
                    (this.KPIs != null &&
                            java.util.Arrays.equals(this.KPIs, other.getKPIs())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getDisplayDomain() != null) {
      _hashCode += getDisplayDomain().hashCode();
    }
    if (getAggregatedKPI() != null) {
      _hashCode += getAggregatedKPI().hashCode();
    }
    if (getKPIs() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getKPIs());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getKPIs(), i);
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
