/**
 * CampaignSize.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class CampaignSize implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CampaignSize.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignSize"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private long campaignId;
    private java.lang.Long size;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CampaignSize() {
    }


    public CampaignSize(
            long campaignId,
            java.lang.Long size) {
        this.campaignId = campaignId;
        this.size = size;
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
     * Gets the campaignId value for this CampaignSize.
     *
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the campaignId value for this CampaignSize.
     *
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Gets the size value for this CampaignSize.
     *
     * @return size
     */
    public java.lang.Long getSize() {
        return size;
    }

    /**
     * Sets the size value for this CampaignSize.
     *
     * @param size
     */
    public void setSize(java.lang.Long size) {
        this.size = size;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignSize)) return false;
        CampaignSize other = (CampaignSize) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.campaignId == other.getCampaignId() &&
                ((this.size == null && other.getSize() == null) ||
                        (this.size != null &&
                                this.size.equals(other.getSize())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getCampaignId()).hashCode();
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
