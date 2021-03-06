/**
 * GetAccountPropertiesRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetAccountPropertiesRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetAccountPropertiesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetAccountPropertiesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPropertyNames");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountPropertyNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountPropertyName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountPropertyName"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.AccountPropertyName[] accountPropertyNames;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetAccountPropertiesRequest() {
    }

    public GetAccountPropertiesRequest(
            com.microsoft.bingads.v11.campaignmanagement.AccountPropertyName[] accountPropertyNames) {
        this.accountPropertyNames = accountPropertyNames;
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
     * Gets the accountPropertyNames value for this GetAccountPropertiesRequest.
     *
     * @return accountPropertyNames
     */
    public com.microsoft.bingads.v11.campaignmanagement.AccountPropertyName[] getAccountPropertyNames() {
        return accountPropertyNames;
    }

    /**
     * Sets the accountPropertyNames value for this GetAccountPropertiesRequest.
     *
     * @param accountPropertyNames
     */
    public void setAccountPropertyNames(com.microsoft.bingads.v11.campaignmanagement.AccountPropertyName[] accountPropertyNames) {
        this.accountPropertyNames = accountPropertyNames;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountPropertiesRequest)) return false;
        GetAccountPropertiesRequest other = (GetAccountPropertiesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accountPropertyNames == null && other.getAccountPropertyNames() == null) ||
                        (this.accountPropertyNames != null &&
                                java.util.Arrays.equals(this.accountPropertyNames, other.getAccountPropertyNames())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountPropertyNames() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAccountPropertyNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountPropertyNames(), i);
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
