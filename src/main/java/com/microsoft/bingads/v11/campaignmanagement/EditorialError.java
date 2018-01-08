/**
 * EditorialError.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class EditorialError extends com.microsoft.bingads.v11.campaignmanagement.BatchError implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(EditorialError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "EditorialError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appealable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Appealable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disapprovedText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "DisapprovedText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "PublisherCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Boolean appealable;
    private java.lang.String disapprovedText;
    private java.lang.String location;
    private java.lang.String publisherCountry;
    private java.lang.Integer reasonCode;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public EditorialError() {
    }


    public EditorialError(
            java.lang.Integer code,
            java.lang.String details,
            java.lang.String errorCode,
            java.lang.String fieldPath,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Integer index,
            java.lang.String message,
            java.lang.String type,
            java.lang.Boolean appealable,
            java.lang.String disapprovedText,
            java.lang.String location,
            java.lang.String publisherCountry,
            java.lang.Integer reasonCode) {
        super(
                code,
                details,
                errorCode,
                fieldPath,
                forwardCompatibilityMap,
                index,
                message,
                type);
        this.appealable = appealable;
        this.disapprovedText = disapprovedText;
        this.location = location;
        this.publisherCountry = publisherCountry;
        this.reasonCode = reasonCode;
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
     * Gets the appealable value for this EditorialError.
     *
     * @return appealable
     */
    public java.lang.Boolean getAppealable() {
        return appealable;
    }

    /**
     * Sets the appealable value for this EditorialError.
     *
     * @param appealable
     */
    public void setAppealable(java.lang.Boolean appealable) {
        this.appealable = appealable;
    }

    /**
     * Gets the disapprovedText value for this EditorialError.
     *
     * @return disapprovedText
     */
    public java.lang.String getDisapprovedText() {
        return disapprovedText;
    }

    /**
     * Sets the disapprovedText value for this EditorialError.
     *
     * @param disapprovedText
     */
    public void setDisapprovedText(java.lang.String disapprovedText) {
        this.disapprovedText = disapprovedText;
    }

    /**
     * Gets the location value for this EditorialError.
     *
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }

    /**
     * Sets the location value for this EditorialError.
     *
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    /**
     * Gets the publisherCountry value for this EditorialError.
     *
     * @return publisherCountry
     */
    public java.lang.String getPublisherCountry() {
        return publisherCountry;
    }

    /**
     * Sets the publisherCountry value for this EditorialError.
     *
     * @param publisherCountry
     */
    public void setPublisherCountry(java.lang.String publisherCountry) {
        this.publisherCountry = publisherCountry;
    }

    /**
     * Gets the reasonCode value for this EditorialError.
     *
     * @return reasonCode
     */
    public java.lang.Integer getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the reasonCode value for this EditorialError.
     *
     * @param reasonCode
     */
    public void setReasonCode(java.lang.Integer reasonCode) {
        this.reasonCode = reasonCode;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditorialError)) return false;
        EditorialError other = (EditorialError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.appealable == null && other.getAppealable() == null) ||
                        (this.appealable != null &&
                                this.appealable.equals(other.getAppealable()))) &&
                ((this.disapprovedText == null && other.getDisapprovedText() == null) ||
                        (this.disapprovedText != null &&
                                this.disapprovedText.equals(other.getDisapprovedText()))) &&
                ((this.location == null && other.getLocation() == null) ||
                        (this.location != null &&
                                this.location.equals(other.getLocation()))) &&
                ((this.publisherCountry == null && other.getPublisherCountry() == null) ||
                        (this.publisherCountry != null &&
                                this.publisherCountry.equals(other.getPublisherCountry()))) &&
                ((this.reasonCode == null && other.getReasonCode() == null) ||
                        (this.reasonCode != null &&
                                this.reasonCode.equals(other.getReasonCode())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAppealable() != null) {
            _hashCode += getAppealable().hashCode();
        }
        if (getDisapprovedText() != null) {
            _hashCode += getDisapprovedText().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getPublisherCountry() != null) {
            _hashCode += getPublisherCountry().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
