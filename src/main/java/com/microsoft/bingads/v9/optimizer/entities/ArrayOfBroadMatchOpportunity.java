/**
 * ArrayOfBroadMatchOpportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class ArrayOfBroadMatchOpportunity  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.BroadMatchOpportunity[] broadMatchOpportunity;

    public ArrayOfBroadMatchOpportunity() {
    }

    public ArrayOfBroadMatchOpportunity(
           com.microsoft.bingads.v9.optimizer.entities.BroadMatchOpportunity[] broadMatchOpportunity) {
           this.broadMatchOpportunity = broadMatchOpportunity;
    }


    /**
     * Gets the broadMatchOpportunity value for this ArrayOfBroadMatchOpportunity.
     * 
     * @return broadMatchOpportunity
     */
    public com.microsoft.bingads.v9.optimizer.entities.BroadMatchOpportunity[] getBroadMatchOpportunity() {
        return broadMatchOpportunity;
    }


    /**
     * Sets the broadMatchOpportunity value for this ArrayOfBroadMatchOpportunity.
     * 
     * @param broadMatchOpportunity
     */
    public void setBroadMatchOpportunity(com.microsoft.bingads.v9.optimizer.entities.BroadMatchOpportunity[] broadMatchOpportunity) {
        this.broadMatchOpportunity = broadMatchOpportunity;
    }

    public com.microsoft.bingads.v9.optimizer.entities.BroadMatchOpportunity getBroadMatchOpportunity(int i) {
        return this.broadMatchOpportunity[i];
    }

    public void setBroadMatchOpportunity(int i, com.microsoft.bingads.v9.optimizer.entities.BroadMatchOpportunity _value) {
        this.broadMatchOpportunity[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfBroadMatchOpportunity)) return false;
        ArrayOfBroadMatchOpportunity other = (ArrayOfBroadMatchOpportunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.broadMatchOpportunity==null && other.getBroadMatchOpportunity()==null) || 
             (this.broadMatchOpportunity!=null &&
              java.util.Arrays.equals(this.broadMatchOpportunity, other.getBroadMatchOpportunity())));
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
        if (getBroadMatchOpportunity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBroadMatchOpportunity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBroadMatchOpportunity(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfBroadMatchOpportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBroadMatchOpportunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadMatchOpportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchOpportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchOpportunity"));
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
