/**
 * GetTargetsByAdGroupIdsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class GetTargetsByAdGroupIdsRequest  implements java.io.Serializable {
    private long[] adGroupIds;

    private java.lang.String locationTargetVersion;

    public GetTargetsByAdGroupIdsRequest() {
    }

    public GetTargetsByAdGroupIdsRequest(
           long[] adGroupIds,
           java.lang.String locationTargetVersion) {
           this.adGroupIds = adGroupIds;
           this.locationTargetVersion = locationTargetVersion;
    }


    /**
     * Gets the adGroupIds value for this GetTargetsByAdGroupIdsRequest.
     * 
     * @return adGroupIds
     */
    public long[] getAdGroupIds() {
        return adGroupIds;
    }


    /**
     * Sets the adGroupIds value for this GetTargetsByAdGroupIdsRequest.
     * 
     * @param adGroupIds
     */
    public void setAdGroupIds(long[] adGroupIds) {
        this.adGroupIds = adGroupIds;
    }


    /**
     * Gets the locationTargetVersion value for this GetTargetsByAdGroupIdsRequest.
     * 
     * @return locationTargetVersion
     */
    public java.lang.String getLocationTargetVersion() {
        return locationTargetVersion;
    }


    /**
     * Sets the locationTargetVersion value for this GetTargetsByAdGroupIdsRequest.
     * 
     * @param locationTargetVersion
     */
    public void setLocationTargetVersion(java.lang.String locationTargetVersion) {
        this.locationTargetVersion = locationTargetVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTargetsByAdGroupIdsRequest)) return false;
        GetTargetsByAdGroupIdsRequest other = (GetTargetsByAdGroupIdsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupIds==null && other.getAdGroupIds()==null) || 
             (this.adGroupIds!=null &&
              java.util.Arrays.equals(this.adGroupIds, other.getAdGroupIds()))) &&
            ((this.locationTargetVersion==null && other.getLocationTargetVersion()==null) || 
             (this.locationTargetVersion!=null &&
              this.locationTargetVersion.equals(other.getLocationTargetVersion())));
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
        if (getAdGroupIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdGroupIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationTargetVersion() != null) {
            _hashCode += getLocationTargetVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTargetsByAdGroupIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsByAdGroupIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationTargetVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "LocationTargetVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
