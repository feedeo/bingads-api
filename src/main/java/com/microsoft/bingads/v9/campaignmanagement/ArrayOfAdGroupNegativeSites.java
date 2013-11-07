/**
 * ArrayOfAdGroupNegativeSites.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfAdGroupNegativeSites  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AdGroupNegativeSites[] adGroupNegativeSites;

    public ArrayOfAdGroupNegativeSites() {
    }

    public ArrayOfAdGroupNegativeSites(
           com.microsoft.bingads.v9.campaignmanagement.AdGroupNegativeSites[] adGroupNegativeSites) {
           this.adGroupNegativeSites = adGroupNegativeSites;
    }


    /**
     * Gets the adGroupNegativeSites value for this ArrayOfAdGroupNegativeSites.
     * 
     * @return adGroupNegativeSites
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdGroupNegativeSites[] getAdGroupNegativeSites() {
        return adGroupNegativeSites;
    }


    /**
     * Sets the adGroupNegativeSites value for this ArrayOfAdGroupNegativeSites.
     * 
     * @param adGroupNegativeSites
     */
    public void setAdGroupNegativeSites(com.microsoft.bingads.v9.campaignmanagement.AdGroupNegativeSites[] adGroupNegativeSites) {
        this.adGroupNegativeSites = adGroupNegativeSites;
    }

    public com.microsoft.bingads.v9.campaignmanagement.AdGroupNegativeSites getAdGroupNegativeSites(int i) {
        return this.adGroupNegativeSites[i];
    }

    public void setAdGroupNegativeSites(int i, com.microsoft.bingads.v9.campaignmanagement.AdGroupNegativeSites _value) {
        this.adGroupNegativeSites[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdGroupNegativeSites)) return false;
        ArrayOfAdGroupNegativeSites other = (ArrayOfAdGroupNegativeSites) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupNegativeSites==null && other.getAdGroupNegativeSites()==null) || 
             (this.adGroupNegativeSites!=null &&
              java.util.Arrays.equals(this.adGroupNegativeSites, other.getAdGroupNegativeSites())));
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
        if (getAdGroupNegativeSites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdGroupNegativeSites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupNegativeSites(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdGroupNegativeSites.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdGroupNegativeSites"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupNegativeSites");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupNegativeSites"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupNegativeSites"));
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
