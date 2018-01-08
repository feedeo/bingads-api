/**
 * KeywordPerformanceReportFilter.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class KeywordPerformanceReportFilter implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(KeywordPerformanceReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordPerformanceReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adDistribution");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdDistribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdDistributionReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adRelevance");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdRelevance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdTypeReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidMatchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BidMatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BidMatchTypeReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidStrategyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BidStrategyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BidStrategyTypeReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveredMatchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeliveredMatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeliveredMatchTypeReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeviceTypeReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCtr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ExpectedCtr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "KeywordStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingPageExperience");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "LandingPageExperience"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityScore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "QualityScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String[] accountStatus;
    private java.lang.String[] adDistribution;
    private java.lang.String[] adGroupStatus;
    private int[] adRelevance;
    private java.lang.String[] adType;
    private java.lang.String[] bidMatchType;
    private java.lang.String[] bidStrategyType;
    private java.lang.String[] campaignStatus;
    private java.lang.String[] deliveredMatchType;
    private java.lang.String[] deviceType;
    private int[] expectedCtr;
    private java.lang.String[] keywordStatus;
    private java.lang.String[] keywords;
    private int[] landingPageExperience;
    private java.lang.String[] languageCode;
    private int[] qualityScore;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public KeywordPerformanceReportFilter() {
    }


    public KeywordPerformanceReportFilter(
            java.lang.String[] accountStatus,
            java.lang.String[] adDistribution,
            java.lang.String[] adGroupStatus,
            int[] adRelevance,
            java.lang.String[] adType,
            java.lang.String[] bidMatchType,
            java.lang.String[] bidStrategyType,
            java.lang.String[] campaignStatus,
            java.lang.String[] deliveredMatchType,
            java.lang.String[] deviceType,
            int[] expectedCtr,
            java.lang.String[] keywordStatus,
            java.lang.String[] keywords,
            int[] landingPageExperience,
            java.lang.String[] languageCode,
            int[] qualityScore) {
        this.accountStatus = accountStatus;
        this.adDistribution = adDistribution;
        this.adGroupStatus = adGroupStatus;
        this.adRelevance = adRelevance;
        this.adType = adType;
        this.bidMatchType = bidMatchType;
        this.bidStrategyType = bidStrategyType;
        this.campaignStatus = campaignStatus;
        this.deliveredMatchType = deliveredMatchType;
        this.deviceType = deviceType;
        this.expectedCtr = expectedCtr;
        this.keywordStatus = keywordStatus;
        this.keywords = keywords;
        this.landingPageExperience = landingPageExperience;
        this.languageCode = languageCode;
        this.qualityScore = qualityScore;
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
     * Gets the accountStatus value for this KeywordPerformanceReportFilter.
     *
     * @return accountStatus
     */
    public java.lang.String[] getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the accountStatus value for this KeywordPerformanceReportFilter.
     *
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String[] accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * Gets the adDistribution value for this KeywordPerformanceReportFilter.
     *
     * @return adDistribution
     */
    public java.lang.String[] getAdDistribution() {
        return adDistribution;
    }

    /**
     * Sets the adDistribution value for this KeywordPerformanceReportFilter.
     *
     * @param adDistribution
     */
    public void setAdDistribution(java.lang.String[] adDistribution) {
        this.adDistribution = adDistribution;
    }

    /**
     * Gets the adGroupStatus value for this KeywordPerformanceReportFilter.
     *
     * @return adGroupStatus
     */
    public java.lang.String[] getAdGroupStatus() {
        return adGroupStatus;
    }

    /**
     * Sets the adGroupStatus value for this KeywordPerformanceReportFilter.
     *
     * @param adGroupStatus
     */
    public void setAdGroupStatus(java.lang.String[] adGroupStatus) {
        this.adGroupStatus = adGroupStatus;
    }

    /**
     * Gets the adRelevance value for this KeywordPerformanceReportFilter.
     *
     * @return adRelevance
     */
    public int[] getAdRelevance() {
        return adRelevance;
    }

    /**
     * Sets the adRelevance value for this KeywordPerformanceReportFilter.
     *
     * @param adRelevance
     */
    public void setAdRelevance(int[] adRelevance) {
        this.adRelevance = adRelevance;
    }

    /**
     * Gets the adType value for this KeywordPerformanceReportFilter.
     *
     * @return adType
     */
    public java.lang.String[] getAdType() {
        return adType;
    }

    /**
     * Sets the adType value for this KeywordPerformanceReportFilter.
     *
     * @param adType
     */
    public void setAdType(java.lang.String[] adType) {
        this.adType = adType;
    }

    /**
     * Gets the bidMatchType value for this KeywordPerformanceReportFilter.
     *
     * @return bidMatchType
     */
    public java.lang.String[] getBidMatchType() {
        return bidMatchType;
    }

    /**
     * Sets the bidMatchType value for this KeywordPerformanceReportFilter.
     *
     * @param bidMatchType
     */
    public void setBidMatchType(java.lang.String[] bidMatchType) {
        this.bidMatchType = bidMatchType;
    }

    /**
     * Gets the bidStrategyType value for this KeywordPerformanceReportFilter.
     *
     * @return bidStrategyType
     */
    public java.lang.String[] getBidStrategyType() {
        return bidStrategyType;
    }

    /**
     * Sets the bidStrategyType value for this KeywordPerformanceReportFilter.
     *
     * @param bidStrategyType
     */
    public void setBidStrategyType(java.lang.String[] bidStrategyType) {
        this.bidStrategyType = bidStrategyType;
    }

    /**
     * Gets the campaignStatus value for this KeywordPerformanceReportFilter.
     *
     * @return campaignStatus
     */
    public java.lang.String[] getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Sets the campaignStatus value for this KeywordPerformanceReportFilter.
     *
     * @param campaignStatus
     */
    public void setCampaignStatus(java.lang.String[] campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * Gets the deliveredMatchType value for this KeywordPerformanceReportFilter.
     *
     * @return deliveredMatchType
     */
    public java.lang.String[] getDeliveredMatchType() {
        return deliveredMatchType;
    }

    /**
     * Sets the deliveredMatchType value for this KeywordPerformanceReportFilter.
     *
     * @param deliveredMatchType
     */
    public void setDeliveredMatchType(java.lang.String[] deliveredMatchType) {
        this.deliveredMatchType = deliveredMatchType;
    }

    /**
     * Gets the deviceType value for this KeywordPerformanceReportFilter.
     *
     * @return deviceType
     */
    public java.lang.String[] getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the deviceType value for this KeywordPerformanceReportFilter.
     *
     * @param deviceType
     */
    public void setDeviceType(java.lang.String[] deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * Gets the expectedCtr value for this KeywordPerformanceReportFilter.
     *
     * @return expectedCtr
     */
    public int[] getExpectedCtr() {
        return expectedCtr;
    }

    /**
     * Sets the expectedCtr value for this KeywordPerformanceReportFilter.
     *
     * @param expectedCtr
     */
    public void setExpectedCtr(int[] expectedCtr) {
        this.expectedCtr = expectedCtr;
    }

    /**
     * Gets the keywordStatus value for this KeywordPerformanceReportFilter.
     *
     * @return keywordStatus
     */
    public java.lang.String[] getKeywordStatus() {
        return keywordStatus;
    }

    /**
     * Sets the keywordStatus value for this KeywordPerformanceReportFilter.
     *
     * @param keywordStatus
     */
    public void setKeywordStatus(java.lang.String[] keywordStatus) {
        this.keywordStatus = keywordStatus;
    }

    /**
     * Gets the keywords value for this KeywordPerformanceReportFilter.
     *
     * @return keywords
     */
    public java.lang.String[] getKeywords() {
        return keywords;
    }

    /**
     * Sets the keywords value for this KeywordPerformanceReportFilter.
     *
     * @param keywords
     */
    public void setKeywords(java.lang.String[] keywords) {
        this.keywords = keywords;
    }

    /**
     * Gets the landingPageExperience value for this KeywordPerformanceReportFilter.
     *
     * @return landingPageExperience
     */
    public int[] getLandingPageExperience() {
        return landingPageExperience;
    }

    /**
     * Sets the landingPageExperience value for this KeywordPerformanceReportFilter.
     *
     * @param landingPageExperience
     */
    public void setLandingPageExperience(int[] landingPageExperience) {
        this.landingPageExperience = landingPageExperience;
    }

    /**
     * Gets the languageCode value for this KeywordPerformanceReportFilter.
     *
     * @return languageCode
     */
    public java.lang.String[] getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the languageCode value for this KeywordPerformanceReportFilter.
     *
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String[] languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Gets the qualityScore value for this KeywordPerformanceReportFilter.
     *
     * @return qualityScore
     */
    public int[] getQualityScore() {
        return qualityScore;
    }

    /**
     * Sets the qualityScore value for this KeywordPerformanceReportFilter.
     *
     * @param qualityScore
     */
    public void setQualityScore(int[] qualityScore) {
        this.qualityScore = qualityScore;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeywordPerformanceReportFilter)) return false;
        KeywordPerformanceReportFilter other = (KeywordPerformanceReportFilter) obj;
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
                ((this.adRelevance == null && other.getAdRelevance() == null) ||
                        (this.adRelevance != null &&
                                java.util.Arrays.equals(this.adRelevance, other.getAdRelevance()))) &&
                ((this.adType == null && other.getAdType() == null) ||
                        (this.adType != null &&
                                java.util.Arrays.equals(this.adType, other.getAdType()))) &&
                ((this.bidMatchType == null && other.getBidMatchType() == null) ||
                        (this.bidMatchType != null &&
                                java.util.Arrays.equals(this.bidMatchType, other.getBidMatchType()))) &&
                ((this.bidStrategyType == null && other.getBidStrategyType() == null) ||
                        (this.bidStrategyType != null &&
                                java.util.Arrays.equals(this.bidStrategyType, other.getBidStrategyType()))) &&
                ((this.campaignStatus == null && other.getCampaignStatus() == null) ||
                        (this.campaignStatus != null &&
                                java.util.Arrays.equals(this.campaignStatus, other.getCampaignStatus()))) &&
                ((this.deliveredMatchType == null && other.getDeliveredMatchType() == null) ||
                        (this.deliveredMatchType != null &&
                                java.util.Arrays.equals(this.deliveredMatchType, other.getDeliveredMatchType()))) &&
                ((this.deviceType == null && other.getDeviceType() == null) ||
                        (this.deviceType != null &&
                                java.util.Arrays.equals(this.deviceType, other.getDeviceType()))) &&
                ((this.expectedCtr == null && other.getExpectedCtr() == null) ||
                        (this.expectedCtr != null &&
                                java.util.Arrays.equals(this.expectedCtr, other.getExpectedCtr()))) &&
                ((this.keywordStatus == null && other.getKeywordStatus() == null) ||
                        (this.keywordStatus != null &&
                                java.util.Arrays.equals(this.keywordStatus, other.getKeywordStatus()))) &&
                ((this.keywords == null && other.getKeywords() == null) ||
                        (this.keywords != null &&
                                java.util.Arrays.equals(this.keywords, other.getKeywords()))) &&
                ((this.landingPageExperience == null && other.getLandingPageExperience() == null) ||
                        (this.landingPageExperience != null &&
                                java.util.Arrays.equals(this.landingPageExperience, other.getLandingPageExperience()))) &&
                ((this.languageCode == null && other.getLanguageCode() == null) ||
                        (this.languageCode != null &&
                                java.util.Arrays.equals(this.languageCode, other.getLanguageCode()))) &&
                ((this.qualityScore == null && other.getQualityScore() == null) ||
                        (this.qualityScore != null &&
                                java.util.Arrays.equals(this.qualityScore, other.getQualityScore())));
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
        if (getAdRelevance() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdRelevance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdRelevance(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdType(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBidMatchType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBidMatchType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBidMatchType(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBidStrategyType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBidStrategyType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBidStrategyType(), i);
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
        if (getExpectedCtr() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getExpectedCtr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedCtr(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeywordStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getKeywordStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordStatus(), i);
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
        if (getLandingPageExperience() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getLandingPageExperience());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandingPageExperience(), i);
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
        if (getQualityScore() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getQualityScore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQualityScore(), i);
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
