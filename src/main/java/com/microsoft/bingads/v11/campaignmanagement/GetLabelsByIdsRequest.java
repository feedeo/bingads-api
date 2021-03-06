/**
 * GetLabelsByIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetLabelsByIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetLabelsByIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetLabelsByIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Paging"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private long[] labelIds;
    private com.microsoft.bingads.v11.campaignmanagement.Paging pageInfo;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetLabelsByIdsRequest() {
    }


    public GetLabelsByIdsRequest(
            long[] labelIds,
            com.microsoft.bingads.v11.campaignmanagement.Paging pageInfo) {
        this.labelIds = labelIds;
        this.pageInfo = pageInfo;
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
     * Gets the labelIds value for this GetLabelsByIdsRequest.
     *
     * @return labelIds
     */
    public long[] getLabelIds() {
        return labelIds;
    }

    /**
     * Sets the labelIds value for this GetLabelsByIdsRequest.
     *
     * @param labelIds
     */
    public void setLabelIds(long[] labelIds) {
        this.labelIds = labelIds;
    }

    /**
     * Gets the pageInfo value for this GetLabelsByIdsRequest.
     *
     * @return pageInfo
     */
    public com.microsoft.bingads.v11.campaignmanagement.Paging getPageInfo() {
        return pageInfo;
    }

    /**
     * Sets the pageInfo value for this GetLabelsByIdsRequest.
     *
     * @param pageInfo
     */
    public void setPageInfo(com.microsoft.bingads.v11.campaignmanagement.Paging pageInfo) {
        this.pageInfo = pageInfo;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLabelsByIdsRequest)) return false;
        GetLabelsByIdsRequest other = (GetLabelsByIdsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.labelIds == null && other.getLabelIds() == null) ||
                        (this.labelIds != null &&
                                java.util.Arrays.equals(this.labelIds, other.getLabelIds()))) &&
                ((this.pageInfo == null && other.getPageInfo() == null) ||
                        (this.pageInfo != null &&
                                this.pageInfo.equals(other.getPageInfo())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLabelIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getLabelIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabelIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageInfo() != null) {
            _hashCode += getPageInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
