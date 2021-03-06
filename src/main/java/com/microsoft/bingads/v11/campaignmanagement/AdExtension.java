/**
 * AdExtension.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class AdExtension implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AdExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DevicePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("scheduling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Scheduling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Schedule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdExtensionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long devicePreference;
    private com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
    private java.lang.Long id;
    private com.microsoft.bingads.v11.campaignmanagement.Schedule scheduling;
    private com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus status;
    private java.lang.String type;
    private java.lang.Integer version;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AdExtension() {
    }


    public AdExtension(
            java.lang.Long devicePreference,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            com.microsoft.bingads.v11.campaignmanagement.Schedule scheduling,
            com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus status,
            java.lang.String type,
            java.lang.Integer version) {
        this.devicePreference = devicePreference;
        this.forwardCompatibilityMap = forwardCompatibilityMap;
        this.id = id;
        this.scheduling = scheduling;
        this.status = status;
        this.type = type;
        this.version = version;
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
     * Gets the devicePreference value for this AdExtension.
     *
     * @return devicePreference
     */
    public java.lang.Long getDevicePreference() {
        return devicePreference;
    }

    /**
     * Sets the devicePreference value for this AdExtension.
     *
     * @param devicePreference
     */
    public void setDevicePreference(java.lang.Long devicePreference) {
        this.devicePreference = devicePreference;
    }

    /**
     * Gets the forwardCompatibilityMap value for this AdExtension.
     *
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the forwardCompatibilityMap value for this AdExtension.
     *
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    /**
     * Gets the id value for this AdExtension.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this AdExtension.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the scheduling value for this AdExtension.
     *
     * @return scheduling
     */
    public com.microsoft.bingads.v11.campaignmanagement.Schedule getScheduling() {
        return scheduling;
    }

    /**
     * Sets the scheduling value for this AdExtension.
     *
     * @param scheduling
     */
    public void setScheduling(com.microsoft.bingads.v11.campaignmanagement.Schedule scheduling) {
        this.scheduling = scheduling;
    }

    /**
     * Gets the status value for this AdExtension.
     *
     * @return status
     */
    public com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus getStatus() {
        return status;
    }

    /**
     * Sets the status value for this AdExtension.
     *
     * @param status
     */
    public void setStatus(com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus status) {
        this.status = status;
    }

    /**
     * Gets the type value for this AdExtension.
     *
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Sets the type value for this AdExtension.
     *
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    /**
     * Gets the version value for this AdExtension.
     *
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }

    /**
     * Sets the version value for this AdExtension.
     *
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtension)) return false;
        AdExtension other = (AdExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.devicePreference == null && other.getDevicePreference() == null) ||
                        (this.devicePreference != null &&
                                this.devicePreference.equals(other.getDevicePreference()))) &&
                ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                        (this.forwardCompatibilityMap != null &&
                                java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.scheduling == null && other.getScheduling() == null) ||
                        (this.scheduling != null &&
                                this.scheduling.equals(other.getScheduling()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.type == null && other.getType() == null) ||
                        (this.type != null &&
                                this.type.equals(other.getType()))) &&
                ((this.version == null && other.getVersion() == null) ||
                        (this.version != null &&
                                this.version.equals(other.getVersion())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
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
        if (getScheduling() != null) {
            _hashCode += getScheduling().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
