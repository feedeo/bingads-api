/**
 * GetKeywordOpportunitiesRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.adinsight;

public class GetKeywordOpportunitiesRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetKeywordOpportunitiesRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", ">GetKeywordOpportunitiesRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("adGroupId");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "AdGroupId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("campaignId");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "CampaignId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("opportunityType");
    elemField.setXmlName(new javax.xml.namespace.QName("Microsoft.Advertiser.AdInsight.Api.Service", "OpportunityType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordOpportunityType"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long adGroupId;
  private java.lang.Long campaignId;
  private java.lang.String[] opportunityType;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetKeywordOpportunitiesRequest() {
  }

  public GetKeywordOpportunitiesRequest(
          java.lang.Long adGroupId,
          java.lang.Long campaignId,
          java.lang.String[] opportunityType) {
    this.adGroupId = adGroupId;
    this.campaignId = campaignId;
    this.opportunityType = opportunityType;
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
   * Gets the adGroupId value for this GetKeywordOpportunitiesRequest.
   *
   * @return adGroupId
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the adGroupId value for this GetKeywordOpportunitiesRequest.
   *
   * @param adGroupId
   */
  public void setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Gets the campaignId value for this GetKeywordOpportunitiesRequest.
   *
   * @return campaignId
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the campaignId value for this GetKeywordOpportunitiesRequest.
   *
   * @param campaignId
   */
  public void setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Gets the opportunityType value for this GetKeywordOpportunitiesRequest.
   *
   * @return opportunityType
   */
  public java.lang.String[] getOpportunityType() {
    return opportunityType;
  }

  /**
   * Sets the opportunityType value for this GetKeywordOpportunitiesRequest.
   *
   * @param opportunityType
   */
  public void setOpportunityType(java.lang.String[] opportunityType) {
    this.opportunityType = opportunityType;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetKeywordOpportunitiesRequest)) return false;
    GetKeywordOpportunitiesRequest other = (GetKeywordOpportunitiesRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.adGroupId == null && other.getAdGroupId() == null) ||
                    (this.adGroupId != null &&
                            this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.campaignId == null && other.getCampaignId() == null) ||
                    (this.campaignId != null &&
                            this.campaignId.equals(other.getCampaignId()))) &&
            ((this.opportunityType == null && other.getOpportunityType() == null) ||
                    (this.opportunityType != null &&
                            java.util.Arrays.equals(this.opportunityType, other.getOpportunityType())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAdGroupId() != null) {
      _hashCode += getAdGroupId().hashCode();
    }
    if (getCampaignId() != null) {
      _hashCode += getCampaignId().hashCode();
    }
    if (getOpportunityType() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getOpportunityType());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getOpportunityType(), i);
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
