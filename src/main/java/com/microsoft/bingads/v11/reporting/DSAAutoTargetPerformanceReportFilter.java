/**
 * DSAAutoTargetPerformanceReportFilter.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class DSAAutoTargetPerformanceReportFilter implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DSAAutoTargetPerformanceReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DSAAutoTargetPerformanceReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountStatusReportFilter"));
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
        elemField.setFieldName("dynamicAdTargetStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DynamicAdTargetStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DynamicAdTargetStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String[] accountStatus;
    private java.lang.String[] adGroupStatus;
    private java.lang.String[] bidStrategyType;
    private java.lang.String[] campaignStatus;
    private java.lang.String[] dynamicAdTargetStatus;
    private java.lang.String[] languageCode;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DSAAutoTargetPerformanceReportFilter() {
    }


    public DSAAutoTargetPerformanceReportFilter(
            java.lang.String[] accountStatus,
            java.lang.String[] adGroupStatus,
            java.lang.String[] bidStrategyType,
            java.lang.String[] campaignStatus,
            java.lang.String[] dynamicAdTargetStatus,
            java.lang.String[] languageCode) {
        this.accountStatus = accountStatus;
        this.adGroupStatus = adGroupStatus;
        this.bidStrategyType = bidStrategyType;
        this.campaignStatus = campaignStatus;
        this.dynamicAdTargetStatus = dynamicAdTargetStatus;
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
     * Gets the accountStatus value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @return accountStatus
     */
    public java.lang.String[] getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the accountStatus value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String[] accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * Gets the adGroupStatus value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @return adGroupStatus
     */
    public java.lang.String[] getAdGroupStatus() {
        return adGroupStatus;
    }

    /**
     * Sets the adGroupStatus value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @param adGroupStatus
     */
    public void setAdGroupStatus(java.lang.String[] adGroupStatus) {
        this.adGroupStatus = adGroupStatus;
    }

    /**
     * Gets the bidStrategyType value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @return bidStrategyType
     */
    public java.lang.String[] getBidStrategyType() {
        return bidStrategyType;
    }

    /**
     * Sets the bidStrategyType value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @param bidStrategyType
     */
    public void setBidStrategyType(java.lang.String[] bidStrategyType) {
        this.bidStrategyType = bidStrategyType;
    }

    /**
     * Gets the campaignStatus value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @return campaignStatus
     */
    public java.lang.String[] getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Sets the campaignStatus value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @param campaignStatus
     */
    public void setCampaignStatus(java.lang.String[] campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * Gets the dynamicAdTargetStatus value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @return dynamicAdTargetStatus
     */
    public java.lang.String[] getDynamicAdTargetStatus() {
        return dynamicAdTargetStatus;
    }

    /**
     * Sets the dynamicAdTargetStatus value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @param dynamicAdTargetStatus
     */
    public void setDynamicAdTargetStatus(java.lang.String[] dynamicAdTargetStatus) {
        this.dynamicAdTargetStatus = dynamicAdTargetStatus;
    }

    /**
     * Gets the languageCode value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @return languageCode
     */
    public java.lang.String[] getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the languageCode value for this DSAAutoTargetPerformanceReportFilter.
     *
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String[] languageCode) {
        this.languageCode = languageCode;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DSAAutoTargetPerformanceReportFilter)) return false;
        DSAAutoTargetPerformanceReportFilter other = (DSAAutoTargetPerformanceReportFilter) obj;
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
                ((this.adGroupStatus == null && other.getAdGroupStatus() == null) ||
                        (this.adGroupStatus != null &&
                                java.util.Arrays.equals(this.adGroupStatus, other.getAdGroupStatus()))) &&
                ((this.bidStrategyType == null && other.getBidStrategyType() == null) ||
                        (this.bidStrategyType != null &&
                                java.util.Arrays.equals(this.bidStrategyType, other.getBidStrategyType()))) &&
                ((this.campaignStatus == null && other.getCampaignStatus() == null) ||
                        (this.campaignStatus != null &&
                                java.util.Arrays.equals(this.campaignStatus, other.getCampaignStatus()))) &&
                ((this.dynamicAdTargetStatus == null && other.getDynamicAdTargetStatus() == null) ||
                        (this.dynamicAdTargetStatus != null &&
                                java.util.Arrays.equals(this.dynamicAdTargetStatus, other.getDynamicAdTargetStatus()))) &&
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
        if (getDynamicAdTargetStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDynamicAdTargetStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicAdTargetStatus(), i);
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
