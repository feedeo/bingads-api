/**
 * GetCampaignSizesByAccountIdResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetCampaignSizesByAccountIdResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetCampaignSizesByAccountIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignSizesByAccountIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignSizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignSizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignSize"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignSize"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.CampaignSize[] campaignSizes;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetCampaignSizesByAccountIdResponse() {
    }

    public GetCampaignSizesByAccountIdResponse(
            com.microsoft.bingads.v11.campaignmanagement.CampaignSize[] campaignSizes) {
        this.campaignSizes = campaignSizes;
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
     * Gets the campaignSizes value for this GetCampaignSizesByAccountIdResponse.
     *
     * @return campaignSizes
     */
    public com.microsoft.bingads.v11.campaignmanagement.CampaignSize[] getCampaignSizes() {
        return campaignSizes;
    }

    /**
     * Sets the campaignSizes value for this GetCampaignSizesByAccountIdResponse.
     *
     * @param campaignSizes
     */
    public void setCampaignSizes(com.microsoft.bingads.v11.campaignmanagement.CampaignSize[] campaignSizes) {
        this.campaignSizes = campaignSizes;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCampaignSizesByAccountIdResponse)) return false;
        GetCampaignSizesByAccountIdResponse other = (GetCampaignSizesByAccountIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.campaignSizes == null && other.getCampaignSizes() == null) ||
                        (this.campaignSizes != null &&
                                java.util.Arrays.equals(this.campaignSizes, other.getCampaignSizes())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCampaignSizes() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCampaignSizes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignSizes(), i);
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
