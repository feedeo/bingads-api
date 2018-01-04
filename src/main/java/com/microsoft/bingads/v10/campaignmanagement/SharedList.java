/**
 * SharedList.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class SharedList extends com.microsoft.bingads.v10.campaignmanagement.SharedEntity implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(SharedList.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedList"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("itemCount");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ItemCount"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Integer itemCount;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public SharedList() {
  }

  public SharedList(
          java.lang.Integer associationCount,
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Long id,
          java.lang.String name,
          java.lang.String type,
          java.lang.Integer itemCount) {
    super(
            associationCount,
            forwardCompatibilityMap,
            id,
            name,
            type);
    this.itemCount = itemCount;
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
   * Gets the itemCount value for this SharedList.
   *
   * @return itemCount
   */
  public java.lang.Integer getItemCount() {
    return itemCount;
  }

  /**
   * Sets the itemCount value for this SharedList.
   *
   * @param itemCount
   */
  public void setItemCount(java.lang.Integer itemCount) {
    this.itemCount = itemCount;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof SharedList)) return false;
    SharedList other = (SharedList) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.itemCount == null && other.getItemCount() == null) ||
                    (this.itemCount != null &&
                            this.itemCount.equals(other.getItemCount())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getItemCount() != null) {
      _hashCode += getItemCount().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
