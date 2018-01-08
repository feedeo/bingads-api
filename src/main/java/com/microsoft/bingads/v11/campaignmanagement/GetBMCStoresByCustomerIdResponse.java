/**
 * GetBMCStoresByCustomerIdResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetBMCStoresByCustomerIdResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetBMCStoresByCustomerIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBMCStoresByCustomerIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BMCStores");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BMCStores"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BMCStore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BMCStore"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.BMCStore[] BMCStores;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetBMCStoresByCustomerIdResponse() {
    }

    public GetBMCStoresByCustomerIdResponse(
            com.microsoft.bingads.v11.campaignmanagement.BMCStore[] BMCStores) {
        this.BMCStores = BMCStores;
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
     * Gets the BMCStores value for this GetBMCStoresByCustomerIdResponse.
     *
     * @return BMCStores
     */
    public com.microsoft.bingads.v11.campaignmanagement.BMCStore[] getBMCStores() {
        return BMCStores;
    }

    /**
     * Sets the BMCStores value for this GetBMCStoresByCustomerIdResponse.
     *
     * @param BMCStores
     */
    public void setBMCStores(com.microsoft.bingads.v11.campaignmanagement.BMCStore[] BMCStores) {
        this.BMCStores = BMCStores;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBMCStoresByCustomerIdResponse)) return false;
        GetBMCStoresByCustomerIdResponse other = (GetBMCStoresByCustomerIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.BMCStores == null && other.getBMCStores() == null) ||
                        (this.BMCStores != null &&
                                java.util.Arrays.equals(this.BMCStores, other.getBMCStores())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBMCStores() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBMCStores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBMCStores(), i);
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
