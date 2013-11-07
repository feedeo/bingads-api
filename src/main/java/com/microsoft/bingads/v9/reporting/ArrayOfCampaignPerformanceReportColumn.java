/**
 * ArrayOfCampaignPerformanceReportColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class ArrayOfCampaignPerformanceReportColumn  implements java.io.Serializable {
    private com.microsoft.bingads.v9.reporting.CampaignPerformanceReportColumn[] campaignPerformanceReportColumn;

    public ArrayOfCampaignPerformanceReportColumn() {
    }

    public ArrayOfCampaignPerformanceReportColumn(
           com.microsoft.bingads.v9.reporting.CampaignPerformanceReportColumn[] campaignPerformanceReportColumn) {
           this.campaignPerformanceReportColumn = campaignPerformanceReportColumn;
    }


    /**
     * Gets the campaignPerformanceReportColumn value for this ArrayOfCampaignPerformanceReportColumn.
     * 
     * @return campaignPerformanceReportColumn
     */
    public com.microsoft.bingads.v9.reporting.CampaignPerformanceReportColumn[] getCampaignPerformanceReportColumn() {
        return campaignPerformanceReportColumn;
    }


    /**
     * Sets the campaignPerformanceReportColumn value for this ArrayOfCampaignPerformanceReportColumn.
     * 
     * @param campaignPerformanceReportColumn
     */
    public void setCampaignPerformanceReportColumn(com.microsoft.bingads.v9.reporting.CampaignPerformanceReportColumn[] campaignPerformanceReportColumn) {
        this.campaignPerformanceReportColumn = campaignPerformanceReportColumn;
    }

    public com.microsoft.bingads.v9.reporting.CampaignPerformanceReportColumn getCampaignPerformanceReportColumn(int i) {
        return this.campaignPerformanceReportColumn[i];
    }

    public void setCampaignPerformanceReportColumn(int i, com.microsoft.bingads.v9.reporting.CampaignPerformanceReportColumn _value) {
        this.campaignPerformanceReportColumn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCampaignPerformanceReportColumn)) return false;
        ArrayOfCampaignPerformanceReportColumn other = (ArrayOfCampaignPerformanceReportColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignPerformanceReportColumn==null && other.getCampaignPerformanceReportColumn()==null) || 
             (this.campaignPerformanceReportColumn!=null &&
              java.util.Arrays.equals(this.campaignPerformanceReportColumn, other.getCampaignPerformanceReportColumn())));
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
        if (getCampaignPerformanceReportColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignPerformanceReportColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignPerformanceReportColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCampaignPerformanceReportColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfCampaignPerformanceReportColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignPerformanceReportColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignPerformanceReportColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignPerformanceReportColumn"));
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
