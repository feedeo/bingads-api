/**
 * GetHistoricalKeywordPerformanceRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class GetHistoricalKeywordPerformanceRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetHistoricalKeywordPerformanceRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetHistoricalKeywordPerformanceRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywords");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Keywords"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("timeInterval");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "TimeInterval"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "TimeInterval"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("targetAdPosition");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "TargetAdPosition"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdPosition"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("matchTypes");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "MatchTypes"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("language");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Language"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("publisherCountries");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "PublisherCountries"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("devices");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Devices"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String[] keywords;
  private com.microsoft.bingads.v10.adinsight.entity.TimeInterval timeInterval;
  private com.microsoft.bingads.v10.adinsight.entity.AdPosition targetAdPosition;
  private com.microsoft.bingads.v10.adinsight.entity.MatchType[] matchTypes;
  private java.lang.String language;
  private java.lang.String[] publisherCountries;
  private java.lang.String[] devices;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetHistoricalKeywordPerformanceRequest() {
  }

  public GetHistoricalKeywordPerformanceRequest(
          java.lang.String[] keywords,
          com.microsoft.bingads.v10.adinsight.entity.TimeInterval timeInterval,
          com.microsoft.bingads.v10.adinsight.entity.AdPosition targetAdPosition,
          com.microsoft.bingads.v10.adinsight.entity.MatchType[] matchTypes,
          java.lang.String language,
          java.lang.String[] publisherCountries,
          java.lang.String[] devices) {
    this.keywords = keywords;
    this.timeInterval = timeInterval;
    this.targetAdPosition = targetAdPosition;
    this.matchTypes = matchTypes;
    this.language = language;
    this.publisherCountries = publisherCountries;
    this.devices = devices;
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
   * Gets the keywords value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @return keywords
   */
  public java.lang.String[] getKeywords() {
    return keywords;
  }

  /**
   * Sets the keywords value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @param keywords
   */
  public void setKeywords(java.lang.String[] keywords) {
    this.keywords = keywords;
  }

  /**
   * Gets the timeInterval value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @return timeInterval
   */
  public com.microsoft.bingads.v10.adinsight.entity.TimeInterval getTimeInterval() {
    return timeInterval;
  }

  /**
   * Sets the timeInterval value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @param timeInterval
   */
  public void setTimeInterval(com.microsoft.bingads.v10.adinsight.entity.TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
  }

  /**
   * Gets the targetAdPosition value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @return targetAdPosition
   */
  public com.microsoft.bingads.v10.adinsight.entity.AdPosition getTargetAdPosition() {
    return targetAdPosition;
  }

  /**
   * Sets the targetAdPosition value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @param targetAdPosition
   */
  public void setTargetAdPosition(com.microsoft.bingads.v10.adinsight.entity.AdPosition targetAdPosition) {
    this.targetAdPosition = targetAdPosition;
  }

  /**
   * Gets the matchTypes value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @return matchTypes
   */
  public com.microsoft.bingads.v10.adinsight.entity.MatchType[] getMatchTypes() {
    return matchTypes;
  }

  /**
   * Sets the matchTypes value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @param matchTypes
   */
  public void setMatchTypes(com.microsoft.bingads.v10.adinsight.entity.MatchType[] matchTypes) {
    this.matchTypes = matchTypes;
  }

  /**
   * Gets the language value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @return language
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * Sets the language value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @param language
   */
  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  /**
   * Gets the publisherCountries value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @return publisherCountries
   */
  public java.lang.String[] getPublisherCountries() {
    return publisherCountries;
  }

  /**
   * Sets the publisherCountries value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @param publisherCountries
   */
  public void setPublisherCountries(java.lang.String[] publisherCountries) {
    this.publisherCountries = publisherCountries;
  }

  /**
   * Gets the devices value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @return devices
   */
  public java.lang.String[] getDevices() {
    return devices;
  }

  /**
   * Sets the devices value for this GetHistoricalKeywordPerformanceRequest.
   *
   * @param devices
   */
  public void setDevices(java.lang.String[] devices) {
    this.devices = devices;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetHistoricalKeywordPerformanceRequest)) return false;
    GetHistoricalKeywordPerformanceRequest other = (GetHistoricalKeywordPerformanceRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.keywords == null && other.getKeywords() == null) ||
                    (this.keywords != null &&
                            java.util.Arrays.equals(this.keywords, other.getKeywords()))) &&
            ((this.timeInterval == null && other.getTimeInterval() == null) ||
                    (this.timeInterval != null &&
                            this.timeInterval.equals(other.getTimeInterval()))) &&
            ((this.targetAdPosition == null && other.getTargetAdPosition() == null) ||
                    (this.targetAdPosition != null &&
                            this.targetAdPosition.equals(other.getTargetAdPosition()))) &&
            ((this.matchTypes == null && other.getMatchTypes() == null) ||
                    (this.matchTypes != null &&
                            java.util.Arrays.equals(this.matchTypes, other.getMatchTypes()))) &&
            ((this.language == null && other.getLanguage() == null) ||
                    (this.language != null &&
                            this.language.equals(other.getLanguage()))) &&
            ((this.publisherCountries == null && other.getPublisherCountries() == null) ||
                    (this.publisherCountries != null &&
                            java.util.Arrays.equals(this.publisherCountries, other.getPublisherCountries()))) &&
            ((this.devices == null && other.getDevices() == null) ||
                    (this.devices != null &&
                            java.util.Arrays.equals(this.devices, other.getDevices())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
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
    if (getTimeInterval() != null) {
      _hashCode += getTimeInterval().hashCode();
    }
    if (getTargetAdPosition() != null) {
      _hashCode += getTargetAdPosition().hashCode();
    }
    if (getMatchTypes() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getMatchTypes());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getMatchTypes(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getLanguage() != null) {
      _hashCode += getLanguage().hashCode();
    }
    if (getPublisherCountries() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getPublisherCountries());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getPublisherCountries(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getDevices() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getDevices());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getDevices(), i);
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
