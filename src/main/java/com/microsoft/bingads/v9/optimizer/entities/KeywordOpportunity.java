/**
 * KeywordOpportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class KeywordOpportunity  extends com.microsoft.bingads.v9.optimizer.entities.Opportunity  implements java.io.Serializable {
    private java.lang.Long adGroupId;

    private java.lang.Long campaignId;

    private java.lang.Double competition;

    private java.lang.Integer matchType;

    private java.lang.Long monthlySearches;

    private java.lang.Double suggestedBid;

    private java.lang.String suggestedKeyword;

    public KeywordOpportunity() {
    }

    public KeywordOpportunity(
           java.util.Calendar expirationDate,
           java.lang.String opportunityKey,
           java.lang.Long adGroupId,
           java.lang.Long campaignId,
           java.lang.Double competition,
           java.lang.Integer matchType,
           java.lang.Long monthlySearches,
           java.lang.Double suggestedBid,
           java.lang.String suggestedKeyword) {
        super(
            expirationDate,
            opportunityKey);
        this.adGroupId = adGroupId;
        this.campaignId = campaignId;
        this.competition = competition;
        this.matchType = matchType;
        this.monthlySearches = monthlySearches;
        this.suggestedBid = suggestedBid;
        this.suggestedKeyword = suggestedKeyword;
    }


    /**
     * Gets the adGroupId value for this KeywordOpportunity.
     * 
     * @return adGroupId
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this KeywordOpportunity.
     * 
     * @param adGroupId
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the campaignId value for this KeywordOpportunity.
     * 
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this KeywordOpportunity.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the competition value for this KeywordOpportunity.
     * 
     * @return competition
     */
    public java.lang.Double getCompetition() {
        return competition;
    }


    /**
     * Sets the competition value for this KeywordOpportunity.
     * 
     * @param competition
     */
    public void setCompetition(java.lang.Double competition) {
        this.competition = competition;
    }


    /**
     * Gets the matchType value for this KeywordOpportunity.
     * 
     * @return matchType
     */
    public java.lang.Integer getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this KeywordOpportunity.
     * 
     * @param matchType
     */
    public void setMatchType(java.lang.Integer matchType) {
        this.matchType = matchType;
    }


    /**
     * Gets the monthlySearches value for this KeywordOpportunity.
     * 
     * @return monthlySearches
     */
    public java.lang.Long getMonthlySearches() {
        return monthlySearches;
    }


    /**
     * Sets the monthlySearches value for this KeywordOpportunity.
     * 
     * @param monthlySearches
     */
    public void setMonthlySearches(java.lang.Long monthlySearches) {
        this.monthlySearches = monthlySearches;
    }


    /**
     * Gets the suggestedBid value for this KeywordOpportunity.
     * 
     * @return suggestedBid
     */
    public java.lang.Double getSuggestedBid() {
        return suggestedBid;
    }


    /**
     * Sets the suggestedBid value for this KeywordOpportunity.
     * 
     * @param suggestedBid
     */
    public void setSuggestedBid(java.lang.Double suggestedBid) {
        this.suggestedBid = suggestedBid;
    }


    /**
     * Gets the suggestedKeyword value for this KeywordOpportunity.
     * 
     * @return suggestedKeyword
     */
    public java.lang.String getSuggestedKeyword() {
        return suggestedKeyword;
    }


    /**
     * Sets the suggestedKeyword value for this KeywordOpportunity.
     * 
     * @param suggestedKeyword
     */
    public void setSuggestedKeyword(java.lang.String suggestedKeyword) {
        this.suggestedKeyword = suggestedKeyword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeywordOpportunity)) return false;
        KeywordOpportunity other = (KeywordOpportunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.competition==null && other.getCompetition()==null) || 
             (this.competition!=null &&
              this.competition.equals(other.getCompetition()))) &&
            ((this.matchType==null && other.getMatchType()==null) || 
             (this.matchType!=null &&
              this.matchType.equals(other.getMatchType()))) &&
            ((this.monthlySearches==null && other.getMonthlySearches()==null) || 
             (this.monthlySearches!=null &&
              this.monthlySearches.equals(other.getMonthlySearches()))) &&
            ((this.suggestedBid==null && other.getSuggestedBid()==null) || 
             (this.suggestedBid!=null &&
              this.suggestedBid.equals(other.getSuggestedBid()))) &&
            ((this.suggestedKeyword==null && other.getSuggestedKeyword()==null) || 
             (this.suggestedKeyword!=null &&
              this.suggestedKeyword.equals(other.getSuggestedKeyword())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCompetition() != null) {
            _hashCode += getCompetition().hashCode();
        }
        if (getMatchType() != null) {
            _hashCode += getMatchType().hashCode();
        }
        if (getMonthlySearches() != null) {
            _hashCode += getMonthlySearches().hashCode();
        }
        if (getSuggestedBid() != null) {
            _hashCode += getSuggestedBid().hashCode();
        }
        if (getSuggestedKeyword() != null) {
            _hashCode += getSuggestedKeyword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeywordOpportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "KeywordOpportunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "Competition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "MatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlySearches");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "MonthlySearches"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestedBid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "SuggestedBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestedKeyword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "SuggestedKeyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
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
          new  org.apache.axis.encoding.ser.BeanSerializer(
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
