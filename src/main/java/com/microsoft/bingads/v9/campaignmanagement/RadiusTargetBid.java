/**
 * RadiusTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class RadiusTargetBid  implements java.io.Serializable {
    private int bidAdjustment;

    private java.lang.Long id;

    private boolean isExcluded;

    private double latitudeDegrees;

    private double longitudeDegrees;

    private java.lang.String name;

    private int radius;

    public RadiusTargetBid() {
    }

    public RadiusTargetBid(
           int bidAdjustment,
           java.lang.Long id,
           boolean isExcluded,
           double latitudeDegrees,
           double longitudeDegrees,
           java.lang.String name,
           int radius) {
           this.bidAdjustment = bidAdjustment;
           this.id = id;
           this.isExcluded = isExcluded;
           this.latitudeDegrees = latitudeDegrees;
           this.longitudeDegrees = longitudeDegrees;
           this.name = name;
           this.radius = radius;
    }


    /**
     * Gets the bidAdjustment value for this RadiusTargetBid.
     * 
     * @return bidAdjustment
     */
    public int getBidAdjustment() {
        return bidAdjustment;
    }


    /**
     * Sets the bidAdjustment value for this RadiusTargetBid.
     * 
     * @param bidAdjustment
     */
    public void setBidAdjustment(int bidAdjustment) {
        this.bidAdjustment = bidAdjustment;
    }


    /**
     * Gets the id value for this RadiusTargetBid.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this RadiusTargetBid.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isExcluded value for this RadiusTargetBid.
     * 
     * @return isExcluded
     */
    public boolean isIsExcluded() {
        return isExcluded;
    }


    /**
     * Sets the isExcluded value for this RadiusTargetBid.
     * 
     * @param isExcluded
     */
    public void setIsExcluded(boolean isExcluded) {
        this.isExcluded = isExcluded;
    }


    /**
     * Gets the latitudeDegrees value for this RadiusTargetBid.
     * 
     * @return latitudeDegrees
     */
    public double getLatitudeDegrees() {
        return latitudeDegrees;
    }


    /**
     * Sets the latitudeDegrees value for this RadiusTargetBid.
     * 
     * @param latitudeDegrees
     */
    public void setLatitudeDegrees(double latitudeDegrees) {
        this.latitudeDegrees = latitudeDegrees;
    }


    /**
     * Gets the longitudeDegrees value for this RadiusTargetBid.
     * 
     * @return longitudeDegrees
     */
    public double getLongitudeDegrees() {
        return longitudeDegrees;
    }


    /**
     * Sets the longitudeDegrees value for this RadiusTargetBid.
     * 
     * @param longitudeDegrees
     */
    public void setLongitudeDegrees(double longitudeDegrees) {
        this.longitudeDegrees = longitudeDegrees;
    }


    /**
     * Gets the name value for this RadiusTargetBid.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RadiusTargetBid.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the radius value for this RadiusTargetBid.
     * 
     * @return radius
     */
    public int getRadius() {
        return radius;
    }


    /**
     * Sets the radius value for this RadiusTargetBid.
     * 
     * @param radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RadiusTargetBid)) return false;
        RadiusTargetBid other = (RadiusTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bidAdjustment == other.getBidAdjustment() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.isExcluded == other.isIsExcluded() &&
            this.latitudeDegrees == other.getLatitudeDegrees() &&
            this.longitudeDegrees == other.getLongitudeDegrees() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.radius == other.getRadius();
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
        _hashCode += getBidAdjustment();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += (isIsExcluded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getLatitudeDegrees()).hashCode();
        _hashCode += new Double(getLongitudeDegrees()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getRadius();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RadiusTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "RadiusTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BidAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExcluded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "IsExcluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitudeDegrees");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "LatitudeDegrees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitudeDegrees");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "LongitudeDegrees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radius");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
