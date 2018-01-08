/**
 * AdvertiserAccount.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement.entities;

public class AdvertiserAccount extends com.microsoft.bingads.v11.customermanagement.entities.Account implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AdvertiserAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AdvertiserAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedAgencies");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "LinkedAgencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesHouseCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "SalesHouseCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "TaxInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backUpPaymentInstrumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "BackUpPaymentInstrumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingThresholdAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "BillingThresholdAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "BusinessAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.CustomerInfo[] linkedAgencies;
    private java.lang.Long salesHouseCustomerId;
    private com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] taxInformation;
    private java.lang.Long backUpPaymentInstrumentId;
    private java.math.BigDecimal billingThresholdAmount;
    private com.microsoft.bingads.v11.customermanagement.entities.Address businessAddress;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AdvertiserAccount() {
    }


    public AdvertiserAccount(
            com.microsoft.bingads.v11.customermanagement.entities.AccountType accountType,
            java.lang.Long billToCustomerId,
            java.lang.String countryCode,
            com.microsoft.bingads.v11.customermanagement.entities.CurrencyType currencyType,
            com.microsoft.bingads.v11.customermanagement.entities.AccountFinancialStatus accountFinancialStatus,
            java.lang.Long id,
            com.microsoft.bingads.v11.customermanagement.entities.LanguageType language,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long lastModifiedByUserId,
            java.util.Calendar lastModifiedTime,
            java.lang.String name,
            java.lang.String number,
            java.lang.Long parentCustomerId,
            java.lang.Long paymentMethodId,
            com.microsoft.bingads.v11.customermanagement.entities.PaymentMethodType paymentMethodType,
            java.lang.Long primaryUserId,
            com.microsoft.bingads.v11.customermanagement.entities.AccountLifeCycleStatus accountLifeCycleStatus,
            byte[] timeStamp,
            com.microsoft.bingads.v11.customermanagement.entities.TimeZoneType timeZone,
            org.apache.axis.types.UnsignedByte pauseReason,
            com.microsoft.bingads.v11.customermanagement.entities.CustomerInfo[] linkedAgencies,
            java.lang.Long salesHouseCustomerId,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] taxInformation,
            java.lang.Long backUpPaymentInstrumentId,
            java.math.BigDecimal billingThresholdAmount,
            com.microsoft.bingads.v11.customermanagement.entities.Address businessAddress) {
        super(
                accountType,
                billToCustomerId,
                countryCode,
                currencyType,
                accountFinancialStatus,
                id,
                language,
                forwardCompatibilityMap,
                lastModifiedByUserId,
                lastModifiedTime,
                name,
                number,
                parentCustomerId,
                paymentMethodId,
                paymentMethodType,
                primaryUserId,
                accountLifeCycleStatus,
                timeStamp,
                timeZone,
                pauseReason);
        this.linkedAgencies = linkedAgencies;
        this.salesHouseCustomerId = salesHouseCustomerId;
        this.taxInformation = taxInformation;
        this.backUpPaymentInstrumentId = backUpPaymentInstrumentId;
        this.billingThresholdAmount = billingThresholdAmount;
        this.businessAddress = businessAddress;
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
     * Gets the linkedAgencies value for this AdvertiserAccount.
     *
     * @return linkedAgencies
     */
    public com.microsoft.bingads.v11.customermanagement.entities.CustomerInfo[] getLinkedAgencies() {
        return linkedAgencies;
    }

    /**
     * Sets the linkedAgencies value for this AdvertiserAccount.
     *
     * @param linkedAgencies
     */
    public void setLinkedAgencies(com.microsoft.bingads.v11.customermanagement.entities.CustomerInfo[] linkedAgencies) {
        this.linkedAgencies = linkedAgencies;
    }

    /**
     * Gets the salesHouseCustomerId value for this AdvertiserAccount.
     *
     * @return salesHouseCustomerId
     */
    public java.lang.Long getSalesHouseCustomerId() {
        return salesHouseCustomerId;
    }

    /**
     * Sets the salesHouseCustomerId value for this AdvertiserAccount.
     *
     * @param salesHouseCustomerId
     */
    public void setSalesHouseCustomerId(java.lang.Long salesHouseCustomerId) {
        this.salesHouseCustomerId = salesHouseCustomerId;
    }

    /**
     * Gets the taxInformation value for this AdvertiserAccount.
     *
     * @return taxInformation
     */
    public com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] getTaxInformation() {
        return taxInformation;
    }

    /**
     * Sets the taxInformation value for this AdvertiserAccount.
     *
     * @param taxInformation
     */
    public void setTaxInformation(com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] taxInformation) {
        this.taxInformation = taxInformation;
    }

    /**
     * Gets the backUpPaymentInstrumentId value for this AdvertiserAccount.
     *
     * @return backUpPaymentInstrumentId
     */
    public java.lang.Long getBackUpPaymentInstrumentId() {
        return backUpPaymentInstrumentId;
    }

    /**
     * Sets the backUpPaymentInstrumentId value for this AdvertiserAccount.
     *
     * @param backUpPaymentInstrumentId
     */
    public void setBackUpPaymentInstrumentId(java.lang.Long backUpPaymentInstrumentId) {
        this.backUpPaymentInstrumentId = backUpPaymentInstrumentId;
    }

    /**
     * Gets the billingThresholdAmount value for this AdvertiserAccount.
     *
     * @return billingThresholdAmount
     */
    public java.math.BigDecimal getBillingThresholdAmount() {
        return billingThresholdAmount;
    }

    /**
     * Sets the billingThresholdAmount value for this AdvertiserAccount.
     *
     * @param billingThresholdAmount
     */
    public void setBillingThresholdAmount(java.math.BigDecimal billingThresholdAmount) {
        this.billingThresholdAmount = billingThresholdAmount;
    }

    /**
     * Gets the businessAddress value for this AdvertiserAccount.
     *
     * @return businessAddress
     */
    public com.microsoft.bingads.v11.customermanagement.entities.Address getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the businessAddress value for this AdvertiserAccount.
     *
     * @param businessAddress
     */
    public void setBusinessAddress(com.microsoft.bingads.v11.customermanagement.entities.Address businessAddress) {
        this.businessAddress = businessAddress;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvertiserAccount)) return false;
        AdvertiserAccount other = (AdvertiserAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.linkedAgencies == null && other.getLinkedAgencies() == null) ||
                        (this.linkedAgencies != null &&
                                java.util.Arrays.equals(this.linkedAgencies, other.getLinkedAgencies()))) &&
                ((this.salesHouseCustomerId == null && other.getSalesHouseCustomerId() == null) ||
                        (this.salesHouseCustomerId != null &&
                                this.salesHouseCustomerId.equals(other.getSalesHouseCustomerId()))) &&
                ((this.taxInformation == null && other.getTaxInformation() == null) ||
                        (this.taxInformation != null &&
                                java.util.Arrays.equals(this.taxInformation, other.getTaxInformation()))) &&
                ((this.backUpPaymentInstrumentId == null && other.getBackUpPaymentInstrumentId() == null) ||
                        (this.backUpPaymentInstrumentId != null &&
                                this.backUpPaymentInstrumentId.equals(other.getBackUpPaymentInstrumentId()))) &&
                ((this.billingThresholdAmount == null && other.getBillingThresholdAmount() == null) ||
                        (this.billingThresholdAmount != null &&
                                this.billingThresholdAmount.equals(other.getBillingThresholdAmount()))) &&
                ((this.businessAddress == null && other.getBusinessAddress() == null) ||
                        (this.businessAddress != null &&
                                this.businessAddress.equals(other.getBusinessAddress())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getLinkedAgencies() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getLinkedAgencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkedAgencies(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesHouseCustomerId() != null) {
            _hashCode += getSalesHouseCustomerId().hashCode();
        }
        if (getTaxInformation() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTaxInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxInformation(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBackUpPaymentInstrumentId() != null) {
            _hashCode += getBackUpPaymentInstrumentId().hashCode();
        }
        if (getBillingThresholdAmount() != null) {
            _hashCode += getBillingThresholdAmount().hashCode();
        }
        if (getBusinessAddress() != null) {
            _hashCode += getBusinessAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
