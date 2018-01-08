/**
 * DynamicSearchAd.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DynamicSearchAd extends com.microsoft.bingads.v11.campaignmanagement.Ad implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DynamicSearchAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DynamicSearchAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String path1;
    private java.lang.String path2;
    private java.lang.String text;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DynamicSearchAd() {
    }


    public DynamicSearchAd(
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
            java.lang.String path1,
            java.lang.String path2,
            java.lang.String text) {
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
        this.path1 = path1;
        this.path2 = path2;
        this.text = text;
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
     * Gets the path1 value for this DynamicSearchAd.
     *
     * @return path1
     */
    public java.lang.String getPath1() {
        return path1;
    }

    /**
     * Sets the path1 value for this DynamicSearchAd.
     *
     * @param path1
     */
    public void setPath1(java.lang.String path1) {
        this.path1 = path1;
    }

    /**
     * Gets the path2 value for this DynamicSearchAd.
     *
     * @return path2
     */
    public java.lang.String getPath2() {
        return path2;
    }

    /**
     * Sets the path2 value for this DynamicSearchAd.
     *
     * @param path2
     */
    public void setPath2(java.lang.String path2) {
        this.path2 = path2;
    }

    /**
     * Gets the text value for this DynamicSearchAd.
     *
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Sets the text value for this DynamicSearchAd.
     *
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicSearchAd)) return false;
        DynamicSearchAd other = (DynamicSearchAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.path1 == null && other.getPath1() == null) ||
                        (this.path1 != null &&
                                this.path1.equals(other.getPath1()))) &&
                ((this.path2 == null && other.getPath2() == null) ||
                        (this.path2 != null &&
                                this.path2.equals(other.getPath2()))) &&
                ((this.text == null && other.getText() == null) ||
                        (this.text != null &&
                                this.text.equals(other.getText())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPath1() != null) {
            _hashCode += getPath1().hashCode();
        }
        if (getPath2() != null) {
            _hashCode += getPath2().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
