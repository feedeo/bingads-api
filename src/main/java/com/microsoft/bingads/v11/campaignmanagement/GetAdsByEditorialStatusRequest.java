/**
 * GetAdsByEditorialStatusRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetAdsByEditorialStatusRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetAdsByEditorialStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByEditorialStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdEditorialStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdType"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long adGroupId;
    private com.microsoft.bingads.v11.campaignmanagement.AdEditorialStatus editorialStatus;
    private com.microsoft.bingads.v11.campaignmanagement.AdType[] adTypes;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetAdsByEditorialStatusRequest() {
    }


    public GetAdsByEditorialStatusRequest(
            java.lang.Long adGroupId,
            com.microsoft.bingads.v11.campaignmanagement.AdEditorialStatus editorialStatus,
            com.microsoft.bingads.v11.campaignmanagement.AdType[] adTypes) {
        this.adGroupId = adGroupId;
        this.editorialStatus = editorialStatus;
        this.adTypes = adTypes;
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
     * Gets the adGroupId value for this GetAdsByEditorialStatusRequest.
     *
     * @return adGroupId
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the adGroupId value for this GetAdsByEditorialStatusRequest.
     *
     * @param adGroupId
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * Gets the editorialStatus value for this GetAdsByEditorialStatusRequest.
     *
     * @return editorialStatus
     */
    public com.microsoft.bingads.v11.campaignmanagement.AdEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the editorialStatus value for this GetAdsByEditorialStatusRequest.
     *
     * @param editorialStatus
     */
    public void setEditorialStatus(com.microsoft.bingads.v11.campaignmanagement.AdEditorialStatus editorialStatus) {
        this.editorialStatus = editorialStatus;
    }

    /**
     * Gets the adTypes value for this GetAdsByEditorialStatusRequest.
     *
     * @return adTypes
     */
    public com.microsoft.bingads.v11.campaignmanagement.AdType[] getAdTypes() {
        return adTypes;
    }

    /**
     * Sets the adTypes value for this GetAdsByEditorialStatusRequest.
     *
     * @param adTypes
     */
    public void setAdTypes(com.microsoft.bingads.v11.campaignmanagement.AdType[] adTypes) {
        this.adTypes = adTypes;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAdsByEditorialStatusRequest)) return false;
        GetAdsByEditorialStatusRequest other = (GetAdsByEditorialStatusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.adGroupId == null && other.getAdGroupId() == null) ||
                        (this.adGroupId != null &&
                                this.adGroupId.equals(other.getAdGroupId()))) &&
                ((this.editorialStatus == null && other.getEditorialStatus() == null) ||
                        (this.editorialStatus != null &&
                                this.editorialStatus.equals(other.getEditorialStatus()))) &&
                ((this.adTypes == null && other.getAdTypes() == null) ||
                        (this.adTypes != null &&
                                java.util.Arrays.equals(this.adTypes, other.getAdTypes())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getEditorialStatus() != null) {
            _hashCode += getEditorialStatus().hashCode();
        }
        if (getAdTypes() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdTypes(), i);
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
