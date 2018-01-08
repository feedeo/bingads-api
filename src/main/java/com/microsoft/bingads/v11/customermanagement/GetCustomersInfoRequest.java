/**
 * GetCustomersInfoRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class GetCustomersInfoRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetCustomersInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">GetCustomersInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNameFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "CustomerNameFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topN");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "TopN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "ApplicationScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ApplicationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String customerNameFilter;
    private java.lang.Integer topN;
    private com.microsoft.bingads.v11.customermanagement.entities.ApplicationType applicationScope;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GetCustomersInfoRequest() {
    }


    public GetCustomersInfoRequest(
            java.lang.String customerNameFilter,
            java.lang.Integer topN,
            com.microsoft.bingads.v11.customermanagement.entities.ApplicationType applicationScope) {
        this.customerNameFilter = customerNameFilter;
        this.topN = topN;
        this.applicationScope = applicationScope;
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
     * Gets the customerNameFilter value for this GetCustomersInfoRequest.
     *
     * @return customerNameFilter
     */
    public java.lang.String getCustomerNameFilter() {
        return customerNameFilter;
    }

    /**
     * Sets the customerNameFilter value for this GetCustomersInfoRequest.
     *
     * @param customerNameFilter
     */
    public void setCustomerNameFilter(java.lang.String customerNameFilter) {
        this.customerNameFilter = customerNameFilter;
    }

    /**
     * Gets the topN value for this GetCustomersInfoRequest.
     *
     * @return topN
     */
    public java.lang.Integer getTopN() {
        return topN;
    }

    /**
     * Sets the topN value for this GetCustomersInfoRequest.
     *
     * @param topN
     */
    public void setTopN(java.lang.Integer topN) {
        this.topN = topN;
    }

    /**
     * Gets the applicationScope value for this GetCustomersInfoRequest.
     *
     * @return applicationScope
     */
    public com.microsoft.bingads.v11.customermanagement.entities.ApplicationType getApplicationScope() {
        return applicationScope;
    }

    /**
     * Sets the applicationScope value for this GetCustomersInfoRequest.
     *
     * @param applicationScope
     */
    public void setApplicationScope(com.microsoft.bingads.v11.customermanagement.entities.ApplicationType applicationScope) {
        this.applicationScope = applicationScope;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCustomersInfoRequest)) return false;
        GetCustomersInfoRequest other = (GetCustomersInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.customerNameFilter == null && other.getCustomerNameFilter() == null) ||
                        (this.customerNameFilter != null &&
                                this.customerNameFilter.equals(other.getCustomerNameFilter()))) &&
                ((this.topN == null && other.getTopN() == null) ||
                        (this.topN != null &&
                                this.topN.equals(other.getTopN()))) &&
                ((this.applicationScope == null && other.getApplicationScope() == null) ||
                        (this.applicationScope != null &&
                                this.applicationScope.equals(other.getApplicationScope())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomerNameFilter() != null) {
            _hashCode += getCustomerNameFilter().hashCode();
        }
        if (getTopN() != null) {
            _hashCode += getTopN().hashCode();
        }
        if (getApplicationScope() != null) {
            _hashCode += getApplicationScope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
