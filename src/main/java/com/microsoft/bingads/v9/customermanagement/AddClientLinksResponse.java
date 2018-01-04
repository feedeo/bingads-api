/**
 * AddClientLinksResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class AddClientLinksResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AddClientLinksResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", ">AddClientLinksResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("operationErrors");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "OperationErrors"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Exception", "OperationError"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Exception", "OperationError"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("partialErrors");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "PartialErrors"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Exception", "ArrayOfOperationError"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Exception", "ArrayOfOperationError"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v9.customermanagement.exception.OperationError[] operationErrors;
  private com.microsoft.bingads.v9.customermanagement.exception.OperationError[][] partialErrors;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AddClientLinksResponse() {
  }

  public AddClientLinksResponse(
          com.microsoft.bingads.v9.customermanagement.exception.OperationError[] operationErrors,
          com.microsoft.bingads.v9.customermanagement.exception.OperationError[][] partialErrors) {
    this.operationErrors = operationErrors;
    this.partialErrors = partialErrors;
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
   * Gets the operationErrors value for this AddClientLinksResponse.
   *
   * @return operationErrors
   */
  public com.microsoft.bingads.v9.customermanagement.exception.OperationError[] getOperationErrors() {
    return operationErrors;
  }

  /**
   * Sets the operationErrors value for this AddClientLinksResponse.
   *
   * @param operationErrors
   */
  public void setOperationErrors(com.microsoft.bingads.v9.customermanagement.exception.OperationError[] operationErrors) {
    this.operationErrors = operationErrors;
  }

  /**
   * Gets the partialErrors value for this AddClientLinksResponse.
   *
   * @return partialErrors
   */
  public com.microsoft.bingads.v9.customermanagement.exception.OperationError[][] getPartialErrors() {
    return partialErrors;
  }

  /**
   * Sets the partialErrors value for this AddClientLinksResponse.
   *
   * @param partialErrors
   */
  public void setPartialErrors(com.microsoft.bingads.v9.customermanagement.exception.OperationError[][] partialErrors) {
    this.partialErrors = partialErrors;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AddClientLinksResponse)) return false;
    AddClientLinksResponse other = (AddClientLinksResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.operationErrors == null && other.getOperationErrors() == null) ||
                    (this.operationErrors != null &&
                            java.util.Arrays.equals(this.operationErrors, other.getOperationErrors()))) &&
            ((this.partialErrors == null && other.getPartialErrors() == null) ||
                    (this.partialErrors != null &&
                            java.util.Arrays.equals(this.partialErrors, other.getPartialErrors())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getOperationErrors() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getOperationErrors());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getOperationErrors(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getPartialErrors() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getPartialErrors());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getPartialErrors(), i);
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
