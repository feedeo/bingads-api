/**
 * AdGroupEstimatedBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class AdGroupEstimatedBid  implements java.io.Serializable {
    private java.lang.Double minClicksPerWeek;

    private java.lang.Double maxClicksPerWeek;

    private java.math.BigDecimal averageCPC;

    private java.lang.Long minImpressionsPerWeek;

    private java.lang.Long maxImpressionsPerWeek;

    private java.lang.Double CTR;

    private java.math.BigDecimal minTotalCostPerWeek;

    private java.math.BigDecimal maxTotalCostPerWeek;

    private com.microsoft.bingads.v9.datacontracts.Currency currency;

    private java.lang.Double estimatedAdGroupBid;

    public AdGroupEstimatedBid() {
    }

    public AdGroupEstimatedBid(
           java.lang.Double minClicksPerWeek,
           java.lang.Double maxClicksPerWeek,
           java.math.BigDecimal averageCPC,
           java.lang.Long minImpressionsPerWeek,
           java.lang.Long maxImpressionsPerWeek,
           java.lang.Double CTR,
           java.math.BigDecimal minTotalCostPerWeek,
           java.math.BigDecimal maxTotalCostPerWeek,
           com.microsoft.bingads.v9.datacontracts.Currency currency,
           java.lang.Double estimatedAdGroupBid) {
           this.minClicksPerWeek = minClicksPerWeek;
           this.maxClicksPerWeek = maxClicksPerWeek;
           this.averageCPC = averageCPC;
           this.minImpressionsPerWeek = minImpressionsPerWeek;
           this.maxImpressionsPerWeek = maxImpressionsPerWeek;
           this.CTR = CTR;
           this.minTotalCostPerWeek = minTotalCostPerWeek;
           this.maxTotalCostPerWeek = maxTotalCostPerWeek;
           this.currency = currency;
           this.estimatedAdGroupBid = estimatedAdGroupBid;
    }


    /**
     * Gets the minClicksPerWeek value for this AdGroupEstimatedBid.
     * 
     * @return minClicksPerWeek
     */
    public java.lang.Double getMinClicksPerWeek() {
        return minClicksPerWeek;
    }


    /**
     * Sets the minClicksPerWeek value for this AdGroupEstimatedBid.
     * 
     * @param minClicksPerWeek
     */
    public void setMinClicksPerWeek(java.lang.Double minClicksPerWeek) {
        this.minClicksPerWeek = minClicksPerWeek;
    }


    /**
     * Gets the maxClicksPerWeek value for this AdGroupEstimatedBid.
     * 
     * @return maxClicksPerWeek
     */
    public java.lang.Double getMaxClicksPerWeek() {
        return maxClicksPerWeek;
    }


    /**
     * Sets the maxClicksPerWeek value for this AdGroupEstimatedBid.
     * 
     * @param maxClicksPerWeek
     */
    public void setMaxClicksPerWeek(java.lang.Double maxClicksPerWeek) {
        this.maxClicksPerWeek = maxClicksPerWeek;
    }


    /**
     * Gets the averageCPC value for this AdGroupEstimatedBid.
     * 
     * @return averageCPC
     */
    public java.math.BigDecimal getAverageCPC() {
        return averageCPC;
    }


    /**
     * Sets the averageCPC value for this AdGroupEstimatedBid.
     * 
     * @param averageCPC
     */
    public void setAverageCPC(java.math.BigDecimal averageCPC) {
        this.averageCPC = averageCPC;
    }


    /**
     * Gets the minImpressionsPerWeek value for this AdGroupEstimatedBid.
     * 
     * @return minImpressionsPerWeek
     */
    public java.lang.Long getMinImpressionsPerWeek() {
        return minImpressionsPerWeek;
    }


    /**
     * Sets the minImpressionsPerWeek value for this AdGroupEstimatedBid.
     * 
     * @param minImpressionsPerWeek
     */
    public void setMinImpressionsPerWeek(java.lang.Long minImpressionsPerWeek) {
        this.minImpressionsPerWeek = minImpressionsPerWeek;
    }


    /**
     * Gets the maxImpressionsPerWeek value for this AdGroupEstimatedBid.
     * 
     * @return maxImpressionsPerWeek
     */
    public java.lang.Long getMaxImpressionsPerWeek() {
        return maxImpressionsPerWeek;
    }


    /**
     * Sets the maxImpressionsPerWeek value for this AdGroupEstimatedBid.
     * 
     * @param maxImpressionsPerWeek
     */
    public void setMaxImpressionsPerWeek(java.lang.Long maxImpressionsPerWeek) {
        this.maxImpressionsPerWeek = maxImpressionsPerWeek;
    }


    /**
     * Gets the CTR value for this AdGroupEstimatedBid.
     * 
     * @return CTR
     */
    public java.lang.Double getCTR() {
        return CTR;
    }


    /**
     * Sets the CTR value for this AdGroupEstimatedBid.
     * 
     * @param CTR
     */
    public void setCTR(java.lang.Double CTR) {
        this.CTR = CTR;
    }


    /**
     * Gets the minTotalCostPerWeek value for this AdGroupEstimatedBid.
     * 
     * @return minTotalCostPerWeek
     */
    public java.math.BigDecimal getMinTotalCostPerWeek() {
        return minTotalCostPerWeek;
    }


    /**
     * Sets the minTotalCostPerWeek value for this AdGroupEstimatedBid.
     * 
     * @param minTotalCostPerWeek
     */
    public void setMinTotalCostPerWeek(java.math.BigDecimal minTotalCostPerWeek) {
        this.minTotalCostPerWeek = minTotalCostPerWeek;
    }


    /**
     * Gets the maxTotalCostPerWeek value for this AdGroupEstimatedBid.
     * 
     * @return maxTotalCostPerWeek
     */
    public java.math.BigDecimal getMaxTotalCostPerWeek() {
        return maxTotalCostPerWeek;
    }


    /**
     * Sets the maxTotalCostPerWeek value for this AdGroupEstimatedBid.
     * 
     * @param maxTotalCostPerWeek
     */
    public void setMaxTotalCostPerWeek(java.math.BigDecimal maxTotalCostPerWeek) {
        this.maxTotalCostPerWeek = maxTotalCostPerWeek;
    }


    /**
     * Gets the currency value for this AdGroupEstimatedBid.
     * 
     * @return currency
     */
    public com.microsoft.bingads.v9.datacontracts.Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AdGroupEstimatedBid.
     * 
     * @param currency
     */
    public void setCurrency(com.microsoft.bingads.v9.datacontracts.Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the estimatedAdGroupBid value for this AdGroupEstimatedBid.
     * 
     * @return estimatedAdGroupBid
     */
    public java.lang.Double getEstimatedAdGroupBid() {
        return estimatedAdGroupBid;
    }


    /**
     * Sets the estimatedAdGroupBid value for this AdGroupEstimatedBid.
     * 
     * @param estimatedAdGroupBid
     */
    public void setEstimatedAdGroupBid(java.lang.Double estimatedAdGroupBid) {
        this.estimatedAdGroupBid = estimatedAdGroupBid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupEstimatedBid)) return false;
        AdGroupEstimatedBid other = (AdGroupEstimatedBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minClicksPerWeek==null && other.getMinClicksPerWeek()==null) || 
             (this.minClicksPerWeek!=null &&
              this.minClicksPerWeek.equals(other.getMinClicksPerWeek()))) &&
            ((this.maxClicksPerWeek==null && other.getMaxClicksPerWeek()==null) || 
             (this.maxClicksPerWeek!=null &&
              this.maxClicksPerWeek.equals(other.getMaxClicksPerWeek()))) &&
            ((this.averageCPC==null && other.getAverageCPC()==null) || 
             (this.averageCPC!=null &&
              this.averageCPC.equals(other.getAverageCPC()))) &&
            ((this.minImpressionsPerWeek==null && other.getMinImpressionsPerWeek()==null) || 
             (this.minImpressionsPerWeek!=null &&
              this.minImpressionsPerWeek.equals(other.getMinImpressionsPerWeek()))) &&
            ((this.maxImpressionsPerWeek==null && other.getMaxImpressionsPerWeek()==null) || 
             (this.maxImpressionsPerWeek!=null &&
              this.maxImpressionsPerWeek.equals(other.getMaxImpressionsPerWeek()))) &&
            ((this.CTR==null && other.getCTR()==null) || 
             (this.CTR!=null &&
              this.CTR.equals(other.getCTR()))) &&
            ((this.minTotalCostPerWeek==null && other.getMinTotalCostPerWeek()==null) || 
             (this.minTotalCostPerWeek!=null &&
              this.minTotalCostPerWeek.equals(other.getMinTotalCostPerWeek()))) &&
            ((this.maxTotalCostPerWeek==null && other.getMaxTotalCostPerWeek()==null) || 
             (this.maxTotalCostPerWeek!=null &&
              this.maxTotalCostPerWeek.equals(other.getMaxTotalCostPerWeek()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.estimatedAdGroupBid==null && other.getEstimatedAdGroupBid()==null) || 
             (this.estimatedAdGroupBid!=null &&
              this.estimatedAdGroupBid.equals(other.getEstimatedAdGroupBid())));
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
        if (getMinClicksPerWeek() != null) {
            _hashCode += getMinClicksPerWeek().hashCode();
        }
        if (getMaxClicksPerWeek() != null) {
            _hashCode += getMaxClicksPerWeek().hashCode();
        }
        if (getAverageCPC() != null) {
            _hashCode += getAverageCPC().hashCode();
        }
        if (getMinImpressionsPerWeek() != null) {
            _hashCode += getMinImpressionsPerWeek().hashCode();
        }
        if (getMaxImpressionsPerWeek() != null) {
            _hashCode += getMaxImpressionsPerWeek().hashCode();
        }
        if (getCTR() != null) {
            _hashCode += getCTR().hashCode();
        }
        if (getMinTotalCostPerWeek() != null) {
            _hashCode += getMinTotalCostPerWeek().hashCode();
        }
        if (getMaxTotalCostPerWeek() != null) {
            _hashCode += getMaxTotalCostPerWeek().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getEstimatedAdGroupBid() != null) {
            _hashCode += getEstimatedAdGroupBid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupEstimatedBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdGroupEstimatedBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minClicksPerWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "MinClicksPerWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxClicksPerWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "MaxClicksPerWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCPC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AverageCPC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minImpressionsPerWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "MinImpressionsPerWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxImpressionsPerWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "MaxImpressionsPerWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "CTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minTotalCostPerWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "MinTotalCostPerWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTotalCostPerWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "MaxTotalCostPerWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("estimatedAdGroupBid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "EstimatedAdGroupBid"));
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
