/**
 * DynamicSearchAdsSetting.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DynamicSearchAdsSetting extends com.microsoft.bingads.v11.campaignmanagement.Setting implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DynamicSearchAdsSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DynamicSearchAdsSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DomainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String domainName;
    private java.lang.String language;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DynamicSearchAdsSetting() {
    }


    public DynamicSearchAdsSetting(
            java.lang.String type,
            java.lang.String domainName,
            java.lang.String language) {
        super(
                type);
        this.domainName = domainName;
        this.language = language;
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
     * Gets the domainName value for this DynamicSearchAdsSetting.
     *
     * @return domainName
     */
    public java.lang.String getDomainName() {
        return domainName;
    }

    /**
     * Sets the domainName value for this DynamicSearchAdsSetting.
     *
     * @param domainName
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }

    /**
     * Gets the language value for this DynamicSearchAdsSetting.
     *
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }

    /**
     * Sets the language value for this DynamicSearchAdsSetting.
     *
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicSearchAdsSetting)) return false;
        DynamicSearchAdsSetting other = (DynamicSearchAdsSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.domainName == null && other.getDomainName() == null) ||
                        (this.domainName != null &&
                                this.domainName.equals(other.getDomainName()))) &&
                ((this.language == null && other.getLanguage() == null) ||
                        (this.language != null &&
                                this.language.equals(other.getLanguage())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
