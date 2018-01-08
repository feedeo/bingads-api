/**
 * GetUetTagsByIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetUetTagsByIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetUetTagsByIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetUetTagsByIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TagIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
    }

    private long[] tagIds;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetUetTagsByIdsRequest() {
    }

    public GetUetTagsByIdsRequest(
            long[] tagIds) {
        this.tagIds = tagIds;
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
     * Gets the tagIds value for this GetUetTagsByIdsRequest.
     *
     * @return tagIds
     */
    public long[] getTagIds() {
        return tagIds;
    }

    /**
     * Sets the tagIds value for this GetUetTagsByIdsRequest.
     *
     * @param tagIds
     */
    public void setTagIds(long[] tagIds) {
        this.tagIds = tagIds;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUetTagsByIdsRequest)) return false;
        GetUetTagsByIdsRequest other = (GetUetTagsByIdsRequest) obj;
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
                                java.util.Arrays.equals(this.tagIds, other.getTagIds())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
