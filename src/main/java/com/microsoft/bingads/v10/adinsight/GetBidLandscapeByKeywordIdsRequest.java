/**
 * GetBidLandscapeByKeywordIdsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class GetBidLandscapeByKeywordIdsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetBidLandscapeByKeywordIdsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBidLandscapeByKeywordIdsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywordIds");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "KeywordIds"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("includeCurrentBid");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "IncludeCurrentBid"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private long[] keywordIds;
  private java.lang.Boolean includeCurrentBid;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetBidLandscapeByKeywordIdsRequest() {
  }

  public GetBidLandscapeByKeywordIdsRequest(
          long[] keywordIds,
          java.lang.Boolean includeCurrentBid) {
    this.keywordIds = keywordIds;
    this.includeCurrentBid = includeCurrentBid;
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
            new org.apache.axis.encoding.ser.BeanSerializer(
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
            new org.apache.axis.encoding.ser.BeanDeserializer(
                    _javaType, _xmlType, typeDesc);
  }

  /**
   * Gets the keywordIds value for this GetBidLandscapeByKeywordIdsRequest.
   *
   * @return keywordIds
   */
  public long[] getKeywordIds() {
    return keywordIds;
  }

  /**
   * Sets the keywordIds value for this GetBidLandscapeByKeywordIdsRequest.
   *
   * @param keywordIds
   */
  public void setKeywordIds(long[] keywordIds) {
    this.keywordIds = keywordIds;
  }

  /**
   * Gets the includeCurrentBid value for this GetBidLandscapeByKeywordIdsRequest.
   *
   * @return includeCurrentBid
   */
  public java.lang.Boolean getIncludeCurrentBid() {
    return includeCurrentBid;
  }

  /**
   * Sets the includeCurrentBid value for this GetBidLandscapeByKeywordIdsRequest.
   *
   * @param includeCurrentBid
   */
  public void setIncludeCurrentBid(java.lang.Boolean includeCurrentBid) {
    this.includeCurrentBid = includeCurrentBid;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetBidLandscapeByKeywordIdsRequest)) return false;
    GetBidLandscapeByKeywordIdsRequest other = (GetBidLandscapeByKeywordIdsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.keywordIds == null && other.getKeywordIds() == null) ||
                    (this.keywordIds != null &&
                            java.util.Arrays.equals(this.keywordIds, other.getKeywordIds()))) &&
            ((this.includeCurrentBid == null && other.getIncludeCurrentBid() == null) ||
                    (this.includeCurrentBid != null &&
                            this.includeCurrentBid.equals(other.getIncludeCurrentBid())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getKeywordIds() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getKeywordIds());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getKeywordIds(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getIncludeCurrentBid() != null) {
      _hashCode += getIncludeCurrentBid().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
