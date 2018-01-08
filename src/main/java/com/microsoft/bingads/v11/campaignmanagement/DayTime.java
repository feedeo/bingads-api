/**
 * DayTime.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DayTime implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DayTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DayTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Day"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EndHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EndMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Minute"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StartHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StartMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Minute"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.Day day;
    private int endHour;
    private com.microsoft.bingads.v11.campaignmanagement.Minute endMinute;
    private int startHour;
    private com.microsoft.bingads.v11.campaignmanagement.Minute startMinute;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DayTime() {
    }


    public DayTime(
            com.microsoft.bingads.v11.campaignmanagement.Day day,
            int endHour,
            com.microsoft.bingads.v11.campaignmanagement.Minute endMinute,
            int startHour,
            com.microsoft.bingads.v11.campaignmanagement.Minute startMinute) {
        this.day = day;
        this.endHour = endHour;
        this.endMinute = endMinute;
        this.startHour = startHour;
        this.startMinute = startMinute;
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
     * Gets the day value for this DayTime.
     *
     * @return day
     */
    public com.microsoft.bingads.v11.campaignmanagement.Day getDay() {
        return day;
    }

    /**
     * Sets the day value for this DayTime.
     *
     * @param day
     */
    public void setDay(com.microsoft.bingads.v11.campaignmanagement.Day day) {
        this.day = day;
    }

    /**
     * Gets the endHour value for this DayTime.
     *
     * @return endHour
     */
    public int getEndHour() {
        return endHour;
    }

    /**
     * Sets the endHour value for this DayTime.
     *
     * @param endHour
     */
    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    /**
     * Gets the endMinute value for this DayTime.
     *
     * @return endMinute
     */
    public com.microsoft.bingads.v11.campaignmanagement.Minute getEndMinute() {
        return endMinute;
    }

    /**
     * Sets the endMinute value for this DayTime.
     *
     * @param endMinute
     */
    public void setEndMinute(com.microsoft.bingads.v11.campaignmanagement.Minute endMinute) {
        this.endMinute = endMinute;
    }

    /**
     * Gets the startHour value for this DayTime.
     *
     * @return startHour
     */
    public int getStartHour() {
        return startHour;
    }

    /**
     * Sets the startHour value for this DayTime.
     *
     * @param startHour
     */
    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    /**
     * Gets the startMinute value for this DayTime.
     *
     * @return startMinute
     */
    public com.microsoft.bingads.v11.campaignmanagement.Minute getStartMinute() {
        return startMinute;
    }

    /**
     * Sets the startMinute value for this DayTime.
     *
     * @param startMinute
     */
    public void setStartMinute(com.microsoft.bingads.v11.campaignmanagement.Minute startMinute) {
        this.startMinute = startMinute;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DayTime)) return false;
        DayTime other = (DayTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.day == null && other.getDay() == null) ||
                        (this.day != null &&
                                this.day.equals(other.getDay()))) &&
                this.endHour == other.getEndHour() &&
                ((this.endMinute == null && other.getEndMinute() == null) ||
                        (this.endMinute != null &&
                                this.endMinute.equals(other.getEndMinute()))) &&
                this.startHour == other.getStartHour() &&
                ((this.startMinute == null && other.getStartMinute() == null) ||
                        (this.startMinute != null &&
                                this.startMinute.equals(other.getStartMinute())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        _hashCode += getEndHour();
        if (getEndMinute() != null) {
            _hashCode += getEndMinute().hashCode();
        }
        _hashCode += getStartHour();
        if (getStartMinute() != null) {
            _hashCode += getStartMinute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
