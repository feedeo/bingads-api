/**
 * BiddableCampaignCriterion.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class BiddableCampaignCriterion extends com.microsoft.bingads.v11.campaignmanagement.CampaignCriterion implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BiddableCampaignCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BiddableCampaignCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CriterionBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "CriterionBid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.CriterionBid criterionBid;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public BiddableCampaignCriterion() {
    }

    public BiddableCampaignCriterion(
            long campaignId,
            com.microsoft.bingads.v11.campaignmanagement.Criterion criterion,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Long id,
            com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionStatus status,
            java.lang.String type,
            com.microsoft.bingads.v11.campaignmanagement.CriterionBid criterionBid) {
        super(
                campaignId,
                criterion,
                forwardCompatibilityMap,
                id,
                status,
                type);
        this.criterionBid = criterionBid;
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
     * Gets the criterionBid value for this BiddableCampaignCriterion.
     *
     * @return criterionBid
     */
    public com.microsoft.bingads.v11.campaignmanagement.CriterionBid getCriterionBid() {
        return criterionBid;
    }

    /**
     * Sets the criterionBid value for this BiddableCampaignCriterion.
     *
     * @param criterionBid
     */
    public void setCriterionBid(com.microsoft.bingads.v11.campaignmanagement.CriterionBid criterionBid) {
        this.criterionBid = criterionBid;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiddableCampaignCriterion)) return false;
        BiddableCampaignCriterion other = (BiddableCampaignCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.criterionBid == null && other.getCriterionBid() == null) ||
                        (this.criterionBid != null &&
                                this.criterionBid.equals(other.getCriterionBid())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCriterionBid() != null) {
            _hashCode += getCriterionBid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
