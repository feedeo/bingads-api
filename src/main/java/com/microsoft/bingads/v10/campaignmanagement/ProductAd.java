/**
 * ProductAd.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class ProductAd extends com.microsoft.bingads.v10.campaignmanagement.Ad implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(ProductAd.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductAd"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("promotionalText");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PromotionalText"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String promotionalText;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public ProductAd() {
  }

  public ProductAd(
          java.lang.Long devicePreference,
          com.microsoft.bingads.v10.campaignmanagement.AdEditorialStatus editorialStatus,
          com.microsoft.bingads.v10.datacontracts.AppUrl[] finalAppUrls,
          java.lang.String[] finalMobileUrls,
          java.lang.String[] finalUrls,
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Long id,
          com.microsoft.bingads.v10.campaignmanagement.AdStatus status,
          java.lang.String trackingUrlTemplate,
          com.microsoft.bingads.v10.campaignmanagement.AdType type,
          com.microsoft.bingads.v10.datacontracts.CustomParameters urlCustomParameters,
          java.lang.String promotionalText) {
    super(
            devicePreference,
            editorialStatus,
            finalAppUrls,
            finalMobileUrls,
            finalUrls,
            forwardCompatibilityMap,
            id,
            status,
            trackingUrlTemplate,
            type,
            urlCustomParameters);
    this.promotionalText = promotionalText;
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
   * Gets the promotionalText value for this ProductAd.
   *
   * @return promotionalText
   */
  public java.lang.String getPromotionalText() {
    return promotionalText;
  }

  /**
   * Sets the promotionalText value for this ProductAd.
   *
   * @param promotionalText
   */
  public void setPromotionalText(java.lang.String promotionalText) {
    this.promotionalText = promotionalText;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof ProductAd)) return false;
    ProductAd other = (ProductAd) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.promotionalText == null && other.getPromotionalText() == null) ||
                    (this.promotionalText != null &&
                            this.promotionalText.equals(other.getPromotionalText())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getPromotionalText() != null) {
      _hashCode += getPromotionalText().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
