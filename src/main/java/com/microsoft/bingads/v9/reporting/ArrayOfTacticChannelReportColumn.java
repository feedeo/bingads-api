/**
 * ArrayOfTacticChannelReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfTacticChannelReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.TacticChannelReportColumn[] tacticChannelReportColumn;

    public ArrayOfTacticChannelReportColumn() {
    }

    public ArrayOfTacticChannelReportColumn(
           com.microsoft.bingads.v9.reporting.TacticChannelReportColumn[] tacticChannelReportColumn) {
           this.tacticChannelReportColumn = tacticChannelReportColumn;
    }


    /**
     * Gets the tacticChannelReportColumn value for this ArrayOfTacticChannelReportColumn.
     * 
     * @return tacticChannelReportColumn
     */
    public com.microsoft.bingads.v9.reporting.TacticChannelReportColumn[] getTacticChannelReportColumn() {
        return tacticChannelReportColumn;
    }


    /**
     * Sets the tacticChannelReportColumn value for this ArrayOfTacticChannelReportColumn.
     * 
     * @param tacticChannelReportColumn
     */
    public void setTacticChannelReportColumn(com.microsoft.bingads.v9.reporting.TacticChannelReportColumn[] tacticChannelReportColumn) {
        this.tacticChannelReportColumn = tacticChannelReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.TacticChannelReportColumn getTacticChannelReportColumn(int i) {
        return this.tacticChannelReportColumn[i];
    }

    public void setTacticChannelReportColumn(int i, com.microsoft.bingads.v9.reporting.TacticChannelReportColumn _value) {
        this.tacticChannelReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfTacticChannelReportColumn)) return false;
        ArrayOfTacticChannelReportColumn other = (ArrayOfTacticChannelReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tacticChannelReportColumn==null && other.getTacticChannelReportColumn()==null) || 
             (this.tacticChannelReportColumn!=null &&
              java.util.Arrays.equals(this.tacticChannelReportColumn, other.getTacticChannelReportColumn())));
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
        if (getTacticChannelReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacticChannelReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacticChannelReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfTacticChannelReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfTacticChannelReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacticChannelReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportColumn"));
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
