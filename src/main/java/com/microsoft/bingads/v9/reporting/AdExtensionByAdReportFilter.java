/**
 * AdExtensionByAdReportFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class AdExtensionByAdReportFilter  implements java.io.Serializable {
    private java.lang.String[] deviceOS;

    private java.lang.String[] deviceType;

    public AdExtensionByAdReportFilter() {
    }

    public AdExtensionByAdReportFilter(
           java.lang.String[] deviceOS,
           java.lang.String[] deviceType) {
           this.deviceOS = deviceOS;
           this.deviceType = deviceType;
    }


    /**
     * Gets the deviceOS value for this AdExtensionByAdReportFilter.
     * 
     * @return deviceOS
     */
    public java.lang.String[] getDeviceOS() {
        return deviceOS;
    }


    /**
     * Sets the deviceOS value for this AdExtensionByAdReportFilter.
     * 
     * @param deviceOS
     */
    public void setDeviceOS(java.lang.String[] deviceOS) {
        this.deviceOS = deviceOS;
    }


    /**
     * Gets the deviceType value for this AdExtensionByAdReportFilter.
     * 
     * @return deviceType
     */
    public java.lang.String[] getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this AdExtensionByAdReportFilter.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.String[] deviceType) {
        this.deviceType = deviceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtensionByAdReportFilter)) return false;
        AdExtensionByAdReportFilter other = (AdExtensionByAdReportFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceOS==null && other.getDeviceOS()==null) || 
             (this.deviceOS!=null &&
              java.util.Arrays.equals(this.deviceOS, other.getDeviceOS()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              java.util.Arrays.equals(this.deviceType, other.getDeviceType())));
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
        if (getDeviceOS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceOS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceOS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceType(), i);
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
        new org.apache.axis.description.TypeDesc(AdExtensionByAdReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByAdReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceOS");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeviceOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeviceOSReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DeviceTypeReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
