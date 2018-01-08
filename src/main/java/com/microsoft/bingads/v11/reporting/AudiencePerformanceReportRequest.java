/**
 * AudiencePerformanceReportRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class AudiencePerformanceReportRequest extends com.microsoft.bingads.v11.reporting.ReportRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AudiencePerformanceReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AudiencePerformanceReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Aggregation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportAggregation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AudiencePerformanceReportColumn"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AudiencePerformanceReportColumn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AudiencePerformanceReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountThroughAdGroupReportScope"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "ReportTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.reporting.ReportAggregation aggregation;
    private com.microsoft.bingads.v11.reporting.AudiencePerformanceReportColumn[] columns;
    private com.microsoft.bingads.v11.reporting.AudiencePerformanceReportFilter filter;
    private com.microsoft.bingads.v11.reporting.AccountThroughAdGroupReportScope scope;
    private com.microsoft.bingads.v11.reporting.ReportTime time;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AudiencePerformanceReportRequest() {
    }


    public AudiencePerformanceReportRequest(
            java.lang.Boolean excludeColumnHeaders,
            java.lang.Boolean excludeReportFooter,
            java.lang.Boolean excludeReportHeader,
            com.microsoft.bingads.v11.reporting.ReportFormat format,
            com.microsoft.bingads.v11.reporting.ReportLanguage language,
            java.lang.String reportName,
            java.lang.Boolean returnOnlyCompleteData,
            com.microsoft.bingads.v11.reporting.ReportAggregation aggregation,
            com.microsoft.bingads.v11.reporting.AudiencePerformanceReportColumn[] columns,
            com.microsoft.bingads.v11.reporting.AudiencePerformanceReportFilter filter,
            com.microsoft.bingads.v11.reporting.AccountThroughAdGroupReportScope scope,
            com.microsoft.bingads.v11.reporting.ReportTime time) {
        super(
                excludeColumnHeaders,
                excludeReportFooter,
                excludeReportHeader,
                format,
                language,
                reportName,
                returnOnlyCompleteData);
        this.aggregation = aggregation;
        this.columns = columns;
        this.filter = filter;
        this.scope = scope;
        this.time = time;
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
     * Gets the aggregation value for this AudiencePerformanceReportRequest.
     *
     * @return aggregation
     */
    public com.microsoft.bingads.v11.reporting.ReportAggregation getAggregation() {
        return aggregation;
    }

    /**
     * Sets the aggregation value for this AudiencePerformanceReportRequest.
     *
     * @param aggregation
     */
    public void setAggregation(com.microsoft.bingads.v11.reporting.ReportAggregation aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * Gets the columns value for this AudiencePerformanceReportRequest.
     *
     * @return columns
     */
    public com.microsoft.bingads.v11.reporting.AudiencePerformanceReportColumn[] getColumns() {
        return columns;
    }

    /**
     * Sets the columns value for this AudiencePerformanceReportRequest.
     *
     * @param columns
     */
    public void setColumns(com.microsoft.bingads.v11.reporting.AudiencePerformanceReportColumn[] columns) {
        this.columns = columns;
    }

    /**
     * Gets the filter value for this AudiencePerformanceReportRequest.
     *
     * @return filter
     */
    public com.microsoft.bingads.v11.reporting.AudiencePerformanceReportFilter getFilter() {
        return filter;
    }

    /**
     * Sets the filter value for this AudiencePerformanceReportRequest.
     *
     * @param filter
     */
    public void setFilter(com.microsoft.bingads.v11.reporting.AudiencePerformanceReportFilter filter) {
        this.filter = filter;
    }

    /**
     * Gets the scope value for this AudiencePerformanceReportRequest.
     *
     * @return scope
     */
    public com.microsoft.bingads.v11.reporting.AccountThroughAdGroupReportScope getScope() {
        return scope;
    }

    /**
     * Sets the scope value for this AudiencePerformanceReportRequest.
     *
     * @param scope
     */
    public void setScope(com.microsoft.bingads.v11.reporting.AccountThroughAdGroupReportScope scope) {
        this.scope = scope;
    }

    /**
     * Gets the time value for this AudiencePerformanceReportRequest.
     *
     * @return time
     */
    public com.microsoft.bingads.v11.reporting.ReportTime getTime() {
        return time;
    }

    /**
     * Sets the time value for this AudiencePerformanceReportRequest.
     *
     * @param time
     */
    public void setTime(com.microsoft.bingads.v11.reporting.ReportTime time) {
        this.time = time;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudiencePerformanceReportRequest)) return false;
        AudiencePerformanceReportRequest other = (AudiencePerformanceReportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.aggregation == null && other.getAggregation() == null) ||
                        (this.aggregation != null &&
                                this.aggregation.equals(other.getAggregation()))) &&
                ((this.columns == null && other.getColumns() == null) ||
                        (this.columns != null &&
                                java.util.Arrays.equals(this.columns, other.getColumns()))) &&
                ((this.filter == null && other.getFilter() == null) ||
                        (this.filter != null &&
                                this.filter.equals(other.getFilter()))) &&
                ((this.scope == null && other.getScope() == null) ||
                        (this.scope != null &&
                                this.scope.equals(other.getScope()))) &&
                ((this.time == null && other.getTime() == null) ||
                        (this.time != null &&
                                this.time.equals(other.getTime())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAggregation() != null) {
            _hashCode += getAggregation().hashCode();
        }
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
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
