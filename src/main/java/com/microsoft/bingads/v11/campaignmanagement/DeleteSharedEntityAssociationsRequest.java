/**
 * DeleteSharedEntityAssociationsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DeleteSharedEntityAssociationsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DeleteSharedEntityAssociationsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteSharedEntityAssociationsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Associations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntityAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntityAssociation"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.SharedEntityAssociation[] associations;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public DeleteSharedEntityAssociationsRequest() {
    }

    public DeleteSharedEntityAssociationsRequest(
            com.microsoft.bingads.v11.campaignmanagement.SharedEntityAssociation[] associations) {
        this.associations = associations;
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
     * Gets the associations value for this DeleteSharedEntityAssociationsRequest.
     *
     * @return associations
     */
    public com.microsoft.bingads.v11.campaignmanagement.SharedEntityAssociation[] getAssociations() {
        return associations;
    }

    /**
     * Sets the associations value for this DeleteSharedEntityAssociationsRequest.
     *
     * @param associations
     */
    public void setAssociations(com.microsoft.bingads.v11.campaignmanagement.SharedEntityAssociation[] associations) {
        this.associations = associations;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteSharedEntityAssociationsRequest)) return false;
        DeleteSharedEntityAssociationsRequest other = (DeleteSharedEntityAssociationsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.associations == null && other.getAssociations() == null) ||
                        (this.associations != null &&
                                java.util.Arrays.equals(this.associations, other.getAssociations())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAssociations() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAssociations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociations(), i);
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
