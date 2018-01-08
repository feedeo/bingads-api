/**
 * UpdateUetTagsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class UpdateUetTagsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateUetTagsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateUetTagsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uetTags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UetTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UetTag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UetTag"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.UetTag[] uetTags;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public UpdateUetTagsRequest() {
    }

    public UpdateUetTagsRequest(
            com.microsoft.bingads.v11.campaignmanagement.UetTag[] uetTags) {
        this.uetTags = uetTags;
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
     * Gets the uetTags value for this UpdateUetTagsRequest.
     *
     * @return uetTags
     */
    public com.microsoft.bingads.v11.campaignmanagement.UetTag[] getUetTags() {
        return uetTags;
    }

    /**
     * Sets the uetTags value for this UpdateUetTagsRequest.
     *
     * @param uetTags
     */
    public void setUetTags(com.microsoft.bingads.v11.campaignmanagement.UetTag[] uetTags) {
        this.uetTags = uetTags;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateUetTagsRequest)) return false;
        UpdateUetTagsRequest other = (UpdateUetTagsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.uetTags == null && other.getUetTags() == null) ||
                        (this.uetTags != null &&
                                java.util.Arrays.equals(this.uetTags, other.getUetTags())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUetTags() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getUetTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUetTags(), i);
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
