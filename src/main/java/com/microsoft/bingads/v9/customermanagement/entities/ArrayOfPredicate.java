/**
 * ArrayOfPredicate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class ArrayOfPredicate  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.Predicate[] predicate;

    public ArrayOfPredicate() {
    }

    public ArrayOfPredicate(
           com.microsoft.bingads.v9.customermanagement.entities.Predicate[] predicate) {
           this.predicate = predicate;
    }


    /**
     * Gets the predicate value for this ArrayOfPredicate.
     * 
     * @return predicate
     */
    public com.microsoft.bingads.v9.customermanagement.entities.Predicate[] getPredicate() {
        return predicate;
    }


    /**
     * Sets the predicate value for this ArrayOfPredicate.
     * 
     * @param predicate
     */
    public void setPredicate(com.microsoft.bingads.v9.customermanagement.entities.Predicate[] predicate) {
        this.predicate = predicate;
    }

    public com.microsoft.bingads.v9.customermanagement.entities.Predicate getPredicate(int i) {
        return this.predicate[i];
    }

    public void setPredicate(int i, com.microsoft.bingads.v9.customermanagement.entities.Predicate _value) {
        this.predicate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPredicate)) return false;
        ArrayOfPredicate other = (ArrayOfPredicate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.predicate==null && other.getPredicate()==null) || 
             (this.predicate!=null &&
              java.util.Arrays.equals(this.predicate, other.getPredicate())));
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
        if (getPredicate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredicate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredicate(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPredicate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfPredicate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predicate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Predicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Predicate"));
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
