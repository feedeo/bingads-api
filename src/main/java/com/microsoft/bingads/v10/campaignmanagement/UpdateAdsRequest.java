/**
 * UpdateAdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class UpdateAdsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(UpdateAdsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">UpdateAdsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("ads");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Ads"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Ad"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Ad"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long adGroupId;
  private com.microsoft.bingads.v10.campaignmanagement.Ad[] ads;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public UpdateAdsRequest() {
  }

  public UpdateAdsRequest(
          java.lang.Long adGroupId,
          com.microsoft.bingads.v10.campaignmanagement.Ad[] ads) {
    this.adGroupId = adGroupId;
    this.ads = ads;
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
   * Gets the adGroupId value for this UpdateAdsRequest.
   *
   * @return adGroupId
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the adGroupId value for this UpdateAdsRequest.
   *
   * @param adGroupId
   */
  public void setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Gets the ads value for this UpdateAdsRequest.
   *
   * @return ads
   */
  public com.microsoft.bingads.v10.campaignmanagement.Ad[] getAds() {
    return ads;
  }

  /**
   * Sets the ads value for this UpdateAdsRequest.
   *
   * @param ads
   */
  public void setAds(com.microsoft.bingads.v10.campaignmanagement.Ad[] ads) {
    this.ads = ads;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof UpdateAdsRequest)) return false;
    UpdateAdsRequest other = (UpdateAdsRequest) obj;
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
            ((this.ads == null && other.getAds() == null) ||
                    (this.ads != null &&
                            java.util.Arrays.equals(this.ads, other.getAds())));
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
    if (getAds() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getAds());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getAds(), i);
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
