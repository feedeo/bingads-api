/**
 * AccountThroughCampaignReportScope.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class AccountThroughCampaignReportScope implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AccountThroughCampaignReportScope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountThroughCampaignReportScope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaigns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Campaigns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignReportScope"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CampaignReportScope"));
        typeDesc.addFieldDesc(elemField);
    }

    private long[] accountIds;
    private com.microsoft.bingads.v11.reporting.CampaignReportScope[] campaigns;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AccountThroughCampaignReportScope() {
    }


    public AccountThroughCampaignReportScope(
            long[] accountIds,
            com.microsoft.bingads.v11.reporting.CampaignReportScope[] campaigns) {
        this.accountIds = accountIds;
        this.campaigns = campaigns;
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
     * Gets the accountIds value for this AccountThroughCampaignReportScope.
     *
     * @return accountIds
     */
    public long[] getAccountIds() {
        return accountIds;
    }

    /**
     * Sets the accountIds value for this AccountThroughCampaignReportScope.
     *
     * @param accountIds
     */
    public void setAccountIds(long[] accountIds) {
        this.accountIds = accountIds;
    }

    /**
     * Gets the campaigns value for this AccountThroughCampaignReportScope.
     *
     * @return campaigns
     */
    public com.microsoft.bingads.v11.reporting.CampaignReportScope[] getCampaigns() {
        return campaigns;
    }

    /**
     * Sets the campaigns value for this AccountThroughCampaignReportScope.
     *
     * @param campaigns
     */
    public void setCampaigns(com.microsoft.bingads.v11.reporting.CampaignReportScope[] campaigns) {
        this.campaigns = campaigns;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountThroughCampaignReportScope)) return false;
        AccountThroughCampaignReportScope other = (AccountThroughCampaignReportScope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accountIds == null && other.getAccountIds() == null) ||
                        (this.accountIds != null &&
                                java.util.Arrays.equals(this.accountIds, other.getAccountIds()))) &&
                ((this.campaigns == null && other.getCampaigns() == null) ||
                        (this.campaigns != null &&
                                java.util.Arrays.equals(this.campaigns, other.getCampaigns())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAccountIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaigns() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCampaigns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaigns(), i);
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
