/**
 * KeywordPerformanceReportFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class KeywordPerformanceReportFilter  implements java.io.Serializable {
    private java.lang.String[] adDistribution;

    private java.lang.String[] adType;

    private java.lang.String[] bidMatchType;

    private java.lang.String[] deliveredMatchType;

    private java.lang.String[] deviceType;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfint keywordRelevance;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfint landingPageRelevance;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfint landingPageUserExperience;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring languageCode;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfint qualityScore;

    public KeywordPerformanceReportFilter() {
    }

    public KeywordPerformanceReportFilter(
           java.lang.String[] adDistribution,
           java.lang.String[] adType,
           java.lang.String[] bidMatchType,
           java.lang.String[] deliveredMatchType,
           java.lang.String[] deviceType,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfint keywordRelevance,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfint landingPageRelevance,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfint landingPageUserExperience,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring languageCode,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfint qualityScore) {
           this.adDistribution = adDistribution;
           this.adType = adType;
           this.bidMatchType = bidMatchType;
           this.deliveredMatchType = deliveredMatchType;
           this.deviceType = deviceType;
           this.keywordRelevance = keywordRelevance;
           this.keywords = keywords;
           this.landingPageRelevance = landingPageRelevance;
           this.landingPageUserExperience = landingPageUserExperience;
           this.languageCode = languageCode;
           this.qualityScore = qualityScore;
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
     * Gets the keywordRelevance value for this KeywordPerformanceReportFilter.
     * 
     * @return keywordRelevance
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfint getKeywordRelevance() {
        return keywordRelevance;
    }


    /**
     * Sets the keywordRelevance value for this KeywordPerformanceReportFilter.
     * 
     * @param keywordRelevance
     */
    public void setKeywordRelevance(com.microsoft.bingads.v9.schemas.arrays.ArrayOfint keywordRelevance) {
        this.keywordRelevance = keywordRelevance;
    }


    /**
     * Gets the keywords value for this KeywordPerformanceReportFilter.
     * 
     * @return keywords
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this KeywordPerformanceReportFilter.
     * 
     * @param keywords
     */
    public void setKeywords(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the landingPageRelevance value for this KeywordPerformanceReportFilter.
     * 
     * @return landingPageRelevance
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfint getLandingPageRelevance() {
        return landingPageRelevance;
    }


    /**
     * Sets the landingPageRelevance value for this KeywordPerformanceReportFilter.
     * 
     * @param landingPageRelevance
     */
    public void setLandingPageRelevance(com.microsoft.bingads.v9.schemas.arrays.ArrayOfint landingPageRelevance) {
        this.landingPageRelevance = landingPageRelevance;
    }


    /**
     * Gets the landingPageUserExperience value for this KeywordPerformanceReportFilter.
     * 
     * @return landingPageUserExperience
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfint getLandingPageUserExperience() {
        return landingPageUserExperience;
    }


    /**
     * Sets the landingPageUserExperience value for this KeywordPerformanceReportFilter.
     * 
     * @param landingPageUserExperience
     */
    public void setLandingPageUserExperience(com.microsoft.bingads.v9.schemas.arrays.ArrayOfint landingPageUserExperience) {
        this.landingPageUserExperience = landingPageUserExperience;
    }


    /**
     * Gets the languageCode value for this KeywordPerformanceReportFilter.
     * 
     * @return languageCode
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this KeywordPerformanceReportFilter.
     * 
     * @param languageCode
     */
    public void setLanguageCode(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the qualityScore value for this KeywordPerformanceReportFilter.
     * 
     * @return qualityScore
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfint getQualityScore() {
        return qualityScore;
    }


    /**
     * Sets the qualityScore value for this KeywordPerformanceReportFilter.
     * 
     * @param qualityScore
     */
    public void setQualityScore(com.microsoft.bingads.v9.schemas.arrays.ArrayOfint qualityScore) {
        this.qualityScore = qualityScore;
    }

    private java.lang.Object __equalsCalc = null;
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
            ((this.adDistribution==null && other.getAdDistribution()==null) || 
             (this.adDistribution!=null &&
              java.util.Arrays.equals(this.adDistribution, other.getAdDistribution()))) &&
            ((this.adType==null && other.getAdType()==null) || 
             (this.adType!=null &&
              java.util.Arrays.equals(this.adType, other.getAdType()))) &&
            ((this.bidMatchType==null && other.getBidMatchType()==null) || 
             (this.bidMatchType!=null &&
              java.util.Arrays.equals(this.bidMatchType, other.getBidMatchType()))) &&
            ((this.deliveredMatchType==null && other.getDeliveredMatchType()==null) || 
             (this.deliveredMatchType!=null &&
              java.util.Arrays.equals(this.deliveredMatchType, other.getDeliveredMatchType()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              java.util.Arrays.equals(this.deviceType, other.getDeviceType()))) &&
            ((this.keywordRelevance==null && other.getKeywordRelevance()==null) || 
             (this.keywordRelevance!=null &&
              this.keywordRelevance.equals(other.getKeywordRelevance()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.landingPageRelevance==null && other.getLandingPageRelevance()==null) || 
             (this.landingPageRelevance!=null &&
              this.landingPageRelevance.equals(other.getLandingPageRelevance()))) &&
            ((this.landingPageUserExperience==null && other.getLandingPageUserExperience()==null) || 
             (this.landingPageUserExperience!=null &&
              this.landingPageUserExperience.equals(other.getLandingPageUserExperience()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.qualityScore==null && other.getQualityScore()==null) || 
             (this.qualityScore!=null &&
              this.qualityScore.equals(other.getQualityScore())));
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
        if (getAdDistribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdDistribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdDistribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBidMatchType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBidMatchType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBidMatchType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveredMatchType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveredMatchType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveredMatchType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeywordRelevance() != null) {
            _hashCode += getKeywordRelevance().hashCode();
        }
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getLandingPageRelevance() != null) {
            _hashCode += getLandingPageRelevance().hashCode();
        }
        if (getLandingPageUserExperience() != null) {
            _hashCode += getLandingPageUserExperience().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getQualityScore() != null) {
            _hashCode += getQualityScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeywordPerformanceReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adDistribution");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDistribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDistributionReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdTypeReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidMatchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BidMatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BidMatchTypeReportFilter"));
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
        elemField.setFieldName("keywordRelevance");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordRelevance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingPageRelevance");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "LandingPageRelevance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingPageUserExperience");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "LandingPageUserExperience"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityScore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "QualityScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint"));
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
