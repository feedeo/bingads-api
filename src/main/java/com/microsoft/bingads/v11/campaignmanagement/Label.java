/**
 * Label.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class Label implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Label.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Label"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ColorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
    }

    private java.lang.String colorCode;
    private java.lang.String description;
    private java.lang.Long id;
    private java.lang.String name;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public Label() {
    }


    public Label(
            java.lang.String colorCode,
            java.lang.String description,
            java.lang.Long id,
            java.lang.String name) {
        this.colorCode = colorCode;
        this.description = description;
        this.id = id;
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
     * Gets the colorCode value for this Label.
     *
     * @return colorCode
     */
    public java.lang.String getColorCode() {
        return colorCode;
    }

    /**
     * Sets the colorCode value for this Label.
     *
     * @param colorCode
     */
    public void setColorCode(java.lang.String colorCode) {
        this.colorCode = colorCode;
    }

    /**
     * Gets the description value for this Label.
     *
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the description value for this Label.
     *
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Gets the id value for this Label.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this Label.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the name value for this Label.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this Label.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Label)) return false;
        Label other = (Label) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.colorCode == null && other.getColorCode() == null) ||
                        (this.colorCode != null &&
                                this.colorCode.equals(other.getColorCode()))) &&
                ((this.description == null && other.getDescription() == null) ||
                        (this.description != null &&
                                this.description.equals(other.getDescription()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
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
        if (getColorCode() != null) {
            _hashCode += getColorCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
