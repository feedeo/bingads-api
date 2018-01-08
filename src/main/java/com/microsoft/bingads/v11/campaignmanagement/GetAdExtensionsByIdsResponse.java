/**
 * GetAdExtensionsByIdsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetAdExtensionsByIdsResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetAdExtensionsByIdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsByIdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtension"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PartialErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchError"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.AdExtension[] adExtensions;
    private com.microsoft.bingads.v11.campaignmanagement.BatchError[] partialErrors;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetAdExtensionsByIdsResponse() {
    }


    public GetAdExtensionsByIdsResponse(
            com.microsoft.bingads.v11.campaignmanagement.AdExtension[] adExtensions,
            com.microsoft.bingads.v11.campaignmanagement.BatchError[] partialErrors) {
        this.adExtensions = adExtensions;
        this.partialErrors = partialErrors;
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
     * Gets the adExtensions value for this GetAdExtensionsByIdsResponse.
     *
     * @return adExtensions
     */
    public com.microsoft.bingads.v11.campaignmanagement.AdExtension[] getAdExtensions() {
        return adExtensions;
    }

    /**
     * Sets the adExtensions value for this GetAdExtensionsByIdsResponse.
     *
     * @param adExtensions
     */
    public void setAdExtensions(com.microsoft.bingads.v11.campaignmanagement.AdExtension[] adExtensions) {
        this.adExtensions = adExtensions;
    }

    /**
     * Gets the partialErrors value for this GetAdExtensionsByIdsResponse.
     *
     * @return partialErrors
     */
    public com.microsoft.bingads.v11.campaignmanagement.BatchError[] getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the partialErrors value for this GetAdExtensionsByIdsResponse.
     *
     * @param partialErrors
     */
    public void setPartialErrors(com.microsoft.bingads.v11.campaignmanagement.BatchError[] partialErrors) {
        this.partialErrors = partialErrors;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAdExtensionsByIdsResponse)) return false;
        GetAdExtensionsByIdsResponse other = (GetAdExtensionsByIdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.adExtensions == null && other.getAdExtensions() == null) ||
                        (this.adExtensions != null &&
                                java.util.Arrays.equals(this.adExtensions, other.getAdExtensions()))) &&
                ((this.partialErrors == null && other.getPartialErrors() == null) ||
                        (this.partialErrors != null &&
                                java.util.Arrays.equals(this.partialErrors, other.getPartialErrors())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdExtensions() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdExtensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensions(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartialErrors() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPartialErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartialErrors(), i);
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
