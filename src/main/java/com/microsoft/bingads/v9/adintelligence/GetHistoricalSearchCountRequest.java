/**
 * GetHistoricalSearchCountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetHistoricalSearchCountRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords;

    private java.lang.String language;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring publisherCountries;

    private com.microsoft.bingads.v9.datacontracts.DayMonthAndYear startDate;

    private com.microsoft.bingads.v9.datacontracts.DayMonthAndYear endDate;

    private java.lang.String timePeriodRollup;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring devices;

    public GetHistoricalSearchCountRequest() {
    }

    public GetHistoricalSearchCountRequest(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords,
           java.lang.String language,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring publisherCountries,
           com.microsoft.bingads.v9.datacontracts.DayMonthAndYear startDate,
           com.microsoft.bingads.v9.datacontracts.DayMonthAndYear endDate,
           java.lang.String timePeriodRollup,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring devices) {
           this.keywords = keywords;
           this.language = language;
           this.publisherCountries = publisherCountries;
           this.startDate = startDate;
           this.endDate = endDate;
           this.timePeriodRollup = timePeriodRollup;
           this.devices = devices;
    }


    /**
     * Gets the keywords value for this GetHistoricalSearchCountRequest.
     * 
     * @return keywords
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this GetHistoricalSearchCountRequest.
     * 
     * @param keywords
     */
    public void setKeywords(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the language value for this GetHistoricalSearchCountRequest.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this GetHistoricalSearchCountRequest.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the publisherCountries value for this GetHistoricalSearchCountRequest.
     * 
     * @return publisherCountries
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getPublisherCountries() {
        return publisherCountries;
    }


    /**
     * Sets the publisherCountries value for this GetHistoricalSearchCountRequest.
     * 
     * @param publisherCountries
     */
    public void setPublisherCountries(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring publisherCountries) {
        this.publisherCountries = publisherCountries;
    }


    /**
     * Gets the startDate value for this GetHistoricalSearchCountRequest.
     * 
     * @return startDate
     */
    public com.microsoft.bingads.v9.datacontracts.DayMonthAndYear getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetHistoricalSearchCountRequest.
     * 
     * @param startDate
     */
    public void setStartDate(com.microsoft.bingads.v9.datacontracts.DayMonthAndYear startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this GetHistoricalSearchCountRequest.
     * 
     * @return endDate
     */
    public com.microsoft.bingads.v9.datacontracts.DayMonthAndYear getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GetHistoricalSearchCountRequest.
     * 
     * @param endDate
     */
    public void setEndDate(com.microsoft.bingads.v9.datacontracts.DayMonthAndYear endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the timePeriodRollup value for this GetHistoricalSearchCountRequest.
     * 
     * @return timePeriodRollup
     */
    public java.lang.String getTimePeriodRollup() {
        return timePeriodRollup;
    }


    /**
     * Sets the timePeriodRollup value for this GetHistoricalSearchCountRequest.
     * 
     * @param timePeriodRollup
     */
    public void setTimePeriodRollup(java.lang.String timePeriodRollup) {
        this.timePeriodRollup = timePeriodRollup;
    }


    /**
     * Gets the devices value for this GetHistoricalSearchCountRequest.
     * 
     * @return devices
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getDevices() {
        return devices;
    }


    /**
     * Sets the devices value for this GetHistoricalSearchCountRequest.
     * 
     * @param devices
     */
    public void setDevices(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring devices) {
        this.devices = devices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHistoricalSearchCountRequest)) return false;
        GetHistoricalSearchCountRequest other = (GetHistoricalSearchCountRequest) obj;
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
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.publisherCountries==null && other.getPublisherCountries()==null) || 
             (this.publisherCountries!=null &&
              this.publisherCountries.equals(other.getPublisherCountries()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.timePeriodRollup==null && other.getTimePeriodRollup()==null) || 
             (this.timePeriodRollup!=null &&
              this.timePeriodRollup.equals(other.getTimePeriodRollup()))) &&
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
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getPublisherCountries() != null) {
            _hashCode += getPublisherCountries().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getTimePeriodRollup() != null) {
            _hashCode += getTimePeriodRollup().hashCode();
        }
        if (getDevices() != null) {
            _hashCode += getDevices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHistoricalSearchCountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalSearchCountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "DayMonthAndYear"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "DayMonthAndYear"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriodRollup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "TimePeriodRollup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
