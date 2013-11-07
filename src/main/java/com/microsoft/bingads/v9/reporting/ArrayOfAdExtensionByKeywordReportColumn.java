/**
 * ArrayOfAdExtensionByKeywordReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfAdExtensionByKeywordReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.AdExtensionByKeywordReportColumn[] adExtensionByKeywordReportColumn;

    public ArrayOfAdExtensionByKeywordReportColumn() {
    }

    public ArrayOfAdExtensionByKeywordReportColumn(
           com.microsoft.bingads.v9.reporting.AdExtensionByKeywordReportColumn[] adExtensionByKeywordReportColumn) {
           this.adExtensionByKeywordReportColumn = adExtensionByKeywordReportColumn;
    }


    /**
     * Gets the adExtensionByKeywordReportColumn value for this ArrayOfAdExtensionByKeywordReportColumn.
     * 
     * @return adExtensionByKeywordReportColumn
     */
    public com.microsoft.bingads.v9.reporting.AdExtensionByKeywordReportColumn[] getAdExtensionByKeywordReportColumn() {
        return adExtensionByKeywordReportColumn;
    }


    /**
     * Sets the adExtensionByKeywordReportColumn value for this ArrayOfAdExtensionByKeywordReportColumn.
     * 
     * @param adExtensionByKeywordReportColumn
     */
    public void setAdExtensionByKeywordReportColumn(com.microsoft.bingads.v9.reporting.AdExtensionByKeywordReportColumn[] adExtensionByKeywordReportColumn) {
        this.adExtensionByKeywordReportColumn = adExtensionByKeywordReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.AdExtensionByKeywordReportColumn getAdExtensionByKeywordReportColumn(int i) {
        return this.adExtensionByKeywordReportColumn[i];
    }

    public void setAdExtensionByKeywordReportColumn(int i, com.microsoft.bingads.v9.reporting.AdExtensionByKeywordReportColumn _value) {
        this.adExtensionByKeywordReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdExtensionByKeywordReportColumn)) return false;
        ArrayOfAdExtensionByKeywordReportColumn other = (ArrayOfAdExtensionByKeywordReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExtensionByKeywordReportColumn==null && other.getAdExtensionByKeywordReportColumn()==null) || 
             (this.adExtensionByKeywordReportColumn!=null &&
              java.util.Arrays.equals(this.adExtensionByKeywordReportColumn, other.getAdExtensionByKeywordReportColumn())));
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
        if (getAdExtensionByKeywordReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdExtensionByKeywordReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensionByKeywordReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdExtensionByKeywordReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdExtensionByKeywordReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionByKeywordReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByKeywordReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByKeywordReportColumn"));
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
