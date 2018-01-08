/**
 * DeleteAdGroupCriterionsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class DeleteAdGroupCriterionsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DeleteAdGroupCriterionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">DeleteAdGroupCriterionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CriterionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "AdGroupCriterionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private long[] adGroupCriterionIds;
    private java.lang.Long adGroupId;
    private java.lang.String[] criterionType;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DeleteAdGroupCriterionsRequest() {
    }


    public DeleteAdGroupCriterionsRequest(
            long[] adGroupCriterionIds,
            java.lang.Long adGroupId,
            java.lang.String[] criterionType) {
        this.adGroupCriterionIds = adGroupCriterionIds;
        this.adGroupId = adGroupId;
        this.criterionType = criterionType;
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
     * Gets the adGroupCriterionIds value for this DeleteAdGroupCriterionsRequest.
     *
     * @return adGroupCriterionIds
     */
    public long[] getAdGroupCriterionIds() {
        return adGroupCriterionIds;
    }

    /**
     * Sets the adGroupCriterionIds value for this DeleteAdGroupCriterionsRequest.
     *
     * @param adGroupCriterionIds
     */
    public void setAdGroupCriterionIds(long[] adGroupCriterionIds) {
        this.adGroupCriterionIds = adGroupCriterionIds;
    }

    /**
     * Gets the adGroupId value for this DeleteAdGroupCriterionsRequest.
     *
     * @return adGroupId
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the adGroupId value for this DeleteAdGroupCriterionsRequest.
     *
     * @param adGroupId
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * Gets the criterionType value for this DeleteAdGroupCriterionsRequest.
     *
     * @return criterionType
     */
    public java.lang.String[] getCriterionType() {
        return criterionType;
    }

    /**
     * Sets the criterionType value for this DeleteAdGroupCriterionsRequest.
     *
     * @param criterionType
     */
    public void setCriterionType(java.lang.String[] criterionType) {
        this.criterionType = criterionType;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteAdGroupCriterionsRequest)) return false;
        DeleteAdGroupCriterionsRequest other = (DeleteAdGroupCriterionsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.adGroupCriterionIds == null && other.getAdGroupCriterionIds() == null) ||
                        (this.adGroupCriterionIds != null &&
                                java.util.Arrays.equals(this.adGroupCriterionIds, other.getAdGroupCriterionIds()))) &&
                ((this.adGroupId == null && other.getAdGroupId() == null) ||
                        (this.adGroupId != null &&
                                this.adGroupId.equals(other.getAdGroupId()))) &&
                ((this.criterionType == null && other.getCriterionType() == null) ||
                        (this.criterionType != null &&
                                java.util.Arrays.equals(this.criterionType, other.getCriterionType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdGroupCriterionIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdGroupCriterionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupCriterionIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getCriterionType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCriterionType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriterionType(), i);
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
