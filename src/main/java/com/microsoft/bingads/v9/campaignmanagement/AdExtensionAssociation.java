/**
 * AdExtensionAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class AdExtensionAssociation  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AdExtension adExtension;

    private com.microsoft.bingads.v9.campaignmanagement.AssociationType associationType;

    private com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialStatus editorialStatus;

    private long entityId;

    public AdExtensionAssociation() {
    }

    public AdExtensionAssociation(
           com.microsoft.bingads.v9.campaignmanagement.AdExtension adExtension,
           com.microsoft.bingads.v9.campaignmanagement.AssociationType associationType,
           com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialStatus editorialStatus,
           long entityId) {
           this.adExtension = adExtension;
           this.associationType = associationType;
           this.editorialStatus = editorialStatus;
           this.entityId = entityId;
    }


    /**
     * Gets the adExtension value for this AdExtensionAssociation.
     * 
     * @return adExtension
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdExtension getAdExtension() {
        return adExtension;
    }


    /**
     * Sets the adExtension value for this AdExtensionAssociation.
     * 
     * @param adExtension
     */
    public void setAdExtension(com.microsoft.bingads.v9.campaignmanagement.AdExtension adExtension) {
        this.adExtension = adExtension;
    }


    /**
     * Gets the associationType value for this AdExtensionAssociation.
     * 
     * @return associationType
     */
    public com.microsoft.bingads.v9.campaignmanagement.AssociationType getAssociationType() {
        return associationType;
    }


    /**
     * Sets the associationType value for this AdExtensionAssociation.
     * 
     * @param associationType
     */
    public void setAssociationType(com.microsoft.bingads.v9.campaignmanagement.AssociationType associationType) {
        this.associationType = associationType;
    }


    /**
     * Gets the editorialStatus value for this AdExtensionAssociation.
     * 
     * @return editorialStatus
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }


    /**
     * Sets the editorialStatus value for this AdExtensionAssociation.
     * 
     * @param editorialStatus
     */
    public void setEditorialStatus(com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialStatus editorialStatus) {
        this.editorialStatus = editorialStatus;
    }


    /**
     * Gets the entityId value for this AdExtensionAssociation.
     * 
     * @return entityId
     */
    public long getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this AdExtensionAssociation.
     * 
     * @param entityId
     */
    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtensionAssociation)) return false;
        AdExtensionAssociation other = (AdExtensionAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExtension==null && other.getAdExtension()==null) || 
             (this.adExtension!=null &&
              this.adExtension.equals(other.getAdExtension()))) &&
            ((this.associationType==null && other.getAssociationType()==null) || 
             (this.associationType!=null &&
              this.associationType.equals(other.getAssociationType()))) &&
            ((this.editorialStatus==null && other.getEditorialStatus()==null) || 
             (this.editorialStatus!=null &&
              this.editorialStatus.equals(other.getEditorialStatus()))) &&
            this.entityId == other.getEntityId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdExtension() != null) {
            _hashCode += getAdExtension().hashCode();
        }
        if (getAssociationType() != null) {
            _hashCode += getAssociationType().hashCode();
        }
        if (getEditorialStatus() != null) {
            _hashCode += getEditorialStatus().hashCode();
        }
        _hashCode += new Long(getEntityId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdExtensionAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtension"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AssociationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AssociationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionEditorialStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
          new  org.apache.axis.encoding.ser.BeanSerializer(
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
