/**
 * GetSharedEntitiesByAccountIdResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetSharedEntitiesByAccountIdResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetSharedEntitiesByAccountIdResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetSharedEntitiesByAccountIdResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("sharedEntities");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntities"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntity"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntity"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.SharedEntity[] sharedEntities;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetSharedEntitiesByAccountIdResponse() {
  }

  public GetSharedEntitiesByAccountIdResponse(
          com.microsoft.bingads.v10.campaignmanagement.SharedEntity[] sharedEntities) {
    this.sharedEntities = sharedEntities;
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
   * Gets the sharedEntities value for this GetSharedEntitiesByAccountIdResponse.
   *
   * @return sharedEntities
   */
  public com.microsoft.bingads.v10.campaignmanagement.SharedEntity[] getSharedEntities() {
    return sharedEntities;
  }

  /**
   * Sets the sharedEntities value for this GetSharedEntitiesByAccountIdResponse.
   *
   * @param sharedEntities
   */
  public void setSharedEntities(com.microsoft.bingads.v10.campaignmanagement.SharedEntity[] sharedEntities) {
    this.sharedEntities = sharedEntities;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetSharedEntitiesByAccountIdResponse)) return false;
    GetSharedEntitiesByAccountIdResponse other = (GetSharedEntitiesByAccountIdResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.sharedEntities == null && other.getSharedEntities() == null) ||
                    (this.sharedEntities != null &&
                            java.util.Arrays.equals(this.sharedEntities, other.getSharedEntities())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getSharedEntities() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getSharedEntities());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getSharedEntities(), i);
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
