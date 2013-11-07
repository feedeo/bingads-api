/**
 * ApiFaultDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ApiFaultDetail  extends com.microsoft.bingads.v9.adapi.ApplicationFault  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfBatchError batchErrors;

    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfOperationError operationErrors;

    public ApiFaultDetail() {
    }

    public ApiFaultDetail(
           java.lang.String trackingId,
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfBatchError batchErrors,
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfOperationError operationErrors) {
        super(
            trackingId);
        this.batchErrors = batchErrors;
        this.operationErrors = operationErrors;
    }


    /**
     * Gets the batchErrors value for this ApiFaultDetail.
     * 
     * @return batchErrors
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfBatchError getBatchErrors() {
        return batchErrors;
    }


    /**
     * Sets the batchErrors value for this ApiFaultDetail.
     * 
     * @param batchErrors
     */
    public void setBatchErrors(com.microsoft.bingads.v9.campaignmanagement.ArrayOfBatchError batchErrors) {
        this.batchErrors = batchErrors;
    }


    /**
     * Gets the operationErrors value for this ApiFaultDetail.
     * 
     * @return operationErrors
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfOperationError getOperationErrors() {
        return operationErrors;
    }


    /**
     * Sets the operationErrors value for this ApiFaultDetail.
     * 
     * @param operationErrors
     */
    public void setOperationErrors(com.microsoft.bingads.v9.campaignmanagement.ArrayOfOperationError operationErrors) {
        this.operationErrors = operationErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiFaultDetail)) return false;
        ApiFaultDetail other = (ApiFaultDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.batchErrors==null && other.getBatchErrors()==null) || 
             (this.batchErrors!=null &&
              this.batchErrors.equals(other.getBatchErrors()))) &&
            ((this.operationErrors==null && other.getOperationErrors()==null) || 
             (this.operationErrors!=null &&
              this.operationErrors.equals(other.getOperationErrors())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBatchErrors() != null) {
            _hashCode += getBatchErrors().hashCode();
        }
        if (getOperationErrors() != null) {
            _hashCode += getOperationErrors().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiFaultDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ApiFaultDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BatchErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfBatchError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "OperationErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfOperationError"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
