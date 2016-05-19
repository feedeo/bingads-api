/**
 * AdGroupBidLandscapeInput.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class AdGroupBidLandscapeInput implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AdGroupBidLandscapeInput.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeInput"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupBidLandscapeType");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupId");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeType adGroupBidLandscapeType;
  private java.lang.Long adGroupId;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AdGroupBidLandscapeInput() {
  }

  public AdGroupBidLandscapeInput(
          com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeType adGroupBidLandscapeType,
          java.lang.Long adGroupId) {
    this.adGroupBidLandscapeType = adGroupBidLandscapeType;
    this.adGroupId = adGroupId;
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
   * Gets the adGroupBidLandscapeType value for this AdGroupBidLandscapeInput.
   *
   * @return adGroupBidLandscapeType
   */
  public com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeType getAdGroupBidLandscapeType() {
    return adGroupBidLandscapeType;
  }

  /**
   * Sets the adGroupBidLandscapeType value for this AdGroupBidLandscapeInput.
   *
   * @param adGroupBidLandscapeType
   */
  public void setAdGroupBidLandscapeType(com.microsoft.bingads.v10.adinsight.entity.AdGroupBidLandscapeType adGroupBidLandscapeType) {
    this.adGroupBidLandscapeType = adGroupBidLandscapeType;
  }

  /**
   * Gets the adGroupId value for this AdGroupBidLandscapeInput.
   *
   * @return adGroupId
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the adGroupId value for this AdGroupBidLandscapeInput.
   *
   * @param adGroupId
   */
  public void setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AdGroupBidLandscapeInput)) return false;
    AdGroupBidLandscapeInput other = (AdGroupBidLandscapeInput) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.adGroupBidLandscapeType == null && other.getAdGroupBidLandscapeType() == null) ||
                    (this.adGroupBidLandscapeType != null &&
                            this.adGroupBidLandscapeType.equals(other.getAdGroupBidLandscapeType()))) &&
            ((this.adGroupId == null && other.getAdGroupId() == null) ||
                    (this.adGroupId != null &&
                            this.adGroupId.equals(other.getAdGroupId())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAdGroupBidLandscapeType() != null) {
      _hashCode += getAdGroupBidLandscapeType().hashCode();
    }
    if (getAdGroupId() != null) {
      _hashCode += getAdGroupId().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
