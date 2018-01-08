/**
 * DownloadCampaignsByAccountIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DownloadCampaignsByAccountIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DownloadCampaignsByAccountIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DownloadCampaignsByAccountIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CompressionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CompressionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DataScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DataScope"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadEntities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DownloadEntities"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DownloadEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DownloadEntity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadFileType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DownloadFileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DownloadFileType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FormatVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSyncTimeInUTC");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LastSyncTimeInUTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performanceStatsDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PerformanceStatsDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PerformanceStatsDateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private long[] accountIds;
    private com.microsoft.bingads.v11.campaignmanagement.CompressionType compressionType;
    private java.lang.String[] dataScope;
    private com.microsoft.bingads.v11.campaignmanagement.DownloadEntity[] downloadEntities;
    private com.microsoft.bingads.v11.campaignmanagement.DownloadFileType downloadFileType;
    private java.lang.String formatVersion;
    private java.util.Calendar lastSyncTimeInUTC;
    private com.microsoft.bingads.v11.campaignmanagement.PerformanceStatsDateRange performanceStatsDateRange;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DownloadCampaignsByAccountIdsRequest() {
    }


    public DownloadCampaignsByAccountIdsRequest(
            long[] accountIds,
            com.microsoft.bingads.v11.campaignmanagement.CompressionType compressionType,
            java.lang.String[] dataScope,
            com.microsoft.bingads.v11.campaignmanagement.DownloadEntity[] downloadEntities,
            com.microsoft.bingads.v11.campaignmanagement.DownloadFileType downloadFileType,
            java.lang.String formatVersion,
            java.util.Calendar lastSyncTimeInUTC,
            com.microsoft.bingads.v11.campaignmanagement.PerformanceStatsDateRange performanceStatsDateRange) {
        this.accountIds = accountIds;
        this.compressionType = compressionType;
        this.dataScope = dataScope;
        this.downloadEntities = downloadEntities;
        this.downloadFileType = downloadFileType;
        this.formatVersion = formatVersion;
        this.lastSyncTimeInUTC = lastSyncTimeInUTC;
        this.performanceStatsDateRange = performanceStatsDateRange;
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
     * Gets the accountIds value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @return accountIds
     */
    public long[] getAccountIds() {
        return accountIds;
    }

    /**
     * Sets the accountIds value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @param accountIds
     */
    public void setAccountIds(long[] accountIds) {
        this.accountIds = accountIds;
    }

    /**
     * Gets the compressionType value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @return compressionType
     */
    public com.microsoft.bingads.v11.campaignmanagement.CompressionType getCompressionType() {
        return compressionType;
    }

    /**
     * Sets the compressionType value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @param compressionType
     */
    public void setCompressionType(com.microsoft.bingads.v11.campaignmanagement.CompressionType compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * Gets the dataScope value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @return dataScope
     */
    public java.lang.String[] getDataScope() {
        return dataScope;
    }

    /**
     * Sets the dataScope value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @param dataScope
     */
    public void setDataScope(java.lang.String[] dataScope) {
        this.dataScope = dataScope;
    }

    /**
     * Gets the downloadEntities value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @return downloadEntities
     */
    public com.microsoft.bingads.v11.campaignmanagement.DownloadEntity[] getDownloadEntities() {
        return downloadEntities;
    }

    /**
     * Sets the downloadEntities value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @param downloadEntities
     */
    public void setDownloadEntities(com.microsoft.bingads.v11.campaignmanagement.DownloadEntity[] downloadEntities) {
        this.downloadEntities = downloadEntities;
    }

    /**
     * Gets the downloadFileType value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @return downloadFileType
     */
    public com.microsoft.bingads.v11.campaignmanagement.DownloadFileType getDownloadFileType() {
        return downloadFileType;
    }

    /**
     * Sets the downloadFileType value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @param downloadFileType
     */
    public void setDownloadFileType(com.microsoft.bingads.v11.campaignmanagement.DownloadFileType downloadFileType) {
        this.downloadFileType = downloadFileType;
    }

    /**
     * Gets the formatVersion value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @return formatVersion
     */
    public java.lang.String getFormatVersion() {
        return formatVersion;
    }

    /**
     * Sets the formatVersion value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @param formatVersion
     */
    public void setFormatVersion(java.lang.String formatVersion) {
        this.formatVersion = formatVersion;
    }

    /**
     * Gets the lastSyncTimeInUTC value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @return lastSyncTimeInUTC
     */
    public java.util.Calendar getLastSyncTimeInUTC() {
        return lastSyncTimeInUTC;
    }

    /**
     * Sets the lastSyncTimeInUTC value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @param lastSyncTimeInUTC
     */
    public void setLastSyncTimeInUTC(java.util.Calendar lastSyncTimeInUTC) {
        this.lastSyncTimeInUTC = lastSyncTimeInUTC;
    }

    /**
     * Gets the performanceStatsDateRange value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @return performanceStatsDateRange
     */
    public com.microsoft.bingads.v11.campaignmanagement.PerformanceStatsDateRange getPerformanceStatsDateRange() {
        return performanceStatsDateRange;
    }

    /**
     * Sets the performanceStatsDateRange value for this DownloadCampaignsByAccountIdsRequest.
     *
     * @param performanceStatsDateRange
     */
    public void setPerformanceStatsDateRange(com.microsoft.bingads.v11.campaignmanagement.PerformanceStatsDateRange performanceStatsDateRange) {
        this.performanceStatsDateRange = performanceStatsDateRange;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DownloadCampaignsByAccountIdsRequest)) return false;
        DownloadCampaignsByAccountIdsRequest other = (DownloadCampaignsByAccountIdsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accountIds == null && other.getAccountIds() == null) ||
                        (this.accountIds != null &&
                                java.util.Arrays.equals(this.accountIds, other.getAccountIds()))) &&
                ((this.compressionType == null && other.getCompressionType() == null) ||
                        (this.compressionType != null &&
                                this.compressionType.equals(other.getCompressionType()))) &&
                ((this.dataScope == null && other.getDataScope() == null) ||
                        (this.dataScope != null &&
                                java.util.Arrays.equals(this.dataScope, other.getDataScope()))) &&
                ((this.downloadEntities == null && other.getDownloadEntities() == null) ||
                        (this.downloadEntities != null &&
                                java.util.Arrays.equals(this.downloadEntities, other.getDownloadEntities()))) &&
                ((this.downloadFileType == null && other.getDownloadFileType() == null) ||
                        (this.downloadFileType != null &&
                                this.downloadFileType.equals(other.getDownloadFileType()))) &&
                ((this.formatVersion == null && other.getFormatVersion() == null) ||
                        (this.formatVersion != null &&
                                this.formatVersion.equals(other.getFormatVersion()))) &&
                ((this.lastSyncTimeInUTC == null && other.getLastSyncTimeInUTC() == null) ||
                        (this.lastSyncTimeInUTC != null &&
                                this.lastSyncTimeInUTC.equals(other.getLastSyncTimeInUTC()))) &&
                ((this.performanceStatsDateRange == null && other.getPerformanceStatsDateRange() == null) ||
                        (this.performanceStatsDateRange != null &&
                                this.performanceStatsDateRange.equals(other.getPerformanceStatsDateRange())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAccountIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompressionType() != null) {
            _hashCode += getCompressionType().hashCode();
        }
        if (getDataScope() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDataScope());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataScope(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDownloadEntities() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDownloadEntities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDownloadEntities(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDownloadFileType() != null) {
            _hashCode += getDownloadFileType().hashCode();
        }
        if (getFormatVersion() != null) {
            _hashCode += getFormatVersion().hashCode();
        }
        if (getLastSyncTimeInUTC() != null) {
            _hashCode += getLastSyncTimeInUTC().hashCode();
        }
        if (getPerformanceStatsDateRange() != null) {
            _hashCode += getPerformanceStatsDateRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
