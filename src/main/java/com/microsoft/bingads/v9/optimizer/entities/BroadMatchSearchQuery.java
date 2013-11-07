/**
 * BroadMatchSearchQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class BroadMatchSearchQuery  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.String accountName;

    private java.lang.String keyword;

    private com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI[] searchQueryKPIs;

    public BroadMatchSearchQuery() {
    }

    public BroadMatchSearchQuery(
           java.lang.Long accountId,
           java.lang.String accountName,
           java.lang.String keyword,
           com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI[] searchQueryKPIs) {
           this.accountId = accountId;
           this.accountName = accountName;
           this.keyword = keyword;
           this.searchQueryKPIs = searchQueryKPIs;
    }


    /**
     * Gets the accountId value for this BroadMatchSearchQuery.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this BroadMatchSearchQuery.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountName value for this BroadMatchSearchQuery.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this BroadMatchSearchQuery.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the keyword value for this BroadMatchSearchQuery.
     * 
     * @return keyword
     */
    public java.lang.String getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this BroadMatchSearchQuery.
     * 
     * @param keyword
     */
    public void setKeyword(java.lang.String keyword) {
        this.keyword = keyword;
    }


    /**
     * Gets the searchQueryKPIs value for this BroadMatchSearchQuery.
     * 
     * @return searchQueryKPIs
     */
    public com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI[] getSearchQueryKPIs() {
        return searchQueryKPIs;
    }


    /**
     * Sets the searchQueryKPIs value for this BroadMatchSearchQuery.
     * 
     * @param searchQueryKPIs
     */
    public void setSearchQueryKPIs(com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQueryKPI[] searchQueryKPIs) {
        this.searchQueryKPIs = searchQueryKPIs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BroadMatchSearchQuery)) return false;
        BroadMatchSearchQuery other = (BroadMatchSearchQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword()))) &&
            ((this.searchQueryKPIs==null && other.getSearchQueryKPIs()==null) || 
             (this.searchQueryKPIs!=null &&
              java.util.Arrays.equals(this.searchQueryKPIs, other.getSearchQueryKPIs())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        if (getSearchQueryKPIs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchQueryKPIs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchQueryKPIs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BroadMatchSearchQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQuery"));
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
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "Keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchQueryKPIs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "SearchQueryKPIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQueryKPI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQueryKPI"));
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
