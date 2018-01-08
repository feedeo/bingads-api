/**
 * EditorialApiFaultDetail.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class EditorialApiFaultDetail extends com.microsoft.bingads.v11.adapi.ApplicationFault implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(EditorialApiFaultDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialApiFaultDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchError"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialError"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OperationErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OperationError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OperationError"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.BatchError[] batchErrors;
    private com.microsoft.bingads.v11.campaignmanagement.EditorialError[] editorialErrors;
    private com.microsoft.bingads.v11.campaignmanagement.OperationError[] operationErrors;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public EditorialApiFaultDetail() {
    }


    public EditorialApiFaultDetail(
            java.lang.String trackingId,
            com.microsoft.bingads.v11.campaignmanagement.BatchError[] batchErrors,
            com.microsoft.bingads.v11.campaignmanagement.EditorialError[] editorialErrors,
            com.microsoft.bingads.v11.campaignmanagement.OperationError[] operationErrors) {
        super(
                trackingId);
        this.batchErrors = batchErrors;
        this.editorialErrors = editorialErrors;
        this.operationErrors = operationErrors;
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
     * Gets the batchErrors value for this EditorialApiFaultDetail.
     *
     * @return batchErrors
     */
    public com.microsoft.bingads.v11.campaignmanagement.BatchError[] getBatchErrors() {
        return batchErrors;
    }

    /**
     * Sets the batchErrors value for this EditorialApiFaultDetail.
     *
     * @param batchErrors
     */
    public void setBatchErrors(com.microsoft.bingads.v11.campaignmanagement.BatchError[] batchErrors) {
        this.batchErrors = batchErrors;
    }

    /**
     * Gets the editorialErrors value for this EditorialApiFaultDetail.
     *
     * @return editorialErrors
     */
    public com.microsoft.bingads.v11.campaignmanagement.EditorialError[] getEditorialErrors() {
        return editorialErrors;
    }

    /**
     * Sets the editorialErrors value for this EditorialApiFaultDetail.
     *
     * @param editorialErrors
     */
    public void setEditorialErrors(com.microsoft.bingads.v11.campaignmanagement.EditorialError[] editorialErrors) {
        this.editorialErrors = editorialErrors;
    }

    /**
     * Gets the operationErrors value for this EditorialApiFaultDetail.
     *
     * @return operationErrors
     */
    public com.microsoft.bingads.v11.campaignmanagement.OperationError[] getOperationErrors() {
        return operationErrors;
    }

    /**
     * Sets the operationErrors value for this EditorialApiFaultDetail.
     *
     * @param operationErrors
     */
    public void setOperationErrors(com.microsoft.bingads.v11.campaignmanagement.OperationError[] operationErrors) {
        this.operationErrors = operationErrors;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditorialApiFaultDetail)) return false;
        EditorialApiFaultDetail other = (EditorialApiFaultDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.batchErrors == null && other.getBatchErrors() == null) ||
                        (this.batchErrors != null &&
                                java.util.Arrays.equals(this.batchErrors, other.getBatchErrors()))) &&
                ((this.editorialErrors == null && other.getEditorialErrors() == null) ||
                        (this.editorialErrors != null &&
                                java.util.Arrays.equals(this.editorialErrors, other.getEditorialErrors()))) &&
                ((this.operationErrors == null && other.getOperationErrors() == null) ||
                        (this.operationErrors != null &&
                                java.util.Arrays.equals(this.operationErrors, other.getOperationErrors())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBatchErrors() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBatchErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatchErrors(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEditorialErrors() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getEditorialErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEditorialErrors(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationErrors() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getOperationErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationErrors(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
