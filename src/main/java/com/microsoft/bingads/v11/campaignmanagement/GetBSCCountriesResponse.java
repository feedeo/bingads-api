/**
 * GetBSCCountriesResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetBSCCountriesResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetBSCCountriesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetBSCCountriesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CountryCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String[] countryCodes;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetBSCCountriesResponse() {
    }

    public GetBSCCountriesResponse(
            java.lang.String[] countryCodes) {
        this.countryCodes = countryCodes;
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
     * Gets the countryCodes value for this GetBSCCountriesResponse.
     *
     * @return countryCodes
     */
    public java.lang.String[] getCountryCodes() {
        return countryCodes;
    }

    /**
     * Sets the countryCodes value for this GetBSCCountriesResponse.
     *
     * @param countryCodes
     */
    public void setCountryCodes(java.lang.String[] countryCodes) {
        this.countryCodes = countryCodes;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBSCCountriesResponse)) return false;
        GetBSCCountriesResponse other = (GetBSCCountriesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.countryCodes == null && other.getCountryCodes() == null) ||
                        (this.countryCodes != null &&
                                java.util.Arrays.equals(this.countryCodes, other.getCountryCodes())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCountryCodes() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCountryCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryCodes(), i);
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
