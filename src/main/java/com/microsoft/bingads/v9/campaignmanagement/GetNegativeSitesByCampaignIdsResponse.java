/**
 * GetNegativeSitesByCampaignIdsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class GetNegativeSitesByCampaignIdsResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeSites campaignNegativeSites;

    public GetNegativeSitesByCampaignIdsResponse() {
    }

    public GetNegativeSitesByCampaignIdsResponse(
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeSites campaignNegativeSites) {
           this.campaignNegativeSites = campaignNegativeSites;
    }


    /**
     * Gets the campaignNegativeSites value for this GetNegativeSitesByCampaignIdsResponse.
     * 
     * @return campaignNegativeSites
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeSites getCampaignNegativeSites() {
        return campaignNegativeSites;
    }


    /**
     * Sets the campaignNegativeSites value for this GetNegativeSitesByCampaignIdsResponse.
     * 
     * @param campaignNegativeSites
     */
    public void setCampaignNegativeSites(com.microsoft.bingads.v9.campaignmanagement.ArrayOfCampaignNegativeSites campaignNegativeSites) {
        this.campaignNegativeSites = campaignNegativeSites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNegativeSitesByCampaignIdsResponse)) return false;
        GetNegativeSitesByCampaignIdsResponse other = (GetNegativeSitesByCampaignIdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignNegativeSites==null && other.getCampaignNegativeSites()==null) || 
             (this.campaignNegativeSites!=null &&
              this.campaignNegativeSites.equals(other.getCampaignNegativeSites())));
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
        if (getCampaignNegativeSites() != null) {
            _hashCode += getCampaignNegativeSites().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNegativeSitesByCampaignIdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetNegativeSitesByCampaignIdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignNegativeSites");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CampaignNegativeSites"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfCampaignNegativeSites"));
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
