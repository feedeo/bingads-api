/**
 * GetCustomerPilotFeaturesResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class GetCustomerPilotFeaturesResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetCustomerPilotFeaturesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomerPilotFeaturesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featurePilotFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "FeaturePilotFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
    }

    private int[] featurePilotFlags;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetCustomerPilotFeaturesResponse() {
    }

    public GetCustomerPilotFeaturesResponse(
            int[] featurePilotFlags) {
        this.featurePilotFlags = featurePilotFlags;
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
     * Gets the featurePilotFlags value for this GetCustomerPilotFeaturesResponse.
     *
     * @return featurePilotFlags
     */
    public int[] getFeaturePilotFlags() {
        return featurePilotFlags;
    }

    /**
     * Sets the featurePilotFlags value for this GetCustomerPilotFeaturesResponse.
     *
     * @param featurePilotFlags
     */
    public void setFeaturePilotFlags(int[] featurePilotFlags) {
        this.featurePilotFlags = featurePilotFlags;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCustomerPilotFeaturesResponse)) return false;
        GetCustomerPilotFeaturesResponse other = (GetCustomerPilotFeaturesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.featurePilotFlags == null && other.getFeaturePilotFlags() == null) ||
                        (this.featurePilotFlags != null &&
                                java.util.Arrays.equals(this.featurePilotFlags, other.getFeaturePilotFlags())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFeaturePilotFlags() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFeaturePilotFlags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeaturePilotFlags(), i);
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
