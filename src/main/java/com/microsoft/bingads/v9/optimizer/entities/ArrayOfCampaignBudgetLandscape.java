/**
 * ArrayOfCampaignBudgetLandscape.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class ArrayOfCampaignBudgetLandscape  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.CampaignBudgetLandscape[] campaignBudgetLandscape;

    public ArrayOfCampaignBudgetLandscape() {
    }

    public ArrayOfCampaignBudgetLandscape(
           com.microsoft.bingads.v9.optimizer.entities.CampaignBudgetLandscape[] campaignBudgetLandscape) {
           this.campaignBudgetLandscape = campaignBudgetLandscape;
    }


    /**
     * Gets the campaignBudgetLandscape value for this ArrayOfCampaignBudgetLandscape.
     * 
     * @return campaignBudgetLandscape
     */
    public com.microsoft.bingads.v9.optimizer.entities.CampaignBudgetLandscape[] getCampaignBudgetLandscape() {
        return campaignBudgetLandscape;
    }


    /**
     * Sets the campaignBudgetLandscape value for this ArrayOfCampaignBudgetLandscape.
     * 
     * @param campaignBudgetLandscape
     */
    public void setCampaignBudgetLandscape(com.microsoft.bingads.v9.optimizer.entities.CampaignBudgetLandscape[] campaignBudgetLandscape) {
        this.campaignBudgetLandscape = campaignBudgetLandscape;
    }

    public com.microsoft.bingads.v9.optimizer.entities.CampaignBudgetLandscape getCampaignBudgetLandscape(int i) {
        return this.campaignBudgetLandscape[i];
    }

    public void setCampaignBudgetLandscape(int i, com.microsoft.bingads.v9.optimizer.entities.CampaignBudgetLandscape _value) {
        this.campaignBudgetLandscape[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCampaignBudgetLandscape)) return false;
        ArrayOfCampaignBudgetLandscape other = (ArrayOfCampaignBudgetLandscape) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignBudgetLandscape==null && other.getCampaignBudgetLandscape()==null) || 
             (this.campaignBudgetLandscape!=null &&
              java.util.Arrays.equals(this.campaignBudgetLandscape, other.getCampaignBudgetLandscape())));
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
        if (getCampaignBudgetLandscape() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignBudgetLandscape());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignBudgetLandscape(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCampaignBudgetLandscape.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfCampaignBudgetLandscape"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignBudgetLandscape");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CampaignBudgetLandscape"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CampaignBudgetLandscape"));
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
