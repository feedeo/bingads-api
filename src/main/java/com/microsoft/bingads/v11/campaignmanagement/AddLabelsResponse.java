/**
 * AddLabelsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AddLabelsResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AddLabelsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddLabelsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PartialErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchError"));
        typeDesc.addFieldDesc(elemField);
    }

    private long[] labelIds;
    private com.microsoft.bingads.v11.campaignmanagement.BatchError[] partialErrors;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AddLabelsResponse() {
    }


    public AddLabelsResponse(
            long[] labelIds,
            com.microsoft.bingads.v11.campaignmanagement.BatchError[] partialErrors) {
        this.labelIds = labelIds;
        this.partialErrors = partialErrors;
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
     * Gets the labelIds value for this AddLabelsResponse.
     *
     * @return labelIds
     */
    public long[] getLabelIds() {
        return labelIds;
    }

    /**
     * Sets the labelIds value for this AddLabelsResponse.
     *
     * @param labelIds
     */
    public void setLabelIds(long[] labelIds) {
        this.labelIds = labelIds;
    }

    /**
     * Gets the partialErrors value for this AddLabelsResponse.
     *
     * @return partialErrors
     */
    public com.microsoft.bingads.v11.campaignmanagement.BatchError[] getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the partialErrors value for this AddLabelsResponse.
     *
     * @param partialErrors
     */
    public void setPartialErrors(com.microsoft.bingads.v11.campaignmanagement.BatchError[] partialErrors) {
        this.partialErrors = partialErrors;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddLabelsResponse)) return false;
        AddLabelsResponse other = (AddLabelsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.labelIds == null && other.getLabelIds() == null) ||
                        (this.labelIds != null &&
                                java.util.Arrays.equals(this.labelIds, other.getLabelIds()))) &&
                ((this.partialErrors == null && other.getPartialErrors() == null) ||
                        (this.partialErrors != null &&
                                java.util.Arrays.equals(this.partialErrors, other.getPartialErrors())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLabelIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getLabelIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabelIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartialErrors() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPartialErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartialErrors(), i);
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
