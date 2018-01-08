/**
 * GetBulkUploadUrlResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetBulkUploadUrlResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetBulkUploadUrlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBulkUploadUrlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "RequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UploadUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String requestId;
    private java.lang.String uploadUrl;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetBulkUploadUrlResponse() {
    }


    public GetBulkUploadUrlResponse(
            java.lang.String requestId,
            java.lang.String uploadUrl) {
        this.requestId = requestId;
        this.uploadUrl = uploadUrl;
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
     * Gets the requestId value for this GetBulkUploadUrlResponse.
     *
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }

    /**
     * Sets the requestId value for this GetBulkUploadUrlResponse.
     *
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }

    /**
     * Gets the uploadUrl value for this GetBulkUploadUrlResponse.
     *
     * @return uploadUrl
     */
    public java.lang.String getUploadUrl() {
        return uploadUrl;
    }

    /**
     * Sets the uploadUrl value for this GetBulkUploadUrlResponse.
     *
     * @param uploadUrl
     */
    public void setUploadUrl(java.lang.String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBulkUploadUrlResponse)) return false;
        GetBulkUploadUrlResponse other = (GetBulkUploadUrlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.requestId == null && other.getRequestId() == null) ||
                        (this.requestId != null &&
                                this.requestId.equals(other.getRequestId()))) &&
                ((this.uploadUrl == null && other.getUploadUrl() == null) ||
                        (this.uploadUrl != null &&
                                this.uploadUrl.equals(other.getUploadUrl())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getUploadUrl() != null) {
            _hashCode += getUploadUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
