/**
 * GetMediaByIdsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetMediaByIdsResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetMediaByIdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetMediaByIdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("media");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Media"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Media"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Media"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.Media[] media;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetMediaByIdsResponse() {
    }

    public GetMediaByIdsResponse(
            com.microsoft.bingads.v11.campaignmanagement.Media[] media) {
        this.media = media;
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
     * Gets the media value for this GetMediaByIdsResponse.
     *
     * @return media
     */
    public com.microsoft.bingads.v11.campaignmanagement.Media[] getMedia() {
        return media;
    }

    /**
     * Sets the media value for this GetMediaByIdsResponse.
     *
     * @param media
     */
    public void setMedia(com.microsoft.bingads.v11.campaignmanagement.Media[] media) {
        this.media = media;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMediaByIdsResponse)) return false;
        GetMediaByIdsResponse other = (GetMediaByIdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.media == null && other.getMedia() == null) ||
                        (this.media != null &&
                                java.util.Arrays.equals(this.media, other.getMedia())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMedia() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getMedia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedia(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
