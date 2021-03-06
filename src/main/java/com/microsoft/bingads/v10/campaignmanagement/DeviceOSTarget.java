/**
 * DeviceOSTarget.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class DeviceOSTarget implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(DeviceOSTarget.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOSTarget"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("bids");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Bids"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOSTargetBid"));
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOSTargetBid"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.DeviceOSTargetBid[] bids;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public DeviceOSTarget() {
  }

  public DeviceOSTarget(
          com.microsoft.bingads.v10.campaignmanagement.DeviceOSTargetBid[] bids) {
    this.bids = bids;
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
   * Gets the bids value for this DeviceOSTarget.
   *
   * @return bids
   */
  public com.microsoft.bingads.v10.campaignmanagement.DeviceOSTargetBid[] getBids() {
    return bids;
  }

  /**
   * Sets the bids value for this DeviceOSTarget.
   *
   * @param bids
   */
  public void setBids(com.microsoft.bingads.v10.campaignmanagement.DeviceOSTargetBid[] bids) {
    this.bids = bids;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof DeviceOSTarget)) return false;
    DeviceOSTarget other = (DeviceOSTarget) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.bids == null && other.getBids() == null) ||
                    (this.bids != null &&
                            java.util.Arrays.equals(this.bids, other.getBids())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getBids() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getBids());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getBids(), i);
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
