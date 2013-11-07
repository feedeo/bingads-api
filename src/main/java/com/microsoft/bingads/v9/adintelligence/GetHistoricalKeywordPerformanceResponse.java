/**
 * GetHistoricalKeywordPerformanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetHistoricalKeywordPerformanceResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordHistoricalPerformance keywordHistoricalPerformances;

    public GetHistoricalKeywordPerformanceResponse() {
    }

    public GetHistoricalKeywordPerformanceResponse(
           com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordHistoricalPerformance keywordHistoricalPerformances) {
           this.keywordHistoricalPerformances = keywordHistoricalPerformances;
    }


    /**
     * Gets the keywordHistoricalPerformances value for this GetHistoricalKeywordPerformanceResponse.
     * 
     * @return keywordHistoricalPerformances
     */
    public com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordHistoricalPerformance getKeywordHistoricalPerformances() {
        return keywordHistoricalPerformances;
    }


    /**
     * Sets the keywordHistoricalPerformances value for this GetHistoricalKeywordPerformanceResponse.
     * 
     * @param keywordHistoricalPerformances
     */
    public void setKeywordHistoricalPerformances(com.microsoft.bingads.v9.datacontracts.ArrayOfKeywordHistoricalPerformance keywordHistoricalPerformances) {
        this.keywordHistoricalPerformances = keywordHistoricalPerformances;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHistoricalKeywordPerformanceResponse)) return false;
        GetHistoricalKeywordPerformanceResponse other = (GetHistoricalKeywordPerformanceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordHistoricalPerformances==null && other.getKeywordHistoricalPerformances()==null) || 
             (this.keywordHistoricalPerformances!=null &&
              this.keywordHistoricalPerformances.equals(other.getKeywordHistoricalPerformances())));
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
        if (getKeywordHistoricalPerformances() != null) {
            _hashCode += getKeywordHistoricalPerformances().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHistoricalKeywordPerformanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetHistoricalKeywordPerformanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordHistoricalPerformances");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "KeywordHistoricalPerformances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordHistoricalPerformance"));
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
