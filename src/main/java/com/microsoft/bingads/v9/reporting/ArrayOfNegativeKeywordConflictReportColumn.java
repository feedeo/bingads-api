/**
 * ArrayOfNegativeKeywordConflictReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfNegativeKeywordConflictReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.NegativeKeywordConflictReportColumn[] negativeKeywordConflictReportColumn;

    public ArrayOfNegativeKeywordConflictReportColumn() {
    }

    public ArrayOfNegativeKeywordConflictReportColumn(
           com.microsoft.bingads.v9.reporting.NegativeKeywordConflictReportColumn[] negativeKeywordConflictReportColumn) {
           this.negativeKeywordConflictReportColumn = negativeKeywordConflictReportColumn;
    }


    /**
     * Gets the negativeKeywordConflictReportColumn value for this ArrayOfNegativeKeywordConflictReportColumn.
     * 
     * @return negativeKeywordConflictReportColumn
     */
    public com.microsoft.bingads.v9.reporting.NegativeKeywordConflictReportColumn[] getNegativeKeywordConflictReportColumn() {
        return negativeKeywordConflictReportColumn;
    }


    /**
     * Sets the negativeKeywordConflictReportColumn value for this ArrayOfNegativeKeywordConflictReportColumn.
     * 
     * @param negativeKeywordConflictReportColumn
     */
    public void setNegativeKeywordConflictReportColumn(com.microsoft.bingads.v9.reporting.NegativeKeywordConflictReportColumn[] negativeKeywordConflictReportColumn) {
        this.negativeKeywordConflictReportColumn = negativeKeywordConflictReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.NegativeKeywordConflictReportColumn getNegativeKeywordConflictReportColumn(int i) {
        return this.negativeKeywordConflictReportColumn[i];
    }

    public void setNegativeKeywordConflictReportColumn(int i, com.microsoft.bingads.v9.reporting.NegativeKeywordConflictReportColumn _value) {
        this.negativeKeywordConflictReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfNegativeKeywordConflictReportColumn)) return false;
        ArrayOfNegativeKeywordConflictReportColumn other = (ArrayOfNegativeKeywordConflictReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.negativeKeywordConflictReportColumn==null && other.getNegativeKeywordConflictReportColumn()==null) || 
             (this.negativeKeywordConflictReportColumn!=null &&
              java.util.Arrays.equals(this.negativeKeywordConflictReportColumn, other.getNegativeKeywordConflictReportColumn())));
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
        if (getNegativeKeywordConflictReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNegativeKeywordConflictReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegativeKeywordConflictReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfNegativeKeywordConflictReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfNegativeKeywordConflictReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeKeywordConflictReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "NegativeKeywordConflictReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "NegativeKeywordConflictReportColumn"));
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
