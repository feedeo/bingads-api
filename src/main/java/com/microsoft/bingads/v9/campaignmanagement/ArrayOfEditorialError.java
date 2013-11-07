/**
 * ArrayOfEditorialError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfEditorialError  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.EditorialError[] editorialError;

    public ArrayOfEditorialError() {
    }

    public ArrayOfEditorialError(
           com.microsoft.bingads.v9.campaignmanagement.EditorialError[] editorialError) {
           this.editorialError = editorialError;
    }


    /**
     * Gets the editorialError value for this ArrayOfEditorialError.
     * 
     * @return editorialError
     */
    public com.microsoft.bingads.v9.campaignmanagement.EditorialError[] getEditorialError() {
        return editorialError;
    }


    /**
     * Sets the editorialError value for this ArrayOfEditorialError.
     * 
     * @param editorialError
     */
    public void setEditorialError(com.microsoft.bingads.v9.campaignmanagement.EditorialError[] editorialError) {
        this.editorialError = editorialError;
    }

    public com.microsoft.bingads.v9.campaignmanagement.EditorialError getEditorialError(int i) {
        return this.editorialError[i];
    }

    public void setEditorialError(int i, com.microsoft.bingads.v9.campaignmanagement.EditorialError _value) {
        this.editorialError[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEditorialError)) return false;
        ArrayOfEditorialError other = (ArrayOfEditorialError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.editorialError==null && other.getEditorialError()==null) || 
             (this.editorialError!=null &&
              java.util.Arrays.equals(this.editorialError, other.getEditorialError())));
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
        if (getEditorialError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEditorialError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEditorialError(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfEditorialError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfEditorialError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialError");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialError"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialError"));
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
