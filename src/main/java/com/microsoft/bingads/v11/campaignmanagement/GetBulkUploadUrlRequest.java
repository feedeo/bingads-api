/**
 * GetBulkUploadUrlRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetBulkUploadUrlRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetBulkUploadUrlRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBulkUploadUrlRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ResponseMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ResponseMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.ResponseMode responseMode;
    private java.lang.Long accountId;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetBulkUploadUrlRequest() {
    }


    public GetBulkUploadUrlRequest(
            com.microsoft.bingads.v11.campaignmanagement.ResponseMode responseMode,
            java.lang.Long accountId) {
        this.responseMode = responseMode;
        this.accountId = accountId;
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
     * Gets the responseMode value for this GetBulkUploadUrlRequest.
     *
     * @return responseMode
     */
    public com.microsoft.bingads.v11.campaignmanagement.ResponseMode getResponseMode() {
        return responseMode;
    }

    /**
     * Sets the responseMode value for this GetBulkUploadUrlRequest.
     *
     * @param responseMode
     */
    public void setResponseMode(com.microsoft.bingads.v11.campaignmanagement.ResponseMode responseMode) {
        this.responseMode = responseMode;
    }

    /**
     * Gets the accountId value for this GetBulkUploadUrlRequest.
     *
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the accountId value for this GetBulkUploadUrlRequest.
     *
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBulkUploadUrlRequest)) return false;
        GetBulkUploadUrlRequest other = (GetBulkUploadUrlRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.responseMode == null && other.getResponseMode() == null) ||
                        (this.responseMode != null &&
                                this.responseMode.equals(other.getResponseMode()))) &&
                ((this.accountId == null && other.getAccountId() == null) ||
                        (this.accountId != null &&
                                this.accountId.equals(other.getAccountId())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponseMode() != null) {
            _hashCode += getResponseMode().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
