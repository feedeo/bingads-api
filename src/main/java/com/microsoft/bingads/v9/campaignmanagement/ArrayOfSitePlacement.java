/**
 * ArrayOfSitePlacement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfSitePlacement  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.SitePlacement[] sitePlacement;

    public ArrayOfSitePlacement() {
    }

    public ArrayOfSitePlacement(
           com.microsoft.bingads.v9.campaignmanagement.SitePlacement[] sitePlacement) {
           this.sitePlacement = sitePlacement;
    }


    /**
     * Gets the sitePlacement value for this ArrayOfSitePlacement.
     * 
     * @return sitePlacement
     */
    public com.microsoft.bingads.v9.campaignmanagement.SitePlacement[] getSitePlacement() {
        return sitePlacement;
    }


    /**
     * Sets the sitePlacement value for this ArrayOfSitePlacement.
     * 
     * @param sitePlacement
     */
    public void setSitePlacement(com.microsoft.bingads.v9.campaignmanagement.SitePlacement[] sitePlacement) {
        this.sitePlacement = sitePlacement;
    }

    public com.microsoft.bingads.v9.campaignmanagement.SitePlacement getSitePlacement(int i) {
        return this.sitePlacement[i];
    }

    public void setSitePlacement(int i, com.microsoft.bingads.v9.campaignmanagement.SitePlacement _value) {
        this.sitePlacement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfSitePlacement)) return false;
        ArrayOfSitePlacement other = (ArrayOfSitePlacement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sitePlacement==null && other.getSitePlacement()==null) || 
             (this.sitePlacement!=null &&
              java.util.Arrays.equals(this.sitePlacement, other.getSitePlacement())));
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
        if (getSitePlacement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSitePlacement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSitePlacement(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfSitePlacement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfSitePlacement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitePlacement");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SitePlacement"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "SitePlacement"));
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
