/**
 * UetTag.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class UetTag implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UetTag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UetTag"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("trackingNoScript");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TrackingNoScript"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingScript");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TrackingScript"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TrackingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UetTagTrackingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String description;
    private java.lang.Long id;
    private java.lang.String name;
    private java.lang.String trackingNoScript;
    private java.lang.String trackingScript;
    private com.microsoft.bingads.v11.campaignmanagement.UetTagTrackingStatus trackingStatus;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UetTag() {
    }


    public UetTag(
            java.lang.String description,
            java.lang.Long id,
            java.lang.String name,
            java.lang.String trackingNoScript,
            java.lang.String trackingScript,
            com.microsoft.bingads.v11.campaignmanagement.UetTagTrackingStatus trackingStatus) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.trackingNoScript = trackingNoScript;
        this.trackingScript = trackingScript;
        this.trackingStatus = trackingStatus;
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
     * Gets the description value for this UetTag.
     *
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the description value for this UetTag.
     *
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Gets the id value for this UetTag.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this UetTag.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the name value for this UetTag.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this UetTag.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Gets the trackingNoScript value for this UetTag.
     *
     * @return trackingNoScript
     */
    public java.lang.String getTrackingNoScript() {
        return trackingNoScript;
    }

    /**
     * Sets the trackingNoScript value for this UetTag.
     *
     * @param trackingNoScript
     */
    public void setTrackingNoScript(java.lang.String trackingNoScript) {
        this.trackingNoScript = trackingNoScript;
    }

    /**
     * Gets the trackingScript value for this UetTag.
     *
     * @return trackingScript
     */
    public java.lang.String getTrackingScript() {
        return trackingScript;
    }

    /**
     * Sets the trackingScript value for this UetTag.
     *
     * @param trackingScript
     */
    public void setTrackingScript(java.lang.String trackingScript) {
        this.trackingScript = trackingScript;
    }

    /**
     * Gets the trackingStatus value for this UetTag.
     *
     * @return trackingStatus
     */
    public com.microsoft.bingads.v11.campaignmanagement.UetTagTrackingStatus getTrackingStatus() {
        return trackingStatus;
    }

    /**
     * Sets the trackingStatus value for this UetTag.
     *
     * @param trackingStatus
     */
    public void setTrackingStatus(com.microsoft.bingads.v11.campaignmanagement.UetTagTrackingStatus trackingStatus) {
        this.trackingStatus = trackingStatus;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UetTag)) return false;
        UetTag other = (UetTag) obj;
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
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.trackingNoScript == null && other.getTrackingNoScript() == null) ||
                        (this.trackingNoScript != null &&
                                this.trackingNoScript.equals(other.getTrackingNoScript()))) &&
                ((this.trackingScript == null && other.getTrackingScript() == null) ||
                        (this.trackingScript != null &&
                                this.trackingScript.equals(other.getTrackingScript()))) &&
                ((this.trackingStatus == null && other.getTrackingStatus() == null) ||
                        (this.trackingStatus != null &&
                                this.trackingStatus.equals(other.getTrackingStatus())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTrackingNoScript() != null) {
            _hashCode += getTrackingNoScript().hashCode();
        }
        if (getTrackingScript() != null) {
            _hashCode += getTrackingScript().hashCode();
        }
        if (getTrackingStatus() != null) {
            _hashCode += getTrackingStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
