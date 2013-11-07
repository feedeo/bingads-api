/**
 * ArrayOfProductConditionCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfProductConditionCollection  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.ProductConditionCollection[] productConditionCollection;

    public ArrayOfProductConditionCollection() {
    }

    public ArrayOfProductConditionCollection(
           com.microsoft.bingads.v9.campaignmanagement.ProductConditionCollection[] productConditionCollection) {
           this.productConditionCollection = productConditionCollection;
    }


    /**
     * Gets the productConditionCollection value for this ArrayOfProductConditionCollection.
     * 
     * @return productConditionCollection
     */
    public com.microsoft.bingads.v9.campaignmanagement.ProductConditionCollection[] getProductConditionCollection() {
        return productConditionCollection;
    }


    /**
     * Sets the productConditionCollection value for this ArrayOfProductConditionCollection.
     * 
     * @param productConditionCollection
     */
    public void setProductConditionCollection(com.microsoft.bingads.v9.campaignmanagement.ProductConditionCollection[] productConditionCollection) {
        this.productConditionCollection = productConditionCollection;
    }

    public com.microsoft.bingads.v9.campaignmanagement.ProductConditionCollection getProductConditionCollection(int i) {
        return this.productConditionCollection[i];
    }

    public void setProductConditionCollection(int i, com.microsoft.bingads.v9.campaignmanagement.ProductConditionCollection _value) {
        this.productConditionCollection[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfProductConditionCollection)) return false;
        ArrayOfProductConditionCollection other = (ArrayOfProductConditionCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productConditionCollection==null && other.getProductConditionCollection()==null) || 
             (this.productConditionCollection!=null &&
              java.util.Arrays.equals(this.productConditionCollection, other.getProductConditionCollection())));
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
        if (getProductConditionCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductConditionCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductConditionCollection(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfProductConditionCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfProductConditionCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productConditionCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ProductConditionCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ProductConditionCollection"));
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
