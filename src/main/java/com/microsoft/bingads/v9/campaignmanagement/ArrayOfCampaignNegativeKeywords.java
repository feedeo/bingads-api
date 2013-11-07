/**
 * ArrayOfCampaignNegativeKeywords.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfCampaignNegativeKeywords  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.CampaignNegativeKeywords[] campaignNegativeKeywords;

    public ArrayOfCampaignNegativeKeywords() {
    }

    public ArrayOfCampaignNegativeKeywords(
           com.microsoft.bingads.v9.campaignmanagement.CampaignNegativeKeywords[] campaignNegativeKeywords) {
           this.campaignNegativeKeywords = campaignNegativeKeywords;
    }


    /**
     * Gets the campaignNegativeKeywords value for this ArrayOfCampaignNegativeKeywords.
     * 
     * @return campaignNegativeKeywords
     */
    public com.microsoft.bingads.v9.campaignmanagement.CampaignNegativeKeywords[] getCampaignNegativeKeywords() {
        return campaignNegativeKeywords;
    }


    /**
     * Sets the campaignNegativeKeywords value for this ArrayOfCampaignNegativeKeywords.
     * 
     * @param campaignNegativeKeywords
     */
    public void setCampaignNegativeKeywords(com.microsoft.bingads.v9.campaignmanagement.CampaignNegativeKeywords[] campaignNegativeKeywords) {
        this.campaignNegativeKeywords = campaignNegativeKeywords;
    }

    public com.microsoft.bingads.v9.campaignmanagement.CampaignNegativeKeywords getCampaignNegativeKeywords(int i) {
        return this.campaignNegativeKeywords[i];
    }

    public void setCampaignNegativeKeywords(int i, com.microsoft.bingads.v9.campaignmanagement.CampaignNegativeKeywords _value) {
        this.campaignNegativeKeywords[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCampaignNegativeKeywords)) return false;
        ArrayOfCampaignNegativeKeywords other = (ArrayOfCampaignNegativeKeywords) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignNegativeKeywords==null && other.getCampaignNegativeKeywords()==null) || 
             (this.campaignNegativeKeywords!=null &&
              java.util.Arrays.equals(this.campaignNegativeKeywords, other.getCampaignNegativeKeywords())));
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
        if (getCampaignNegativeKeywords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignNegativeKeywords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignNegativeKeywords(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCampaignNegativeKeywords.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCampaignNegativeKeywords"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignNegativeKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignNegativeKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignNegativeKeywords"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
