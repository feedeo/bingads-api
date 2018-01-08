/**
 * WebpageParameter.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.datacontracts;

public class WebpageParameter implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(WebpageParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "WebpageParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "WebpageCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "WebpageCondition"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CriterionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.datacontracts.WebpageCondition[] conditions;
    private java.lang.String criterionName;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public WebpageParameter() {
    }


    public WebpageParameter(
            com.microsoft.bingads.v11.datacontracts.WebpageCondition[] conditions,
            java.lang.String criterionName) {
        this.conditions = conditions;
        this.criterionName = criterionName;
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
     * Gets the conditions value for this WebpageParameter.
     *
     * @return conditions
     */
    public com.microsoft.bingads.v11.datacontracts.WebpageCondition[] getConditions() {
        return conditions;
    }

    /**
     * Sets the conditions value for this WebpageParameter.
     *
     * @param conditions
     */
    public void setConditions(com.microsoft.bingads.v11.datacontracts.WebpageCondition[] conditions) {
        this.conditions = conditions;
    }

    /**
     * Gets the criterionName value for this WebpageParameter.
     *
     * @return criterionName
     */
    public java.lang.String getCriterionName() {
        return criterionName;
    }

    /**
     * Sets the criterionName value for this WebpageParameter.
     *
     * @param criterionName
     */
    public void setCriterionName(java.lang.String criterionName) {
        this.criterionName = criterionName;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebpageParameter)) return false;
        WebpageParameter other = (WebpageParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.conditions == null && other.getConditions() == null) ||
                        (this.conditions != null &&
                                java.util.Arrays.equals(this.conditions, other.getConditions()))) &&
                ((this.criterionName == null && other.getCriterionName() == null) ||
                        (this.criterionName != null &&
                                this.criterionName.equals(other.getCriterionName())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getConditions() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getConditions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConditions(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCriterionName() != null) {
            _hashCode += getCriterionName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
