/**
 * BroadMatchOpportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class BroadMatchOpportunity  extends com.microsoft.bingads.v9.optimizer.entities.Opportunity  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.String accountName;

    private java.lang.Long adGroupId;

    private java.lang.String adGroupName;

    private java.lang.Double averageCPC;

    private java.lang.Double averageCTR;

    private java.lang.Double CPCAdvantage;

    private java.lang.Long campaignId;

    private java.lang.String campaignName;

    private java.lang.Double clickShare;

    private java.lang.Double clicks;

    private java.lang.Double impressionShare;

    private java.lang.Long impressions;

    private java.lang.String keyword;

    private java.lang.Double mainLineImpressionShare;

    private java.lang.Long mainLineImpressions;

    private java.lang.Long referenceKeywordId;

    private java.lang.Double suggestedBid;

    public BroadMatchOpportunity() {
    }

    public BroadMatchOpportunity(
           java.util.Calendar expirationDate,
           java.lang.String opportunityKey,
           java.lang.Long accountId,
           java.lang.String accountName,
           java.lang.Long adGroupId,
           java.lang.String adGroupName,
           java.lang.Double averageCPC,
           java.lang.Double averageCTR,
           java.lang.Double CPCAdvantage,
           java.lang.Long campaignId,
           java.lang.String campaignName,
           java.lang.Double clickShare,
           java.lang.Double clicks,
           java.lang.Double impressionShare,
           java.lang.Long impressions,
           java.lang.String keyword,
           java.lang.Double mainLineImpressionShare,
           java.lang.Long mainLineImpressions,
           java.lang.Long referenceKeywordId,
           java.lang.Double suggestedBid) {
        super(
            expirationDate,
            opportunityKey);
        this.accountId = accountId;
        this.accountName = accountName;
        this.adGroupId = adGroupId;
        this.adGroupName = adGroupName;
        this.averageCPC = averageCPC;
        this.averageCTR = averageCTR;
        this.CPCAdvantage = CPCAdvantage;
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.clickShare = clickShare;
        this.clicks = clicks;
        this.impressionShare = impressionShare;
        this.impressions = impressions;
        this.keyword = keyword;
        this.mainLineImpressionShare = mainLineImpressionShare;
        this.mainLineImpressions = mainLineImpressions;
        this.referenceKeywordId = referenceKeywordId;
        this.suggestedBid = suggestedBid;
    }


    /**
     * Gets the accountId value for this BroadMatchOpportunity.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this BroadMatchOpportunity.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountName value for this BroadMatchOpportunity.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this BroadMatchOpportunity.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the adGroupId value for this BroadMatchOpportunity.
     * 
     * @return adGroupId
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this BroadMatchOpportunity.
     * 
     * @param adGroupId
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the adGroupName value for this BroadMatchOpportunity.
     * 
     * @return adGroupName
     */
    public java.lang.String getAdGroupName() {
        return adGroupName;
    }


    /**
     * Sets the adGroupName value for this BroadMatchOpportunity.
     * 
     * @param adGroupName
     */
    public void setAdGroupName(java.lang.String adGroupName) {
        this.adGroupName = adGroupName;
    }


    /**
     * Gets the averageCPC value for this BroadMatchOpportunity.
     * 
     * @return averageCPC
     */
    public java.lang.Double getAverageCPC() {
        return averageCPC;
    }


    /**
     * Sets the averageCPC value for this BroadMatchOpportunity.
     * 
     * @param averageCPC
     */
    public void setAverageCPC(java.lang.Double averageCPC) {
        this.averageCPC = averageCPC;
    }


    /**
     * Gets the averageCTR value for this BroadMatchOpportunity.
     * 
     * @return averageCTR
     */
    public java.lang.Double getAverageCTR() {
        return averageCTR;
    }


    /**
     * Sets the averageCTR value for this BroadMatchOpportunity.
     * 
     * @param averageCTR
     */
    public void setAverageCTR(java.lang.Double averageCTR) {
        this.averageCTR = averageCTR;
    }


    /**
     * Gets the CPCAdvantage value for this BroadMatchOpportunity.
     * 
     * @return CPCAdvantage
     */
    public java.lang.Double getCPCAdvantage() {
        return CPCAdvantage;
    }


    /**
     * Sets the CPCAdvantage value for this BroadMatchOpportunity.
     * 
     * @param CPCAdvantage
     */
    public void setCPCAdvantage(java.lang.Double CPCAdvantage) {
        this.CPCAdvantage = CPCAdvantage;
    }


    /**
     * Gets the campaignId value for this BroadMatchOpportunity.
     * 
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this BroadMatchOpportunity.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the campaignName value for this BroadMatchOpportunity.
     * 
     * @return campaignName
     */
    public java.lang.String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this BroadMatchOpportunity.
     * 
     * @param campaignName
     */
    public void setCampaignName(java.lang.String campaignName) {
        this.campaignName = campaignName;
    }


    /**
     * Gets the clickShare value for this BroadMatchOpportunity.
     * 
     * @return clickShare
     */
    public java.lang.Double getClickShare() {
        return clickShare;
    }


    /**
     * Sets the clickShare value for this BroadMatchOpportunity.
     * 
     * @param clickShare
     */
    public void setClickShare(java.lang.Double clickShare) {
        this.clickShare = clickShare;
    }


    /**
     * Gets the clicks value for this BroadMatchOpportunity.
     * 
     * @return clicks
     */
    public java.lang.Double getClicks() {
        return clicks;
    }


    /**
     * Sets the clicks value for this BroadMatchOpportunity.
     * 
     * @param clicks
     */
    public void setClicks(java.lang.Double clicks) {
        this.clicks = clicks;
    }


    /**
     * Gets the impressionShare value for this BroadMatchOpportunity.
     * 
     * @return impressionShare
     */
    public java.lang.Double getImpressionShare() {
        return impressionShare;
    }


    /**
     * Sets the impressionShare value for this BroadMatchOpportunity.
     * 
     * @param impressionShare
     */
    public void setImpressionShare(java.lang.Double impressionShare) {
        this.impressionShare = impressionShare;
    }


    /**
     * Gets the impressions value for this BroadMatchOpportunity.
     * 
     * @return impressions
     */
    public java.lang.Long getImpressions() {
        return impressions;
    }


    /**
     * Sets the impressions value for this BroadMatchOpportunity.
     * 
     * @param impressions
     */
    public void setImpressions(java.lang.Long impressions) {
        this.impressions = impressions;
    }


    /**
     * Gets the keyword value for this BroadMatchOpportunity.
     * 
     * @return keyword
     */
    public java.lang.String getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this BroadMatchOpportunity.
     * 
     * @param keyword
     */
    public void setKeyword(java.lang.String keyword) {
        this.keyword = keyword;
    }


    /**
     * Gets the mainLineImpressionShare value for this BroadMatchOpportunity.
     * 
     * @return mainLineImpressionShare
     */
    public java.lang.Double getMainLineImpressionShare() {
        return mainLineImpressionShare;
    }


    /**
     * Sets the mainLineImpressionShare value for this BroadMatchOpportunity.
     * 
     * @param mainLineImpressionShare
     */
    public void setMainLineImpressionShare(java.lang.Double mainLineImpressionShare) {
        this.mainLineImpressionShare = mainLineImpressionShare;
    }


    /**
     * Gets the mainLineImpressions value for this BroadMatchOpportunity.
     * 
     * @return mainLineImpressions
     */
    public java.lang.Long getMainLineImpressions() {
        return mainLineImpressions;
    }


    /**
     * Sets the mainLineImpressions value for this BroadMatchOpportunity.
     * 
     * @param mainLineImpressions
     */
    public void setMainLineImpressions(java.lang.Long mainLineImpressions) {
        this.mainLineImpressions = mainLineImpressions;
    }


    /**
     * Gets the referenceKeywordId value for this BroadMatchOpportunity.
     * 
     * @return referenceKeywordId
     */
    public java.lang.Long getReferenceKeywordId() {
        return referenceKeywordId;
    }


    /**
     * Sets the referenceKeywordId value for this BroadMatchOpportunity.
     * 
     * @param referenceKeywordId
     */
    public void setReferenceKeywordId(java.lang.Long referenceKeywordId) {
        this.referenceKeywordId = referenceKeywordId;
    }


    /**
     * Gets the suggestedBid value for this BroadMatchOpportunity.
     * 
     * @return suggestedBid
     */
    public java.lang.Double getSuggestedBid() {
        return suggestedBid;
    }


    /**
     * Sets the suggestedBid value for this BroadMatchOpportunity.
     * 
     * @param suggestedBid
     */
    public void setSuggestedBid(java.lang.Double suggestedBid) {
        this.suggestedBid = suggestedBid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BroadMatchOpportunity)) return false;
        BroadMatchOpportunity other = (BroadMatchOpportunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.adGroupName==null && other.getAdGroupName()==null) || 
             (this.adGroupName!=null &&
              this.adGroupName.equals(other.getAdGroupName()))) &&
            ((this.averageCPC==null && other.getAverageCPC()==null) || 
             (this.averageCPC!=null &&
              this.averageCPC.equals(other.getAverageCPC()))) &&
            ((this.averageCTR==null && other.getAverageCTR()==null) || 
             (this.averageCTR!=null &&
              this.averageCTR.equals(other.getAverageCTR()))) &&
            ((this.CPCAdvantage==null && other.getCPCAdvantage()==null) || 
             (this.CPCAdvantage!=null &&
              this.CPCAdvantage.equals(other.getCPCAdvantage()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.campaignName==null && other.getCampaignName()==null) || 
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName()))) &&
            ((this.clickShare==null && other.getClickShare()==null) || 
             (this.clickShare!=null &&
              this.clickShare.equals(other.getClickShare()))) &&
            ((this.clicks==null && other.getClicks()==null) || 
             (this.clicks!=null &&
              this.clicks.equals(other.getClicks()))) &&
            ((this.impressionShare==null && other.getImpressionShare()==null) || 
             (this.impressionShare!=null &&
              this.impressionShare.equals(other.getImpressionShare()))) &&
            ((this.impressions==null && other.getImpressions()==null) || 
             (this.impressions!=null &&
              this.impressions.equals(other.getImpressions()))) &&
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword()))) &&
            ((this.mainLineImpressionShare==null && other.getMainLineImpressionShare()==null) || 
             (this.mainLineImpressionShare!=null &&
              this.mainLineImpressionShare.equals(other.getMainLineImpressionShare()))) &&
            ((this.mainLineImpressions==null && other.getMainLineImpressions()==null) || 
             (this.mainLineImpressions!=null &&
              this.mainLineImpressions.equals(other.getMainLineImpressions()))) &&
            ((this.referenceKeywordId==null && other.getReferenceKeywordId()==null) || 
             (this.referenceKeywordId!=null &&
              this.referenceKeywordId.equals(other.getReferenceKeywordId()))) &&
            ((this.suggestedBid==null && other.getSuggestedBid()==null) || 
             (this.suggestedBid!=null &&
              this.suggestedBid.equals(other.getSuggestedBid())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getAdGroupName() != null) {
            _hashCode += getAdGroupName().hashCode();
        }
        if (getAverageCPC() != null) {
            _hashCode += getAverageCPC().hashCode();
        }
        if (getAverageCTR() != null) {
            _hashCode += getAverageCTR().hashCode();
        }
        if (getCPCAdvantage() != null) {
            _hashCode += getCPCAdvantage().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        if (getClickShare() != null) {
            _hashCode += getClickShare().hashCode();
        }
        if (getClicks() != null) {
            _hashCode += getClicks().hashCode();
        }
        if (getImpressionShare() != null) {
            _hashCode += getImpressionShare().hashCode();
        }
        if (getImpressions() != null) {
            _hashCode += getImpressions().hashCode();
        }
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        if (getMainLineImpressionShare() != null) {
            _hashCode += getMainLineImpressionShare().hashCode();
        }
        if (getMainLineImpressions() != null) {
            _hashCode += getMainLineImpressions().hashCode();
        }
        if (getReferenceKeywordId() != null) {
            _hashCode += getReferenceKeywordId().hashCode();
        }
        if (getSuggestedBid() != null) {
            _hashCode += getSuggestedBid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BroadMatchOpportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchOpportunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AdGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCPC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AverageCPC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCTR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AverageCTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPCAdvantage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CPCAdvantage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CampaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickShare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ClickShare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clicks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "Clicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressionShare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ImpressionShare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "Impressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "Keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainLineImpressionShare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "MainLineImpressionShare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainLineImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "MainLineImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceKeywordId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ReferenceKeywordId"));
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
