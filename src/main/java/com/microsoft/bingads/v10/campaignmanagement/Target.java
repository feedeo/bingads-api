/**
 * Target.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class Target implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(Target.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Target"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("age");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Age"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "AgeTarget"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("dayTime");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DayTime"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DayTimeTarget"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("deviceOS");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOS"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOSTarget"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("forwardCompatibilityMap");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ForwardCompatibilityMap"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("gender");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Gender"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderTarget"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("id");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Id"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("isLibraryTarget");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "IsLibraryTarget"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("location");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Location"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "LocationTarget"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("name");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Name"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.AgeTarget age;
  private com.microsoft.bingads.v10.campaignmanagement.DayTimeTarget dayTime;
  private com.microsoft.bingads.v10.campaignmanagement.DeviceOSTarget deviceOS;
  private com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
  private com.microsoft.bingads.v10.campaignmanagement.GenderTarget gender;
  private java.lang.Long id;
  private java.lang.Boolean isLibraryTarget;
  private com.microsoft.bingads.v10.campaignmanagement.LocationTarget location;
  private java.lang.String name;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public Target() {
  }

  public Target(
          com.microsoft.bingads.v10.campaignmanagement.AgeTarget age,
          com.microsoft.bingads.v10.campaignmanagement.DayTimeTarget dayTime,
          com.microsoft.bingads.v10.campaignmanagement.DeviceOSTarget deviceOS,
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          com.microsoft.bingads.v10.campaignmanagement.GenderTarget gender,
          java.lang.Long id,
          java.lang.Boolean isLibraryTarget,
          com.microsoft.bingads.v10.campaignmanagement.LocationTarget location,
          java.lang.String name) {
    this.age = age;
    this.dayTime = dayTime;
    this.deviceOS = deviceOS;
    this.forwardCompatibilityMap = forwardCompatibilityMap;
    this.gender = gender;
    this.id = id;
    this.isLibraryTarget = isLibraryTarget;
    this.location = location;
    this.name = name;
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
   * Gets the age value for this Target.
   *
   * @return age
   */
  public com.microsoft.bingads.v10.campaignmanagement.AgeTarget getAge() {
    return age;
  }

  /**
   * Sets the age value for this Target.
   *
   * @param age
   */
  public void setAge(com.microsoft.bingads.v10.campaignmanagement.AgeTarget age) {
    this.age = age;
  }

  /**
   * Gets the dayTime value for this Target.
   *
   * @return dayTime
   */
  public com.microsoft.bingads.v10.campaignmanagement.DayTimeTarget getDayTime() {
    return dayTime;
  }

  /**
   * Sets the dayTime value for this Target.
   *
   * @param dayTime
   */
  public void setDayTime(com.microsoft.bingads.v10.campaignmanagement.DayTimeTarget dayTime) {
    this.dayTime = dayTime;
  }

  /**
   * Gets the deviceOS value for this Target.
   *
   * @return deviceOS
   */
  public com.microsoft.bingads.v10.campaignmanagement.DeviceOSTarget getDeviceOS() {
    return deviceOS;
  }

  /**
   * Sets the deviceOS value for this Target.
   *
   * @param deviceOS
   */
  public void setDeviceOS(com.microsoft.bingads.v10.campaignmanagement.DeviceOSTarget deviceOS) {
    this.deviceOS = deviceOS;
  }

  /**
   * Gets the forwardCompatibilityMap value for this Target.
   *
   * @return forwardCompatibilityMap
   */
  public com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
    return forwardCompatibilityMap;
  }

  /**
   * Sets the forwardCompatibilityMap value for this Target.
   *
   * @param forwardCompatibilityMap
   */
  public void setForwardCompatibilityMap(com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
    this.forwardCompatibilityMap = forwardCompatibilityMap;
  }

  /**
   * Gets the gender value for this Target.
   *
   * @return gender
   */
  public com.microsoft.bingads.v10.campaignmanagement.GenderTarget getGender() {
    return gender;
  }

  /**
   * Sets the gender value for this Target.
   *
   * @param gender
   */
  public void setGender(com.microsoft.bingads.v10.campaignmanagement.GenderTarget gender) {
    this.gender = gender;
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
  public com.microsoft.bingads.v10.campaignmanagement.LocationTarget getLocation() {
    return location;
  }

  /**
   * Sets the location value for this Target.
   *
   * @param location
   */
  public void setLocation(com.microsoft.bingads.v10.campaignmanagement.LocationTarget location) {
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
            ((this.age == null && other.getAge() == null) ||
                    (this.age != null &&
                            this.age.equals(other.getAge()))) &&
            ((this.dayTime == null && other.getDayTime() == null) ||
                    (this.dayTime != null &&
                            this.dayTime.equals(other.getDayTime()))) &&
            ((this.deviceOS == null && other.getDeviceOS() == null) ||
                    (this.deviceOS != null &&
                            this.deviceOS.equals(other.getDeviceOS()))) &&
            ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                    (this.forwardCompatibilityMap != null &&
                            java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.gender == null && other.getGender() == null) ||
                    (this.gender != null &&
                            this.gender.equals(other.getGender()))) &&
            ((this.id == null && other.getId() == null) ||
                    (this.id != null &&
                            this.id.equals(other.getId()))) &&
            ((this.isLibraryTarget == null && other.getIsLibraryTarget() == null) ||
                    (this.isLibraryTarget != null &&
                            this.isLibraryTarget.equals(other.getIsLibraryTarget()))) &&
            ((this.location == null && other.getLocation() == null) ||
                    (this.location != null &&
                            this.location.equals(other.getLocation()))) &&
            ((this.name == null && other.getName() == null) ||
                    (this.name != null &&
                            this.name.equals(other.getName())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getAge() != null) {
      _hashCode += getAge().hashCode();
    }
    if (getDayTime() != null) {
      _hashCode += getDayTime().hashCode();
    }
    if (getDeviceOS() != null) {
      _hashCode += getDeviceOS().hashCode();
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
    if (getGender() != null) {
      _hashCode += getGender().hashCode();
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

}
