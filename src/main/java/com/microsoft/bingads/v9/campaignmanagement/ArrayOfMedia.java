/**
 * ArrayOfMedia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfMedia  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.Media[] media;

    public ArrayOfMedia() {
    }

    public ArrayOfMedia(
           com.microsoft.bingads.v9.campaignmanagement.Media[] media) {
           this.media = media;
    }


    /**
     * Gets the media value for this ArrayOfMedia.
     * 
     * @return media
     */
    public com.microsoft.bingads.v9.campaignmanagement.Media[] getMedia() {
        return media;
    }


    /**
     * Sets the media value for this ArrayOfMedia.
     * 
     * @param media
     */
    public void setMedia(com.microsoft.bingads.v9.campaignmanagement.Media[] media) {
        this.media = media;
    }

    public com.microsoft.bingads.v9.campaignmanagement.Media getMedia(int i) {
        return this.media[i];
    }

    public void setMedia(int i, com.microsoft.bingads.v9.campaignmanagement.Media _value) {
        this.media[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfMedia)) return false;
        ArrayOfMedia other = (ArrayOfMedia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.media==null && other.getMedia()==null) || 
             (this.media!=null &&
              java.util.Arrays.equals(this.media, other.getMedia())));
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
        if (getMedia() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedia());
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

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfMedia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfMedia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("media");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Media"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Media"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
