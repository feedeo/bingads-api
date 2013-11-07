/**
 * AddAdExtensionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class AddAdExtensionsResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionIdentity adExtensionIdentities;

    public AddAdExtensionsResponse() {
    }

    public AddAdExtensionsResponse(
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionIdentity adExtensionIdentities) {
           this.adExtensionIdentities = adExtensionIdentities;
    }


    /**
     * Gets the adExtensionIdentities value for this AddAdExtensionsResponse.
     * 
     * @return adExtensionIdentities
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionIdentity getAdExtensionIdentities() {
        return adExtensionIdentities;
    }


    /**
     * Sets the adExtensionIdentities value for this AddAdExtensionsResponse.
     * 
     * @param adExtensionIdentities
     */
    public void setAdExtensionIdentities(com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionIdentity adExtensionIdentities) {
        this.adExtensionIdentities = adExtensionIdentities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddAdExtensionsResponse)) return false;
        AddAdExtensionsResponse other = (AddAdExtensionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExtensionIdentities==null && other.getAdExtensionIdentities()==null) || 
             (this.adExtensionIdentities!=null &&
              this.adExtensionIdentities.equals(other.getAdExtensionIdentities())));
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
        if (getAdExtensionIdentities() != null) {
            _hashCode += getAdExtensionIdentities().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddAdExtensionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdExtensionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionIdentities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionIdentities"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionIdentity"));
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
