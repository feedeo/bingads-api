/**
 * GetKeywordOpportunitiesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public class GetKeywordOpportunitiesRequest  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.Long adGroupId;

    private java.lang.Long campaignId;

    public GetKeywordOpportunitiesRequest() {
    }

    public GetKeywordOpportunitiesRequest(
           java.lang.Long accountId,
           java.lang.Long adGroupId,
           java.lang.Long campaignId) {
           this.accountId = accountId;
           this.adGroupId = adGroupId;
           this.campaignId = campaignId;
    }


    /**
     * Gets the accountId value for this GetKeywordOpportunitiesRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GetKeywordOpportunitiesRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the adGroupId value for this GetKeywordOpportunitiesRequest.
     * 
     * @return adGroupId
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this GetKeywordOpportunitiesRequest.
     * 
     * @param adGroupId
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the campaignId value for this GetKeywordOpportunitiesRequest.
     * 
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this GetKeywordOpportunitiesRequest.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKeywordOpportunitiesRequest)) return false;
        GetKeywordOpportunitiesRequest other = (GetKeywordOpportunitiesRequest) obj;
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
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKeywordOpportunitiesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetKeywordOpportunitiesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "AdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
