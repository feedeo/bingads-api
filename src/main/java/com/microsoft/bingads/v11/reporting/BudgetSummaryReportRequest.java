/**
 * BudgetSummaryReportRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class BudgetSummaryReportRequest extends com.microsoft.bingads.v11.reporting.ReportRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BudgetSummaryReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BudgetSummaryReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BudgetSummaryReportColumn"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BudgetSummaryReportColumn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AccountThroughCampaignReportScope"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "BudgetSummaryReportTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.reporting.BudgetSummaryReportColumn[] columns;
    private com.microsoft.bingads.v11.reporting.AccountThroughCampaignReportScope scope;
    private com.microsoft.bingads.v11.reporting.BudgetSummaryReportTime time;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public BudgetSummaryReportRequest() {
    }


    public BudgetSummaryReportRequest(
            java.lang.Boolean excludeColumnHeaders,
            java.lang.Boolean excludeReportFooter,
            java.lang.Boolean excludeReportHeader,
            com.microsoft.bingads.v11.reporting.ReportFormat format,
            com.microsoft.bingads.v11.reporting.ReportLanguage language,
            java.lang.String reportName,
            java.lang.Boolean returnOnlyCompleteData,
            com.microsoft.bingads.v11.reporting.BudgetSummaryReportColumn[] columns,
            com.microsoft.bingads.v11.reporting.AccountThroughCampaignReportScope scope,
            com.microsoft.bingads.v11.reporting.BudgetSummaryReportTime time) {
        super(
                excludeColumnHeaders,
                excludeReportFooter,
                excludeReportHeader,
                format,
                language,
                reportName,
                returnOnlyCompleteData);
        this.columns = columns;
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
     * Gets the columns value for this BudgetSummaryReportRequest.
     *
     * @return columns
     */
    public com.microsoft.bingads.v11.reporting.BudgetSummaryReportColumn[] getColumns() {
        return columns;
    }

    /**
     * Sets the columns value for this BudgetSummaryReportRequest.
     *
     * @param columns
     */
    public void setColumns(com.microsoft.bingads.v11.reporting.BudgetSummaryReportColumn[] columns) {
        this.columns = columns;
    }

    /**
     * Gets the scope value for this BudgetSummaryReportRequest.
     *
     * @return scope
     */
    public com.microsoft.bingads.v11.reporting.AccountThroughCampaignReportScope getScope() {
        return scope;
    }

    /**
     * Sets the scope value for this BudgetSummaryReportRequest.
     *
     * @param scope
     */
    public void setScope(com.microsoft.bingads.v11.reporting.AccountThroughCampaignReportScope scope) {
        this.scope = scope;
    }

    /**
     * Gets the time value for this BudgetSummaryReportRequest.
     *
     * @return time
     */
    public com.microsoft.bingads.v11.reporting.BudgetSummaryReportTime getTime() {
        return time;
    }

    /**
     * Sets the time value for this BudgetSummaryReportRequest.
     *
     * @param time
     */
    public void setTime(com.microsoft.bingads.v11.reporting.BudgetSummaryReportTime time) {
        this.time = time;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetSummaryReportRequest)) return false;
        BudgetSummaryReportRequest other = (BudgetSummaryReportRequest) obj;
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
