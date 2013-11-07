/**
 * ArrayOfOpportunityModifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class ArrayOfOpportunityModifier  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.OpportunityModifier[] opportunityModifier;

    public ArrayOfOpportunityModifier() {
    }

    public ArrayOfOpportunityModifier(
           com.microsoft.bingads.v9.optimizer.entities.OpportunityModifier[] opportunityModifier) {
           this.opportunityModifier = opportunityModifier;
    }


    /**
     * Gets the opportunityModifier value for this ArrayOfOpportunityModifier.
     * 
     * @return opportunityModifier
     */
    public com.microsoft.bingads.v9.optimizer.entities.OpportunityModifier[] getOpportunityModifier() {
        return opportunityModifier;
    }


    /**
     * Sets the opportunityModifier value for this ArrayOfOpportunityModifier.
     * 
     * @param opportunityModifier
     */
    public void setOpportunityModifier(com.microsoft.bingads.v9.optimizer.entities.OpportunityModifier[] opportunityModifier) {
        this.opportunityModifier = opportunityModifier;
    }

    public com.microsoft.bingads.v9.optimizer.entities.OpportunityModifier getOpportunityModifier(int i) {
        return this.opportunityModifier[i];
    }

    public void setOpportunityModifier(int i, com.microsoft.bingads.v9.optimizer.entities.OpportunityModifier _value) {
        this.opportunityModifier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfOpportunityModifier)) return false;
        ArrayOfOpportunityModifier other = (ArrayOfOpportunityModifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.opportunityModifier==null && other.getOpportunityModifier()==null) || 
             (this.opportunityModifier!=null &&
              java.util.Arrays.equals(this.opportunityModifier, other.getOpportunityModifier())));
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
        if (getOpportunityModifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpportunityModifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpportunityModifier(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfOpportunityModifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfOpportunityModifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "OpportunityModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "OpportunityModifier"));
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
