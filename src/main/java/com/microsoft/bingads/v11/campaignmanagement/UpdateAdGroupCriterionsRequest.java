/**
 * UpdateAdGroupCriterionsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class UpdateAdGroupCriterionsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateAdGroupCriterionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAdGroupCriterionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterion"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CriterionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterion[] adGroupCriterions;
    private java.lang.String[] criterionType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateAdGroupCriterionsRequest() {
    }


    public UpdateAdGroupCriterionsRequest(
            com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterion[] adGroupCriterions,
            java.lang.String[] criterionType) {
        this.adGroupCriterions = adGroupCriterions;
        this.criterionType = criterionType;
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
     * Gets the adGroupCriterions value for this UpdateAdGroupCriterionsRequest.
     *
     * @return adGroupCriterions
     */
    public com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterion[] getAdGroupCriterions() {
        return adGroupCriterions;
    }

    /**
     * Sets the adGroupCriterions value for this UpdateAdGroupCriterionsRequest.
     *
     * @param adGroupCriterions
     */
    public void setAdGroupCriterions(com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterion[] adGroupCriterions) {
        this.adGroupCriterions = adGroupCriterions;
    }

    /**
     * Gets the criterionType value for this UpdateAdGroupCriterionsRequest.
     *
     * @return criterionType
     */
    public java.lang.String[] getCriterionType() {
        return criterionType;
    }

    /**
     * Sets the criterionType value for this UpdateAdGroupCriterionsRequest.
     *
     * @param criterionType
     */
    public void setCriterionType(java.lang.String[] criterionType) {
        this.criterionType = criterionType;
    }

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
                ((this.adGroupCriterions == null && other.getAdGroupCriterions() == null) ||
                        (this.adGroupCriterions != null &&
                                java.util.Arrays.equals(this.adGroupCriterions, other.getAdGroupCriterions()))) &&
                ((this.criterionType == null && other.getCriterionType() == null) ||
                        (this.criterionType != null &&
                                java.util.Arrays.equals(this.criterionType, other.getCriterionType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdGroupCriterions() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdGroupCriterions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupCriterions(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCriterionType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCriterionType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriterionType(), i);
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
