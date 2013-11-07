/**
 * ArrayOfBudgetOpportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class ArrayOfBudgetOpportunity  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.BudgetOpportunity[] budgetOpportunity;

    public ArrayOfBudgetOpportunity() {
    }

    public ArrayOfBudgetOpportunity(
           com.microsoft.bingads.v9.optimizer.entities.BudgetOpportunity[] budgetOpportunity) {
           this.budgetOpportunity = budgetOpportunity;
    }


    /**
     * Gets the budgetOpportunity value for this ArrayOfBudgetOpportunity.
     * 
     * @return budgetOpportunity
     */
    public com.microsoft.bingads.v9.optimizer.entities.BudgetOpportunity[] getBudgetOpportunity() {
        return budgetOpportunity;
    }


    /**
     * Sets the budgetOpportunity value for this ArrayOfBudgetOpportunity.
     * 
     * @param budgetOpportunity
     */
    public void setBudgetOpportunity(com.microsoft.bingads.v9.optimizer.entities.BudgetOpportunity[] budgetOpportunity) {
        this.budgetOpportunity = budgetOpportunity;
    }

    public com.microsoft.bingads.v9.optimizer.entities.BudgetOpportunity getBudgetOpportunity(int i) {
        return this.budgetOpportunity[i];
    }

    public void setBudgetOpportunity(int i, com.microsoft.bingads.v9.optimizer.entities.BudgetOpportunity _value) {
        this.budgetOpportunity[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfBudgetOpportunity)) return false;
        ArrayOfBudgetOpportunity other = (ArrayOfBudgetOpportunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.budgetOpportunity==null && other.getBudgetOpportunity()==null) || 
             (this.budgetOpportunity!=null &&
              java.util.Arrays.equals(this.budgetOpportunity, other.getBudgetOpportunity())));
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
        if (getBudgetOpportunity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBudgetOpportunity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBudgetOpportunity(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfBudgetOpportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBudgetOpportunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetOpportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetOpportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetOpportunity"));
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
