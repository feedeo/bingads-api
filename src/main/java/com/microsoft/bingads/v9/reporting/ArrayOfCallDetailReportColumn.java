/**
 * ArrayOfCallDetailReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfCallDetailReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.CallDetailReportColumn[] callDetailReportColumn;

    public ArrayOfCallDetailReportColumn() {
    }

    public ArrayOfCallDetailReportColumn(
           com.microsoft.bingads.v9.reporting.CallDetailReportColumn[] callDetailReportColumn) {
           this.callDetailReportColumn = callDetailReportColumn;
    }


    /**
     * Gets the callDetailReportColumn value for this ArrayOfCallDetailReportColumn.
     * 
     * @return callDetailReportColumn
     */
    public com.microsoft.bingads.v9.reporting.CallDetailReportColumn[] getCallDetailReportColumn() {
        return callDetailReportColumn;
    }


    /**
     * Sets the callDetailReportColumn value for this ArrayOfCallDetailReportColumn.
     * 
     * @param callDetailReportColumn
     */
    public void setCallDetailReportColumn(com.microsoft.bingads.v9.reporting.CallDetailReportColumn[] callDetailReportColumn) {
        this.callDetailReportColumn = callDetailReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.CallDetailReportColumn getCallDetailReportColumn(int i) {
        return this.callDetailReportColumn[i];
    }

    public void setCallDetailReportColumn(int i, com.microsoft.bingads.v9.reporting.CallDetailReportColumn _value) {
        this.callDetailReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCallDetailReportColumn)) return false;
        ArrayOfCallDetailReportColumn other = (ArrayOfCallDetailReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callDetailReportColumn==null && other.getCallDetailReportColumn()==null) || 
             (this.callDetailReportColumn!=null &&
              java.util.Arrays.equals(this.callDetailReportColumn, other.getCallDetailReportColumn())));
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
        if (getCallDetailReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallDetailReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallDetailReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCallDetailReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfCallDetailReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDetailReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CallDetailReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CallDetailReportColumn"));
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
