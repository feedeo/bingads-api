/**
 * GenderCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GenderCriterion extends com.microsoft.bingads.v11.campaignmanagement.Criterion implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GenderCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GenderCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genderType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GenderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GenderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.GenderType genderType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GenderCriterion() {
    }

    public GenderCriterion(
            java.lang.String type,
            com.microsoft.bingads.v11.campaignmanagement.GenderType genderType) {
        super(
                type);
        this.genderType = genderType;
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
     * Gets the genderType value for this GenderCriterion.
     *
     * @return genderType
     */
    public com.microsoft.bingads.v11.campaignmanagement.GenderType getGenderType() {
        return genderType;
    }

    /**
     * Sets the genderType value for this GenderCriterion.
     *
     * @param genderType
     */
    public void setGenderType(com.microsoft.bingads.v11.campaignmanagement.GenderType genderType) {
        this.genderType = genderType;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenderCriterion)) return false;
        GenderCriterion other = (GenderCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.genderType == null && other.getGenderType() == null) ||
                        (this.genderType != null &&
                                this.genderType.equals(other.getGenderType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getGenderType() != null) {
            _hashCode += getGenderType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
