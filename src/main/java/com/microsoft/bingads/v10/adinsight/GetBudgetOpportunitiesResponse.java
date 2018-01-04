/**
 * GetBudgetOpportunitiesResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class GetBudgetOpportunitiesResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetBudgetOpportunitiesResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetBudgetOpportunitiesResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("opportunities");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "Opportunities"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetOpportunity"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetOpportunity"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.adinsight.entity.BudgetOpportunity[] opportunities;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetBudgetOpportunitiesResponse() {
  }

  public GetBudgetOpportunitiesResponse(
          com.microsoft.bingads.v10.adinsight.entity.BudgetOpportunity[] opportunities) {
    this.opportunities = opportunities;
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
   * Gets the opportunities value for this GetBudgetOpportunitiesResponse.
   *
   * @return opportunities
   */
  public com.microsoft.bingads.v10.adinsight.entity.BudgetOpportunity[] getOpportunities() {
    return opportunities;
  }

  /**
   * Sets the opportunities value for this GetBudgetOpportunitiesResponse.
   *
   * @param opportunities
   */
  public void setOpportunities(com.microsoft.bingads.v10.adinsight.entity.BudgetOpportunity[] opportunities) {
    this.opportunities = opportunities;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetBudgetOpportunitiesResponse)) return false;
    GetBudgetOpportunitiesResponse other = (GetBudgetOpportunitiesResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.opportunities == null && other.getOpportunities() == null) ||
                    (this.opportunities != null &&
                            java.util.Arrays.equals(this.opportunities, other.getOpportunities())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getOpportunities() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getOpportunities());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getOpportunities(), i);
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
