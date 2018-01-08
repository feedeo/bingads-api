/**
 * EventGoal.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class EventGoal extends com.microsoft.bingads.v11.campaignmanagement.ConversionGoal implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(EventGoal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EventGoal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ActionExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ActionOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ExpressionOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CategoryExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CategoryOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ExpressionOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LabelOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ExpressionOperator"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ValueOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ValueOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String actionExpression;
    private com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator actionOperator;
    private java.lang.String categoryExpression;
    private com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator categoryOperator;
    private java.lang.String labelExpression;
    private com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator labelOperator;
    private java.math.BigDecimal value;
    private com.microsoft.bingads.v11.campaignmanagement.ValueOperator valueOperator;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public EventGoal() {
    }


    public EventGoal(
            java.lang.Integer conversionWindowInMinutes,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalCountType countType,
            java.lang.Long id,
            java.lang.String name,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenue revenue,
            com.microsoft.bingads.v11.campaignmanagement.EntityScope scope,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalStatus status,
            java.lang.Long tagId,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalTrackingStatus trackingStatus,
            java.lang.String[] type,
            java.lang.String actionExpression,
            com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator actionOperator,
            java.lang.String categoryExpression,
            com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator categoryOperator,
            java.lang.String labelExpression,
            com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator labelOperator,
            java.math.BigDecimal value,
            com.microsoft.bingads.v11.campaignmanagement.ValueOperator valueOperator) {
        super(
                conversionWindowInMinutes,
                countType,
                id,
                name,
                revenue,
                scope,
                status,
                tagId,
                trackingStatus,
                type);
        this.actionExpression = actionExpression;
        this.actionOperator = actionOperator;
        this.categoryExpression = categoryExpression;
        this.categoryOperator = categoryOperator;
        this.labelExpression = labelExpression;
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
     * Gets the actionExpression value for this EventGoal.
     *
     * @return actionExpression
     */
    public java.lang.String getActionExpression() {
        return actionExpression;
    }

    /**
     * Sets the actionExpression value for this EventGoal.
     *
     * @param actionExpression
     */
    public void setActionExpression(java.lang.String actionExpression) {
        this.actionExpression = actionExpression;
    }

    /**
     * Gets the actionOperator value for this EventGoal.
     *
     * @return actionOperator
     */
    public com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator getActionOperator() {
        return actionOperator;
    }

    /**
     * Sets the actionOperator value for this EventGoal.
     *
     * @param actionOperator
     */
    public void setActionOperator(com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator actionOperator) {
        this.actionOperator = actionOperator;
    }

    /**
     * Gets the categoryExpression value for this EventGoal.
     *
     * @return categoryExpression
     */
    public java.lang.String getCategoryExpression() {
        return categoryExpression;
    }

    /**
     * Sets the categoryExpression value for this EventGoal.
     *
     * @param categoryExpression
     */
    public void setCategoryExpression(java.lang.String categoryExpression) {
        this.categoryExpression = categoryExpression;
    }

    /**
     * Gets the categoryOperator value for this EventGoal.
     *
     * @return categoryOperator
     */
    public com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator getCategoryOperator() {
        return categoryOperator;
    }

    /**
     * Sets the categoryOperator value for this EventGoal.
     *
     * @param categoryOperator
     */
    public void setCategoryOperator(com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator categoryOperator) {
        this.categoryOperator = categoryOperator;
    }

    /**
     * Gets the labelExpression value for this EventGoal.
     *
     * @return labelExpression
     */
    public java.lang.String getLabelExpression() {
        return labelExpression;
    }

    /**
     * Sets the labelExpression value for this EventGoal.
     *
     * @param labelExpression
     */
    public void setLabelExpression(java.lang.String labelExpression) {
        this.labelExpression = labelExpression;
    }

    /**
     * Gets the labelOperator value for this EventGoal.
     *
     * @return labelOperator
     */
    public com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator getLabelOperator() {
        return labelOperator;
    }

    /**
     * Sets the labelOperator value for this EventGoal.
     *
     * @param labelOperator
     */
    public void setLabelOperator(com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator labelOperator) {
        this.labelOperator = labelOperator;
    }

    /**
     * Gets the value value for this EventGoal.
     *
     * @return value
     */
    public java.math.BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value value for this EventGoal.
     *
     * @param value
     */
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the valueOperator value for this EventGoal.
     *
     * @return valueOperator
     */
    public com.microsoft.bingads.v11.campaignmanagement.ValueOperator getValueOperator() {
        return valueOperator;
    }

    /**
     * Sets the valueOperator value for this EventGoal.
     *
     * @param valueOperator
     */
    public void setValueOperator(com.microsoft.bingads.v11.campaignmanagement.ValueOperator valueOperator) {
        this.valueOperator = valueOperator;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventGoal)) return false;
        EventGoal other = (EventGoal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.actionExpression == null && other.getActionExpression() == null) ||
                        (this.actionExpression != null &&
                                this.actionExpression.equals(other.getActionExpression()))) &&
                ((this.actionOperator == null && other.getActionOperator() == null) ||
                        (this.actionOperator != null &&
                                this.actionOperator.equals(other.getActionOperator()))) &&
                ((this.categoryExpression == null && other.getCategoryExpression() == null) ||
                        (this.categoryExpression != null &&
                                this.categoryExpression.equals(other.getCategoryExpression()))) &&
                ((this.categoryOperator == null && other.getCategoryOperator() == null) ||
                        (this.categoryOperator != null &&
                                this.categoryOperator.equals(other.getCategoryOperator()))) &&
                ((this.labelExpression == null && other.getLabelExpression() == null) ||
                        (this.labelExpression != null &&
                                this.labelExpression.equals(other.getLabelExpression()))) &&
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
        if (getActionExpression() != null) {
            _hashCode += getActionExpression().hashCode();
        }
        if (getActionOperator() != null) {
            _hashCode += getActionOperator().hashCode();
        }
        if (getCategoryExpression() != null) {
            _hashCode += getCategoryExpression().hashCode();
        }
        if (getCategoryOperator() != null) {
            _hashCode += getCategoryOperator().hashCode();
        }
        if (getLabelExpression() != null) {
            _hashCode += getLabelExpression().hashCode();
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
