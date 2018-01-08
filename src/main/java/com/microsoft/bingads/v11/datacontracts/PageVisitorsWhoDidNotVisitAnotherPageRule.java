/**
 * PageVisitorsWhoDidNotVisitAnotherPageRule.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.datacontracts;

public class PageVisitorsWhoDidNotVisitAnotherPageRule extends com.microsoft.bingads.v11.datacontracts.RemarketingRule implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PageVisitorsWhoDidNotVisitAnotherPageRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "PageVisitorsWhoDidNotVisitAnotherPageRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeRuleItemGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "ExcludeRuleItemGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeRuleItemGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "IncludeRuleItemGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "RuleItemGroup"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] excludeRuleItemGroups;
    private com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] includeRuleItemGroups;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public PageVisitorsWhoDidNotVisitAnotherPageRule() {
    }


    public PageVisitorsWhoDidNotVisitAnotherPageRule(
            java.lang.String type,
            com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] excludeRuleItemGroups,
            com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] includeRuleItemGroups) {
        super(
                type);
        this.excludeRuleItemGroups = excludeRuleItemGroups;
        this.includeRuleItemGroups = includeRuleItemGroups;
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
     * Gets the excludeRuleItemGroups value for this PageVisitorsWhoDidNotVisitAnotherPageRule.
     *
     * @return excludeRuleItemGroups
     */
    public com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] getExcludeRuleItemGroups() {
        return excludeRuleItemGroups;
    }

    /**
     * Sets the excludeRuleItemGroups value for this PageVisitorsWhoDidNotVisitAnotherPageRule.
     *
     * @param excludeRuleItemGroups
     */
    public void setExcludeRuleItemGroups(com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] excludeRuleItemGroups) {
        this.excludeRuleItemGroups = excludeRuleItemGroups;
    }

    /**
     * Gets the includeRuleItemGroups value for this PageVisitorsWhoDidNotVisitAnotherPageRule.
     *
     * @return includeRuleItemGroups
     */
    public com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] getIncludeRuleItemGroups() {
        return includeRuleItemGroups;
    }

    /**
     * Sets the includeRuleItemGroups value for this PageVisitorsWhoDidNotVisitAnotherPageRule.
     *
     * @param includeRuleItemGroups
     */
    public void setIncludeRuleItemGroups(com.microsoft.bingads.v11.datacontracts.RuleItemGroup[] includeRuleItemGroups) {
        this.includeRuleItemGroups = includeRuleItemGroups;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageVisitorsWhoDidNotVisitAnotherPageRule)) return false;
        PageVisitorsWhoDidNotVisitAnotherPageRule other = (PageVisitorsWhoDidNotVisitAnotherPageRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.excludeRuleItemGroups == null && other.getExcludeRuleItemGroups() == null) ||
                        (this.excludeRuleItemGroups != null &&
                                java.util.Arrays.equals(this.excludeRuleItemGroups, other.getExcludeRuleItemGroups()))) &&
                ((this.includeRuleItemGroups == null && other.getIncludeRuleItemGroups() == null) ||
                        (this.includeRuleItemGroups != null &&
                                java.util.Arrays.equals(this.includeRuleItemGroups, other.getIncludeRuleItemGroups())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getExcludeRuleItemGroups() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getExcludeRuleItemGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeRuleItemGroups(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeRuleItemGroups() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getIncludeRuleItemGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeRuleItemGroups(), i);
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
