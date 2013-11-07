/**
 * KeywordPerformanceReportSort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class KeywordPerformanceReportSort  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn sortColumn;

    private com.microsoft.bingads.v9.reporting.SortOrder sortOrder;

    public KeywordPerformanceReportSort() {
    }

    public KeywordPerformanceReportSort(
           com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn sortColumn,
           com.microsoft.bingads.v9.reporting.SortOrder sortOrder) {
           this.sortColumn = sortColumn;
           this.sortOrder = sortOrder;
    }


    /**
     * Gets the sortColumn value for this KeywordPerformanceReportSort.
     * 
     * @return sortColumn
     */
    public com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn getSortColumn() {
        return sortColumn;
    }


    /**
     * Sets the sortColumn value for this KeywordPerformanceReportSort.
     * 
     * @param sortColumn
     */
    public void setSortColumn(com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn sortColumn) {
        this.sortColumn = sortColumn;
    }


    /**
     * Gets the sortOrder value for this KeywordPerformanceReportSort.
     * 
     * @return sortOrder
     */
    public com.microsoft.bingads.v9.reporting.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this KeywordPerformanceReportSort.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.microsoft.bingads.v9.reporting.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeywordPerformanceReportSort)) return false;
        KeywordPerformanceReportSort other = (KeywordPerformanceReportSort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sortColumn==null && other.getSortColumn()==null) || 
             (this.sortColumn!=null &&
              this.sortColumn.equals(other.getSortColumn()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder())));
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
        if (getSortColumn() != null) {
            _hashCode += getSortColumn().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeywordPerformanceReportSort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportSort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SortColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportColumn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SortOrder"));
        elemField.setNillable(false);
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
