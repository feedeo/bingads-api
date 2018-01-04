/**
 * GetPlacementDetailsForUrlsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetPlacementDetailsForUrlsResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetPlacementDetailsForUrlsResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetPlacementDetailsForUrlsResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("placementDetails");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PlacementDetails"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfPlacementDetail"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfPlacementDetail"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.PlacementDetail[][] placementDetails;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetPlacementDetailsForUrlsResponse() {
  }

  public GetPlacementDetailsForUrlsResponse(
          com.microsoft.bingads.v10.campaignmanagement.PlacementDetail[][] placementDetails) {
    this.placementDetails = placementDetails;
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
   * Gets the placementDetails value for this GetPlacementDetailsForUrlsResponse.
   *
   * @return placementDetails
   */
  public com.microsoft.bingads.v10.campaignmanagement.PlacementDetail[][] getPlacementDetails() {
    return placementDetails;
  }

  /**
   * Sets the placementDetails value for this GetPlacementDetailsForUrlsResponse.
   *
   * @param placementDetails
   */
  public void setPlacementDetails(com.microsoft.bingads.v10.campaignmanagement.PlacementDetail[][] placementDetails) {
    this.placementDetails = placementDetails;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetPlacementDetailsForUrlsResponse)) return false;
    GetPlacementDetailsForUrlsResponse other = (GetPlacementDetailsForUrlsResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.placementDetails == null && other.getPlacementDetails() == null) ||
                    (this.placementDetails != null &&
                            java.util.Arrays.equals(this.placementDetails, other.getPlacementDetails())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getPlacementDetails() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getPlacementDetails());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getPlacementDetails(), i);
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
