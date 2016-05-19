/**
 * BrandZonePerformanceReportFilter.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class BrandZonePerformanceReportFilter implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(BrandZonePerformanceReportFilter.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BrandZonePerformanceReportFilter"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adDistribution");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDistribution"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDistributionReportFilter"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("deliveredMatchType");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeliveredMatchType"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeliveredMatchTypeReportFilter"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("deviceType");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeviceType"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeviceTypeReportFilter"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywords");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Keywords"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("languageCode");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "LanguageCode"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String[] adDistribution;
  private java.lang.String[] deliveredMatchType;
  private java.lang.String[] deviceType;
  private java.lang.String[] keywords;
  private java.lang.String[] languageCode;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public BrandZonePerformanceReportFilter() {
  }

  public BrandZonePerformanceReportFilter(
          java.lang.String[] adDistribution,
          java.lang.String[] deliveredMatchType,
          java.lang.String[] deviceType,
          java.lang.String[] keywords,
          java.lang.String[] languageCode) {
    this.adDistribution = adDistribution;
    this.deliveredMatchType = deliveredMatchType;
    this.deviceType = deviceType;
    this.keywords = keywords;
    this.languageCode = languageCode;
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
   * Gets the adDistribution value for this BrandZonePerformanceReportFilter.
   *
   * @return adDistribution
   */
  public java.lang.String[] getAdDistribution() {
    return adDistribution;
  }

  /**
   * Sets the adDistribution value for this BrandZonePerformanceReportFilter.
   *
   * @param adDistribution
   */
  public void setAdDistribution(java.lang.String[] adDistribution) {
    this.adDistribution = adDistribution;
  }

  /**
   * Gets the deliveredMatchType value for this BrandZonePerformanceReportFilter.
   *
   * @return deliveredMatchType
   */
  public java.lang.String[] getDeliveredMatchType() {
    return deliveredMatchType;
  }

  /**
   * Sets the deliveredMatchType value for this BrandZonePerformanceReportFilter.
   *
   * @param deliveredMatchType
   */
  public void setDeliveredMatchType(java.lang.String[] deliveredMatchType) {
    this.deliveredMatchType = deliveredMatchType;
  }

  /**
   * Gets the deviceType value for this BrandZonePerformanceReportFilter.
   *
   * @return deviceType
   */
  public java.lang.String[] getDeviceType() {
    return deviceType;
  }

  /**
   * Sets the deviceType value for this BrandZonePerformanceReportFilter.
   *
   * @param deviceType
   */
  public void setDeviceType(java.lang.String[] deviceType) {
    this.deviceType = deviceType;
  }

  /**
   * Gets the keywords value for this BrandZonePerformanceReportFilter.
   *
   * @return keywords
   */
  public java.lang.String[] getKeywords() {
    return keywords;
  }

  /**
   * Sets the keywords value for this BrandZonePerformanceReportFilter.
   *
   * @param keywords
   */
  public void setKeywords(java.lang.String[] keywords) {
    this.keywords = keywords;
  }

  /**
   * Gets the languageCode value for this BrandZonePerformanceReportFilter.
   *
   * @return languageCode
   */
  public java.lang.String[] getLanguageCode() {
    return languageCode;
  }

  /**
   * Sets the languageCode value for this BrandZonePerformanceReportFilter.
   *
   * @param languageCode
   */
  public void setLanguageCode(java.lang.String[] languageCode) {
    this.languageCode = languageCode;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof BrandZonePerformanceReportFilter)) return false;
    BrandZonePerformanceReportFilter other = (BrandZonePerformanceReportFilter) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.adDistribution == null && other.getAdDistribution() == null) ||
                    (this.adDistribution != null &&
                            java.util.Arrays.equals(this.adDistribution, other.getAdDistribution()))) &&
            ((this.deliveredMatchType == null && other.getDeliveredMatchType() == null) ||
                    (this.deliveredMatchType != null &&
                            java.util.Arrays.equals(this.deliveredMatchType, other.getDeliveredMatchType()))) &&
            ((this.deviceType == null && other.getDeviceType() == null) ||
                    (this.deviceType != null &&
                            java.util.Arrays.equals(this.deviceType, other.getDeviceType()))) &&
            ((this.keywords == null && other.getKeywords() == null) ||
                    (this.keywords != null &&
                            java.util.Arrays.equals(this.keywords, other.getKeywords()))) &&
            ((this.languageCode == null && other.getLanguageCode() == null) ||
                    (this.languageCode != null &&
                            java.util.Arrays.equals(this.languageCode, other.getLanguageCode())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAdDistribution() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getAdDistribution());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getAdDistribution(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getDeliveredMatchType() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getDeliveredMatchType());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getDeliveredMatchType(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getDeviceType() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getDeviceType());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getDeviceType(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getKeywords() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getKeywords());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getKeywords(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getLanguageCode() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getLanguageCode());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getLanguageCode(), i);
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
