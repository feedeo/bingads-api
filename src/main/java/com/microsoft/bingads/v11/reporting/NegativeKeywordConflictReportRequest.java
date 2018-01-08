/**
 * NegativeKeywordConflictReportRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class NegativeKeywordConflictReportRequest extends com.microsoft.bingads.v11.reporting.ReportRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(NegativeKeywordConflictReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "NegativeKeywordConflictReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "NegativeKeywordConflictReportColumn"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "NegativeKeywordConflictReportColumn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "NegativeKeywordConflictReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountThroughAdGroupReportScope"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportColumn[] columns;
    private com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportFilter filter;
    private com.microsoft.bingads.v11.reporting.AccountThroughAdGroupReportScope scope;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public NegativeKeywordConflictReportRequest() {
    }


    public NegativeKeywordConflictReportRequest(
            java.lang.Boolean excludeColumnHeaders,
            java.lang.Boolean excludeReportFooter,
            java.lang.Boolean excludeReportHeader,
            com.microsoft.bingads.v11.reporting.ReportFormat format,
            com.microsoft.bingads.v11.reporting.ReportLanguage language,
            java.lang.String reportName,
            java.lang.Boolean returnOnlyCompleteData,
            com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportColumn[] columns,
            com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportFilter filter,
            com.microsoft.bingads.v11.reporting.AccountThroughAdGroupReportScope scope) {
        super(
                excludeColumnHeaders,
                excludeReportFooter,
                excludeReportHeader,
                format,
                language,
                reportName,
                returnOnlyCompleteData);
        this.columns = columns;
        this.filter = filter;
        this.scope = scope;
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
     * Gets the columns value for this NegativeKeywordConflictReportRequest.
     *
     * @return columns
     */
    public com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportColumn[] getColumns() {
        return columns;
    }

    /**
     * Sets the columns value for this NegativeKeywordConflictReportRequest.
     *
     * @param columns
     */
    public void setColumns(com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportColumn[] columns) {
        this.columns = columns;
    }

    /**
     * Gets the filter value for this NegativeKeywordConflictReportRequest.
     *
     * @return filter
     */
    public com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportFilter getFilter() {
        return filter;
    }

    /**
     * Sets the filter value for this NegativeKeywordConflictReportRequest.
     *
     * @param filter
     */
    public void setFilter(com.microsoft.bingads.v11.reporting.NegativeKeywordConflictReportFilter filter) {
        this.filter = filter;
    }

    /**
     * Gets the scope value for this NegativeKeywordConflictReportRequest.
     *
     * @return scope
     */
    public com.microsoft.bingads.v11.reporting.AccountThroughAdGroupReportScope getScope() {
        return scope;
    }

    /**
     * Sets the scope value for this NegativeKeywordConflictReportRequest.
     *
     * @param scope
     */
    public void setScope(com.microsoft.bingads.v11.reporting.AccountThroughAdGroupReportScope scope) {
        this.scope = scope;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NegativeKeywordConflictReportRequest)) return false;
        NegativeKeywordConflictReportRequest other = (NegativeKeywordConflictReportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.columns == null && other.getColumns() == null) ||
                        (this.columns != null &&
                                java.util.Arrays.equals(this.columns, other.getColumns()))) &&
                ((this.filter == null && other.getFilter() == null) ||
                        (this.filter != null &&
                                this.filter.equals(other.getFilter()))) &&
                ((this.scope == null && other.getScope() == null) ||
                        (this.scope != null &&
                                this.scope.equals(other.getScope())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getColumns() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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

}
