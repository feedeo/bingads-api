/**
 * SharedEntityAssociation.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class SharedEntityAssociation implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SharedEntityAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntityAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedEntityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedEntityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private long entityId;
    private java.lang.String entityType;
    private long sharedEntityId;
    private java.lang.String sharedEntityType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public SharedEntityAssociation() {
    }


    public SharedEntityAssociation(
            long entityId,
            java.lang.String entityType,
            long sharedEntityId,
            java.lang.String sharedEntityType) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.sharedEntityId = sharedEntityId;
        this.sharedEntityType = sharedEntityType;
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
     * Gets the entityId value for this SharedEntityAssociation.
     *
     * @return entityId
     */
    public long getEntityId() {
        return entityId;
    }

    /**
     * Sets the entityId value for this SharedEntityAssociation.
     *
     * @param entityId
     */
    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    /**
     * Gets the entityType value for this SharedEntityAssociation.
     *
     * @return entityType
     */
    public java.lang.String getEntityType() {
        return entityType;
    }

    /**
     * Sets the entityType value for this SharedEntityAssociation.
     *
     * @param entityType
     */
    public void setEntityType(java.lang.String entityType) {
        this.entityType = entityType;
    }

    /**
     * Gets the sharedEntityId value for this SharedEntityAssociation.
     *
     * @return sharedEntityId
     */
    public long getSharedEntityId() {
        return sharedEntityId;
    }

    /**
     * Sets the sharedEntityId value for this SharedEntityAssociation.
     *
     * @param sharedEntityId
     */
    public void setSharedEntityId(long sharedEntityId) {
        this.sharedEntityId = sharedEntityId;
    }

    /**
     * Gets the sharedEntityType value for this SharedEntityAssociation.
     *
     * @return sharedEntityType
     */
    public java.lang.String getSharedEntityType() {
        return sharedEntityType;
    }

    /**
     * Sets the sharedEntityType value for this SharedEntityAssociation.
     *
     * @param sharedEntityType
     */
    public void setSharedEntityType(java.lang.String sharedEntityType) {
        this.sharedEntityType = sharedEntityType;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedEntityAssociation)) return false;
        SharedEntityAssociation other = (SharedEntityAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.entityId == other.getEntityId() &&
                ((this.entityType == null && other.getEntityType() == null) ||
                        (this.entityType != null &&
                                this.entityType.equals(other.getEntityType()))) &&
                this.sharedEntityId == other.getSharedEntityId() &&
                ((this.sharedEntityType == null && other.getSharedEntityType() == null) ||
                        (this.sharedEntityType != null &&
                                this.sharedEntityType.equals(other.getSharedEntityType())));
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
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        _hashCode += new Long(getSharedEntityId()).hashCode();
        if (getSharedEntityType() != null) {
            _hashCode += getSharedEntityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
