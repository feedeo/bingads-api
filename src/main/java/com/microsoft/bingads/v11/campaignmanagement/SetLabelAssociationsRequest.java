/**
 * SetLabelAssociationsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class SetLabelAssociationsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SetLabelAssociationsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">SetLabelAssociationsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelAssociations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelAssociations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelAssociation"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.EntityType entityType;
    private com.microsoft.bingads.v11.campaignmanagement.LabelAssociation[] labelAssociations;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public SetLabelAssociationsRequest() {
    }


    public SetLabelAssociationsRequest(
            com.microsoft.bingads.v11.campaignmanagement.EntityType entityType,
            com.microsoft.bingads.v11.campaignmanagement.LabelAssociation[] labelAssociations) {
        this.entityType = entityType;
        this.labelAssociations = labelAssociations;
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
     * Gets the entityType value for this SetLabelAssociationsRequest.
     *
     * @return entityType
     */
    public com.microsoft.bingads.v11.campaignmanagement.EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the entityType value for this SetLabelAssociationsRequest.
     *
     * @param entityType
     */
    public void setEntityType(com.microsoft.bingads.v11.campaignmanagement.EntityType entityType) {
        this.entityType = entityType;
    }

    /**
     * Gets the labelAssociations value for this SetLabelAssociationsRequest.
     *
     * @return labelAssociations
     */
    public com.microsoft.bingads.v11.campaignmanagement.LabelAssociation[] getLabelAssociations() {
        return labelAssociations;
    }

    /**
     * Sets the labelAssociations value for this SetLabelAssociationsRequest.
     *
     * @param labelAssociations
     */
    public void setLabelAssociations(com.microsoft.bingads.v11.campaignmanagement.LabelAssociation[] labelAssociations) {
        this.labelAssociations = labelAssociations;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetLabelAssociationsRequest)) return false;
        SetLabelAssociationsRequest other = (SetLabelAssociationsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.entityType == null && other.getEntityType() == null) ||
                        (this.entityType != null &&
                                this.entityType.equals(other.getEntityType()))) &&
                ((this.labelAssociations == null && other.getLabelAssociations() == null) ||
                        (this.labelAssociations != null &&
                                java.util.Arrays.equals(this.labelAssociations, other.getLabelAssociations())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getLabelAssociations() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getLabelAssociations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabelAssociations(), i);
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
