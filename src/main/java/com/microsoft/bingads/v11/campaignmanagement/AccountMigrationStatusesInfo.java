/**
 * AccountMigrationStatusesInfo.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AccountMigrationStatusesInfo implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AccountMigrationStatusesInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountMigrationStatusesInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("migrationStatusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MigrationStatusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MigrationStatusInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MigrationStatusInfo"));
        typeDesc.addFieldDesc(elemField);
    }

    private long accountId;
    private com.microsoft.bingads.v11.campaignmanagement.MigrationStatusInfo[] migrationStatusInfo;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AccountMigrationStatusesInfo() {
    }


    public AccountMigrationStatusesInfo(
            long accountId,
            com.microsoft.bingads.v11.campaignmanagement.MigrationStatusInfo[] migrationStatusInfo) {
        this.accountId = accountId;
        this.migrationStatusInfo = migrationStatusInfo;
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
     * Gets the accountId value for this AccountMigrationStatusesInfo.
     *
     * @return accountId
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the accountId value for this AccountMigrationStatusesInfo.
     *
     * @param accountId
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the migrationStatusInfo value for this AccountMigrationStatusesInfo.
     *
     * @return migrationStatusInfo
     */
    public com.microsoft.bingads.v11.campaignmanagement.MigrationStatusInfo[] getMigrationStatusInfo() {
        return migrationStatusInfo;
    }

    /**
     * Sets the migrationStatusInfo value for this AccountMigrationStatusesInfo.
     *
     * @param migrationStatusInfo
     */
    public void setMigrationStatusInfo(com.microsoft.bingads.v11.campaignmanagement.MigrationStatusInfo[] migrationStatusInfo) {
        this.migrationStatusInfo = migrationStatusInfo;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountMigrationStatusesInfo)) return false;
        AccountMigrationStatusesInfo other = (AccountMigrationStatusesInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.accountId == other.getAccountId() &&
                ((this.migrationStatusInfo == null && other.getMigrationStatusInfo() == null) ||
                        (this.migrationStatusInfo != null &&
                                java.util.Arrays.equals(this.migrationStatusInfo, other.getMigrationStatusInfo())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getAccountId()).hashCode();
        if (getMigrationStatusInfo() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getMigrationStatusInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMigrationStatusInfo(), i);
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
