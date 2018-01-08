/**
 * GetAdsByIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetAdsByIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetAdsByIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdsByIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
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
    private long[] adIds;
    private com.microsoft.bingads.v11.campaignmanagement.AdType[] adTypes;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetAdsByIdsRequest() {
    }


    public GetAdsByIdsRequest(
            java.lang.Long adGroupId,
            long[] adIds,
            com.microsoft.bingads.v11.campaignmanagement.AdType[] adTypes) {
        this.adGroupId = adGroupId;
        this.adIds = adIds;
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
     * Gets the adGroupId value for this GetAdsByIdsRequest.
     *
     * @return adGroupId
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the adGroupId value for this GetAdsByIdsRequest.
     *
     * @param adGroupId
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * Gets the adIds value for this GetAdsByIdsRequest.
     *
     * @return adIds
     */
    public long[] getAdIds() {
        return adIds;
    }

    /**
     * Sets the adIds value for this GetAdsByIdsRequest.
     *
     * @param adIds
     */
    public void setAdIds(long[] adIds) {
        this.adIds = adIds;
    }

    /**
     * Gets the adTypes value for this GetAdsByIdsRequest.
     *
     * @return adTypes
     */
    public com.microsoft.bingads.v11.campaignmanagement.AdType[] getAdTypes() {
        return adTypes;
    }

    /**
     * Sets the adTypes value for this GetAdsByIdsRequest.
     *
     * @param adTypes
     */
    public void setAdTypes(com.microsoft.bingads.v11.campaignmanagement.AdType[] adTypes) {
        this.adTypes = adTypes;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAdsByIdsRequest)) return false;
        GetAdsByIdsRequest other = (GetAdsByIdsRequest) obj;
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
                ((this.adIds == null && other.getAdIds() == null) ||
                        (this.adIds != null &&
                                java.util.Arrays.equals(this.adIds, other.getAdIds()))) &&
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
        if (getAdIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
