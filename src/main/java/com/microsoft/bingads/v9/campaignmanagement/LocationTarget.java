/**
 * LocationTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class LocationTarget  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.CityTarget cityTarget;

    private com.microsoft.bingads.v9.campaignmanagement.CountryTarget countryTarget;

    private java.lang.Boolean hasPhysicalIntent;

    private com.microsoft.bingads.v9.campaignmanagement.MetroAreaTarget metroAreaTarget;

    private com.microsoft.bingads.v9.campaignmanagement.RadiusTarget radiusTarget;

    private com.microsoft.bingads.v9.campaignmanagement.StateTarget stateTarget;

    public LocationTarget() {
    }

    public LocationTarget(
           com.microsoft.bingads.v9.campaignmanagement.CityTarget cityTarget,
           com.microsoft.bingads.v9.campaignmanagement.CountryTarget countryTarget,
           java.lang.Boolean hasPhysicalIntent,
           com.microsoft.bingads.v9.campaignmanagement.MetroAreaTarget metroAreaTarget,
           com.microsoft.bingads.v9.campaignmanagement.RadiusTarget radiusTarget,
           com.microsoft.bingads.v9.campaignmanagement.StateTarget stateTarget) {
           this.cityTarget = cityTarget;
           this.countryTarget = countryTarget;
           this.hasPhysicalIntent = hasPhysicalIntent;
           this.metroAreaTarget = metroAreaTarget;
           this.radiusTarget = radiusTarget;
           this.stateTarget = stateTarget;
    }


    /**
     * Gets the cityTarget value for this LocationTarget.
     * 
     * @return cityTarget
     */
    public com.microsoft.bingads.v9.campaignmanagement.CityTarget getCityTarget() {
        return cityTarget;
    }


    /**
     * Sets the cityTarget value for this LocationTarget.
     * 
     * @param cityTarget
     */
    public void setCityTarget(com.microsoft.bingads.v9.campaignmanagement.CityTarget cityTarget) {
        this.cityTarget = cityTarget;
    }


    /**
     * Gets the countryTarget value for this LocationTarget.
     * 
     * @return countryTarget
     */
    public com.microsoft.bingads.v9.campaignmanagement.CountryTarget getCountryTarget() {
        return countryTarget;
    }


    /**
     * Sets the countryTarget value for this LocationTarget.
     * 
     * @param countryTarget
     */
    public void setCountryTarget(com.microsoft.bingads.v9.campaignmanagement.CountryTarget countryTarget) {
        this.countryTarget = countryTarget;
    }


    /**
     * Gets the hasPhysicalIntent value for this LocationTarget.
     * 
     * @return hasPhysicalIntent
     */
    public java.lang.Boolean getHasPhysicalIntent() {
        return hasPhysicalIntent;
    }


    /**
     * Sets the hasPhysicalIntent value for this LocationTarget.
     * 
     * @param hasPhysicalIntent
     */
    public void setHasPhysicalIntent(java.lang.Boolean hasPhysicalIntent) {
        this.hasPhysicalIntent = hasPhysicalIntent;
    }


    /**
     * Gets the metroAreaTarget value for this LocationTarget.
     * 
     * @return metroAreaTarget
     */
    public com.microsoft.bingads.v9.campaignmanagement.MetroAreaTarget getMetroAreaTarget() {
        return metroAreaTarget;
    }


    /**
     * Sets the metroAreaTarget value for this LocationTarget.
     * 
     * @param metroAreaTarget
     */
    public void setMetroAreaTarget(com.microsoft.bingads.v9.campaignmanagement.MetroAreaTarget metroAreaTarget) {
        this.metroAreaTarget = metroAreaTarget;
    }


    /**
     * Gets the radiusTarget value for this LocationTarget.
     * 
     * @return radiusTarget
     */
    public com.microsoft.bingads.v9.campaignmanagement.RadiusTarget getRadiusTarget() {
        return radiusTarget;
    }


    /**
     * Sets the radiusTarget value for this LocationTarget.
     * 
     * @param radiusTarget
     */
    public void setRadiusTarget(com.microsoft.bingads.v9.campaignmanagement.RadiusTarget radiusTarget) {
        this.radiusTarget = radiusTarget;
    }


    /**
     * Gets the stateTarget value for this LocationTarget.
     * 
     * @return stateTarget
     */
    public com.microsoft.bingads.v9.campaignmanagement.StateTarget getStateTarget() {
        return stateTarget;
    }


    /**
     * Sets the stateTarget value for this LocationTarget.
     * 
     * @param stateTarget
     */
    public void setStateTarget(com.microsoft.bingads.v9.campaignmanagement.StateTarget stateTarget) {
        this.stateTarget = stateTarget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTarget)) return false;
        LocationTarget other = (LocationTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cityTarget==null && other.getCityTarget()==null) || 
             (this.cityTarget!=null &&
              this.cityTarget.equals(other.getCityTarget()))) &&
            ((this.countryTarget==null && other.getCountryTarget()==null) || 
             (this.countryTarget!=null &&
              this.countryTarget.equals(other.getCountryTarget()))) &&
            ((this.hasPhysicalIntent==null && other.getHasPhysicalIntent()==null) || 
             (this.hasPhysicalIntent!=null &&
              this.hasPhysicalIntent.equals(other.getHasPhysicalIntent()))) &&
            ((this.metroAreaTarget==null && other.getMetroAreaTarget()==null) || 
             (this.metroAreaTarget!=null &&
              this.metroAreaTarget.equals(other.getMetroAreaTarget()))) &&
            ((this.radiusTarget==null && other.getRadiusTarget()==null) || 
             (this.radiusTarget!=null &&
              this.radiusTarget.equals(other.getRadiusTarget()))) &&
            ((this.stateTarget==null && other.getStateTarget()==null) || 
             (this.stateTarget!=null &&
              this.stateTarget.equals(other.getStateTarget())));
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
        if (getCityTarget() != null) {
            _hashCode += getCityTarget().hashCode();
        }
        if (getCountryTarget() != null) {
            _hashCode += getCountryTarget().hashCode();
        }
        if (getHasPhysicalIntent() != null) {
            _hashCode += getHasPhysicalIntent().hashCode();
        }
        if (getMetroAreaTarget() != null) {
            _hashCode += getMetroAreaTarget().hashCode();
        }
        if (getRadiusTarget() != null) {
            _hashCode += getRadiusTarget().hashCode();
        }
        if (getStateTarget() != null) {
            _hashCode += getStateTarget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "LocationTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CityTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CityTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CountryTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CountryTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPhysicalIntent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "HasPhysicalIntent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metroAreaTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "MetroAreaTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "MetroAreaTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "RadiusTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "RadiusTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "StateTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "StateTarget"));
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
