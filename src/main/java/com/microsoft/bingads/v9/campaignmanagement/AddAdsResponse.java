/**
 * AddAdsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class AddAdsResponse  implements java.io.Serializable {
    private long[] adIds;

    private com.microsoft.bingads.v9.campaignmanagement.BatchError[] partialErrors;

    public AddAdsResponse() {
    }

    public AddAdsResponse(
           long[] adIds,
           com.microsoft.bingads.v9.campaignmanagement.BatchError[] partialErrors) {
           this.adIds = adIds;
           this.partialErrors = partialErrors;
    }


    /**
     * Gets the adIds value for this AddAdsResponse.
     * 
     * @return adIds
     */
    public long[] getAdIds() {
        return adIds;
    }


    /**
     * Sets the adIds value for this AddAdsResponse.
     * 
     * @param adIds
     */
    public void setAdIds(long[] adIds) {
        this.adIds = adIds;
    }


    /**
     * Gets the partialErrors value for this AddAdsResponse.
     * 
     * @return partialErrors
     */
    public com.microsoft.bingads.v9.campaignmanagement.BatchError[] getPartialErrors() {
        return partialErrors;
    }


    /**
     * Sets the partialErrors value for this AddAdsResponse.
     * 
     * @param partialErrors
     */
    public void setPartialErrors(com.microsoft.bingads.v9.campaignmanagement.BatchError[] partialErrors) {
        this.partialErrors = partialErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddAdsResponse)) return false;
        AddAdsResponse other = (AddAdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adIds==null && other.getAdIds()==null) || 
             (this.adIds!=null &&
              java.util.Arrays.equals(this.adIds, other.getAdIds()))) &&
            ((this.partialErrors==null && other.getPartialErrors()==null) || 
             (this.partialErrors!=null &&
              java.util.Arrays.equals(this.partialErrors, other.getPartialErrors())));
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
        if (getAdIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartialErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartialErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartialErrors(), i);
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
        new org.apache.axis.description.TypeDesc(AddAdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "PartialErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BatchError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BatchError"));
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
