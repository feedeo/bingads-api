/**
 * ArrayOfProductTargetPerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfProductTargetPerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.ProductTargetPerformanceReportColumn[] productTargetPerformanceReportColumn;

    public ArrayOfProductTargetPerformanceReportColumn() {
    }

    public ArrayOfProductTargetPerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.ProductTargetPerformanceReportColumn[] productTargetPerformanceReportColumn) {
           this.productTargetPerformanceReportColumn = productTargetPerformanceReportColumn;
    }


    /**
     * Gets the productTargetPerformanceReportColumn value for this ArrayOfProductTargetPerformanceReportColumn.
     * 
     * @return productTargetPerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.ProductTargetPerformanceReportColumn[] getProductTargetPerformanceReportColumn() {
        return productTargetPerformanceReportColumn;
    }


    /**
     * Sets the productTargetPerformanceReportColumn value for this ArrayOfProductTargetPerformanceReportColumn.
     * 
     * @param productTargetPerformanceReportColumn
     */
    public void setProductTargetPerformanceReportColumn(com.microsoft.bingads.v9.reporting.ProductTargetPerformanceReportColumn[] productTargetPerformanceReportColumn) {
        this.productTargetPerformanceReportColumn = productTargetPerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.ProductTargetPerformanceReportColumn getProductTargetPerformanceReportColumn(int i) {
        return this.productTargetPerformanceReportColumn[i];
    }

    public void setProductTargetPerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.ProductTargetPerformanceReportColumn _value) {
        this.productTargetPerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfProductTargetPerformanceReportColumn)) return false;
        ArrayOfProductTargetPerformanceReportColumn other = (ArrayOfProductTargetPerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productTargetPerformanceReportColumn==null && other.getProductTargetPerformanceReportColumn()==null) || 
             (this.productTargetPerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.productTargetPerformanceReportColumn, other.getProductTargetPerformanceReportColumn())));
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
        if (getProductTargetPerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTargetPerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductTargetPerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfProductTargetPerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfProductTargetPerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTargetPerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ProductTargetPerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ProductTargetPerformanceReportColumn"));
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
