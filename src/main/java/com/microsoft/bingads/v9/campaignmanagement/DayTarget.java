/**
 * DayTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class DayTarget  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfDayTargetBid bids;

    private java.lang.Boolean targetAllDays;

    public DayTarget() {
    }

    public DayTarget(
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfDayTargetBid bids,
           java.lang.Boolean targetAllDays) {
           this.bids = bids;
           this.targetAllDays = targetAllDays;
    }


    /**
     * Gets the bids value for this DayTarget.
     * 
     * @return bids
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfDayTargetBid getBids() {
        return bids;
    }


    /**
     * Sets the bids value for this DayTarget.
     * 
     * @param bids
     */
    public void setBids(com.microsoft.bingads.v9.campaignmanagement.ArrayOfDayTargetBid bids) {
        this.bids = bids;
    }


    /**
     * Gets the targetAllDays value for this DayTarget.
     * 
     * @return targetAllDays
     */
    public java.lang.Boolean getTargetAllDays() {
        return targetAllDays;
    }


    /**
     * Sets the targetAllDays value for this DayTarget.
     * 
     * @param targetAllDays
     */
    public void setTargetAllDays(java.lang.Boolean targetAllDays) {
        this.targetAllDays = targetAllDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DayTarget)) return false;
        DayTarget other = (DayTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bids==null && other.getBids()==null) || 
             (this.bids!=null &&
              this.bids.equals(other.getBids()))) &&
            ((this.targetAllDays==null && other.getTargetAllDays()==null) || 
             (this.targetAllDays!=null &&
              this.targetAllDays.equals(other.getTargetAllDays())));
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
        if (getBids() != null) {
            _hashCode += getBids().hashCode();
        }
        if (getTargetAllDays() != null) {
            _hashCode += getTargetAllDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DayTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DayTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bids");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Bids"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfDayTargetBid"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAllDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "TargetAllDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
