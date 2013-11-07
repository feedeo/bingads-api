/**
 * ArrayOfKeywordIdEstimatedPosition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordIdEstimatedPosition  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition[] keywordIdEstimatedPosition;

    public ArrayOfKeywordIdEstimatedPosition() {
    }

    public ArrayOfKeywordIdEstimatedPosition(
           com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition[] keywordIdEstimatedPosition) {
           this.keywordIdEstimatedPosition = keywordIdEstimatedPosition;
    }


    /**
     * Gets the keywordIdEstimatedPosition value for this ArrayOfKeywordIdEstimatedPosition.
     * 
     * @return keywordIdEstimatedPosition
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition[] getKeywordIdEstimatedPosition() {
        return keywordIdEstimatedPosition;
    }


    /**
     * Sets the keywordIdEstimatedPosition value for this ArrayOfKeywordIdEstimatedPosition.
     * 
     * @param keywordIdEstimatedPosition
     */
    public void setKeywordIdEstimatedPosition(com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition[] keywordIdEstimatedPosition) {
        this.keywordIdEstimatedPosition = keywordIdEstimatedPosition;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition getKeywordIdEstimatedPosition(int i) {
        return this.keywordIdEstimatedPosition[i];
    }

    public void setKeywordIdEstimatedPosition(int i, com.microsoft.bingads.v9.datacontracts.KeywordIdEstimatedPosition _value) {
        this.keywordIdEstimatedPosition[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordIdEstimatedPosition)) return false;
        ArrayOfKeywordIdEstimatedPosition other = (ArrayOfKeywordIdEstimatedPosition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordIdEstimatedPosition==null && other.getKeywordIdEstimatedPosition()==null) || 
             (this.keywordIdEstimatedPosition!=null &&
              java.util.Arrays.equals(this.keywordIdEstimatedPosition, other.getKeywordIdEstimatedPosition())));
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
        if (getKeywordIdEstimatedPosition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordIdEstimatedPosition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordIdEstimatedPosition(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordIdEstimatedPosition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordIdEstimatedPosition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordIdEstimatedPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordIdEstimatedPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordIdEstimatedPosition"));
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
