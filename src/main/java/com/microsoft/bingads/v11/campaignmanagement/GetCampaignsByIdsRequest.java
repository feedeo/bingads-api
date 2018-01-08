/**
 * GetCampaignsByIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetCampaignsByIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetCampaignsByIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetCampaignsByIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long accountId;
    private long[] campaignIds;
    private java.lang.String[] campaignType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetCampaignsByIdsRequest() {
    }


    public GetCampaignsByIdsRequest(
            java.lang.Long accountId,
            long[] campaignIds,
            java.lang.String[] campaignType) {
        this.accountId = accountId;
        this.campaignIds = campaignIds;
        this.campaignType = campaignType;
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
     * Gets the accountId value for this GetCampaignsByIdsRequest.
     *
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the accountId value for this GetCampaignsByIdsRequest.
     *
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the campaignIds value for this GetCampaignsByIdsRequest.
     *
     * @return campaignIds
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }

    /**
     * Sets the campaignIds value for this GetCampaignsByIdsRequest.
     *
     * @param campaignIds
     */
    public void setCampaignIds(long[] campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
     * Gets the campaignType value for this GetCampaignsByIdsRequest.
     *
     * @return campaignType
     */
    public java.lang.String[] getCampaignType() {
        return campaignType;
    }

    /**
     * Sets the campaignType value for this GetCampaignsByIdsRequest.
     *
     * @param campaignType
     */
    public void setCampaignType(java.lang.String[] campaignType) {
        this.campaignType = campaignType;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCampaignsByIdsRequest)) return false;
        GetCampaignsByIdsRequest other = (GetCampaignsByIdsRequest) obj;
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
                ((this.campaignIds == null && other.getCampaignIds() == null) ||
                        (this.campaignIds != null &&
                                java.util.Arrays.equals(this.campaignIds, other.getCampaignIds()))) &&
                ((this.campaignType == null && other.getCampaignType() == null) ||
                        (this.campaignType != null &&
                                java.util.Arrays.equals(this.campaignType, other.getCampaignType())));
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
        if (getCampaignIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCampaignIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCampaignType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignType(), i);
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
