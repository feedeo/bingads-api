/**
 * RichAdComponentPerformanceReportFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class RichAdComponentPerformanceReportFilter  implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RichAdComponentPerformanceReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AccountStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "AdStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "CampaignStatusReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ComponentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ComponentTypeFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richAdSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "RichAdSubTypeFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String[] accountStatus;
    private java.lang.String[] adGroupStatus;
    private java.lang.String[] adStatus;
    private java.lang.String[] campaignStatus;
    private java.lang.String[] componentType;
    private java.lang.String[] richAdSubType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public RichAdComponentPerformanceReportFilter() {
    }


    public RichAdComponentPerformanceReportFilter(
            java.lang.String[] accountStatus,
            java.lang.String[] adGroupStatus,
            java.lang.String[] adStatus,
            java.lang.String[] campaignStatus,
            java.lang.String[] componentType,
            java.lang.String[] richAdSubType) {
        this.accountStatus = accountStatus;
        this.adGroupStatus = adGroupStatus;
        this.adStatus = adStatus;
        this.campaignStatus = campaignStatus;
           this.componentType = componentType;
           this.richAdSubType = richAdSubType;
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
     * Gets the accountStatus value for this RichAdComponentPerformanceReportFilter.
     *
     * @return accountStatus
     */
    public java.lang.String[] getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the accountStatus value for this RichAdComponentPerformanceReportFilter.
     *
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String[] accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * Gets the adGroupStatus value for this RichAdComponentPerformanceReportFilter.
     *
     * @return adGroupStatus
     */
    public java.lang.String[] getAdGroupStatus() {
        return adGroupStatus;
    }

    /**
     * Sets the adGroupStatus value for this RichAdComponentPerformanceReportFilter.
     *
     * @param adGroupStatus
     */
    public void setAdGroupStatus(java.lang.String[] adGroupStatus) {
        this.adGroupStatus = adGroupStatus;
    }

    /**
     * Gets the adStatus value for this RichAdComponentPerformanceReportFilter.
     *
     * @return adStatus
     */
    public java.lang.String[] getAdStatus() {
        return adStatus;
    }

    /**
     * Sets the adStatus value for this RichAdComponentPerformanceReportFilter.
     *
     * @param adStatus
     */
    public void setAdStatus(java.lang.String[] adStatus) {
        this.adStatus = adStatus;
    }

    /**
     * Gets the campaignStatus value for this RichAdComponentPerformanceReportFilter.
     *
     * @return campaignStatus
     */
    public java.lang.String[] getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Sets the campaignStatus value for this RichAdComponentPerformanceReportFilter.
     *
     * @param campaignStatus
     */
    public void setCampaignStatus(java.lang.String[] campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * Gets the componentType value for this RichAdComponentPerformanceReportFilter.
     *
     * @return componentType
     */
    public java.lang.String[] getComponentType() {
        return componentType;
    }

    /**
     * Sets the componentType value for this RichAdComponentPerformanceReportFilter.
     *
     * @param componentType
     */
    public void setComponentType(java.lang.String[] componentType) {
        this.componentType = componentType;
    }

    /**
     * Gets the richAdSubType value for this RichAdComponentPerformanceReportFilter.
     *
     * @return richAdSubType
     */
    public java.lang.String[] getRichAdSubType() {
        return richAdSubType;
    }

    /**
     * Sets the richAdSubType value for this RichAdComponentPerformanceReportFilter.
     *
     * @param richAdSubType
     */
    public void setRichAdSubType(java.lang.String[] richAdSubType) {
        this.richAdSubType = richAdSubType;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichAdComponentPerformanceReportFilter)) return false;
        RichAdComponentPerformanceReportFilter other = (RichAdComponentPerformanceReportFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.accountStatus==null && other.getAccountStatus() == null) ||
                    (this.accountStatus != null &&
                            java.util.Arrays.equals(this.accountStatus, other.getAccountStatus()))) &&
                ((this.adGroupStatus == null && other.getAdGroupStatus() == null) ||
                        (this.adGroupStatus != null &&
                                java.util.Arrays.equals(this.adGroupStatus, other.getAdGroupStatus()))) &&
                ((this.adStatus == null && other.getAdStatus() == null) ||
                        (this.adStatus != null &&
                                java.util.Arrays.equals(this.adStatus, other.getAdStatus()))) &&
                ((this.campaignStatus == null && other.getCampaignStatus() == null) ||
                        (this.campaignStatus != null &&
                                java.util.Arrays.equals(this.campaignStatus, other.getCampaignStatus()))) &&
                ((this.componentType == null && other.getComponentType() == null) ||
                        (this.componentType != null &&
                                java.util.Arrays.equals(this.componentType, other.getComponentType()))) &&
                ((this.richAdSubType == null && other.getRichAdSubType() == null) ||
                        (this.richAdSubType != null &&
                                java.util.Arrays.equals(this.richAdSubType, other.getRichAdSubType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAccountStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountStatus(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdGroupStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdGroupStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupStatus(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdStatus(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignStatus() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCampaignStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignStatus(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentType() != null) {
            for (int i = 0;
                 i<java.lang.reflect.Array.getLength(getComponentType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRichAdSubType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRichAdSubType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRichAdSubType(), i);
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
