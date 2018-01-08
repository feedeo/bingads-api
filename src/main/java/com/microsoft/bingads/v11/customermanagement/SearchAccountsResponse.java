/**
 * SearchAccountsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class SearchAccountsResponse implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SearchAccountsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchAccountsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "Accounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Account"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.Account[] accounts;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public SearchAccountsResponse() {
    }

    public SearchAccountsResponse(
            com.microsoft.bingads.v11.customermanagement.entities.Account[] accounts) {
        this.accounts = accounts;
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
     * Gets the accounts value for this SearchAccountsResponse.
     *
     * @return accounts
     */
    public com.microsoft.bingads.v11.customermanagement.entities.Account[] getAccounts() {
        return accounts;
    }

    /**
     * Sets the accounts value for this SearchAccountsResponse.
     *
     * @param accounts
     */
    public void setAccounts(com.microsoft.bingads.v11.customermanagement.entities.Account[] accounts) {
        this.accounts = accounts;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchAccountsResponse)) return false;
        SearchAccountsResponse other = (SearchAccountsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accounts == null && other.getAccounts() == null) ||
                        (this.accounts != null &&
                                java.util.Arrays.equals(this.accounts, other.getAccounts())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccounts() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAccounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccounts(), i);
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
