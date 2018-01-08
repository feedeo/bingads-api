/**
 * OfflineConversion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class OfflineConversion implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(OfflineConversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "OfflineConversion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionCurrencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionCurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ConversionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microsoftClickId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "MicrosoftClickId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String conversionCurrencyCode;
    private java.lang.String conversionName;
    private java.util.Calendar conversionTime;
    private java.lang.Double conversionValue;
    private java.lang.String microsoftClickId;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public OfflineConversion() {
    }


    public OfflineConversion(
            java.lang.String conversionCurrencyCode,
            java.lang.String conversionName,
            java.util.Calendar conversionTime,
            java.lang.Double conversionValue,
            java.lang.String microsoftClickId) {
        this.conversionCurrencyCode = conversionCurrencyCode;
        this.conversionName = conversionName;
        this.conversionTime = conversionTime;
        this.conversionValue = conversionValue;
        this.microsoftClickId = microsoftClickId;
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
     * Gets the conversionCurrencyCode value for this OfflineConversion.
     *
     * @return conversionCurrencyCode
     */
    public java.lang.String getConversionCurrencyCode() {
        return conversionCurrencyCode;
    }

    /**
     * Sets the conversionCurrencyCode value for this OfflineConversion.
     *
     * @param conversionCurrencyCode
     */
    public void setConversionCurrencyCode(java.lang.String conversionCurrencyCode) {
        this.conversionCurrencyCode = conversionCurrencyCode;
    }

    /**
     * Gets the conversionName value for this OfflineConversion.
     *
     * @return conversionName
     */
    public java.lang.String getConversionName() {
        return conversionName;
    }

    /**
     * Sets the conversionName value for this OfflineConversion.
     *
     * @param conversionName
     */
    public void setConversionName(java.lang.String conversionName) {
        this.conversionName = conversionName;
    }

    /**
     * Gets the conversionTime value for this OfflineConversion.
     *
     * @return conversionTime
     */
    public java.util.Calendar getConversionTime() {
        return conversionTime;
    }

    /**
     * Sets the conversionTime value for this OfflineConversion.
     *
     * @param conversionTime
     */
    public void setConversionTime(java.util.Calendar conversionTime) {
        this.conversionTime = conversionTime;
    }

    /**
     * Gets the conversionValue value for this OfflineConversion.
     *
     * @return conversionValue
     */
    public java.lang.Double getConversionValue() {
        return conversionValue;
    }

    /**
     * Sets the conversionValue value for this OfflineConversion.
     *
     * @param conversionValue
     */
    public void setConversionValue(java.lang.Double conversionValue) {
        this.conversionValue = conversionValue;
    }

    /**
     * Gets the microsoftClickId value for this OfflineConversion.
     *
     * @return microsoftClickId
     */
    public java.lang.String getMicrosoftClickId() {
        return microsoftClickId;
    }

    /**
     * Sets the microsoftClickId value for this OfflineConversion.
     *
     * @param microsoftClickId
     */
    public void setMicrosoftClickId(java.lang.String microsoftClickId) {
        this.microsoftClickId = microsoftClickId;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfflineConversion)) return false;
        OfflineConversion other = (OfflineConversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.conversionCurrencyCode == null && other.getConversionCurrencyCode() == null) ||
                        (this.conversionCurrencyCode != null &&
                                this.conversionCurrencyCode.equals(other.getConversionCurrencyCode()))) &&
                ((this.conversionName == null && other.getConversionName() == null) ||
                        (this.conversionName != null &&
                                this.conversionName.equals(other.getConversionName()))) &&
                ((this.conversionTime == null && other.getConversionTime() == null) ||
                        (this.conversionTime != null &&
                                this.conversionTime.equals(other.getConversionTime()))) &&
                ((this.conversionValue == null && other.getConversionValue() == null) ||
                        (this.conversionValue != null &&
                                this.conversionValue.equals(other.getConversionValue()))) &&
                ((this.microsoftClickId == null && other.getMicrosoftClickId() == null) ||
                        (this.microsoftClickId != null &&
                                this.microsoftClickId.equals(other.getMicrosoftClickId())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getConversionCurrencyCode() != null) {
            _hashCode += getConversionCurrencyCode().hashCode();
        }
        if (getConversionName() != null) {
            _hashCode += getConversionName().hashCode();
        }
        if (getConversionTime() != null) {
            _hashCode += getConversionTime().hashCode();
        }
        if (getConversionValue() != null) {
            _hashCode += getConversionValue().hashCode();
        }
        if (getMicrosoftClickId() != null) {
            _hashCode += getMicrosoftClickId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
