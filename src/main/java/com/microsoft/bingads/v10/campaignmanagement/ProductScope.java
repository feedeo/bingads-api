/**
 * ProductScope.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class ProductScope extends com.microsoft.bingads.v10.campaignmanagement.Criterion implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(ProductScope.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductScope"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("conditions");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Conditions"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductCondition"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductCondition"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.ProductCondition[] conditions;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public ProductScope() {
  }

  public ProductScope(
          java.lang.String type,
          com.microsoft.bingads.v10.campaignmanagement.ProductCondition[] conditions) {
    super(
            type);
    this.conditions = conditions;
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
   * Gets the conditions value for this ProductScope.
   *
   * @return conditions
   */
  public com.microsoft.bingads.v10.campaignmanagement.ProductCondition[] getConditions() {
    return conditions;
  }

  /**
   * Sets the conditions value for this ProductScope.
   *
   * @param conditions
   */
  public void setConditions(com.microsoft.bingads.v10.campaignmanagement.ProductCondition[] conditions) {
    this.conditions = conditions;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof ProductScope)) return false;
    ProductScope other = (ProductScope) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.conditions == null && other.getConditions() == null) ||
                    (this.conditions != null &&
                            java.util.Arrays.equals(this.conditions, other.getConditions())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getConditions() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getConditions());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getConditions(), i);
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
