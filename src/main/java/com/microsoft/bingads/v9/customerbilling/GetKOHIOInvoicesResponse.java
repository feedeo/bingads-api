/**
 * GetKOHIOInvoicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customerbilling;

public class GetKOHIOInvoicesResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.ArrayOfBillingDocument billingDocuments;

    public GetKOHIOInvoicesResponse() {
    }

    public GetKOHIOInvoicesResponse(
           com.microsoft.bingads.v9.customermanagement.entities.ArrayOfBillingDocument billingDocuments) {
           this.billingDocuments = billingDocuments;
    }


    /**
     * Gets the billingDocuments value for this GetKOHIOInvoicesResponse.
     * 
     * @return billingDocuments
     */
    public com.microsoft.bingads.v9.customermanagement.entities.ArrayOfBillingDocument getBillingDocuments() {
        return billingDocuments;
    }


    /**
     * Sets the billingDocuments value for this GetKOHIOInvoicesResponse.
     * 
     * @param billingDocuments
     */
    public void setBillingDocuments(com.microsoft.bingads.v9.customermanagement.entities.ArrayOfBillingDocument billingDocuments) {
        this.billingDocuments = billingDocuments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKOHIOInvoicesResponse)) return false;
        GetKOHIOInvoicesResponse other = (GetKOHIOInvoicesResponse) obj;
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
              this.billingDocuments.equals(other.getBillingDocuments())));
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
            _hashCode += getBillingDocuments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKOHIOInvoicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v9", ">GetKOHIOInvoicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v9", "BillingDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfBillingDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
