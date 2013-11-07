/**
 * AgeTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class AgeTargetBid  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AgeRange age;

    private int bidAdjustment;

    public AgeTargetBid() {
    }

    public AgeTargetBid(
           com.microsoft.bingads.v9.campaignmanagement.AgeRange age,
           int bidAdjustment) {
           this.age = age;
           this.bidAdjustment = bidAdjustment;
    }


    /**
     * Gets the age value for this AgeTargetBid.
     * 
     * @return age
     */
    public com.microsoft.bingads.v9.campaignmanagement.AgeRange getAge() {
        return age;
    }


    /**
     * Sets the age value for this AgeTargetBid.
     * 
     * @param age
     */
    public void setAge(com.microsoft.bingads.v9.campaignmanagement.AgeRange age) {
        this.age = age;
    }


    /**
     * Gets the bidAdjustment value for this AgeTargetBid.
     * 
     * @return bidAdjustment
     */
    public int getBidAdjustment() {
        return bidAdjustment;
    }


    /**
     * Sets the bidAdjustment value for this AgeTargetBid.
     * 
     * @param bidAdjustment
     */
    public void setBidAdjustment(int bidAdjustment) {
        this.bidAdjustment = bidAdjustment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgeTargetBid)) return false;
        AgeTargetBid other = (AgeTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.age==null && other.getAge()==null) || 
             (this.age!=null &&
              this.age.equals(other.getAge()))) &&
            this.bidAdjustment == other.getBidAdjustment();
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
        if (getAge() != null) {
            _hashCode += getAge().hashCode();
        }
        _hashCode += getBidAdjustment();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgeTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AgeTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Age"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AgeRange"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BidAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
