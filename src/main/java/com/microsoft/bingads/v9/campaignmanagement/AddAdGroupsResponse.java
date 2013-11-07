/**
 * AddAdGroupsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class AddAdGroupsResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong adGroupIds;

    public AddAdGroupsResponse() {
    }

    public AddAdGroupsResponse(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong adGroupIds) {
           this.adGroupIds = adGroupIds;
    }


    /**
     * Gets the adGroupIds value for this AddAdGroupsResponse.
     * 
     * @return adGroupIds
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getAdGroupIds() {
        return adGroupIds;
    }


    /**
     * Sets the adGroupIds value for this AddAdGroupsResponse.
     * 
     * @param adGroupIds
     */
    public void setAdGroupIds(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong adGroupIds) {
        this.adGroupIds = adGroupIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddAdGroupsResponse)) return false;
        AddAdGroupsResponse other = (AddAdGroupsResponse) obj;
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
              this.adGroupIds.equals(other.getAdGroupIds())));
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
            _hashCode += getAdGroupIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddAdGroupsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdGroupsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupIds"));
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
