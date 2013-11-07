/**
 * ArrayOfOperationError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public class ArrayOfOperationError  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.OperationError[] operationError;

    public ArrayOfOperationError() {
    }

    public ArrayOfOperationError(
           com.microsoft.bingads.v9.optimizer.OperationError[] operationError) {
           this.operationError = operationError;
    }


    /**
     * Gets the operationError value for this ArrayOfOperationError.
     * 
     * @return operationError
     */
    public com.microsoft.bingads.v9.optimizer.OperationError[] getOperationError() {
        return operationError;
    }


    /**
     * Sets the operationError value for this ArrayOfOperationError.
     * 
     * @param operationError
     */
    public void setOperationError(com.microsoft.bingads.v9.optimizer.OperationError[] operationError) {
        this.operationError = operationError;
    }

    public com.microsoft.bingads.v9.optimizer.OperationError getOperationError(int i) {
        return this.operationError[i];
    }

    public void setOperationError(int i, com.microsoft.bingads.v9.optimizer.OperationError _value) {
        this.operationError[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfOperationError)) return false;
        ArrayOfOperationError other = (ArrayOfOperationError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationError==null && other.getOperationError()==null) || 
             (this.operationError!=null &&
              java.util.Arrays.equals(this.operationError, other.getOperationError())));
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
        if (getOperationError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationError(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfOperationError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "ArrayOfOperationError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationError");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "OperationError"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "OperationError"));
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
