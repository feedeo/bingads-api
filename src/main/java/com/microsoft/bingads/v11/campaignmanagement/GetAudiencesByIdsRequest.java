/**
 * GetAudiencesByIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetAudiencesByIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetAudiencesByIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAudiencesByIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAdditionalFields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ReturnAdditionalFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceAdditionalField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private long[] audienceIds;
    private java.lang.String[] type;
    private java.lang.String[] returnAdditionalFields;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetAudiencesByIdsRequest() {
    }


    public GetAudiencesByIdsRequest(
            long[] audienceIds,
            java.lang.String[] type,
            java.lang.String[] returnAdditionalFields) {
        this.audienceIds = audienceIds;
        this.type = type;
        this.returnAdditionalFields = returnAdditionalFields;
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
     * Gets the audienceIds value for this GetAudiencesByIdsRequest.
     *
     * @return audienceIds
     */
    public long[] getAudienceIds() {
        return audienceIds;
    }

    /**
     * Sets the audienceIds value for this GetAudiencesByIdsRequest.
     *
     * @param audienceIds
     */
    public void setAudienceIds(long[] audienceIds) {
        this.audienceIds = audienceIds;
    }

    /**
     * Gets the type value for this GetAudiencesByIdsRequest.
     *
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }

    /**
     * Sets the type value for this GetAudiencesByIdsRequest.
     *
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }

    /**
     * Gets the returnAdditionalFields value for this GetAudiencesByIdsRequest.
     *
     * @return returnAdditionalFields
     */
    public java.lang.String[] getReturnAdditionalFields() {
        return returnAdditionalFields;
    }

    /**
     * Sets the returnAdditionalFields value for this GetAudiencesByIdsRequest.
     *
     * @param returnAdditionalFields
     */
    public void setReturnAdditionalFields(java.lang.String[] returnAdditionalFields) {
        this.returnAdditionalFields = returnAdditionalFields;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAudiencesByIdsRequest)) return false;
        GetAudiencesByIdsRequest other = (GetAudiencesByIdsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.audienceIds == null && other.getAudienceIds() == null) ||
                        (this.audienceIds != null &&
                                java.util.Arrays.equals(this.audienceIds, other.getAudienceIds()))) &&
                ((this.type == null && other.getType() == null) ||
                        (this.type != null &&
                                java.util.Arrays.equals(this.type, other.getType()))) &&
                ((this.returnAdditionalFields == null && other.getReturnAdditionalFields() == null) ||
                        (this.returnAdditionalFields != null &&
                                java.util.Arrays.equals(this.returnAdditionalFields, other.getReturnAdditionalFields())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAudienceIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAudienceIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudienceIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnAdditionalFields() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getReturnAdditionalFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnAdditionalFields(), i);
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
