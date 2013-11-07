/**
 * ArrayOfCampaignReportScope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfCampaignReportScope  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.CampaignReportScope[] campaignReportScope;

    public ArrayOfCampaignReportScope() {
    }

    public ArrayOfCampaignReportScope(
           com.microsoft.bingads.v9.reporting.CampaignReportScope[] campaignReportScope) {
           this.campaignReportScope = campaignReportScope;
    }


    /**
     * Gets the campaignReportScope value for this ArrayOfCampaignReportScope.
     * 
     * @return campaignReportScope
     */
    public com.microsoft.bingads.v9.reporting.CampaignReportScope[] getCampaignReportScope() {
        return campaignReportScope;
    }


    /**
     * Sets the campaignReportScope value for this ArrayOfCampaignReportScope.
     * 
     * @param campaignReportScope
     */
    public void setCampaignReportScope(com.microsoft.bingads.v9.reporting.CampaignReportScope[] campaignReportScope) {
        this.campaignReportScope = campaignReportScope;
    }

    public com.microsoft.bingads.v9.reporting.CampaignReportScope getCampaignReportScope(int i) {
        return this.campaignReportScope[i];
    }

    public void setCampaignReportScope(int i, com.microsoft.bingads.v9.reporting.CampaignReportScope _value) {
        this.campaignReportScope[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCampaignReportScope)) return false;
        ArrayOfCampaignReportScope other = (ArrayOfCampaignReportScope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignReportScope==null && other.getCampaignReportScope()==null) || 
             (this.campaignReportScope!=null &&
              java.util.Arrays.equals(this.campaignReportScope, other.getCampaignReportScope())));
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
        if (getCampaignReportScope() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignReportScope());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignReportScope(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCampaignReportScope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfCampaignReportScope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignReportScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignReportScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignReportScope"));
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
