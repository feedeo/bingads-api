/**
 * PagesViewedPerVisitGoal.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class PagesViewedPerVisitGoal extends com.microsoft.bingads.v11.campaignmanagement.ConversionGoal implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PagesViewedPerVisitGoal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PagesViewedPerVisitGoal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumPagesViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MinimumPagesViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Integer minimumPagesViewed;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public PagesViewedPerVisitGoal() {
    }

    public PagesViewedPerVisitGoal(
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
            java.lang.Integer minimumPagesViewed) {
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
        this.minimumPagesViewed = minimumPagesViewed;
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
     * Gets the minimumPagesViewed value for this PagesViewedPerVisitGoal.
     *
     * @return minimumPagesViewed
     */
    public java.lang.Integer getMinimumPagesViewed() {
        return minimumPagesViewed;
    }

    /**
     * Sets the minimumPagesViewed value for this PagesViewedPerVisitGoal.
     *
     * @param minimumPagesViewed
     */
    public void setMinimumPagesViewed(java.lang.Integer minimumPagesViewed) {
        this.minimumPagesViewed = minimumPagesViewed;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagesViewedPerVisitGoal)) return false;
        PagesViewedPerVisitGoal other = (PagesViewedPerVisitGoal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.minimumPagesViewed == null && other.getMinimumPagesViewed() == null) ||
                        (this.minimumPagesViewed != null &&
                                this.minimumPagesViewed.equals(other.getMinimumPagesViewed())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMinimumPagesViewed() != null) {
            _hashCode += getMinimumPagesViewed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
