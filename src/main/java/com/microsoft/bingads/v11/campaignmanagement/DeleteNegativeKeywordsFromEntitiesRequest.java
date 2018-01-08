/**
 * DeleteNegativeKeywordsFromEntitiesRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DeleteNegativeKeywordsFromEntitiesRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DeleteNegativeKeywordsFromEntitiesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteNegativeKeywordsFromEntitiesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityNegativeKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityNegativeKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityNegativeKeyword"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityNegativeKeyword"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.EntityNegativeKeyword[] entityNegativeKeywords;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public DeleteNegativeKeywordsFromEntitiesRequest() {
    }

    public DeleteNegativeKeywordsFromEntitiesRequest(
            com.microsoft.bingads.v11.campaignmanagement.EntityNegativeKeyword[] entityNegativeKeywords) {
        this.entityNegativeKeywords = entityNegativeKeywords;
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
     * Gets the entityNegativeKeywords value for this DeleteNegativeKeywordsFromEntitiesRequest.
     *
     * @return entityNegativeKeywords
     */
    public com.microsoft.bingads.v11.campaignmanagement.EntityNegativeKeyword[] getEntityNegativeKeywords() {
        return entityNegativeKeywords;
    }

    /**
     * Sets the entityNegativeKeywords value for this DeleteNegativeKeywordsFromEntitiesRequest.
     *
     * @param entityNegativeKeywords
     */
    public void setEntityNegativeKeywords(com.microsoft.bingads.v11.campaignmanagement.EntityNegativeKeyword[] entityNegativeKeywords) {
        this.entityNegativeKeywords = entityNegativeKeywords;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteNegativeKeywordsFromEntitiesRequest)) return false;
        DeleteNegativeKeywordsFromEntitiesRequest other = (DeleteNegativeKeywordsFromEntitiesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.entityNegativeKeywords == null && other.getEntityNegativeKeywords() == null) ||
                        (this.entityNegativeKeywords != null &&
                                java.util.Arrays.equals(this.entityNegativeKeywords, other.getEntityNegativeKeywords())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEntityNegativeKeywords() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getEntityNegativeKeywords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityNegativeKeywords(), i);
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
