/**
 * UpdateCampaignCriterionsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class UpdateCampaignCriterionsResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateCampaignCriterionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateCampaignCriterionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMigrated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IsMigrated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nestedPartialErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NestedPartialErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchErrorCollection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchErrorCollection"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Boolean isMigrated;
    private com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] nestedPartialErrors;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateCampaignCriterionsResponse() {
    }


    public UpdateCampaignCriterionsResponse(
            java.lang.Boolean isMigrated,
            com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] nestedPartialErrors) {
        this.isMigrated = isMigrated;
        this.nestedPartialErrors = nestedPartialErrors;
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
     * Gets the isMigrated value for this UpdateCampaignCriterionsResponse.
     *
     * @return isMigrated
     */
    public java.lang.Boolean getIsMigrated() {
        return isMigrated;
    }

    /**
     * Sets the isMigrated value for this UpdateCampaignCriterionsResponse.
     *
     * @param isMigrated
     */
    public void setIsMigrated(java.lang.Boolean isMigrated) {
        this.isMigrated = isMigrated;
    }

    /**
     * Gets the nestedPartialErrors value for this UpdateCampaignCriterionsResponse.
     *
     * @return nestedPartialErrors
     */
    public com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] getNestedPartialErrors() {
        return nestedPartialErrors;
    }

    /**
     * Sets the nestedPartialErrors value for this UpdateCampaignCriterionsResponse.
     *
     * @param nestedPartialErrors
     */
    public void setNestedPartialErrors(com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] nestedPartialErrors) {
        this.nestedPartialErrors = nestedPartialErrors;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCampaignCriterionsResponse)) return false;
        UpdateCampaignCriterionsResponse other = (UpdateCampaignCriterionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.isMigrated == null && other.getIsMigrated() == null) ||
                        (this.isMigrated != null &&
                                this.isMigrated.equals(other.getIsMigrated()))) &&
                ((this.nestedPartialErrors == null && other.getNestedPartialErrors() == null) ||
                        (this.nestedPartialErrors != null &&
                                java.util.Arrays.equals(this.nestedPartialErrors, other.getNestedPartialErrors())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIsMigrated() != null) {
            _hashCode += getIsMigrated().hashCode();
        }
        if (getNestedPartialErrors() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getNestedPartialErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNestedPartialErrors(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
