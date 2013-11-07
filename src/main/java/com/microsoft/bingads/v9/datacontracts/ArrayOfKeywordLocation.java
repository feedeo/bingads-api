/**
 * ArrayOfKeywordLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordLocation  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordLocation[] keywordLocation;

    public ArrayOfKeywordLocation() {
    }

    public ArrayOfKeywordLocation(
           com.microsoft.bingads.v9.datacontracts.KeywordLocation[] keywordLocation) {
           this.keywordLocation = keywordLocation;
    }


    /**
     * Gets the keywordLocation value for this ArrayOfKeywordLocation.
     * 
     * @return keywordLocation
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordLocation[] getKeywordLocation() {
        return keywordLocation;
    }


    /**
     * Sets the keywordLocation value for this ArrayOfKeywordLocation.
     * 
     * @param keywordLocation
     */
    public void setKeywordLocation(com.microsoft.bingads.v9.datacontracts.KeywordLocation[] keywordLocation) {
        this.keywordLocation = keywordLocation;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordLocation getKeywordLocation(int i) {
        return this.keywordLocation[i];
    }

    public void setKeywordLocation(int i, com.microsoft.bingads.v9.datacontracts.KeywordLocation _value) {
        this.keywordLocation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordLocation)) return false;
        ArrayOfKeywordLocation other = (ArrayOfKeywordLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordLocation==null && other.getKeywordLocation()==null) || 
             (this.keywordLocation!=null &&
              java.util.Arrays.equals(this.keywordLocation, other.getKeywordLocation())));
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
        if (getKeywordLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordLocation(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordLocation"));
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
