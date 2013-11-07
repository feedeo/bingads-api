/**
 * HourTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class HourTargetBid  implements java.io.Serializable {
    private int bidAdjustment;

    private com.microsoft.bingads.v9.campaignmanagement.HourRange hour;

    public HourTargetBid() {
    }

    public HourTargetBid(
           int bidAdjustment,
           com.microsoft.bingads.v9.campaignmanagement.HourRange hour) {
           this.bidAdjustment = bidAdjustment;
           this.hour = hour;
    }


    /**
     * Gets the bidAdjustment value for this HourTargetBid.
     * 
     * @return bidAdjustment
     */
    public int getBidAdjustment() {
        return bidAdjustment;
    }


    /**
     * Sets the bidAdjustment value for this HourTargetBid.
     * 
     * @param bidAdjustment
     */
    public void setBidAdjustment(int bidAdjustment) {
        this.bidAdjustment = bidAdjustment;
    }


    /**
     * Gets the hour value for this HourTargetBid.
     * 
     * @return hour
     */
    public com.microsoft.bingads.v9.campaignmanagement.HourRange getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this HourTargetBid.
     * 
     * @param hour
     */
    public void setHour(com.microsoft.bingads.v9.campaignmanagement.HourRange hour) {
        this.hour = hour;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HourTargetBid)) return false;
        HourTargetBid other = (HourTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bidAdjustment == other.getBidAdjustment() &&
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour())));
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
        _hashCode += getBidAdjustment();
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HourTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "HourTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BidAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "HourRange"));
        elemField.setNillable(false);
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
