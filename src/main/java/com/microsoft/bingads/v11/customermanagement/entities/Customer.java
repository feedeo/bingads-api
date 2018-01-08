/**
 * Customer.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement.entities;

public class Customer implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerFinancialStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerFinancialStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerFinancialStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Industry"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Industry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedByUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "LastModifiedByUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "LastModifiedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "MarketCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ForwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "MarketLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "LanguageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ServiceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ServiceLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerLifeCycleStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerLifeCycleStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerLifeCycleStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "TimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.Address customerAddress;
    private com.microsoft.bingads.v11.customermanagement.entities.CustomerFinancialStatus customerFinancialStatus;
    private java.lang.Long id;
    private com.microsoft.bingads.v11.customermanagement.entities.Industry industry;
    private java.lang.Long lastModifiedByUserId;
    private java.util.Calendar lastModifiedTime;
    private java.lang.String marketCountry;
    private com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
    private com.microsoft.bingads.v11.customermanagement.entities.LanguageType marketLanguage;
    private java.lang.String name;
    private com.microsoft.bingads.v11.customermanagement.entities.ServiceLevel serviceLevel;
    private com.microsoft.bingads.v11.customermanagement.entities.CustomerLifeCycleStatus customerLifeCycleStatus;
    private byte[] timeStamp;
    private java.lang.String number;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public Customer() {
    }


    public Customer(
            com.microsoft.bingads.v11.customermanagement.entities.Address customerAddress,
            com.microsoft.bingads.v11.customermanagement.entities.CustomerFinancialStatus customerFinancialStatus,
            java.lang.Long id,
            com.microsoft.bingads.v11.customermanagement.entities.Industry industry,
            java.lang.Long lastModifiedByUserId,
            java.util.Calendar lastModifiedTime,
            java.lang.String marketCountry,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            com.microsoft.bingads.v11.customermanagement.entities.LanguageType marketLanguage,
            java.lang.String name,
            com.microsoft.bingads.v11.customermanagement.entities.ServiceLevel serviceLevel,
            com.microsoft.bingads.v11.customermanagement.entities.CustomerLifeCycleStatus customerLifeCycleStatus,
            byte[] timeStamp,
            java.lang.String number) {
        this.customerAddress = customerAddress;
        this.customerFinancialStatus = customerFinancialStatus;
        this.id = id;
        this.industry = industry;
        this.lastModifiedByUserId = lastModifiedByUserId;
        this.lastModifiedTime = lastModifiedTime;
        this.marketCountry = marketCountry;
        this.forwardCompatibilityMap = forwardCompatibilityMap;
        this.marketLanguage = marketLanguage;
        this.name = name;
        this.serviceLevel = serviceLevel;
        this.customerLifeCycleStatus = customerLifeCycleStatus;
        this.timeStamp = timeStamp;
        this.number = number;
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
     * Gets the customerAddress value for this Customer.
     *
     * @return customerAddress
     */
    public com.microsoft.bingads.v11.customermanagement.entities.Address getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the customerAddress value for this Customer.
     *
     * @param customerAddress
     */
    public void setCustomerAddress(com.microsoft.bingads.v11.customermanagement.entities.Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * Gets the customerFinancialStatus value for this Customer.
     *
     * @return customerFinancialStatus
     */
    public com.microsoft.bingads.v11.customermanagement.entities.CustomerFinancialStatus getCustomerFinancialStatus() {
        return customerFinancialStatus;
    }

    /**
     * Sets the customerFinancialStatus value for this Customer.
     *
     * @param customerFinancialStatus
     */
    public void setCustomerFinancialStatus(com.microsoft.bingads.v11.customermanagement.entities.CustomerFinancialStatus customerFinancialStatus) {
        this.customerFinancialStatus = customerFinancialStatus;
    }

    /**
     * Gets the id value for this Customer.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this Customer.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the industry value for this Customer.
     *
     * @return industry
     */
    public com.microsoft.bingads.v11.customermanagement.entities.Industry getIndustry() {
        return industry;
    }

    /**
     * Sets the industry value for this Customer.
     *
     * @param industry
     */
    public void setIndustry(com.microsoft.bingads.v11.customermanagement.entities.Industry industry) {
        this.industry = industry;
    }

    /**
     * Gets the lastModifiedByUserId value for this Customer.
     *
     * @return lastModifiedByUserId
     */
    public java.lang.Long getLastModifiedByUserId() {
        return lastModifiedByUserId;
    }

    /**
     * Sets the lastModifiedByUserId value for this Customer.
     *
     * @param lastModifiedByUserId
     */
    public void setLastModifiedByUserId(java.lang.Long lastModifiedByUserId) {
        this.lastModifiedByUserId = lastModifiedByUserId;
    }

    /**
     * Gets the lastModifiedTime value for this Customer.
     *
     * @return lastModifiedTime
     */
    public java.util.Calendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the lastModifiedTime value for this Customer.
     *
     * @param lastModifiedTime
     */
    public void setLastModifiedTime(java.util.Calendar lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * Gets the marketCountry value for this Customer.
     *
     * @return marketCountry
     */
    public java.lang.String getMarketCountry() {
        return marketCountry;
    }

    /**
     * Sets the marketCountry value for this Customer.
     *
     * @param marketCountry
     */
    public void setMarketCountry(java.lang.String marketCountry) {
        this.marketCountry = marketCountry;
    }

    /**
     * Gets the forwardCompatibilityMap value for this Customer.
     *
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the forwardCompatibilityMap value for this Customer.
     *
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    /**
     * Gets the marketLanguage value for this Customer.
     *
     * @return marketLanguage
     */
    public com.microsoft.bingads.v11.customermanagement.entities.LanguageType getMarketLanguage() {
        return marketLanguage;
    }

    /**
     * Sets the marketLanguage value for this Customer.
     *
     * @param marketLanguage
     */
    public void setMarketLanguage(com.microsoft.bingads.v11.customermanagement.entities.LanguageType marketLanguage) {
        this.marketLanguage = marketLanguage;
    }

    /**
     * Gets the name value for this Customer.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this Customer.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Gets the serviceLevel value for this Customer.
     *
     * @return serviceLevel
     */
    public com.microsoft.bingads.v11.customermanagement.entities.ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the serviceLevel value for this Customer.
     *
     * @param serviceLevel
     */
    public void setServiceLevel(com.microsoft.bingads.v11.customermanagement.entities.ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    /**
     * Gets the customerLifeCycleStatus value for this Customer.
     *
     * @return customerLifeCycleStatus
     */
    public com.microsoft.bingads.v11.customermanagement.entities.CustomerLifeCycleStatus getCustomerLifeCycleStatus() {
        return customerLifeCycleStatus;
    }

    /**
     * Sets the customerLifeCycleStatus value for this Customer.
     *
     * @param customerLifeCycleStatus
     */
    public void setCustomerLifeCycleStatus(com.microsoft.bingads.v11.customermanagement.entities.CustomerLifeCycleStatus customerLifeCycleStatus) {
        this.customerLifeCycleStatus = customerLifeCycleStatus;
    }

    /**
     * Gets the timeStamp value for this Customer.
     *
     * @return timeStamp
     */
    public byte[] getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the timeStamp value for this Customer.
     *
     * @param timeStamp
     */
    public void setTimeStamp(byte[] timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Gets the number value for this Customer.
     *
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }

    /**
     * Sets the number value for this Customer.
     *
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.customerAddress == null && other.getCustomerAddress() == null) ||
                        (this.customerAddress != null &&
                                this.customerAddress.equals(other.getCustomerAddress()))) &&
                ((this.customerFinancialStatus == null && other.getCustomerFinancialStatus() == null) ||
                        (this.customerFinancialStatus != null &&
                                this.customerFinancialStatus.equals(other.getCustomerFinancialStatus()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.industry == null && other.getIndustry() == null) ||
                        (this.industry != null &&
                                this.industry.equals(other.getIndustry()))) &&
                ((this.lastModifiedByUserId == null && other.getLastModifiedByUserId() == null) ||
                        (this.lastModifiedByUserId != null &&
                                this.lastModifiedByUserId.equals(other.getLastModifiedByUserId()))) &&
                ((this.lastModifiedTime == null && other.getLastModifiedTime() == null) ||
                        (this.lastModifiedTime != null &&
                                this.lastModifiedTime.equals(other.getLastModifiedTime()))) &&
                ((this.marketCountry == null && other.getMarketCountry() == null) ||
                        (this.marketCountry != null &&
                                this.marketCountry.equals(other.getMarketCountry()))) &&
                ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                        (this.forwardCompatibilityMap != null &&
                                java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
                ((this.marketLanguage == null && other.getMarketLanguage() == null) ||
                        (this.marketLanguage != null &&
                                this.marketLanguage.equals(other.getMarketLanguage()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.serviceLevel == null && other.getServiceLevel() == null) ||
                        (this.serviceLevel != null &&
                                this.serviceLevel.equals(other.getServiceLevel()))) &&
                ((this.customerLifeCycleStatus == null && other.getCustomerLifeCycleStatus() == null) ||
                        (this.customerLifeCycleStatus != null &&
                                this.customerLifeCycleStatus.equals(other.getCustomerLifeCycleStatus()))) &&
                ((this.timeStamp == null && other.getTimeStamp() == null) ||
                        (this.timeStamp != null &&
                                java.util.Arrays.equals(this.timeStamp, other.getTimeStamp()))) &&
                ((this.number == null && other.getNumber() == null) ||
                        (this.number != null &&
                                this.number.equals(other.getNumber())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomerAddress() != null) {
            _hashCode += getCustomerAddress().hashCode();
        }
        if (getCustomerFinancialStatus() != null) {
            _hashCode += getCustomerFinancialStatus().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getLastModifiedByUserId() != null) {
            _hashCode += getLastModifiedByUserId().hashCode();
        }
        if (getLastModifiedTime() != null) {
            _hashCode += getLastModifiedTime().hashCode();
        }
        if (getMarketCountry() != null) {
            _hashCode += getMarketCountry().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarketLanguage() != null) {
            _hashCode += getMarketLanguage().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getServiceLevel() != null) {
            _hashCode += getServiceLevel().hashCode();
        }
        if (getCustomerLifeCycleStatus() != null) {
            _hashCode += getCustomerLifeCycleStatus().hashCode();
        }
        if (getTimeStamp() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTimeStamp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeStamp(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
