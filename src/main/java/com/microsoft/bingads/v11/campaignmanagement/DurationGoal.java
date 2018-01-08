/**
 * DurationGoal.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DurationGoal extends com.microsoft.bingads.v11.campaignmanagement.ConversionGoal implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DurationGoal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DurationGoal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumDurationInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MinimumDurationInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Integer minimumDurationInSeconds;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public DurationGoal() {
    }

    public DurationGoal(
            java.lang.Integer conversionWindowInMinutes,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalCountType countType,
            java.lang.Long id,
            java.lang.String name,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenue revenue,
            com.microsoft.bingads.v11.campaignmanagement.EntityScope scope,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalStatus status,
            java.lang.Long tagId,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalTrackingStatus trackingStatus,
            java.lang.String[] type,
            java.lang.Integer minimumDurationInSeconds) {
        super(
                conversionWindowInMinutes,
                countType,
                id,
                name,
                revenue,
                scope,
                status,
                tagId,
                trackingStatus,
                type);
        this.minimumDurationInSeconds = minimumDurationInSeconds;
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
     * Gets the minimumDurationInSeconds value for this DurationGoal.
     *
     * @return minimumDurationInSeconds
     */
    public java.lang.Integer getMinimumDurationInSeconds() {
        return minimumDurationInSeconds;
    }

    /**
     * Sets the minimumDurationInSeconds value for this DurationGoal.
     *
     * @param minimumDurationInSeconds
     */
    public void setMinimumDurationInSeconds(java.lang.Integer minimumDurationInSeconds) {
        this.minimumDurationInSeconds = minimumDurationInSeconds;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DurationGoal)) return false;
        DurationGoal other = (DurationGoal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.minimumDurationInSeconds == null && other.getMinimumDurationInSeconds() == null) ||
                        (this.minimumDurationInSeconds != null &&
                                this.minimumDurationInSeconds.equals(other.getMinimumDurationInSeconds())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMinimumDurationInSeconds() != null) {
            _hashCode += getMinimumDurationInSeconds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
