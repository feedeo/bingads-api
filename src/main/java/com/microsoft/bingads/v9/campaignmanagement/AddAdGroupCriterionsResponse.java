/**
 * AddAdGroupCriterionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class AddAdGroupCriterionsResponse  implements java.io.Serializable {
    private long[] adGroupCriterionIds;

    public AddAdGroupCriterionsResponse() {
    }

    public AddAdGroupCriterionsResponse(
           long[] adGroupCriterionIds) {
           this.adGroupCriterionIds = adGroupCriterionIds;
    }


    /**
     * Gets the adGroupCriterionIds value for this AddAdGroupCriterionsResponse.
     * 
     * @return adGroupCriterionIds
     */
    public long[] getAdGroupCriterionIds() {
        return adGroupCriterionIds;
    }


    /**
     * Sets the adGroupCriterionIds value for this AddAdGroupCriterionsResponse.
     * 
     * @param adGroupCriterionIds
     */
    public void setAdGroupCriterionIds(long[] adGroupCriterionIds) {
        this.adGroupCriterionIds = adGroupCriterionIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddAdGroupCriterionsResponse)) return false;
        AddAdGroupCriterionsResponse other = (AddAdGroupCriterionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupCriterionIds==null && other.getAdGroupCriterionIds()==null) || 
             (this.adGroupCriterionIds!=null &&
              java.util.Arrays.equals(this.adGroupCriterionIds, other.getAdGroupCriterionIds())));
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
        if (getAdGroupCriterionIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdGroupCriterionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupCriterionIds(), i);
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
        new org.apache.axis.description.TypeDesc(AddAdGroupCriterionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">AddAdGroupCriterionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
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
