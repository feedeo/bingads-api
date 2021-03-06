/**
 * ApplyOfflineConversionsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class ApplyOfflineConversionsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ApplyOfflineConversionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">ApplyOfflineConversionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineConversions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OfflineConversions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OfflineConversion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OfflineConversion"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.OfflineConversion[] offlineConversions;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public ApplyOfflineConversionsRequest() {
    }

    public ApplyOfflineConversionsRequest(
            com.microsoft.bingads.v11.campaignmanagement.OfflineConversion[] offlineConversions) {
        this.offlineConversions = offlineConversions;
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
     * Gets the offlineConversions value for this ApplyOfflineConversionsRequest.
     *
     * @return offlineConversions
     */
    public com.microsoft.bingads.v11.campaignmanagement.OfflineConversion[] getOfflineConversions() {
        return offlineConversions;
    }

    /**
     * Sets the offlineConversions value for this ApplyOfflineConversionsRequest.
     *
     * @param offlineConversions
     */
    public void setOfflineConversions(com.microsoft.bingads.v11.campaignmanagement.OfflineConversion[] offlineConversions) {
        this.offlineConversions = offlineConversions;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyOfflineConversionsRequest)) return false;
        ApplyOfflineConversionsRequest other = (ApplyOfflineConversionsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.offlineConversions == null && other.getOfflineConversions() == null) ||
                        (this.offlineConversions != null &&
                                java.util.Arrays.equals(this.offlineConversions, other.getOfflineConversions())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOfflineConversions() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getOfflineConversions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfflineConversions(), i);
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
