/**
 * ArrayOfAccountPerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfAccountPerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.AccountPerformanceReportColumn[] accountPerformanceReportColumn;

    public ArrayOfAccountPerformanceReportColumn() {
    }

    public ArrayOfAccountPerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.AccountPerformanceReportColumn[] accountPerformanceReportColumn) {
           this.accountPerformanceReportColumn = accountPerformanceReportColumn;
    }


    /**
     * Gets the accountPerformanceReportColumn value for this ArrayOfAccountPerformanceReportColumn.
     * 
     * @return accountPerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.AccountPerformanceReportColumn[] getAccountPerformanceReportColumn() {
        return accountPerformanceReportColumn;
    }


    /**
     * Sets the accountPerformanceReportColumn value for this ArrayOfAccountPerformanceReportColumn.
     * 
     * @param accountPerformanceReportColumn
     */
    public void setAccountPerformanceReportColumn(com.microsoft.bingads.v9.reporting.AccountPerformanceReportColumn[] accountPerformanceReportColumn) {
        this.accountPerformanceReportColumn = accountPerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.AccountPerformanceReportColumn getAccountPerformanceReportColumn(int i) {
        return this.accountPerformanceReportColumn[i];
    }

    public void setAccountPerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.AccountPerformanceReportColumn _value) {
        this.accountPerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAccountPerformanceReportColumn)) return false;
        ArrayOfAccountPerformanceReportColumn other = (ArrayOfAccountPerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountPerformanceReportColumn==null && other.getAccountPerformanceReportColumn()==null) || 
             (this.accountPerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.accountPerformanceReportColumn, other.getAccountPerformanceReportColumn())));
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
        if (getAccountPerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountPerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountPerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAccountPerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAccountPerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountPerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountPerformanceReportColumn"));
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
