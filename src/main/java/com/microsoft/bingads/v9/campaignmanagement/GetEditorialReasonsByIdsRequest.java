/**
 * GetEditorialReasonsByIdsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class GetEditorialReasonsByIdsRequest  implements java.io.Serializable {
    private java.lang.Long accountId;

    private long[] entityIds;

    private com.microsoft.bingads.v9.campaignmanagement.EntityType entityType;

    public GetEditorialReasonsByIdsRequest() {
    }

    public GetEditorialReasonsByIdsRequest(
           java.lang.Long accountId,
           long[] entityIds,
           com.microsoft.bingads.v9.campaignmanagement.EntityType entityType) {
           this.accountId = accountId;
           this.entityIds = entityIds;
           this.entityType = entityType;
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
     * Gets the entityIds value for this GetEditorialReasonsByIdsRequest.
     * 
     * @return entityIds
     */
    public long[] getEntityIds() {
        return entityIds;
    }


    /**
     * Sets the entityIds value for this GetEditorialReasonsByIdsRequest.
     * 
     * @param entityIds
     */
    public void setEntityIds(long[] entityIds) {
        this.entityIds = entityIds;
    }


    /**
     * Gets the entityType value for this GetEditorialReasonsByIdsRequest.
     * 
     * @return entityType
     */
    public com.microsoft.bingads.v9.campaignmanagement.EntityType getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this GetEditorialReasonsByIdsRequest.
     * 
     * @param entityType
     */
    public void setEntityType(com.microsoft.bingads.v9.campaignmanagement.EntityType entityType) {
        this.entityType = entityType;
    }

    private java.lang.Object __equalsCalc = null;
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
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.entityIds==null && other.getEntityIds()==null) || 
             (this.entityIds!=null &&
              java.util.Arrays.equals(this.entityIds, other.getEntityIds()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType())));
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
        if (getEntityIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityIds());
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEditorialReasonsByIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetEditorialReasonsByIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EntityIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EntityType"));
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
