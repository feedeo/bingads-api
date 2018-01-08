/**
 * PriceTableRow.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class PriceTableRow implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PriceTableRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceTableRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalMobileUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FinalMobileUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FinalUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceQualifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceUnit"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsAndConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TermsAndConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsAndConditionsUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TermsAndConditionsUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String currencyCode;
    private java.lang.String description;
    private java.lang.String[] finalMobileUrls;
    private java.lang.String[] finalUrls;
    private java.lang.String header;
    private double price;
    private com.microsoft.bingads.v11.campaignmanagement.PriceQualifier priceQualifier;
    private com.microsoft.bingads.v11.campaignmanagement.PriceUnit priceUnit;
    private java.lang.String termsAndConditions;
    private java.lang.String termsAndConditionsUrl;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public PriceTableRow() {
    }


    public PriceTableRow(
            java.lang.String currencyCode,
            java.lang.String description,
            java.lang.String[] finalMobileUrls,
            java.lang.String[] finalUrls,
            java.lang.String header,
            double price,
            com.microsoft.bingads.v11.campaignmanagement.PriceQualifier priceQualifier,
            com.microsoft.bingads.v11.campaignmanagement.PriceUnit priceUnit,
            java.lang.String termsAndConditions,
            java.lang.String termsAndConditionsUrl) {
        this.currencyCode = currencyCode;
        this.description = description;
        this.finalMobileUrls = finalMobileUrls;
        this.finalUrls = finalUrls;
        this.header = header;
        this.price = price;
        this.priceQualifier = priceQualifier;
        this.priceUnit = priceUnit;
        this.termsAndConditions = termsAndConditions;
        this.termsAndConditionsUrl = termsAndConditionsUrl;
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
     * Gets the currencyCode value for this PriceTableRow.
     *
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the currencyCode value for this PriceTableRow.
     *
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Gets the description value for this PriceTableRow.
     *
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the description value for this PriceTableRow.
     *
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Gets the finalMobileUrls value for this PriceTableRow.
     *
     * @return finalMobileUrls
     */
    public java.lang.String[] getFinalMobileUrls() {
        return finalMobileUrls;
    }

    /**
     * Sets the finalMobileUrls value for this PriceTableRow.
     *
     * @param finalMobileUrls
     */
    public void setFinalMobileUrls(java.lang.String[] finalMobileUrls) {
        this.finalMobileUrls = finalMobileUrls;
    }

    /**
     * Gets the finalUrls value for this PriceTableRow.
     *
     * @return finalUrls
     */
    public java.lang.String[] getFinalUrls() {
        return finalUrls;
    }

    /**
     * Sets the finalUrls value for this PriceTableRow.
     *
     * @param finalUrls
     */
    public void setFinalUrls(java.lang.String[] finalUrls) {
        this.finalUrls = finalUrls;
    }

    /**
     * Gets the header value for this PriceTableRow.
     *
     * @return header
     */
    public java.lang.String getHeader() {
        return header;
    }

    /**
     * Sets the header value for this PriceTableRow.
     *
     * @param header
     */
    public void setHeader(java.lang.String header) {
        this.header = header;
    }

    /**
     * Gets the price value for this PriceTableRow.
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price value for this PriceTableRow.
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the priceQualifier value for this PriceTableRow.
     *
     * @return priceQualifier
     */
    public com.microsoft.bingads.v11.campaignmanagement.PriceQualifier getPriceQualifier() {
        return priceQualifier;
    }

    /**
     * Sets the priceQualifier value for this PriceTableRow.
     *
     * @param priceQualifier
     */
    public void setPriceQualifier(com.microsoft.bingads.v11.campaignmanagement.PriceQualifier priceQualifier) {
        this.priceQualifier = priceQualifier;
    }

    /**
     * Gets the priceUnit value for this PriceTableRow.
     *
     * @return priceUnit
     */
    public com.microsoft.bingads.v11.campaignmanagement.PriceUnit getPriceUnit() {
        return priceUnit;
    }

    /**
     * Sets the priceUnit value for this PriceTableRow.
     *
     * @param priceUnit
     */
    public void setPriceUnit(com.microsoft.bingads.v11.campaignmanagement.PriceUnit priceUnit) {
        this.priceUnit = priceUnit;
    }

    /**
     * Gets the termsAndConditions value for this PriceTableRow.
     *
     * @return termsAndConditions
     */
    public java.lang.String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets the termsAndConditions value for this PriceTableRow.
     *
     * @param termsAndConditions
     */
    public void setTermsAndConditions(java.lang.String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    /**
     * Gets the termsAndConditionsUrl value for this PriceTableRow.
     *
     * @return termsAndConditionsUrl
     */
    public java.lang.String getTermsAndConditionsUrl() {
        return termsAndConditionsUrl;
    }

    /**
     * Sets the termsAndConditionsUrl value for this PriceTableRow.
     *
     * @param termsAndConditionsUrl
     */
    public void setTermsAndConditionsUrl(java.lang.String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceTableRow)) return false;
        PriceTableRow other = (PriceTableRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.currencyCode == null && other.getCurrencyCode() == null) ||
                        (this.currencyCode != null &&
                                this.currencyCode.equals(other.getCurrencyCode()))) &&
                ((this.description == null && other.getDescription() == null) ||
                        (this.description != null &&
                                this.description.equals(other.getDescription()))) &&
                ((this.finalMobileUrls == null && other.getFinalMobileUrls() == null) ||
                        (this.finalMobileUrls != null &&
                                java.util.Arrays.equals(this.finalMobileUrls, other.getFinalMobileUrls()))) &&
                ((this.finalUrls == null && other.getFinalUrls() == null) ||
                        (this.finalUrls != null &&
                                java.util.Arrays.equals(this.finalUrls, other.getFinalUrls()))) &&
                ((this.header == null && other.getHeader() == null) ||
                        (this.header != null &&
                                this.header.equals(other.getHeader()))) &&
                this.price == other.getPrice() &&
                ((this.priceQualifier == null && other.getPriceQualifier() == null) ||
                        (this.priceQualifier != null &&
                                this.priceQualifier.equals(other.getPriceQualifier()))) &&
                ((this.priceUnit == null && other.getPriceUnit() == null) ||
                        (this.priceUnit != null &&
                                this.priceUnit.equals(other.getPriceUnit()))) &&
                ((this.termsAndConditions == null && other.getTermsAndConditions() == null) ||
                        (this.termsAndConditions != null &&
                                this.termsAndConditions.equals(other.getTermsAndConditions()))) &&
                ((this.termsAndConditionsUrl == null && other.getTermsAndConditionsUrl() == null) ||
                        (this.termsAndConditionsUrl != null &&
                                this.termsAndConditionsUrl.equals(other.getTermsAndConditionsUrl())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFinalMobileUrls() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFinalMobileUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalMobileUrls(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalUrls() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFinalUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalUrls(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        _hashCode += new Double(getPrice()).hashCode();
        if (getPriceQualifier() != null) {
            _hashCode += getPriceQualifier().hashCode();
        }
        if (getPriceUnit() != null) {
            _hashCode += getPriceUnit().hashCode();
        }
        if (getTermsAndConditions() != null) {
            _hashCode += getTermsAndConditions().hashCode();
        }
        if (getTermsAndConditionsUrl() != null) {
            _hashCode += getTermsAndConditionsUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
