/**
 * SubmitGenerateReportResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class SubmitGenerateReportResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SubmitGenerateReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", ">SubmitGenerateReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportRequestId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportRequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String reportRequestId;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public SubmitGenerateReportResponse() {
    }

    public SubmitGenerateReportResponse(
            java.lang.String reportRequestId) {
        this.reportRequestId = reportRequestId;
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
     * Gets the reportRequestId value for this SubmitGenerateReportResponse.
     *
     * @return reportRequestId
     */
    public java.lang.String getReportRequestId() {
        return reportRequestId;
    }

    /**
     * Sets the reportRequestId value for this SubmitGenerateReportResponse.
     *
     * @param reportRequestId
     */
    public void setReportRequestId(java.lang.String reportRequestId) {
        this.reportRequestId = reportRequestId;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitGenerateReportResponse)) return false;
        SubmitGenerateReportResponse other = (SubmitGenerateReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.reportRequestId == null && other.getReportRequestId() == null) ||
                        (this.reportRequestId != null &&
                                this.reportRequestId.equals(other.getReportRequestId())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReportRequestId() != null) {
            _hashCode += getReportRequestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
