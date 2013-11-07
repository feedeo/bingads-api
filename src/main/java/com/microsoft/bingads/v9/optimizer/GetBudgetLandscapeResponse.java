/**
 * GetBudgetLandscapeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public class GetBudgetLandscapeResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.ArrayOfCampaignBudgetLandscape campaignBudgetLandscapes;

    public GetBudgetLandscapeResponse() {
    }

    public GetBudgetLandscapeResponse(
           com.microsoft.bingads.v9.optimizer.entities.ArrayOfCampaignBudgetLandscape campaignBudgetLandscapes) {
           this.campaignBudgetLandscapes = campaignBudgetLandscapes;
    }


    /**
     * Gets the campaignBudgetLandscapes value for this GetBudgetLandscapeResponse.
     * 
     * @return campaignBudgetLandscapes
     */
    public com.microsoft.bingads.v9.optimizer.entities.ArrayOfCampaignBudgetLandscape getCampaignBudgetLandscapes() {
        return campaignBudgetLandscapes;
    }


    /**
     * Sets the campaignBudgetLandscapes value for this GetBudgetLandscapeResponse.
     * 
     * @param campaignBudgetLandscapes
     */
    public void setCampaignBudgetLandscapes(com.microsoft.bingads.v9.optimizer.entities.ArrayOfCampaignBudgetLandscape campaignBudgetLandscapes) {
        this.campaignBudgetLandscapes = campaignBudgetLandscapes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBudgetLandscapeResponse)) return false;
        GetBudgetLandscapeResponse other = (GetBudgetLandscapeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignBudgetLandscapes==null && other.getCampaignBudgetLandscapes()==null) || 
             (this.campaignBudgetLandscapes!=null &&
              this.campaignBudgetLandscapes.equals(other.getCampaignBudgetLandscapes())));
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
        if (getCampaignBudgetLandscapes() != null) {
            _hashCode += getCampaignBudgetLandscapes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBudgetLandscapeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBudgetLandscapeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignBudgetLandscapes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "CampaignBudgetLandscapes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfCampaignBudgetLandscape"));
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
