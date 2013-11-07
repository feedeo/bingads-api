/**
 * DownloadCampaignsByAccountIdsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class DownloadCampaignsByAccountIdsRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong accountIds;

    private java.lang.String[] dataScope;

    private com.microsoft.bingads.v9.campaignmanagement.DownloadFileType downloadFileType;

    private java.lang.String[] entities;

    private java.util.Calendar lastSyncTimeInUTC;

    private java.lang.String locationTargetVersion;

    private com.microsoft.bingads.v9.campaignmanagement.PerformanceStatsDateRange performanceStatsDateRange;

    public DownloadCampaignsByAccountIdsRequest() {
    }

    public DownloadCampaignsByAccountIdsRequest(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong accountIds,
           java.lang.String[] dataScope,
           com.microsoft.bingads.v9.campaignmanagement.DownloadFileType downloadFileType,
           java.lang.String[] entities,
           java.util.Calendar lastSyncTimeInUTC,
           java.lang.String locationTargetVersion,
           com.microsoft.bingads.v9.campaignmanagement.PerformanceStatsDateRange performanceStatsDateRange) {
           this.accountIds = accountIds;
           this.dataScope = dataScope;
           this.downloadFileType = downloadFileType;
           this.entities = entities;
           this.lastSyncTimeInUTC = lastSyncTimeInUTC;
           this.locationTargetVersion = locationTargetVersion;
           this.performanceStatsDateRange = performanceStatsDateRange;
    }


    /**
     * Gets the accountIds value for this DownloadCampaignsByAccountIdsRequest.
     * 
     * @return accountIds
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getAccountIds() {
        return accountIds;
    }


    /**
     * Sets the accountIds value for this DownloadCampaignsByAccountIdsRequest.
     * 
     * @param accountIds
     */
    public void setAccountIds(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong accountIds) {
        this.accountIds = accountIds;
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
     * Gets the downloadFileType value for this DownloadCampaignsByAccountIdsRequest.
     * 
     * @return downloadFileType
     */
    public com.microsoft.bingads.v9.campaignmanagement.DownloadFileType getDownloadFileType() {
        return downloadFileType;
    }


    /**
     * Sets the downloadFileType value for this DownloadCampaignsByAccountIdsRequest.
     * 
     * @param downloadFileType
     */
    public void setDownloadFileType(com.microsoft.bingads.v9.campaignmanagement.DownloadFileType downloadFileType) {
        this.downloadFileType = downloadFileType;
    }


    /**
     * Gets the entities value for this DownloadCampaignsByAccountIdsRequest.
     * 
     * @return entities
     */
    public java.lang.String[] getEntities() {
        return entities;
    }


    /**
     * Sets the entities value for this DownloadCampaignsByAccountIdsRequest.
     * 
     * @param entities
     */
    public void setEntities(java.lang.String[] entities) {
        this.entities = entities;
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
     * Gets the locationTargetVersion value for this DownloadCampaignsByAccountIdsRequest.
     * 
     * @return locationTargetVersion
     */
    public java.lang.String getLocationTargetVersion() {
        return locationTargetVersion;
    }


    /**
     * Sets the locationTargetVersion value for this DownloadCampaignsByAccountIdsRequest.
     * 
     * @param locationTargetVersion
     */
    public void setLocationTargetVersion(java.lang.String locationTargetVersion) {
        this.locationTargetVersion = locationTargetVersion;
    }


    /**
     * Gets the performanceStatsDateRange value for this DownloadCampaignsByAccountIdsRequest.
     * 
     * @return performanceStatsDateRange
     */
    public com.microsoft.bingads.v9.campaignmanagement.PerformanceStatsDateRange getPerformanceStatsDateRange() {
        return performanceStatsDateRange;
    }


    /**
     * Sets the performanceStatsDateRange value for this DownloadCampaignsByAccountIdsRequest.
     * 
     * @param performanceStatsDateRange
     */
    public void setPerformanceStatsDateRange(com.microsoft.bingads.v9.campaignmanagement.PerformanceStatsDateRange performanceStatsDateRange) {
        this.performanceStatsDateRange = performanceStatsDateRange;
    }

    private java.lang.Object __equalsCalc = null;
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
            ((this.accountIds==null && other.getAccountIds()==null) || 
             (this.accountIds!=null &&
              this.accountIds.equals(other.getAccountIds()))) &&
            ((this.dataScope==null && other.getDataScope()==null) || 
             (this.dataScope!=null &&
              java.util.Arrays.equals(this.dataScope, other.getDataScope()))) &&
            ((this.downloadFileType==null && other.getDownloadFileType()==null) || 
             (this.downloadFileType!=null &&
              this.downloadFileType.equals(other.getDownloadFileType()))) &&
            ((this.entities==null && other.getEntities()==null) || 
             (this.entities!=null &&
              java.util.Arrays.equals(this.entities, other.getEntities()))) &&
            ((this.lastSyncTimeInUTC==null && other.getLastSyncTimeInUTC()==null) || 
             (this.lastSyncTimeInUTC!=null &&
              this.lastSyncTimeInUTC.equals(other.getLastSyncTimeInUTC()))) &&
            ((this.locationTargetVersion==null && other.getLocationTargetVersion()==null) || 
             (this.locationTargetVersion!=null &&
              this.locationTargetVersion.equals(other.getLocationTargetVersion()))) &&
            ((this.performanceStatsDateRange==null && other.getPerformanceStatsDateRange()==null) || 
             (this.performanceStatsDateRange!=null &&
              this.performanceStatsDateRange.equals(other.getPerformanceStatsDateRange())));
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
        if (getAccountIds() != null) {
            _hashCode += getAccountIds().hashCode();
        }
        if (getDataScope() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataScope());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataScope(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDownloadFileType() != null) {
            _hashCode += getDownloadFileType().hashCode();
        }
        if (getEntities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastSyncTimeInUTC() != null) {
            _hashCode += getLastSyncTimeInUTC().hashCode();
        }
        if (getLocationTargetVersion() != null) {
            _hashCode += getLocationTargetVersion().hashCode();
        }
        if (getPerformanceStatsDateRange() != null) {
            _hashCode += getPerformanceStatsDateRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DownloadCampaignsByAccountIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DownloadCampaignsByAccountIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AccountIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DataScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DataScope"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadFileType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DownloadFileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DownloadFileType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Entities"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BulkDownloadEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSyncTimeInUTC");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "LastSyncTimeInUTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationTargetVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "LocationTargetVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performanceStatsDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PerformanceStatsDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PerformanceStatsDateRange"));
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
