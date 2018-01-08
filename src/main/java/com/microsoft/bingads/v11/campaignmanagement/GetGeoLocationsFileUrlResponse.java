/**
 * GetGeoLocationsFileUrlResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetGeoLocationsFileUrlResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetGeoLocationsFileUrlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetGeoLocationsFileUrlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FileUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileUrlExpiryTimeUtc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FileUrlExpiryTimeUtc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedTimeUtc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LastModifiedTimeUtc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String fileUrl;
    private java.util.Calendar fileUrlExpiryTimeUtc;
    private java.util.Calendar lastModifiedTimeUtc;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetGeoLocationsFileUrlResponse() {
    }


    public GetGeoLocationsFileUrlResponse(
            java.lang.String fileUrl,
            java.util.Calendar fileUrlExpiryTimeUtc,
            java.util.Calendar lastModifiedTimeUtc) {
        this.fileUrl = fileUrl;
        this.fileUrlExpiryTimeUtc = fileUrlExpiryTimeUtc;
        this.lastModifiedTimeUtc = lastModifiedTimeUtc;
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
     * Gets the fileUrl value for this GetGeoLocationsFileUrlResponse.
     *
     * @return fileUrl
     */
    public java.lang.String getFileUrl() {
        return fileUrl;
    }

    /**
     * Sets the fileUrl value for this GetGeoLocationsFileUrlResponse.
     *
     * @param fileUrl
     */
    public void setFileUrl(java.lang.String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * Gets the fileUrlExpiryTimeUtc value for this GetGeoLocationsFileUrlResponse.
     *
     * @return fileUrlExpiryTimeUtc
     */
    public java.util.Calendar getFileUrlExpiryTimeUtc() {
        return fileUrlExpiryTimeUtc;
    }

    /**
     * Sets the fileUrlExpiryTimeUtc value for this GetGeoLocationsFileUrlResponse.
     *
     * @param fileUrlExpiryTimeUtc
     */
    public void setFileUrlExpiryTimeUtc(java.util.Calendar fileUrlExpiryTimeUtc) {
        this.fileUrlExpiryTimeUtc = fileUrlExpiryTimeUtc;
    }

    /**
     * Gets the lastModifiedTimeUtc value for this GetGeoLocationsFileUrlResponse.
     *
     * @return lastModifiedTimeUtc
     */
    public java.util.Calendar getLastModifiedTimeUtc() {
        return lastModifiedTimeUtc;
    }

    /**
     * Sets the lastModifiedTimeUtc value for this GetGeoLocationsFileUrlResponse.
     *
     * @param lastModifiedTimeUtc
     */
    public void setLastModifiedTimeUtc(java.util.Calendar lastModifiedTimeUtc) {
        this.lastModifiedTimeUtc = lastModifiedTimeUtc;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGeoLocationsFileUrlResponse)) return false;
        GetGeoLocationsFileUrlResponse other = (GetGeoLocationsFileUrlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.fileUrl == null && other.getFileUrl() == null) ||
                        (this.fileUrl != null &&
                                this.fileUrl.equals(other.getFileUrl()))) &&
                ((this.fileUrlExpiryTimeUtc == null && other.getFileUrlExpiryTimeUtc() == null) ||
                        (this.fileUrlExpiryTimeUtc != null &&
                                this.fileUrlExpiryTimeUtc.equals(other.getFileUrlExpiryTimeUtc()))) &&
                ((this.lastModifiedTimeUtc == null && other.getLastModifiedTimeUtc() == null) ||
                        (this.lastModifiedTimeUtc != null &&
                                this.lastModifiedTimeUtc.equals(other.getLastModifiedTimeUtc())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFileUrl() != null) {
            _hashCode += getFileUrl().hashCode();
        }
        if (getFileUrlExpiryTimeUtc() != null) {
            _hashCode += getFileUrlExpiryTimeUtc().hashCode();
        }
        if (getLastModifiedTimeUtc() != null) {
            _hashCode += getLastModifiedTimeUtc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
