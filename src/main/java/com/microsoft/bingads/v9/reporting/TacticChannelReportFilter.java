/**
 * TacticChannelReportFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class TacticChannelReportFilter  implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TacticChannelReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ChannelIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacticIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAdGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ThirdPartyAdGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyCampaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ThirdPartyCampaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String[] accountStatus;
    private java.lang.String[] adGroupStatus;
    private java.lang.String[] campaignStatus;
    private long[] channelIds;
    private java.lang.String[] keywordStatus;
    private long[] tacticIds;
    private long[] thirdPartyAdGroupIds;
    private long[] thirdPartyCampaignIds;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TacticChannelReportFilter() {
    }


    public TacticChannelReportFilter(
            java.lang.String[] accountStatus,
            java.lang.String[] adGroupStatus,
            java.lang.String[] campaignStatus,
            long[] channelIds,
            java.lang.String[] keywordStatus,
            long[] tacticIds,
            long[] thirdPartyAdGroupIds,
            long[] thirdPartyCampaignIds) {
        this.accountStatus = accountStatus;
        this.adGroupStatus = adGroupStatus;
        this.campaignStatus = campaignStatus;
           this.channelIds = channelIds;
        this.keywordStatus = keywordStatus;
           this.tacticIds = tacticIds;
           this.thirdPartyAdGroupIds = thirdPartyAdGroupIds;
           this.thirdPartyCampaignIds = thirdPartyCampaignIds;
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
     * Gets the accountStatus value for this TacticChannelReportFilter.
     *
     * @return accountStatus
     */
    public java.lang.String[] getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the accountStatus value for this TacticChannelReportFilter.
     *
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String[] accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * Gets the adGroupStatus value for this TacticChannelReportFilter.
     *
     * @return adGroupStatus
     */
    public java.lang.String[] getAdGroupStatus() {
        return adGroupStatus;
    }

    /**
     * Sets the adGroupStatus value for this TacticChannelReportFilter.
     *
     * @param adGroupStatus
     */
    public void setAdGroupStatus(java.lang.String[] adGroupStatus) {
        this.adGroupStatus = adGroupStatus;
    }

    /**
     * Gets the campaignStatus value for this TacticChannelReportFilter.
     *
     * @return campaignStatus
     */
    public java.lang.String[] getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Sets the campaignStatus value for this TacticChannelReportFilter.
     *
     * @param campaignStatus
     */
    public void setCampaignStatus(java.lang.String[] campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * Gets the channelIds value for this TacticChannelReportFilter.
     *
     * @return channelIds
     */
    public long[] getChannelIds() {
        return channelIds;
    }

    /**
     * Sets the channelIds value for this TacticChannelReportFilter.
     *
     * @param channelIds
     */
    public void setChannelIds(long[] channelIds) {
        this.channelIds = channelIds;
    }

    /**
     * Gets the keywordStatus value for this TacticChannelReportFilter.
     *
     * @return keywordStatus
     */
    public java.lang.String[] getKeywordStatus() {
        return keywordStatus;
    }

    /**
     * Sets the keywordStatus value for this TacticChannelReportFilter.
     *
     * @param keywordStatus
     */
    public void setKeywordStatus(java.lang.String[] keywordStatus) {
        this.keywordStatus = keywordStatus;
    }

    /**
     * Gets the tacticIds value for this TacticChannelReportFilter.
     *
     * @return tacticIds
     */
    public long[] getTacticIds() {
        return tacticIds;
    }

    /**
     * Sets the tacticIds value for this TacticChannelReportFilter.
     *
     * @param tacticIds
     */
    public void setTacticIds(long[] tacticIds) {
        this.tacticIds = tacticIds;
    }

    /**
     * Gets the thirdPartyAdGroupIds value for this TacticChannelReportFilter.
     *
     * @return thirdPartyAdGroupIds
     */
    public long[] getThirdPartyAdGroupIds() {
        return thirdPartyAdGroupIds;
    }

    /**
     * Sets the thirdPartyAdGroupIds value for this TacticChannelReportFilter.
     *
     * @param thirdPartyAdGroupIds
     */
    public void setThirdPartyAdGroupIds(long[] thirdPartyAdGroupIds) {
        this.thirdPartyAdGroupIds = thirdPartyAdGroupIds;
    }

    /**
     * Gets the thirdPartyCampaignIds value for this TacticChannelReportFilter.
     *
     * @return thirdPartyCampaignIds
     */
    public long[] getThirdPartyCampaignIds() {
        return thirdPartyCampaignIds;
    }

    /**
     * Sets the thirdPartyCampaignIds value for this TacticChannelReportFilter.
     *
     * @param thirdPartyCampaignIds
     */
    public void setThirdPartyCampaignIds(long[] thirdPartyCampaignIds) {
        this.thirdPartyCampaignIds = thirdPartyCampaignIds;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TacticChannelReportFilter)) return false;
        TacticChannelReportFilter other = (TacticChannelReportFilter) obj;
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
                ((this.campaignStatus == null && other.getCampaignStatus() == null) ||
                        (this.campaignStatus != null &&
                                java.util.Arrays.equals(this.campaignStatus, other.getCampaignStatus()))) &&
                ((this.channelIds == null && other.getChannelIds() == null) ||
                        (this.channelIds != null &&
                                java.util.Arrays.equals(this.channelIds, other.getChannelIds()))) &&
                ((this.keywordStatus == null && other.getKeywordStatus() == null) ||
                        (this.keywordStatus != null &&
                                java.util.Arrays.equals(this.keywordStatus, other.getKeywordStatus()))) &&
                ((this.tacticIds == null && other.getTacticIds() == null) ||
                        (this.tacticIds != null &&
                                java.util.Arrays.equals(this.tacticIds, other.getTacticIds()))) &&
                ((this.thirdPartyAdGroupIds == null && other.getThirdPartyAdGroupIds() == null) ||
                        (this.thirdPartyAdGroupIds != null &&
                                java.util.Arrays.equals(this.thirdPartyAdGroupIds, other.getThirdPartyAdGroupIds()))) &&
                ((this.thirdPartyCampaignIds == null && other.getThirdPartyCampaignIds() == null) ||
                        (this.thirdPartyCampaignIds != null &&
                                java.util.Arrays.equals(this.thirdPartyCampaignIds, other.getThirdPartyCampaignIds())));
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
        if (getChannelIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannelIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannelIds(), i);
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
        if (getTacticIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacticIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacticIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThirdPartyAdGroupIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThirdPartyAdGroupIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThirdPartyAdGroupIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThirdPartyCampaignIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThirdPartyCampaignIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThirdPartyCampaignIds(), i);
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
