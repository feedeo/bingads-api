/**
 * MaxClicksBiddingScheme.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.datacontracts;

public class MaxClicksBiddingScheme extends com.microsoft.bingads.v10.datacontracts.BiddingScheme implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(MaxClicksBiddingScheme.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "MaxClicksBiddingScheme"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("maxCpc");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "MaxCpc"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Bid"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.Bid maxCpc;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public MaxClicksBiddingScheme() {
  }

  public MaxClicksBiddingScheme(
          java.lang.String type,
          com.microsoft.bingads.v10.campaignmanagement.Bid maxCpc) {
    super(
            type);
    this.maxCpc = maxCpc;
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
   * Gets the maxCpc value for this MaxClicksBiddingScheme.
   *
   * @return maxCpc
   */
  public com.microsoft.bingads.v10.campaignmanagement.Bid getMaxCpc() {
    return maxCpc;
  }

  /**
   * Sets the maxCpc value for this MaxClicksBiddingScheme.
   *
   * @param maxCpc
   */
  public void setMaxCpc(com.microsoft.bingads.v10.campaignmanagement.Bid maxCpc) {
    this.maxCpc = maxCpc;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof MaxClicksBiddingScheme)) return false;
    MaxClicksBiddingScheme other = (MaxClicksBiddingScheme) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.maxCpc == null && other.getMaxCpc() == null) ||
                    (this.maxCpc != null &&
                            this.maxCpc.equals(other.getMaxCpc())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getMaxCpc() != null) {
      _hashCode += getMaxCpc().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
