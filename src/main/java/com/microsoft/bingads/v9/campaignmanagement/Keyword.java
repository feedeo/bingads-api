/**
 * Keyword.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class Keyword  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.Bid bid;

    private java.lang.String destinationUrl;

    private com.microsoft.bingads.v9.campaignmanagement.KeywordEditorialStatus editorialStatus;

    private com.microsoft.bingads.v9.schemas.generic.ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;

    private java.lang.Long id;

    private com.microsoft.bingads.v9.campaignmanagement.MatchType matchType;

    private java.lang.String param1;

    private java.lang.String param2;

    private java.lang.String param3;

    private com.microsoft.bingads.v9.campaignmanagement.KeywordStatus status;

    private java.lang.String text;

    public Keyword() {
    }

    public Keyword(
           com.microsoft.bingads.v9.campaignmanagement.Bid bid,
           java.lang.String destinationUrl,
           com.microsoft.bingads.v9.campaignmanagement.KeywordEditorialStatus editorialStatus,
           com.microsoft.bingads.v9.schemas.generic.ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap,
           java.lang.Long id,
           com.microsoft.bingads.v9.campaignmanagement.MatchType matchType,
           java.lang.String param1,
           java.lang.String param2,
           java.lang.String param3,
           com.microsoft.bingads.v9.campaignmanagement.KeywordStatus status,
           java.lang.String text) {
           this.bid = bid;
           this.destinationUrl = destinationUrl;
           this.editorialStatus = editorialStatus;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.id = id;
           this.matchType = matchType;
           this.param1 = param1;
           this.param2 = param2;
           this.param3 = param3;
           this.status = status;
           this.text = text;
    }


    /**
     * Gets the bid value for this Keyword.
     * 
     * @return bid
     */
    public com.microsoft.bingads.v9.campaignmanagement.Bid getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this Keyword.
     * 
     * @param bid
     */
    public void setBid(com.microsoft.bingads.v9.campaignmanagement.Bid bid) {
        this.bid = bid;
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
    public com.microsoft.bingads.v9.campaignmanagement.KeywordEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }


    /**
     * Sets the editorialStatus value for this Keyword.
     * 
     * @param editorialStatus
     */
    public void setEditorialStatus(com.microsoft.bingads.v9.campaignmanagement.KeywordEditorialStatus editorialStatus) {
        this.editorialStatus = editorialStatus;
    }


    /**
     * Gets the forwardCompatibilityMap value for this Keyword.
     * 
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v9.schemas.generic.ArrayOfKeyValuePairOfstringstring getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    /**
     * Sets the forwardCompatibilityMap value for this Keyword.
     * 
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v9.schemas.generic.ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap) {
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
    public com.microsoft.bingads.v9.campaignmanagement.MatchType getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this Keyword.
     * 
     * @param matchType
     */
    public void setMatchType(com.microsoft.bingads.v9.campaignmanagement.MatchType matchType) {
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
    public com.microsoft.bingads.v9.campaignmanagement.KeywordStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Keyword.
     * 
     * @param status
     */
    public void setStatus(com.microsoft.bingads.v9.campaignmanagement.KeywordStatus status) {
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

    private java.lang.Object __equalsCalc = null;
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
            ((this.bid==null && other.getBid()==null) || 
             (this.bid!=null &&
              this.bid.equals(other.getBid()))) &&
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.editorialStatus==null && other.getEditorialStatus()==null) || 
             (this.editorialStatus!=null &&
              this.editorialStatus.equals(other.getEditorialStatus()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) || 
             (this.forwardCompatibilityMap!=null &&
              this.forwardCompatibilityMap.equals(other.getForwardCompatibilityMap()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.matchType==null && other.getMatchType()==null) || 
             (this.matchType!=null &&
              this.matchType.equals(other.getMatchType()))) &&
            ((this.param1==null && other.getParam1()==null) || 
             (this.param1!=null &&
              this.param1.equals(other.getParam1()))) &&
            ((this.param2==null && other.getParam2()==null) || 
             (this.param2!=null &&
              this.param2.equals(other.getParam2()))) &&
            ((this.param3==null && other.getParam3()==null) || 
             (this.param3!=null &&
              this.param3.equals(other.getParam3()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText())));
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
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getEditorialStatus() != null) {
            _hashCode += getEditorialStatus().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            _hashCode += getForwardCompatibilityMap().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Keyword.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Keyword"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Bid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DestinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "KeywordEditorialStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ForwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "MatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "MatchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Param1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Param2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param3");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Param3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "KeywordStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Text"));
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
