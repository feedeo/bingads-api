/**
 * LabelAssociation.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class LabelAssociation implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(LabelAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private long entityId;
    private long labelId;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public LabelAssociation() {
    }


    public LabelAssociation(
            long entityId,
            long labelId) {
        this.entityId = entityId;
        this.labelId = labelId;
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
     * Gets the entityId value for this LabelAssociation.
     *
     * @return entityId
     */
    public long getEntityId() {
        return entityId;
    }

    /**
     * Sets the entityId value for this LabelAssociation.
     *
     * @param entityId
     */
    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    /**
     * Gets the labelId value for this LabelAssociation.
     *
     * @return labelId
     */
    public long getLabelId() {
        return labelId;
    }

    /**
     * Sets the labelId value for this LabelAssociation.
     *
     * @param labelId
     */
    public void setLabelId(long labelId) {
        this.labelId = labelId;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LabelAssociation)) return false;
        LabelAssociation other = (LabelAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.entityId == other.getEntityId() &&
                this.labelId == other.getLabelId();
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getEntityId()).hashCode();
        _hashCode += new Long(getLabelId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
