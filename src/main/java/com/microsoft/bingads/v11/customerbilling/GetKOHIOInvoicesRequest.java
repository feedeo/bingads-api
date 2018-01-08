/**
 * GetKOHIOInvoicesRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customerbilling;

public class GetKOHIOInvoicesRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetKOHIOInvoicesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", ">GetKOHIOInvoicesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v11", "InvoiceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String[] invoiceIds;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetKOHIOInvoicesRequest() {
    }

    public GetKOHIOInvoicesRequest(
            java.lang.String[] invoiceIds) {
        this.invoiceIds = invoiceIds;
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
                new org.apache.axis.encoding.ser.BeanSerializer(
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
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the invoiceIds value for this GetKOHIOInvoicesRequest.
     *
     * @return invoiceIds
     */
    public java.lang.String[] getInvoiceIds() {
        return invoiceIds;
    }

    /**
     * Sets the invoiceIds value for this GetKOHIOInvoicesRequest.
     *
     * @param invoiceIds
     */
    public void setInvoiceIds(java.lang.String[] invoiceIds) {
        this.invoiceIds = invoiceIds;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKOHIOInvoicesRequest)) return false;
        GetKOHIOInvoicesRequest other = (GetKOHIOInvoicesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.invoiceIds == null && other.getInvoiceIds() == null) ||
                        (this.invoiceIds != null &&
                                java.util.Arrays.equals(this.invoiceIds, other.getInvoiceIds())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInvoiceIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getInvoiceIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
