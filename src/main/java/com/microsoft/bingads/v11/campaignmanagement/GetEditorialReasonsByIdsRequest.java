/**
 * GetEditorialReasonsByIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetEditorialReasonsByIdsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetEditorialReasonsByIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetEditorialReasonsByIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
    }

    private java.lang.Long accountId;
    private com.microsoft.bingads.v11.datacontracts.EntityIdToParentIdAssociation[] entityIdToParentIdAssociations;
    private com.microsoft.bingads.v11.campaignmanagement.EntityType entityType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetEditorialReasonsByIdsRequest() {
    }


    public GetEditorialReasonsByIdsRequest(
            java.lang.Long accountId,
            com.microsoft.bingads.v11.datacontracts.EntityIdToParentIdAssociation[] entityIdToParentIdAssociations,
            com.microsoft.bingads.v11.campaignmanagement.EntityType entityType) {
        this.accountId = accountId;
        this.entityIdToParentIdAssociations = entityIdToParentIdAssociations;
        this.entityType = entityType;
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
     * Gets the accountId value for this GetEditorialReasonsByIdsRequest.
     *
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the accountId value for this GetEditorialReasonsByIdsRequest.
     *
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the entityIdToParentIdAssociations value for this GetEditorialReasonsByIdsRequest.
     *
     * @return entityIdToParentIdAssociations
     */
    public com.microsoft.bingads.v11.datacontracts.EntityIdToParentIdAssociation[] getEntityIdToParentIdAssociations() {
        return entityIdToParentIdAssociations;
    }

    /**
     * Sets the entityIdToParentIdAssociations value for this GetEditorialReasonsByIdsRequest.
     *
     * @param entityIdToParentIdAssociations
     */
    public void setEntityIdToParentIdAssociations(com.microsoft.bingads.v11.datacontracts.EntityIdToParentIdAssociation[] entityIdToParentIdAssociations) {
        this.entityIdToParentIdAssociations = entityIdToParentIdAssociations;
    }

    /**
     * Gets the entityType value for this GetEditorialReasonsByIdsRequest.
     *
     * @return entityType
     */
    public com.microsoft.bingads.v11.campaignmanagement.EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the entityType value for this GetEditorialReasonsByIdsRequest.
     *
     * @param entityType
     */
    public void setEntityType(com.microsoft.bingads.v11.campaignmanagement.EntityType entityType) {
        this.entityType = entityType;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEditorialReasonsByIdsRequest)) return false;
        GetEditorialReasonsByIdsRequest other = (GetEditorialReasonsByIdsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accountId == null && other.getAccountId() == null) ||
                        (this.accountId != null &&
                                this.accountId.equals(other.getAccountId()))) &&
                ((this.entityIdToParentIdAssociations == null && other.getEntityIdToParentIdAssociations() == null) ||
                        (this.entityIdToParentIdAssociations != null &&
                                java.util.Arrays.equals(this.entityIdToParentIdAssociations, other.getEntityIdToParentIdAssociations()))) &&
                ((this.entityType == null && other.getEntityType() == null) ||
                        (this.entityType != null &&
                                this.entityType.equals(other.getEntityType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
