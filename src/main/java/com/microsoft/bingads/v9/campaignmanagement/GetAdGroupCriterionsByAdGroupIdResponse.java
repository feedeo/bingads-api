/**
 * GetAdGroupCriterionsByAdGroupIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class GetAdGroupCriterionsByAdGroupIdResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] adGroupCriterions;

    public GetAdGroupCriterionsByAdGroupIdResponse() {
    }

    public GetAdGroupCriterionsByAdGroupIdResponse(
           com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] adGroupCriterions) {
           this.adGroupCriterions = adGroupCriterions;
    }


    /**
     * Gets the adGroupCriterions value for this GetAdGroupCriterionsByAdGroupIdResponse.
     * 
     * @return adGroupCriterions
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] getAdGroupCriterions() {
        return adGroupCriterions;
    }


    /**
     * Sets the adGroupCriterions value for this GetAdGroupCriterionsByAdGroupIdResponse.
     * 
     * @param adGroupCriterions
     */
    public void setAdGroupCriterions(com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] adGroupCriterions) {
        this.adGroupCriterions = adGroupCriterions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAdGroupCriterionsByAdGroupIdResponse)) return false;
        GetAdGroupCriterionsByAdGroupIdResponse other = (GetAdGroupCriterionsByAdGroupIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupCriterions==null && other.getAdGroupCriterions()==null) || 
             (this.adGroupCriterions!=null &&
              java.util.Arrays.equals(this.adGroupCriterions, other.getAdGroupCriterions())));
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
        if (getAdGroupCriterions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdGroupCriterions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupCriterions(), i);
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
        new org.apache.axis.description.TypeDesc(GetAdGroupCriterionsByAdGroupIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetAdGroupCriterionsByAdGroupIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterion"));
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
