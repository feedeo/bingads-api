/**
 * Keyword.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class Keyword implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Keyword.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Keyword"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Bid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BiddingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BiddingScheme"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DestinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "KeywordEditorialStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalAppUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FinalAppUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "AppUrl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "AppUrl"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalMobileUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FinalMobileUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FinalUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ForwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MatchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Param1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Param2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param3");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Param3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "KeywordStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TrackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlCustomParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UrlCustomParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CustomParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.Bid bid;
    private com.microsoft.bingads.v11.campaignmanagement.BiddingScheme biddingScheme;
    private java.lang.String destinationUrl;
    private com.microsoft.bingads.v11.campaignmanagement.KeywordEditorialStatus editorialStatus;
    private com.microsoft.bingads.v11.datacontracts.AppUrl[] finalAppUrls;
    private java.lang.String[] finalMobileUrls;
    private java.lang.String[] finalUrls;
    private com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
    private java.lang.Long id;
    private com.microsoft.bingads.v11.campaignmanagement.MatchType matchType;
    private java.lang.String param1;
    private java.lang.String param2;
    private java.lang.String param3;
    private com.microsoft.bingads.v11.campaignmanagement.KeywordStatus status;
    private java.lang.String text;
    private java.lang.String trackingUrlTemplate;
    private com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public Keyword() {
    }


    public Keyword(
            com.microsoft.bingads.v11.campaignmanagement.Bid bid,
            com.microsoft.bingads.v11.campaignmanagement.BiddingScheme biddingScheme,
            java.lang.String destinationUrl,
            com.microsoft.bingads.v11.campaignmanagement.KeywordEditorialStatus editorialStatus,
            com.microsoft.bingads.v11.datacontracts.AppUrl[] finalAppUrls,
            java.lang.String[] finalMobileUrls,
            java.lang.String[] finalUrls,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            com.microsoft.bingads.v11.campaignmanagement.MatchType matchType,
            java.lang.String param1,
            java.lang.String param2,
            java.lang.String param3,
            com.microsoft.bingads.v11.campaignmanagement.KeywordStatus status,
            java.lang.String text,
            java.lang.String trackingUrlTemplate,
            com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters) {
        this.bid = bid;
        this.biddingScheme = biddingScheme;
        this.destinationUrl = destinationUrl;
        this.editorialStatus = editorialStatus;
        this.finalAppUrls = finalAppUrls;
        this.finalMobileUrls = finalMobileUrls;
        this.finalUrls = finalUrls;
        this.forwardCompatibilityMap = forwardCompatibilityMap;
        this.id = id;
        this.matchType = matchType;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.status = status;
        this.text = text;
        this.trackingUrlTemplate = trackingUrlTemplate;
        this.urlCustomParameters = urlCustomParameters;
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
     * Gets the bid value for this Keyword.
     *
     * @return bid
     */
    public com.microsoft.bingads.v11.campaignmanagement.Bid getBid() {
        return bid;
    }

    /**
     * Sets the bid value for this Keyword.
     *
     * @param bid
     */
    public void setBid(com.microsoft.bingads.v11.campaignmanagement.Bid bid) {
        this.bid = bid;
    }

    /**
     * Gets the biddingScheme value for this Keyword.
     *
     * @return biddingScheme
     */
    public com.microsoft.bingads.v11.campaignmanagement.BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }

    /**
     * Sets the biddingScheme value for this Keyword.
     *
     * @param biddingScheme
     */
    public void setBiddingScheme(com.microsoft.bingads.v11.campaignmanagement.BiddingScheme biddingScheme) {
        this.biddingScheme = biddingScheme;
    }

    /**
     * Gets the destinationUrl value for this Keyword.
     *
     * @return destinationUrl
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the destinationUrl value for this Keyword.
     *
     * @param destinationUrl
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }

    /**
     * Gets the editorialStatus value for this Keyword.
     *
     * @return editorialStatus
     */
    public com.microsoft.bingads.v11.campaignmanagement.KeywordEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the editorialStatus value for this Keyword.
     *
     * @param editorialStatus
     */
    public void setEditorialStatus(com.microsoft.bingads.v11.campaignmanagement.KeywordEditorialStatus editorialStatus) {
        this.editorialStatus = editorialStatus;
    }

    /**
     * Gets the finalAppUrls value for this Keyword.
     *
     * @return finalAppUrls
     */
    public com.microsoft.bingads.v11.datacontracts.AppUrl[] getFinalAppUrls() {
        return finalAppUrls;
    }

    /**
     * Sets the finalAppUrls value for this Keyword.
     *
     * @param finalAppUrls
     */
    public void setFinalAppUrls(com.microsoft.bingads.v11.datacontracts.AppUrl[] finalAppUrls) {
        this.finalAppUrls = finalAppUrls;
    }

    /**
     * Gets the finalMobileUrls value for this Keyword.
     *
     * @return finalMobileUrls
     */
    public java.lang.String[] getFinalMobileUrls() {
        return finalMobileUrls;
    }

    /**
     * Sets the finalMobileUrls value for this Keyword.
     *
     * @param finalMobileUrls
     */
    public void setFinalMobileUrls(java.lang.String[] finalMobileUrls) {
        this.finalMobileUrls = finalMobileUrls;
    }

    /**
     * Gets the finalUrls value for this Keyword.
     *
     * @return finalUrls
     */
    public java.lang.String[] getFinalUrls() {
        return finalUrls;
    }

    /**
     * Sets the finalUrls value for this Keyword.
     *
     * @param finalUrls
     */
    public void setFinalUrls(java.lang.String[] finalUrls) {
        this.finalUrls = finalUrls;
    }

    /**
     * Gets the forwardCompatibilityMap value for this Keyword.
     *
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the forwardCompatibilityMap value for this Keyword.
     *
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    /**
     * Gets the id value for this Keyword.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this Keyword.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the matchType value for this Keyword.
     *
     * @return matchType
     */
    public com.microsoft.bingads.v11.campaignmanagement.MatchType getMatchType() {
        return matchType;
    }

    /**
     * Sets the matchType value for this Keyword.
     *
     * @param matchType
     */
    public void setMatchType(com.microsoft.bingads.v11.campaignmanagement.MatchType matchType) {
        this.matchType = matchType;
    }

    /**
     * Gets the param1 value for this Keyword.
     *
     * @return param1
     */
    public java.lang.String getParam1() {
        return param1;
    }

    /**
     * Sets the param1 value for this Keyword.
     *
     * @param param1
     */
    public void setParam1(java.lang.String param1) {
        this.param1 = param1;
    }

    /**
     * Gets the param2 value for this Keyword.
     *
     * @return param2
     */
    public java.lang.String getParam2() {
        return param2;
    }

    /**
     * Sets the param2 value for this Keyword.
     *
     * @param param2
     */
    public void setParam2(java.lang.String param2) {
        this.param2 = param2;
    }

    /**
     * Gets the param3 value for this Keyword.
     *
     * @return param3
     */
    public java.lang.String getParam3() {
        return param3;
    }

    /**
     * Sets the param3 value for this Keyword.
     *
     * @param param3
     */
    public void setParam3(java.lang.String param3) {
        this.param3 = param3;
    }

    /**
     * Gets the status value for this Keyword.
     *
     * @return status
     */
    public com.microsoft.bingads.v11.campaignmanagement.KeywordStatus getStatus() {
        return status;
    }

    /**
     * Sets the status value for this Keyword.
     *
     * @param status
     */
    public void setStatus(com.microsoft.bingads.v11.campaignmanagement.KeywordStatus status) {
        this.status = status;
    }

    /**
     * Gets the text value for this Keyword.
     *
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Sets the text value for this Keyword.
     *
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    /**
     * Gets the trackingUrlTemplate value for this Keyword.
     *
     * @return trackingUrlTemplate
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the trackingUrlTemplate value for this Keyword.
     *
     * @param trackingUrlTemplate
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }

    /**
     * Gets the urlCustomParameters value for this Keyword.
     *
     * @return urlCustomParameters
     */
    public com.microsoft.bingads.v11.datacontracts.CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the urlCustomParameters value for this Keyword.
     *
     * @param urlCustomParameters
     */
    public void setUrlCustomParameters(com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters) {
        this.urlCustomParameters = urlCustomParameters;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Keyword)) return false;
        Keyword other = (Keyword) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.bid == null && other.getBid() == null) ||
                        (this.bid != null &&
                                this.bid.equals(other.getBid()))) &&
                ((this.biddingScheme == null && other.getBiddingScheme() == null) ||
                        (this.biddingScheme != null &&
                                this.biddingScheme.equals(other.getBiddingScheme()))) &&
                ((this.destinationUrl == null && other.getDestinationUrl() == null) ||
                        (this.destinationUrl != null &&
                                this.destinationUrl.equals(other.getDestinationUrl()))) &&
                ((this.editorialStatus == null && other.getEditorialStatus() == null) ||
                        (this.editorialStatus != null &&
                                this.editorialStatus.equals(other.getEditorialStatus()))) &&
                ((this.finalAppUrls == null && other.getFinalAppUrls() == null) ||
                        (this.finalAppUrls != null &&
                                java.util.Arrays.equals(this.finalAppUrls, other.getFinalAppUrls()))) &&
                ((this.finalMobileUrls == null && other.getFinalMobileUrls() == null) ||
                        (this.finalMobileUrls != null &&
                                java.util.Arrays.equals(this.finalMobileUrls, other.getFinalMobileUrls()))) &&
                ((this.finalUrls == null && other.getFinalUrls() == null) ||
                        (this.finalUrls != null &&
                                java.util.Arrays.equals(this.finalUrls, other.getFinalUrls()))) &&
                ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                        (this.forwardCompatibilityMap != null &&
                                java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.matchType == null && other.getMatchType() == null) ||
                        (this.matchType != null &&
                                this.matchType.equals(other.getMatchType()))) &&
                ((this.param1 == null && other.getParam1() == null) ||
                        (this.param1 != null &&
                                this.param1.equals(other.getParam1()))) &&
                ((this.param2 == null && other.getParam2() == null) ||
                        (this.param2 != null &&
                                this.param2.equals(other.getParam2()))) &&
                ((this.param3 == null && other.getParam3() == null) ||
                        (this.param3 != null &&
                                this.param3.equals(other.getParam3()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.text == null && other.getText() == null) ||
                        (this.text != null &&
                                this.text.equals(other.getText()))) &&
                ((this.trackingUrlTemplate == null && other.getTrackingUrlTemplate() == null) ||
                        (this.trackingUrlTemplate != null &&
                                this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
                ((this.urlCustomParameters == null && other.getUrlCustomParameters() == null) ||
                        (this.urlCustomParameters != null &&
                                this.urlCustomParameters.equals(other.getUrlCustomParameters())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBid() != null) {
            _hashCode += getBid().hashCode();
        }
        if (getBiddingScheme() != null) {
            _hashCode += getBiddingScheme().hashCode();
        }
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getEditorialStatus() != null) {
            _hashCode += getEditorialStatus().hashCode();
        }
        if (getFinalAppUrls() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFinalAppUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalAppUrls(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalMobileUrls() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFinalMobileUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalMobileUrls(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalUrls() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFinalUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalUrls(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMatchType() != null) {
            _hashCode += getMatchType().hashCode();
        }
        if (getParam1() != null) {
            _hashCode += getParam1().hashCode();
        }
        if (getParam2() != null) {
            _hashCode += getParam2().hashCode();
        }
        if (getParam3() != null) {
            _hashCode += getParam3().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getUrlCustomParameters() != null) {
            _hashCode += getUrlCustomParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
