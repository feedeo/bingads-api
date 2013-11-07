/**
 * ArrayOfAdGroupCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfAdGroupCriterion  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] adGroupCriterion;

    public ArrayOfAdGroupCriterion() {
    }

    public ArrayOfAdGroupCriterion(
           com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] adGroupCriterion) {
           this.adGroupCriterion = adGroupCriterion;
    }


    /**
     * Gets the adGroupCriterion value for this ArrayOfAdGroupCriterion.
     * 
     * @return adGroupCriterion
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] getAdGroupCriterion() {
        return adGroupCriterion;
    }


    /**
     * Sets the adGroupCriterion value for this ArrayOfAdGroupCriterion.
     * 
     * @param adGroupCriterion
     */
    public void setAdGroupCriterion(com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion[] adGroupCriterion) {
        this.adGroupCriterion = adGroupCriterion;
    }

    public com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion getAdGroupCriterion(int i) {
        return this.adGroupCriterion[i];
    }

    public void setAdGroupCriterion(int i, com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion _value) {
        this.adGroupCriterion[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdGroupCriterion)) return false;
        ArrayOfAdGroupCriterion other = (ArrayOfAdGroupCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupCriterion==null && other.getAdGroupCriterion()==null) || 
             (this.adGroupCriterion!=null &&
              java.util.Arrays.equals(this.adGroupCriterion, other.getAdGroupCriterion())));
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
        if (getAdGroupCriterion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdGroupCriterion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupCriterion(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdGroupCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdGroupCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterion"));
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
