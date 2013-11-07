/**
 * DeleteAdExtensionsAssociationsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class DeleteAdExtensionsAssociationsRequest  implements java.io.Serializable {
    private java.lang.Long accountId;

    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociations;

    private com.microsoft.bingads.v9.campaignmanagement.AssociationType associationType;

    public DeleteAdExtensionsAssociationsRequest() {
    }

    public DeleteAdExtensionsAssociationsRequest(
           java.lang.Long accountId,
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociations,
           com.microsoft.bingads.v9.campaignmanagement.AssociationType associationType) {
           this.accountId = accountId;
           this.adExtensionIdToEntityIdAssociations = adExtensionIdToEntityIdAssociations;
           this.associationType = associationType;
    }


    /**
     * Gets the accountId value for this DeleteAdExtensionsAssociationsRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this DeleteAdExtensionsAssociationsRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the adExtensionIdToEntityIdAssociations value for this DeleteAdExtensionsAssociationsRequest.
     * 
     * @return adExtensionIdToEntityIdAssociations
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionIdToEntityIdAssociation getAdExtensionIdToEntityIdAssociations() {
        return adExtensionIdToEntityIdAssociations;
    }


    /**
     * Sets the adExtensionIdToEntityIdAssociations value for this DeleteAdExtensionsAssociationsRequest.
     * 
     * @param adExtensionIdToEntityIdAssociations
     */
    public void setAdExtensionIdToEntityIdAssociations(com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociations) {
        this.adExtensionIdToEntityIdAssociations = adExtensionIdToEntityIdAssociations;
    }


    /**
     * Gets the associationType value for this DeleteAdExtensionsAssociationsRequest.
     * 
     * @return associationType
     */
    public com.microsoft.bingads.v9.campaignmanagement.AssociationType getAssociationType() {
        return associationType;
    }


    /**
     * Sets the associationType value for this DeleteAdExtensionsAssociationsRequest.
     * 
     * @param associationType
     */
    public void setAssociationType(com.microsoft.bingads.v9.campaignmanagement.AssociationType associationType) {
        this.associationType = associationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteAdExtensionsAssociationsRequest)) return false;
        DeleteAdExtensionsAssociationsRequest other = (DeleteAdExtensionsAssociationsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.adExtensionIdToEntityIdAssociations==null && other.getAdExtensionIdToEntityIdAssociations()==null) || 
             (this.adExtensionIdToEntityIdAssociations!=null &&
              this.adExtensionIdToEntityIdAssociations.equals(other.getAdExtensionIdToEntityIdAssociations()))) &&
            ((this.associationType==null && other.getAssociationType()==null) || 
             (this.associationType!=null &&
              this.associationType.equals(other.getAssociationType())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAdExtensionIdToEntityIdAssociations() != null) {
            _hashCode += getAdExtensionIdToEntityIdAssociations().hashCode();
        }
        if (getAssociationType() != null) {
            _hashCode += getAssociationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteAdExtensionsAssociationsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">DeleteAdExtensionsAssociationsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionIdToEntityIdAssociations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionIdToEntityIdAssociations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionIdToEntityIdAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AssociationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AssociationType"));
        elemField.setMinOccurs(0);
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
