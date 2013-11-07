/**
 * SetNegativeKeywordsToAdGroupsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class SetNegativeKeywordsToAdGroupsRequest  implements java.io.Serializable {
    private java.lang.Long campaignId;

    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdGroupNegativeKeywords adGroupNegativeKeywords;

    public SetNegativeKeywordsToAdGroupsRequest() {
    }

    public SetNegativeKeywordsToAdGroupsRequest(
           java.lang.Long campaignId,
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdGroupNegativeKeywords adGroupNegativeKeywords) {
           this.campaignId = campaignId;
           this.adGroupNegativeKeywords = adGroupNegativeKeywords;
    }


    /**
     * Gets the campaignId value for this SetNegativeKeywordsToAdGroupsRequest.
     * 
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this SetNegativeKeywordsToAdGroupsRequest.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the adGroupNegativeKeywords value for this SetNegativeKeywordsToAdGroupsRequest.
     * 
     * @return adGroupNegativeKeywords
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdGroupNegativeKeywords getAdGroupNegativeKeywords() {
        return adGroupNegativeKeywords;
    }


    /**
     * Sets the adGroupNegativeKeywords value for this SetNegativeKeywordsToAdGroupsRequest.
     * 
     * @param adGroupNegativeKeywords
     */
    public void setAdGroupNegativeKeywords(com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdGroupNegativeKeywords adGroupNegativeKeywords) {
        this.adGroupNegativeKeywords = adGroupNegativeKeywords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetNegativeKeywordsToAdGroupsRequest)) return false;
        SetNegativeKeywordsToAdGroupsRequest other = (SetNegativeKeywordsToAdGroupsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adGroupNegativeKeywords==null && other.getAdGroupNegativeKeywords()==null) || 
             (this.adGroupNegativeKeywords!=null &&
              this.adGroupNegativeKeywords.equals(other.getAdGroupNegativeKeywords())));
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
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getAdGroupNegativeKeywords() != null) {
            _hashCode += getAdGroupNegativeKeywords().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetNegativeKeywordsToAdGroupsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">SetNegativeKeywordsToAdGroupsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupNegativeKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupNegativeKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdGroupNegativeKeywords"));
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
