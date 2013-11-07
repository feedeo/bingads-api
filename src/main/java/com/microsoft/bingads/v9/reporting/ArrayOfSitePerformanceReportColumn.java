/**
 * ArrayOfSitePerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfSitePerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.SitePerformanceReportColumn[] sitePerformanceReportColumn;

    public ArrayOfSitePerformanceReportColumn() {
    }

    public ArrayOfSitePerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.SitePerformanceReportColumn[] sitePerformanceReportColumn) {
           this.sitePerformanceReportColumn = sitePerformanceReportColumn;
    }


    /**
     * Gets the sitePerformanceReportColumn value for this ArrayOfSitePerformanceReportColumn.
     * 
     * @return sitePerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.SitePerformanceReportColumn[] getSitePerformanceReportColumn() {
        return sitePerformanceReportColumn;
    }


    /**
     * Sets the sitePerformanceReportColumn value for this ArrayOfSitePerformanceReportColumn.
     * 
     * @param sitePerformanceReportColumn
     */
    public void setSitePerformanceReportColumn(com.microsoft.bingads.v9.reporting.SitePerformanceReportColumn[] sitePerformanceReportColumn) {
        this.sitePerformanceReportColumn = sitePerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.SitePerformanceReportColumn getSitePerformanceReportColumn(int i) {
        return this.sitePerformanceReportColumn[i];
    }

    public void setSitePerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.SitePerformanceReportColumn _value) {
        this.sitePerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfSitePerformanceReportColumn)) return false;
        ArrayOfSitePerformanceReportColumn other = (ArrayOfSitePerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sitePerformanceReportColumn==null && other.getSitePerformanceReportColumn()==null) || 
             (this.sitePerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.sitePerformanceReportColumn, other.getSitePerformanceReportColumn())));
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
        if (getSitePerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSitePerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSitePerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfSitePerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfSitePerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitePerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SitePerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SitePerformanceReportColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
