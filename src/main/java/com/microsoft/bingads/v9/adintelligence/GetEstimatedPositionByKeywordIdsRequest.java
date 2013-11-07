/**
 * GetEstimatedPositionByKeywordIdsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetEstimatedPositionByKeywordIdsRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong keywordIds;

    private java.lang.Double maxBid;

    public GetEstimatedPositionByKeywordIdsRequest() {
    }

    public GetEstimatedPositionByKeywordIdsRequest(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong keywordIds,
           java.lang.Double maxBid) {
           this.keywordIds = keywordIds;
           this.maxBid = maxBid;
    }


    /**
     * Gets the keywordIds value for this GetEstimatedPositionByKeywordIdsRequest.
     * 
     * @return keywordIds
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getKeywordIds() {
        return keywordIds;
    }


    /**
     * Sets the keywordIds value for this GetEstimatedPositionByKeywordIdsRequest.
     * 
     * @param keywordIds
     */
    public void setKeywordIds(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong keywordIds) {
        this.keywordIds = keywordIds;
    }


    /**
     * Gets the maxBid value for this GetEstimatedPositionByKeywordIdsRequest.
     * 
     * @return maxBid
     */
    public java.lang.Double getMaxBid() {
        return maxBid;
    }


    /**
     * Sets the maxBid value for this GetEstimatedPositionByKeywordIdsRequest.
     * 
     * @param maxBid
     */
    public void setMaxBid(java.lang.Double maxBid) {
        this.maxBid = maxBid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEstimatedPositionByKeywordIdsRequest)) return false;
        GetEstimatedPositionByKeywordIdsRequest other = (GetEstimatedPositionByKeywordIdsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordIds==null && other.getKeywordIds()==null) || 
             (this.keywordIds!=null &&
              this.keywordIds.equals(other.getKeywordIds()))) &&
            ((this.maxBid==null && other.getMaxBid()==null) || 
             (this.maxBid!=null &&
              this.maxBid.equals(other.getMaxBid())));
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
        if (getKeywordIds() != null) {
            _hashCode += getKeywordIds().hashCode();
        }
        if (getMaxBid() != null) {
            _hashCode += getMaxBid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEstimatedPositionByKeywordIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedPositionByKeywordIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "KeywordIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "MaxBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
