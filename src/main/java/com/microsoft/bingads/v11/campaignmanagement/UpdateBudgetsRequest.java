/**
 * UpdateBudgetsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class UpdateBudgetsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateBudgetsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">UpdateBudgetsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Budgets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Budget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Budget"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.Budget[] budgets;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public UpdateBudgetsRequest() {
    }

    public UpdateBudgetsRequest(
            com.microsoft.bingads.v11.campaignmanagement.Budget[] budgets) {
        this.budgets = budgets;
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
     * Gets the budgets value for this UpdateBudgetsRequest.
     *
     * @return budgets
     */
    public com.microsoft.bingads.v11.campaignmanagement.Budget[] getBudgets() {
        return budgets;
    }

    /**
     * Sets the budgets value for this UpdateBudgetsRequest.
     *
     * @param budgets
     */
    public void setBudgets(com.microsoft.bingads.v11.campaignmanagement.Budget[] budgets) {
        this.budgets = budgets;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBudgetsRequest)) return false;
        UpdateBudgetsRequest other = (UpdateBudgetsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.budgets == null && other.getBudgets() == null) ||
                        (this.budgets != null &&
                                java.util.Arrays.equals(this.budgets, other.getBudgets())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBudgets() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBudgets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBudgets(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
