/**
 * HourTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class HourTarget  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfHourTargetBid bids;

    private java.lang.Boolean targetAllHours;

    public HourTarget() {
    }

    public HourTarget(
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfHourTargetBid bids,
           java.lang.Boolean targetAllHours) {
           this.bids = bids;
           this.targetAllHours = targetAllHours;
    }


    /**
     * Gets the bids value for this HourTarget.
     * 
     * @return bids
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfHourTargetBid getBids() {
        return bids;
    }


    /**
     * Sets the bids value for this HourTarget.
     * 
     * @param bids
     */
    public void setBids(com.microsoft.bingads.v9.campaignmanagement.ArrayOfHourTargetBid bids) {
        this.bids = bids;
    }


    /**
     * Gets the targetAllHours value for this HourTarget.
     * 
     * @return targetAllHours
     */
    public java.lang.Boolean getTargetAllHours() {
        return targetAllHours;
    }


    /**
     * Sets the targetAllHours value for this HourTarget.
     * 
     * @param targetAllHours
     */
    public void setTargetAllHours(java.lang.Boolean targetAllHours) {
        this.targetAllHours = targetAllHours;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HourTarget)) return false;
        HourTarget other = (HourTarget) obj;
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
            ((this.targetAllHours==null && other.getTargetAllHours()==null) || 
             (this.targetAllHours!=null &&
              this.targetAllHours.equals(other.getTargetAllHours())));
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
        if (getTargetAllHours() != null) {
            _hashCode += getTargetAllHours().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HourTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "HourTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bids");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Bids"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfHourTargetBid"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAllHours");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "TargetAllHours"));
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
