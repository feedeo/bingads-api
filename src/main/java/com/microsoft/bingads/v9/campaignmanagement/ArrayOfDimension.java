/**
 * ArrayOfDimension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfDimension  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.Dimension[] dimension;

    public ArrayOfDimension() {
    }

    public ArrayOfDimension(
           com.microsoft.bingads.v9.campaignmanagement.Dimension[] dimension) {
           this.dimension = dimension;
    }


    /**
     * Gets the dimension value for this ArrayOfDimension.
     * 
     * @return dimension
     */
    public com.microsoft.bingads.v9.campaignmanagement.Dimension[] getDimension() {
        return dimension;
    }


    /**
     * Sets the dimension value for this ArrayOfDimension.
     * 
     * @param dimension
     */
    public void setDimension(com.microsoft.bingads.v9.campaignmanagement.Dimension[] dimension) {
        this.dimension = dimension;
    }

    public com.microsoft.bingads.v9.campaignmanagement.Dimension getDimension(int i) {
        return this.dimension[i];
    }

    public void setDimension(int i, com.microsoft.bingads.v9.campaignmanagement.Dimension _value) {
        this.dimension[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDimension)) return false;
        ArrayOfDimension other = (ArrayOfDimension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dimension==null && other.getDimension()==null) || 
             (this.dimension!=null &&
              java.util.Arrays.equals(this.dimension, other.getDimension())));
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
        if (getDimension() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimension());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimension(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfDimension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfDimension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimension");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Dimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Dimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
