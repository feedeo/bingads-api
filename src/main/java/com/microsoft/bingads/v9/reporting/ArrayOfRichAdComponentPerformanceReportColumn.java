/**
 * ArrayOfRichAdComponentPerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfRichAdComponentPerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.RichAdComponentPerformanceReportColumn[] richAdComponentPerformanceReportColumn;

    public ArrayOfRichAdComponentPerformanceReportColumn() {
    }

    public ArrayOfRichAdComponentPerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.RichAdComponentPerformanceReportColumn[] richAdComponentPerformanceReportColumn) {
           this.richAdComponentPerformanceReportColumn = richAdComponentPerformanceReportColumn;
    }


    /**
     * Gets the richAdComponentPerformanceReportColumn value for this ArrayOfRichAdComponentPerformanceReportColumn.
     * 
     * @return richAdComponentPerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.RichAdComponentPerformanceReportColumn[] getRichAdComponentPerformanceReportColumn() {
        return richAdComponentPerformanceReportColumn;
    }


    /**
     * Sets the richAdComponentPerformanceReportColumn value for this ArrayOfRichAdComponentPerformanceReportColumn.
     * 
     * @param richAdComponentPerformanceReportColumn
     */
    public void setRichAdComponentPerformanceReportColumn(com.microsoft.bingads.v9.reporting.RichAdComponentPerformanceReportColumn[] richAdComponentPerformanceReportColumn) {
        this.richAdComponentPerformanceReportColumn = richAdComponentPerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.RichAdComponentPerformanceReportColumn getRichAdComponentPerformanceReportColumn(int i) {
        return this.richAdComponentPerformanceReportColumn[i];
    }

    public void setRichAdComponentPerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.RichAdComponentPerformanceReportColumn _value) {
        this.richAdComponentPerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfRichAdComponentPerformanceReportColumn)) return false;
        ArrayOfRichAdComponentPerformanceReportColumn other = (ArrayOfRichAdComponentPerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.richAdComponentPerformanceReportColumn==null && other.getRichAdComponentPerformanceReportColumn()==null) || 
             (this.richAdComponentPerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.richAdComponentPerformanceReportColumn, other.getRichAdComponentPerformanceReportColumn())));
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
        if (getRichAdComponentPerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRichAdComponentPerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRichAdComponentPerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfRichAdComponentPerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfRichAdComponentPerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richAdComponentPerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportColumn"));
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
