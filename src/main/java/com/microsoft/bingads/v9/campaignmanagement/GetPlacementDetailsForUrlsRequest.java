/**
 * GetPlacementDetailsForUrlsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class GetPlacementDetailsForUrlsRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring urls;

    public GetPlacementDetailsForUrlsRequest() {
    }

    public GetPlacementDetailsForUrlsRequest(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring urls) {
           this.urls = urls;
    }


    /**
     * Gets the urls value for this GetPlacementDetailsForUrlsRequest.
     * 
     * @return urls
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring getUrls() {
        return urls;
    }


    /**
     * Sets the urls value for this GetPlacementDetailsForUrlsRequest.
     * 
     * @param urls
     */
    public void setUrls(com.microsoft.bingads.v9.schemas.arrays.ArrayOfstring urls) {
        this.urls = urls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPlacementDetailsForUrlsRequest)) return false;
        GetPlacementDetailsForUrlsRequest other = (GetPlacementDetailsForUrlsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.urls==null && other.getUrls()==null) || 
             (this.urls!=null &&
              this.urls.equals(other.getUrls())));
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
        if (getUrls() != null) {
            _hashCode += getUrls().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPlacementDetailsForUrlsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetPlacementDetailsForUrlsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Urls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"));
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
