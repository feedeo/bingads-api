/**
 * AdExtensionEditorialReasonCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class AdExtensionEditorialReasonCollection  implements java.io.Serializable {
    private java.lang.Long adExtensionId;

    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionEditorialReason reasons;

    public AdExtensionEditorialReasonCollection() {
    }

    public AdExtensionEditorialReasonCollection(
           java.lang.Long adExtensionId,
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionEditorialReason reasons) {
           this.adExtensionId = adExtensionId;
           this.reasons = reasons;
    }


    /**
     * Gets the adExtensionId value for this AdExtensionEditorialReasonCollection.
     * 
     * @return adExtensionId
     */
    public java.lang.Long getAdExtensionId() {
        return adExtensionId;
    }


    /**
     * Sets the adExtensionId value for this AdExtensionEditorialReasonCollection.
     * 
     * @param adExtensionId
     */
    public void setAdExtensionId(java.lang.Long adExtensionId) {
        this.adExtensionId = adExtensionId;
    }


    /**
     * Gets the reasons value for this AdExtensionEditorialReasonCollection.
     * 
     * @return reasons
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionEditorialReason getReasons() {
        return reasons;
    }


    /**
     * Sets the reasons value for this AdExtensionEditorialReasonCollection.
     * 
     * @param reasons
     */
    public void setReasons(com.microsoft.bingads.v9.campaignmanagement.ArrayOfAdExtensionEditorialReason reasons) {
        this.reasons = reasons;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtensionEditorialReasonCollection)) return false;
        AdExtensionEditorialReasonCollection other = (AdExtensionEditorialReasonCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExtensionId==null && other.getAdExtensionId()==null) || 
             (this.adExtensionId!=null &&
              this.adExtensionId.equals(other.getAdExtensionId()))) &&
            ((this.reasons==null && other.getReasons()==null) || 
             (this.reasons!=null &&
              this.reasons.equals(other.getReasons())));
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
        if (getAdExtensionId() != null) {
            _hashCode += getAdExtensionId().hashCode();
        }
        if (getReasons() != null) {
            _hashCode += getReasons().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdExtensionEditorialReasonCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionEditorialReasonCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Reasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionEditorialReason"));
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
