/**
 * StructuredSnippetAdExtension.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class StructuredSnippetAdExtension extends com.microsoft.bingads.v11.campaignmanagement.AdExtension implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(StructuredSnippetAdExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "StructuredSnippetAdExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String header;
    private java.lang.String[] values;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public StructuredSnippetAdExtension() {
    }


    public StructuredSnippetAdExtension(
            java.lang.Long devicePreference,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            com.microsoft.bingads.v11.campaignmanagement.Schedule scheduling,
            com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus status,
            java.lang.String type,
            java.lang.Integer version,
            java.lang.String header,
            java.lang.String[] values) {
        super(
                devicePreference,
                forwardCompatibilityMap,
                id,
                scheduling,
                status,
                type,
                version);
        this.header = header;
        this.values = values;
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
     * Gets the header value for this StructuredSnippetAdExtension.
     *
     * @return header
     */
    public java.lang.String getHeader() {
        return header;
    }

    /**
     * Sets the header value for this StructuredSnippetAdExtension.
     *
     * @param header
     */
    public void setHeader(java.lang.String header) {
        this.header = header;
    }

    /**
     * Gets the values value for this StructuredSnippetAdExtension.
     *
     * @return values
     */
    public java.lang.String[] getValues() {
        return values;
    }

    /**
     * Sets the values value for this StructuredSnippetAdExtension.
     *
     * @param values
     */
    public void setValues(java.lang.String[] values) {
        this.values = values;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StructuredSnippetAdExtension)) return false;
        StructuredSnippetAdExtension other = (StructuredSnippetAdExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.header == null && other.getHeader() == null) ||
                        (this.header != null &&
                                this.header.equals(other.getHeader()))) &&
                ((this.values == null && other.getValues() == null) ||
                        (this.values != null &&
                                java.util.Arrays.equals(this.values, other.getValues())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getValues() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
