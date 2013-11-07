/**
 * ArrayOfEditorialReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfEditorialReason  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.EditorialReason[] editorialReason;

    public ArrayOfEditorialReason() {
    }

    public ArrayOfEditorialReason(
           com.microsoft.bingads.v9.campaignmanagement.EditorialReason[] editorialReason) {
           this.editorialReason = editorialReason;
    }


    /**
     * Gets the editorialReason value for this ArrayOfEditorialReason.
     * 
     * @return editorialReason
     */
    public com.microsoft.bingads.v9.campaignmanagement.EditorialReason[] getEditorialReason() {
        return editorialReason;
    }


    /**
     * Sets the editorialReason value for this ArrayOfEditorialReason.
     * 
     * @param editorialReason
     */
    public void setEditorialReason(com.microsoft.bingads.v9.campaignmanagement.EditorialReason[] editorialReason) {
        this.editorialReason = editorialReason;
    }

    public com.microsoft.bingads.v9.campaignmanagement.EditorialReason getEditorialReason(int i) {
        return this.editorialReason[i];
    }

    public void setEditorialReason(int i, com.microsoft.bingads.v9.campaignmanagement.EditorialReason _value) {
        this.editorialReason[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEditorialReason)) return false;
        ArrayOfEditorialReason other = (ArrayOfEditorialReason) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.editorialReason==null && other.getEditorialReason()==null) || 
             (this.editorialReason!=null &&
              java.util.Arrays.equals(this.editorialReason, other.getEditorialReason())));
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
        if (getEditorialReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEditorialReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEditorialReason(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfEditorialReason.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfEditorialReason"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialReason"));
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
