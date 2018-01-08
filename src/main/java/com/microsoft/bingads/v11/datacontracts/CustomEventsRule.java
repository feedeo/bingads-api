/**
 * CustomEventsRule.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.datacontracts;

public class CustomEventsRule extends com.microsoft.bingads.v11.datacontracts.RemarketingRule implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CustomEventsRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CustomEventsRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "ActionOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StringOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CategoryOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StringOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "LabelOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StringOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "ValueOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NumberOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String action;
    private com.microsoft.bingads.v11.campaignmanagement.StringOperator actionOperator;
    private java.lang.String category;
    private com.microsoft.bingads.v11.campaignmanagement.StringOperator categoryOperator;
    private java.lang.String label;
    private com.microsoft.bingads.v11.campaignmanagement.StringOperator labelOperator;
    private java.math.BigDecimal value;
    private com.microsoft.bingads.v11.campaignmanagement.NumberOperator valueOperator;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CustomEventsRule() {
    }


    public CustomEventsRule(
            java.lang.String type,
            java.lang.String action,
            com.microsoft.bingads.v11.campaignmanagement.StringOperator actionOperator,
            java.lang.String category,
            com.microsoft.bingads.v11.campaignmanagement.StringOperator categoryOperator,
            java.lang.String label,
            com.microsoft.bingads.v11.campaignmanagement.StringOperator labelOperator,
            java.math.BigDecimal value,
            com.microsoft.bingads.v11.campaignmanagement.NumberOperator valueOperator) {
        super(
                type);
        this.action = action;
        this.actionOperator = actionOperator;
        this.category = category;
        this.categoryOperator = categoryOperator;
        this.label = label;
        this.labelOperator = labelOperator;
        this.value = value;
        this.valueOperator = valueOperator;
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
     * Gets the action value for this CustomEventsRule.
     *
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }

    /**
     * Sets the action value for this CustomEventsRule.
     *
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    /**
     * Gets the actionOperator value for this CustomEventsRule.
     *
     * @return actionOperator
     */
    public com.microsoft.bingads.v11.campaignmanagement.StringOperator getActionOperator() {
        return actionOperator;
    }

    /**
     * Sets the actionOperator value for this CustomEventsRule.
     *
     * @param actionOperator
     */
    public void setActionOperator(com.microsoft.bingads.v11.campaignmanagement.StringOperator actionOperator) {
        this.actionOperator = actionOperator;
    }

    /**
     * Gets the category value for this CustomEventsRule.
     *
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }

    /**
     * Sets the category value for this CustomEventsRule.
     *
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    /**
     * Gets the categoryOperator value for this CustomEventsRule.
     *
     * @return categoryOperator
     */
    public com.microsoft.bingads.v11.campaignmanagement.StringOperator getCategoryOperator() {
        return categoryOperator;
    }

    /**
     * Sets the categoryOperator value for this CustomEventsRule.
     *
     * @param categoryOperator
     */
    public void setCategoryOperator(com.microsoft.bingads.v11.campaignmanagement.StringOperator categoryOperator) {
        this.categoryOperator = categoryOperator;
    }

    /**
     * Gets the label value for this CustomEventsRule.
     *
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }

    /**
     * Sets the label value for this CustomEventsRule.
     *
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }

    /**
     * Gets the labelOperator value for this CustomEventsRule.
     *
     * @return labelOperator
     */
    public com.microsoft.bingads.v11.campaignmanagement.StringOperator getLabelOperator() {
        return labelOperator;
    }

    /**
     * Sets the labelOperator value for this CustomEventsRule.
     *
     * @param labelOperator
     */
    public void setLabelOperator(com.microsoft.bingads.v11.campaignmanagement.StringOperator labelOperator) {
        this.labelOperator = labelOperator;
    }

    /**
     * Gets the value value for this CustomEventsRule.
     *
     * @return value
     */
    public java.math.BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value value for this CustomEventsRule.
     *
     * @param value
     */
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the valueOperator value for this CustomEventsRule.
     *
     * @return valueOperator
     */
    public com.microsoft.bingads.v11.campaignmanagement.NumberOperator getValueOperator() {
        return valueOperator;
    }

    /**
     * Sets the valueOperator value for this CustomEventsRule.
     *
     * @param valueOperator
     */
    public void setValueOperator(com.microsoft.bingads.v11.campaignmanagement.NumberOperator valueOperator) {
        this.valueOperator = valueOperator;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomEventsRule)) return false;
        CustomEventsRule other = (CustomEventsRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.action == null && other.getAction() == null) ||
                        (this.action != null &&
                                this.action.equals(other.getAction()))) &&
                ((this.actionOperator == null && other.getActionOperator() == null) ||
                        (this.actionOperator != null &&
                                this.actionOperator.equals(other.getActionOperator()))) &&
                ((this.category == null && other.getCategory() == null) ||
                        (this.category != null &&
                                this.category.equals(other.getCategory()))) &&
                ((this.categoryOperator == null && other.getCategoryOperator() == null) ||
                        (this.categoryOperator != null &&
                                this.categoryOperator.equals(other.getCategoryOperator()))) &&
                ((this.label == null && other.getLabel() == null) ||
                        (this.label != null &&
                                this.label.equals(other.getLabel()))) &&
                ((this.labelOperator == null && other.getLabelOperator() == null) ||
                        (this.labelOperator != null &&
                                this.labelOperator.equals(other.getLabelOperator()))) &&
                ((this.value == null && other.getValue() == null) ||
                        (this.value != null &&
                                this.value.equals(other.getValue()))) &&
                ((this.valueOperator == null && other.getValueOperator() == null) ||
                        (this.valueOperator != null &&
                                this.valueOperator.equals(other.getValueOperator())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getActionOperator() != null) {
            _hashCode += getActionOperator().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCategoryOperator() != null) {
            _hashCode += getCategoryOperator().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLabelOperator() != null) {
            _hashCode += getLabelOperator().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getValueOperator() != null) {
            _hashCode += getValueOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
