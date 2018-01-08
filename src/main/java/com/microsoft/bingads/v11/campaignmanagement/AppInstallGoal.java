/**
 * AppInstallGoal.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AppInstallGoal extends com.microsoft.bingads.v11.campaignmanagement.ConversionGoal implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AppInstallGoal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AppInstallGoal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appPlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AppPlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appStoreId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AppStoreId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String appPlatform;
    private java.lang.String appStoreId;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AppInstallGoal() {
    }


    public AppInstallGoal(
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
            java.lang.String appPlatform,
            java.lang.String appStoreId) {
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
        this.appPlatform = appPlatform;
        this.appStoreId = appStoreId;
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
     * Gets the appPlatform value for this AppInstallGoal.
     *
     * @return appPlatform
     */
    public java.lang.String getAppPlatform() {
        return appPlatform;
    }

    /**
     * Sets the appPlatform value for this AppInstallGoal.
     *
     * @param appPlatform
     */
    public void setAppPlatform(java.lang.String appPlatform) {
        this.appPlatform = appPlatform;
    }

    /**
     * Gets the appStoreId value for this AppInstallGoal.
     *
     * @return appStoreId
     */
    public java.lang.String getAppStoreId() {
        return appStoreId;
    }

    /**
     * Sets the appStoreId value for this AppInstallGoal.
     *
     * @param appStoreId
     */
    public void setAppStoreId(java.lang.String appStoreId) {
        this.appStoreId = appStoreId;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppInstallGoal)) return false;
        AppInstallGoal other = (AppInstallGoal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.appPlatform == null && other.getAppPlatform() == null) ||
                        (this.appPlatform != null &&
                                this.appPlatform.equals(other.getAppPlatform()))) &&
                ((this.appStoreId == null && other.getAppStoreId() == null) ||
                        (this.appStoreId != null &&
                                this.appStoreId.equals(other.getAppStoreId())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAppPlatform() != null) {
            _hashCode += getAppPlatform().hashCode();
        }
        if (getAppStoreId() != null) {
            _hashCode += getAppStoreId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
