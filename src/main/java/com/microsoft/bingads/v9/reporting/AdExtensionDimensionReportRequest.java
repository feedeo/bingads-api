/**
 * AdExtensionDimensionReportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class AdExtensionDimensionReportRequest  extends com.microsoft.bingads.v9.reporting.ReportRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.ArrayOfAdExtensionDimensionReportColumn columns;

    private com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportFilter filter;

    private com.microsoft.bingads.v9.reporting.AccountReportScope scope;

    public AdExtensionDimensionReportRequest() {
    }

    public AdExtensionDimensionReportRequest(
           com.microsoft.bingads.v9.reporting.ReportFormat format,
           com.microsoft.bingads.v9.reporting.ReportLanguage language,
           java.lang.String reportName,
           java.lang.Boolean returnOnlyCompleteData,
           com.microsoft.bingads.v9.reporting.ArrayOfAdExtensionDimensionReportColumn columns,
           com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportFilter filter,
           com.microsoft.bingads.v9.reporting.AccountReportScope scope) {
        super(
            format,
            language,
            reportName,
            returnOnlyCompleteData);
        this.columns = columns;
        this.filter = filter;
        this.scope = scope;
    }


    /**
     * Gets the columns value for this AdExtensionDimensionReportRequest.
     * 
     * @return columns
     */
    public com.microsoft.bingads.v9.reporting.ArrayOfAdExtensionDimensionReportColumn getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this AdExtensionDimensionReportRequest.
     * 
     * @param columns
     */
    public void setColumns(com.microsoft.bingads.v9.reporting.ArrayOfAdExtensionDimensionReportColumn columns) {
        this.columns = columns;
    }


    /**
     * Gets the filter value for this AdExtensionDimensionReportRequest.
     * 
     * @return filter
     */
    public com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportFilter getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this AdExtensionDimensionReportRequest.
     * 
     * @param filter
     */
    public void setFilter(com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportFilter filter) {
        this.filter = filter;
    }


    /**
     * Gets the scope value for this AdExtensionDimensionReportRequest.
     * 
     * @return scope
     */
    public com.microsoft.bingads.v9.reporting.AccountReportScope getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this AdExtensionDimensionReportRequest.
     * 
     * @param scope
     */
    public void setScope(com.microsoft.bingads.v9.reporting.AccountReportScope scope) {
        this.scope = scope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtensionDimensionReportRequest)) return false;
        AdExtensionDimensionReportRequest other = (AdExtensionDimensionReportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              this.columns.equals(other.getColumns()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getColumns() != null) {
            _hashCode += getColumns().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdExtensionDimensionReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdExtensionDimensionReportColumn"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountReportScope"));
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
