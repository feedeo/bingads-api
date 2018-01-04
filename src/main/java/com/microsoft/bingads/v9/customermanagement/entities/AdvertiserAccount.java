/**
 * AdvertiserAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class AdvertiserAccount  extends com.microsoft.bingads.v9.customermanagement.entities.Account  implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AdvertiserAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "AdvertiserAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "AgencyContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "AgencyCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesHouseCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "SalesHouseCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "TaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "TaxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "TaxType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backUpPaymentInstrumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "BackUpPaymentInstrumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingThresholdAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "BillingThresholdAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "TaxIdStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "TaxIdStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "BusinessAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String agencyContactName;
    private java.lang.Long agencyCustomerId;
    private java.lang.Long salesHouseCustomerId;
    private java.lang.String taxId;
    private com.microsoft.bingads.v9.customermanagement.entities.TaxType taxType;
    private java.lang.Long backUpPaymentInstrumentId;
    private java.math.BigDecimal billingThresholdAmount;
    private com.microsoft.bingads.v9.customermanagement.entities.TaxIdStatus taxIdStatus;
    private com.microsoft.bingads.v9.customermanagement.entities.Address businessAddress;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AdvertiserAccount() {
    }


    public AdvertiserAccount(
            com.microsoft.bingads.v9.customermanagement.entities.AccountType accountType,
            java.lang.Long billToCustomerId,
            java.lang.String countryCode,
            com.microsoft.bingads.v9.customermanagement.entities.CurrencyType currencyType,
            com.microsoft.bingads.v9.customermanagement.entities.AccountFinancialStatus accountFinancialStatus,
            java.lang.Long id,
            com.microsoft.bingads.v9.customermanagement.entities.LanguageType language,
            com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long lastModifiedByUserId,
            java.util.Calendar lastModifiedTime,
            java.lang.String name,
            java.lang.String number,
            java.lang.Long parentCustomerId,
            java.lang.Long paymentMethodId,
            com.microsoft.bingads.v9.customermanagement.entities.PaymentMethodType paymentMethodType,
            java.lang.Long primaryUserId,
            com.microsoft.bingads.v9.customermanagement.entities.AccountLifeCycleStatus accountLifeCycleStatus,
            byte[] timeStamp,
            com.microsoft.bingads.v9.customermanagement.entities.TimeZoneType timeZone,
            org.apache.axis.types.UnsignedByte pauseReason,
            java.lang.String agencyContactName,
            java.lang.Long agencyCustomerId,
            java.lang.Long salesHouseCustomerId,
            java.lang.String taxId,
            com.microsoft.bingads.v9.customermanagement.entities.TaxType taxType,
            java.lang.Long backUpPaymentInstrumentId,
            java.math.BigDecimal billingThresholdAmount,
            com.microsoft.bingads.v9.customermanagement.entities.TaxIdStatus taxIdStatus,
            com.microsoft.bingads.v9.customermanagement.entities.Address businessAddress) {
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
        this.agencyContactName = agencyContactName;
        this.agencyCustomerId = agencyCustomerId;
        this.salesHouseCustomerId = salesHouseCustomerId;
        this.taxId = taxId;
        this.taxType = taxType;
        this.backUpPaymentInstrumentId = backUpPaymentInstrumentId;
        this.billingThresholdAmount = billingThresholdAmount;
        this.taxIdStatus = taxIdStatus;
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
     * Gets the agencyContactName value for this AdvertiserAccount.
     *
     * @return agencyContactName
     */
    public java.lang.String getAgencyContactName() {
        return agencyContactName;
    }

    /**
     * Sets the agencyContactName value for this AdvertiserAccount.
     *
     * @param agencyContactName
     */
    public void setAgencyContactName(java.lang.String agencyContactName) {
        this.agencyContactName = agencyContactName;
    }

    /**
     * Gets the agencyCustomerId value for this AdvertiserAccount.
     *
     * @return agencyCustomerId
     */
    public java.lang.Long getAgencyCustomerId() {
        return agencyCustomerId;
    }

    /**
     * Sets the agencyCustomerId value for this AdvertiserAccount.
     *
     * @param agencyCustomerId
     */
    public void setAgencyCustomerId(java.lang.Long agencyCustomerId) {
        this.agencyCustomerId = agencyCustomerId;
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
     * Gets the taxId value for this AdvertiserAccount.
     *
     * @return taxId
     */
    public java.lang.String getTaxId() {
        return taxId;
    }

    /**
     * Sets the taxId value for this AdvertiserAccount.
     *
     * @param taxId
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }

    /**
     * Gets the taxType value for this AdvertiserAccount.
     *
     * @return taxType
     */
    public com.microsoft.bingads.v9.customermanagement.entities.TaxType getTaxType() {
        return taxType;
    }

    /**
     * Sets the taxType value for this AdvertiserAccount.
     *
     * @param taxType
     */
    public void setTaxType(com.microsoft.bingads.v9.customermanagement.entities.TaxType taxType) {
        this.taxType = taxType;
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
     * Gets the taxIdStatus value for this AdvertiserAccount.
     *
     * @return taxIdStatus
     */
    public com.microsoft.bingads.v9.customermanagement.entities.TaxIdStatus getTaxIdStatus() {
        return taxIdStatus;
    }

    /**
     * Sets the taxIdStatus value for this AdvertiserAccount.
     *
     * @param taxIdStatus
     */
    public void setTaxIdStatus(com.microsoft.bingads.v9.customermanagement.entities.TaxIdStatus taxIdStatus) {
        this.taxIdStatus = taxIdStatus;
    }

    /**
     * Gets the businessAddress value for this AdvertiserAccount.
     *
     * @return businessAddress
     */
    public com.microsoft.bingads.v9.customermanagement.entities.Address getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the businessAddress value for this AdvertiserAccount.
     *
     * @param businessAddress
     */
    public void setBusinessAddress(com.microsoft.bingads.v9.customermanagement.entities.Address businessAddress) {
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
                ((this.agencyContactName == null && other.getAgencyContactName() == null) ||
                        (this.agencyContactName != null &&
                                this.agencyContactName.equals(other.getAgencyContactName()))) &&
            ((this.agencyCustomerId == null && other.getAgencyCustomerId() == null) ||
                    (this.agencyCustomerId != null &&
                            this.agencyCustomerId.equals(other.getAgencyCustomerId()))) &&
            ((this.salesHouseCustomerId == null && other.getSalesHouseCustomerId() == null) ||
                    (this.salesHouseCustomerId != null &&
                            this.salesHouseCustomerId.equals(other.getSalesHouseCustomerId()))) &&
            ((this.taxId==null && other.getTaxId() == null) ||
                    (this.taxId != null &&
                            this.taxId.equals(other.getTaxId()))) &&
            ((this.taxType==null && other.getTaxType() == null) ||
                    (this.taxType != null &&
                            this.taxType.equals(other.getTaxType()))) &&
            ((this.backUpPaymentInstrumentId == null && other.getBackUpPaymentInstrumentId() == null) ||
                    (this.backUpPaymentInstrumentId != null &&
                            this.backUpPaymentInstrumentId.equals(other.getBackUpPaymentInstrumentId()))) &&
                ((this.billingThresholdAmount == null && other.getBillingThresholdAmount() == null) ||
                        (this.billingThresholdAmount != null &&
                                this.billingThresholdAmount.equals(other.getBillingThresholdAmount()))) &&
                ((this.taxIdStatus == null && other.getTaxIdStatus() == null) ||
                        (this.taxIdStatus != null &&
                                this.taxIdStatus.equals(other.getTaxIdStatus()))) &&
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
        if (getAgencyContactName() != null) {
            _hashCode += getAgencyContactName().hashCode();
        }
        if (getAgencyCustomerId() != null) {
            _hashCode += getAgencyCustomerId().hashCode();
        }
        if (getSalesHouseCustomerId() != null) {
            _hashCode += getSalesHouseCustomerId().hashCode();
        }
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getBackUpPaymentInstrumentId() != null) {
            _hashCode += getBackUpPaymentInstrumentId().hashCode();
        }
        if (getBillingThresholdAmount() != null) {
            _hashCode += getBillingThresholdAmount().hashCode();
        }
        if (getTaxIdStatus() != null) {
            _hashCode += getTaxIdStatus().hashCode();
        }
        if (getBusinessAddress() != null) {
            _hashCode += getBusinessAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
