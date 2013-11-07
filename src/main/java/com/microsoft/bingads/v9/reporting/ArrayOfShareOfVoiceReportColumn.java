/**
 * ArrayOfShareOfVoiceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfShareOfVoiceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.ShareOfVoiceReportColumn[] shareOfVoiceReportColumn;

    public ArrayOfShareOfVoiceReportColumn() {
    }

    public ArrayOfShareOfVoiceReportColumn(
           com.microsoft.bingads.v9.reporting.ShareOfVoiceReportColumn[] shareOfVoiceReportColumn) {
           this.shareOfVoiceReportColumn = shareOfVoiceReportColumn;
    }


    /**
     * Gets the shareOfVoiceReportColumn value for this ArrayOfShareOfVoiceReportColumn.
     * 
     * @return shareOfVoiceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.ShareOfVoiceReportColumn[] getShareOfVoiceReportColumn() {
        return shareOfVoiceReportColumn;
    }


    /**
     * Sets the shareOfVoiceReportColumn value for this ArrayOfShareOfVoiceReportColumn.
     * 
     * @param shareOfVoiceReportColumn
     */
    public void setShareOfVoiceReportColumn(com.microsoft.bingads.v9.reporting.ShareOfVoiceReportColumn[] shareOfVoiceReportColumn) {
        this.shareOfVoiceReportColumn = shareOfVoiceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.ShareOfVoiceReportColumn getShareOfVoiceReportColumn(int i) {
        return this.shareOfVoiceReportColumn[i];
    }

    public void setShareOfVoiceReportColumn(int i, com.microsoft.bingads.v9.reporting.ShareOfVoiceReportColumn _value) {
        this.shareOfVoiceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfShareOfVoiceReportColumn)) return false;
        ArrayOfShareOfVoiceReportColumn other = (ArrayOfShareOfVoiceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shareOfVoiceReportColumn==null && other.getShareOfVoiceReportColumn()==null) || 
             (this.shareOfVoiceReportColumn!=null &&
              java.util.Arrays.equals(this.shareOfVoiceReportColumn, other.getShareOfVoiceReportColumn())));
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
        if (getShareOfVoiceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShareOfVoiceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShareOfVoiceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfShareOfVoiceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfShareOfVoiceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareOfVoiceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ShareOfVoiceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ShareOfVoiceReportColumn"));
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
