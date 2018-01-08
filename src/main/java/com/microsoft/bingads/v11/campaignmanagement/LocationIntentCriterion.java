/**
 * LocationIntentCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class LocationIntentCriterion extends com.microsoft.bingads.v11.campaignmanagement.Criterion implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(LocationIntentCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LocationIntentCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intentOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IntentOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IntentOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.IntentOption intentOption;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public LocationIntentCriterion() {
    }

    public LocationIntentCriterion(
            java.lang.String type,
            com.microsoft.bingads.v11.campaignmanagement.IntentOption intentOption) {
        super(
                type);
        this.intentOption = intentOption;
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
     * Gets the intentOption value for this LocationIntentCriterion.
     *
     * @return intentOption
     */
    public com.microsoft.bingads.v11.campaignmanagement.IntentOption getIntentOption() {
        return intentOption;
    }

    /**
     * Sets the intentOption value for this LocationIntentCriterion.
     *
     * @param intentOption
     */
    public void setIntentOption(com.microsoft.bingads.v11.campaignmanagement.IntentOption intentOption) {
        this.intentOption = intentOption;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationIntentCriterion)) return false;
        LocationIntentCriterion other = (LocationIntentCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.intentOption == null && other.getIntentOption() == null) ||
                        (this.intentOption != null &&
                                this.intentOption.equals(other.getIntentOption())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getIntentOption() != null) {
            _hashCode += getIntentOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
