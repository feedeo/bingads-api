/**
 * AdGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class AdGroup  implements java.io.Serializable {
    private java.lang.String[] adDistribution;

    private com.microsoft.bingads.v9.campaignmanagement.AdRotation adRotation;

    private com.microsoft.bingads.v9.campaignmanagement.BiddingModel biddingModel;

    private com.microsoft.bingads.v9.campaignmanagement.Bid broadMatchBid;

    private com.microsoft.bingads.v9.campaignmanagement.Bid contentMatchBid;

    private com.microsoft.bingads.v9.campaignmanagement.Date endDate;

    private com.microsoft.bingads.v9.campaignmanagement.Bid exactMatchBid;

    private com.microsoft.bingads.v9.schemas.generic.ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;

    private java.lang.Long id;

    private java.lang.String language;

    private java.lang.String name;

    private com.microsoft.bingads.v9.campaignmanagement.Network network;

    private com.microsoft.bingads.v9.campaignmanagement.Bid phraseMatchBid;

    private com.microsoft.bingads.v9.campaignmanagement.PricingModel pricingModel;

    private com.microsoft.bingads.v9.campaignmanagement.Date startDate;

    private com.microsoft.bingads.v9.campaignmanagement.AdGroupStatus status;

    public AdGroup() {
    }

    public AdGroup(
           java.lang.String[] adDistribution,
           com.microsoft.bingads.v9.campaignmanagement.AdRotation adRotation,
           com.microsoft.bingads.v9.campaignmanagement.BiddingModel biddingModel,
           com.microsoft.bingads.v9.campaignmanagement.Bid broadMatchBid,
           com.microsoft.bingads.v9.campaignmanagement.Bid contentMatchBid,
           com.microsoft.bingads.v9.campaignmanagement.Date endDate,
           com.microsoft.bingads.v9.campaignmanagement.Bid exactMatchBid,
           com.microsoft.bingads.v9.schemas.generic.ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap,
           java.lang.Long id,
           java.lang.String language,
           java.lang.String name,
           com.microsoft.bingads.v9.campaignmanagement.Network network,
           com.microsoft.bingads.v9.campaignmanagement.Bid phraseMatchBid,
           com.microsoft.bingads.v9.campaignmanagement.PricingModel pricingModel,
           com.microsoft.bingads.v9.campaignmanagement.Date startDate,
           com.microsoft.bingads.v9.campaignmanagement.AdGroupStatus status) {
           this.adDistribution = adDistribution;
           this.adRotation = adRotation;
           this.biddingModel = biddingModel;
           this.broadMatchBid = broadMatchBid;
           this.contentMatchBid = contentMatchBid;
           this.endDate = endDate;
           this.exactMatchBid = exactMatchBid;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.id = id;
           this.language = language;
           this.name = name;
           this.network = network;
           this.phraseMatchBid = phraseMatchBid;
           this.pricingModel = pricingModel;
           this.startDate = startDate;
           this.status = status;
    }


    /**
     * Gets the adDistribution value for this AdGroup.
     * 
     * @return adDistribution
     */
    public java.lang.String[] getAdDistribution() {
        return adDistribution;
    }


    /**
     * Sets the adDistribution value for this AdGroup.
     * 
     * @param adDistribution
     */
    public void setAdDistribution(java.lang.String[] adDistribution) {
        this.adDistribution = adDistribution;
    }


    /**
     * Gets the adRotation value for this AdGroup.
     * 
     * @return adRotation
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdRotation getAdRotation() {
        return adRotation;
    }


    /**
     * Sets the adRotation value for this AdGroup.
     * 
     * @param adRotation
     */
    public void setAdRotation(com.microsoft.bingads.v9.campaignmanagement.AdRotation adRotation) {
        this.adRotation = adRotation;
    }


    /**
     * Gets the biddingModel value for this AdGroup.
     * 
     * @return biddingModel
     */
    public com.microsoft.bingads.v9.campaignmanagement.BiddingModel getBiddingModel() {
        return biddingModel;
    }


    /**
     * Sets the biddingModel value for this AdGroup.
     * 
     * @param biddingModel
     */
    public void setBiddingModel(com.microsoft.bingads.v9.campaignmanagement.BiddingModel biddingModel) {
        this.biddingModel = biddingModel;
    }


    /**
     * Gets the broadMatchBid value for this AdGroup.
     * 
     * @return broadMatchBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.Bid getBroadMatchBid() {
        return broadMatchBid;
    }


    /**
     * Sets the broadMatchBid value for this AdGroup.
     * 
     * @param broadMatchBid
     */
    public void setBroadMatchBid(com.microsoft.bingads.v9.campaignmanagement.Bid broadMatchBid) {
        this.broadMatchBid = broadMatchBid;
    }


    /**
     * Gets the contentMatchBid value for this AdGroup.
     * 
     * @return contentMatchBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.Bid getContentMatchBid() {
        return contentMatchBid;
    }


    /**
     * Sets the contentMatchBid value for this AdGroup.
     * 
     * @param contentMatchBid
     */
    public void setContentMatchBid(com.microsoft.bingads.v9.campaignmanagement.Bid contentMatchBid) {
        this.contentMatchBid = contentMatchBid;
    }


    /**
     * Gets the endDate value for this AdGroup.
     * 
     * @return endDate
     */
    public com.microsoft.bingads.v9.campaignmanagement.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AdGroup.
     * 
     * @param endDate
     */
    public void setEndDate(com.microsoft.bingads.v9.campaignmanagement.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the exactMatchBid value for this AdGroup.
     * 
     * @return exactMatchBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.Bid getExactMatchBid() {
        return exactMatchBid;
    }


    /**
     * Sets the exactMatchBid value for this AdGroup.
     * 
     * @param exactMatchBid
     */
    public void setExactMatchBid(com.microsoft.bingads.v9.campaignmanagement.Bid exactMatchBid) {
        this.exactMatchBid = exactMatchBid;
    }


    /**
     * Gets the forwardCompatibilityMap value for this AdGroup.
     * 
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v9.schemas.generic.ArrayOfKeyValuePairOfstringstring getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    /**
     * Sets the forwardCompatibilityMap value for this AdGroup.
     * 
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v9.schemas.generic.ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }


    /**
     * Gets the id value for this AdGroup.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this AdGroup.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the language value for this AdGroup.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this AdGroup.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the name value for this AdGroup.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdGroup.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the network value for this AdGroup.
     * 
     * @return network
     */
    public com.microsoft.bingads.v9.campaignmanagement.Network getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this AdGroup.
     * 
     * @param network
     */
    public void setNetwork(com.microsoft.bingads.v9.campaignmanagement.Network network) {
        this.network = network;
    }


    /**
     * Gets the phraseMatchBid value for this AdGroup.
     * 
     * @return phraseMatchBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.Bid getPhraseMatchBid() {
        return phraseMatchBid;
    }


    /**
     * Sets the phraseMatchBid value for this AdGroup.
     * 
     * @param phraseMatchBid
     */
    public void setPhraseMatchBid(com.microsoft.bingads.v9.campaignmanagement.Bid phraseMatchBid) {
        this.phraseMatchBid = phraseMatchBid;
    }


    /**
     * Gets the pricingModel value for this AdGroup.
     * 
     * @return pricingModel
     */
    public com.microsoft.bingads.v9.campaignmanagement.PricingModel getPricingModel() {
        return pricingModel;
    }


    /**
     * Sets the pricingModel value for this AdGroup.
     * 
     * @param pricingModel
     */
    public void setPricingModel(com.microsoft.bingads.v9.campaignmanagement.PricingModel pricingModel) {
        this.pricingModel = pricingModel;
    }


    /**
     * Gets the startDate value for this AdGroup.
     * 
     * @return startDate
     */
    public com.microsoft.bingads.v9.campaignmanagement.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AdGroup.
     * 
     * @param startDate
     */
    public void setStartDate(com.microsoft.bingads.v9.campaignmanagement.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this AdGroup.
     * 
     * @return status
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdGroupStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdGroup.
     * 
     * @param status
     */
    public void setStatus(com.microsoft.bingads.v9.campaignmanagement.AdGroupStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroup)) return false;
        AdGroup other = (AdGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adDistribution==null && other.getAdDistribution()==null) || 
             (this.adDistribution!=null &&
              java.util.Arrays.equals(this.adDistribution, other.getAdDistribution()))) &&
            ((this.adRotation==null && other.getAdRotation()==null) || 
             (this.adRotation!=null &&
              this.adRotation.equals(other.getAdRotation()))) &&
            ((this.biddingModel==null && other.getBiddingModel()==null) || 
             (this.biddingModel!=null &&
              this.biddingModel.equals(other.getBiddingModel()))) &&
            ((this.broadMatchBid==null && other.getBroadMatchBid()==null) || 
             (this.broadMatchBid!=null &&
              this.broadMatchBid.equals(other.getBroadMatchBid()))) &&
            ((this.contentMatchBid==null && other.getContentMatchBid()==null) || 
             (this.contentMatchBid!=null &&
              this.contentMatchBid.equals(other.getContentMatchBid()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.exactMatchBid==null && other.getExactMatchBid()==null) || 
             (this.exactMatchBid!=null &&
              this.exactMatchBid.equals(other.getExactMatchBid()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) || 
             (this.forwardCompatibilityMap!=null &&
              this.forwardCompatibilityMap.equals(other.getForwardCompatibilityMap()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.phraseMatchBid==null && other.getPhraseMatchBid()==null) || 
             (this.phraseMatchBid!=null &&
              this.phraseMatchBid.equals(other.getPhraseMatchBid()))) &&
            ((this.pricingModel==null && other.getPricingModel()==null) || 
             (this.pricingModel!=null &&
              this.pricingModel.equals(other.getPricingModel()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getAdDistribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdDistribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdDistribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdRotation() != null) {
            _hashCode += getAdRotation().hashCode();
        }
        if (getBiddingModel() != null) {
            _hashCode += getBiddingModel().hashCode();
        }
        if (getBroadMatchBid() != null) {
            _hashCode += getBroadMatchBid().hashCode();
        }
        if (getContentMatchBid() != null) {
            _hashCode += getContentMatchBid().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getExactMatchBid() != null) {
            _hashCode += getExactMatchBid().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            _hashCode += getForwardCompatibilityMap().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getPhraseMatchBid() != null) {
            _hashCode += getPhraseMatchBid().hashCode();
        }
        if (getPricingModel() != null) {
            _hashCode += getPricingModel().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adDistribution");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdDistribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdDistribution"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adRotation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdRotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdRotation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingModel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BiddingModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BiddingModel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadMatchBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BroadMatchBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Bid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentMatchBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ContentMatchBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Bid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exactMatchBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ExactMatchBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Bid"));
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
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Network"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Network"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phraseMatchBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PhraseMatchBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Bid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingModel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PricingModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PricingModel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupStatus"));
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
