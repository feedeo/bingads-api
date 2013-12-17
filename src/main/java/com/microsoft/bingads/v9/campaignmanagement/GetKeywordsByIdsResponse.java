/**
 * GetKeywordsByIdsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

import com.feedeo.bingadsapi.service.HasPartialErrors;

public class GetKeywordsByIdsResponse  implements java.io.Serializable, HasPartialErrors {
    private com.microsoft.bingads.v9.campaignmanagement.Keyword[] keywords;

    private com.microsoft.bingads.v9.campaignmanagement.BatchError[] partialErrors;

    public GetKeywordsByIdsResponse() {
    }

    public GetKeywordsByIdsResponse(
           com.microsoft.bingads.v9.campaignmanagement.Keyword[] keywords,
           com.microsoft.bingads.v9.campaignmanagement.BatchError[] partialErrors) {
           this.keywords = keywords;
           this.partialErrors = partialErrors;
    }


    /**
     * Gets the keywords value for this GetKeywordsByIdsResponse.
     * 
     * @return keywords
     */
    public com.microsoft.bingads.v9.campaignmanagement.Keyword[] getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this GetKeywordsByIdsResponse.
     * 
     * @param keywords
     */
    public void setKeywords(com.microsoft.bingads.v9.campaignmanagement.Keyword[] keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the partialErrors value for this GetKeywordsByIdsResponse.
     * 
     * @return partialErrors
     */
    public com.microsoft.bingads.v9.campaignmanagement.BatchError[] getPartialErrors() {
        return partialErrors;
    }


    /**
     * Sets the partialErrors value for this GetKeywordsByIdsResponse.
     * 
     * @param partialErrors
     */
    public void setPartialErrors(com.microsoft.bingads.v9.campaignmanagement.BatchError[] partialErrors) {
        this.partialErrors = partialErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKeywordsByIdsResponse)) return false;
        GetKeywordsByIdsResponse other = (GetKeywordsByIdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              java.util.Arrays.equals(this.keywords, other.getKeywords()))) &&
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
        if (getKeywords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywords(), i);
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
        new org.apache.axis.description.TypeDesc(GetKeywordsByIdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetKeywordsByIdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Keyword"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Keyword"));
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
