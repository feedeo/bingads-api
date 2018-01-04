/**
 * GetHistoricalSearchCountResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class GetHistoricalSearchCountResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetHistoricalSearchCountResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetHistoricalSearchCountResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("keywordSearchCounts");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "KeywordSearchCounts"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSearchCount"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSearchCount"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.entity.KeywordSearchCount[] keywordSearchCounts;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetHistoricalSearchCountResponse() {
  }

  public GetHistoricalSearchCountResponse(
          com.microsoft.bingads.v10.adinsight.entity.KeywordSearchCount[] keywordSearchCounts) {
    this.keywordSearchCounts = keywordSearchCounts;
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
   * Gets the keywordSearchCounts value for this GetHistoricalSearchCountResponse.
   *
   * @return keywordSearchCounts
   */
  public com.microsoft.bingads.v10.adinsight.entity.KeywordSearchCount[] getKeywordSearchCounts() {
    return keywordSearchCounts;
  }

  /**
   * Sets the keywordSearchCounts value for this GetHistoricalSearchCountResponse.
   *
   * @param keywordSearchCounts
   */
  public void setKeywordSearchCounts(com.microsoft.bingads.v10.adinsight.entity.KeywordSearchCount[] keywordSearchCounts) {
    this.keywordSearchCounts = keywordSearchCounts;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetHistoricalSearchCountResponse)) return false;
    GetHistoricalSearchCountResponse other = (GetHistoricalSearchCountResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.keywordSearchCounts == null && other.getKeywordSearchCounts() == null) ||
                    (this.keywordSearchCounts != null &&
                            java.util.Arrays.equals(this.keywordSearchCounts, other.getKeywordSearchCounts())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getKeywordSearchCounts() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getKeywordSearchCounts());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getKeywordSearchCounts(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
