/**
 * UserLocationPerformanceReportFilter.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.reporting;

public class UserLocationPerformanceReportFilter implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UserLocationPerformanceReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "UserLocationPerformanceReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adDistribution");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdDistribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "AdDistributionReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v11", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String[] adDistribution;
    private java.lang.String[] countryCode;
    private java.lang.String[] languageCode;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UserLocationPerformanceReportFilter() {
    }


    public UserLocationPerformanceReportFilter(
            java.lang.String[] adDistribution,
            java.lang.String[] countryCode,
            java.lang.String[] languageCode) {
        this.adDistribution = adDistribution;
        this.countryCode = countryCode;
        this.languageCode = languageCode;
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
     * Gets the adDistribution value for this UserLocationPerformanceReportFilter.
     *
     * @return adDistribution
     */
    public java.lang.String[] getAdDistribution() {
        return adDistribution;
    }

    /**
     * Sets the adDistribution value for this UserLocationPerformanceReportFilter.
     *
     * @param adDistribution
     */
    public void setAdDistribution(java.lang.String[] adDistribution) {
        this.adDistribution = adDistribution;
    }

    /**
     * Gets the countryCode value for this UserLocationPerformanceReportFilter.
     *
     * @return countryCode
     */
    public java.lang.String[] getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the countryCode value for this UserLocationPerformanceReportFilter.
     *
     * @param countryCode
     */
    public void setCountryCode(java.lang.String[] countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Gets the languageCode value for this UserLocationPerformanceReportFilter.
     *
     * @return languageCode
     */
    public java.lang.String[] getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the languageCode value for this UserLocationPerformanceReportFilter.
     *
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String[] languageCode) {
        this.languageCode = languageCode;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserLocationPerformanceReportFilter)) return false;
        UserLocationPerformanceReportFilter other = (UserLocationPerformanceReportFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.adDistribution == null && other.getAdDistribution() == null) ||
                        (this.adDistribution != null &&
                                java.util.Arrays.equals(this.adDistribution, other.getAdDistribution()))) &&
                ((this.countryCode == null && other.getCountryCode() == null) ||
                        (this.countryCode != null &&
                                java.util.Arrays.equals(this.countryCode, other.getCountryCode()))) &&
                ((this.languageCode == null && other.getLanguageCode() == null) ||
                        (this.languageCode != null &&
                                java.util.Arrays.equals(this.languageCode, other.getLanguageCode())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdDistribution() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdDistribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdDistribution(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryCode() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCountryCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryCode(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguageCode() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getLanguageCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguageCode(), i);
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
