/**
 * GetCustomerPilotFeaturesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class GetCustomerPilotFeaturesResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfint featurePilotFlags;

    public GetCustomerPilotFeaturesResponse() {
    }

    public GetCustomerPilotFeaturesResponse(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfint featurePilotFlags) {
           this.featurePilotFlags = featurePilotFlags;
    }


    /**
     * Gets the featurePilotFlags value for this GetCustomerPilotFeaturesResponse.
     * 
     * @return featurePilotFlags
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfint getFeaturePilotFlags() {
        return featurePilotFlags;
    }


    /**
     * Sets the featurePilotFlags value for this GetCustomerPilotFeaturesResponse.
     * 
     * @param featurePilotFlags
     */
    public void setFeaturePilotFlags(com.microsoft.bingads.v9.schemas.arrays.ArrayOfint featurePilotFlags) {
        this.featurePilotFlags = featurePilotFlags;
    }

    private java.lang.Object __equalsCalc = null;
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
            ((this.featurePilotFlags==null && other.getFeaturePilotFlags()==null) || 
             (this.featurePilotFlags!=null &&
              this.featurePilotFlags.equals(other.getFeaturePilotFlags())));
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
        if (getFeaturePilotFlags() != null) {
            _hashCode += getFeaturePilotFlags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerPilotFeaturesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", ">GetCustomerPilotFeaturesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featurePilotFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "FeaturePilotFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
