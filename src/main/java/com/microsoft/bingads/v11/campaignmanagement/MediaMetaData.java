/**
 * MediaMetaData.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class MediaMetaData implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(MediaMetaData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaMetaData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Representations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaRepresentation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MediaRepresentation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private long id;
    private java.lang.String mediaType;
    private com.microsoft.bingads.v11.campaignmanagement.MediaRepresentation[] representations;
    private java.lang.String type;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public MediaMetaData() {
    }


    public MediaMetaData(
            long id,
            java.lang.String mediaType,
            com.microsoft.bingads.v11.campaignmanagement.MediaRepresentation[] representations,
            java.lang.String type) {
        this.id = id;
        this.mediaType = mediaType;
        this.representations = representations;
        this.type = type;
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
     * Gets the id value for this MediaMetaData.
     *
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the id value for this MediaMetaData.
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the mediaType value for this MediaMetaData.
     *
     * @return mediaType
     */
    public java.lang.String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the mediaType value for this MediaMetaData.
     *
     * @param mediaType
     */
    public void setMediaType(java.lang.String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * Gets the representations value for this MediaMetaData.
     *
     * @return representations
     */
    public com.microsoft.bingads.v11.campaignmanagement.MediaRepresentation[] getRepresentations() {
        return representations;
    }

    /**
     * Sets the representations value for this MediaMetaData.
     *
     * @param representations
     */
    public void setRepresentations(com.microsoft.bingads.v11.campaignmanagement.MediaRepresentation[] representations) {
        this.representations = representations;
    }

    /**
     * Gets the type value for this MediaMetaData.
     *
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Sets the type value for this MediaMetaData.
     *
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MediaMetaData)) return false;
        MediaMetaData other = (MediaMetaData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.id == other.getId() &&
                ((this.mediaType == null && other.getMediaType() == null) ||
                        (this.mediaType != null &&
                                this.mediaType.equals(other.getMediaType()))) &&
                ((this.representations == null && other.getRepresentations() == null) ||
                        (this.representations != null &&
                                java.util.Arrays.equals(this.representations, other.getRepresentations()))) &&
                ((this.type == null && other.getType() == null) ||
                        (this.type != null &&
                                this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getId()).hashCode();
        if (getMediaType() != null) {
            _hashCode += getMediaType().hashCode();
        }
        if (getRepresentations() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRepresentations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepresentations(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
