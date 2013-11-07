/**
 * DeviceOSTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class DeviceOSTargetBid  implements java.io.Serializable {
    private int bidAdjustment;

    private java.lang.String deviceName;

    private java.lang.String[] OSNames;

    public DeviceOSTargetBid() {
    }

    public DeviceOSTargetBid(
           int bidAdjustment,
           java.lang.String deviceName,
           java.lang.String[] OSNames) {
           this.bidAdjustment = bidAdjustment;
           this.deviceName = deviceName;
           this.OSNames = OSNames;
    }


    /**
     * Gets the bidAdjustment value for this DeviceOSTargetBid.
     * 
     * @return bidAdjustment
     */
    public int getBidAdjustment() {
        return bidAdjustment;
    }


    /**
     * Sets the bidAdjustment value for this DeviceOSTargetBid.
     * 
     * @param bidAdjustment
     */
    public void setBidAdjustment(int bidAdjustment) {
        this.bidAdjustment = bidAdjustment;
    }


    /**
     * Gets the deviceName value for this DeviceOSTargetBid.
     * 
     * @return deviceName
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this DeviceOSTargetBid.
     * 
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the OSNames value for this DeviceOSTargetBid.
     * 
     * @return OSNames
     */
    public java.lang.String[] getOSNames() {
        return OSNames;
    }


    /**
     * Sets the OSNames value for this DeviceOSTargetBid.
     * 
     * @param OSNames
     */
    public void setOSNames(java.lang.String[] OSNames) {
        this.OSNames = OSNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceOSTargetBid)) return false;
        DeviceOSTargetBid other = (DeviceOSTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bidAdjustment == other.getBidAdjustment() &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.OSNames==null && other.getOSNames()==null) || 
             (this.OSNames!=null &&
              java.util.Arrays.equals(this.OSNames, other.getOSNames())));
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
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getOSNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOSNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOSNames(), i);
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
        new org.apache.axis.description.TypeDesc(DeviceOSTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeviceOSTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BidAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OSNames");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "OSNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
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
