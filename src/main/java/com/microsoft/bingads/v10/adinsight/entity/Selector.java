/**
 * Selector.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class Selector implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(Selector.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Selector"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("dateRange");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DateRange"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DateRange"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("groupBy");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "GroupBy"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("ordering");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Ordering"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "OrderBy"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "OrderBy"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("pageInfo");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "PageInfo"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Paging"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("predicates");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Predicates"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Predicate"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Predicate"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("selectedFields");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SelectedFields"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.entity.DateRange dateRange;
  private com.microsoft.bingads.v10.adinsight.entity.Field[] groupBy;
  private com.microsoft.bingads.v10.adinsight.entity.OrderBy[] ordering;
  private com.microsoft.bingads.v10.adinsight.entity.Paging pageInfo;
  private com.microsoft.bingads.v10.adinsight.entity.Predicate[] predicates;
  private com.microsoft.bingads.v10.adinsight.entity.Field[] selectedFields;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public Selector() {
  }

  public Selector(
          com.microsoft.bingads.v10.adinsight.entity.DateRange dateRange,
          com.microsoft.bingads.v10.adinsight.entity.Field[] groupBy,
          com.microsoft.bingads.v10.adinsight.entity.OrderBy[] ordering,
          com.microsoft.bingads.v10.adinsight.entity.Paging pageInfo,
          com.microsoft.bingads.v10.adinsight.entity.Predicate[] predicates,
          com.microsoft.bingads.v10.adinsight.entity.Field[] selectedFields) {
    this.dateRange = dateRange;
    this.groupBy = groupBy;
    this.ordering = ordering;
    this.pageInfo = pageInfo;
    this.predicates = predicates;
    this.selectedFields = selectedFields;
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
   * Gets the dateRange value for this Selector.
   *
   * @return dateRange
   */
  public com.microsoft.bingads.v10.adinsight.entity.DateRange getDateRange() {
    return dateRange;
  }

  /**
   * Sets the dateRange value for this Selector.
   *
   * @param dateRange
   */
  public void setDateRange(com.microsoft.bingads.v10.adinsight.entity.DateRange dateRange) {
    this.dateRange = dateRange;
  }

  /**
   * Gets the groupBy value for this Selector.
   *
   * @return groupBy
   */
  public com.microsoft.bingads.v10.adinsight.entity.Field[] getGroupBy() {
    return groupBy;
  }

  /**
   * Sets the groupBy value for this Selector.
   *
   * @param groupBy
   */
  public void setGroupBy(com.microsoft.bingads.v10.adinsight.entity.Field[] groupBy) {
    this.groupBy = groupBy;
  }

  /**
   * Gets the ordering value for this Selector.
   *
   * @return ordering
   */
  public com.microsoft.bingads.v10.adinsight.entity.OrderBy[] getOrdering() {
    return ordering;
  }

  /**
   * Sets the ordering value for this Selector.
   *
   * @param ordering
   */
  public void setOrdering(com.microsoft.bingads.v10.adinsight.entity.OrderBy[] ordering) {
    this.ordering = ordering;
  }

  /**
   * Gets the pageInfo value for this Selector.
   *
   * @return pageInfo
   */
  public com.microsoft.bingads.v10.adinsight.entity.Paging getPageInfo() {
    return pageInfo;
  }

  /**
   * Sets the pageInfo value for this Selector.
   *
   * @param pageInfo
   */
  public void setPageInfo(com.microsoft.bingads.v10.adinsight.entity.Paging pageInfo) {
    this.pageInfo = pageInfo;
  }

  /**
   * Gets the predicates value for this Selector.
   *
   * @return predicates
   */
  public com.microsoft.bingads.v10.adinsight.entity.Predicate[] getPredicates() {
    return predicates;
  }

  /**
   * Sets the predicates value for this Selector.
   *
   * @param predicates
   */
  public void setPredicates(com.microsoft.bingads.v10.adinsight.entity.Predicate[] predicates) {
    this.predicates = predicates;
  }

  /**
   * Gets the selectedFields value for this Selector.
   *
   * @return selectedFields
   */
  public com.microsoft.bingads.v10.adinsight.entity.Field[] getSelectedFields() {
    return selectedFields;
  }

  /**
   * Sets the selectedFields value for this Selector.
   *
   * @param selectedFields
   */
  public void setSelectedFields(com.microsoft.bingads.v10.adinsight.entity.Field[] selectedFields) {
    this.selectedFields = selectedFields;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof Selector)) return false;
    Selector other = (Selector) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.dateRange == null && other.getDateRange() == null) ||
                    (this.dateRange != null &&
                            this.dateRange.equals(other.getDateRange()))) &&
            ((this.groupBy == null && other.getGroupBy() == null) ||
                    (this.groupBy != null &&
                            java.util.Arrays.equals(this.groupBy, other.getGroupBy()))) &&
            ((this.ordering == null && other.getOrdering() == null) ||
                    (this.ordering != null &&
                            java.util.Arrays.equals(this.ordering, other.getOrdering()))) &&
            ((this.pageInfo == null && other.getPageInfo() == null) ||
                    (this.pageInfo != null &&
                            this.pageInfo.equals(other.getPageInfo()))) &&
            ((this.predicates == null && other.getPredicates() == null) ||
                    (this.predicates != null &&
                            java.util.Arrays.equals(this.predicates, other.getPredicates()))) &&
            ((this.selectedFields == null && other.getSelectedFields() == null) ||
                    (this.selectedFields != null &&
                            java.util.Arrays.equals(this.selectedFields, other.getSelectedFields())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getDateRange() != null) {
      _hashCode += getDateRange().hashCode();
    }
    if (getGroupBy() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getGroupBy());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getGroupBy(), i);
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
    if (getSelectedFields() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getSelectedFields());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getSelectedFields(), i);
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
