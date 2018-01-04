/**
 * Opportunity.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight.entity;

public class Opportunity implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(Opportunity.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Opportunity"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("opportunityKey");
    elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "OpportunityKey"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.String opportunityKey;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public Opportunity() {
  }

  public Opportunity(
          java.lang.String opportunityKey) {
    this.opportunityKey = opportunityKey;
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
   * Gets the opportunityKey value for this Opportunity.
   *
   * @return opportunityKey
   */
  public java.lang.String getOpportunityKey() {
    return opportunityKey;
  }

  /**
   * Sets the opportunityKey value for this Opportunity.
   *
   * @param opportunityKey
   */
  public void setOpportunityKey(java.lang.String opportunityKey) {
    this.opportunityKey = opportunityKey;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof Opportunity)) return false;
    Opportunity other = (Opportunity) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.opportunityKey == null && other.getOpportunityKey() == null) ||
                    (this.opportunityKey != null &&
                            this.opportunityKey.equals(other.getOpportunityKey())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getOpportunityKey() != null) {
      _hashCode += getOpportunityKey().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
