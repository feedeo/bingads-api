/**
 * SearchAccountsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class SearchAccountsRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(SearchAccountsRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", ">SearchAccountsRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("predicates");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "Predicates"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Predicate"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Predicate"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("ordering");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "Ordering"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "OrderBy"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "OrderBy"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("pageInfo");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "PageInfo"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Paging"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("includeTaxDetails");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "IncludeTaxDetails"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v9.customermanagement.entities.Predicate[] predicates;
  private com.microsoft.bingads.v9.customermanagement.entities.OrderBy[] ordering;
  private com.microsoft.bingads.v9.customermanagement.entities.Paging pageInfo;
  private java.lang.Boolean includeTaxDetails;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public SearchAccountsRequest() {
  }

  public SearchAccountsRequest(
          com.microsoft.bingads.v9.customermanagement.entities.Predicate[] predicates,
          com.microsoft.bingads.v9.customermanagement.entities.OrderBy[] ordering,
          com.microsoft.bingads.v9.customermanagement.entities.Paging pageInfo,
          java.lang.Boolean includeTaxDetails) {
    this.predicates = predicates;
    this.ordering = ordering;
    this.pageInfo = pageInfo;
    this.includeTaxDetails = includeTaxDetails;
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
   * Gets the predicates value for this SearchAccountsRequest.
   *
   * @return predicates
   */
  public com.microsoft.bingads.v9.customermanagement.entities.Predicate[] getPredicates() {
    return predicates;
  }

  /**
   * Sets the predicates value for this SearchAccountsRequest.
   *
   * @param predicates
   */
  public void setPredicates(com.microsoft.bingads.v9.customermanagement.entities.Predicate[] predicates) {
    this.predicates = predicates;
  }

  /**
   * Gets the ordering value for this SearchAccountsRequest.
   *
   * @return ordering
   */
  public com.microsoft.bingads.v9.customermanagement.entities.OrderBy[] getOrdering() {
    return ordering;
  }

  /**
   * Sets the ordering value for this SearchAccountsRequest.
   *
   * @param ordering
   */
  public void setOrdering(com.microsoft.bingads.v9.customermanagement.entities.OrderBy[] ordering) {
    this.ordering = ordering;
  }

  /**
   * Gets the pageInfo value for this SearchAccountsRequest.
   *
   * @return pageInfo
   */
  public com.microsoft.bingads.v9.customermanagement.entities.Paging getPageInfo() {
    return pageInfo;
  }

  /**
   * Sets the pageInfo value for this SearchAccountsRequest.
   *
   * @param pageInfo
   */
  public void setPageInfo(com.microsoft.bingads.v9.customermanagement.entities.Paging pageInfo) {
    this.pageInfo = pageInfo;
  }

  /**
   * Gets the includeTaxDetails value for this SearchAccountsRequest.
   *
   * @return includeTaxDetails
   */
  public java.lang.Boolean getIncludeTaxDetails() {
    return includeTaxDetails;
  }

  /**
   * Sets the includeTaxDetails value for this SearchAccountsRequest.
   *
   * @param includeTaxDetails
   */
  public void setIncludeTaxDetails(java.lang.Boolean includeTaxDetails) {
    this.includeTaxDetails = includeTaxDetails;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof SearchAccountsRequest)) return false;
    SearchAccountsRequest other = (SearchAccountsRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.predicates == null && other.getPredicates() == null) ||
                    (this.predicates != null &&
                            java.util.Arrays.equals(this.predicates, other.getPredicates()))) &&
            ((this.ordering == null && other.getOrdering() == null) ||
                    (this.ordering != null &&
                            java.util.Arrays.equals(this.ordering, other.getOrdering()))) &&
            ((this.pageInfo == null && other.getPageInfo() == null) ||
                    (this.pageInfo != null &&
                            this.pageInfo.equals(other.getPageInfo()))) &&
            ((this.includeTaxDetails == null && other.getIncludeTaxDetails() == null) ||
                    (this.includeTaxDetails != null &&
                            this.includeTaxDetails.equals(other.getIncludeTaxDetails())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getPredicates() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getPredicates());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getPredicates(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getOrdering() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getOrdering());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getOrdering(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getPageInfo() != null) {
      _hashCode += getPageInfo().hashCode();
    }
    if (getIncludeTaxDetails() != null) {
      _hashCode += getIncludeTaxDetails().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
