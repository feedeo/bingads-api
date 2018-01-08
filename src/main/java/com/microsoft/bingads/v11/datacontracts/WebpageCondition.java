/**
 * WebpageCondition.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.datacontracts;

public class WebpageCondition implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(WebpageCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "WebpageCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Argument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Operand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "WebpageConditionOperand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String argument;
    private com.microsoft.bingads.v11.campaignmanagement.WebpageConditionOperand operand;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public WebpageCondition() {
    }


    public WebpageCondition(
            java.lang.String argument,
            com.microsoft.bingads.v11.campaignmanagement.WebpageConditionOperand operand) {
        this.argument = argument;
        this.operand = operand;
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
     * Gets the argument value for this WebpageCondition.
     *
     * @return argument
     */
    public java.lang.String getArgument() {
        return argument;
    }

    /**
     * Sets the argument value for this WebpageCondition.
     *
     * @param argument
     */
    public void setArgument(java.lang.String argument) {
        this.argument = argument;
    }

    /**
     * Gets the operand value for this WebpageCondition.
     *
     * @return operand
     */
    public com.microsoft.bingads.v11.campaignmanagement.WebpageConditionOperand getOperand() {
        return operand;
    }

    /**
     * Sets the operand value for this WebpageCondition.
     *
     * @param operand
     */
    public void setOperand(com.microsoft.bingads.v11.campaignmanagement.WebpageConditionOperand operand) {
        this.operand = operand;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebpageCondition)) return false;
        WebpageCondition other = (WebpageCondition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.argument == null && other.getArgument() == null) ||
                        (this.argument != null &&
                                this.argument.equals(other.getArgument()))) &&
                ((this.operand == null && other.getOperand() == null) ||
                        (this.operand != null &&
                                this.operand.equals(other.getOperand())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getArgument() != null) {
            _hashCode += getArgument().hashCode();
        }
        if (getOperand() != null) {
            _hashCode += getOperand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
