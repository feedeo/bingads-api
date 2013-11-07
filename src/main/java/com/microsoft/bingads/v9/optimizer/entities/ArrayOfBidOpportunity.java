/**
 * ArrayOfBidOpportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class ArrayOfBidOpportunity  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.BidOpportunity[] bidOpportunity;

    public ArrayOfBidOpportunity() {
    }

    public ArrayOfBidOpportunity(
           com.microsoft.bingads.v9.optimizer.entities.BidOpportunity[] bidOpportunity) {
           this.bidOpportunity = bidOpportunity;
    }


    /**
     * Gets the bidOpportunity value for this ArrayOfBidOpportunity.
     * 
     * @return bidOpportunity
     */
    public com.microsoft.bingads.v9.optimizer.entities.BidOpportunity[] getBidOpportunity() {
        return bidOpportunity;
    }


    /**
     * Sets the bidOpportunity value for this ArrayOfBidOpportunity.
     * 
     * @param bidOpportunity
     */
    public void setBidOpportunity(com.microsoft.bingads.v9.optimizer.entities.BidOpportunity[] bidOpportunity) {
        this.bidOpportunity = bidOpportunity;
    }

    public com.microsoft.bingads.v9.optimizer.entities.BidOpportunity getBidOpportunity(int i) {
        return this.bidOpportunity[i];
    }

    public void setBidOpportunity(int i, com.microsoft.bingads.v9.optimizer.entities.BidOpportunity _value) {
        this.bidOpportunity[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfBidOpportunity)) return false;
        ArrayOfBidOpportunity other = (ArrayOfBidOpportunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bidOpportunity==null && other.getBidOpportunity()==null) || 
             (this.bidOpportunity!=null &&
              java.util.Arrays.equals(this.bidOpportunity, other.getBidOpportunity())));
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
        if (getBidOpportunity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBidOpportunity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBidOpportunity(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfBidOpportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBidOpportunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidOpportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BidOpportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BidOpportunity"));
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
