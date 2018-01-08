/**
 * AppInstallAd.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AppInstallAd extends com.microsoft.bingads.v11.campaignmanagement.Ad implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AppInstallAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AppInstallAd"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String appPlatform;
    private java.lang.String appStoreId;
    private java.lang.String text;
    private java.lang.String title;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AppInstallAd() {
    }


    public AppInstallAd(
            java.lang.String adFormatPreference,
            java.lang.Long devicePreference,
            com.microsoft.bingads.v11.campaignmanagement.AdEditorialStatus editorialStatus,
            com.microsoft.bingads.v11.datacontracts.AppUrl[] finalAppUrls,
            java.lang.String[] finalMobileUrls,
            java.lang.String[] finalUrls,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            com.microsoft.bingads.v11.campaignmanagement.AdStatus status,
            java.lang.String trackingUrlTemplate,
            com.microsoft.bingads.v11.campaignmanagement.AdType type,
            com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters,
            java.lang.String appPlatform,
            java.lang.String appStoreId,
            java.lang.String text,
            java.lang.String title) {
        super(
                adFormatPreference,
                devicePreference,
                editorialStatus,
                finalAppUrls,
                finalMobileUrls,
                finalUrls,
                forwardCompatibilityMap,
                id,
                status,
                trackingUrlTemplate,
                type,
                urlCustomParameters);
        this.appPlatform = appPlatform;
        this.appStoreId = appStoreId;
        this.text = text;
        this.title = title;
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
     * Gets the appPlatform value for this AppInstallAd.
     *
     * @return appPlatform
     */
    public java.lang.String getAppPlatform() {
        return appPlatform;
    }

    /**
     * Sets the appPlatform value for this AppInstallAd.
     *
     * @param appPlatform
     */
    public void setAppPlatform(java.lang.String appPlatform) {
        this.appPlatform = appPlatform;
    }

    /**
     * Gets the appStoreId value for this AppInstallAd.
     *
     * @return appStoreId
     */
    public java.lang.String getAppStoreId() {
        return appStoreId;
    }

    /**
     * Sets the appStoreId value for this AppInstallAd.
     *
     * @param appStoreId
     */
    public void setAppStoreId(java.lang.String appStoreId) {
        this.appStoreId = appStoreId;
    }

    /**
     * Gets the text value for this AppInstallAd.
     *
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Sets the text value for this AppInstallAd.
     *
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    /**
     * Gets the title value for this AppInstallAd.
     *
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * Sets the title value for this AppInstallAd.
     *
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppInstallAd)) return false;
        AppInstallAd other = (AppInstallAd) obj;
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
                                this.appStoreId.equals(other.getAppStoreId()))) &&
                ((this.text == null && other.getText() == null) ||
                        (this.text != null &&
                                this.text.equals(other.getText()))) &&
                ((this.title == null && other.getTitle() == null) ||
                        (this.title != null &&
                                this.title.equals(other.getTitle())));
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
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
