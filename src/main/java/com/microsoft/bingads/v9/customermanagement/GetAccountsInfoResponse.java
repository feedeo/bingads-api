/**
 * GetAccountsInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class GetAccountsInfoResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.ArrayOfAccountInfo accountsInfo;

    public GetAccountsInfoResponse() {
    }

    public GetAccountsInfoResponse(
           com.microsoft.bingads.v9.customermanagement.entities.ArrayOfAccountInfo accountsInfo) {
           this.accountsInfo = accountsInfo;
    }


    /**
     * Gets the accountsInfo value for this GetAccountsInfoResponse.
     * 
     * @return accountsInfo
     */
    public com.microsoft.bingads.v9.customermanagement.entities.ArrayOfAccountInfo getAccountsInfo() {
        return accountsInfo;
    }


    /**
     * Sets the accountsInfo value for this GetAccountsInfoResponse.
     * 
     * @param accountsInfo
     */
    public void setAccountsInfo(com.microsoft.bingads.v9.customermanagement.entities.ArrayOfAccountInfo accountsInfo) {
        this.accountsInfo = accountsInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountsInfoResponse)) return false;
        GetAccountsInfoResponse other = (GetAccountsInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountsInfo==null && other.getAccountsInfo()==null) || 
             (this.accountsInfo!=null &&
              this.accountsInfo.equals(other.getAccountsInfo())));
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
        if (getAccountsInfo() != null) {
            _hashCode += getAccountsInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountsInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", ">GetAccountsInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "AccountsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfAccountInfo"));
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
