/**
 * Campaign.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class Campaign implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Campaign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Campaign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BiddingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BiddingScheme"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BudgetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BudgetLimitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DailyBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeBidAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "NativeBidAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TimeZone"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Setting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Setting"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BudgetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Languages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.BiddingScheme biddingScheme;
    private com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType budgetType;
    private java.lang.Double dailyBudget;
    private java.lang.String description;
    private com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
    private java.lang.Long id;
    private java.lang.String name;
    private java.lang.Integer nativeBidAdjustment;
    private com.microsoft.bingads.v11.campaignmanagement.CampaignStatus status;
    private java.lang.String timeZone;
    private java.lang.String trackingUrlTemplate;
    private com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters;
    private java.lang.String[] campaignType;
    private com.microsoft.bingads.v11.campaignmanagement.Setting[] settings;
    private java.lang.Long budgetId;
    private java.lang.String[] languages;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public Campaign() {
    }


    public Campaign(
            com.microsoft.bingads.v11.campaignmanagement.BiddingScheme biddingScheme,
            com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType budgetType,
            java.lang.Double dailyBudget,
            java.lang.String description,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            java.lang.String name,
            java.lang.Integer nativeBidAdjustment,
            com.microsoft.bingads.v11.campaignmanagement.CampaignStatus status,
            java.lang.String timeZone,
            java.lang.String trackingUrlTemplate,
            com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters,
            java.lang.String[] campaignType,
            com.microsoft.bingads.v11.campaignmanagement.Setting[] settings,
            java.lang.Long budgetId,
            java.lang.String[] languages) {
        this.biddingScheme = biddingScheme;
        this.budgetType = budgetType;
        this.dailyBudget = dailyBudget;
        this.description = description;
        this.forwardCompatibilityMap = forwardCompatibilityMap;
        this.id = id;
        this.name = name;
        this.nativeBidAdjustment = nativeBidAdjustment;
        this.status = status;
        this.timeZone = timeZone;
        this.trackingUrlTemplate = trackingUrlTemplate;
        this.urlCustomParameters = urlCustomParameters;
        this.campaignType = campaignType;
        this.settings = settings;
        this.budgetId = budgetId;
        this.languages = languages;
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
     * Gets the biddingScheme value for this Campaign.
     *
     * @return biddingScheme
     */
    public com.microsoft.bingads.v11.campaignmanagement.BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }

    /**
     * Sets the biddingScheme value for this Campaign.
     *
     * @param biddingScheme
     */
    public void setBiddingScheme(com.microsoft.bingads.v11.campaignmanagement.BiddingScheme biddingScheme) {
        this.biddingScheme = biddingScheme;
    }

    /**
     * Gets the budgetType value for this Campaign.
     *
     * @return budgetType
     */
    public com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType getBudgetType() {
        return budgetType;
    }

    /**
     * Sets the budgetType value for this Campaign.
     *
     * @param budgetType
     */
    public void setBudgetType(com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType budgetType) {
        this.budgetType = budgetType;
    }

    /**
     * Gets the dailyBudget value for this Campaign.
     *
     * @return dailyBudget
     */
    public java.lang.Double getDailyBudget() {
        return dailyBudget;
    }

    /**
     * Sets the dailyBudget value for this Campaign.
     *
     * @param dailyBudget
     */
    public void setDailyBudget(java.lang.Double dailyBudget) {
        this.dailyBudget = dailyBudget;
    }

    /**
     * Gets the description value for this Campaign.
     *
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the description value for this Campaign.
     *
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Gets the forwardCompatibilityMap value for this Campaign.
     *
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the forwardCompatibilityMap value for this Campaign.
     *
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    /**
     * Gets the id value for this Campaign.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this Campaign.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the name value for this Campaign.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this Campaign.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Gets the nativeBidAdjustment value for this Campaign.
     *
     * @return nativeBidAdjustment
     */
    public java.lang.Integer getNativeBidAdjustment() {
        return nativeBidAdjustment;
    }

    /**
     * Sets the nativeBidAdjustment value for this Campaign.
     *
     * @param nativeBidAdjustment
     */
    public void setNativeBidAdjustment(java.lang.Integer nativeBidAdjustment) {
        this.nativeBidAdjustment = nativeBidAdjustment;
    }

    /**
     * Gets the status value for this Campaign.
     *
     * @return status
     */
    public com.microsoft.bingads.v11.campaignmanagement.CampaignStatus getStatus() {
        return status;
    }

    /**
     * Sets the status value for this Campaign.
     *
     * @param status
     */
    public void setStatus(com.microsoft.bingads.v11.campaignmanagement.CampaignStatus status) {
        this.status = status;
    }

    /**
     * Gets the timeZone value for this Campaign.
     *
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the timeZone value for this Campaign.
     *
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * Gets the trackingUrlTemplate value for this Campaign.
     *
     * @return trackingUrlTemplate
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the trackingUrlTemplate value for this Campaign.
     *
     * @param trackingUrlTemplate
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }

    /**
     * Gets the urlCustomParameters value for this Campaign.
     *
     * @return urlCustomParameters
     */
    public com.microsoft.bingads.v11.datacontracts.CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the urlCustomParameters value for this Campaign.
     *
     * @param urlCustomParameters
     */
    public void setUrlCustomParameters(com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters) {
        this.urlCustomParameters = urlCustomParameters;
    }

    /**
     * Gets the campaignType value for this Campaign.
     *
     * @return campaignType
     */
    public java.lang.String[] getCampaignType() {
        return campaignType;
    }

    /**
     * Sets the campaignType value for this Campaign.
     *
     * @param campaignType
     */
    public void setCampaignType(java.lang.String[] campaignType) {
        this.campaignType = campaignType;
    }

    /**
     * Gets the settings value for this Campaign.
     *
     * @return settings
     */
    public com.microsoft.bingads.v11.campaignmanagement.Setting[] getSettings() {
        return settings;
    }

    /**
     * Sets the settings value for this Campaign.
     *
     * @param settings
     */
    public void setSettings(com.microsoft.bingads.v11.campaignmanagement.Setting[] settings) {
        this.settings = settings;
    }

    /**
     * Gets the budgetId value for this Campaign.
     *
     * @return budgetId
     */
    public java.lang.Long getBudgetId() {
        return budgetId;
    }

    /**
     * Sets the budgetId value for this Campaign.
     *
     * @param budgetId
     */
    public void setBudgetId(java.lang.Long budgetId) {
        this.budgetId = budgetId;
    }

    /**
     * Gets the languages value for this Campaign.
     *
     * @return languages
     */
    public java.lang.String[] getLanguages() {
        return languages;
    }

    /**
     * Sets the languages value for this Campaign.
     *
     * @param languages
     */
    public void setLanguages(java.lang.String[] languages) {
        this.languages = languages;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Campaign)) return false;
        Campaign other = (Campaign) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.biddingScheme == null && other.getBiddingScheme() == null) ||
                        (this.biddingScheme != null &&
                                this.biddingScheme.equals(other.getBiddingScheme()))) &&
                ((this.budgetType == null && other.getBudgetType() == null) ||
                        (this.budgetType != null &&
                                this.budgetType.equals(other.getBudgetType()))) &&
                ((this.dailyBudget == null && other.getDailyBudget() == null) ||
                        (this.dailyBudget != null &&
                                this.dailyBudget.equals(other.getDailyBudget()))) &&
                ((this.description == null && other.getDescription() == null) ||
                        (this.description != null &&
                                this.description.equals(other.getDescription()))) &&
                ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                        (this.forwardCompatibilityMap != null &&
                                java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.nativeBidAdjustment == null && other.getNativeBidAdjustment() == null) ||
                        (this.nativeBidAdjustment != null &&
                                this.nativeBidAdjustment.equals(other.getNativeBidAdjustment()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.timeZone == null && other.getTimeZone() == null) ||
                        (this.timeZone != null &&
                                this.timeZone.equals(other.getTimeZone()))) &&
                ((this.trackingUrlTemplate == null && other.getTrackingUrlTemplate() == null) ||
                        (this.trackingUrlTemplate != null &&
                                this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
                ((this.urlCustomParameters == null && other.getUrlCustomParameters() == null) ||
                        (this.urlCustomParameters != null &&
                                this.urlCustomParameters.equals(other.getUrlCustomParameters()))) &&
                ((this.campaignType == null && other.getCampaignType() == null) ||
                        (this.campaignType != null &&
                                java.util.Arrays.equals(this.campaignType, other.getCampaignType()))) &&
                ((this.settings == null && other.getSettings() == null) ||
                        (this.settings != null &&
                                java.util.Arrays.equals(this.settings, other.getSettings()))) &&
                ((this.budgetId == null && other.getBudgetId() == null) ||
                        (this.budgetId != null &&
                                this.budgetId.equals(other.getBudgetId()))) &&
                ((this.languages == null && other.getLanguages() == null) ||
                        (this.languages != null &&
                                java.util.Arrays.equals(this.languages, other.getLanguages())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBiddingScheme() != null) {
            _hashCode += getBiddingScheme().hashCode();
        }
        if (getBudgetType() != null) {
            _hashCode += getBudgetType().hashCode();
        }
        if (getDailyBudget() != null) {
            _hashCode += getDailyBudget().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNativeBidAdjustment() != null) {
            _hashCode += getNativeBidAdjustment().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getUrlCustomParameters() != null) {
            _hashCode += getUrlCustomParameters().hashCode();
        }
        if (getCampaignType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCampaignType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignType(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSettings() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSettings(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBudgetId() != null) {
            _hashCode += getBudgetId().hashCode();
        }
        if (getLanguages() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getLanguages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguages(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
