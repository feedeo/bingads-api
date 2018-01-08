/**
 * DayTimeCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DayTimeCriterion extends com.microsoft.bingads.v11.campaignmanagement.Criterion implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DayTimeCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DayTimeCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Day"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FromHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FromMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Minute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ToHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ToMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Minute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.Day day;
    private java.lang.Integer fromHour;
    private com.microsoft.bingads.v11.campaignmanagement.Minute fromMinute;
    private java.lang.Integer toHour;
    private com.microsoft.bingads.v11.campaignmanagement.Minute toMinute;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DayTimeCriterion() {
    }


    public DayTimeCriterion(
            java.lang.String type,
            com.microsoft.bingads.v11.campaignmanagement.Day day,
            java.lang.Integer fromHour,
            com.microsoft.bingads.v11.campaignmanagement.Minute fromMinute,
            java.lang.Integer toHour,
            com.microsoft.bingads.v11.campaignmanagement.Minute toMinute) {
        super(
                type);
        this.day = day;
        this.fromHour = fromHour;
        this.fromMinute = fromMinute;
        this.toHour = toHour;
        this.toMinute = toMinute;
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
     * Gets the day value for this DayTimeCriterion.
     *
     * @return day
     */
    public com.microsoft.bingads.v11.campaignmanagement.Day getDay() {
        return day;
    }

    /**
     * Sets the day value for this DayTimeCriterion.
     *
     * @param day
     */
    public void setDay(com.microsoft.bingads.v11.campaignmanagement.Day day) {
        this.day = day;
    }

    /**
     * Gets the fromHour value for this DayTimeCriterion.
     *
     * @return fromHour
     */
    public java.lang.Integer getFromHour() {
        return fromHour;
    }

    /**
     * Sets the fromHour value for this DayTimeCriterion.
     *
     * @param fromHour
     */
    public void setFromHour(java.lang.Integer fromHour) {
        this.fromHour = fromHour;
    }

    /**
     * Gets the fromMinute value for this DayTimeCriterion.
     *
     * @return fromMinute
     */
    public com.microsoft.bingads.v11.campaignmanagement.Minute getFromMinute() {
        return fromMinute;
    }

    /**
     * Sets the fromMinute value for this DayTimeCriterion.
     *
     * @param fromMinute
     */
    public void setFromMinute(com.microsoft.bingads.v11.campaignmanagement.Minute fromMinute) {
        this.fromMinute = fromMinute;
    }

    /**
     * Gets the toHour value for this DayTimeCriterion.
     *
     * @return toHour
     */
    public java.lang.Integer getToHour() {
        return toHour;
    }

    /**
     * Sets the toHour value for this DayTimeCriterion.
     *
     * @param toHour
     */
    public void setToHour(java.lang.Integer toHour) {
        this.toHour = toHour;
    }

    /**
     * Gets the toMinute value for this DayTimeCriterion.
     *
     * @return toMinute
     */
    public com.microsoft.bingads.v11.campaignmanagement.Minute getToMinute() {
        return toMinute;
    }

    /**
     * Sets the toMinute value for this DayTimeCriterion.
     *
     * @param toMinute
     */
    public void setToMinute(com.microsoft.bingads.v11.campaignmanagement.Minute toMinute) {
        this.toMinute = toMinute;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DayTimeCriterion)) return false;
        DayTimeCriterion other = (DayTimeCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.day == null && other.getDay() == null) ||
                        (this.day != null &&
                                this.day.equals(other.getDay()))) &&
                ((this.fromHour == null && other.getFromHour() == null) ||
                        (this.fromHour != null &&
                                this.fromHour.equals(other.getFromHour()))) &&
                ((this.fromMinute == null && other.getFromMinute() == null) ||
                        (this.fromMinute != null &&
                                this.fromMinute.equals(other.getFromMinute()))) &&
                ((this.toHour == null && other.getToHour() == null) ||
                        (this.toHour != null &&
                                this.toHour.equals(other.getToHour()))) &&
                ((this.toMinute == null && other.getToMinute() == null) ||
                        (this.toMinute != null &&
                                this.toMinute.equals(other.getToMinute())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getFromHour() != null) {
            _hashCode += getFromHour().hashCode();
        }
        if (getFromMinute() != null) {
            _hashCode += getFromMinute().hashCode();
        }
        if (getToHour() != null) {
            _hashCode += getToHour().hashCode();
        }
        if (getToMinute() != null) {
            _hashCode += getToMinute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
