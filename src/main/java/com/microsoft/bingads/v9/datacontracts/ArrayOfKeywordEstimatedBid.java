/**
 * ArrayOfKeywordEstimatedBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordEstimatedBid  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid[] keywordEstimatedBid;

    public ArrayOfKeywordEstimatedBid() {
    }

    public ArrayOfKeywordEstimatedBid(
           com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid[] keywordEstimatedBid) {
           this.keywordEstimatedBid = keywordEstimatedBid;
    }


    /**
     * Gets the keywordEstimatedBid value for this ArrayOfKeywordEstimatedBid.
     * 
     * @return keywordEstimatedBid
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid[] getKeywordEstimatedBid() {
        return keywordEstimatedBid;
    }


    /**
     * Sets the keywordEstimatedBid value for this ArrayOfKeywordEstimatedBid.
     * 
     * @param keywordEstimatedBid
     */
    public void setKeywordEstimatedBid(com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid[] keywordEstimatedBid) {
        this.keywordEstimatedBid = keywordEstimatedBid;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid getKeywordEstimatedBid(int i) {
        return this.keywordEstimatedBid[i];
    }

    public void setKeywordEstimatedBid(int i, com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid _value) {
        this.keywordEstimatedBid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordEstimatedBid)) return false;
        ArrayOfKeywordEstimatedBid other = (ArrayOfKeywordEstimatedBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordEstimatedBid==null && other.getKeywordEstimatedBid()==null) || 
             (this.keywordEstimatedBid!=null &&
              java.util.Arrays.equals(this.keywordEstimatedBid, other.getKeywordEstimatedBid())));
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
        if (getKeywordEstimatedBid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordEstimatedBid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordEstimatedBid(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordEstimatedBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordEstimatedBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordEstimatedBid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordEstimatedBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordEstimatedBid"));
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
