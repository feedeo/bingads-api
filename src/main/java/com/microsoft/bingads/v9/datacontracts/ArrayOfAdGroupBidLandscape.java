/**
 * ArrayOfAdGroupBidLandscape.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfAdGroupBidLandscape  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscape[] adGroupBidLandscape;

    public ArrayOfAdGroupBidLandscape() {
    }

    public ArrayOfAdGroupBidLandscape(
           com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscape[] adGroupBidLandscape) {
           this.adGroupBidLandscape = adGroupBidLandscape;
    }


    /**
     * Gets the adGroupBidLandscape value for this ArrayOfAdGroupBidLandscape.
     * 
     * @return adGroupBidLandscape
     */
    public com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscape[] getAdGroupBidLandscape() {
        return adGroupBidLandscape;
    }


    /**
     * Sets the adGroupBidLandscape value for this ArrayOfAdGroupBidLandscape.
     * 
     * @param adGroupBidLandscape
     */
    public void setAdGroupBidLandscape(com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscape[] adGroupBidLandscape) {
        this.adGroupBidLandscape = adGroupBidLandscape;
    }

    public com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscape getAdGroupBidLandscape(int i) {
        return this.adGroupBidLandscape[i];
    }

    public void setAdGroupBidLandscape(int i, com.microsoft.bingads.v9.datacontracts.AdGroupBidLandscape _value) {
        this.adGroupBidLandscape[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdGroupBidLandscape)) return false;
        ArrayOfAdGroupBidLandscape other = (ArrayOfAdGroupBidLandscape) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupBidLandscape==null && other.getAdGroupBidLandscape()==null) || 
             (this.adGroupBidLandscape!=null &&
              java.util.Arrays.equals(this.adGroupBidLandscape, other.getAdGroupBidLandscape())));
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
        if (getAdGroupBidLandscape() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdGroupBidLandscape());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupBidLandscape(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdGroupBidLandscape.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfAdGroupBidLandscape"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupBidLandscape");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdGroupBidLandscape"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdGroupBidLandscape"));
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
