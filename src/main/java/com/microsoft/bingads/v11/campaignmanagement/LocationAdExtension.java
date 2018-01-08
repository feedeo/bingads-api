/**
 * LocationAdExtension.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class LocationAdExtension extends com.microsoft.bingads.v11.campaignmanagement.AdExtension implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(LocationAdExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LocationAdExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoCodeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GeoCodeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BusinessGeoCodeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GeoPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "GeoPoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconMediaId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "IconMediaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageMediaId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ImageMediaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.Address address;
    private java.lang.String companyName;
    private com.microsoft.bingads.v11.campaignmanagement.BusinessGeoCodeStatus geoCodeStatus;
    private com.microsoft.bingads.v11.campaignmanagement.GeoPoint geoPoint;
    private java.lang.Long iconMediaId;
    private java.lang.Long imageMediaId;
    private java.lang.String phoneNumber;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public LocationAdExtension() {
    }


    public LocationAdExtension(
            java.lang.Long devicePreference,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            com.microsoft.bingads.v11.campaignmanagement.Schedule scheduling,
            com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus status,
            java.lang.String type,
            java.lang.Integer version,
            com.microsoft.bingads.v11.campaignmanagement.Address address,
            java.lang.String companyName,
            com.microsoft.bingads.v11.campaignmanagement.BusinessGeoCodeStatus geoCodeStatus,
            com.microsoft.bingads.v11.campaignmanagement.GeoPoint geoPoint,
            java.lang.Long iconMediaId,
            java.lang.Long imageMediaId,
            java.lang.String phoneNumber) {
        super(
                devicePreference,
                forwardCompatibilityMap,
                id,
                scheduling,
                status,
                type,
                version);
        this.address = address;
        this.companyName = companyName;
        this.geoCodeStatus = geoCodeStatus;
        this.geoPoint = geoPoint;
        this.iconMediaId = iconMediaId;
        this.imageMediaId = imageMediaId;
        this.phoneNumber = phoneNumber;
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
     * Gets the address value for this LocationAdExtension.
     *
     * @return address
     */
    public com.microsoft.bingads.v11.campaignmanagement.Address getAddress() {
        return address;
    }

    /**
     * Sets the address value for this LocationAdExtension.
     *
     * @param address
     */
    public void setAddress(com.microsoft.bingads.v11.campaignmanagement.Address address) {
        this.address = address;
    }

    /**
     * Gets the companyName value for this LocationAdExtension.
     *
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the companyName value for this LocationAdExtension.
     *
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }

    /**
     * Gets the geoCodeStatus value for this LocationAdExtension.
     *
     * @return geoCodeStatus
     */
    public com.microsoft.bingads.v11.campaignmanagement.BusinessGeoCodeStatus getGeoCodeStatus() {
        return geoCodeStatus;
    }

    /**
     * Sets the geoCodeStatus value for this LocationAdExtension.
     *
     * @param geoCodeStatus
     */
    public void setGeoCodeStatus(com.microsoft.bingads.v11.campaignmanagement.BusinessGeoCodeStatus geoCodeStatus) {
        this.geoCodeStatus = geoCodeStatus;
    }

    /**
     * Gets the geoPoint value for this LocationAdExtension.
     *
     * @return geoPoint
     */
    public com.microsoft.bingads.v11.campaignmanagement.GeoPoint getGeoPoint() {
        return geoPoint;
    }

    /**
     * Sets the geoPoint value for this LocationAdExtension.
     *
     * @param geoPoint
     */
    public void setGeoPoint(com.microsoft.bingads.v11.campaignmanagement.GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    /**
     * Gets the iconMediaId value for this LocationAdExtension.
     *
     * @return iconMediaId
     */
    public java.lang.Long getIconMediaId() {
        return iconMediaId;
    }

    /**
     * Sets the iconMediaId value for this LocationAdExtension.
     *
     * @param iconMediaId
     */
    public void setIconMediaId(java.lang.Long iconMediaId) {
        this.iconMediaId = iconMediaId;
    }

    /**
     * Gets the imageMediaId value for this LocationAdExtension.
     *
     * @return imageMediaId
     */
    public java.lang.Long getImageMediaId() {
        return imageMediaId;
    }

    /**
     * Sets the imageMediaId value for this LocationAdExtension.
     *
     * @param imageMediaId
     */
    public void setImageMediaId(java.lang.Long imageMediaId) {
        this.imageMediaId = imageMediaId;
    }

    /**
     * Gets the phoneNumber value for this LocationAdExtension.
     *
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phoneNumber value for this LocationAdExtension.
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationAdExtension)) return false;
        LocationAdExtension other = (LocationAdExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.address == null && other.getAddress() == null) ||
                        (this.address != null &&
                                this.address.equals(other.getAddress()))) &&
                ((this.companyName == null && other.getCompanyName() == null) ||
                        (this.companyName != null &&
                                this.companyName.equals(other.getCompanyName()))) &&
                ((this.geoCodeStatus == null && other.getGeoCodeStatus() == null) ||
                        (this.geoCodeStatus != null &&
                                this.geoCodeStatus.equals(other.getGeoCodeStatus()))) &&
                ((this.geoPoint == null && other.getGeoPoint() == null) ||
                        (this.geoPoint != null &&
                                this.geoPoint.equals(other.getGeoPoint()))) &&
                ((this.iconMediaId == null && other.getIconMediaId() == null) ||
                        (this.iconMediaId != null &&
                                this.iconMediaId.equals(other.getIconMediaId()))) &&
                ((this.imageMediaId == null && other.getImageMediaId() == null) ||
                        (this.imageMediaId != null &&
                                this.imageMediaId.equals(other.getImageMediaId()))) &&
                ((this.phoneNumber == null && other.getPhoneNumber() == null) ||
                        (this.phoneNumber != null &&
                                this.phoneNumber.equals(other.getPhoneNumber())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getGeoCodeStatus() != null) {
            _hashCode += getGeoCodeStatus().hashCode();
        }
        if (getGeoPoint() != null) {
            _hashCode += getGeoPoint().hashCode();
        }
        if (getIconMediaId() != null) {
            _hashCode += getIconMediaId().hashCode();
        }
        if (getImageMediaId() != null) {
            _hashCode += getImageMediaId().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
