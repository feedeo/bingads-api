/**
 * ProductAdExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ProductAdExtension  extends com.microsoft.bingads.v9.campaignmanagement.AdExtension  implements java.io.Serializable {
    private java.lang.String name;

    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfProductConditionCollection productSelection;

    private java.lang.Long storeId;

    private java.lang.String storeName;

    public ProductAdExtension() {
    }

    public ProductAdExtension(
           com.microsoft.bingads.v9.schemas.generic.ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap,
           java.lang.Long id,
           com.microsoft.bingads.v9.campaignmanagement.AdExtensionStatus status,
           java.lang.String type,
           java.lang.Integer version,
           java.lang.String name,
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfProductConditionCollection productSelection,
           java.lang.Long storeId,
           java.lang.String storeName) {
        super(
            forwardCompatibilityMap,
            id,
            status,
            type,
            version);
        this.name = name;
        this.productSelection = productSelection;
        this.storeId = storeId;
        this.storeName = storeName;
    }


    /**
     * Gets the name value for this ProductAdExtension.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductAdExtension.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the productSelection value for this ProductAdExtension.
     * 
     * @return productSelection
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfProductConditionCollection getProductSelection() {
        return productSelection;
    }


    /**
     * Sets the productSelection value for this ProductAdExtension.
     * 
     * @param productSelection
     */
    public void setProductSelection(com.microsoft.bingads.v9.campaignmanagement.ArrayOfProductConditionCollection productSelection) {
        this.productSelection = productSelection;
    }


    /**
     * Gets the storeId value for this ProductAdExtension.
     * 
     * @return storeId
     */
    public java.lang.Long getStoreId() {
        return storeId;
    }


    /**
     * Sets the storeId value for this ProductAdExtension.
     * 
     * @param storeId
     */
    public void setStoreId(java.lang.Long storeId) {
        this.storeId = storeId;
    }


    /**
     * Gets the storeName value for this ProductAdExtension.
     * 
     * @return storeName
     */
    public java.lang.String getStoreName() {
        return storeName;
    }


    /**
     * Sets the storeName value for this ProductAdExtension.
     * 
     * @param storeName
     */
    public void setStoreName(java.lang.String storeName) {
        this.storeName = storeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductAdExtension)) return false;
        ProductAdExtension other = (ProductAdExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.productSelection==null && other.getProductSelection()==null) || 
             (this.productSelection!=null &&
              this.productSelection.equals(other.getProductSelection()))) &&
            ((this.storeId==null && other.getStoreId()==null) || 
             (this.storeId!=null &&
              this.storeId.equals(other.getStoreId()))) &&
            ((this.storeName==null && other.getStoreName()==null) || 
             (this.storeName!=null &&
              this.storeName.equals(other.getStoreName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProductSelection() != null) {
            _hashCode += getProductSelection().hashCode();
        }
        if (getStoreId() != null) {
            _hashCode += getStoreId().hashCode();
        }
        if (getStoreName() != null) {
            _hashCode += getStoreName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductAdExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ProductAdExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ProductSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfProductConditionCollection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "StoreId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "StoreName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
