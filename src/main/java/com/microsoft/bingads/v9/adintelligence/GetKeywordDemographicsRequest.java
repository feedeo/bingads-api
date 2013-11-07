/**
 * GetKeywordDemographicsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetKeywordDemographicsRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords;

    private java.lang.String language;

    private java.lang.String publisherCountry;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring device;

    public GetKeywordDemographicsRequest() {
    }

    public GetKeywordDemographicsRequest(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords,
           java.lang.String language,
           java.lang.String publisherCountry,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring device) {
           this.keywords = keywords;
           this.language = language;
           this.publisherCountry = publisherCountry;
           this.device = device;
    }


    /**
     * Gets the keywords value for this GetKeywordDemographicsRequest.
     * 
     * @return keywords
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this GetKeywordDemographicsRequest.
     * 
     * @param keywords
     */
    public void setKeywords(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the language value for this GetKeywordDemographicsRequest.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this GetKeywordDemographicsRequest.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the publisherCountry value for this GetKeywordDemographicsRequest.
     * 
     * @return publisherCountry
     */
    public java.lang.String getPublisherCountry() {
        return publisherCountry;
    }


    /**
     * Sets the publisherCountry value for this GetKeywordDemographicsRequest.
     * 
     * @param publisherCountry
     */
    public void setPublisherCountry(java.lang.String publisherCountry) {
        this.publisherCountry = publisherCountry;
    }


    /**
     * Gets the device value for this GetKeywordDemographicsRequest.
     * 
     * @return device
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getDevice() {
        return device;
    }


    /**
     * Sets the device value for this GetKeywordDemographicsRequest.
     * 
     * @param device
     */
    public void setDevice(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring device) {
        this.device = device;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKeywordDemographicsRequest)) return false;
        GetKeywordDemographicsRequest other = (GetKeywordDemographicsRequest) obj;
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
            ((this.publisherCountry==null && other.getPublisherCountry()==null) || 
             (this.publisherCountry!=null &&
              this.publisherCountry.equals(other.getPublisherCountry()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice())));
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
        if (getPublisherCountry() != null) {
            _hashCode += getPublisherCountry().hashCode();
        }
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKeywordDemographicsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordDemographicsRequest"));
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
        elemField.setFieldName("publisherCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "PublisherCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "Device"));
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
