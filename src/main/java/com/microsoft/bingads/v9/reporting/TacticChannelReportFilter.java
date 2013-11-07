/**
 * TacticChannelReportFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public class TacticChannelReportFilter  implements java.io.Serializable {
    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong channelIds;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong tacticIds;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong thirdPartyAdGroupIds;

    private com.microsoft.bingads.v9.schemas.arrays.ArrayOflong thirdPartyCampaignIds;

    public TacticChannelReportFilter() {
    }

    public TacticChannelReportFilter(
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong channelIds,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong tacticIds,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong thirdPartyAdGroupIds,
           com.microsoft.bingads.v9.schemas.arrays.ArrayOflong thirdPartyCampaignIds) {
           this.channelIds = channelIds;
           this.tacticIds = tacticIds;
           this.thirdPartyAdGroupIds = thirdPartyAdGroupIds;
           this.thirdPartyCampaignIds = thirdPartyCampaignIds;
    }


    /**
     * Gets the channelIds value for this TacticChannelReportFilter.
     * 
     * @return channelIds
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getChannelIds() {
        return channelIds;
    }


    /**
     * Sets the channelIds value for this TacticChannelReportFilter.
     * 
     * @param channelIds
     */
    public void setChannelIds(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong channelIds) {
        this.channelIds = channelIds;
    }


    /**
     * Gets the tacticIds value for this TacticChannelReportFilter.
     * 
     * @return tacticIds
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getTacticIds() {
        return tacticIds;
    }


    /**
     * Sets the tacticIds value for this TacticChannelReportFilter.
     * 
     * @param tacticIds
     */
    public void setTacticIds(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong tacticIds) {
        this.tacticIds = tacticIds;
    }


    /**
     * Gets the thirdPartyAdGroupIds value for this TacticChannelReportFilter.
     * 
     * @return thirdPartyAdGroupIds
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getThirdPartyAdGroupIds() {
        return thirdPartyAdGroupIds;
    }


    /**
     * Sets the thirdPartyAdGroupIds value for this TacticChannelReportFilter.
     * 
     * @param thirdPartyAdGroupIds
     */
    public void setThirdPartyAdGroupIds(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong thirdPartyAdGroupIds) {
        this.thirdPartyAdGroupIds = thirdPartyAdGroupIds;
    }


    /**
     * Gets the thirdPartyCampaignIds value for this TacticChannelReportFilter.
     * 
     * @return thirdPartyCampaignIds
     */
    public com.microsoft.bingads.v9.schemas.arrays.ArrayOflong getThirdPartyCampaignIds() {
        return thirdPartyCampaignIds;
    }


    /**
     * Sets the thirdPartyCampaignIds value for this TacticChannelReportFilter.
     * 
     * @param thirdPartyCampaignIds
     */
    public void setThirdPartyCampaignIds(com.microsoft.bingads.v9.schemas.arrays.ArrayOflong thirdPartyCampaignIds) {
        this.thirdPartyCampaignIds = thirdPartyCampaignIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TacticChannelReportFilter)) return false;
        TacticChannelReportFilter other = (TacticChannelReportFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.channelIds==null && other.getChannelIds()==null) || 
             (this.channelIds!=null &&
              this.channelIds.equals(other.getChannelIds()))) &&
            ((this.tacticIds==null && other.getTacticIds()==null) || 
             (this.tacticIds!=null &&
              this.tacticIds.equals(other.getTacticIds()))) &&
            ((this.thirdPartyAdGroupIds==null && other.getThirdPartyAdGroupIds()==null) || 
             (this.thirdPartyAdGroupIds!=null &&
              this.thirdPartyAdGroupIds.equals(other.getThirdPartyAdGroupIds()))) &&
            ((this.thirdPartyCampaignIds==null && other.getThirdPartyCampaignIds()==null) || 
             (this.thirdPartyCampaignIds!=null &&
              this.thirdPartyCampaignIds.equals(other.getThirdPartyCampaignIds())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getChannelIds() != null) {
            _hashCode += getChannelIds().hashCode();
        }
        if (getTacticIds() != null) {
            _hashCode += getTacticIds().hashCode();
        }
        if (getThirdPartyAdGroupIds() != null) {
            _hashCode += getThirdPartyAdGroupIds().hashCode();
        }
        if (getThirdPartyCampaignIds() != null) {
            _hashCode += getThirdPartyCampaignIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TacticChannelReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ChannelIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacticIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "TacticIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAdGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ThirdPartyAdGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyCampaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Reporting/v9", "ThirdPartyCampaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
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
          new  org.apache.axis.encoding.ser.BeanSerializer(
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
