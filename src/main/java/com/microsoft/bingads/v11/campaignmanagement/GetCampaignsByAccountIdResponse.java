/**
 * GetCampaignsByAccountIdResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetCampaignsByAccountIdResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetCampaignsByAccountIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignsByAccountIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaigns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Campaigns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Campaign"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Campaign"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.Campaign[] campaigns;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetCampaignsByAccountIdResponse() {
    }

    public GetCampaignsByAccountIdResponse(
            com.microsoft.bingads.v11.campaignmanagement.Campaign[] campaigns) {
        this.campaigns = campaigns;
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
     * Gets the campaigns value for this GetCampaignsByAccountIdResponse.
     *
     * @return campaigns
     */
    public com.microsoft.bingads.v11.campaignmanagement.Campaign[] getCampaigns() {
        return campaigns;
    }

    /**
     * Sets the campaigns value for this GetCampaignsByAccountIdResponse.
     *
     * @param campaigns
     */
    public void setCampaigns(com.microsoft.bingads.v11.campaignmanagement.Campaign[] campaigns) {
        this.campaigns = campaigns;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCampaignsByAccountIdResponse)) return false;
        GetCampaignsByAccountIdResponse other = (GetCampaignsByAccountIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.campaigns == null && other.getCampaigns() == null) ||
                        (this.campaigns != null &&
                                java.util.Arrays.equals(this.campaigns, other.getCampaigns())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCampaigns() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCampaigns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaigns(), i);
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
