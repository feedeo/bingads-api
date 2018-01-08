/**
 * GetSharedEntityAssociationsByEntityIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetSharedEntityAssociationsByEntityIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetSharedEntityAssociationsByEntityIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetSharedEntityAssociationsByEntityIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedEntityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private long[] entityIds;
    private java.lang.String entityType;
    private java.lang.String sharedEntityType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetSharedEntityAssociationsByEntityIdsRequest() {
    }


    public GetSharedEntityAssociationsByEntityIdsRequest(
            long[] entityIds,
            java.lang.String entityType,
            java.lang.String sharedEntityType) {
        this.entityIds = entityIds;
        this.entityType = entityType;
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
     * Gets the entityIds value for this GetSharedEntityAssociationsByEntityIdsRequest.
     *
     * @return entityIds
     */
    public long[] getEntityIds() {
        return entityIds;
    }

    /**
     * Sets the entityIds value for this GetSharedEntityAssociationsByEntityIdsRequest.
     *
     * @param entityIds
     */
    public void setEntityIds(long[] entityIds) {
        this.entityIds = entityIds;
    }

    /**
     * Gets the entityType value for this GetSharedEntityAssociationsByEntityIdsRequest.
     *
     * @return entityType
     */
    public java.lang.String getEntityType() {
        return entityType;
    }

    /**
     * Sets the entityType value for this GetSharedEntityAssociationsByEntityIdsRequest.
     *
     * @param entityType
     */
    public void setEntityType(java.lang.String entityType) {
        this.entityType = entityType;
    }

    /**
     * Gets the sharedEntityType value for this GetSharedEntityAssociationsByEntityIdsRequest.
     *
     * @return sharedEntityType
     */
    public java.lang.String getSharedEntityType() {
        return sharedEntityType;
    }

    /**
     * Sets the sharedEntityType value for this GetSharedEntityAssociationsByEntityIdsRequest.
     *
     * @param sharedEntityType
     */
    public void setSharedEntityType(java.lang.String sharedEntityType) {
        this.sharedEntityType = sharedEntityType;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSharedEntityAssociationsByEntityIdsRequest)) return false;
        GetSharedEntityAssociationsByEntityIdsRequest other = (GetSharedEntityAssociationsByEntityIdsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.entityIds == null && other.getEntityIds() == null) ||
                        (this.entityIds != null &&
                                java.util.Arrays.equals(this.entityIds, other.getEntityIds()))) &&
                ((this.entityType == null && other.getEntityType() == null) ||
                        (this.entityType != null &&
                                this.entityType.equals(other.getEntityType()))) &&
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
        if (getEntityIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getEntityIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getSharedEntityType() != null) {
            _hashCode += getSharedEntityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
