/**
 * ArrayOfBatchError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.exception;

public class ArrayOfBatchError  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.exception.BatchError[] batchError;

    public ArrayOfBatchError() {
    }

    public ArrayOfBatchError(
           com.microsoft.bingads.v9.customermanagement.exception.BatchError[] batchError) {
           this.batchError = batchError;
    }


    /**
     * Gets the batchError value for this ArrayOfBatchError.
     * 
     * @return batchError
     */
    public com.microsoft.bingads.v9.customermanagement.exception.BatchError[] getBatchError() {
        return batchError;
    }


    /**
     * Sets the batchError value for this ArrayOfBatchError.
     * 
     * @param batchError
     */
    public void setBatchError(com.microsoft.bingads.v9.customermanagement.exception.BatchError[] batchError) {
        this.batchError = batchError;
    }

    public com.microsoft.bingads.v9.customermanagement.exception.BatchError getBatchError(int i) {
        return this.batchError[i];
    }

    public void setBatchError(int i, com.microsoft.bingads.v9.customermanagement.exception.BatchError _value) {
        this.batchError[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfBatchError)) return false;
        ArrayOfBatchError other = (ArrayOfBatchError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchError==null && other.getBatchError()==null) || 
             (this.batchError!=null &&
              java.util.Arrays.equals(this.batchError, other.getBatchError())));
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
        if (getBatchError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatchError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatchError(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfBatchError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Exception", "ArrayOfBatchError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchError");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Exception", "BatchError"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Exception", "BatchError"));
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
