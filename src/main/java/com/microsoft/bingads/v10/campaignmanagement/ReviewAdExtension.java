/**
 * ReviewAdExtension.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class ReviewAdExtension extends com.microsoft.bingads.v10.campaignmanagement.AdExtension implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(ReviewAdExtension.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ReviewAdExtension"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("isExact");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "IsExact"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("source");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Source"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("text");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Text"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("url");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Url"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Boolean isExact;
  private java.lang.String source;
  private java.lang.String text;
  private java.lang.String url;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public ReviewAdExtension() {
  }

  public ReviewAdExtension(
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Long id,
          com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus status,
          java.lang.String type,
          java.lang.Integer version,
          java.lang.Boolean isExact,
          java.lang.String source,
          java.lang.String text,
          java.lang.String url) {
    super(
            forwardCompatibilityMap,
            id,
            status,
            type,
            version);
    this.isExact = isExact;
    this.source = source;
    this.text = text;
    this.url = url;
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
   * Gets the isExact value for this ReviewAdExtension.
   *
   * @return isExact
   */
  public java.lang.Boolean getIsExact() {
    return isExact;
  }

  /**
   * Sets the isExact value for this ReviewAdExtension.
   *
   * @param isExact
   */
  public void setIsExact(java.lang.Boolean isExact) {
    this.isExact = isExact;
  }

  /**
   * Gets the source value for this ReviewAdExtension.
   *
   * @return source
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Sets the source value for this ReviewAdExtension.
   *
   * @param source
   */
  public void setSource(java.lang.String source) {
    this.source = source;
  }

  /**
   * Gets the text value for this ReviewAdExtension.
   *
   * @return text
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Sets the text value for this ReviewAdExtension.
   *
   * @param text
   */
  public void setText(java.lang.String text) {
    this.text = text;
  }

  /**
   * Gets the url value for this ReviewAdExtension.
   *
   * @return url
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Sets the url value for this ReviewAdExtension.
   *
   * @param url
   */
  public void setUrl(java.lang.String url) {
    this.url = url;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof ReviewAdExtension)) return false;
    ReviewAdExtension other = (ReviewAdExtension) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = super.equals(obj) &&
            ((this.isExact == null && other.getIsExact() == null) ||
                    (this.isExact != null &&
                            this.isExact.equals(other.getIsExact()))) &&
            ((this.source == null && other.getSource() == null) ||
                    (this.source != null &&
                            this.source.equals(other.getSource()))) &&
            ((this.text == null && other.getText() == null) ||
                    (this.text != null &&
                            this.text.equals(other.getText()))) &&
            ((this.url == null && other.getUrl() == null) ||
                    (this.url != null &&
                            this.url.equals(other.getUrl())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = super.hashCode();
    if (getIsExact() != null) {
      _hashCode += getIsExact().hashCode();
    }
    if (getSource() != null) {
      _hashCode += getSource().hashCode();
    }
    if (getText() != null) {
      _hashCode += getText().hashCode();
    }
    if (getUrl() != null) {
      _hashCode += getUrl().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
