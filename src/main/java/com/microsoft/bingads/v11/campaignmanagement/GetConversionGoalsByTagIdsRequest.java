/**
 * GetConversionGoalsByTagIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetConversionGoalsByTagIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetConversionGoalsByTagIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConversionGoalsByTagIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TagIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionGoalTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private long[] tagIds;
    private java.lang.String[] conversionGoalTypes;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetConversionGoalsByTagIdsRequest() {
    }


    public GetConversionGoalsByTagIdsRequest(
            long[] tagIds,
            java.lang.String[] conversionGoalTypes) {
        this.tagIds = tagIds;
        this.conversionGoalTypes = conversionGoalTypes;
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
     * Gets the tagIds value for this GetConversionGoalsByTagIdsRequest.
     *
     * @return tagIds
     */
    public long[] getTagIds() {
        return tagIds;
    }

    /**
     * Sets the tagIds value for this GetConversionGoalsByTagIdsRequest.
     *
     * @param tagIds
     */
    public void setTagIds(long[] tagIds) {
        this.tagIds = tagIds;
    }

    /**
     * Gets the conversionGoalTypes value for this GetConversionGoalsByTagIdsRequest.
     *
     * @return conversionGoalTypes
     */
    public java.lang.String[] getConversionGoalTypes() {
        return conversionGoalTypes;
    }

    /**
     * Sets the conversionGoalTypes value for this GetConversionGoalsByTagIdsRequest.
     *
     * @param conversionGoalTypes
     */
    public void setConversionGoalTypes(java.lang.String[] conversionGoalTypes) {
        this.conversionGoalTypes = conversionGoalTypes;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetConversionGoalsByTagIdsRequest)) return false;
        GetConversionGoalsByTagIdsRequest other = (GetConversionGoalsByTagIdsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.tagIds == null && other.getTagIds() == null) ||
                        (this.tagIds != null &&
                                java.util.Arrays.equals(this.tagIds, other.getTagIds()))) &&
                ((this.conversionGoalTypes == null && other.getConversionGoalTypes() == null) ||
                        (this.conversionGoalTypes != null &&
                                java.util.Arrays.equals(this.conversionGoalTypes, other.getConversionGoalTypes())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTagIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTagIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTagIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConversionGoalTypes() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getConversionGoalTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionGoalTypes(), i);
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
