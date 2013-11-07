/**
 * GetKeywordLocationsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetKeywordLocationsResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordLocationResult keywordLocationResult;

    public GetKeywordLocationsResponse() {
    }

    public GetKeywordLocationsResponse(
           com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordLocationResult keywordLocationResult) {
           this.keywordLocationResult = keywordLocationResult;
    }


    /**
     * Gets the keywordLocationResult value for this GetKeywordLocationsResponse.
     * 
     * @return keywordLocationResult
     */
    public com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordLocationResult getKeywordLocationResult() {
        return keywordLocationResult;
    }


    /**
     * Sets the keywordLocationResult value for this GetKeywordLocationsResponse.
     * 
     * @param keywordLocationResult
     */
    public void setKeywordLocationResult(com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordLocationResult keywordLocationResult) {
        this.keywordLocationResult = keywordLocationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKeywordLocationsResponse)) return false;
        GetKeywordLocationsResponse other = (GetKeywordLocationsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordLocationResult==null && other.getKeywordLocationResult()==null) || 
             (this.keywordLocationResult!=null &&
              this.keywordLocationResult.equals(other.getKeywordLocationResult())));
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
        if (getKeywordLocationResult() != null) {
            _hashCode += getKeywordLocationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKeywordLocationsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetKeywordLocationsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordLocationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "KeywordLocationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordLocationResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
