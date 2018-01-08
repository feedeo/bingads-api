/**
 * AdGroupPerformanceReportFilter.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class AdGroupPerformanceReportFilter implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AdGroupPerformanceReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupPerformanceReportFilter"));
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
        elemField.setFieldName("campaignStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceOS");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeviceOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "DeviceOSReportFilter"));
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
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdGroupStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String[] accountStatus;
    private java.lang.String[] adDistribution;
    private java.lang.String[] campaignStatus;
    private java.lang.String[] deviceOS;
    private java.lang.String[] deviceType;
    private java.lang.String[] languageCode;
    private java.lang.String[] status;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AdGroupPerformanceReportFilter() {
    }


    public AdGroupPerformanceReportFilter(
            java.lang.String[] accountStatus,
            java.lang.String[] adDistribution,
            java.lang.String[] campaignStatus,
            java.lang.String[] deviceOS,
            java.lang.String[] deviceType,
            java.lang.String[] languageCode,
            java.lang.String[] status) {
        this.accountStatus = accountStatus;
        this.adDistribution = adDistribution;
        this.campaignStatus = campaignStatus;
        this.deviceOS = deviceOS;
        this.deviceType = deviceType;
        this.languageCode = languageCode;
        this.status = status;
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
     * Gets the accountStatus value for this AdGroupPerformanceReportFilter.
     *
     * @return accountStatus
     */
    public java.lang.String[] getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the accountStatus value for this AdGroupPerformanceReportFilter.
     *
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String[] accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * Gets the adDistribution value for this AdGroupPerformanceReportFilter.
     *
     * @return adDistribution
     */
    public java.lang.String[] getAdDistribution() {
        return adDistribution;
    }

    /**
     * Sets the adDistribution value for this AdGroupPerformanceReportFilter.
     *
     * @param adDistribution
     */
    public void setAdDistribution(java.lang.String[] adDistribution) {
        this.adDistribution = adDistribution;
    }

    /**
     * Gets the campaignStatus value for this AdGroupPerformanceReportFilter.
     *
     * @return campaignStatus
     */
    public java.lang.String[] getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Sets the campaignStatus value for this AdGroupPerformanceReportFilter.
     *
     * @param campaignStatus
     */
    public void setCampaignStatus(java.lang.String[] campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * Gets the deviceOS value for this AdGroupPerformanceReportFilter.
     *
     * @return deviceOS
     */
    public java.lang.String[] getDeviceOS() {
        return deviceOS;
    }

    /**
     * Sets the deviceOS value for this AdGroupPerformanceReportFilter.
     *
     * @param deviceOS
     */
    public void setDeviceOS(java.lang.String[] deviceOS) {
        this.deviceOS = deviceOS;
    }

    /**
     * Gets the deviceType value for this AdGroupPerformanceReportFilter.
     *
     * @return deviceType
     */
    public java.lang.String[] getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the deviceType value for this AdGroupPerformanceReportFilter.
     *
     * @param deviceType
     */
    public void setDeviceType(java.lang.String[] deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * Gets the languageCode value for this AdGroupPerformanceReportFilter.
     *
     * @return languageCode
     */
    public java.lang.String[] getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the languageCode value for this AdGroupPerformanceReportFilter.
     *
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String[] languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Gets the status value for this AdGroupPerformanceReportFilter.
     *
     * @return status
     */
    public java.lang.String[] getStatus() {
        return status;
    }

    /**
     * Sets the status value for this AdGroupPerformanceReportFilter.
     *
     * @param status
     */
    public void setStatus(java.lang.String[] status) {
        this.status = status;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupPerformanceReportFilter)) return false;
        AdGroupPerformanceReportFilter other = (AdGroupPerformanceReportFilter) obj;
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
                ((this.campaignStatus == null && other.getCampaignStatus() == null) ||
                        (this.campaignStatus != null &&
                                java.util.Arrays.equals(this.campaignStatus, other.getCampaignStatus()))) &&
                ((this.deviceOS == null && other.getDeviceOS() == null) ||
                        (this.deviceOS != null &&
                                java.util.Arrays.equals(this.deviceOS, other.getDeviceOS()))) &&
                ((this.deviceType == null && other.getDeviceType() == null) ||
                        (this.deviceType != null &&
                                java.util.Arrays.equals(this.deviceType, other.getDeviceType()))) &&
                ((this.languageCode == null && other.getLanguageCode() == null) ||
                        (this.languageCode != null &&
                                java.util.Arrays.equals(this.languageCode, other.getLanguageCode()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                java.util.Arrays.equals(this.status, other.getStatus())));
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
        if (getDeviceOS() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDeviceOS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceOS(), i);
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
        if (getStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
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
