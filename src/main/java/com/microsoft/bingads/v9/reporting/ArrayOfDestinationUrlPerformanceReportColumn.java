/**
 * ArrayOfDestinationUrlPerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfDestinationUrlPerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.DestinationUrlPerformanceReportColumn[] destinationUrlPerformanceReportColumn;

    public ArrayOfDestinationUrlPerformanceReportColumn() {
    }

    public ArrayOfDestinationUrlPerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.DestinationUrlPerformanceReportColumn[] destinationUrlPerformanceReportColumn) {
           this.destinationUrlPerformanceReportColumn = destinationUrlPerformanceReportColumn;
    }


    /**
     * Gets the destinationUrlPerformanceReportColumn value for this ArrayOfDestinationUrlPerformanceReportColumn.
     * 
     * @return destinationUrlPerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.DestinationUrlPerformanceReportColumn[] getDestinationUrlPerformanceReportColumn() {
        return destinationUrlPerformanceReportColumn;
    }


    /**
     * Sets the destinationUrlPerformanceReportColumn value for this ArrayOfDestinationUrlPerformanceReportColumn.
     * 
     * @param destinationUrlPerformanceReportColumn
     */
    public void setDestinationUrlPerformanceReportColumn(com.microsoft.bingads.v9.reporting.DestinationUrlPerformanceReportColumn[] destinationUrlPerformanceReportColumn) {
        this.destinationUrlPerformanceReportColumn = destinationUrlPerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.DestinationUrlPerformanceReportColumn getDestinationUrlPerformanceReportColumn(int i) {
        return this.destinationUrlPerformanceReportColumn[i];
    }

    public void setDestinationUrlPerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.DestinationUrlPerformanceReportColumn _value) {
        this.destinationUrlPerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDestinationUrlPerformanceReportColumn)) return false;
        ArrayOfDestinationUrlPerformanceReportColumn other = (ArrayOfDestinationUrlPerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destinationUrlPerformanceReportColumn==null && other.getDestinationUrlPerformanceReportColumn()==null) || 
             (this.destinationUrlPerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.destinationUrlPerformanceReportColumn, other.getDestinationUrlPerformanceReportColumn())));
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
        if (getDestinationUrlPerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinationUrlPerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinationUrlPerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDestinationUrlPerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfDestinationUrlPerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrlPerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DestinationUrlPerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "DestinationUrlPerformanceReportColumn"));
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
