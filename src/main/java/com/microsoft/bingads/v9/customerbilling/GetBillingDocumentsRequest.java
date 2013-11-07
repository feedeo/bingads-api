/**
 * GetBillingDocumentsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customerbilling;

public class GetBillingDocumentsRequest  implements java.io.Serializable {
    private long[] documentIds;

    private com.microsoft.bingads.v9.customermanagement.entities.DataType type;

    public GetBillingDocumentsRequest() {
    }

    public GetBillingDocumentsRequest(
           long[] documentIds,
           com.microsoft.bingads.v9.customermanagement.entities.DataType type) {
           this.documentIds = documentIds;
           this.type = type;
    }


    /**
     * Gets the documentIds value for this GetBillingDocumentsRequest.
     * 
     * @return documentIds
     */
    public long[] getDocumentIds() {
        return documentIds;
    }


    /**
     * Sets the documentIds value for this GetBillingDocumentsRequest.
     * 
     * @param documentIds
     */
    public void setDocumentIds(long[] documentIds) {
        this.documentIds = documentIds;
    }


    /**
     * Gets the type value for this GetBillingDocumentsRequest.
     * 
     * @return type
     */
    public com.microsoft.bingads.v9.customermanagement.entities.DataType getType() {
        return type;
    }


    /**
     * Sets the type value for this GetBillingDocumentsRequest.
     * 
     * @param type
     */
    public void setType(com.microsoft.bingads.v9.customermanagement.entities.DataType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBillingDocumentsRequest)) return false;
        GetBillingDocumentsRequest other = (GetBillingDocumentsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentIds==null && other.getDocumentIds()==null) || 
             (this.documentIds!=null &&
              java.util.Arrays.equals(this.documentIds, other.getDocumentIds()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getDocumentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBillingDocumentsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v9", ">GetBillingDocumentsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v9", "DocumentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "DataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
