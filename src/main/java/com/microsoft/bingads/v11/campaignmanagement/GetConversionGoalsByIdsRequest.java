/**
 * GetConversionGoalsByIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetConversionGoalsByIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetConversionGoalsByIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetConversionGoalsByIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionGoalIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalIds"));
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

    private long[] conversionGoalIds;
    private java.lang.String[] conversionGoalTypes;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetConversionGoalsByIdsRequest() {
    }


    public GetConversionGoalsByIdsRequest(
            long[] conversionGoalIds,
            java.lang.String[] conversionGoalTypes) {
        this.conversionGoalIds = conversionGoalIds;
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
     * Gets the conversionGoalIds value for this GetConversionGoalsByIdsRequest.
     *
     * @return conversionGoalIds
     */
    public long[] getConversionGoalIds() {
        return conversionGoalIds;
    }

    /**
     * Sets the conversionGoalIds value for this GetConversionGoalsByIdsRequest.
     *
     * @param conversionGoalIds
     */
    public void setConversionGoalIds(long[] conversionGoalIds) {
        this.conversionGoalIds = conversionGoalIds;
    }

    /**
     * Gets the conversionGoalTypes value for this GetConversionGoalsByIdsRequest.
     *
     * @return conversionGoalTypes
     */
    public java.lang.String[] getConversionGoalTypes() {
        return conversionGoalTypes;
    }

    /**
     * Sets the conversionGoalTypes value for this GetConversionGoalsByIdsRequest.
     *
     * @param conversionGoalTypes
     */
    public void setConversionGoalTypes(java.lang.String[] conversionGoalTypes) {
        this.conversionGoalTypes = conversionGoalTypes;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetConversionGoalsByIdsRequest)) return false;
        GetConversionGoalsByIdsRequest other = (GetConversionGoalsByIdsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.conversionGoalIds == null && other.getConversionGoalIds() == null) ||
                        (this.conversionGoalIds != null &&
                                java.util.Arrays.equals(this.conversionGoalIds, other.getConversionGoalIds()))) &&
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
        if (getConversionGoalIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getConversionGoalIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionGoalIds(), i);
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
