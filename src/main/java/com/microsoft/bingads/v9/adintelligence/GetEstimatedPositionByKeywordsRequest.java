/**
 * GetEstimatedPositionByKeywordsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetEstimatedPositionByKeywordsRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords;

    private java.lang.Double maxBid;

    private java.lang.String language;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring publisherCountries;

    private com.microsoft.bingads.v9.datacontracts.Currency currency;

    private com.microsoft.bingads.v9.datacontracts.ArrayOfMatchType matchTypes;

    private java.lang.Long campaignId;

    private java.lang.Long adgroupId;

    public GetEstimatedPositionByKeywordsRequest() {
    }

    public GetEstimatedPositionByKeywordsRequest(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords,
           java.lang.Double maxBid,
           java.lang.String language,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring publisherCountries,
           com.microsoft.bingads.v9.datacontracts.Currency currency,
           com.microsoft.bingads.v9.datacontracts.ArrayOfMatchType matchTypes,
           java.lang.Long campaignId,
           java.lang.Long adgroupId) {
           this.keywords = keywords;
           this.maxBid = maxBid;
           this.language = language;
           this.publisherCountries = publisherCountries;
           this.currency = currency;
           this.matchTypes = matchTypes;
           this.campaignId = campaignId;
           this.adgroupId = adgroupId;
    }


    /**
     * Gets the keywords value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @return keywords
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @param keywords
     */
    public void setKeywords(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the maxBid value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @return maxBid
     */
    public java.lang.Double getMaxBid() {
        return maxBid;
    }


    /**
     * Sets the maxBid value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @param maxBid
     */
    public void setMaxBid(java.lang.Double maxBid) {
        this.maxBid = maxBid;
    }


    /**
     * Gets the language value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the publisherCountries value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @return publisherCountries
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getPublisherCountries() {
        return publisherCountries;
    }


    /**
     * Sets the publisherCountries value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @param publisherCountries
     */
    public void setPublisherCountries(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring publisherCountries) {
        this.publisherCountries = publisherCountries;
    }


    /**
     * Gets the currency value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @return currency
     */
    public com.microsoft.bingads.v9.datacontracts.Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @param currency
     */
    public void setCurrency(com.microsoft.bingads.v9.datacontracts.Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the matchTypes value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @return matchTypes
     */
    public com.microsoft.bingads.v9.datacontracts.ArrayOfMatchType getMatchTypes() {
        return matchTypes;
    }


    /**
     * Sets the matchTypes value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @param matchTypes
     */
    public void setMatchTypes(com.microsoft.bingads.v9.datacontracts.ArrayOfMatchType matchTypes) {
        this.matchTypes = matchTypes;
    }


    /**
     * Gets the campaignId value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the adgroupId value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @return adgroupId
     */
    public java.lang.Long getAdgroupId() {
        return adgroupId;
    }


    /**
     * Sets the adgroupId value for this GetEstimatedPositionByKeywordsRequest.
     * 
     * @param adgroupId
     */
    public void setAdgroupId(java.lang.Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEstimatedPositionByKeywordsRequest)) return false;
        GetEstimatedPositionByKeywordsRequest other = (GetEstimatedPositionByKeywordsRequest) obj;
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
            ((this.maxBid==null && other.getMaxBid()==null) || 
             (this.maxBid!=null &&
              this.maxBid.equals(other.getMaxBid()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.publisherCountries==null && other.getPublisherCountries()==null) || 
             (this.publisherCountries!=null &&
              this.publisherCountries.equals(other.getPublisherCountries()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.matchTypes==null && other.getMatchTypes()==null) || 
             (this.matchTypes!=null &&
              this.matchTypes.equals(other.getMatchTypes()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adgroupId==null && other.getAdgroupId()==null) || 
             (this.adgroupId!=null &&
              this.adgroupId.equals(other.getAdgroupId())));
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
        if (getMaxBid() != null) {
            _hashCode += getMaxBid().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getPublisherCountries() != null) {
            _hashCode += getPublisherCountries().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getMatchTypes() != null) {
            _hashCode += getMatchTypes().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getAdgroupId() != null) {
            _hashCode += getAdgroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEstimatedPositionByKeywordsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "MaxBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Currency"));
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
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adgroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "AdgroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
