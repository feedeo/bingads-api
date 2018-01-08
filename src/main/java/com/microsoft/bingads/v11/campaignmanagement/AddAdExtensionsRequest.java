/**
 * AddAdExtensionsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AddAdExtensionsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AddAdExtensionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdExtensionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtension"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long accountId;
    private com.microsoft.bingads.v11.campaignmanagement.AdExtension[] adExtensions;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AddAdExtensionsRequest() {
    }


    public AddAdExtensionsRequest(
            java.lang.Long accountId,
            com.microsoft.bingads.v11.campaignmanagement.AdExtension[] adExtensions) {
        this.accountId = accountId;
        this.adExtensions = adExtensions;
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
     * Gets the accountId value for this AddAdExtensionsRequest.
     *
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the accountId value for this AddAdExtensionsRequest.
     *
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the adExtensions value for this AddAdExtensionsRequest.
     *
     * @return adExtensions
     */
    public com.microsoft.bingads.v11.campaignmanagement.AdExtension[] getAdExtensions() {
        return adExtensions;
    }

    /**
     * Sets the adExtensions value for this AddAdExtensionsRequest.
     *
     * @param adExtensions
     */
    public void setAdExtensions(com.microsoft.bingads.v11.campaignmanagement.AdExtension[] adExtensions) {
        this.adExtensions = adExtensions;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddAdExtensionsRequest)) return false;
        AddAdExtensionsRequest other = (AddAdExtensionsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accountId == null && other.getAccountId() == null) ||
                        (this.accountId != null &&
                                this.accountId.equals(other.getAccountId()))) &&
                ((this.adExtensions == null && other.getAdExtensions() == null) ||
                        (this.adExtensions != null &&
                                java.util.Arrays.equals(this.adExtensions, other.getAdExtensions())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
