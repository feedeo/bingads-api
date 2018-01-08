/**
 * AddAdGroupCriterionsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AddAdGroupCriterionsResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AddAdGroupCriterionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">AddAdGroupCriterionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMigrated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IsMigrated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nestedPartialErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NestedPartialErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchErrorCollection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchErrorCollection"));
        typeDesc.addFieldDesc(elemField);
    }

    private long[] adGroupCriterionIds;
    private java.lang.Boolean isMigrated;
    private com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] nestedPartialErrors;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AddAdGroupCriterionsResponse() {
    }


    public AddAdGroupCriterionsResponse(
            long[] adGroupCriterionIds,
            java.lang.Boolean isMigrated,
            com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] nestedPartialErrors) {
        this.adGroupCriterionIds = adGroupCriterionIds;
        this.isMigrated = isMigrated;
        this.nestedPartialErrors = nestedPartialErrors;
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
     * Gets the adGroupCriterionIds value for this AddAdGroupCriterionsResponse.
     *
     * @return adGroupCriterionIds
     */
    public long[] getAdGroupCriterionIds() {
        return adGroupCriterionIds;
    }

    /**
     * Sets the adGroupCriterionIds value for this AddAdGroupCriterionsResponse.
     *
     * @param adGroupCriterionIds
     */
    public void setAdGroupCriterionIds(long[] adGroupCriterionIds) {
        this.adGroupCriterionIds = adGroupCriterionIds;
    }

    /**
     * Gets the isMigrated value for this AddAdGroupCriterionsResponse.
     *
     * @return isMigrated
     */
    public java.lang.Boolean getIsMigrated() {
        return isMigrated;
    }

    /**
     * Sets the isMigrated value for this AddAdGroupCriterionsResponse.
     *
     * @param isMigrated
     */
    public void setIsMigrated(java.lang.Boolean isMigrated) {
        this.isMigrated = isMigrated;
    }

    /**
     * Gets the nestedPartialErrors value for this AddAdGroupCriterionsResponse.
     *
     * @return nestedPartialErrors
     */
    public com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] getNestedPartialErrors() {
        return nestedPartialErrors;
    }

    /**
     * Sets the nestedPartialErrors value for this AddAdGroupCriterionsResponse.
     *
     * @param nestedPartialErrors
     */
    public void setNestedPartialErrors(com.microsoft.bingads.v11.campaignmanagement.BatchErrorCollection[] nestedPartialErrors) {
        this.nestedPartialErrors = nestedPartialErrors;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddAdGroupCriterionsResponse)) return false;
        AddAdGroupCriterionsResponse other = (AddAdGroupCriterionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.adGroupCriterionIds == null && other.getAdGroupCriterionIds() == null) ||
                        (this.adGroupCriterionIds != null &&
                                java.util.Arrays.equals(this.adGroupCriterionIds, other.getAdGroupCriterionIds()))) &&
                ((this.isMigrated == null && other.getIsMigrated() == null) ||
                        (this.isMigrated != null &&
                                this.isMigrated.equals(other.getIsMigrated()))) &&
                ((this.nestedPartialErrors == null && other.getNestedPartialErrors() == null) ||
                        (this.nestedPartialErrors != null &&
                                java.util.Arrays.equals(this.nestedPartialErrors, other.getNestedPartialErrors())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdGroupCriterionIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdGroupCriterionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupCriterionIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsMigrated() != null) {
            _hashCode += getIsMigrated().hashCode();
        }
        if (getNestedPartialErrors() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getNestedPartialErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNestedPartialErrors(), i);
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
