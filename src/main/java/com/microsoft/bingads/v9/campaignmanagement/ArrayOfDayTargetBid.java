/**
 * ArrayOfDayTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfDayTargetBid  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.DayTargetBid[] dayTargetBid;

    public ArrayOfDayTargetBid() {
    }

    public ArrayOfDayTargetBid(
           com.microsoft.bingads.v9.campaignmanagement.DayTargetBid[] dayTargetBid) {
           this.dayTargetBid = dayTargetBid;
    }


    /**
     * Gets the dayTargetBid value for this ArrayOfDayTargetBid.
     * 
     * @return dayTargetBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.DayTargetBid[] getDayTargetBid() {
        return dayTargetBid;
    }


    /**
     * Sets the dayTargetBid value for this ArrayOfDayTargetBid.
     * 
     * @param dayTargetBid
     */
    public void setDayTargetBid(com.microsoft.bingads.v9.campaignmanagement.DayTargetBid[] dayTargetBid) {
        this.dayTargetBid = dayTargetBid;
    }

    public com.microsoft.bingads.v9.campaignmanagement.DayTargetBid getDayTargetBid(int i) {
        return this.dayTargetBid[i];
    }

    public void setDayTargetBid(int i, com.microsoft.bingads.v9.campaignmanagement.DayTargetBid _value) {
        this.dayTargetBid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDayTargetBid)) return false;
        ArrayOfDayTargetBid other = (ArrayOfDayTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dayTargetBid==null && other.getDayTargetBid()==null) || 
             (this.dayTargetBid!=null &&
              java.util.Arrays.equals(this.dayTargetBid, other.getDayTargetBid())));
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
        if (getDayTargetBid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDayTargetBid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDayTargetBid(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDayTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfDayTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayTargetBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DayTargetBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DayTargetBid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
