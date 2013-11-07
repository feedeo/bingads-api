/**
 * ArrayOfAdExtensionEditorialReasonCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfAdExtensionEditorialReasonCollection  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialReasonCollection[] adExtensionEditorialReasonCollection;

    public ArrayOfAdExtensionEditorialReasonCollection() {
    }

    public ArrayOfAdExtensionEditorialReasonCollection(
           com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialReasonCollection[] adExtensionEditorialReasonCollection) {
           this.adExtensionEditorialReasonCollection = adExtensionEditorialReasonCollection;
    }


    /**
     * Gets the adExtensionEditorialReasonCollection value for this ArrayOfAdExtensionEditorialReasonCollection.
     * 
     * @return adExtensionEditorialReasonCollection
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialReasonCollection[] getAdExtensionEditorialReasonCollection() {
        return adExtensionEditorialReasonCollection;
    }


    /**
     * Sets the adExtensionEditorialReasonCollection value for this ArrayOfAdExtensionEditorialReasonCollection.
     * 
     * @param adExtensionEditorialReasonCollection
     */
    public void setAdExtensionEditorialReasonCollection(com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialReasonCollection[] adExtensionEditorialReasonCollection) {
        this.adExtensionEditorialReasonCollection = adExtensionEditorialReasonCollection;
    }

    public com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialReasonCollection getAdExtensionEditorialReasonCollection(int i) {
        return this.adExtensionEditorialReasonCollection[i];
    }

    public void setAdExtensionEditorialReasonCollection(int i, com.microsoft.bingads.v9.campaignmanagement.AdExtensionEditorialReasonCollection _value) {
        this.adExtensionEditorialReasonCollection[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdExtensionEditorialReasonCollection)) return false;
        ArrayOfAdExtensionEditorialReasonCollection other = (ArrayOfAdExtensionEditorialReasonCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExtensionEditorialReasonCollection==null && other.getAdExtensionEditorialReasonCollection()==null) || 
             (this.adExtensionEditorialReasonCollection!=null &&
              java.util.Arrays.equals(this.adExtensionEditorialReasonCollection, other.getAdExtensionEditorialReasonCollection())));
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
        if (getAdExtensionEditorialReasonCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdExtensionEditorialReasonCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensionEditorialReasonCollection(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdExtensionEditorialReasonCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAdExtensionEditorialReasonCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionEditorialReasonCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionEditorialReasonCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdExtensionEditorialReasonCollection"));
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
