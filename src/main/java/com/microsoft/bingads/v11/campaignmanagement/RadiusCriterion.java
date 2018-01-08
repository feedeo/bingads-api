/**
 * RadiusCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class RadiusCriterion extends com.microsoft.bingads.v11.campaignmanagement.Criterion implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RadiusCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "RadiusCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitudeDegrees");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LatitudeDegrees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitudeDegrees");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "LongitudeDegrees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("radius");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "RadiusUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DistanceUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Double latitudeDegrees;
    private java.lang.Double longitudeDegrees;
    private java.lang.String name;
    private java.lang.Long radius;
    private com.microsoft.bingads.v11.campaignmanagement.DistanceUnit radiusUnit;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public RadiusCriterion() {
    }


    public RadiusCriterion(
            java.lang.String type,
            java.lang.Double latitudeDegrees,
            java.lang.Double longitudeDegrees,
            java.lang.String name,
            java.lang.Long radius,
            com.microsoft.bingads.v11.campaignmanagement.DistanceUnit radiusUnit) {
        super(
                type);
        this.latitudeDegrees = latitudeDegrees;
        this.longitudeDegrees = longitudeDegrees;
        this.name = name;
        this.radius = radius;
        this.radiusUnit = radiusUnit;
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
     * Gets the latitudeDegrees value for this RadiusCriterion.
     *
     * @return latitudeDegrees
     */
    public java.lang.Double getLatitudeDegrees() {
        return latitudeDegrees;
    }

    /**
     * Sets the latitudeDegrees value for this RadiusCriterion.
     *
     * @param latitudeDegrees
     */
    public void setLatitudeDegrees(java.lang.Double latitudeDegrees) {
        this.latitudeDegrees = latitudeDegrees;
    }

    /**
     * Gets the longitudeDegrees value for this RadiusCriterion.
     *
     * @return longitudeDegrees
     */
    public java.lang.Double getLongitudeDegrees() {
        return longitudeDegrees;
    }

    /**
     * Sets the longitudeDegrees value for this RadiusCriterion.
     *
     * @param longitudeDegrees
     */
    public void setLongitudeDegrees(java.lang.Double longitudeDegrees) {
        this.longitudeDegrees = longitudeDegrees;
    }

    /**
     * Gets the name value for this RadiusCriterion.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this RadiusCriterion.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Gets the radius value for this RadiusCriterion.
     *
     * @return radius
     */
    public java.lang.Long getRadius() {
        return radius;
    }

    /**
     * Sets the radius value for this RadiusCriterion.
     *
     * @param radius
     */
    public void setRadius(java.lang.Long radius) {
        this.radius = radius;
    }

    /**
     * Gets the radiusUnit value for this RadiusCriterion.
     *
     * @return radiusUnit
     */
    public com.microsoft.bingads.v11.campaignmanagement.DistanceUnit getRadiusUnit() {
        return radiusUnit;
    }

    /**
     * Sets the radiusUnit value for this RadiusCriterion.
     *
     * @param radiusUnit
     */
    public void setRadiusUnit(com.microsoft.bingads.v11.campaignmanagement.DistanceUnit radiusUnit) {
        this.radiusUnit = radiusUnit;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RadiusCriterion)) return false;
        RadiusCriterion other = (RadiusCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.latitudeDegrees == null && other.getLatitudeDegrees() == null) ||
                        (this.latitudeDegrees != null &&
                                this.latitudeDegrees.equals(other.getLatitudeDegrees()))) &&
                ((this.longitudeDegrees == null && other.getLongitudeDegrees() == null) ||
                        (this.longitudeDegrees != null &&
                                this.longitudeDegrees.equals(other.getLongitudeDegrees()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.radius == null && other.getRadius() == null) ||
                        (this.radius != null &&
                                this.radius.equals(other.getRadius()))) &&
                ((this.radiusUnit == null && other.getRadiusUnit() == null) ||
                        (this.radiusUnit != null &&
                                this.radiusUnit.equals(other.getRadiusUnit())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getLatitudeDegrees() != null) {
            _hashCode += getLatitudeDegrees().hashCode();
        }
        if (getLongitudeDegrees() != null) {
            _hashCode += getLongitudeDegrees().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRadius() != null) {
            _hashCode += getRadius().hashCode();
        }
        if (getRadiusUnit() != null) {
            _hashCode += getRadiusUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
