/**
 * AddSitePlacementsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class AddSitePlacementsResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong sitePlacementIds;

    public AddSitePlacementsResponse() {
    }

    public AddSitePlacementsResponse(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong sitePlacementIds) {
           this.sitePlacementIds = sitePlacementIds;
    }


    /**
     * Gets the sitePlacementIds value for this AddSitePlacementsResponse.
     * 
     * @return sitePlacementIds
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getSitePlacementIds() {
        return sitePlacementIds;
    }


    /**
     * Sets the sitePlacementIds value for this AddSitePlacementsResponse.
     * 
     * @param sitePlacementIds
     */
    public void setSitePlacementIds(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong sitePlacementIds) {
        this.sitePlacementIds = sitePlacementIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddSitePlacementsResponse)) return false;
        AddSitePlacementsResponse other = (AddSitePlacementsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sitePlacementIds==null && other.getSitePlacementIds()==null) || 
             (this.sitePlacementIds!=null &&
              this.sitePlacementIds.equals(other.getSitePlacementIds())));
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
        if (getSitePlacementIds() != null) {
            _hashCode += getSitePlacementIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddSitePlacementsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddSitePlacementsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitePlacementIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SitePlacementIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong"));
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
