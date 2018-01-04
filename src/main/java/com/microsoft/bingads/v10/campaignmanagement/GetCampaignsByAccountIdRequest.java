/**
 * GetCampaignsByAccountIdRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetCampaignsByAccountIdRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetCampaignsByAccountIdRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetCampaignsByAccountIdRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("accountId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AccountId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignType");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignType"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("returnAdditionalFields");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ReturnAdditionalFields"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignAdditionalField"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long accountId;
  private java.lang.String[] campaignType;
  private java.lang.String[] returnAdditionalFields;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetCampaignsByAccountIdRequest() {
  }

  public GetCampaignsByAccountIdRequest(
          java.lang.Long accountId,
          java.lang.String[] campaignType,
          java.lang.String[] returnAdditionalFields) {
    this.accountId = accountId;
    this.campaignType = campaignType;
    this.returnAdditionalFields = returnAdditionalFields;
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
   * Gets the accountId value for this GetCampaignsByAccountIdRequest.
   *
   * @return accountId
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Sets the accountId value for this GetCampaignsByAccountIdRequest.
   *
   * @param accountId
   */
  public void setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
  }

  /**
   * Gets the campaignType value for this GetCampaignsByAccountIdRequest.
   *
   * @return campaignType
   */
  public java.lang.String[] getCampaignType() {
    return campaignType;
  }

  /**
   * Sets the campaignType value for this GetCampaignsByAccountIdRequest.
   *
   * @param campaignType
   */
  public void setCampaignType(java.lang.String[] campaignType) {
    this.campaignType = campaignType;
  }

  /**
   * Gets the returnAdditionalFields value for this GetCampaignsByAccountIdRequest.
   *
   * @return returnAdditionalFields
   */
  public java.lang.String[] getReturnAdditionalFields() {
    return returnAdditionalFields;
  }

  /**
   * Sets the returnAdditionalFields value for this GetCampaignsByAccountIdRequest.
   *
   * @param returnAdditionalFields
   */
  public void setReturnAdditionalFields(java.lang.String[] returnAdditionalFields) {
    this.returnAdditionalFields = returnAdditionalFields;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetCampaignsByAccountIdRequest)) return false;
    GetCampaignsByAccountIdRequest other = (GetCampaignsByAccountIdRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.accountId == null && other.getAccountId() == null) ||
                    (this.accountId != null &&
                            this.accountId.equals(other.getAccountId()))) &&
            ((this.campaignType == null && other.getCampaignType() == null) ||
                    (this.campaignType != null &&
                            java.util.Arrays.equals(this.campaignType, other.getCampaignType()))) &&
            ((this.returnAdditionalFields == null && other.getReturnAdditionalFields() == null) ||
                    (this.returnAdditionalFields != null &&
                            java.util.Arrays.equals(this.returnAdditionalFields, other.getReturnAdditionalFields())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAccountId() != null) {
      _hashCode += getAccountId().hashCode();
    }
    if (getCampaignType() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getCampaignType());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getCampaignType(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getReturnAdditionalFields() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getReturnAdditionalFields());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getReturnAdditionalFields(), i);
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
