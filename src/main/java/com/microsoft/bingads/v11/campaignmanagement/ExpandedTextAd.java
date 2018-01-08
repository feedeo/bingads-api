/**
 * ExpandedTextAd.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class ExpandedTextAd extends com.microsoft.bingads.v11.campaignmanagement.Ad implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ExpandedTextAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ExpandedTextAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DisplayUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Path1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Path2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titlePart1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TitlePart1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titlePart2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TitlePart2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String displayUrl;
    private java.lang.String path1;
    private java.lang.String path2;
    private java.lang.String text;
    private java.lang.String titlePart1;
    private java.lang.String titlePart2;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ExpandedTextAd() {
    }


    public ExpandedTextAd(
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
            java.lang.String displayUrl,
            java.lang.String path1,
            java.lang.String path2,
            java.lang.String text,
            java.lang.String titlePart1,
            java.lang.String titlePart2) {
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
        this.displayUrl = displayUrl;
        this.path1 = path1;
        this.path2 = path2;
        this.text = text;
        this.titlePart1 = titlePart1;
        this.titlePart2 = titlePart2;
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
     * Gets the displayUrl value for this ExpandedTextAd.
     *
     * @return displayUrl
     */
    public java.lang.String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * Sets the displayUrl value for this ExpandedTextAd.
     *
     * @param displayUrl
     */
    public void setDisplayUrl(java.lang.String displayUrl) {
        this.displayUrl = displayUrl;
    }

    /**
     * Gets the path1 value for this ExpandedTextAd.
     *
     * @return path1
     */
    public java.lang.String getPath1() {
        return path1;
    }

    /**
     * Sets the path1 value for this ExpandedTextAd.
     *
     * @param path1
     */
    public void setPath1(java.lang.String path1) {
        this.path1 = path1;
    }

    /**
     * Gets the path2 value for this ExpandedTextAd.
     *
     * @return path2
     */
    public java.lang.String getPath2() {
        return path2;
    }

    /**
     * Sets the path2 value for this ExpandedTextAd.
     *
     * @param path2
     */
    public void setPath2(java.lang.String path2) {
        this.path2 = path2;
    }

    /**
     * Gets the text value for this ExpandedTextAd.
     *
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Sets the text value for this ExpandedTextAd.
     *
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    /**
     * Gets the titlePart1 value for this ExpandedTextAd.
     *
     * @return titlePart1
     */
    public java.lang.String getTitlePart1() {
        return titlePart1;
    }

    /**
     * Sets the titlePart1 value for this ExpandedTextAd.
     *
     * @param titlePart1
     */
    public void setTitlePart1(java.lang.String titlePart1) {
        this.titlePart1 = titlePart1;
    }

    /**
     * Gets the titlePart2 value for this ExpandedTextAd.
     *
     * @return titlePart2
     */
    public java.lang.String getTitlePart2() {
        return titlePart2;
    }

    /**
     * Sets the titlePart2 value for this ExpandedTextAd.
     *
     * @param titlePart2
     */
    public void setTitlePart2(java.lang.String titlePart2) {
        this.titlePart2 = titlePart2;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpandedTextAd)) return false;
        ExpandedTextAd other = (ExpandedTextAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.displayUrl == null && other.getDisplayUrl() == null) ||
                        (this.displayUrl != null &&
                                this.displayUrl.equals(other.getDisplayUrl()))) &&
                ((this.path1 == null && other.getPath1() == null) ||
                        (this.path1 != null &&
                                this.path1.equals(other.getPath1()))) &&
                ((this.path2 == null && other.getPath2() == null) ||
                        (this.path2 != null &&
                                this.path2.equals(other.getPath2()))) &&
                ((this.text == null && other.getText() == null) ||
                        (this.text != null &&
                                this.text.equals(other.getText()))) &&
                ((this.titlePart1 == null && other.getTitlePart1() == null) ||
                        (this.titlePart1 != null &&
                                this.titlePart1.equals(other.getTitlePart1()))) &&
                ((this.titlePart2 == null && other.getTitlePart2() == null) ||
                        (this.titlePart2 != null &&
                                this.titlePart2.equals(other.getTitlePart2())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDisplayUrl() != null) {
            _hashCode += getDisplayUrl().hashCode();
        }
        if (getPath1() != null) {
            _hashCode += getPath1().hashCode();
        }
        if (getPath2() != null) {
            _hashCode += getPath2().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getTitlePart1() != null) {
            _hashCode += getTitlePart1().hashCode();
        }
        if (getTitlePart2() != null) {
            _hashCode += getTitlePart2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
