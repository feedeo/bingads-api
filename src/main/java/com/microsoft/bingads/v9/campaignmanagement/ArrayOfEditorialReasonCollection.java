/**
 * ArrayOfEditorialReasonCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfEditorialReasonCollection  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.EditorialReasonCollection[] editorialReasonCollection;

    public ArrayOfEditorialReasonCollection() {
    }

    public ArrayOfEditorialReasonCollection(
           com.microsoft.bingads.v9.campaignmanagement.EditorialReasonCollection[] editorialReasonCollection) {
           this.editorialReasonCollection = editorialReasonCollection;
    }


    /**
     * Gets the editorialReasonCollection value for this ArrayOfEditorialReasonCollection.
     * 
     * @return editorialReasonCollection
     */
    public com.microsoft.bingads.v9.campaignmanagement.EditorialReasonCollection[] getEditorialReasonCollection() {
        return editorialReasonCollection;
    }


    /**
     * Sets the editorialReasonCollection value for this ArrayOfEditorialReasonCollection.
     * 
     * @param editorialReasonCollection
     */
    public void setEditorialReasonCollection(com.microsoft.bingads.v9.campaignmanagement.EditorialReasonCollection[] editorialReasonCollection) {
        this.editorialReasonCollection = editorialReasonCollection;
    }

    public com.microsoft.bingads.v9.campaignmanagement.EditorialReasonCollection getEditorialReasonCollection(int i) {
        return this.editorialReasonCollection[i];
    }

    public void setEditorialReasonCollection(int i, com.microsoft.bingads.v9.campaignmanagement.EditorialReasonCollection _value) {
        this.editorialReasonCollection[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEditorialReasonCollection)) return false;
        ArrayOfEditorialReasonCollection other = (ArrayOfEditorialReasonCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.editorialReasonCollection==null && other.getEditorialReasonCollection()==null) || 
             (this.editorialReasonCollection!=null &&
              java.util.Arrays.equals(this.editorialReasonCollection, other.getEditorialReasonCollection())));
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
        if (getEditorialReasonCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEditorialReasonCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEditorialReasonCollection(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfEditorialReasonCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfEditorialReasonCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialReasonCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialReasonCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialReasonCollection"));
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
