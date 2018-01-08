/**
 * Budget.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class Budget implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Budget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Budget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AssociationCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BudgetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BudgetLimitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.math.BigDecimal amount;
    private java.lang.Integer associationCount;
    private com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType budgetType;
    private java.lang.Long id;
    private java.lang.String name;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public Budget() {
    }


    public Budget(
            java.math.BigDecimal amount,
            java.lang.Integer associationCount,
            com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType budgetType,
            java.lang.Long id,
            java.lang.String name) {
        this.amount = amount;
        this.associationCount = associationCount;
        this.budgetType = budgetType;
        this.id = id;
        this.name = name;
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
     * Gets the amount value for this Budget.
     *
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the amount value for this Budget.
     *
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Gets the associationCount value for this Budget.
     *
     * @return associationCount
     */
    public java.lang.Integer getAssociationCount() {
        return associationCount;
    }

    /**
     * Sets the associationCount value for this Budget.
     *
     * @param associationCount
     */
    public void setAssociationCount(java.lang.Integer associationCount) {
        this.associationCount = associationCount;
    }

    /**
     * Gets the budgetType value for this Budget.
     *
     * @return budgetType
     */
    public com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType getBudgetType() {
        return budgetType;
    }

    /**
     * Sets the budgetType value for this Budget.
     *
     * @param budgetType
     */
    public void setBudgetType(com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType budgetType) {
        this.budgetType = budgetType;
    }

    /**
     * Gets the id value for this Budget.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this Budget.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the name value for this Budget.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this Budget.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Budget)) return false;
        Budget other = (Budget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.amount == null && other.getAmount() == null) ||
                        (this.amount != null &&
                                this.amount.equals(other.getAmount()))) &&
                ((this.associationCount == null && other.getAssociationCount() == null) ||
                        (this.associationCount != null &&
                                this.associationCount.equals(other.getAssociationCount()))) &&
                ((this.budgetType == null && other.getBudgetType() == null) ||
                        (this.budgetType != null &&
                                this.budgetType.equals(other.getBudgetType()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAssociationCount() != null) {
            _hashCode += getAssociationCount().hashCode();
        }
        if (getBudgetType() != null) {
            _hashCode += getBudgetType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
