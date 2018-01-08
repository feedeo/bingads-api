/**
 * UrlGoal.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class UrlGoal extends com.microsoft.bingads.v11.campaignmanagement.ConversionGoal implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UrlGoal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UrlGoal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UrlExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UrlOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ExpressionOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String urlExpression;
    private com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator urlOperator;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UrlGoal() {
    }


    public UrlGoal(
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
            java.lang.String urlExpression,
            com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator urlOperator) {
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
        this.urlExpression = urlExpression;
        this.urlOperator = urlOperator;
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
     * Gets the urlExpression value for this UrlGoal.
     *
     * @return urlExpression
     */
    public java.lang.String getUrlExpression() {
        return urlExpression;
    }

    /**
     * Sets the urlExpression value for this UrlGoal.
     *
     * @param urlExpression
     */
    public void setUrlExpression(java.lang.String urlExpression) {
        this.urlExpression = urlExpression;
    }

    /**
     * Gets the urlOperator value for this UrlGoal.
     *
     * @return urlOperator
     */
    public com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator getUrlOperator() {
        return urlOperator;
    }

    /**
     * Sets the urlOperator value for this UrlGoal.
     *
     * @param urlOperator
     */
    public void setUrlOperator(com.microsoft.bingads.v11.campaignmanagement.ExpressionOperator urlOperator) {
        this.urlOperator = urlOperator;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UrlGoal)) return false;
        UrlGoal other = (UrlGoal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.urlExpression == null && other.getUrlExpression() == null) ||
                        (this.urlExpression != null &&
                                this.urlExpression.equals(other.getUrlExpression()))) &&
                ((this.urlOperator == null && other.getUrlOperator() == null) ||
                        (this.urlOperator != null &&
                                this.urlOperator.equals(other.getUrlOperator())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUrlExpression() != null) {
            _hashCode += getUrlExpression().hashCode();
        }
        if (getUrlOperator() != null) {
            _hashCode += getUrlOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
