/**
 * PerformanceStatsDateRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class PerformanceStatsDateRange  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.Date customDateRangeEnd;

    private com.microsoft.bingads.v9.campaignmanagement.Date customDateRangeStart;

    private com.microsoft.bingads.v9.campaignmanagement.ReportTimePeriod predefinedTime;

    public PerformanceStatsDateRange() {
    }

    public PerformanceStatsDateRange(
           com.microsoft.bingads.v9.campaignmanagement.Date customDateRangeEnd,
           com.microsoft.bingads.v9.campaignmanagement.Date customDateRangeStart,
           com.microsoft.bingads.v9.campaignmanagement.ReportTimePeriod predefinedTime) {
           this.customDateRangeEnd = customDateRangeEnd;
           this.customDateRangeStart = customDateRangeStart;
           this.predefinedTime = predefinedTime;
    }


    /**
     * Gets the customDateRangeEnd value for this PerformanceStatsDateRange.
     * 
     * @return customDateRangeEnd
     */
    public com.microsoft.bingads.v9.campaignmanagement.Date getCustomDateRangeEnd() {
        return customDateRangeEnd;
    }


    /**
     * Sets the customDateRangeEnd value for this PerformanceStatsDateRange.
     * 
     * @param customDateRangeEnd
     */
    public void setCustomDateRangeEnd(com.microsoft.bingads.v9.campaignmanagement.Date customDateRangeEnd) {
        this.customDateRangeEnd = customDateRangeEnd;
    }


    /**
     * Gets the customDateRangeStart value for this PerformanceStatsDateRange.
     * 
     * @return customDateRangeStart
     */
    public com.microsoft.bingads.v9.campaignmanagement.Date getCustomDateRangeStart() {
        return customDateRangeStart;
    }


    /**
     * Sets the customDateRangeStart value for this PerformanceStatsDateRange.
     * 
     * @param customDateRangeStart
     */
    public void setCustomDateRangeStart(com.microsoft.bingads.v9.campaignmanagement.Date customDateRangeStart) {
        this.customDateRangeStart = customDateRangeStart;
    }


    /**
     * Gets the predefinedTime value for this PerformanceStatsDateRange.
     * 
     * @return predefinedTime
     */
    public com.microsoft.bingads.v9.campaignmanagement.ReportTimePeriod getPredefinedTime() {
        return predefinedTime;
    }


    /**
     * Sets the predefinedTime value for this PerformanceStatsDateRange.
     * 
     * @param predefinedTime
     */
    public void setPredefinedTime(com.microsoft.bingads.v9.campaignmanagement.ReportTimePeriod predefinedTime) {
        this.predefinedTime = predefinedTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformanceStatsDateRange)) return false;
        PerformanceStatsDateRange other = (PerformanceStatsDateRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customDateRangeEnd==null && other.getCustomDateRangeEnd()==null) || 
             (this.customDateRangeEnd!=null &&
              this.customDateRangeEnd.equals(other.getCustomDateRangeEnd()))) &&
            ((this.customDateRangeStart==null && other.getCustomDateRangeStart()==null) || 
             (this.customDateRangeStart!=null &&
              this.customDateRangeStart.equals(other.getCustomDateRangeStart()))) &&
            ((this.predefinedTime==null && other.getPredefinedTime()==null) || 
             (this.predefinedTime!=null &&
              this.predefinedTime.equals(other.getPredefinedTime())));
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
        if (getCustomDateRangeEnd() != null) {
            _hashCode += getCustomDateRangeEnd().hashCode();
        }
        if (getCustomDateRangeStart() != null) {
            _hashCode += getCustomDateRangeStart().hashCode();
        }
        if (getPredefinedTime() != null) {
            _hashCode += getPredefinedTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformanceStatsDateRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PerformanceStatsDateRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDateRangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CustomDateRangeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDateRangeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CustomDateRangeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predefinedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PredefinedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ReportTimePeriod"));
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
