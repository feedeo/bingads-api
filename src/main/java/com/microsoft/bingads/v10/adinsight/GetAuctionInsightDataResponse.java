/**
 * GetAuctionInsightDataResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class GetAuctionInsightDataResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetAuctionInsightDataResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetAuctionInsightDataResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("result");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Result"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightResult"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.entity.AuctionInsightResult result;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetAuctionInsightDataResponse() {
  }

  public GetAuctionInsightDataResponse(
          com.microsoft.bingads.v10.adinsight.entity.AuctionInsightResult result) {
    this.result = result;
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
   * Gets the result value for this GetAuctionInsightDataResponse.
   *
   * @return result
   */
  public com.microsoft.bingads.v10.adinsight.entity.AuctionInsightResult getResult() {
    return result;
  }

  /**
   * Sets the result value for this GetAuctionInsightDataResponse.
   *
   * @param result
   */
  public void setResult(com.microsoft.bingads.v10.adinsight.entity.AuctionInsightResult result) {
    this.result = result;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetAuctionInsightDataResponse)) return false;
    GetAuctionInsightDataResponse other = (GetAuctionInsightDataResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.result == null && other.getResult() == null) ||
                    (this.result != null &&
                            this.result.equals(other.getResult())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getResult() != null) {
      _hashCode += getResult().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
