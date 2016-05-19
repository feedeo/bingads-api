/**
 * DeleteTargetsFromLibraryRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class DeleteTargetsFromLibraryRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(DeleteTargetsFromLibraryRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">DeleteTargetsFromLibraryRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("targetIds");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "TargetIds"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
    typeDesc.addFieldDesc(elemField);
  }

  private long[] targetIds;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public DeleteTargetsFromLibraryRequest() {
  }

  public DeleteTargetsFromLibraryRequest(
          long[] targetIds) {
    this.targetIds = targetIds;
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
   * Gets the targetIds value for this DeleteTargetsFromLibraryRequest.
   *
   * @return targetIds
   */
  public long[] getTargetIds() {
    return targetIds;
  }

  /**
   * Sets the targetIds value for this DeleteTargetsFromLibraryRequest.
   *
   * @param targetIds
   */
  public void setTargetIds(long[] targetIds) {
    this.targetIds = targetIds;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof DeleteTargetsFromLibraryRequest)) return false;
    DeleteTargetsFromLibraryRequest other = (DeleteTargetsFromLibraryRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.targetIds == null && other.getTargetIds() == null) ||
                    (this.targetIds != null &&
                            java.util.Arrays.equals(this.targetIds, other.getTargetIds())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getTargetIds() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getTargetIds());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getTargetIds(), i);
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
