/**
 * ArrayOfAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfAd  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.Ad[] ad;

    public ArrayOfAd() {
    }

    public ArrayOfAd(
           com.microsoft.bingads.v9.campaignmanagement.Ad[] ad) {
           this.ad = ad;
    }


    /**
     * Gets the ad value for this ArrayOfAd.
     * 
     * @return ad
     */
    public com.microsoft.bingads.v9.campaignmanagement.Ad[] getAd() {
        return ad;
    }


    /**
     * Sets the ad value for this ArrayOfAd.
     * 
     * @param ad
     */
    public void setAd(com.microsoft.bingads.v9.campaignmanagement.Ad[] ad) {
        this.ad = ad;
    }

    public com.microsoft.bingads.v9.campaignmanagement.Ad getAd(int i) {
        return this.ad[i];
    }

    public void setAd(int i, com.microsoft.bingads.v9.campaignmanagement.Ad _value) {
        this.ad[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAd)) return false;
        ArrayOfAd other = (ArrayOfAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ad==null && other.getAd()==null) || 
             (this.ad!=null &&
              java.util.Arrays.equals(this.ad, other.getAd())));
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
        if (getAd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAd(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ad");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Ad"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Ad"));
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
