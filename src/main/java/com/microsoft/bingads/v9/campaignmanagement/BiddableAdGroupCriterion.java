/**
 * BiddableAdGroupCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class BiddableAdGroupCriterion  extends com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterion  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.CriterionBid criterionBid;

    private java.lang.String destinationUrl;

    private com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterionEditorialStatus editorialStatus;

    private java.lang.String param1;

    private java.lang.String param2;

    private java.lang.String param3;

    public BiddableAdGroupCriterion() {
    }

    public BiddableAdGroupCriterion(
           java.lang.Long adGroupId,
           com.microsoft.bingads.v9.campaignmanagement.Criterion criterion,
           java.lang.Long id,
           com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterionStatus status,
           java.lang.String type,
           com.microsoft.bingads.v9.campaignmanagement.CriterionBid criterionBid,
           java.lang.String destinationUrl,
           com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterionEditorialStatus editorialStatus,
           java.lang.String param1,
           java.lang.String param2,
           java.lang.String param3) {
        super(
            adGroupId,
            criterion,
            id,
            status,
            type);
        this.criterionBid = criterionBid;
        this.destinationUrl = destinationUrl;
        this.editorialStatus = editorialStatus;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }


    /**
     * Gets the criterionBid value for this BiddableAdGroupCriterion.
     * 
     * @return criterionBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.CriterionBid getCriterionBid() {
        return criterionBid;
    }


    /**
     * Sets the criterionBid value for this BiddableAdGroupCriterion.
     * 
     * @param criterionBid
     */
    public void setCriterionBid(com.microsoft.bingads.v9.campaignmanagement.CriterionBid criterionBid) {
        this.criterionBid = criterionBid;
    }


    /**
     * Gets the destinationUrl value for this BiddableAdGroupCriterion.
     * 
     * @return destinationUrl
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }


    /**
     * Sets the destinationUrl value for this BiddableAdGroupCriterion.
     * 
     * @param destinationUrl
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }


    /**
     * Gets the editorialStatus value for this BiddableAdGroupCriterion.
     * 
     * @return editorialStatus
     */
    public com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterionEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }


    /**
     * Sets the editorialStatus value for this BiddableAdGroupCriterion.
     * 
     * @param editorialStatus
     */
    public void setEditorialStatus(com.microsoft.bingads.v9.campaignmanagement.AdGroupCriterionEditorialStatus editorialStatus) {
        this.editorialStatus = editorialStatus;
    }


    /**
     * Gets the param1 value for this BiddableAdGroupCriterion.
     * 
     * @return param1
     */
    public java.lang.String getParam1() {
        return param1;
    }


    /**
     * Sets the param1 value for this BiddableAdGroupCriterion.
     * 
     * @param param1
     */
    public void setParam1(java.lang.String param1) {
        this.param1 = param1;
    }


    /**
     * Gets the param2 value for this BiddableAdGroupCriterion.
     * 
     * @return param2
     */
    public java.lang.String getParam2() {
        return param2;
    }


    /**
     * Sets the param2 value for this BiddableAdGroupCriterion.
     * 
     * @param param2
     */
    public void setParam2(java.lang.String param2) {
        this.param2 = param2;
    }


    /**
     * Gets the param3 value for this BiddableAdGroupCriterion.
     * 
     * @return param3
     */
    public java.lang.String getParam3() {
        return param3;
    }


    /**
     * Sets the param3 value for this BiddableAdGroupCriterion.
     * 
     * @param param3
     */
    public void setParam3(java.lang.String param3) {
        this.param3 = param3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiddableAdGroupCriterion)) return false;
        BiddableAdGroupCriterion other = (BiddableAdGroupCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.criterionBid==null && other.getCriterionBid()==null) || 
             (this.criterionBid!=null &&
              this.criterionBid.equals(other.getCriterionBid()))) &&
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.editorialStatus==null && other.getEditorialStatus()==null) || 
             (this.editorialStatus!=null &&
              this.editorialStatus.equals(other.getEditorialStatus()))) &&
            ((this.param1==null && other.getParam1()==null) || 
             (this.param1!=null &&
              this.param1.equals(other.getParam1()))) &&
            ((this.param2==null && other.getParam2()==null) || 
             (this.param2!=null &&
              this.param2.equals(other.getParam2()))) &&
            ((this.param3==null && other.getParam3()==null) || 
             (this.param3!=null &&
              this.param3.equals(other.getParam3())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCriterionBid() != null) {
            _hashCode += getCriterionBid().hashCode();
        }
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getEditorialStatus() != null) {
            _hashCode += getEditorialStatus().hashCode();
        }
        if (getParam1() != null) {
            _hashCode += getParam1().hashCode();
        }
        if (getParam2() != null) {
            _hashCode += getParam2().hashCode();
        }
        if (getParam3() != null) {
            _hashCode += getParam3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiddableAdGroupCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "BiddableAdGroupCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CriterionBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "CriterionBid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "DestinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EditorialStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AdGroupCriterionEditorialStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Param1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Param2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param3");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "Param3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
