/**
 * BudgetSummaryReportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class BudgetSummaryReportRequest  extends com.microsoft.bingads.v9.reporting.ReportRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.ArrayOfBudgetSummaryReportColumn columns;

    private com.microsoft.bingads.v9.reporting.AccountThroughCampaignReportScope scope;

    private com.microsoft.bingads.v9.reporting.BudgetSummaryReportTime time;

    public BudgetSummaryReportRequest() {
    }

    public BudgetSummaryReportRequest(
           com.microsoft.bingads.v9.reporting.ReportFormat format,
           com.microsoft.bingads.v9.reporting.ReportLanguage language,
           java.lang.String reportName,
           java.lang.Boolean returnOnlyCompleteData,
           com.microsoft.bingads.v9.reporting.ArrayOfBudgetSummaryReportColumn columns,
           com.microsoft.bingads.v9.reporting.AccountThroughCampaignReportScope scope,
           com.microsoft.bingads.v9.reporting.BudgetSummaryReportTime time) {
        super(
            format,
            language,
            reportName,
            returnOnlyCompleteData);
        this.columns = columns;
        this.scope = scope;
        this.time = time;
    }


    /**
     * Gets the columns value for this BudgetSummaryReportRequest.
     * 
     * @return columns
     */
    public com.microsoft.bingads.v9.reporting.ArrayOfBudgetSummaryReportColumn getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this BudgetSummaryReportRequest.
     * 
     * @param columns
     */
    public void setColumns(com.microsoft.bingads.v9.reporting.ArrayOfBudgetSummaryReportColumn columns) {
        this.columns = columns;
    }


    /**
     * Gets the scope value for this BudgetSummaryReportRequest.
     * 
     * @return scope
     */
    public com.microsoft.bingads.v9.reporting.AccountThroughCampaignReportScope getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this BudgetSummaryReportRequest.
     * 
     * @param scope
     */
    public void setScope(com.microsoft.bingads.v9.reporting.AccountThroughCampaignReportScope scope) {
        this.scope = scope;
    }


    /**
     * Gets the time value for this BudgetSummaryReportRequest.
     * 
     * @return time
     */
    public com.microsoft.bingads.v9.reporting.BudgetSummaryReportTime getTime() {
        return time;
    }


    /**
     * Sets the time value for this BudgetSummaryReportRequest.
     * 
     * @param time
     */
    public void setTime(com.microsoft.bingads.v9.reporting.BudgetSummaryReportTime time) {
        this.time = time;
    }

    private java.lang.Object __equalsCalc = null;
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
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              this.columns.equals(other.getColumns()))) &&
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
        if (getColumns() != null) {
            _hashCode += getColumns().hashCode();
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
        new org.apache.axis.description.TypeDesc(BudgetSummaryReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfBudgetSummaryReportColumn"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountThroughCampaignReportScope"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportTime"));
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
