/**
 * GeoLocationPerformanceReportFilter.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class GeoLocationPerformanceReportFilter implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GeoLocationPerformanceReportFilter.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GeoLocationPerformanceReportFilter"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("accountStatus");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountStatus"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountStatusReportFilter"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adDistribution");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDistribution"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDistributionReportFilter"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupStatus");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupStatus"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupStatusReportFilter"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignStatus");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignStatus"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignStatusReportFilter"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("countryCode");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CountryCode"));
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

  private java.lang.String[] accountStatus;
  private java.lang.String[] adDistribution;
  private java.lang.String[] adGroupStatus;
  private java.lang.String[] campaignStatus;
  private java.lang.String[] countryCode;
  private java.lang.String[] languageCode;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GeoLocationPerformanceReportFilter() {
  }

  public GeoLocationPerformanceReportFilter(
          java.lang.String[] accountStatus,
          java.lang.String[] adDistribution,
          java.lang.String[] adGroupStatus,
          java.lang.String[] campaignStatus,
          java.lang.String[] countryCode,
          java.lang.String[] languageCode) {
    this.accountStatus = accountStatus;
    this.adDistribution = adDistribution;
    this.adGroupStatus = adGroupStatus;
    this.campaignStatus = campaignStatus;
    this.countryCode = countryCode;
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
   * Gets the accountStatus value for this GeoLocationPerformanceReportFilter.
   *
   * @return accountStatus
   */
  public java.lang.String[] getAccountStatus() {
    return accountStatus;
  }

  /**
   * Sets the accountStatus value for this GeoLocationPerformanceReportFilter.
   *
   * @param accountStatus
   */
  public void setAccountStatus(java.lang.String[] accountStatus) {
    this.accountStatus = accountStatus;
  }

  /**
   * Gets the adDistribution value for this GeoLocationPerformanceReportFilter.
   *
   * @return adDistribution
   */
  public java.lang.String[] getAdDistribution() {
    return adDistribution;
  }

  /**
   * Sets the adDistribution value for this GeoLocationPerformanceReportFilter.
   *
   * @param adDistribution
   */
  public void setAdDistribution(java.lang.String[] adDistribution) {
    this.adDistribution = adDistribution;
  }

  /**
   * Gets the adGroupStatus value for this GeoLocationPerformanceReportFilter.
   *
   * @return adGroupStatus
   */
  public java.lang.String[] getAdGroupStatus() {
    return adGroupStatus;
  }

  /**
   * Sets the adGroupStatus value for this GeoLocationPerformanceReportFilter.
   *
   * @param adGroupStatus
   */
  public void setAdGroupStatus(java.lang.String[] adGroupStatus) {
    this.adGroupStatus = adGroupStatus;
  }

  /**
   * Gets the campaignStatus value for this GeoLocationPerformanceReportFilter.
   *
   * @return campaignStatus
   */
  public java.lang.String[] getCampaignStatus() {
    return campaignStatus;
  }

  /**
   * Sets the campaignStatus value for this GeoLocationPerformanceReportFilter.
   *
   * @param campaignStatus
   */
  public void setCampaignStatus(java.lang.String[] campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  /**
   * Gets the countryCode value for this GeoLocationPerformanceReportFilter.
   *
   * @return countryCode
   */
  public java.lang.String[] getCountryCode() {
    return countryCode;
  }

  /**
   * Sets the countryCode value for this GeoLocationPerformanceReportFilter.
   *
   * @param countryCode
   */
  public void setCountryCode(java.lang.String[] countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * Gets the languageCode value for this GeoLocationPerformanceReportFilter.
   *
   * @return languageCode
   */
  public java.lang.String[] getLanguageCode() {
    return languageCode;
  }

  /**
   * Sets the languageCode value for this GeoLocationPerformanceReportFilter.
   *
   * @param languageCode
   */
  public void setLanguageCode(java.lang.String[] languageCode) {
    this.languageCode = languageCode;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GeoLocationPerformanceReportFilter)) return false;
    GeoLocationPerformanceReportFilter other = (GeoLocationPerformanceReportFilter) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.accountStatus == null && other.getAccountStatus() == null) ||
                    (this.accountStatus != null &&
                            java.util.Arrays.equals(this.accountStatus, other.getAccountStatus()))) &&
            ((this.adDistribution == null && other.getAdDistribution() == null) ||
                    (this.adDistribution != null &&
                            java.util.Arrays.equals(this.adDistribution, other.getAdDistribution()))) &&
            ((this.adGroupStatus == null && other.getAdGroupStatus() == null) ||
                    (this.adGroupStatus != null &&
                            java.util.Arrays.equals(this.adGroupStatus, other.getAdGroupStatus()))) &&
            ((this.campaignStatus == null && other.getCampaignStatus() == null) ||
                    (this.campaignStatus != null &&
                            java.util.Arrays.equals(this.campaignStatus, other.getCampaignStatus()))) &&
            ((this.countryCode == null && other.getCountryCode() == null) ||
                    (this.countryCode != null &&
                            java.util.Arrays.equals(this.countryCode, other.getCountryCode()))) &&
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
    if (getAccountStatus() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getAccountStatus());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getAccountStatus(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
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
    if (getAdGroupStatus() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getAdGroupStatus());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupStatus(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getCampaignStatus() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getCampaignStatus());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getCampaignStatus(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getCountryCode() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getCountryCode());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getCountryCode(), i);
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
