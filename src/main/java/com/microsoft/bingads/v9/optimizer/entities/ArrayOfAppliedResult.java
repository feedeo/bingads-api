/**
 * ArrayOfAppliedResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class ArrayOfAppliedResult  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.AppliedResult[] appliedResult;

    public ArrayOfAppliedResult() {
    }

    public ArrayOfAppliedResult(
           com.microsoft.bingads.v9.optimizer.entities.AppliedResult[] appliedResult) {
           this.appliedResult = appliedResult;
    }


    /**
     * Gets the appliedResult value for this ArrayOfAppliedResult.
     * 
     * @return appliedResult
     */
    public com.microsoft.bingads.v9.optimizer.entities.AppliedResult[] getAppliedResult() {
        return appliedResult;
    }


    /**
     * Sets the appliedResult value for this ArrayOfAppliedResult.
     * 
     * @param appliedResult
     */
    public void setAppliedResult(com.microsoft.bingads.v9.optimizer.entities.AppliedResult[] appliedResult) {
        this.appliedResult = appliedResult;
    }

    public com.microsoft.bingads.v9.optimizer.entities.AppliedResult getAppliedResult(int i) {
        return this.appliedResult[i];
    }

    public void setAppliedResult(int i, com.microsoft.bingads.v9.optimizer.entities.AppliedResult _value) {
        this.appliedResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAppliedResult)) return false;
        ArrayOfAppliedResult other = (ArrayOfAppliedResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appliedResult==null && other.getAppliedResult()==null) || 
             (this.appliedResult!=null &&
              java.util.Arrays.equals(this.appliedResult, other.getAppliedResult())));
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
        if (getAppliedResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAppliedResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfAppliedResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AppliedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AppliedResult"));
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
