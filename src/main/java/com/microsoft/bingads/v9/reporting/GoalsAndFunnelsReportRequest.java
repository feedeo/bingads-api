/**
 * GoalsAndFunnelsReportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class GoalsAndFunnelsReportRequest  extends com.microsoft.bingads.v9.reporting.ReportRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.NonHourlyReportAggregation aggregation;

    private com.microsoft.bingads.v9.reporting.ArrayOfGoalsAndFunnelsReportColumn columns;

    private com.microsoft.bingads.v9.reporting.GoalsAndFunnelsReportFilter filter;

    private com.microsoft.bingads.v9.reporting.AccountThroughAdGroupReportScope scope;

    private com.microsoft.bingads.v9.reporting.ReportTime time;

    public GoalsAndFunnelsReportRequest() {
    }

    public GoalsAndFunnelsReportRequest(
           com.microsoft.bingads.v9.reporting.ReportFormat format,
           com.microsoft.bingads.v9.reporting.ReportLanguage language,
           java.lang.String reportName,
           java.lang.Boolean returnOnlyCompleteData,
           com.microsoft.bingads.v9.reporting.NonHourlyReportAggregation aggregation,
           com.microsoft.bingads.v9.reporting.ArrayOfGoalsAndFunnelsReportColumn columns,
           com.microsoft.bingads.v9.reporting.GoalsAndFunnelsReportFilter filter,
           com.microsoft.bingads.v9.reporting.AccountThroughAdGroupReportScope scope,
           com.microsoft.bingads.v9.reporting.ReportTime time) {
        super(
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
     * Gets the aggregation value for this GoalsAndFunnelsReportRequest.
     * 
     * @return aggregation
     */
    public com.microsoft.bingads.v9.reporting.NonHourlyReportAggregation getAggregation() {
        return aggregation;
    }


    /**
     * Sets the aggregation value for this GoalsAndFunnelsReportRequest.
     * 
     * @param aggregation
     */
    public void setAggregation(com.microsoft.bingads.v9.reporting.NonHourlyReportAggregation aggregation) {
        this.aggregation = aggregation;
    }


    /**
     * Gets the columns value for this GoalsAndFunnelsReportRequest.
     * 
     * @return columns
     */
    public com.microsoft.bingads.v9.reporting.ArrayOfGoalsAndFunnelsReportColumn getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this GoalsAndFunnelsReportRequest.
     * 
     * @param columns
     */
    public void setColumns(com.microsoft.bingads.v9.reporting.ArrayOfGoalsAndFunnelsReportColumn columns) {
        this.columns = columns;
    }


    /**
     * Gets the filter value for this GoalsAndFunnelsReportRequest.
     * 
     * @return filter
     */
    public com.microsoft.bingads.v9.reporting.GoalsAndFunnelsReportFilter getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this GoalsAndFunnelsReportRequest.
     * 
     * @param filter
     */
    public void setFilter(com.microsoft.bingads.v9.reporting.GoalsAndFunnelsReportFilter filter) {
        this.filter = filter;
    }


    /**
     * Gets the scope value for this GoalsAndFunnelsReportRequest.
     * 
     * @return scope
     */
    public com.microsoft.bingads.v9.reporting.AccountThroughAdGroupReportScope getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this GoalsAndFunnelsReportRequest.
     * 
     * @param scope
     */
    public void setScope(com.microsoft.bingads.v9.reporting.AccountThroughAdGroupReportScope scope) {
        this.scope = scope;
    }


    /**
     * Gets the time value for this GoalsAndFunnelsReportRequest.
     * 
     * @return time
     */
    public com.microsoft.bingads.v9.reporting.ReportTime getTime() {
        return time;
    }


    /**
     * Sets the time value for this GoalsAndFunnelsReportRequest.
     * 
     * @param time
     */
    public void setTime(com.microsoft.bingads.v9.reporting.ReportTime time) {
        this.time = time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GoalsAndFunnelsReportRequest)) return false;
        GoalsAndFunnelsReportRequest other = (GoalsAndFunnelsReportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aggregation==null && other.getAggregation()==null) || 
             (this.aggregation!=null &&
              this.aggregation.equals(other.getAggregation()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              this.columns.equals(other.getColumns()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime())));
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
        if (getAggregation() != null) {
            _hashCode += getAggregation().hashCode();
        }
        if (getColumns() != null) {
            _hashCode += getColumns().hashCode();
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

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GoalsAndFunnelsReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Aggregation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "NonHourlyReportAggregation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfGoalsAndFunnelsReportColumn"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountThroughAdGroupReportScope"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ReportTime"));
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
