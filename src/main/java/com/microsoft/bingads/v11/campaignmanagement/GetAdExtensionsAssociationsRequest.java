/**
 * GetAdExtensionsAssociationsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetAdExtensionsAssociationsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetAdExtensionsAssociationsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAdExtensionsAssociationsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionsTypeFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AssociationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AssociationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long accountId;
    private java.lang.String[] adExtensionType;
    private com.microsoft.bingads.v11.campaignmanagement.AssociationType associationType;
    private long[] entityIds;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetAdExtensionsAssociationsRequest() {
    }


    public GetAdExtensionsAssociationsRequest(
            java.lang.Long accountId,
            java.lang.String[] adExtensionType,
            com.microsoft.bingads.v11.campaignmanagement.AssociationType associationType,
            long[] entityIds) {
        this.accountId = accountId;
        this.adExtensionType = adExtensionType;
        this.associationType = associationType;
        this.entityIds = entityIds;
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
     * Gets the accountId value for this GetAdExtensionsAssociationsRequest.
     *
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the accountId value for this GetAdExtensionsAssociationsRequest.
     *
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the adExtensionType value for this GetAdExtensionsAssociationsRequest.
     *
     * @return adExtensionType
     */
    public java.lang.String[] getAdExtensionType() {
        return adExtensionType;
    }

    /**
     * Sets the adExtensionType value for this GetAdExtensionsAssociationsRequest.
     *
     * @param adExtensionType
     */
    public void setAdExtensionType(java.lang.String[] adExtensionType) {
        this.adExtensionType = adExtensionType;
    }

    /**
     * Gets the associationType value for this GetAdExtensionsAssociationsRequest.
     *
     * @return associationType
     */
    public com.microsoft.bingads.v11.campaignmanagement.AssociationType getAssociationType() {
        return associationType;
    }

    /**
     * Sets the associationType value for this GetAdExtensionsAssociationsRequest.
     *
     * @param associationType
     */
    public void setAssociationType(com.microsoft.bingads.v11.campaignmanagement.AssociationType associationType) {
        this.associationType = associationType;
    }

    /**
     * Gets the entityIds value for this GetAdExtensionsAssociationsRequest.
     *
     * @return entityIds
     */
    public long[] getEntityIds() {
        return entityIds;
    }

    /**
     * Sets the entityIds value for this GetAdExtensionsAssociationsRequest.
     *
     * @param entityIds
     */
    public void setEntityIds(long[] entityIds) {
        this.entityIds = entityIds;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAdExtensionsAssociationsRequest)) return false;
        GetAdExtensionsAssociationsRequest other = (GetAdExtensionsAssociationsRequest) obj;
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
                ((this.adExtensionType == null && other.getAdExtensionType() == null) ||
                        (this.adExtensionType != null &&
                                java.util.Arrays.equals(this.adExtensionType, other.getAdExtensionType()))) &&
                ((this.associationType == null && other.getAssociationType() == null) ||
                        (this.associationType != null &&
                                this.associationType.equals(other.getAssociationType()))) &&
                ((this.entityIds == null && other.getEntityIds() == null) ||
                        (this.entityIds != null &&
                                java.util.Arrays.equals(this.entityIds, other.getEntityIds())));
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
        if (getAdExtensionType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdExtensionType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensionType(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssociationType() != null) {
            _hashCode += getAssociationType().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
