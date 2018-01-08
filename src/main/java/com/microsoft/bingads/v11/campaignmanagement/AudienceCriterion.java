/**
 * AudienceCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AudienceCriterion extends com.microsoft.bingads.v11.campaignmanagement.Criterion implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AudienceCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long audienceId;
    private java.lang.String[] audienceType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AudienceCriterion() {
    }


    public AudienceCriterion(
            java.lang.String type,
            java.lang.Long audienceId,
            java.lang.String[] audienceType) {
        super(
                type);
        this.audienceId = audienceId;
        this.audienceType = audienceType;
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
     * Gets the audienceId value for this AudienceCriterion.
     *
     * @return audienceId
     */
    public java.lang.Long getAudienceId() {
        return audienceId;
    }

    /**
     * Sets the audienceId value for this AudienceCriterion.
     *
     * @param audienceId
     */
    public void setAudienceId(java.lang.Long audienceId) {
        this.audienceId = audienceId;
    }

    /**
     * Gets the audienceType value for this AudienceCriterion.
     *
     * @return audienceType
     */
    public java.lang.String[] getAudienceType() {
        return audienceType;
    }

    /**
     * Sets the audienceType value for this AudienceCriterion.
     *
     * @param audienceType
     */
    public void setAudienceType(java.lang.String[] audienceType) {
        this.audienceType = audienceType;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudienceCriterion)) return false;
        AudienceCriterion other = (AudienceCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.audienceId == null && other.getAudienceId() == null) ||
                        (this.audienceId != null &&
                                this.audienceId.equals(other.getAudienceId()))) &&
                ((this.audienceType == null && other.getAudienceType() == null) ||
                        (this.audienceType != null &&
                                java.util.Arrays.equals(this.audienceType, other.getAudienceType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAudienceId() != null) {
            _hashCode += getAudienceId().hashCode();
        }
        if (getAudienceType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAudienceType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudienceType(), i);
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
