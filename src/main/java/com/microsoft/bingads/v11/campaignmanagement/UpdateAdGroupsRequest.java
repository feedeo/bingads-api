/**
 * UpdateAdGroupsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class UpdateAdGroupsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateAdGroupsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdGroupsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateNativeBidAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UpdateNativeBidAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long campaignId;
    private com.microsoft.bingads.v11.campaignmanagement.AdGroup[] adGroups;
    private java.lang.Boolean updateNativeBidAdjustment;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateAdGroupsRequest() {
    }


    public UpdateAdGroupsRequest(
            java.lang.Long campaignId,
            com.microsoft.bingads.v11.campaignmanagement.AdGroup[] adGroups,
            java.lang.Boolean updateNativeBidAdjustment) {
        this.campaignId = campaignId;
        this.adGroups = adGroups;
        this.updateNativeBidAdjustment = updateNativeBidAdjustment;
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
     * Gets the campaignId value for this UpdateAdGroupsRequest.
     *
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the campaignId value for this UpdateAdGroupsRequest.
     *
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Gets the adGroups value for this UpdateAdGroupsRequest.
     *
     * @return adGroups
     */
    public com.microsoft.bingads.v11.campaignmanagement.AdGroup[] getAdGroups() {
        return adGroups;
    }

    /**
     * Sets the adGroups value for this UpdateAdGroupsRequest.
     *
     * @param adGroups
     */
    public void setAdGroups(com.microsoft.bingads.v11.campaignmanagement.AdGroup[] adGroups) {
        this.adGroups = adGroups;
    }

    /**
     * Gets the updateNativeBidAdjustment value for this UpdateAdGroupsRequest.
     *
     * @return updateNativeBidAdjustment
     */
    public java.lang.Boolean getUpdateNativeBidAdjustment() {
        return updateNativeBidAdjustment;
    }

    /**
     * Sets the updateNativeBidAdjustment value for this UpdateAdGroupsRequest.
     *
     * @param updateNativeBidAdjustment
     */
    public void setUpdateNativeBidAdjustment(java.lang.Boolean updateNativeBidAdjustment) {
        this.updateNativeBidAdjustment = updateNativeBidAdjustment;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAdGroupsRequest)) return false;
        UpdateAdGroupsRequest other = (UpdateAdGroupsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.campaignId == null && other.getCampaignId() == null) ||
                        (this.campaignId != null &&
                                this.campaignId.equals(other.getCampaignId()))) &&
                ((this.adGroups == null && other.getAdGroups() == null) ||
                        (this.adGroups != null &&
                                java.util.Arrays.equals(this.adGroups, other.getAdGroups()))) &&
                ((this.updateNativeBidAdjustment == null && other.getUpdateNativeBidAdjustment() == null) ||
                        (this.updateNativeBidAdjustment != null &&
                                this.updateNativeBidAdjustment.equals(other.getUpdateNativeBidAdjustment())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getAdGroups() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroups(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUpdateNativeBidAdjustment() != null) {
            _hashCode += getUpdateNativeBidAdjustment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
