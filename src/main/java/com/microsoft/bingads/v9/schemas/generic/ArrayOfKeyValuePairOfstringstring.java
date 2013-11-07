/**
 * ArrayOfKeyValuePairOfstringstring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.schemas.generic;

public class ArrayOfKeyValuePairOfstringstring  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] keyValuePairOfstringstring;

    public ArrayOfKeyValuePairOfstringstring() {
    }

    public ArrayOfKeyValuePairOfstringstring(
           com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] keyValuePairOfstringstring) {
           this.keyValuePairOfstringstring = keyValuePairOfstringstring;
    }


    /**
     * Gets the keyValuePairOfstringstring value for this ArrayOfKeyValuePairOfstringstring.
     * 
     * @return keyValuePairOfstringstring
     */
    public com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] getKeyValuePairOfstringstring() {
        return keyValuePairOfstringstring;
    }


    /**
     * Sets the keyValuePairOfstringstring value for this ArrayOfKeyValuePairOfstringstring.
     * 
     * @param keyValuePairOfstringstring
     */
    public void setKeyValuePairOfstringstring(com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] keyValuePairOfstringstring) {
        this.keyValuePairOfstringstring = keyValuePairOfstringstring;
    }

    public com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring getKeyValuePairOfstringstring(int i) {
        return this.keyValuePairOfstringstring[i];
    }

    public void setKeyValuePairOfstringstring(int i, com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring _value) {
        this.keyValuePairOfstringstring[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeyValuePairOfstringstring)) return false;
        ArrayOfKeyValuePairOfstringstring other = (ArrayOfKeyValuePairOfstringstring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyValuePairOfstringstring==null && other.getKeyValuePairOfstringstring()==null) || 
             (this.keyValuePairOfstringstring!=null &&
              java.util.Arrays.equals(this.keyValuePairOfstringstring, other.getKeyValuePairOfstringstring())));
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
        if (getKeyValuePairOfstringstring() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyValuePairOfstringstring());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyValuePairOfstringstring(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeyValuePairOfstringstring.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyValuePairOfstringstring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
