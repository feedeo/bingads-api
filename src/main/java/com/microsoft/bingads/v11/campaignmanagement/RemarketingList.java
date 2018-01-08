/**
 * RemarketingList.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class RemarketingList extends com.microsoft.bingads.v11.campaignmanagement.Audience implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RemarketingList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "RemarketingList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RemarketingRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TagId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.datacontracts.RemarketingRule rule;
    private java.lang.Long tagId;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public RemarketingList() {
    }


    public RemarketingList(
            java.lang.String description,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            java.lang.Integer membershipDuration,
            java.lang.String name,
            java.lang.Long parentId,
            com.microsoft.bingads.v11.campaignmanagement.EntityScope scope,
            java.lang.Integer searchSize,
            java.lang.String[] type,
            com.microsoft.bingads.v11.datacontracts.RemarketingRule rule,
            java.lang.Long tagId) {
        super(
                description,
                forwardCompatibilityMap,
                id,
                membershipDuration,
                name,
                parentId,
                scope,
                searchSize,
                type);
        this.rule = rule;
        this.tagId = tagId;
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
     * Gets the rule value for this RemarketingList.
     *
     * @return rule
     */
    public com.microsoft.bingads.v11.datacontracts.RemarketingRule getRule() {
        return rule;
    }

    /**
     * Sets the rule value for this RemarketingList.
     *
     * @param rule
     */
    public void setRule(com.microsoft.bingads.v11.datacontracts.RemarketingRule rule) {
        this.rule = rule;
    }

    /**
     * Gets the tagId value for this RemarketingList.
     *
     * @return tagId
     */
    public java.lang.Long getTagId() {
        return tagId;
    }

    /**
     * Sets the tagId value for this RemarketingList.
     *
     * @param tagId
     */
    public void setTagId(java.lang.Long tagId) {
        this.tagId = tagId;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemarketingList)) return false;
        RemarketingList other = (RemarketingList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.rule == null && other.getRule() == null) ||
                        (this.rule != null &&
                                this.rule.equals(other.getRule()))) &&
                ((this.tagId == null && other.getTagId() == null) ||
                        (this.tagId != null &&
                                this.tagId.equals(other.getTagId())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getTagId() != null) {
            _hashCode += getTagId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
