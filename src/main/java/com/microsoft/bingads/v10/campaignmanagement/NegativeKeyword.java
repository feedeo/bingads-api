/**
 * NegativeKeyword.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class NegativeKeyword extends com.microsoft.bingads.v10.campaignmanagement.SharedListItem implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(NegativeKeyword.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeKeyword"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("id");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Id"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("matchType");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MatchType"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "MatchType"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("text");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Text"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long id;
  private com.microsoft.bingads.v10.campaignmanagement.MatchType matchType;
  private java.lang.String text;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public NegativeKeyword() {
  }

  public NegativeKeyword(
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.String type,
          java.lang.Long id,
          com.microsoft.bingads.v10.campaignmanagement.MatchType matchType,
          java.lang.String text) {
    super(
            forwardCompatibilityMap,
            type);
    this.id = id;
    this.matchType = matchType;
    this.text = text;
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
   * Gets the id value for this NegativeKeyword.
   *
   * @return id
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the id value for this NegativeKeyword.
   *
   * @param id
   */
  public void setId(java.lang.Long id) {
    this.id = id;
  }

  /**
   * Gets the matchType value for this NegativeKeyword.
   *
   * @return matchType
   */
  public com.microsoft.bingads.v10.campaignmanagement.MatchType getMatchType() {
    return matchType;
  }

  /**
   * Sets the matchType value for this NegativeKeyword.
   *
   * @param matchType
   */
  public void setMatchType(com.microsoft.bingads.v10.campaignmanagement.MatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * Gets the text value for this NegativeKeyword.
   *
   * @return text
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Sets the text value for this NegativeKeyword.
   *
   * @param text
   */
  public void setText(java.lang.String text) {
    this.text = text;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof NegativeKeyword)) return false;
    NegativeKeyword other = (NegativeKeyword) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.id == null && other.getId() == null) ||
                    (this.id != null &&
                            this.id.equals(other.getId()))) &&
            ((this.matchType == null && other.getMatchType() == null) ||
                    (this.matchType != null &&
                            this.matchType.equals(other.getMatchType()))) &&
            ((this.text == null && other.getText() == null) ||
                    (this.text != null &&
                            this.text.equals(other.getText())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getId() != null) {
      _hashCode += getId().hashCode();
    }
    if (getMatchType() != null) {
      _hashCode += getMatchType().hashCode();
    }
    if (getText() != null) {
      _hashCode += getText().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
