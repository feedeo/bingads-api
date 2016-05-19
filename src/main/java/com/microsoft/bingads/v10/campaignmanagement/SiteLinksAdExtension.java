/**
 * SiteLinksAdExtension.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class SiteLinksAdExtension extends com.microsoft.bingads.v10.campaignmanagement.AdExtension implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(SiteLinksAdExtension.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SiteLinksAdExtension"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("siteLinks");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SiteLinks"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SiteLink"));
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SiteLink"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.SiteLink[] siteLinks;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public SiteLinksAdExtension() {
  }

  public SiteLinksAdExtension(
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Long id,
          com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus status,
          java.lang.String type,
          java.lang.Integer version,
          com.microsoft.bingads.v10.campaignmanagement.SiteLink[] siteLinks) {
    super(
            forwardCompatibilityMap,
            id,
            status,
            type,
            version);
    this.siteLinks = siteLinks;
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
   * Gets the siteLinks value for this SiteLinksAdExtension.
   *
   * @return siteLinks
   */
  public com.microsoft.bingads.v10.campaignmanagement.SiteLink[] getSiteLinks() {
    return siteLinks;
  }

  /**
   * Sets the siteLinks value for this SiteLinksAdExtension.
   *
   * @param siteLinks
   */
  public void setSiteLinks(com.microsoft.bingads.v10.campaignmanagement.SiteLink[] siteLinks) {
    this.siteLinks = siteLinks;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof SiteLinksAdExtension)) return false;
    SiteLinksAdExtension other = (SiteLinksAdExtension) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.siteLinks == null && other.getSiteLinks() == null) ||
                    (this.siteLinks != null &&
                            java.util.Arrays.equals(this.siteLinks, other.getSiteLinks())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getSiteLinks() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getSiteLinks());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getSiteLinks(), i);
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
