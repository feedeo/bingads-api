/**
 * SetNegativeKeywordsToCampaignsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class SetNegativeKeywordsToCampaignsRequest  implements java.io.Serializable {
    private java.lang.Long accountId;

    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeKeywords campaignNegativeKeywords;

    public SetNegativeKeywordsToCampaignsRequest() {
    }

    public SetNegativeKeywordsToCampaignsRequest(
           java.lang.Long accountId,
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeKeywords campaignNegativeKeywords) {
           this.accountId = accountId;
           this.campaignNegativeKeywords = campaignNegativeKeywords;
    }


    /**
     * Gets the accountId value for this SetNegativeKeywordsToCampaignsRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this SetNegativeKeywordsToCampaignsRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the campaignNegativeKeywords value for this SetNegativeKeywordsToCampaignsRequest.
     * 
     * @return campaignNegativeKeywords
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeKeywords getCampaignNegativeKeywords() {
        return campaignNegativeKeywords;
    }


    /**
     * Sets the campaignNegativeKeywords value for this SetNegativeKeywordsToCampaignsRequest.
     * 
     * @param campaignNegativeKeywords
     */
    public void setCampaignNegativeKeywords(com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeKeywords campaignNegativeKeywords) {
        this.campaignNegativeKeywords = campaignNegativeKeywords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetNegativeKeywordsToCampaignsRequest)) return false;
        SetNegativeKeywordsToCampaignsRequest other = (SetNegativeKeywordsToCampaignsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.campaignNegativeKeywords==null && other.getCampaignNegativeKeywords()==null) || 
             (this.campaignNegativeKeywords!=null &&
              this.campaignNegativeKeywords.equals(other.getCampaignNegativeKeywords())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getCampaignNegativeKeywords() != null) {
            _hashCode += getCampaignNegativeKeywords().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetNegativeKeywordsToCampaignsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeKeywordsToCampaignsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignNegativeKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignNegativeKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCampaignNegativeKeywords"));
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

}
