/**
 * AddTargetsToLibraryRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class AddTargetsToLibraryRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AddTargetsToLibraryRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddTargetsToLibraryRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("targets");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Targets"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Target"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Target"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.Target[] targets;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AddTargetsToLibraryRequest() {
  }

  public AddTargetsToLibraryRequest(
          com.microsoft.bingads.v10.campaignmanagement.Target[] targets) {
    this.targets = targets;
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
   * Gets the targets value for this AddTargetsToLibraryRequest.
   *
   * @return targets
   */
  public com.microsoft.bingads.v10.campaignmanagement.Target[] getTargets() {
    return targets;
  }

  /**
   * Sets the targets value for this AddTargetsToLibraryRequest.
   *
   * @param targets
   */
  public void setTargets(com.microsoft.bingads.v10.campaignmanagement.Target[] targets) {
    this.targets = targets;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AddTargetsToLibraryRequest)) return false;
    AddTargetsToLibraryRequest other = (AddTargetsToLibraryRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.targets == null && other.getTargets() == null) ||
                    (this.targets != null &&
                            java.util.Arrays.equals(this.targets, other.getTargets())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getTargets() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getTargets());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getTargets(), i);
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
