/**
 * GetGeoLocationsFileUrlRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetGeoLocationsFileUrlRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetGeoLocationsFileUrlRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetGeoLocationsFileUrlRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LanguageLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String version;
    private java.lang.String languageLocale;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetGeoLocationsFileUrlRequest() {
    }


    public GetGeoLocationsFileUrlRequest(
            java.lang.String version,
            java.lang.String languageLocale) {
        this.version = version;
        this.languageLocale = languageLocale;
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
     * Gets the version value for this GetGeoLocationsFileUrlRequest.
     *
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }

    /**
     * Sets the version value for this GetGeoLocationsFileUrlRequest.
     *
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    /**
     * Gets the languageLocale value for this GetGeoLocationsFileUrlRequest.
     *
     * @return languageLocale
     */
    public java.lang.String getLanguageLocale() {
        return languageLocale;
    }

    /**
     * Sets the languageLocale value for this GetGeoLocationsFileUrlRequest.
     *
     * @param languageLocale
     */
    public void setLanguageLocale(java.lang.String languageLocale) {
        this.languageLocale = languageLocale;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGeoLocationsFileUrlRequest)) return false;
        GetGeoLocationsFileUrlRequest other = (GetGeoLocationsFileUrlRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.version == null && other.getVersion() == null) ||
                        (this.version != null &&
                                this.version.equals(other.getVersion()))) &&
                ((this.languageLocale == null && other.getLanguageLocale() == null) ||
                        (this.languageLocale != null &&
                                this.languageLocale.equals(other.getLanguageLocale())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getLanguageLocale() != null) {
            _hashCode += getLanguageLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
