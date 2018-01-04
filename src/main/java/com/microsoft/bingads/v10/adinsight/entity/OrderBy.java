/**
 * OrderBy.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class OrderBy implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(OrderBy.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "OrderBy"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("sortOrder");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SortOrder"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SortOrder"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("sortingField");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SortingField"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.entity.SortOrder sortOrder;
  private com.microsoft.bingads.v10.adinsight.entity.Field sortingField;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public OrderBy() {
  }

  public OrderBy(
          com.microsoft.bingads.v10.adinsight.entity.SortOrder sortOrder,
          com.microsoft.bingads.v10.adinsight.entity.Field sortingField) {
    this.sortOrder = sortOrder;
    this.sortingField = sortingField;
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
   * Gets the sortOrder value for this OrderBy.
   *
   * @return sortOrder
   */
  public com.microsoft.bingads.v10.adinsight.entity.SortOrder getSortOrder() {
    return sortOrder;
  }

  /**
   * Sets the sortOrder value for this OrderBy.
   *
   * @param sortOrder
   */
  public void setSortOrder(com.microsoft.bingads.v10.adinsight.entity.SortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }

  /**
   * Gets the sortingField value for this OrderBy.
   *
   * @return sortingField
   */
  public com.microsoft.bingads.v10.adinsight.entity.Field getSortingField() {
    return sortingField;
  }

  /**
   * Sets the sortingField value for this OrderBy.
   *
   * @param sortingField
   */
  public void setSortingField(com.microsoft.bingads.v10.adinsight.entity.Field sortingField) {
    this.sortingField = sortingField;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof OrderBy)) return false;
    OrderBy other = (OrderBy) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.sortOrder == null && other.getSortOrder() == null) ||
                    (this.sortOrder != null &&
                            this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.sortingField == null && other.getSortingField() == null) ||
                    (this.sortingField != null &&
                            this.sortingField.equals(other.getSortingField())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getSortOrder() != null) {
      _hashCode += getSortOrder().hashCode();
    }
    if (getSortingField() != null) {
      _hashCode += getSortingField().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
