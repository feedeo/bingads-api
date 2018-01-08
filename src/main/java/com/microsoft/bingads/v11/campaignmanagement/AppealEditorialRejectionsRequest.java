/**
 * AppealEditorialRejectionsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AppealEditorialRejectionsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AppealEditorialRejectionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AppealEditorialRejectionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIdToParentIdAssociations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityIdToParentIdAssociations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "EntityIdToParentIdAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "EntityIdToParentIdAssociation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificationText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "JustificationText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.datacontracts.EntityIdToParentIdAssociation[] entityIdToParentIdAssociations;
    private com.microsoft.bingads.v11.campaignmanagement.EntityType entityType;
    private java.lang.String justificationText;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AppealEditorialRejectionsRequest() {
    }


    public AppealEditorialRejectionsRequest(
            com.microsoft.bingads.v11.datacontracts.EntityIdToParentIdAssociation[] entityIdToParentIdAssociations,
            com.microsoft.bingads.v11.campaignmanagement.EntityType entityType,
            java.lang.String justificationText) {
        this.entityIdToParentIdAssociations = entityIdToParentIdAssociations;
        this.entityType = entityType;
        this.justificationText = justificationText;
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
     * Gets the entityIdToParentIdAssociations value for this AppealEditorialRejectionsRequest.
     *
     * @return entityIdToParentIdAssociations
     */
    public com.microsoft.bingads.v11.datacontracts.EntityIdToParentIdAssociation[] getEntityIdToParentIdAssociations() {
        return entityIdToParentIdAssociations;
    }

    /**
     * Sets the entityIdToParentIdAssociations value for this AppealEditorialRejectionsRequest.
     *
     * @param entityIdToParentIdAssociations
     */
    public void setEntityIdToParentIdAssociations(com.microsoft.bingads.v11.datacontracts.EntityIdToParentIdAssociation[] entityIdToParentIdAssociations) {
        this.entityIdToParentIdAssociations = entityIdToParentIdAssociations;
    }

    /**
     * Gets the entityType value for this AppealEditorialRejectionsRequest.
     *
     * @return entityType
     */
    public com.microsoft.bingads.v11.campaignmanagement.EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the entityType value for this AppealEditorialRejectionsRequest.
     *
     * @param entityType
     */
    public void setEntityType(com.microsoft.bingads.v11.campaignmanagement.EntityType entityType) {
        this.entityType = entityType;
    }

    /**
     * Gets the justificationText value for this AppealEditorialRejectionsRequest.
     *
     * @return justificationText
     */
    public java.lang.String getJustificationText() {
        return justificationText;
    }

    /**
     * Sets the justificationText value for this AppealEditorialRejectionsRequest.
     *
     * @param justificationText
     */
    public void setJustificationText(java.lang.String justificationText) {
        this.justificationText = justificationText;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppealEditorialRejectionsRequest)) return false;
        AppealEditorialRejectionsRequest other = (AppealEditorialRejectionsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.entityIdToParentIdAssociations == null && other.getEntityIdToParentIdAssociations() == null) ||
                        (this.entityIdToParentIdAssociations != null &&
                                java.util.Arrays.equals(this.entityIdToParentIdAssociations, other.getEntityIdToParentIdAssociations()))) &&
                ((this.entityType == null && other.getEntityType() == null) ||
                        (this.entityType != null &&
                                this.entityType.equals(other.getEntityType()))) &&
                ((this.justificationText == null && other.getJustificationText() == null) ||
                        (this.justificationText != null &&
                                this.justificationText.equals(other.getJustificationText())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEntityIdToParentIdAssociations() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getEntityIdToParentIdAssociations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityIdToParentIdAssociations(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getJustificationText() != null) {
            _hashCode += getJustificationText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
