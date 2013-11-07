/**
 * ArrayOfAdExtensionIdToEntityIdAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfAdExtensionIdToEntityIdAssociation  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AdExtensionIdToEntityIdAssociation[] adExtensionIdToEntityIdAssociation;

    public ArrayOfAdExtensionIdToEntityIdAssociation() {
    }

    public ArrayOfAdExtensionIdToEntityIdAssociation(
           com.microsoft.bingads.v9.campaignmanagement.AdExtensionIdToEntityIdAssociation[] adExtensionIdToEntityIdAssociation) {
           this.adExtensionIdToEntityIdAssociation = adExtensionIdToEntityIdAssociation;
    }


    /**
     * Gets the adExtensionIdToEntityIdAssociation value for this ArrayOfAdExtensionIdToEntityIdAssociation.
     * 
     * @return adExtensionIdToEntityIdAssociation
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdExtensionIdToEntityIdAssociation[] getAdExtensionIdToEntityIdAssociation() {
        return adExtensionIdToEntityIdAssociation;
    }


    /**
     * Sets the adExtensionIdToEntityIdAssociation value for this ArrayOfAdExtensionIdToEntityIdAssociation.
     * 
     * @param adExtensionIdToEntityIdAssociation
     */
    public void setAdExtensionIdToEntityIdAssociation(com.microsoft.bingads.v9.campaignmanagement.AdExtensionIdToEntityIdAssociation[] adExtensionIdToEntityIdAssociation) {
        this.adExtensionIdToEntityIdAssociation = adExtensionIdToEntityIdAssociation;
    }

    public com.microsoft.bingads.v9.campaignmanagement.AdExtensionIdToEntityIdAssociation getAdExtensionIdToEntityIdAssociation(int i) {
        return this.adExtensionIdToEntityIdAssociation[i];
    }

    public void setAdExtensionIdToEntityIdAssociation(int i, com.microsoft.bingads.v9.campaignmanagement.AdExtensionIdToEntityIdAssociation _value) {
        this.adExtensionIdToEntityIdAssociation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdExtensionIdToEntityIdAssociation)) return false;
        ArrayOfAdExtensionIdToEntityIdAssociation other = (ArrayOfAdExtensionIdToEntityIdAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExtensionIdToEntityIdAssociation==null && other.getAdExtensionIdToEntityIdAssociation()==null) || 
             (this.adExtensionIdToEntityIdAssociation!=null &&
              java.util.Arrays.equals(this.adExtensionIdToEntityIdAssociation, other.getAdExtensionIdToEntityIdAssociation())));
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
        if (getAdExtensionIdToEntityIdAssociation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdExtensionIdToEntityIdAssociation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensionIdToEntityIdAssociation(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdExtensionIdToEntityIdAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionIdToEntityIdAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionIdToEntityIdAssociation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionIdToEntityIdAssociation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionIdToEntityIdAssociation"));
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
