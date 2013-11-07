/**
 * GetBillingDocumentsInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customerbilling;

public class GetBillingDocumentsInfoResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.BillingDocumentInfo[] billingDocumentsInfo;

    public GetBillingDocumentsInfoResponse() {
    }

    public GetBillingDocumentsInfoResponse(
           com.microsoft.bingads.v9.customermanagement.entities.BillingDocumentInfo[] billingDocumentsInfo) {
           this.billingDocumentsInfo = billingDocumentsInfo;
    }


    /**
     * Gets the billingDocumentsInfo value for this GetBillingDocumentsInfoResponse.
     * 
     * @return billingDocumentsInfo
     */
    public com.microsoft.bingads.v9.customermanagement.entities.BillingDocumentInfo[] getBillingDocumentsInfo() {
        return billingDocumentsInfo;
    }


    /**
     * Sets the billingDocumentsInfo value for this GetBillingDocumentsInfoResponse.
     * 
     * @param billingDocumentsInfo
     */
    public void setBillingDocumentsInfo(com.microsoft.bingads.v9.customermanagement.entities.BillingDocumentInfo[] billingDocumentsInfo) {
        this.billingDocumentsInfo = billingDocumentsInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBillingDocumentsInfoResponse)) return false;
        GetBillingDocumentsInfoResponse other = (GetBillingDocumentsInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingDocumentsInfo==null && other.getBillingDocumentsInfo()==null) || 
             (this.billingDocumentsInfo!=null &&
              java.util.Arrays.equals(this.billingDocumentsInfo, other.getBillingDocumentsInfo())));
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
        if (getBillingDocumentsInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingDocumentsInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingDocumentsInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetBillingDocumentsInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v9", ">GetBillingDocumentsInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingDocumentsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Billing/v9", "BillingDocumentsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "BillingDocumentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "BillingDocumentInfo"));
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
