/**
 * ArrayOfKeywordPerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfKeywordPerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn[] keywordPerformanceReportColumn;

    public ArrayOfKeywordPerformanceReportColumn() {
    }

    public ArrayOfKeywordPerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn[] keywordPerformanceReportColumn) {
           this.keywordPerformanceReportColumn = keywordPerformanceReportColumn;
    }


    /**
     * Gets the keywordPerformanceReportColumn value for this ArrayOfKeywordPerformanceReportColumn.
     * 
     * @return keywordPerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn[] getKeywordPerformanceReportColumn() {
        return keywordPerformanceReportColumn;
    }


    /**
     * Sets the keywordPerformanceReportColumn value for this ArrayOfKeywordPerformanceReportColumn.
     * 
     * @param keywordPerformanceReportColumn
     */
    public void setKeywordPerformanceReportColumn(com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn[] keywordPerformanceReportColumn) {
        this.keywordPerformanceReportColumn = keywordPerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn getKeywordPerformanceReportColumn(int i) {
        return this.keywordPerformanceReportColumn[i];
    }

    public void setKeywordPerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.KeywordPerformanceReportColumn _value) {
        this.keywordPerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordPerformanceReportColumn)) return false;
        ArrayOfKeywordPerformanceReportColumn other = (ArrayOfKeywordPerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordPerformanceReportColumn==null && other.getKeywordPerformanceReportColumn()==null) || 
             (this.keywordPerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.keywordPerformanceReportColumn, other.getKeywordPerformanceReportColumn())));
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
        if (getKeywordPerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordPerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordPerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordPerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfKeywordPerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordPerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportColumn"));
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
