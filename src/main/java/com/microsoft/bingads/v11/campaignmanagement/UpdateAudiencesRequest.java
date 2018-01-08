/**
 * UpdateAudiencesRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class UpdateAudiencesRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateAudiencesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateAudiencesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audiences");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Audiences"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Audience"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Audience"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.Audience[] audiences;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public UpdateAudiencesRequest() {
    }

    public UpdateAudiencesRequest(
            com.microsoft.bingads.v11.campaignmanagement.Audience[] audiences) {
        this.audiences = audiences;
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
     * Gets the audiences value for this UpdateAudiencesRequest.
     *
     * @return audiences
     */
    public com.microsoft.bingads.v11.campaignmanagement.Audience[] getAudiences() {
        return audiences;
    }

    /**
     * Sets the audiences value for this UpdateAudiencesRequest.
     *
     * @param audiences
     */
    public void setAudiences(com.microsoft.bingads.v11.campaignmanagement.Audience[] audiences) {
        this.audiences = audiences;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAudiencesRequest)) return false;
        UpdateAudiencesRequest other = (UpdateAudiencesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.audiences == null && other.getAudiences() == null) ||
                        (this.audiences != null &&
                                java.util.Arrays.equals(this.audiences, other.getAudiences())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAudiences() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAudiences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudiences(), i);
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
