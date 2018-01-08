/**
 * StringRuleItem.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.datacontracts;

public class StringRuleItem extends com.microsoft.bingads.v11.datacontracts.RuleItem implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(StringRuleItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "StringRuleItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Operand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StringOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String operand;
    private com.microsoft.bingads.v11.campaignmanagement.StringOperator operator;
    private java.lang.String value;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public StringRuleItem() {
    }


    public StringRuleItem(
            java.lang.String type,
            java.lang.String operand,
            com.microsoft.bingads.v11.campaignmanagement.StringOperator operator,
            java.lang.String value) {
        super(
                type);
        this.operand = operand;
        this.operator = operator;
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
     * Gets the operand value for this StringRuleItem.
     *
     * @return operand
     */
    public java.lang.String getOperand() {
        return operand;
    }

    /**
     * Sets the operand value for this StringRuleItem.
     *
     * @param operand
     */
    public void setOperand(java.lang.String operand) {
        this.operand = operand;
    }

    /**
     * Gets the operator value for this StringRuleItem.
     *
     * @return operator
     */
    public com.microsoft.bingads.v11.campaignmanagement.StringOperator getOperator() {
        return operator;
    }

    /**
     * Sets the operator value for this StringRuleItem.
     *
     * @param operator
     */
    public void setOperator(com.microsoft.bingads.v11.campaignmanagement.StringOperator operator) {
        this.operator = operator;
    }

    /**
     * Gets the value value for this StringRuleItem.
     *
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Sets the value value for this StringRuleItem.
     *
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StringRuleItem)) return false;
        StringRuleItem other = (StringRuleItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.operand == null && other.getOperand() == null) ||
                        (this.operand != null &&
                                this.operand.equals(other.getOperand()))) &&
                ((this.operator == null && other.getOperator() == null) ||
                        (this.operator != null &&
                                this.operator.equals(other.getOperator()))) &&
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
        int _hashCode = super.hashCode();
        if (getOperand() != null) {
            _hashCode += getOperand().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
