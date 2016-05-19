/**
 * DownloadCampaignsByCampaignIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class DownloadCampaignsByCampaignIdsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(DownloadCampaignsByCampaignIdsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DownloadCampaignsByCampaignIdsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaigns");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Campaigns"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignScope"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignScope"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("compressionType");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CompressionType"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CompressionType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("dataScope");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DataScope"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DataScope"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("downloadFileType");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DownloadFileType"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DownloadFileType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("entities");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Entities"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "BulkDownloadEntity"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("formatVersion");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "FormatVersion"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("lastSyncTimeInUTC");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "LastSyncTimeInUTC"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("performanceStatsDateRange");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PerformanceStatsDateRange"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PerformanceStatsDateRange"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.CampaignScope[] campaigns;
  private com.microsoft.bingads.v10.campaignmanagement.CompressionType compressionType;
  private java.lang.String[] dataScope;
  private com.microsoft.bingads.v10.campaignmanagement.DownloadFileType downloadFileType;
  private java.lang.String[] entities;
  private java.lang.String formatVersion;
  private java.util.Calendar lastSyncTimeInUTC;
  private com.microsoft.bingads.v10.campaignmanagement.PerformanceStatsDateRange performanceStatsDateRange;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public DownloadCampaignsByCampaignIdsRequest() {
  }

  public DownloadCampaignsByCampaignIdsRequest(
          com.microsoft.bingads.v10.campaignmanagement.CampaignScope[] campaigns,
          com.microsoft.bingads.v10.campaignmanagement.CompressionType compressionType,
          java.lang.String[] dataScope,
          com.microsoft.bingads.v10.campaignmanagement.DownloadFileType downloadFileType,
          java.lang.String[] entities,
          java.lang.String formatVersion,
          java.util.Calendar lastSyncTimeInUTC,
          com.microsoft.bingads.v10.campaignmanagement.PerformanceStatsDateRange performanceStatsDateRange) {
    this.campaigns = campaigns;
    this.compressionType = compressionType;
    this.dataScope = dataScope;
    this.downloadFileType = downloadFileType;
    this.entities = entities;
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
   * Gets the campaigns value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @return campaigns
   */
  public com.microsoft.bingads.v10.campaignmanagement.CampaignScope[] getCampaigns() {
    return campaigns;
  }

  /**
   * Sets the campaigns value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @param campaigns
   */
  public void setCampaigns(com.microsoft.bingads.v10.campaignmanagement.CampaignScope[] campaigns) {
    this.campaigns = campaigns;
  }

  /**
   * Gets the compressionType value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @return compressionType
   */
  public com.microsoft.bingads.v10.campaignmanagement.CompressionType getCompressionType() {
    return compressionType;
  }

  /**
   * Sets the compressionType value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @param compressionType
   */
  public void setCompressionType(com.microsoft.bingads.v10.campaignmanagement.CompressionType compressionType) {
    this.compressionType = compressionType;
  }

  /**
   * Gets the dataScope value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @return dataScope
   */
  public java.lang.String[] getDataScope() {
    return dataScope;
  }

  /**
   * Sets the dataScope value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @param dataScope
   */
  public void setDataScope(java.lang.String[] dataScope) {
    this.dataScope = dataScope;
  }

  /**
   * Gets the downloadFileType value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @return downloadFileType
   */
  public com.microsoft.bingads.v10.campaignmanagement.DownloadFileType getDownloadFileType() {
    return downloadFileType;
  }

  /**
   * Sets the downloadFileType value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @param downloadFileType
   */
  public void setDownloadFileType(com.microsoft.bingads.v10.campaignmanagement.DownloadFileType downloadFileType) {
    this.downloadFileType = downloadFileType;
  }

  /**
   * Gets the entities value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @return entities
   */
  public java.lang.String[] getEntities() {
    return entities;
  }

  /**
   * Sets the entities value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @param entities
   */
  public void setEntities(java.lang.String[] entities) {
    this.entities = entities;
  }

  /**
   * Gets the formatVersion value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @return formatVersion
   */
  public java.lang.String getFormatVersion() {
    return formatVersion;
  }

  /**
   * Sets the formatVersion value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @param formatVersion
   */
  public void setFormatVersion(java.lang.String formatVersion) {
    this.formatVersion = formatVersion;
  }

  /**
   * Gets the lastSyncTimeInUTC value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @return lastSyncTimeInUTC
   */
  public java.util.Calendar getLastSyncTimeInUTC() {
    return lastSyncTimeInUTC;
  }

  /**
   * Sets the lastSyncTimeInUTC value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @param lastSyncTimeInUTC
   */
  public void setLastSyncTimeInUTC(java.util.Calendar lastSyncTimeInUTC) {
    this.lastSyncTimeInUTC = lastSyncTimeInUTC;
  }

  /**
   * Gets the performanceStatsDateRange value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @return performanceStatsDateRange
   */
  public com.microsoft.bingads.v10.campaignmanagement.PerformanceStatsDateRange getPerformanceStatsDateRange() {
    return performanceStatsDateRange;
  }

  /**
   * Sets the performanceStatsDateRange value for this DownloadCampaignsByCampaignIdsRequest.
   *
   * @param performanceStatsDateRange
   */
  public void setPerformanceStatsDateRange(com.microsoft.bingads.v10.campaignmanagement.PerformanceStatsDateRange performanceStatsDateRange) {
    this.performanceStatsDateRange = performanceStatsDateRange;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof DownloadCampaignsByCampaignIdsRequest)) return false;
    DownloadCampaignsByCampaignIdsRequest other = (DownloadCampaignsByCampaignIdsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.campaigns == null && other.getCampaigns() == null) ||
                    (this.campaigns != null &&
                            java.util.Arrays.equals(this.campaigns, other.getCampaigns()))) &&
            ((this.compressionType == null && other.getCompressionType() == null) ||
                    (this.compressionType != null &&
                            this.compressionType.equals(other.getCompressionType()))) &&
            ((this.dataScope == null && other.getDataScope() == null) ||
                    (this.dataScope != null &&
                            java.util.Arrays.equals(this.dataScope, other.getDataScope()))) &&
            ((this.downloadFileType == null && other.getDownloadFileType() == null) ||
                    (this.downloadFileType != null &&
                            this.downloadFileType.equals(other.getDownloadFileType()))) &&
            ((this.entities == null && other.getEntities() == null) ||
                    (this.entities != null &&
                            java.util.Arrays.equals(this.entities, other.getEntities()))) &&
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
    if (getCampaigns() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getCampaigns());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getCampaigns(), i);
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
    if (getDownloadFileType() != null) {
      _hashCode += getDownloadFileType().hashCode();
    }
    if (getEntities() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getEntities());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getEntities(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
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
