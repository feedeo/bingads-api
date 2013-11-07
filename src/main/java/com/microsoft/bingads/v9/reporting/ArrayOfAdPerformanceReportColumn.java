/**
 * ArrayOfAdPerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfAdPerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.AdPerformanceReportColumn[] adPerformanceReportColumn;

    public ArrayOfAdPerformanceReportColumn() {
    }

    public ArrayOfAdPerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.AdPerformanceReportColumn[] adPerformanceReportColumn) {
           this.adPerformanceReportColumn = adPerformanceReportColumn;
    }


    /**
     * Gets the adPerformanceReportColumn value for this ArrayOfAdPerformanceReportColumn.
     * 
     * @return adPerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.AdPerformanceReportColumn[] getAdPerformanceReportColumn() {
        return adPerformanceReportColumn;
    }


    /**
     * Sets the adPerformanceReportColumn value for this ArrayOfAdPerformanceReportColumn.
     * 
     * @param adPerformanceReportColumn
     */
    public void setAdPerformanceReportColumn(com.microsoft.bingads.v9.reporting.AdPerformanceReportColumn[] adPerformanceReportColumn) {
        this.adPerformanceReportColumn = adPerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.AdPerformanceReportColumn getAdPerformanceReportColumn(int i) {
        return this.adPerformanceReportColumn[i];
    }

    public void setAdPerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.AdPerformanceReportColumn _value) {
        this.adPerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdPerformanceReportColumn)) return false;
        ArrayOfAdPerformanceReportColumn other = (ArrayOfAdPerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adPerformanceReportColumn==null && other.getAdPerformanceReportColumn()==null) || 
             (this.adPerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.adPerformanceReportColumn, other.getAdPerformanceReportColumn())));
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
        if (getAdPerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdPerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdPerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdPerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdPerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adPerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdPerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdPerformanceReportColumn"));
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
