/**
 * MediaAssociation.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class MediaAssociation implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(MediaAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaEnabledEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaEnabledEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaEnabledEntityFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long entityId;
    private java.lang.String[] mediaEnabledEntity;
    private java.lang.Long mediaId;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public MediaAssociation() {
    }


    public MediaAssociation(
            java.lang.Long entityId,
            java.lang.String[] mediaEnabledEntity,
            java.lang.Long mediaId) {
        this.entityId = entityId;
        this.mediaEnabledEntity = mediaEnabledEntity;
        this.mediaId = mediaId;
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
     * Gets the entityId value for this MediaAssociation.
     *
     * @return entityId
     */
    public java.lang.Long getEntityId() {
        return entityId;
    }

    /**
     * Sets the entityId value for this MediaAssociation.
     *
     * @param entityId
     */
    public void setEntityId(java.lang.Long entityId) {
        this.entityId = entityId;
    }

    /**
     * Gets the mediaEnabledEntity value for this MediaAssociation.
     *
     * @return mediaEnabledEntity
     */
    public java.lang.String[] getMediaEnabledEntity() {
        return mediaEnabledEntity;
    }

    /**
     * Sets the mediaEnabledEntity value for this MediaAssociation.
     *
     * @param mediaEnabledEntity
     */
    public void setMediaEnabledEntity(java.lang.String[] mediaEnabledEntity) {
        this.mediaEnabledEntity = mediaEnabledEntity;
    }

    /**
     * Gets the mediaId value for this MediaAssociation.
     *
     * @return mediaId
     */
    public java.lang.Long getMediaId() {
        return mediaId;
    }

    /**
     * Sets the mediaId value for this MediaAssociation.
     *
     * @param mediaId
     */
    public void setMediaId(java.lang.Long mediaId) {
        this.mediaId = mediaId;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MediaAssociation)) return false;
        MediaAssociation other = (MediaAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.entityId == null && other.getEntityId() == null) ||
                        (this.entityId != null &&
                                this.entityId.equals(other.getEntityId()))) &&
                ((this.mediaEnabledEntity == null && other.getMediaEnabledEntity() == null) ||
                        (this.mediaEnabledEntity != null &&
                                java.util.Arrays.equals(this.mediaEnabledEntity, other.getMediaEnabledEntity()))) &&
                ((this.mediaId == null && other.getMediaId() == null) ||
                        (this.mediaId != null &&
                                this.mediaId.equals(other.getMediaId())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getMediaEnabledEntity() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getMediaEnabledEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMediaEnabledEntity(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMediaId() != null) {
            _hashCode += getMediaId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
