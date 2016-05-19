/**
 * GetAuctionInsightDataRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class GetAuctionInsightDataRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetAuctionInsightDataRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetAuctionInsightDataRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("selector");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Selector"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Selector"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.entity.Selector selector;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetAuctionInsightDataRequest() {
  }

  public GetAuctionInsightDataRequest(
          com.microsoft.bingads.v10.adinsight.entity.Selector selector) {
    this.selector = selector;
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
   * Gets the selector value for this GetAuctionInsightDataRequest.
   *
   * @return selector
   */
  public com.microsoft.bingads.v10.adinsight.entity.Selector getSelector() {
    return selector;
  }

  /**
   * Sets the selector value for this GetAuctionInsightDataRequest.
   *
   * @param selector
   */
  public void setSelector(com.microsoft.bingads.v10.adinsight.entity.Selector selector) {
    this.selector = selector;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetAuctionInsightDataRequest)) return false;
    GetAuctionInsightDataRequest other = (GetAuctionInsightDataRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.selector == null && other.getSelector() == null) ||
                    (this.selector != null &&
                            this.selector.equals(other.getSelector())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getSelector() != null) {
      _hashCode += getSelector().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
