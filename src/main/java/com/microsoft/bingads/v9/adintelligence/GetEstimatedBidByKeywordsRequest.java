/**
 * GetEstimatedBidByKeywordsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetEstimatedBidByKeywordsRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType[] keywords;

    private com.microsoft.bingads.v9.datacontracts.TargetAdPosition targetPositionForAds;

    private java.lang.String language;

    private java.lang.String[] publisherCountries;

    private com.microsoft.bingads.v9.datacontracts.Currency currency;

    private java.lang.Long campaignId;

    private java.lang.Long adgroupId;

    private java.lang.Integer getBidsAtLevel;

    public GetEstimatedBidByKeywordsRequest() {
    }

    public GetEstimatedBidByKeywordsRequest(
           com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType[] keywords,
           com.microsoft.bingads.v9.datacontracts.TargetAdPosition targetPositionForAds,
           java.lang.String language,
           java.lang.String[] publisherCountries,
           com.microsoft.bingads.v9.datacontracts.Currency currency,
           java.lang.Long campaignId,
           java.lang.Long adgroupId,
           java.lang.Integer getBidsAtLevel) {
           this.keywords = keywords;
           this.targetPositionForAds = targetPositionForAds;
           this.language = language;
           this.publisherCountries = publisherCountries;
           this.currency = currency;
           this.campaignId = campaignId;
           this.adgroupId = adgroupId;
           this.getBidsAtLevel = getBidsAtLevel;
    }


    /**
     * Gets the keywords value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @return keywords
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType[] getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @param keywords
     */
    public void setKeywords(com.microsoft.bingads.v9.datacontracts.KeywordAndMatchType[] keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the targetPositionForAds value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @return targetPositionForAds
     */
    public com.microsoft.bingads.v9.datacontracts.TargetAdPosition getTargetPositionForAds() {
        return targetPositionForAds;
    }


    /**
     * Sets the targetPositionForAds value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @param targetPositionForAds
     */
    public void setTargetPositionForAds(com.microsoft.bingads.v9.datacontracts.TargetAdPosition targetPositionForAds) {
        this.targetPositionForAds = targetPositionForAds;
    }


    /**
     * Gets the language value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the publisherCountries value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @return publisherCountries
     */
    public java.lang.String[] getPublisherCountries() {
        return publisherCountries;
    }


    /**
     * Sets the publisherCountries value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @param publisherCountries
     */
    public void setPublisherCountries(java.lang.String[] publisherCountries) {
        this.publisherCountries = publisherCountries;
    }


    /**
     * Gets the currency value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @return currency
     */
    public com.microsoft.bingads.v9.datacontracts.Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @param currency
     */
    public void setCurrency(com.microsoft.bingads.v9.datacontracts.Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the campaignId value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the adgroupId value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @return adgroupId
     */
    public java.lang.Long getAdgroupId() {
        return adgroupId;
    }


    /**
     * Sets the adgroupId value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @param adgroupId
     */
    public void setAdgroupId(java.lang.Long adgroupId) {
        this.adgroupId = adgroupId;
    }


    /**
     * Gets the getBidsAtLevel value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @return getBidsAtLevel
     */
    public java.lang.Integer getGetBidsAtLevel() {
        return getBidsAtLevel;
    }


    /**
     * Sets the getBidsAtLevel value for this GetEstimatedBidByKeywordsRequest.
     * 
     * @param getBidsAtLevel
     */
    public void setGetBidsAtLevel(java.lang.Integer getBidsAtLevel) {
        this.getBidsAtLevel = getBidsAtLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEstimatedBidByKeywordsRequest)) return false;
        GetEstimatedBidByKeywordsRequest other = (GetEstimatedBidByKeywordsRequest) obj;
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
              java.util.Arrays.equals(this.keywords, other.getKeywords()))) &&
            ((this.targetPositionForAds==null && other.getTargetPositionForAds()==null) || 
             (this.targetPositionForAds!=null &&
              this.targetPositionForAds.equals(other.getTargetPositionForAds()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.publisherCountries==null && other.getPublisherCountries()==null) || 
             (this.publisherCountries!=null &&
              java.util.Arrays.equals(this.publisherCountries, other.getPublisherCountries()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adgroupId==null && other.getAdgroupId()==null) || 
             (this.adgroupId!=null &&
              this.adgroupId.equals(other.getAdgroupId()))) &&
            ((this.getBidsAtLevel==null && other.getGetBidsAtLevel()==null) || 
             (this.getBidsAtLevel!=null &&
              this.getBidsAtLevel.equals(other.getGetBidsAtLevel())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetPositionForAds() != null) {
            _hashCode += getTargetPositionForAds().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getPublisherCountries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublisherCountries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublisherCountries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getAdgroupId() != null) {
            _hashCode += getAdgroupId().hashCode();
        }
        if (getGetBidsAtLevel() != null) {
            _hashCode += getGetBidsAtLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEstimatedBidByKeywordsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedBidByKeywordsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordAndMatchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordAndMatchType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPositionForAds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "TargetPositionForAds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "TargetAdPosition"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Currency"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBidsAtLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "GetBidsAtLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
