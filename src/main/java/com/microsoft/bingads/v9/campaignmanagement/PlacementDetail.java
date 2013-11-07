/**
 * PlacementDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class PlacementDetail  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.ImpressionsPerDayRange impressionsRangePerDay;

    private java.lang.String pathName;

    private java.lang.Long placementId;

    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfMediaType supportedMediaTypes;

    public PlacementDetail() {
    }

    public PlacementDetail(
           com.microsoft.bingads.v9.campaignmanagement.ImpressionsPerDayRange impressionsRangePerDay,
           java.lang.String pathName,
           java.lang.Long placementId,
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfMediaType supportedMediaTypes) {
           this.impressionsRangePerDay = impressionsRangePerDay;
           this.pathName = pathName;
           this.placementId = placementId;
           this.supportedMediaTypes = supportedMediaTypes;
    }


    /**
     * Gets the impressionsRangePerDay value for this PlacementDetail.
     * 
     * @return impressionsRangePerDay
     */
    public com.microsoft.bingads.v9.campaignmanagement.ImpressionsPerDayRange getImpressionsRangePerDay() {
        return impressionsRangePerDay;
    }


    /**
     * Sets the impressionsRangePerDay value for this PlacementDetail.
     * 
     * @param impressionsRangePerDay
     */
    public void setImpressionsRangePerDay(com.microsoft.bingads.v9.campaignmanagement.ImpressionsPerDayRange impressionsRangePerDay) {
        this.impressionsRangePerDay = impressionsRangePerDay;
    }


    /**
     * Gets the pathName value for this PlacementDetail.
     * 
     * @return pathName
     */
    public java.lang.String getPathName() {
        return pathName;
    }


    /**
     * Sets the pathName value for this PlacementDetail.
     * 
     * @param pathName
     */
    public void setPathName(java.lang.String pathName) {
        this.pathName = pathName;
    }


    /**
     * Gets the placementId value for this PlacementDetail.
     * 
     * @return placementId
     */
    public java.lang.Long getPlacementId() {
        return placementId;
    }


    /**
     * Sets the placementId value for this PlacementDetail.
     * 
     * @param placementId
     */
    public void setPlacementId(java.lang.Long placementId) {
        this.placementId = placementId;
    }


    /**
     * Gets the supportedMediaTypes value for this PlacementDetail.
     * 
     * @return supportedMediaTypes
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfMediaType getSupportedMediaTypes() {
        return supportedMediaTypes;
    }


    /**
     * Sets the supportedMediaTypes value for this PlacementDetail.
     * 
     * @param supportedMediaTypes
     */
    public void setSupportedMediaTypes(com.microsoft.bingads.v9.campaignmanagement.ArrayOfMediaType supportedMediaTypes) {
        this.supportedMediaTypes = supportedMediaTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementDetail)) return false;
        PlacementDetail other = (PlacementDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.impressionsRangePerDay==null && other.getImpressionsRangePerDay()==null) || 
             (this.impressionsRangePerDay!=null &&
              this.impressionsRangePerDay.equals(other.getImpressionsRangePerDay()))) &&
            ((this.pathName==null && other.getPathName()==null) || 
             (this.pathName!=null &&
              this.pathName.equals(other.getPathName()))) &&
            ((this.placementId==null && other.getPlacementId()==null) || 
             (this.placementId!=null &&
              this.placementId.equals(other.getPlacementId()))) &&
            ((this.supportedMediaTypes==null && other.getSupportedMediaTypes()==null) || 
             (this.supportedMediaTypes!=null &&
              this.supportedMediaTypes.equals(other.getSupportedMediaTypes())));
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
        if (getImpressionsRangePerDay() != null) {
            _hashCode += getImpressionsRangePerDay().hashCode();
        }
        if (getPathName() != null) {
            _hashCode += getPathName().hashCode();
        }
        if (getPlacementId() != null) {
            _hashCode += getPlacementId().hashCode();
        }
        if (getSupportedMediaTypes() != null) {
            _hashCode += getSupportedMediaTypes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacementDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PlacementDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressionsRangePerDay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ImpressionsRangePerDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ImpressionsPerDayRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PathName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PlacementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedMediaTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SupportedMediaTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfMediaType"));
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
