/**
 * UpdateConversionGoalsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class UpdateConversionGoalsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateConversionGoalsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateConversionGoalsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionGoals");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoals"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoal"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.ConversionGoal[] conversionGoals;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public UpdateConversionGoalsRequest() {
    }

    public UpdateConversionGoalsRequest(
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoal[] conversionGoals) {
        this.conversionGoals = conversionGoals;
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
     * Gets the conversionGoals value for this UpdateConversionGoalsRequest.
     *
     * @return conversionGoals
     */
    public com.microsoft.bingads.v11.campaignmanagement.ConversionGoal[] getConversionGoals() {
        return conversionGoals;
    }

    /**
     * Sets the conversionGoals value for this UpdateConversionGoalsRequest.
     *
     * @param conversionGoals
     */
    public void setConversionGoals(com.microsoft.bingads.v11.campaignmanagement.ConversionGoal[] conversionGoals) {
        this.conversionGoals = conversionGoals;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateConversionGoalsRequest)) return false;
        UpdateConversionGoalsRequest other = (UpdateConversionGoalsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.conversionGoals == null && other.getConversionGoals() == null) ||
                        (this.conversionGoals != null &&
                                java.util.Arrays.equals(this.conversionGoals, other.getConversionGoals())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getConversionGoals() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getConversionGoals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionGoals(), i);
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
