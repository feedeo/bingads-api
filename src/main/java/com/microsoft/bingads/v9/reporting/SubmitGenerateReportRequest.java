/**
 * SubmitGenerateReportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class SubmitGenerateReportRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.ReportRequest reportRequest;

    public SubmitGenerateReportRequest() {
    }

    public SubmitGenerateReportRequest(
           com.microsoft.bingads.v9.reporting.ReportRequest reportRequest) {
           this.reportRequest = reportRequest;
    }


    /**
     * Gets the reportRequest value for this SubmitGenerateReportRequest.
     * 
     * @return reportRequest
     */
    public com.microsoft.bingads.v9.reporting.ReportRequest getReportRequest() {
        return reportRequest;
    }


    /**
     * Sets the reportRequest value for this SubmitGenerateReportRequest.
     * 
     * @param reportRequest
     */
    public void setReportRequest(com.microsoft.bingads.v9.reporting.ReportRequest reportRequest) {
        this.reportRequest = reportRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitGenerateReportRequest)) return false;
        SubmitGenerateReportRequest other = (SubmitGenerateReportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reportRequest==null && other.getReportRequest()==null) || 
             (this.reportRequest!=null &&
              this.reportRequest.equals(other.getReportRequest())));
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
        if (getReportRequest() != null) {
            _hashCode += getReportRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitGenerateReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", ">SubmitGenerateReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportRequest"));
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
