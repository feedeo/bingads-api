/**
 * GetUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class GetUserResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.User user;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOfint roles;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong accounts;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong customers;

    public GetUserResponse() {
    }

    public GetUserResponse(
           com.microsoft.bingads.v9.customermanagement.entities.User user,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOfint roles,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong accounts,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong customers) {
           this.user = user;
           this.roles = roles;
           this.accounts = accounts;
           this.customers = customers;
    }


    /**
     * Gets the user value for this GetUserResponse.
     * 
     * @return user
     */
    public com.microsoft.bingads.v9.customermanagement.entities.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this GetUserResponse.
     * 
     * @param user
     */
    public void setUser(com.microsoft.bingads.v9.customermanagement.entities.User user) {
        this.user = user;
    }


    /**
     * Gets the roles value for this GetUserResponse.
     * 
     * @return roles
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOfint getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this GetUserResponse.
     * 
     * @param roles
     */
    public void setRoles(com.microsoft.bingads.v9.schemas.arrays.ArrayOfint roles) {
        this.roles = roles;
    }


    /**
     * Gets the accounts value for this GetUserResponse.
     * 
     * @return accounts
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getAccounts() {
        return accounts;
    }


    /**
     * Sets the accounts value for this GetUserResponse.
     * 
     * @param accounts
     */
    public void setAccounts(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong accounts) {
        this.accounts = accounts;
    }


    /**
     * Gets the customers value for this GetUserResponse.
     * 
     * @return customers
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getCustomers() {
        return customers;
    }


    /**
     * Sets the customers value for this GetUserResponse.
     * 
     * @param customers
     */
    public void setCustomers(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong customers) {
        this.customers = customers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserResponse)) return false;
        GetUserResponse other = (GetUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              this.roles.equals(other.getRoles()))) &&
            ((this.accounts==null && other.getAccounts()==null) || 
             (this.accounts!=null &&
              this.accounts.equals(other.getAccounts()))) &&
            ((this.customers==null && other.getCustomers()==null) || 
             (this.customers!=null &&
              this.customers.equals(other.getCustomers())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getRoles() != null) {
            _hashCode += getRoles().hashCode();
        }
        if (getAccounts() != null) {
            _hashCode += getAccounts().hashCode();
        }
        if (getCustomers() != null) {
            _hashCode += getCustomers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", ">GetUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "Roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "Accounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "Customers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong"));
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
