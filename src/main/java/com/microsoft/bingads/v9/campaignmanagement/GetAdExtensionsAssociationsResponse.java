/**
 * GetAdExtensionsAssociationsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class GetAdExtensionsAssociationsResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociationCollection[] adExtensionAssociationCollection;

    public GetAdExtensionsAssociationsResponse() {
    }

    public GetAdExtensionsAssociationsResponse(
           com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociationCollection[] adExtensionAssociationCollection) {
           this.adExtensionAssociationCollection = adExtensionAssociationCollection;
    }


    /**
     * Gets the adExtensionAssociationCollection value for this GetAdExtensionsAssociationsResponse.
     * 
     * @return adExtensionAssociationCollection
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociationCollection[] getAdExtensionAssociationCollection() {
        return adExtensionAssociationCollection;
    }


    /**
     * Sets the adExtensionAssociationCollection value for this GetAdExtensionsAssociationsResponse.
     * 
     * @param adExtensionAssociationCollection
     */
    public void setAdExtensionAssociationCollection(com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociationCollection[] adExtensionAssociationCollection) {
        this.adExtensionAssociationCollection = adExtensionAssociationCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAdExtensionsAssociationsResponse)) return false;
        GetAdExtensionsAssociationsResponse other = (GetAdExtensionsAssociationsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExtensionAssociationCollection==null && other.getAdExtensionAssociationCollection()==null) || 
             (this.adExtensionAssociationCollection!=null &&
              java.util.Arrays.equals(this.adExtensionAssociationCollection, other.getAdExtensionAssociationCollection())));
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
        if (getAdExtensionAssociationCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdExtensionAssociationCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensionAssociationCollection(), i);
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
        new org.apache.axis.description.TypeDesc(GetAdExtensionsAssociationsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdExtensionsAssociationsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionAssociationCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionAssociationCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionAssociationCollection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionAssociationCollection"));
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
