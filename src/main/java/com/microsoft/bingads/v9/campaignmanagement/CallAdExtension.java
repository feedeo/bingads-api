/**
 * CallAdExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class CallAdExtension  extends com.microsoft.bingads.v9.campaignmanagement.AdExtension  implements java.io.Serializable {
    private java.lang.String countryCode;

    private java.lang.Long devicePreference;

    private java.lang.Boolean isCallOnly;

    private java.lang.Boolean isCallTrackingEnabled;

    private java.lang.String phoneNumber;

    private java.lang.Boolean requireTollFreeTrackingNumber;

    public CallAdExtension() {
    }

    public CallAdExtension(
           com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
           java.lang.Long id,
           com.microsoft.bingads.v9.campaignmanagement.AdExtensionStatus status,
           java.lang.String type,
           java.lang.Integer version,
           java.lang.String countryCode,
           java.lang.Long devicePreference,
           java.lang.Boolean isCallOnly,
           java.lang.Boolean isCallTrackingEnabled,
           java.lang.String phoneNumber,
           java.lang.Boolean requireTollFreeTrackingNumber) {
        super(
            forwardCompatibilityMap,
            id,
            status,
            type,
            version);
        this.countryCode = countryCode;
        this.devicePreference = devicePreference;
        this.isCallOnly = isCallOnly;
        this.isCallTrackingEnabled = isCallTrackingEnabled;
        this.phoneNumber = phoneNumber;
        this.requireTollFreeTrackingNumber = requireTollFreeTrackingNumber;
    }


    /**
     * Gets the countryCode value for this CallAdExtension.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this CallAdExtension.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the devicePreference value for this CallAdExtension.
     * 
     * @return devicePreference
     */
    public java.lang.Long getDevicePreference() {
        return devicePreference;
    }


    /**
     * Sets the devicePreference value for this CallAdExtension.
     * 
     * @param devicePreference
     */
    public void setDevicePreference(java.lang.Long devicePreference) {
        this.devicePreference = devicePreference;
    }


    /**
     * Gets the isCallOnly value for this CallAdExtension.
     * 
     * @return isCallOnly
     */
    public java.lang.Boolean getIsCallOnly() {
        return isCallOnly;
    }


    /**
     * Sets the isCallOnly value for this CallAdExtension.
     * 
     * @param isCallOnly
     */
    public void setIsCallOnly(java.lang.Boolean isCallOnly) {
        this.isCallOnly = isCallOnly;
    }


    /**
     * Gets the isCallTrackingEnabled value for this CallAdExtension.
     * 
     * @return isCallTrackingEnabled
     */
    public java.lang.Boolean getIsCallTrackingEnabled() {
        return isCallTrackingEnabled;
    }


    /**
     * Sets the isCallTrackingEnabled value for this CallAdExtension.
     * 
     * @param isCallTrackingEnabled
     */
    public void setIsCallTrackingEnabled(java.lang.Boolean isCallTrackingEnabled) {
        this.isCallTrackingEnabled = isCallTrackingEnabled;
    }


    /**
     * Gets the phoneNumber value for this CallAdExtension.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this CallAdExtension.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the requireTollFreeTrackingNumber value for this CallAdExtension.
     * 
     * @return requireTollFreeTrackingNumber
     */
    public java.lang.Boolean getRequireTollFreeTrackingNumber() {
        return requireTollFreeTrackingNumber;
    }


    /**
     * Sets the requireTollFreeTrackingNumber value for this CallAdExtension.
     * 
     * @param requireTollFreeTrackingNumber
     */
    public void setRequireTollFreeTrackingNumber(java.lang.Boolean requireTollFreeTrackingNumber) {
        this.requireTollFreeTrackingNumber = requireTollFreeTrackingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallAdExtension)) return false;
        CallAdExtension other = (CallAdExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.devicePreference==null && other.getDevicePreference()==null) || 
             (this.devicePreference!=null &&
              this.devicePreference.equals(other.getDevicePreference()))) &&
            ((this.isCallOnly==null && other.getIsCallOnly()==null) || 
             (this.isCallOnly!=null &&
              this.isCallOnly.equals(other.getIsCallOnly()))) &&
            ((this.isCallTrackingEnabled==null && other.getIsCallTrackingEnabled()==null) || 
             (this.isCallTrackingEnabled!=null &&
              this.isCallTrackingEnabled.equals(other.getIsCallTrackingEnabled()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.requireTollFreeTrackingNumber==null && other.getRequireTollFreeTrackingNumber()==null) || 
             (this.requireTollFreeTrackingNumber!=null &&
              this.requireTollFreeTrackingNumber.equals(other.getRequireTollFreeTrackingNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
        }
        if (getIsCallOnly() != null) {
            _hashCode += getIsCallOnly().hashCode();
        }
        if (getIsCallTrackingEnabled() != null) {
            _hashCode += getIsCallTrackingEnabled().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getRequireTollFreeTrackingNumber() != null) {
            _hashCode += getRequireTollFreeTrackingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallAdExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CallAdExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DevicePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCallOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "IsCallOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCallTrackingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "IsCallTrackingEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireTollFreeTrackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "RequireTollFreeTrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
