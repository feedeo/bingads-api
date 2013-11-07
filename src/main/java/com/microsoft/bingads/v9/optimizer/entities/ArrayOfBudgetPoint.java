/**
 * ArrayOfBudgetPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class ArrayOfBudgetPoint  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.BudgetPoint[] budgetPoint;

    public ArrayOfBudgetPoint() {
    }

    public ArrayOfBudgetPoint(
           com.microsoft.bingads.v9.optimizer.entities.BudgetPoint[] budgetPoint) {
           this.budgetPoint = budgetPoint;
    }


    /**
     * Gets the budgetPoint value for this ArrayOfBudgetPoint.
     * 
     * @return budgetPoint
     */
    public com.microsoft.bingads.v9.optimizer.entities.BudgetPoint[] getBudgetPoint() {
        return budgetPoint;
    }


    /**
     * Sets the budgetPoint value for this ArrayOfBudgetPoint.
     * 
     * @param budgetPoint
     */
    public void setBudgetPoint(com.microsoft.bingads.v9.optimizer.entities.BudgetPoint[] budgetPoint) {
        this.budgetPoint = budgetPoint;
    }

    public com.microsoft.bingads.v9.optimizer.entities.BudgetPoint getBudgetPoint(int i) {
        return this.budgetPoint[i];
    }

    public void setBudgetPoint(int i, com.microsoft.bingads.v9.optimizer.entities.BudgetPoint _value) {
        this.budgetPoint[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfBudgetPoint)) return false;
        ArrayOfBudgetPoint other = (ArrayOfBudgetPoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.budgetPoint==null && other.getBudgetPoint()==null) || 
             (this.budgetPoint!=null &&
              java.util.Arrays.equals(this.budgetPoint, other.getBudgetPoint())));
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
        if (getBudgetPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBudgetPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBudgetPoint(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfBudgetPoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBudgetPoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPoint"));
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
