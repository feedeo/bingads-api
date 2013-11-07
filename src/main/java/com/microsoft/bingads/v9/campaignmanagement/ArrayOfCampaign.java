/**
 * ArrayOfCampaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfCampaign  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.Campaign[] campaign;

    public ArrayOfCampaign() {
    }

    public ArrayOfCampaign(
           com.microsoft.bingads.v9.campaignmanagement.Campaign[] campaign) {
           this.campaign = campaign;
    }


    /**
     * Gets the campaign value for this ArrayOfCampaign.
     * 
     * @return campaign
     */
    public com.microsoft.bingads.v9.campaignmanagement.Campaign[] getCampaign() {
        return campaign;
    }


    /**
     * Sets the campaign value for this ArrayOfCampaign.
     * 
     * @param campaign
     */
    public void setCampaign(com.microsoft.bingads.v9.campaignmanagement.Campaign[] campaign) {
        this.campaign = campaign;
    }

    public com.microsoft.bingads.v9.campaignmanagement.Campaign getCampaign(int i) {
        return this.campaign[i];
    }

    public void setCampaign(int i, com.microsoft.bingads.v9.campaignmanagement.Campaign _value) {
        this.campaign[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCampaign)) return false;
        ArrayOfCampaign other = (ArrayOfCampaign) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaign==null && other.getCampaign()==null) || 
             (this.campaign!=null &&
              java.util.Arrays.equals(this.campaign, other.getCampaign())));
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
        if (getCampaign() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaign());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaign(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCampaign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCampaign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Campaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Campaign"));
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
