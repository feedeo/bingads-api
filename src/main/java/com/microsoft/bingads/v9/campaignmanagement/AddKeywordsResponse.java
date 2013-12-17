/**
 * AddKeywordsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

import com.feedeo.bingadsapi.service.HasPartialErrors;

public class AddKeywordsResponse  implements java.io.Serializable, HasPartialErrors {
    private Long[] keywordIds;

    private com.microsoft.bingads.v9.campaignmanagement.BatchError[] partialErrors;

    public AddKeywordsResponse() {
    }

    public AddKeywordsResponse(
           Long[] keywordIds,
           com.microsoft.bingads.v9.campaignmanagement.BatchError[] partialErrors) {
           this.keywordIds = keywordIds;
           this.partialErrors = partialErrors;
    }


    /**
     * Gets the keywordIds value for this AddKeywordsResponse.
     * 
     * @return keywordIds
     */
    public Long[] getKeywordIds() {
        return keywordIds;
    }


    /**
     * Sets the keywordIds value for this AddKeywordsResponse.
     * 
     * @param keywordIds
     */
    public void setKeywordIds(Long[] keywordIds) {
        this.keywordIds = keywordIds;
    }


    /**
     * Gets the partialErrors value for this AddKeywordsResponse.
     * 
     * @return partialErrors
     */
    public com.microsoft.bingads.v9.campaignmanagement.BatchError[] getPartialErrors() {
        return partialErrors;
    }


    /**
     * Sets the partialErrors value for this AddKeywordsResponse.
     * 
     * @param partialErrors
     */
    public void setPartialErrors(com.microsoft.bingads.v9.campaignmanagement.BatchError[] partialErrors) {
        this.partialErrors = partialErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddKeywordsResponse)) return false;
        AddKeywordsResponse other = (AddKeywordsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordIds==null && other.getKeywordIds()==null) || 
             (this.keywordIds!=null &&
              java.util.Arrays.equals(this.keywordIds, other.getKeywordIds()))) &&
            ((this.partialErrors==null && other.getPartialErrors()==null) || 
             (this.partialErrors!=null &&
              java.util.Arrays.equals(this.partialErrors, other.getPartialErrors())));
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
        if (getKeywordIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartialErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartialErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartialErrors(), i);
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
        new org.apache.axis.description.TypeDesc(AddKeywordsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddKeywordsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "KeywordIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PartialErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BatchError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BatchError"));
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
