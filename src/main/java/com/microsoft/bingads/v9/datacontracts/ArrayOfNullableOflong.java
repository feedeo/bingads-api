/**
 * ArrayOfNullableOflong.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfNullableOflong  implements java.io.Serializable {
    private java.lang.Long[] _long;

    public ArrayOfNullableOflong() {
    }

    public ArrayOfNullableOflong(
           java.lang.Long[] _long) {
           this._long = _long;
    }


    /**
     * Gets the _long value for this ArrayOfNullableOflong.
     * 
     * @return _long
     */
    public java.lang.Long[] get_long() {
        return _long;
    }


    /**
     * Sets the _long value for this ArrayOfNullableOflong.
     * 
     * @param _long
     */
    public void set_long(java.lang.Long[] _long) {
        this._long = _long;
    }

    public java.lang.Long get_long(int i) {
        return this._long[i];
    }

    public void set_long(int i, java.lang.Long _value) {
        this._long[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfNullableOflong)) return false;
        ArrayOfNullableOflong other = (ArrayOfNullableOflong) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._long==null && other.get_long()==null) || 
             (this._long!=null &&
              java.util.Arrays.equals(this._long, other.get_long())));
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
        if (get_long() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_long());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_long(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfNullableOflong.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System", "ArrayOfNullableOflong"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_long");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System", "long"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
