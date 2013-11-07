/**
 * ArrayOfCampaignScope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfCampaignScope  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.CampaignScope[] campaignScope;

    public ArrayOfCampaignScope() {
    }

    public ArrayOfCampaignScope(
           com.microsoft.bingads.v9.campaignmanagement.CampaignScope[] campaignScope) {
           this.campaignScope = campaignScope;
    }


    /**
     * Gets the campaignScope value for this ArrayOfCampaignScope.
     * 
     * @return campaignScope
     */
    public com.microsoft.bingads.v9.campaignmanagement.CampaignScope[] getCampaignScope() {
        return campaignScope;
    }


    /**
     * Sets the campaignScope value for this ArrayOfCampaignScope.
     * 
     * @param campaignScope
     */
    public void setCampaignScope(com.microsoft.bingads.v9.campaignmanagement.CampaignScope[] campaignScope) {
        this.campaignScope = campaignScope;
    }

    public com.microsoft.bingads.v9.campaignmanagement.CampaignScope getCampaignScope(int i) {
        return this.campaignScope[i];
    }

    public void setCampaignScope(int i, com.microsoft.bingads.v9.campaignmanagement.CampaignScope _value) {
        this.campaignScope[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCampaignScope)) return false;
        ArrayOfCampaignScope other = (ArrayOfCampaignScope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignScope==null && other.getCampaignScope()==null) || 
             (this.campaignScope!=null &&
              java.util.Arrays.equals(this.campaignScope, other.getCampaignScope())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCampaignScope() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignScope());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignScope(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfCampaignScope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCampaignScope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignScope"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
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
          new  org.apache.axis.encoding.ser.BeanSerializer(
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
