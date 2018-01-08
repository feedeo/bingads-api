/**
 * PriceAdExtension.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class PriceAdExtension extends com.microsoft.bingads.v11.campaignmanagement.AdExtension implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PriceAdExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceAdExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceExtensionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceExtensionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceExtensionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableRows");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TableRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceTableRow"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PriceTableRow"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "TrackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlCustomParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "UrlCustomParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", "CustomParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String language;
    private com.microsoft.bingads.v11.campaignmanagement.PriceExtensionType priceExtensionType;
    private com.microsoft.bingads.v11.campaignmanagement.PriceTableRow[] tableRows;
    private java.lang.String trackingUrlTemplate;
    private com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public PriceAdExtension() {
    }


    public PriceAdExtension(
            java.lang.Long devicePreference,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            com.microsoft.bingads.v11.campaignmanagement.Schedule scheduling,
            com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus status,
            java.lang.String type,
            java.lang.Integer version,
            java.lang.String language,
            com.microsoft.bingads.v11.campaignmanagement.PriceExtensionType priceExtensionType,
            com.microsoft.bingads.v11.campaignmanagement.PriceTableRow[] tableRows,
            java.lang.String trackingUrlTemplate,
            com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters) {
        super(
                devicePreference,
                forwardCompatibilityMap,
                id,
                scheduling,
                status,
                type,
                version);
        this.language = language;
        this.priceExtensionType = priceExtensionType;
        this.tableRows = tableRows;
        this.trackingUrlTemplate = trackingUrlTemplate;
        this.urlCustomParameters = urlCustomParameters;
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
     * Gets the language value for this PriceAdExtension.
     *
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }

    /**
     * Sets the language value for this PriceAdExtension.
     *
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    /**
     * Gets the priceExtensionType value for this PriceAdExtension.
     *
     * @return priceExtensionType
     */
    public com.microsoft.bingads.v11.campaignmanagement.PriceExtensionType getPriceExtensionType() {
        return priceExtensionType;
    }

    /**
     * Sets the priceExtensionType value for this PriceAdExtension.
     *
     * @param priceExtensionType
     */
    public void setPriceExtensionType(com.microsoft.bingads.v11.campaignmanagement.PriceExtensionType priceExtensionType) {
        this.priceExtensionType = priceExtensionType;
    }

    /**
     * Gets the tableRows value for this PriceAdExtension.
     *
     * @return tableRows
     */
    public com.microsoft.bingads.v11.campaignmanagement.PriceTableRow[] getTableRows() {
        return tableRows;
    }

    /**
     * Sets the tableRows value for this PriceAdExtension.
     *
     * @param tableRows
     */
    public void setTableRows(com.microsoft.bingads.v11.campaignmanagement.PriceTableRow[] tableRows) {
        this.tableRows = tableRows;
    }

    /**
     * Gets the trackingUrlTemplate value for this PriceAdExtension.
     *
     * @return trackingUrlTemplate
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the trackingUrlTemplate value for this PriceAdExtension.
     *
     * @param trackingUrlTemplate
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }

    /**
     * Gets the urlCustomParameters value for this PriceAdExtension.
     *
     * @return urlCustomParameters
     */
    public com.microsoft.bingads.v11.datacontracts.CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the urlCustomParameters value for this PriceAdExtension.
     *
     * @param urlCustomParameters
     */
    public void setUrlCustomParameters(com.microsoft.bingads.v11.datacontracts.CustomParameters urlCustomParameters) {
        this.urlCustomParameters = urlCustomParameters;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceAdExtension)) return false;
        PriceAdExtension other = (PriceAdExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.language == null && other.getLanguage() == null) ||
                        (this.language != null &&
                                this.language.equals(other.getLanguage()))) &&
                ((this.priceExtensionType == null && other.getPriceExtensionType() == null) ||
                        (this.priceExtensionType != null &&
                                this.priceExtensionType.equals(other.getPriceExtensionType()))) &&
                ((this.tableRows == null && other.getTableRows() == null) ||
                        (this.tableRows != null &&
                                java.util.Arrays.equals(this.tableRows, other.getTableRows()))) &&
                ((this.trackingUrlTemplate == null && other.getTrackingUrlTemplate() == null) ||
                        (this.trackingUrlTemplate != null &&
                                this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
                ((this.urlCustomParameters == null && other.getUrlCustomParameters() == null) ||
                        (this.urlCustomParameters != null &&
                                this.urlCustomParameters.equals(other.getUrlCustomParameters())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getPriceExtensionType() != null) {
            _hashCode += getPriceExtensionType().hashCode();
        }
        if (getTableRows() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTableRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTableRows(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getUrlCustomParameters() != null) {
            _hashCode += getUrlCustomParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
