/**
 * ProductPartition.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class ProductPartition extends com.microsoft.bingads.v11.campaignmanagement.Criterion implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ProductPartition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ProductPartition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ProductCondition"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCriterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ParentCriterionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PartitionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ProductPartitionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.ProductCondition condition;
    private java.lang.Long parentCriterionId;
    private com.microsoft.bingads.v11.campaignmanagement.ProductPartitionType partitionType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ProductPartition() {
    }


    public ProductPartition(
            java.lang.String type,
            com.microsoft.bingads.v11.campaignmanagement.ProductCondition condition,
            java.lang.Long parentCriterionId,
            com.microsoft.bingads.v11.campaignmanagement.ProductPartitionType partitionType) {
        super(
                type);
        this.condition = condition;
        this.parentCriterionId = parentCriterionId;
        this.partitionType = partitionType;
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
     * Gets the condition value for this ProductPartition.
     *
     * @return condition
     */
    public com.microsoft.bingads.v11.campaignmanagement.ProductCondition getCondition() {
        return condition;
    }

    /**
     * Sets the condition value for this ProductPartition.
     *
     * @param condition
     */
    public void setCondition(com.microsoft.bingads.v11.campaignmanagement.ProductCondition condition) {
        this.condition = condition;
    }

    /**
     * Gets the parentCriterionId value for this ProductPartition.
     *
     * @return parentCriterionId
     */
    public java.lang.Long getParentCriterionId() {
        return parentCriterionId;
    }

    /**
     * Sets the parentCriterionId value for this ProductPartition.
     *
     * @param parentCriterionId
     */
    public void setParentCriterionId(java.lang.Long parentCriterionId) {
        this.parentCriterionId = parentCriterionId;
    }

    /**
     * Gets the partitionType value for this ProductPartition.
     *
     * @return partitionType
     */
    public com.microsoft.bingads.v11.campaignmanagement.ProductPartitionType getPartitionType() {
        return partitionType;
    }

    /**
     * Sets the partitionType value for this ProductPartition.
     *
     * @param partitionType
     */
    public void setPartitionType(com.microsoft.bingads.v11.campaignmanagement.ProductPartitionType partitionType) {
        this.partitionType = partitionType;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPartition)) return false;
        ProductPartition other = (ProductPartition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.condition == null && other.getCondition() == null) ||
                        (this.condition != null &&
                                this.condition.equals(other.getCondition()))) &&
                ((this.parentCriterionId == null && other.getParentCriterionId() == null) ||
                        (this.parentCriterionId != null &&
                                this.parentCriterionId.equals(other.getParentCriterionId()))) &&
                ((this.partitionType == null && other.getPartitionType() == null) ||
                        (this.partitionType != null &&
                                this.partitionType.equals(other.getPartitionType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getParentCriterionId() != null) {
            _hashCode += getParentCriterionId().hashCode();
        }
        if (getPartitionType() != null) {
            _hashCode += getPartitionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
