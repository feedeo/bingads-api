/**
 * ArrayOfAdExtensionDimensionReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfAdExtensionDimensionReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportColumn[] adExtensionDimensionReportColumn;

    public ArrayOfAdExtensionDimensionReportColumn() {
    }

    public ArrayOfAdExtensionDimensionReportColumn(
           com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportColumn[] adExtensionDimensionReportColumn) {
           this.adExtensionDimensionReportColumn = adExtensionDimensionReportColumn;
    }


    /**
     * Gets the adExtensionDimensionReportColumn value for this ArrayOfAdExtensionDimensionReportColumn.
     * 
     * @return adExtensionDimensionReportColumn
     */
    public com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportColumn[] getAdExtensionDimensionReportColumn() {
        return adExtensionDimensionReportColumn;
    }


    /**
     * Sets the adExtensionDimensionReportColumn value for this ArrayOfAdExtensionDimensionReportColumn.
     * 
     * @param adExtensionDimensionReportColumn
     */
    public void setAdExtensionDimensionReportColumn(com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportColumn[] adExtensionDimensionReportColumn) {
        this.adExtensionDimensionReportColumn = adExtensionDimensionReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportColumn getAdExtensionDimensionReportColumn(int i) {
        return this.adExtensionDimensionReportColumn[i];
    }

    public void setAdExtensionDimensionReportColumn(int i, com.microsoft.bingads.v9.reporting.AdExtensionDimensionReportColumn _value) {
        this.adExtensionDimensionReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdExtensionDimensionReportColumn)) return false;
        ArrayOfAdExtensionDimensionReportColumn other = (ArrayOfAdExtensionDimensionReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExtensionDimensionReportColumn==null && other.getAdExtensionDimensionReportColumn()==null) || 
             (this.adExtensionDimensionReportColumn!=null &&
              java.util.Arrays.equals(this.adExtensionDimensionReportColumn, other.getAdExtensionDimensionReportColumn())));
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
        if (getAdExtensionDimensionReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdExtensionDimensionReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensionDimensionReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdExtensionDimensionReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdExtensionDimensionReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionDimensionReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportColumn"));
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
