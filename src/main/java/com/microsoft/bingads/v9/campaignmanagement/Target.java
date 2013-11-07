/**
 * Target.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class Target  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AgeTarget age;

    private com.microsoft.bingads.v9.campaignmanagement.DayTarget day;

    private com.microsoft.bingads.v9.campaignmanagement.DeviceOSTarget deviceOS;

    private com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;

    private com.microsoft.bingads.v9.campaignmanagement.GenderTarget gender;

    private com.microsoft.bingads.v9.campaignmanagement.HourTarget hour;

    private java.lang.Long id;

    private java.lang.Boolean isLibraryTarget;

    private com.microsoft.bingads.v9.campaignmanagement.LocationTarget location;

    private java.lang.String name;

    public Target() {
    }

    public Target(
           com.microsoft.bingads.v9.campaignmanagement.AgeTarget age,
           com.microsoft.bingads.v9.campaignmanagement.DayTarget day,
           com.microsoft.bingads.v9.campaignmanagement.DeviceOSTarget deviceOS,
           com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
           com.microsoft.bingads.v9.campaignmanagement.GenderTarget gender,
           com.microsoft.bingads.v9.campaignmanagement.HourTarget hour,
           java.lang.Long id,
           java.lang.Boolean isLibraryTarget,
           com.microsoft.bingads.v9.campaignmanagement.LocationTarget location,
           java.lang.String name) {
           this.age = age;
           this.day = day;
           this.deviceOS = deviceOS;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.gender = gender;
           this.hour = hour;
           this.id = id;
           this.isLibraryTarget = isLibraryTarget;
           this.location = location;
           this.name = name;
    }


    /**
     * Gets the age value for this Target.
     * 
     * @return age
     */
    public com.microsoft.bingads.v9.campaignmanagement.AgeTarget getAge() {
        return age;
    }


    /**
     * Sets the age value for this Target.
     * 
     * @param age
     */
    public void setAge(com.microsoft.bingads.v9.campaignmanagement.AgeTarget age) {
        this.age = age;
    }


    /**
     * Gets the day value for this Target.
     * 
     * @return day
     */
    public com.microsoft.bingads.v9.campaignmanagement.DayTarget getDay() {
        return day;
    }


    /**
     * Sets the day value for this Target.
     * 
     * @param day
     */
    public void setDay(com.microsoft.bingads.v9.campaignmanagement.DayTarget day) {
        this.day = day;
    }


    /**
     * Gets the deviceOS value for this Target.
     * 
     * @return deviceOS
     */
    public com.microsoft.bingads.v9.campaignmanagement.DeviceOSTarget getDeviceOS() {
        return deviceOS;
    }


    /**
     * Sets the deviceOS value for this Target.
     * 
     * @param deviceOS
     */
    public void setDeviceOS(com.microsoft.bingads.v9.campaignmanagement.DeviceOSTarget deviceOS) {
        this.deviceOS = deviceOS;
    }


    /**
     * Gets the forwardCompatibilityMap value for this Target.
     * 
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    /**
     * Sets the forwardCompatibilityMap value for this Target.
     * 
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }


    /**
     * Gets the gender value for this Target.
     * 
     * @return gender
     */
    public com.microsoft.bingads.v9.campaignmanagement.GenderTarget getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Target.
     * 
     * @param gender
     */
    public void setGender(com.microsoft.bingads.v9.campaignmanagement.GenderTarget gender) {
        this.gender = gender;
    }


    /**
     * Gets the hour value for this Target.
     * 
     * @return hour
     */
    public com.microsoft.bingads.v9.campaignmanagement.HourTarget getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this Target.
     * 
     * @param hour
     */
    public void setHour(com.microsoft.bingads.v9.campaignmanagement.HourTarget hour) {
        this.hour = hour;
    }


    /**
     * Gets the id value for this Target.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Target.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isLibraryTarget value for this Target.
     * 
     * @return isLibraryTarget
     */
    public java.lang.Boolean getIsLibraryTarget() {
        return isLibraryTarget;
    }


    /**
     * Sets the isLibraryTarget value for this Target.
     * 
     * @param isLibraryTarget
     */
    public void setIsLibraryTarget(java.lang.Boolean isLibraryTarget) {
        this.isLibraryTarget = isLibraryTarget;
    }


    /**
     * Gets the location value for this Target.
     * 
     * @return location
     */
    public com.microsoft.bingads.v9.campaignmanagement.LocationTarget getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Target.
     * 
     * @param location
     */
    public void setLocation(com.microsoft.bingads.v9.campaignmanagement.LocationTarget location) {
        this.location = location;
    }


    /**
     * Gets the name value for this Target.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Target.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Target)) return false;
        Target other = (Target) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.age==null && other.getAge()==null) || 
             (this.age!=null &&
              this.age.equals(other.getAge()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.deviceOS==null && other.getDeviceOS()==null) || 
             (this.deviceOS!=null &&
              this.deviceOS.equals(other.getDeviceOS()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) || 
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isLibraryTarget==null && other.getIsLibraryTarget()==null) || 
             (this.isLibraryTarget!=null &&
              this.isLibraryTarget.equals(other.getIsLibraryTarget()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getAge() != null) {
            _hashCode += getAge().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getDeviceOS() != null) {
            _hashCode += getDeviceOS().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsLibraryTarget() != null) {
            _hashCode += getIsLibraryTarget().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Target.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Target"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Age"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AgeTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DayTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceOS");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeviceOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DeviceOSTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ForwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "GenderTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "HourTarget"));
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
        elemField.setFieldName("isLibraryTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "IsLibraryTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "LocationTarget"));
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
