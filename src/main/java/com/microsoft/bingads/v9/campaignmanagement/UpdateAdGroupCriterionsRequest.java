/**
 * UpdateAdGroupCriterionsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class UpdateAdGroupCriterionsRequest  implements java.io.Serializable {
    private java.lang.Long accountId;

    private com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] adGroupCriterions;

    public UpdateAdGroupCriterionsRequest() {
    }

    public UpdateAdGroupCriterionsRequest(
           java.lang.Long accountId,
           com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] adGroupCriterions) {
           this.accountId = accountId;
           this.adGroupCriterions = adGroupCriterions;
    }


    /**
     * Gets the accountId value for this UpdateAdGroupCriterionsRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this UpdateAdGroupCriterionsRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the adGroupCriterions value for this UpdateAdGroupCriterionsRequest.
     * 
     * @return adGroupCriterions
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] getAdGroupCriterions() {
        return adGroupCriterions;
    }


    /**
     * Sets the adGroupCriterions value for this UpdateAdGroupCriterionsRequest.
     * 
     * @param adGroupCriterions
     */
    public void setAdGroupCriterions(com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] adGroupCriterions) {
        this.adGroupCriterions = adGroupCriterions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAdGroupCriterionsRequest)) return false;
        UpdateAdGroupCriterionsRequest other = (UpdateAdGroupCriterionsRequest) obj;
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
            ((this.adGroupCriterions==null && other.getAdGroupCriterions()==null) || 
             (this.adGroupCriterions!=null &&
              java.util.Arrays.equals(this.adGroupCriterions, other.getAdGroupCriterions())));
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
        if (getAdGroupCriterions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdGroupCriterions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupCriterions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAdGroupCriterionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">UpdateAdGroupCriterionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterion"));
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
