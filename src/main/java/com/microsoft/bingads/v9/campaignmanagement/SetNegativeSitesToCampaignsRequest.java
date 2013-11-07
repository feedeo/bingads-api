/**
 * SetNegativeSitesToCampaignsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class SetNegativeSitesToCampaignsRequest  implements java.io.Serializable {
    private java.lang.Long accountId;

    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeSites campaignNegativeSites;

    public SetNegativeSitesToCampaignsRequest() {
    }

    public SetNegativeSitesToCampaignsRequest(
           java.lang.Long accountId,
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeSites campaignNegativeSites) {
           this.accountId = accountId;
           this.campaignNegativeSites = campaignNegativeSites;
    }


    /**
     * Gets the accountId value for this SetNegativeSitesToCampaignsRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this SetNegativeSitesToCampaignsRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the campaignNegativeSites value for this SetNegativeSitesToCampaignsRequest.
     * 
     * @return campaignNegativeSites
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeSites getCampaignNegativeSites() {
        return campaignNegativeSites;
    }


    /**
     * Sets the campaignNegativeSites value for this SetNegativeSitesToCampaignsRequest.
     * 
     * @param campaignNegativeSites
     */
    public void setCampaignNegativeSites(com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeSites campaignNegativeSites) {
        this.campaignNegativeSites = campaignNegativeSites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetNegativeSitesToCampaignsRequest)) return false;
        SetNegativeSitesToCampaignsRequest other = (SetNegativeSitesToCampaignsRequest) obj;
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
            ((this.campaignNegativeSites==null && other.getCampaignNegativeSites()==null) || 
             (this.campaignNegativeSites!=null &&
              this.campaignNegativeSites.equals(other.getCampaignNegativeSites())));
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
        if (getCampaignNegativeSites() != null) {
            _hashCode += getCampaignNegativeSites().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetNegativeSitesToCampaignsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeSitesToCampaignsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignNegativeSites");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignNegativeSites"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCampaignNegativeSites"));
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
