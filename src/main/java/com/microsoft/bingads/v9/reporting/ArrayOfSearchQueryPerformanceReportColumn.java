/**
 * ArrayOfSearchQueryPerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfSearchQueryPerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.SearchQueryPerformanceReportColumn[] searchQueryPerformanceReportColumn;

    public ArrayOfSearchQueryPerformanceReportColumn() {
    }

    public ArrayOfSearchQueryPerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.SearchQueryPerformanceReportColumn[] searchQueryPerformanceReportColumn) {
           this.searchQueryPerformanceReportColumn = searchQueryPerformanceReportColumn;
    }


    /**
     * Gets the searchQueryPerformanceReportColumn value for this ArrayOfSearchQueryPerformanceReportColumn.
     * 
     * @return searchQueryPerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.SearchQueryPerformanceReportColumn[] getSearchQueryPerformanceReportColumn() {
        return searchQueryPerformanceReportColumn;
    }


    /**
     * Sets the searchQueryPerformanceReportColumn value for this ArrayOfSearchQueryPerformanceReportColumn.
     * 
     * @param searchQueryPerformanceReportColumn
     */
    public void setSearchQueryPerformanceReportColumn(com.microsoft.bingads.v9.reporting.SearchQueryPerformanceReportColumn[] searchQueryPerformanceReportColumn) {
        this.searchQueryPerformanceReportColumn = searchQueryPerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.SearchQueryPerformanceReportColumn getSearchQueryPerformanceReportColumn(int i) {
        return this.searchQueryPerformanceReportColumn[i];
    }

    public void setSearchQueryPerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.SearchQueryPerformanceReportColumn _value) {
        this.searchQueryPerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfSearchQueryPerformanceReportColumn)) return false;
        ArrayOfSearchQueryPerformanceReportColumn other = (ArrayOfSearchQueryPerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchQueryPerformanceReportColumn==null && other.getSearchQueryPerformanceReportColumn()==null) || 
             (this.searchQueryPerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.searchQueryPerformanceReportColumn, other.getSearchQueryPerformanceReportColumn())));
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
        if (getSearchQueryPerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchQueryPerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchQueryPerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfSearchQueryPerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfSearchQueryPerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchQueryPerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryPerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryPerformanceReportColumn"));
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
