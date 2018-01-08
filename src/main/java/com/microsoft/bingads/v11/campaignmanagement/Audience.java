/**
 * Audience.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class Audience implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Audience.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Audience"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("membershipDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MembershipDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("searchSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SearchSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AudienceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String description;
    private com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
    private java.lang.Long id;
    private java.lang.Integer membershipDuration;
    private java.lang.String name;
    private java.lang.Long parentId;
    private com.microsoft.bingads.v11.campaignmanagement.EntityScope scope;
    private java.lang.Integer searchSize;
    private java.lang.String[] type;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public Audience() {
    }


    public Audience(
            java.lang.String description,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            java.lang.Integer membershipDuration,
            java.lang.String name,
            java.lang.Long parentId,
            com.microsoft.bingads.v11.campaignmanagement.EntityScope scope,
            java.lang.Integer searchSize,
            java.lang.String[] type) {
        this.description = description;
        this.forwardCompatibilityMap = forwardCompatibilityMap;
        this.id = id;
        this.membershipDuration = membershipDuration;
        this.name = name;
        this.parentId = parentId;
        this.scope = scope;
        this.searchSize = searchSize;
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
     * Gets the description value for this Audience.
     *
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the description value for this Audience.
     *
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Gets the forwardCompatibilityMap value for this Audience.
     *
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the forwardCompatibilityMap value for this Audience.
     *
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    /**
     * Gets the id value for this Audience.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this Audience.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the membershipDuration value for this Audience.
     *
     * @return membershipDuration
     */
    public java.lang.Integer getMembershipDuration() {
        return membershipDuration;
    }

    /**
     * Sets the membershipDuration value for this Audience.
     *
     * @param membershipDuration
     */
    public void setMembershipDuration(java.lang.Integer membershipDuration) {
        this.membershipDuration = membershipDuration;
    }

    /**
     * Gets the name value for this Audience.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this Audience.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Gets the parentId value for this Audience.
     *
     * @return parentId
     */
    public java.lang.Long getParentId() {
        return parentId;
    }

    /**
     * Sets the parentId value for this Audience.
     *
     * @param parentId
     */
    public void setParentId(java.lang.Long parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets the scope value for this Audience.
     *
     * @return scope
     */
    public com.microsoft.bingads.v11.campaignmanagement.EntityScope getScope() {
        return scope;
    }

    /**
     * Sets the scope value for this Audience.
     *
     * @param scope
     */
    public void setScope(com.microsoft.bingads.v11.campaignmanagement.EntityScope scope) {
        this.scope = scope;
    }

    /**
     * Gets the searchSize value for this Audience.
     *
     * @return searchSize
     */
    public java.lang.Integer getSearchSize() {
        return searchSize;
    }

    /**
     * Sets the searchSize value for this Audience.
     *
     * @param searchSize
     */
    public void setSearchSize(java.lang.Integer searchSize) {
        this.searchSize = searchSize;
    }

    /**
     * Gets the type value for this Audience.
     *
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }

    /**
     * Sets the type value for this Audience.
     *
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Audience)) return false;
        Audience other = (Audience) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.description == null && other.getDescription() == null) ||
                        (this.description != null &&
                                this.description.equals(other.getDescription()))) &&
                ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                        (this.forwardCompatibilityMap != null &&
                                java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.membershipDuration == null && other.getMembershipDuration() == null) ||
                        (this.membershipDuration != null &&
                                this.membershipDuration.equals(other.getMembershipDuration()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.parentId == null && other.getParentId() == null) ||
                        (this.parentId != null &&
                                this.parentId.equals(other.getParentId()))) &&
                ((this.scope == null && other.getScope() == null) ||
                        (this.scope != null &&
                                this.scope.equals(other.getScope()))) &&
                ((this.searchSize == null && other.getSearchSize() == null) ||
                        (this.searchSize != null &&
                                this.searchSize.equals(other.getSearchSize()))) &&
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
        if (getMembershipDuration() != null) {
            _hashCode += getMembershipDuration().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getSearchSize() != null) {
            _hashCode += getSearchSize().hashCode();
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
