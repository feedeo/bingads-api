/**
 * AdExtensionIdToEntityIdAssociation.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AdExtensionIdToEntityIdAssociation implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AdExtensionIdToEntityIdAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionIdToEntityIdAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private long adExtensionId;
    private long entityId;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AdExtensionIdToEntityIdAssociation() {
    }


    public AdExtensionIdToEntityIdAssociation(
            long adExtensionId,
            long entityId) {
        this.adExtensionId = adExtensionId;
        this.entityId = entityId;
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
     * Gets the adExtensionId value for this AdExtensionIdToEntityIdAssociation.
     *
     * @return adExtensionId
     */
    public long getAdExtensionId() {
        return adExtensionId;
    }

    /**
     * Sets the adExtensionId value for this AdExtensionIdToEntityIdAssociation.
     *
     * @param adExtensionId
     */
    public void setAdExtensionId(long adExtensionId) {
        this.adExtensionId = adExtensionId;
    }

    /**
     * Gets the entityId value for this AdExtensionIdToEntityIdAssociation.
     *
     * @return entityId
     */
    public long getEntityId() {
        return entityId;
    }

    /**
     * Sets the entityId value for this AdExtensionIdToEntityIdAssociation.
     *
     * @param entityId
     */
    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtensionIdToEntityIdAssociation)) return false;
        AdExtensionIdToEntityIdAssociation other = (AdExtensionIdToEntityIdAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.adExtensionId == other.getAdExtensionId() &&
                this.entityId == other.getEntityId();
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getAdExtensionId()).hashCode();
        _hashCode += new Long(getEntityId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
