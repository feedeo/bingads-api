/**
 * ArrayOfBroadMatchSearchQueryKPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class ArrayOfBroadMatchSearchQueryKPI  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI[] broadMatchSearchQueryKPI;

    public ArrayOfBroadMatchSearchQueryKPI() {
    }

    public ArrayOfBroadMatchSearchQueryKPI(
           com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI[] broadMatchSearchQueryKPI) {
           this.broadMatchSearchQueryKPI = broadMatchSearchQueryKPI;
    }


    /**
     * Gets the broadMatchSearchQueryKPI value for this ArrayOfBroadMatchSearchQueryKPI.
     * 
     * @return broadMatchSearchQueryKPI
     */
    public com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI[] getBroadMatchSearchQueryKPI() {
        return broadMatchSearchQueryKPI;
    }


    /**
     * Sets the broadMatchSearchQueryKPI value for this ArrayOfBroadMatchSearchQueryKPI.
     * 
     * @param broadMatchSearchQueryKPI
     */
    public void setBroadMatchSearchQueryKPI(com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI[] broadMatchSearchQueryKPI) {
        this.broadMatchSearchQueryKPI = broadMatchSearchQueryKPI;
    }

    public com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI getBroadMatchSearchQueryKPI(int i) {
        return this.broadMatchSearchQueryKPI[i];
    }

    public void setBroadMatchSearchQueryKPI(int i, com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI _value) {
        this.broadMatchSearchQueryKPI[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfBroadMatchSearchQueryKPI)) return false;
        ArrayOfBroadMatchSearchQueryKPI other = (ArrayOfBroadMatchSearchQueryKPI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.broadMatchSearchQueryKPI==null && other.getBroadMatchSearchQueryKPI()==null) || 
             (this.broadMatchSearchQueryKPI!=null &&
              java.util.Arrays.equals(this.broadMatchSearchQueryKPI, other.getBroadMatchSearchQueryKPI())));
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
        if (getBroadMatchSearchQueryKPI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBroadMatchSearchQueryKPI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBroadMatchSearchQueryKPI(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfBroadMatchSearchQueryKPI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBroadMatchSearchQueryKPI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadMatchSearchQueryKPI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQueryKPI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQueryKPI"));
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
