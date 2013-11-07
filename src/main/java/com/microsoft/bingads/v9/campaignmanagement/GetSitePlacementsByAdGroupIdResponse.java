/**
 * GetSitePlacementsByAdGroupIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class GetSitePlacementsByAdGroupIdResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfSitePlacement sitePlacements;

    public GetSitePlacementsByAdGroupIdResponse() {
    }

    public GetSitePlacementsByAdGroupIdResponse(
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfSitePlacement sitePlacements) {
           this.sitePlacements = sitePlacements;
    }


    /**
     * Gets the sitePlacements value for this GetSitePlacementsByAdGroupIdResponse.
     * 
     * @return sitePlacements
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfSitePlacement getSitePlacements() {
        return sitePlacements;
    }


    /**
     * Sets the sitePlacements value for this GetSitePlacementsByAdGroupIdResponse.
     * 
     * @param sitePlacements
     */
    public void setSitePlacements(com.microsoft.bingads.v9.campaignmanagement.ArrayOfSitePlacement sitePlacements) {
        this.sitePlacements = sitePlacements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSitePlacementsByAdGroupIdResponse)) return false;
        GetSitePlacementsByAdGroupIdResponse other = (GetSitePlacementsByAdGroupIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sitePlacements==null && other.getSitePlacements()==null) || 
             (this.sitePlacements!=null &&
              this.sitePlacements.equals(other.getSitePlacements())));
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
        if (getSitePlacements() != null) {
            _hashCode += getSitePlacements().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSitePlacementsByAdGroupIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetSitePlacementsByAdGroupIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitePlacements");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SitePlacements"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfSitePlacement"));
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
