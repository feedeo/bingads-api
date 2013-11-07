/**
 * ArrayOfHourTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfHourTargetBid  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.HourTargetBid[] hourTargetBid;

    public ArrayOfHourTargetBid() {
    }

    public ArrayOfHourTargetBid(
           com.microsoft.bingads.v9.campaignmanagement.HourTargetBid[] hourTargetBid) {
           this.hourTargetBid = hourTargetBid;
    }


    /**
     * Gets the hourTargetBid value for this ArrayOfHourTargetBid.
     * 
     * @return hourTargetBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.HourTargetBid[] getHourTargetBid() {
        return hourTargetBid;
    }


    /**
     * Sets the hourTargetBid value for this ArrayOfHourTargetBid.
     * 
     * @param hourTargetBid
     */
    public void setHourTargetBid(com.microsoft.bingads.v9.campaignmanagement.HourTargetBid[] hourTargetBid) {
        this.hourTargetBid = hourTargetBid;
    }

    public com.microsoft.bingads.v9.campaignmanagement.HourTargetBid getHourTargetBid(int i) {
        return this.hourTargetBid[i];
    }

    public void setHourTargetBid(int i, com.microsoft.bingads.v9.campaignmanagement.HourTargetBid _value) {
        this.hourTargetBid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHourTargetBid)) return false;
        ArrayOfHourTargetBid other = (ArrayOfHourTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hourTargetBid==null && other.getHourTargetBid()==null) || 
             (this.hourTargetBid!=null &&
              java.util.Arrays.equals(this.hourTargetBid, other.getHourTargetBid())));
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
        if (getHourTargetBid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHourTargetBid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHourTargetBid(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHourTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfHourTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourTargetBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "HourTargetBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "HourTargetBid"));
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
