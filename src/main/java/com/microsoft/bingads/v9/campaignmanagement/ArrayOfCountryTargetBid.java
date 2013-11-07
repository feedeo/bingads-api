/**
 * ArrayOfCountryTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfCountryTargetBid  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.CountryTargetBid[] countryTargetBid;

    public ArrayOfCountryTargetBid() {
    }

    public ArrayOfCountryTargetBid(
           com.microsoft.bingads.v9.campaignmanagement.CountryTargetBid[] countryTargetBid) {
           this.countryTargetBid = countryTargetBid;
    }


    /**
     * Gets the countryTargetBid value for this ArrayOfCountryTargetBid.
     * 
     * @return countryTargetBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.CountryTargetBid[] getCountryTargetBid() {
        return countryTargetBid;
    }


    /**
     * Sets the countryTargetBid value for this ArrayOfCountryTargetBid.
     * 
     * @param countryTargetBid
     */
    public void setCountryTargetBid(com.microsoft.bingads.v9.campaignmanagement.CountryTargetBid[] countryTargetBid) {
        this.countryTargetBid = countryTargetBid;
    }

    public com.microsoft.bingads.v9.campaignmanagement.CountryTargetBid getCountryTargetBid(int i) {
        return this.countryTargetBid[i];
    }

    public void setCountryTargetBid(int i, com.microsoft.bingads.v9.campaignmanagement.CountryTargetBid _value) {
        this.countryTargetBid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCountryTargetBid)) return false;
        ArrayOfCountryTargetBid other = (ArrayOfCountryTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryTargetBid==null && other.getCountryTargetBid()==null) || 
             (this.countryTargetBid!=null &&
              java.util.Arrays.equals(this.countryTargetBid, other.getCountryTargetBid())));
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
        if (getCountryTargetBid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryTargetBid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryTargetBid(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCountryTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCountryTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryTargetBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CountryTargetBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CountryTargetBid"));
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
