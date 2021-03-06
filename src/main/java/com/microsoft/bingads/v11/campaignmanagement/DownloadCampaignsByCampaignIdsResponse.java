/**
 * DownloadCampaignsByCampaignIdsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DownloadCampaignsByCampaignIdsResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DownloadCampaignsByCampaignIdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DownloadCampaignsByCampaignIdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadRequestId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DownloadRequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String downloadRequestId;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public DownloadCampaignsByCampaignIdsResponse() {
    }

    public DownloadCampaignsByCampaignIdsResponse(
            java.lang.String downloadRequestId) {
        this.downloadRequestId = downloadRequestId;
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
     * Gets the downloadRequestId value for this DownloadCampaignsByCampaignIdsResponse.
     *
     * @return downloadRequestId
     */
    public java.lang.String getDownloadRequestId() {
        return downloadRequestId;
    }

    /**
     * Sets the downloadRequestId value for this DownloadCampaignsByCampaignIdsResponse.
     *
     * @param downloadRequestId
     */
    public void setDownloadRequestId(java.lang.String downloadRequestId) {
        this.downloadRequestId = downloadRequestId;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DownloadCampaignsByCampaignIdsResponse)) return false;
        DownloadCampaignsByCampaignIdsResponse other = (DownloadCampaignsByCampaignIdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.downloadRequestId == null && other.getDownloadRequestId() == null) ||
                        (this.downloadRequestId != null &&
                                this.downloadRequestId.equals(other.getDownloadRequestId())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDownloadRequestId() != null) {
            _hashCode += getDownloadRequestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
