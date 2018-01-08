/**
 * PageVisitorsWhoVisitedAnotherPageRule.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.datacontracts;

public class PageVisitorsWhoVisitedAnotherPageRule extends com.microsoft.bingads.v11.datacontracts.RemarketingRule implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PageVisitorsWhoVisitedAnotherPageRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "PageVisitorsWhoVisitedAnotherPageRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anotherRuleItemGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "AnotherRuleItemGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleItemGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] anotherRuleItemGroups;
    private com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] ruleItemGroups;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public PageVisitorsWhoVisitedAnotherPageRule() {
    }


    public PageVisitorsWhoVisitedAnotherPageRule(
            java.lang.String type,
            com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] anotherRuleItemGroups,
            com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] ruleItemGroups) {
        super(
                type);
        this.anotherRuleItemGroups = anotherRuleItemGroups;
        this.ruleItemGroups = ruleItemGroups;
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
     * Gets the anotherRuleItemGroups value for this PageVisitorsWhoVisitedAnotherPageRule.
     *
     * @return anotherRuleItemGroups
     */
    public com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] getAnotherRuleItemGroups() {
        return anotherRuleItemGroups;
    }

    /**
     * Sets the anotherRuleItemGroups value for this PageVisitorsWhoVisitedAnotherPageRule.
     *
     * @param anotherRuleItemGroups
     */
    public void setAnotherRuleItemGroups(com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] anotherRuleItemGroups) {
        this.anotherRuleItemGroups = anotherRuleItemGroups;
    }

    /**
     * Gets the ruleItemGroups value for this PageVisitorsWhoVisitedAnotherPageRule.
     *
     * @return ruleItemGroups
     */
    public com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] getRuleItemGroups() {
        return ruleItemGroups;
    }

    /**
     * Sets the ruleItemGroups value for this PageVisitorsWhoVisitedAnotherPageRule.
     *
     * @param ruleItemGroups
     */
    public void setRuleItemGroups(com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] ruleItemGroups) {
        this.ruleItemGroups = ruleItemGroups;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageVisitorsWhoVisitedAnotherPageRule)) return false;
        PageVisitorsWhoVisitedAnotherPageRule other = (PageVisitorsWhoVisitedAnotherPageRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.anotherRuleItemGroups == null && other.getAnotherRuleItemGroups() == null) ||
                        (this.anotherRuleItemGroups != null &&
                                java.util.Arrays.equals(this.anotherRuleItemGroups, other.getAnotherRuleItemGroups()))) &&
                ((this.ruleItemGroups == null && other.getRuleItemGroups() == null) ||
                        (this.ruleItemGroups != null &&
                                java.util.Arrays.equals(this.ruleItemGroups, other.getRuleItemGroups())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAnotherRuleItemGroups() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAnotherRuleItemGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnotherRuleItemGroups(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRuleItemGroups() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRuleItemGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRuleItemGroups(), i);
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
