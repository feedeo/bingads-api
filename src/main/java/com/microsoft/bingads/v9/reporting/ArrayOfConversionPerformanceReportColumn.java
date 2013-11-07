/**
 * ArrayOfConversionPerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfConversionPerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.ConversionPerformanceReportColumn[] conversionPerformanceReportColumn;

    public ArrayOfConversionPerformanceReportColumn() {
    }

    public ArrayOfConversionPerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.ConversionPerformanceReportColumn[] conversionPerformanceReportColumn) {
           this.conversionPerformanceReportColumn = conversionPerformanceReportColumn;
    }


    /**
     * Gets the conversionPerformanceReportColumn value for this ArrayOfConversionPerformanceReportColumn.
     * 
     * @return conversionPerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.ConversionPerformanceReportColumn[] getConversionPerformanceReportColumn() {
        return conversionPerformanceReportColumn;
    }


    /**
     * Sets the conversionPerformanceReportColumn value for this ArrayOfConversionPerformanceReportColumn.
     * 
     * @param conversionPerformanceReportColumn
     */
    public void setConversionPerformanceReportColumn(com.microsoft.bingads.v9.reporting.ConversionPerformanceReportColumn[] conversionPerformanceReportColumn) {
        this.conversionPerformanceReportColumn = conversionPerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.ConversionPerformanceReportColumn getConversionPerformanceReportColumn(int i) {
        return this.conversionPerformanceReportColumn[i];
    }

    public void setConversionPerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.ConversionPerformanceReportColumn _value) {
        this.conversionPerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConversionPerformanceReportColumn)) return false;
        ArrayOfConversionPerformanceReportColumn other = (ArrayOfConversionPerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conversionPerformanceReportColumn==null && other.getConversionPerformanceReportColumn()==null) || 
             (this.conversionPerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.conversionPerformanceReportColumn, other.getConversionPerformanceReportColumn())));
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
        if (getConversionPerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConversionPerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionPerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConversionPerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfConversionPerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionPerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ConversionPerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ConversionPerformanceReportColumn"));
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
