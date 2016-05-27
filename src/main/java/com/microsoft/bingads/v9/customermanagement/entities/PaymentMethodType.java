/**
 * PaymentMethodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class PaymentMethodType implements java.io.Serializable {
    private static java.util.HashMap _table_ = new java.util.HashMap();

    public static final java.lang.String _CreditCard = "CreditCard";
    public static final java.lang.String _Invoice = "Invoice";
    public static final java.lang.String _Check = "Check";
    public static final java.lang.String _ElectronicFundsTransfer = "ElectronicFundsTransfer";
    public static final java.lang.String _PayPal = "PayPal";
    public static final java.lang.String _ELV = "ELV";
    public static final java.lang.String _OfflinePaymentMethod = "OfflinePaymentMethod";
    public static final java.lang.String _VBA = "VBA";
    public static final java.lang.String _Boleto = "Boleto";
    public static final PaymentMethodType CreditCard = new PaymentMethodType(_CreditCard);
    public static final PaymentMethodType Invoice = new PaymentMethodType(_Invoice);
    public static final PaymentMethodType Check = new PaymentMethodType(_Check);
    public static final PaymentMethodType ElectronicFundsTransfer = new PaymentMethodType(_ElectronicFundsTransfer);
    public static final PaymentMethodType PayPal = new PaymentMethodType(_PayPal);
    public static final PaymentMethodType ELV = new PaymentMethodType(_ELV);
    public static final PaymentMethodType OfflinePaymentMethod = new PaymentMethodType(_OfflinePaymentMethod);
    public static final PaymentMethodType VBA = new PaymentMethodType(_VBA);
    public static final PaymentMethodType Boleto = new PaymentMethodType(_Boleto);
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PaymentMethodType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "PaymentMethodType"));
    }

    private java.lang.String _value_;

    // Constructor
    protected PaymentMethodType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static PaymentMethodType fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        PaymentMethodType enumeration = (PaymentMethodType)
                _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static PaymentMethodType fromString(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }

    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumSerializer(
                        _javaType, _xmlType);
    }

    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumDeserializer(
                        _javaType, _xmlType);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    public java.lang.String getValue() {
        return _value_;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {
        return _value_;
    }

    public java.lang.Object readResolve() throws java.io.ObjectStreamException {
        return fromValue(_value_);
    }

}
