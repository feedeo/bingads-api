/**
 * ConversionGoalRevenue.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class ConversionGoalRevenue implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ConversionGoalRevenue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalRevenue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalRevenueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String currencyCode;
    private com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenueType type;
    private java.math.BigDecimal value;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ConversionGoalRevenue() {
    }


    public ConversionGoalRevenue(
            java.lang.String currencyCode,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenueType type,
            java.math.BigDecimal value) {
        this.currencyCode = currencyCode;
        this.type = type;
        this.value = value;
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
     * Gets the currencyCode value for this ConversionGoalRevenue.
     *
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the currencyCode value for this ConversionGoalRevenue.
     *
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Gets the type value for this ConversionGoalRevenue.
     *
     * @return type
     */
    public com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenueType getType() {
        return type;
    }

    /**
     * Sets the type value for this ConversionGoalRevenue.
     *
     * @param type
     */
    public void setType(com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenueType type) {
        this.type = type;
    }

    /**
     * Gets the value value for this ConversionGoalRevenue.
     *
     * @return value
     */
    public java.math.BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value value for this ConversionGoalRevenue.
     *
     * @param value
     */
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConversionGoalRevenue)) return false;
        ConversionGoalRevenue other = (ConversionGoalRevenue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.currencyCode == null && other.getCurrencyCode() == null) ||
                        (this.currencyCode != null &&
                                this.currencyCode.equals(other.getCurrencyCode()))) &&
                ((this.type == null && other.getType() == null) ||
                        (this.type != null &&
                                this.type.equals(other.getType()))) &&
                ((this.value == null && other.getValue() == null) ||
                        (this.value != null &&
                                this.value.equals(other.getValue())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
