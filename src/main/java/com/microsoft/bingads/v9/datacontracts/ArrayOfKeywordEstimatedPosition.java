/**
 * ArrayOfKeywordEstimatedPosition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordEstimatedPosition  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordEstimatedPosition[] keywordEstimatedPosition;

    public ArrayOfKeywordEstimatedPosition() {
    }

    public ArrayOfKeywordEstimatedPosition(
           com.microsoft.bingads.v9.datacontracts.KeywordEstimatedPosition[] keywordEstimatedPosition) {
           this.keywordEstimatedPosition = keywordEstimatedPosition;
    }


    /**
     * Gets the keywordEstimatedPosition value for this ArrayOfKeywordEstimatedPosition.
     * 
     * @return keywordEstimatedPosition
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordEstimatedPosition[] getKeywordEstimatedPosition() {
        return keywordEstimatedPosition;
    }


    /**
     * Sets the keywordEstimatedPosition value for this ArrayOfKeywordEstimatedPosition.
     * 
     * @param keywordEstimatedPosition
     */
    public void setKeywordEstimatedPosition(com.microsoft.bingads.v9.datacontracts.KeywordEstimatedPosition[] keywordEstimatedPosition) {
        this.keywordEstimatedPosition = keywordEstimatedPosition;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordEstimatedPosition getKeywordEstimatedPosition(int i) {
        return this.keywordEstimatedPosition[i];
    }

    public void setKeywordEstimatedPosition(int i, com.microsoft.bingads.v9.datacontracts.KeywordEstimatedPosition _value) {
        this.keywordEstimatedPosition[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordEstimatedPosition)) return false;
        ArrayOfKeywordEstimatedPosition other = (ArrayOfKeywordEstimatedPosition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordEstimatedPosition==null && other.getKeywordEstimatedPosition()==null) || 
             (this.keywordEstimatedPosition!=null &&
              java.util.Arrays.equals(this.keywordEstimatedPosition, other.getKeywordEstimatedPosition())));
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
        if (getKeywordEstimatedPosition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordEstimatedPosition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordEstimatedPosition(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordEstimatedPosition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordEstimatedPosition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordEstimatedPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordEstimatedPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordEstimatedPosition"));
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
