/**
 * BroadMatchSearchQueryKPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class BroadMatchSearchQueryKPI  implements java.io.Serializable {
    private java.lang.Double averageCTR;

    private java.lang.Double clicks;

    private java.lang.Long impressions;

    private java.lang.Long SRPV;

    private java.lang.String searchQuery;

    public BroadMatchSearchQueryKPI() {
    }

    public BroadMatchSearchQueryKPI(
           java.lang.Double averageCTR,
           java.lang.Double clicks,
           java.lang.Long impressions,
           java.lang.Long SRPV,
           java.lang.String searchQuery) {
           this.averageCTR = averageCTR;
           this.clicks = clicks;
           this.impressions = impressions;
           this.SRPV = SRPV;
           this.searchQuery = searchQuery;
    }


    /**
     * Gets the averageCTR value for this BroadMatchSearchQueryKPI.
     * 
     * @return averageCTR
     */
    public java.lang.Double getAverageCTR() {
        return averageCTR;
    }


    /**
     * Sets the averageCTR value for this BroadMatchSearchQueryKPI.
     * 
     * @param averageCTR
     */
    public void setAverageCTR(java.lang.Double averageCTR) {
        this.averageCTR = averageCTR;
    }


    /**
     * Gets the clicks value for this BroadMatchSearchQueryKPI.
     * 
     * @return clicks
     */
    public java.lang.Double getClicks() {
        return clicks;
    }


    /**
     * Sets the clicks value for this BroadMatchSearchQueryKPI.
     * 
     * @param clicks
     */
    public void setClicks(java.lang.Double clicks) {
        this.clicks = clicks;
    }


    /**
     * Gets the impressions value for this BroadMatchSearchQueryKPI.
     * 
     * @return impressions
     */
    public java.lang.Long getImpressions() {
        return impressions;
    }


    /**
     * Sets the impressions value for this BroadMatchSearchQueryKPI.
     * 
     * @param impressions
     */
    public void setImpressions(java.lang.Long impressions) {
        this.impressions = impressions;
    }


    /**
     * Gets the SRPV value for this BroadMatchSearchQueryKPI.
     * 
     * @return SRPV
     */
    public java.lang.Long getSRPV() {
        return SRPV;
    }


    /**
     * Sets the SRPV value for this BroadMatchSearchQueryKPI.
     * 
     * @param SRPV
     */
    public void setSRPV(java.lang.Long SRPV) {
        this.SRPV = SRPV;
    }


    /**
     * Gets the searchQuery value for this BroadMatchSearchQueryKPI.
     * 
     * @return searchQuery
     */
    public java.lang.String getSearchQuery() {
        return searchQuery;
    }


    /**
     * Sets the searchQuery value for this BroadMatchSearchQueryKPI.
     * 
     * @param searchQuery
     */
    public void setSearchQuery(java.lang.String searchQuery) {
        this.searchQuery = searchQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BroadMatchSearchQueryKPI)) return false;
        BroadMatchSearchQueryKPI other = (BroadMatchSearchQueryKPI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.averageCTR==null && other.getAverageCTR()==null) || 
             (this.averageCTR!=null &&
              this.averageCTR.equals(other.getAverageCTR()))) &&
            ((this.clicks==null && other.getClicks()==null) || 
             (this.clicks!=null &&
              this.clicks.equals(other.getClicks()))) &&
            ((this.impressions==null && other.getImpressions()==null) || 
             (this.impressions!=null &&
              this.impressions.equals(other.getImpressions()))) &&
            ((this.SRPV==null && other.getSRPV()==null) || 
             (this.SRPV!=null &&
              this.SRPV.equals(other.getSRPV()))) &&
            ((this.searchQuery==null && other.getSearchQuery()==null) || 
             (this.searchQuery!=null &&
              this.searchQuery.equals(other.getSearchQuery())));
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
        if (getAverageCTR() != null) {
            _hashCode += getAverageCTR().hashCode();
        }
        if (getClicks() != null) {
            _hashCode += getClicks().hashCode();
        }
        if (getImpressions() != null) {
            _hashCode += getImpressions().hashCode();
        }
        if (getSRPV() != null) {
            _hashCode += getSRPV().hashCode();
        }
        if (getSearchQuery() != null) {
            _hashCode += getSearchQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BroadMatchSearchQueryKPI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQueryKPI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCTR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AverageCTR"));
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
        elemField.setFieldName("impressions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "Impressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SRPV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "SRPV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "SearchQuery"));
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
