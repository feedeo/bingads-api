/**
 * GeoPoint.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GeoPoint implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GeoPoint.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GeoPoint"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("latitudeInMicroDegrees");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "LatitudeInMicroDegrees"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("longitudeInMicroDegrees");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "LongitudeInMicroDegrees"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private int latitudeInMicroDegrees;
  private int longitudeInMicroDegrees;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GeoPoint() {
  }

  public GeoPoint(
          int latitudeInMicroDegrees,
          int longitudeInMicroDegrees) {
    this.latitudeInMicroDegrees = latitudeInMicroDegrees;
    this.longitudeInMicroDegrees = longitudeInMicroDegrees;
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
   * Gets the latitudeInMicroDegrees value for this GeoPoint.
   *
   * @return latitudeInMicroDegrees
   */
  public int getLatitudeInMicroDegrees() {
    return latitudeInMicroDegrees;
  }

  /**
   * Sets the latitudeInMicroDegrees value for this GeoPoint.
   *
   * @param latitudeInMicroDegrees
   */
  public void setLatitudeInMicroDegrees(int latitudeInMicroDegrees) {
    this.latitudeInMicroDegrees = latitudeInMicroDegrees;
  }

  /**
   * Gets the longitudeInMicroDegrees value for this GeoPoint.
   *
   * @return longitudeInMicroDegrees
   */
  public int getLongitudeInMicroDegrees() {
    return longitudeInMicroDegrees;
  }

  /**
   * Sets the longitudeInMicroDegrees value for this GeoPoint.
   *
   * @param longitudeInMicroDegrees
   */
  public void setLongitudeInMicroDegrees(int longitudeInMicroDegrees) {
    this.longitudeInMicroDegrees = longitudeInMicroDegrees;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GeoPoint)) return false;
    GeoPoint other = (GeoPoint) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            this.latitudeInMicroDegrees == other.getLatitudeInMicroDegrees() &&
            this.longitudeInMicroDegrees == other.getLongitudeInMicroDegrees();
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    _hashCode += getLatitudeInMicroDegrees();
    _hashCode += getLongitudeInMicroDegrees();
    __hashCodeCalc = false;
    return _hashCode;
  }

}
