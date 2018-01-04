/**
 * ProductCondition.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class ProductCondition implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(ProductCondition.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductCondition"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("attribute");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Attribute"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("operand");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Operand"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String attribute;
  private java.lang.String operand;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public ProductCondition() {
  }

  public ProductCondition(
          java.lang.String attribute,
          java.lang.String operand) {
    this.attribute = attribute;
    this.operand = operand;
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
   * Gets the attribute value for this ProductCondition.
   *
   * @return attribute
   */
  public java.lang.String getAttribute() {
    return attribute;
  }

  /**
   * Sets the attribute value for this ProductCondition.
   *
   * @param attribute
   */
  public void setAttribute(java.lang.String attribute) {
    this.attribute = attribute;
  }

  /**
   * Gets the operand value for this ProductCondition.
   *
   * @return operand
   */
  public java.lang.String getOperand() {
    return operand;
  }

  /**
   * Sets the operand value for this ProductCondition.
   *
   * @param operand
   */
  public void setOperand(java.lang.String operand) {
    this.operand = operand;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof ProductCondition)) return false;
    ProductCondition other = (ProductCondition) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.attribute == null && other.getAttribute() == null) ||
                    (this.attribute != null &&
                            this.attribute.equals(other.getAttribute()))) &&
            ((this.operand == null && other.getOperand() == null) ||
                    (this.operand != null &&
                            this.operand.equals(other.getOperand())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAttribute() != null) {
      _hashCode += getAttribute().hashCode();
    }
    if (getOperand() != null) {
      _hashCode += getOperand().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
