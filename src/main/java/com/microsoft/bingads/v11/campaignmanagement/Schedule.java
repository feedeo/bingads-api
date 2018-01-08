/**
 * Schedule.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class Schedule implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Schedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Schedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayTimeRanges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DayTimeRanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DayTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DayTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSearcherTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UseSearcherTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.DayTime[] dayTimeRanges;
    private com.microsoft.bingads.v11.campaignmanagement.Date endDate;
    private com.microsoft.bingads.v11.campaignmanagement.Date startDate;
    private java.lang.Boolean useSearcherTimeZone;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public Schedule() {
    }


    public Schedule(
            com.microsoft.bingads.v11.campaignmanagement.DayTime[] dayTimeRanges,
            com.microsoft.bingads.v11.campaignmanagement.Date endDate,
            com.microsoft.bingads.v11.campaignmanagement.Date startDate,
            java.lang.Boolean useSearcherTimeZone) {
        this.dayTimeRanges = dayTimeRanges;
        this.endDate = endDate;
        this.startDate = startDate;
        this.useSearcherTimeZone = useSearcherTimeZone;
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
     * Gets the dayTimeRanges value for this Schedule.
     *
     * @return dayTimeRanges
     */
    public com.microsoft.bingads.v11.campaignmanagement.DayTime[] getDayTimeRanges() {
        return dayTimeRanges;
    }

    /**
     * Sets the dayTimeRanges value for this Schedule.
     *
     * @param dayTimeRanges
     */
    public void setDayTimeRanges(com.microsoft.bingads.v11.campaignmanagement.DayTime[] dayTimeRanges) {
        this.dayTimeRanges = dayTimeRanges;
    }

    /**
     * Gets the endDate value for this Schedule.
     *
     * @return endDate
     */
    public com.microsoft.bingads.v11.campaignmanagement.Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the endDate value for this Schedule.
     *
     * @param endDate
     */
    public void setEndDate(com.microsoft.bingads.v11.campaignmanagement.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Gets the startDate value for this Schedule.
     *
     * @return startDate
     */
    public com.microsoft.bingads.v11.campaignmanagement.Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the startDate value for this Schedule.
     *
     * @param startDate
     */
    public void setStartDate(com.microsoft.bingads.v11.campaignmanagement.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets the useSearcherTimeZone value for this Schedule.
     *
     * @return useSearcherTimeZone
     */
    public java.lang.Boolean getUseSearcherTimeZone() {
        return useSearcherTimeZone;
    }

    /**
     * Sets the useSearcherTimeZone value for this Schedule.
     *
     * @param useSearcherTimeZone
     */
    public void setUseSearcherTimeZone(java.lang.Boolean useSearcherTimeZone) {
        this.useSearcherTimeZone = useSearcherTimeZone;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Schedule)) return false;
        Schedule other = (Schedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.dayTimeRanges == null && other.getDayTimeRanges() == null) ||
                        (this.dayTimeRanges != null &&
                                java.util.Arrays.equals(this.dayTimeRanges, other.getDayTimeRanges()))) &&
                ((this.endDate == null && other.getEndDate() == null) ||
                        (this.endDate != null &&
                                this.endDate.equals(other.getEndDate()))) &&
                ((this.startDate == null && other.getStartDate() == null) ||
                        (this.startDate != null &&
                                this.startDate.equals(other.getStartDate()))) &&
                ((this.useSearcherTimeZone == null && other.getUseSearcherTimeZone() == null) ||
                        (this.useSearcherTimeZone != null &&
                                this.useSearcherTimeZone.equals(other.getUseSearcherTimeZone())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDayTimeRanges() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDayTimeRanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDayTimeRanges(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getUseSearcherTimeZone() != null) {
            _hashCode += getUseSearcherTimeZone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
