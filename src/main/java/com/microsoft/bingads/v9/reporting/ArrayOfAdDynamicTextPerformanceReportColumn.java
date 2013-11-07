/**
 * ArrayOfAdDynamicTextPerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfAdDynamicTextPerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.AdDynamicTextPerformanceReportColumn[] adDynamicTextPerformanceReportColumn;

    public ArrayOfAdDynamicTextPerformanceReportColumn() {
    }

    public ArrayOfAdDynamicTextPerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.AdDynamicTextPerformanceReportColumn[] adDynamicTextPerformanceReportColumn) {
           this.adDynamicTextPerformanceReportColumn = adDynamicTextPerformanceReportColumn;
    }


    /**
     * Gets the adDynamicTextPerformanceReportColumn value for this ArrayOfAdDynamicTextPerformanceReportColumn.
     * 
     * @return adDynamicTextPerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.AdDynamicTextPerformanceReportColumn[] getAdDynamicTextPerformanceReportColumn() {
        return adDynamicTextPerformanceReportColumn;
    }


    /**
     * Sets the adDynamicTextPerformanceReportColumn value for this ArrayOfAdDynamicTextPerformanceReportColumn.
     * 
     * @param adDynamicTextPerformanceReportColumn
     */
    public void setAdDynamicTextPerformanceReportColumn(com.microsoft.bingads.v9.reporting.AdDynamicTextPerformanceReportColumn[] adDynamicTextPerformanceReportColumn) {
        this.adDynamicTextPerformanceReportColumn = adDynamicTextPerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.AdDynamicTextPerformanceReportColumn getAdDynamicTextPerformanceReportColumn(int i) {
        return this.adDynamicTextPerformanceReportColumn[i];
    }

    public void setAdDynamicTextPerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.AdDynamicTextPerformanceReportColumn _value) {
        this.adDynamicTextPerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdDynamicTextPerformanceReportColumn)) return false;
        ArrayOfAdDynamicTextPerformanceReportColumn other = (ArrayOfAdDynamicTextPerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adDynamicTextPerformanceReportColumn==null && other.getAdDynamicTextPerformanceReportColumn()==null) || 
             (this.adDynamicTextPerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.adDynamicTextPerformanceReportColumn, other.getAdDynamicTextPerformanceReportColumn())));
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
        if (getAdDynamicTextPerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdDynamicTextPerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdDynamicTextPerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdDynamicTextPerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdDynamicTextPerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adDynamicTextPerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDynamicTextPerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdDynamicTextPerformanceReportColumn"));
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
