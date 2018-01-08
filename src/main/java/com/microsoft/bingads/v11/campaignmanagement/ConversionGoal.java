/**
 * ConversionGoal.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class ConversionGoal implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ConversionGoal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionWindowInMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionWindowInMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalCountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("revenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Revenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalRevenue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EntityScope"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TagId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TrackingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalTrackingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionGoalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Integer conversionWindowInMinutes;
    private com.microsoft.bingads.v11.campaignmanagement.ConversionGoalCountType countType;
    private java.lang.Long id;
    private java.lang.String name;
    private com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenue revenue;
    private com.microsoft.bingads.v11.campaignmanagement.EntityScope scope;
    private com.microsoft.bingads.v11.campaignmanagement.ConversionGoalStatus status;
    private java.lang.Long tagId;
    private com.microsoft.bingads.v11.campaignmanagement.ConversionGoalTrackingStatus trackingStatus;
    private java.lang.String[] type;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ConversionGoal() {
    }


    public ConversionGoal(
            java.lang.Integer conversionWindowInMinutes,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalCountType countType,
            java.lang.Long id,
            java.lang.String name,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenue revenue,
            com.microsoft.bingads.v11.campaignmanagement.EntityScope scope,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalStatus status,
            java.lang.Long tagId,
            com.microsoft.bingads.v11.campaignmanagement.ConversionGoalTrackingStatus trackingStatus,
            java.lang.String[] type) {
        this.conversionWindowInMinutes = conversionWindowInMinutes;
        this.countType = countType;
        this.id = id;
        this.name = name;
        this.revenue = revenue;
        this.scope = scope;
        this.status = status;
        this.tagId = tagId;
        this.trackingStatus = trackingStatus;
        this.type = type;
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
     * Gets the conversionWindowInMinutes value for this ConversionGoal.
     *
     * @return conversionWindowInMinutes
     */
    public java.lang.Integer getConversionWindowInMinutes() {
        return conversionWindowInMinutes;
    }

    /**
     * Sets the conversionWindowInMinutes value for this ConversionGoal.
     *
     * @param conversionWindowInMinutes
     */
    public void setConversionWindowInMinutes(java.lang.Integer conversionWindowInMinutes) {
        this.conversionWindowInMinutes = conversionWindowInMinutes;
    }

    /**
     * Gets the countType value for this ConversionGoal.
     *
     * @return countType
     */
    public com.microsoft.bingads.v11.campaignmanagement.ConversionGoalCountType getCountType() {
        return countType;
    }

    /**
     * Sets the countType value for this ConversionGoal.
     *
     * @param countType
     */
    public void setCountType(com.microsoft.bingads.v11.campaignmanagement.ConversionGoalCountType countType) {
        this.countType = countType;
    }

    /**
     * Gets the id value for this ConversionGoal.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this ConversionGoal.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the name value for this ConversionGoal.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this ConversionGoal.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Gets the revenue value for this ConversionGoal.
     *
     * @return revenue
     */
    public com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenue getRevenue() {
        return revenue;
    }

    /**
     * Sets the revenue value for this ConversionGoal.
     *
     * @param revenue
     */
    public void setRevenue(com.microsoft.bingads.v11.campaignmanagement.ConversionGoalRevenue revenue) {
        this.revenue = revenue;
    }

    /**
     * Gets the scope value for this ConversionGoal.
     *
     * @return scope
     */
    public com.microsoft.bingads.v11.campaignmanagement.EntityScope getScope() {
        return scope;
    }

    /**
     * Sets the scope value for this ConversionGoal.
     *
     * @param scope
     */
    public void setScope(com.microsoft.bingads.v11.campaignmanagement.EntityScope scope) {
        this.scope = scope;
    }

    /**
     * Gets the status value for this ConversionGoal.
     *
     * @return status
     */
    public com.microsoft.bingads.v11.campaignmanagement.ConversionGoalStatus getStatus() {
        return status;
    }

    /**
     * Sets the status value for this ConversionGoal.
     *
     * @param status
     */
    public void setStatus(com.microsoft.bingads.v11.campaignmanagement.ConversionGoalStatus status) {
        this.status = status;
    }

    /**
     * Gets the tagId value for this ConversionGoal.
     *
     * @return tagId
     */
    public java.lang.Long getTagId() {
        return tagId;
    }

    /**
     * Sets the tagId value for this ConversionGoal.
     *
     * @param tagId
     */
    public void setTagId(java.lang.Long tagId) {
        this.tagId = tagId;
    }

    /**
     * Gets the trackingStatus value for this ConversionGoal.
     *
     * @return trackingStatus
     */
    public com.microsoft.bingads.v11.campaignmanagement.ConversionGoalTrackingStatus getTrackingStatus() {
        return trackingStatus;
    }

    /**
     * Sets the trackingStatus value for this ConversionGoal.
     *
     * @param trackingStatus
     */
    public void setTrackingStatus(com.microsoft.bingads.v11.campaignmanagement.ConversionGoalTrackingStatus trackingStatus) {
        this.trackingStatus = trackingStatus;
    }

    /**
     * Gets the type value for this ConversionGoal.
     *
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }

    /**
     * Sets the type value for this ConversionGoal.
     *
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConversionGoal)) return false;
        ConversionGoal other = (ConversionGoal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.conversionWindowInMinutes == null && other.getConversionWindowInMinutes() == null) ||
                        (this.conversionWindowInMinutes != null &&
                                this.conversionWindowInMinutes.equals(other.getConversionWindowInMinutes()))) &&
                ((this.countType == null && other.getCountType() == null) ||
                        (this.countType != null &&
                                this.countType.equals(other.getCountType()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.revenue == null && other.getRevenue() == null) ||
                        (this.revenue != null &&
                                this.revenue.equals(other.getRevenue()))) &&
                ((this.scope == null && other.getScope() == null) ||
                        (this.scope != null &&
                                this.scope.equals(other.getScope()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.tagId == null && other.getTagId() == null) ||
                        (this.tagId != null &&
                                this.tagId.equals(other.getTagId()))) &&
                ((this.trackingStatus == null && other.getTrackingStatus() == null) ||
                        (this.trackingStatus != null &&
                                this.trackingStatus.equals(other.getTrackingStatus()))) &&
                ((this.type == null && other.getType() == null) ||
                        (this.type != null &&
                                java.util.Arrays.equals(this.type, other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getConversionWindowInMinutes() != null) {
            _hashCode += getConversionWindowInMinutes().hashCode();
        }
        if (getCountType() != null) {
            _hashCode += getCountType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRevenue() != null) {
            _hashCode += getRevenue().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTagId() != null) {
            _hashCode += getTagId().hashCode();
        }
        if (getTrackingStatus() != null) {
            _hashCode += getTrackingStatus().hashCode();
        }
        if (getType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
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
