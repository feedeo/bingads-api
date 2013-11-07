/**
 * Ad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class Ad  implements java.io.Serializable {
    private java.lang.Long devicePreference;

    private com.microsoft.bingads.v9.campaignmanagement.AdEditorialStatus editorialStatus;

    private com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;

    private java.lang.Long id;

    private com.microsoft.bingads.v9.campaignmanagement.AdStatus status;

    private com.microsoft.bingads.v9.campaignmanagement.AdType type;

    public Ad() {
    }

    public Ad(
           java.lang.Long devicePreference,
           com.microsoft.bingads.v9.campaignmanagement.AdEditorialStatus editorialStatus,
           com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
           java.lang.Long id,
           com.microsoft.bingads.v9.campaignmanagement.AdStatus status,
           com.microsoft.bingads.v9.campaignmanagement.AdType type) {
           this.devicePreference = devicePreference;
           this.editorialStatus = editorialStatus;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.id = id;
           this.status = status;
           this.type = type;
    }


    /**
     * Gets the devicePreference value for this Ad.
     * 
     * @return devicePreference
     */
    public java.lang.Long getDevicePreference() {
        return devicePreference;
    }


    /**
     * Sets the devicePreference value for this Ad.
     * 
     * @param devicePreference
     */
    public void setDevicePreference(java.lang.Long devicePreference) {
        this.devicePreference = devicePreference;
    }


    /**
     * Gets the editorialStatus value for this Ad.
     * 
     * @return editorialStatus
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }


    /**
     * Sets the editorialStatus value for this Ad.
     * 
     * @param editorialStatus
     */
    public void setEditorialStatus(com.microsoft.bingads.v9.campaignmanagement.AdEditorialStatus editorialStatus) {
        this.editorialStatus = editorialStatus;
    }


    /**
     * Gets the forwardCompatibilityMap value for this Ad.
     * 
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    /**
     * Sets the forwardCompatibilityMap value for this Ad.
     * 
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v9.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }


    /**
     * Gets the id value for this Ad.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Ad.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the status value for this Ad.
     * 
     * @return status
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Ad.
     * 
     * @param status
     */
    public void setStatus(com.microsoft.bingads.v9.campaignmanagement.AdStatus status) {
        this.status = status;
    }


    /**
     * Gets the type value for this Ad.
     * 
     * @return type
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdType getType() {
        return type;
    }


    /**
     * Sets the type value for this Ad.
     * 
     * @param type
     */
    public void setType(com.microsoft.bingads.v9.campaignmanagement.AdType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ad)) return false;
        Ad other = (Ad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.devicePreference==null && other.getDevicePreference()==null) || 
             (this.devicePreference!=null &&
              this.devicePreference.equals(other.getDevicePreference()))) &&
            ((this.editorialStatus==null && other.getEditorialStatus()==null) || 
             (this.editorialStatus!=null &&
              this.editorialStatus.equals(other.getEditorialStatus()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) || 
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
        }
        if (getEditorialStatus() != null) {
            _hashCode += getEditorialStatus().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Ad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DevicePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdEditorialStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ForwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdType"));
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
