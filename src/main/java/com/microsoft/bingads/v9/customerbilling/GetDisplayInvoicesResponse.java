/**
 * GetDisplayInvoicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customerbilling;

public class GetDisplayInvoicesResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.BillingDocument[] billingDocuments;

    public GetDisplayInvoicesResponse() {
    }

    public GetDisplayInvoicesResponse(
           com.microsoft.bingads.v9.customermanagement.entities.BillingDocument[] billingDocuments) {
           this.billingDocuments = billingDocuments;
    }


    /**
     * Gets the billingDocuments value for this GetDisplayInvoicesResponse.
     * 
     * @return billingDocuments
     */
    public com.microsoft.bingads.v9.customermanagement.entities.BillingDocument[] getBillingDocuments() {
        return billingDocuments;
    }


    /**
     * Sets the billingDocuments value for this GetDisplayInvoicesResponse.
     * 
     * @param billingDocuments
     */
    public void setBillingDocuments(com.microsoft.bingads.v9.customermanagement.entities.BillingDocument[] billingDocuments) {
        this.billingDocuments = billingDocuments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDisplayInvoicesResponse)) return false;
        GetDisplayInvoicesResponse other = (GetDisplayInvoicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingDocuments==null && other.getBillingDocuments()==null) || 
             (this.billingDocuments!=null &&
              java.util.Arrays.equals(this.billingDocuments, other.getBillingDocuments())));
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
        if (getBillingDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingDocuments(), i);
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
        new org.apache.axis.description.TypeDesc(GetDisplayInvoicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v9", ">GetDisplayInvoicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v9", "BillingDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "BillingDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "BillingDocument"));
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
