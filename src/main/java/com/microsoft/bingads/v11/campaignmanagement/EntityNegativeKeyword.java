/**
 * EntityNegativeKeyword.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class EntityNegativeKeyword implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(EntityNegativeKeyword.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityNegativeKeyword"));
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
        elemField.setFieldName("negativeKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NegativeKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NegativeKeyword"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NegativeKeyword"));
        typeDesc.addFieldDesc(elemField);
    }

    private long entityId;
    private java.lang.String entityType;
    private com.microsoft.bingads.v11.campaignmanagement.NegativeKeyword[] negativeKeywords;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public EntityNegativeKeyword() {
    }


    public EntityNegativeKeyword(
            long entityId,
            java.lang.String entityType,
            com.microsoft.bingads.v11.campaignmanagement.NegativeKeyword[] negativeKeywords) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.negativeKeywords = negativeKeywords;
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
     * Gets the entityId value for this EntityNegativeKeyword.
     *
     * @return entityId
     */
    public long getEntityId() {
        return entityId;
    }

    /**
     * Sets the entityId value for this EntityNegativeKeyword.
     *
     * @param entityId
     */
    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    /**
     * Gets the entityType value for this EntityNegativeKeyword.
     *
     * @return entityType
     */
    public java.lang.String getEntityType() {
        return entityType;
    }

    /**
     * Sets the entityType value for this EntityNegativeKeyword.
     *
     * @param entityType
     */
    public void setEntityType(java.lang.String entityType) {
        this.entityType = entityType;
    }

    /**
     * Gets the negativeKeywords value for this EntityNegativeKeyword.
     *
     * @return negativeKeywords
     */
    public com.microsoft.bingads.v11.campaignmanagement.NegativeKeyword[] getNegativeKeywords() {
        return negativeKeywords;
    }

    /**
     * Sets the negativeKeywords value for this EntityNegativeKeyword.
     *
     * @param negativeKeywords
     */
    public void setNegativeKeywords(com.microsoft.bingads.v11.campaignmanagement.NegativeKeyword[] negativeKeywords) {
        this.negativeKeywords = negativeKeywords;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityNegativeKeyword)) return false;
        EntityNegativeKeyword other = (EntityNegativeKeyword) obj;
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
                ((this.negativeKeywords == null && other.getNegativeKeywords() == null) ||
                        (this.negativeKeywords != null &&
                                java.util.Arrays.equals(this.negativeKeywords, other.getNegativeKeywords())));
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
        if (getNegativeKeywords() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getNegativeKeywords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegativeKeywords(), i);
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
