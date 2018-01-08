/**
 * LocationCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class LocationCriterion extends com.microsoft.bingads.v11.campaignmanagement.Criterion implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(LocationCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LocationCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enclosedLocationIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EnclosedLocationIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String displayName;
    private long[] enclosedLocationIds;
    private java.lang.Long locationId;
    private java.lang.String locationType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public LocationCriterion() {
    }


    public LocationCriterion(
            java.lang.String type,
            java.lang.String displayName,
            long[] enclosedLocationIds,
            java.lang.Long locationId,
            java.lang.String locationType) {
        super(
                type);
        this.displayName = displayName;
        this.enclosedLocationIds = enclosedLocationIds;
        this.locationId = locationId;
        this.locationType = locationType;
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
     * Gets the displayName value for this LocationCriterion.
     *
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the displayName value for this LocationCriterion.
     *
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }

    /**
     * Gets the enclosedLocationIds value for this LocationCriterion.
     *
     * @return enclosedLocationIds
     */
    public long[] getEnclosedLocationIds() {
        return enclosedLocationIds;
    }

    /**
     * Sets the enclosedLocationIds value for this LocationCriterion.
     *
     * @param enclosedLocationIds
     */
    public void setEnclosedLocationIds(long[] enclosedLocationIds) {
        this.enclosedLocationIds = enclosedLocationIds;
    }

    /**
     * Gets the locationId value for this LocationCriterion.
     *
     * @return locationId
     */
    public java.lang.Long getLocationId() {
        return locationId;
    }

    /**
     * Sets the locationId value for this LocationCriterion.
     *
     * @param locationId
     */
    public void setLocationId(java.lang.Long locationId) {
        this.locationId = locationId;
    }

    /**
     * Gets the locationType value for this LocationCriterion.
     *
     * @return locationType
     */
    public java.lang.String getLocationType() {
        return locationType;
    }

    /**
     * Sets the locationType value for this LocationCriterion.
     *
     * @param locationType
     */
    public void setLocationType(java.lang.String locationType) {
        this.locationType = locationType;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationCriterion)) return false;
        LocationCriterion other = (LocationCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.displayName == null && other.getDisplayName() == null) ||
                        (this.displayName != null &&
                                this.displayName.equals(other.getDisplayName()))) &&
                ((this.enclosedLocationIds == null && other.getEnclosedLocationIds() == null) ||
                        (this.enclosedLocationIds != null &&
                                java.util.Arrays.equals(this.enclosedLocationIds, other.getEnclosedLocationIds()))) &&
                ((this.locationId == null && other.getLocationId() == null) ||
                        (this.locationId != null &&
                                this.locationId.equals(other.getLocationId()))) &&
                ((this.locationType == null && other.getLocationType() == null) ||
                        (this.locationType != null &&
                                this.locationType.equals(other.getLocationType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getEnclosedLocationIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getEnclosedLocationIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnclosedLocationIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        if (getLocationType() != null) {
            _hashCode += getLocationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
