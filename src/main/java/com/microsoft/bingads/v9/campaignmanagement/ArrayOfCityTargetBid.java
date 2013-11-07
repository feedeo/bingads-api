/**
 * ArrayOfCityTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfCityTargetBid  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.CityTargetBid[] cityTargetBid;

    public ArrayOfCityTargetBid() {
    }

    public ArrayOfCityTargetBid(
           com.microsoft.bingads.v9.campaignmanagement.CityTargetBid[] cityTargetBid) {
           this.cityTargetBid = cityTargetBid;
    }


    /**
     * Gets the cityTargetBid value for this ArrayOfCityTargetBid.
     * 
     * @return cityTargetBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.CityTargetBid[] getCityTargetBid() {
        return cityTargetBid;
    }


    /**
     * Sets the cityTargetBid value for this ArrayOfCityTargetBid.
     * 
     * @param cityTargetBid
     */
    public void setCityTargetBid(com.microsoft.bingads.v9.campaignmanagement.CityTargetBid[] cityTargetBid) {
        this.cityTargetBid = cityTargetBid;
    }

    public com.microsoft.bingads.v9.campaignmanagement.CityTargetBid getCityTargetBid(int i) {
        return this.cityTargetBid[i];
    }

    public void setCityTargetBid(int i, com.microsoft.bingads.v9.campaignmanagement.CityTargetBid _value) {
        this.cityTargetBid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCityTargetBid)) return false;
        ArrayOfCityTargetBid other = (ArrayOfCityTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cityTargetBid==null && other.getCityTargetBid()==null) || 
             (this.cityTargetBid!=null &&
              java.util.Arrays.equals(this.cityTargetBid, other.getCityTargetBid())));
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
        if (getCityTargetBid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCityTargetBid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCityTargetBid(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCityTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCityTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityTargetBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CityTargetBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CityTargetBid"));
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
