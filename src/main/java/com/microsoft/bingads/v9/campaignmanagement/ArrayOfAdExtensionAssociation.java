/**
 * ArrayOfAdExtensionAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfAdExtensionAssociation  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociation[] adExtensionAssociation;

    public ArrayOfAdExtensionAssociation() {
    }

    public ArrayOfAdExtensionAssociation(
           com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociation[] adExtensionAssociation) {
           this.adExtensionAssociation = adExtensionAssociation;
    }


    /**
     * Gets the adExtensionAssociation value for this ArrayOfAdExtensionAssociation.
     * 
     * @return adExtensionAssociation
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociation[] getAdExtensionAssociation() {
        return adExtensionAssociation;
    }


    /**
     * Sets the adExtensionAssociation value for this ArrayOfAdExtensionAssociation.
     * 
     * @param adExtensionAssociation
     */
    public void setAdExtensionAssociation(com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociation[] adExtensionAssociation) {
        this.adExtensionAssociation = adExtensionAssociation;
    }

    public com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociation getAdExtensionAssociation(int i) {
        return this.adExtensionAssociation[i];
    }

    public void setAdExtensionAssociation(int i, com.microsoft.bingads.v9.campaignmanagement.AdExtensionAssociation _value) {
        this.adExtensionAssociation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdExtensionAssociation)) return false;
        ArrayOfAdExtensionAssociation other = (ArrayOfAdExtensionAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExtensionAssociation==null && other.getAdExtensionAssociation()==null) || 
             (this.adExtensionAssociation!=null &&
              java.util.Arrays.equals(this.adExtensionAssociation, other.getAdExtensionAssociation())));
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
        if (getAdExtensionAssociation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdExtensionAssociation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensionAssociation(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdExtensionAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionAssociation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionAssociation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionAssociation"));
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
