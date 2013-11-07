/**
 * GetHistoricalKeywordPerformanceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetHistoricalKeywordPerformanceRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords;

    private com.microsoft.bingads.v9.datacontracts.TimeInterval timeInterval;

    private com.microsoft.bingads.v9.datacontracts.AdPosition targetAdPosition;

    private com.microsoft.bingads.v9.datacontracts.ArrayOfMatchType matchTypes;

    private java.lang.String language;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring publisherCountries;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring devices;

    public GetHistoricalKeywordPerformanceRequest() {
    }

    public GetHistoricalKeywordPerformanceRequest(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords,
           com.microsoft.bingads.v9.datacontracts.TimeInterval timeInterval,
           com.microsoft.bingads.v9.datacontracts.AdPosition targetAdPosition,
           com.microsoft.bingads.v9.datacontracts.ArrayOfMatchType matchTypes,
           java.lang.String language,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring publisherCountries,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring devices) {
           this.keywords = keywords;
           this.timeInterval = timeInterval;
           this.targetAdPosition = targetAdPosition;
           this.matchTypes = matchTypes;
           this.language = language;
           this.publisherCountries = publisherCountries;
           this.devices = devices;
    }


    /**
     * Gets the keywords value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @return keywords
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @param keywords
     */
    public void setKeywords(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the timeInterval value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @return timeInterval
     */
    public com.microsoft.bingads.v9.datacontracts.TimeInterval getTimeInterval() {
        return timeInterval;
    }


    /**
     * Sets the timeInterval value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @param timeInterval
     */
    public void setTimeInterval(com.microsoft.bingads.v9.datacontracts.TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }


    /**
     * Gets the targetAdPosition value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @return targetAdPosition
     */
    public com.microsoft.bingads.v9.datacontracts.AdPosition getTargetAdPosition() {
        return targetAdPosition;
    }


    /**
     * Sets the targetAdPosition value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @param targetAdPosition
     */
    public void setTargetAdPosition(com.microsoft.bingads.v9.datacontracts.AdPosition targetAdPosition) {
        this.targetAdPosition = targetAdPosition;
    }


    /**
     * Gets the matchTypes value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @return matchTypes
     */
    public com.microsoft.bingads.v9.datacontracts.ArrayOfMatchType getMatchTypes() {
        return matchTypes;
    }


    /**
     * Sets the matchTypes value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @param matchTypes
     */
    public void setMatchTypes(com.microsoft.bingads.v9.datacontracts.ArrayOfMatchType matchTypes) {
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
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getPublisherCountries() {
        return publisherCountries;
    }


    /**
     * Sets the publisherCountries value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @param publisherCountries
     */
    public void setPublisherCountries(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring publisherCountries) {
        this.publisherCountries = publisherCountries;
    }


    /**
     * Gets the devices value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @return devices
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getDevices() {
        return devices;
    }


    /**
     * Sets the devices value for this GetHistoricalKeywordPerformanceRequest.
     * 
     * @param devices
     */
    public void setDevices(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring devices) {
        this.devices = devices;
    }

    private java.lang.Object __equalsCalc = null;
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
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.timeInterval==null && other.getTimeInterval()==null) || 
             (this.timeInterval!=null &&
              this.timeInterval.equals(other.getTimeInterval()))) &&
            ((this.targetAdPosition==null && other.getTargetAdPosition()==null) || 
             (this.targetAdPosition!=null &&
              this.targetAdPosition.equals(other.getTargetAdPosition()))) &&
            ((this.matchTypes==null && other.getMatchTypes()==null) || 
             (this.matchTypes!=null &&
              this.matchTypes.equals(other.getMatchTypes()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.publisherCountries==null && other.getPublisherCountries()==null) || 
             (this.publisherCountries!=null &&
              this.publisherCountries.equals(other.getPublisherCountries()))) &&
            ((this.devices==null && other.getDevices()==null) || 
             (this.devices!=null &&
              this.devices.equals(other.getDevices())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getTimeInterval() != null) {
            _hashCode += getTimeInterval().hashCode();
        }
        if (getTargetAdPosition() != null) {
            _hashCode += getTargetAdPosition().hashCode();
        }
        if (getMatchTypes() != null) {
            _hashCode += getMatchTypes().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getPublisherCountries() != null) {
            _hashCode += getPublisherCountries().hashCode();
        }
        if (getDevices() != null) {
            _hashCode += getDevices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHistoricalKeywordPerformanceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalKeywordPerformanceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "TimeInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "TimeInterval"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAdPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "TargetAdPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "MatchTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfMatchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherCountries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "PublisherCountries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devices");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "Devices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
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
          new  org.apache.axis.encoding.ser.BeanSerializer(
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
