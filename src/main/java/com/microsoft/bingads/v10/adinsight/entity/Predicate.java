/**
 * Predicate.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class Predicate implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(Predicate.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Predicate"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("filteringField");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "FilteringField"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("operator");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Operator"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Operator"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("values");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Values"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.entity.Field filteringField;
  private com.microsoft.bingads.v10.adinsight.entity.Operator operator;
  private java.lang.String[] values;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public Predicate() {
  }

  public Predicate(
          com.microsoft.bingads.v10.adinsight.entity.Field filteringField,
          com.microsoft.bingads.v10.adinsight.entity.Operator operator,
          java.lang.String[] values) {
    this.filteringField = filteringField;
    this.operator = operator;
    this.values = values;
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
   * Gets the filteringField value for this Predicate.
   *
   * @return filteringField
   */
  public com.microsoft.bingads.v10.adinsight.entity.Field getFilteringField() {
    return filteringField;
  }

  /**
   * Sets the filteringField value for this Predicate.
   *
   * @param filteringField
   */
  public void setFilteringField(com.microsoft.bingads.v10.adinsight.entity.Field filteringField) {
    this.filteringField = filteringField;
  }

  /**
   * Gets the operator value for this Predicate.
   *
   * @return operator
   */
  public com.microsoft.bingads.v10.adinsight.entity.Operator getOperator() {
    return operator;
  }

  /**
   * Sets the operator value for this Predicate.
   *
   * @param operator
   */
  public void setOperator(com.microsoft.bingads.v10.adinsight.entity.Operator operator) {
    this.operator = operator;
  }

  /**
   * Gets the values value for this Predicate.
   *
   * @return values
   */
  public java.lang.String[] getValues() {
    return values;
  }

  /**
   * Sets the values value for this Predicate.
   *
   * @param values
   */
  public void setValues(java.lang.String[] values) {
    this.values = values;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof Predicate)) return false;
    Predicate other = (Predicate) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.filteringField == null && other.getFilteringField() == null) ||
                    (this.filteringField != null &&
                            this.filteringField.equals(other.getFilteringField()))) &&
            ((this.operator == null && other.getOperator() == null) ||
                    (this.operator != null &&
                            this.operator.equals(other.getOperator()))) &&
            ((this.values == null && other.getValues() == null) ||
                    (this.values != null &&
                            java.util.Arrays.equals(this.values, other.getValues())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getFilteringField() != null) {
      _hashCode += getFilteringField().hashCode();
    }
    if (getOperator() != null) {
      _hashCode += getOperator().hashCode();
    }
    if (getValues() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getValues());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
