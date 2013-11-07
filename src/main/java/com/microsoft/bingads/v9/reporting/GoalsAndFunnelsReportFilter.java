/**
 * GoalsAndFunnelsReportFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class GoalsAndFunnelsReportFilter  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong goalIds;

    public GoalsAndFunnelsReportFilter() {
    }

    public GoalsAndFunnelsReportFilter(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong goalIds) {
           this.goalIds = goalIds;
    }


    /**
     * Gets the goalIds value for this GoalsAndFunnelsReportFilter.
     * 
     * @return goalIds
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getGoalIds() {
        return goalIds;
    }


    /**
     * Sets the goalIds value for this GoalsAndFunnelsReportFilter.
     * 
     * @param goalIds
     */
    public void setGoalIds(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong goalIds) {
        this.goalIds = goalIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GoalsAndFunnelsReportFilter)) return false;
        GoalsAndFunnelsReportFilter other = (GoalsAndFunnelsReportFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.goalIds==null && other.getGoalIds()==null) || 
             (this.goalIds!=null &&
              this.goalIds.equals(other.getGoalIds())));
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
        if (getGoalIds() != null) {
            _hashCode += getGoalIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GoalsAndFunnelsReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goalIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "GoalIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
