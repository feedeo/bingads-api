/**
 * SharedEntity.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class SharedEntity implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SharedEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AssociationCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ForwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Integer associationCount;
    private com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
    private java.lang.Long id;
    private java.lang.String name;
    private java.lang.String type;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public SharedEntity() {
    }


    public SharedEntity(
            java.lang.Integer associationCount,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            java.lang.String name,
            java.lang.String type) {
        this.associationCount = associationCount;
        this.forwardCompatibilityMap = forwardCompatibilityMap;
        this.id = id;
        this.name = name;
        this.type = type;
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
                new org.apache.axis.encoding.ser.BeanSerializer(
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
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the associationCount value for this SharedEntity.
     *
     * @return associationCount
     */
    public java.lang.Integer getAssociationCount() {
        return associationCount;
    }

    /**
     * Sets the associationCount value for this SharedEntity.
     *
     * @param associationCount
     */
    public void setAssociationCount(java.lang.Integer associationCount) {
        this.associationCount = associationCount;
    }

    /**
     * Gets the forwardCompatibilityMap value for this SharedEntity.
     *
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the forwardCompatibilityMap value for this SharedEntity.
     *
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    /**
     * Gets the id value for this SharedEntity.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this SharedEntity.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the name value for this SharedEntity.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this SharedEntity.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Gets the type value for this SharedEntity.
     *
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Sets the type value for this SharedEntity.
     *
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedEntity)) return false;
        SharedEntity other = (SharedEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.associationCount == null && other.getAssociationCount() == null) ||
                        (this.associationCount != null &&
                                this.associationCount.equals(other.getAssociationCount()))) &&
                ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                        (this.forwardCompatibilityMap != null &&
                                java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.type == null && other.getType() == null) ||
                        (this.type != null &&
                                this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAssociationCount() != null) {
            _hashCode += getAssociationCount().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
