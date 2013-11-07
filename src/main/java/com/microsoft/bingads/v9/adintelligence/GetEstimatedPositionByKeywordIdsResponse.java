/**
 * GetEstimatedPositionByKeywordIdsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetEstimatedPositionByKeywordIdsResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition[] keywordEstimatedPositions;

    public GetEstimatedPositionByKeywordIdsResponse() {
    }

    public GetEstimatedPositionByKeywordIdsResponse(
           com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition[] keywordEstimatedPositions) {
           this.keywordEstimatedPositions = keywordEstimatedPositions;
    }


    /**
     * Gets the keywordEstimatedPositions value for this GetEstimatedPositionByKeywordIdsResponse.
     * 
     * @return keywordEstimatedPositions
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition[] getKeywordEstimatedPositions() {
        return keywordEstimatedPositions;
    }


    /**
     * Sets the keywordEstimatedPositions value for this GetEstimatedPositionByKeywordIdsResponse.
     * 
     * @param keywordEstimatedPositions
     */
    public void setKeywordEstimatedPositions(com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition[] keywordEstimatedPositions) {
        this.keywordEstimatedPositions = keywordEstimatedPositions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEstimatedPositionByKeywordIdsResponse)) return false;
        GetEstimatedPositionByKeywordIdsResponse other = (GetEstimatedPositionByKeywordIdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordEstimatedPositions==null && other.getKeywordEstimatedPositions()==null) || 
             (this.keywordEstimatedPositions!=null &&
              java.util.Arrays.equals(this.keywordEstimatedPositions, other.getKeywordEstimatedPositions())));
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
        if (getKeywordEstimatedPositions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordEstimatedPositions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordEstimatedPositions(), i);
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
        new org.apache.axis.description.TypeDesc(GetEstimatedPositionByKeywordIdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordIdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordEstimatedPositions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "KeywordEstimatedPositions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordIdEstimatedPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordIdEstimatedPosition"));
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
