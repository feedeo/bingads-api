/**
 * AdExtensionEditorialReasonCollection.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AdExtensionEditorialReasonCollection implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AdExtensionEditorialReasonCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionEditorialReasonCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Reasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionEditorialReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionEditorialReason"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long adExtensionId;
    private com.microsoft.bingads.v11.campaignmanagement.AdExtensionEditorialReason[] reasons;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AdExtensionEditorialReasonCollection() {
    }


    public AdExtensionEditorialReasonCollection(
            java.lang.Long adExtensionId,
            com.microsoft.bingads.v11.campaignmanagement.AdExtensionEditorialReason[] reasons) {
        this.adExtensionId = adExtensionId;
        this.reasons = reasons;
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
     * Gets the adExtensionId value for this AdExtensionEditorialReasonCollection.
     *
     * @return adExtensionId
     */
    public java.lang.Long getAdExtensionId() {
        return adExtensionId;
    }

    /**
     * Sets the adExtensionId value for this AdExtensionEditorialReasonCollection.
     *
     * @param adExtensionId
     */
    public void setAdExtensionId(java.lang.Long adExtensionId) {
        this.adExtensionId = adExtensionId;
    }

    /**
     * Gets the reasons value for this AdExtensionEditorialReasonCollection.
     *
     * @return reasons
     */
    public com.microsoft.bingads.v11.campaignmanagement.AdExtensionEditorialReason[] getReasons() {
        return reasons;
    }

    /**
     * Sets the reasons value for this AdExtensionEditorialReasonCollection.
     *
     * @param reasons
     */
    public void setReasons(com.microsoft.bingads.v11.campaignmanagement.AdExtensionEditorialReason[] reasons) {
        this.reasons = reasons;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtensionEditorialReasonCollection)) return false;
        AdExtensionEditorialReasonCollection other = (AdExtensionEditorialReasonCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.adExtensionId == null && other.getAdExtensionId() == null) ||
                        (this.adExtensionId != null &&
                                this.adExtensionId.equals(other.getAdExtensionId()))) &&
                ((this.reasons == null && other.getReasons() == null) ||
                        (this.reasons != null &&
                                java.util.Arrays.equals(this.reasons, other.getReasons())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdExtensionId() != null) {
            _hashCode += getAdExtensionId().hashCode();
        }
        if (getReasons() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReasons(), i);
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
