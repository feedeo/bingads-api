/**
 * GetEstimatedBidByKeywordsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetEstimatedBidByKeywordsResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid[] keywordEstimatedBids;

    private com.microsoft.bingads.v9.datacontracts.AdGroupEstimatedBid adGroupEstimatedBid;

    public GetEstimatedBidByKeywordsResponse() {
    }

    public GetEstimatedBidByKeywordsResponse(
           com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid[] keywordEstimatedBids,
           com.microsoft.bingads.v9.datacontracts.AdGroupEstimatedBid adGroupEstimatedBid) {
           this.keywordEstimatedBids = keywordEstimatedBids;
           this.adGroupEstimatedBid = adGroupEstimatedBid;
    }


    /**
     * Gets the keywordEstimatedBids value for this GetEstimatedBidByKeywordsResponse.
     * 
     * @return keywordEstimatedBids
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid[] getKeywordEstimatedBids() {
        return keywordEstimatedBids;
    }


    /**
     * Sets the keywordEstimatedBids value for this GetEstimatedBidByKeywordsResponse.
     * 
     * @param keywordEstimatedBids
     */
    public void setKeywordEstimatedBids(com.microsoft.bingads.v9.datacontracts.KeywordEstimatedBid[] keywordEstimatedBids) {
        this.keywordEstimatedBids = keywordEstimatedBids;
    }


    /**
     * Gets the adGroupEstimatedBid value for this GetEstimatedBidByKeywordsResponse.
     * 
     * @return adGroupEstimatedBid
     */
    public com.microsoft.bingads.v9.datacontracts.AdGroupEstimatedBid getAdGroupEstimatedBid() {
        return adGroupEstimatedBid;
    }


    /**
     * Sets the adGroupEstimatedBid value for this GetEstimatedBidByKeywordsResponse.
     * 
     * @param adGroupEstimatedBid
     */
    public void setAdGroupEstimatedBid(com.microsoft.bingads.v9.datacontracts.AdGroupEstimatedBid adGroupEstimatedBid) {
        this.adGroupEstimatedBid = adGroupEstimatedBid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEstimatedBidByKeywordsResponse)) return false;
        GetEstimatedBidByKeywordsResponse other = (GetEstimatedBidByKeywordsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordEstimatedBids==null && other.getKeywordEstimatedBids()==null) || 
             (this.keywordEstimatedBids!=null &&
              java.util.Arrays.equals(this.keywordEstimatedBids, other.getKeywordEstimatedBids()))) &&
            ((this.adGroupEstimatedBid==null && other.getAdGroupEstimatedBid()==null) || 
             (this.adGroupEstimatedBid!=null &&
              this.adGroupEstimatedBid.equals(other.getAdGroupEstimatedBid())));
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
        if (getKeywordEstimatedBids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordEstimatedBids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordEstimatedBids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdGroupEstimatedBid() != null) {
            _hashCode += getAdGroupEstimatedBid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEstimatedBidByKeywordsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetEstimatedBidByKeywordsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordEstimatedBids");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "KeywordEstimatedBids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordEstimatedBid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordEstimatedBid"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupEstimatedBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "AdGroupEstimatedBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "AdGroupEstimatedBid"));
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
