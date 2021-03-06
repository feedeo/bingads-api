/**
 * SignupCustomerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class SignupCustomerRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.Customer customer;

    private com.microsoft.bingads.v9.customermanagement.entities.Account account;

    private java.lang.Long parentCustomerId;

    private com.microsoft.bingads.v9.customermanagement.entities.ApplicationType applicationScope;

    public SignupCustomerRequest() {
    }

    public SignupCustomerRequest(
           com.microsoft.bingads.v9.customermanagement.entities.Customer customer,
           com.microsoft.bingads.v9.customermanagement.entities.Account account,
           java.lang.Long parentCustomerId,
           com.microsoft.bingads.v9.customermanagement.entities.ApplicationType applicationScope) {
           this.customer = customer;
           this.account = account;
           this.parentCustomerId = parentCustomerId;
           this.applicationScope = applicationScope;
    }


    /**
     * Gets the customer value for this SignupCustomerRequest.
     * 
     * @return customer
     */
    public com.microsoft.bingads.v9.customermanagement.entities.Customer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this SignupCustomerRequest.
     * 
     * @param customer
     */
    public void setCustomer(com.microsoft.bingads.v9.customermanagement.entities.Customer customer) {
        this.customer = customer;
    }


    /**
     * Gets the account value for this SignupCustomerRequest.
     * 
     * @return account
     */
    public com.microsoft.bingads.v9.customermanagement.entities.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this SignupCustomerRequest.
     * 
     * @param account
     */
    public void setAccount(com.microsoft.bingads.v9.customermanagement.entities.Account account) {
        this.account = account;
    }


    /**
     * Gets the parentCustomerId value for this SignupCustomerRequest.
     * 
     * @return parentCustomerId
     */
    public java.lang.Long getParentCustomerId() {
        return parentCustomerId;
    }


    /**
     * Sets the parentCustomerId value for this SignupCustomerRequest.
     * 
     * @param parentCustomerId
     */
    public void setParentCustomerId(java.lang.Long parentCustomerId) {
        this.parentCustomerId = parentCustomerId;
    }


    /**
     * Gets the applicationScope value for this SignupCustomerRequest.
     * 
     * @return applicationScope
     */
    public com.microsoft.bingads.v9.customermanagement.entities.ApplicationType getApplicationScope() {
        return applicationScope;
    }


    /**
     * Sets the applicationScope value for this SignupCustomerRequest.
     * 
     * @param applicationScope
     */
    public void setApplicationScope(com.microsoft.bingads.v9.customermanagement.entities.ApplicationType applicationScope) {
        this.applicationScope = applicationScope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignupCustomerRequest)) return false;
        SignupCustomerRequest other = (SignupCustomerRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.parentCustomerId==null && other.getParentCustomerId()==null) || 
             (this.parentCustomerId!=null &&
              this.parentCustomerId.equals(other.getParentCustomerId()))) &&
            ((this.applicationScope==null && other.getApplicationScope()==null) || 
             (this.applicationScope!=null &&
              this.applicationScope.equals(other.getApplicationScope())));
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
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getParentCustomerId() != null) {
            _hashCode += getParentCustomerId().hashCode();
        }
        if (getApplicationScope() != null) {
            _hashCode += getApplicationScope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignupCustomerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", ">SignupCustomerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "ParentCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "ApplicationScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ApplicationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
