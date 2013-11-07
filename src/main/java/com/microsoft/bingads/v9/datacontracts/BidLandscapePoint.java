/**
 * BidLandscapePoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class BidLandscapePoint  implements java.io.Serializable {
    private java.lang.Double bid;

    private java.lang.Double clicks;

    private java.lang.Long impressions;

    private java.lang.Long MLImpressions;

    private com.microsoft.bingads.v9.datacontracts.Currency currency;

    private java.lang.Double cost;

    private java.lang.Integer pointType;

    private java.lang.Double marginalCPC;

    public BidLandscapePoint() {
    }

    public BidLandscapePoint(
           java.lang.Double bid,
           java.lang.Double clicks,
           java.lang.Long impressions,
           java.lang.Long MLImpressions,
           com.microsoft.bingads.v9.datacontracts.Currency currency,
           java.lang.Double cost,
           java.lang.Integer pointType,
           java.lang.Double marginalCPC) {
           this.bid = bid;
           this.clicks = clicks;
           this.impressions = impressions;
           this.MLImpressions = MLImpressions;
           this.currency = currency;
           this.cost = cost;
           this.pointType = pointType;
           this.marginalCPC = marginalCPC;
    }


    /**
     * Gets the bid value for this BidLandscapePoint.
     * 
     * @return bid
     */
    public java.lang.Double getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this BidLandscapePoint.
     * 
     * @param bid
     */
    public void setBid(java.lang.Double bid) {
        this.bid = bid;
    }


    /**
     * Gets the clicks value for this BidLandscapePoint.
     * 
     * @return clicks
     */
    public java.lang.Double getClicks() {
        return clicks;
    }


    /**
     * Sets the clicks value for this BidLandscapePoint.
     * 
     * @param clicks
     */
    public void setClicks(java.lang.Double clicks) {
        this.clicks = clicks;
    }


    /**
     * Gets the impressions value for this BidLandscapePoint.
     * 
     * @return impressions
     */
    public java.lang.Long getImpressions() {
        return impressions;
    }


    /**
     * Sets the impressions value for this BidLandscapePoint.
     * 
     * @param impressions
     */
    public void setImpressions(java.lang.Long impressions) {
        this.impressions = impressions;
    }


    /**
     * Gets the MLImpressions value for this BidLandscapePoint.
     * 
     * @return MLImpressions
     */
    public java.lang.Long getMLImpressions() {
        return MLImpressions;
    }


    /**
     * Sets the MLImpressions value for this BidLandscapePoint.
     * 
     * @param MLImpressions
     */
    public void setMLImpressions(java.lang.Long MLImpressions) {
        this.MLImpressions = MLImpressions;
    }


    /**
     * Gets the currency value for this BidLandscapePoint.
     * 
     * @return currency
     */
    public com.microsoft.bingads.v9.datacontracts.Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BidLandscapePoint.
     * 
     * @param currency
     */
    public void setCurrency(com.microsoft.bingads.v9.datacontracts.Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the cost value for this BidLandscapePoint.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this BidLandscapePoint.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the pointType value for this BidLandscapePoint.
     * 
     * @return pointType
     */
    public java.lang.Integer getPointType() {
        return pointType;
    }


    /**
     * Sets the pointType value for this BidLandscapePoint.
     * 
     * @param pointType
     */
    public void setPointType(java.lang.Integer pointType) {
        this.pointType = pointType;
    }


    /**
     * Gets the marginalCPC value for this BidLandscapePoint.
     * 
     * @return marginalCPC
     */
    public java.lang.Double getMarginalCPC() {
        return marginalCPC;
    }


    /**
     * Sets the marginalCPC value for this BidLandscapePoint.
     * 
     * @param marginalCPC
     */
    public void setMarginalCPC(java.lang.Double marginalCPC) {
        this.marginalCPC = marginalCPC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BidLandscapePoint)) return false;
        BidLandscapePoint other = (BidLandscapePoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bid==null && other.getBid()==null) || 
             (this.bid!=null &&
              this.bid.equals(other.getBid()))) &&
            ((this.clicks==null && other.getClicks()==null) || 
             (this.clicks!=null &&
              this.clicks.equals(other.getClicks()))) &&
            ((this.impressions==null && other.getImpressions()==null) || 
             (this.impressions!=null &&
              this.impressions.equals(other.getImpressions()))) &&
            ((this.MLImpressions==null && other.getMLImpressions()==null) || 
             (this.MLImpressions!=null &&
              this.MLImpressions.equals(other.getMLImpressions()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.pointType==null && other.getPointType()==null) || 
             (this.pointType!=null &&
              this.pointType.equals(other.getPointType()))) &&
            ((this.marginalCPC==null && other.getMarginalCPC()==null) || 
             (this.marginalCPC!=null &&
              this.marginalCPC.equals(other.getMarginalCPC())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBid() != null) {
            _hashCode += getBid().hashCode();
        }
        if (getClicks() != null) {
            _hashCode += getClicks().hashCode();
        }
        if (getImpressions() != null) {
            _hashCode += getImpressions().hashCode();
        }
        if (getMLImpressions() != null) {
            _hashCode += getMLImpressions().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getPointType() != null) {
            _hashCode += getPointType().hashCode();
        }
        if (getMarginalCPC() != null) {
            _hashCode += getMarginalCPC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BidLandscapePoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "BidLandscapePoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clicks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Clicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Impressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MLImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "MLImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Currency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "Cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "PointType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginalCPC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "MarginalCPC"));
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
