/**
 * ArrayOfDeviceOSTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfDeviceOSTargetBid  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.DeviceOSTargetBid[] deviceOSTargetBid;

    public ArrayOfDeviceOSTargetBid() {
    }

    public ArrayOfDeviceOSTargetBid(
           com.microsoft.bingads.v9.campaignmanagement.DeviceOSTargetBid[] deviceOSTargetBid) {
           this.deviceOSTargetBid = deviceOSTargetBid;
    }


    /**
     * Gets the deviceOSTargetBid value for this ArrayOfDeviceOSTargetBid.
     * 
     * @return deviceOSTargetBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.DeviceOSTargetBid[] getDeviceOSTargetBid() {
        return deviceOSTargetBid;
    }


    /**
     * Sets the deviceOSTargetBid value for this ArrayOfDeviceOSTargetBid.
     * 
     * @param deviceOSTargetBid
     */
    public void setDeviceOSTargetBid(com.microsoft.bingads.v9.campaignmanagement.DeviceOSTargetBid[] deviceOSTargetBid) {
        this.deviceOSTargetBid = deviceOSTargetBid;
    }

    public com.microsoft.bingads.v9.campaignmanagement.DeviceOSTargetBid getDeviceOSTargetBid(int i) {
        return this.deviceOSTargetBid[i];
    }

    public void setDeviceOSTargetBid(int i, com.microsoft.bingads.v9.campaignmanagement.DeviceOSTargetBid _value) {
        this.deviceOSTargetBid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDeviceOSTargetBid)) return false;
        ArrayOfDeviceOSTargetBid other = (ArrayOfDeviceOSTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceOSTargetBid==null && other.getDeviceOSTargetBid()==null) || 
             (this.deviceOSTargetBid!=null &&
              java.util.Arrays.equals(this.deviceOSTargetBid, other.getDeviceOSTargetBid())));
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
        if (getDeviceOSTargetBid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceOSTargetBid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceOSTargetBid(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDeviceOSTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfDeviceOSTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceOSTargetBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeviceOSTargetBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeviceOSTargetBid"));
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
