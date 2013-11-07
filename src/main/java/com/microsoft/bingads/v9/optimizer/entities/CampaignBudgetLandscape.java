/**
 * CampaignBudgetLandscape.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class CampaignBudgetLandscape  extends com.microsoft.bingads.v9.optimizer.entities.Opportunity  implements java.io.Serializable {
    private java.util.Calendar baseDate;

    private com.microsoft.bingads.v9.optimizer.entities.BudgetPoint[] budgetPoints;

    private java.lang.Long campaignId;

    public CampaignBudgetLandscape() {
    }

    public CampaignBudgetLandscape(
           java.util.Calendar expirationDate,
           java.lang.String opportunityKey,
           java.util.Calendar baseDate,
           com.microsoft.bingads.v9.optimizer.entities.BudgetPoint[] budgetPoints,
           java.lang.Long campaignId) {
        super(
            expirationDate,
            opportunityKey);
        this.baseDate = baseDate;
        this.budgetPoints = budgetPoints;
        this.campaignId = campaignId;
    }


    /**
     * Gets the baseDate value for this CampaignBudgetLandscape.
     * 
     * @return baseDate
     */
    public java.util.Calendar getBaseDate() {
        return baseDate;
    }


    /**
     * Sets the baseDate value for this CampaignBudgetLandscape.
     * 
     * @param baseDate
     */
    public void setBaseDate(java.util.Calendar baseDate) {
        this.baseDate = baseDate;
    }


    /**
     * Gets the budgetPoints value for this CampaignBudgetLandscape.
     * 
     * @return budgetPoints
     */
    public com.microsoft.bingads.v9.optimizer.entities.BudgetPoint[] getBudgetPoints() {
        return budgetPoints;
    }


    /**
     * Sets the budgetPoints value for this CampaignBudgetLandscape.
     * 
     * @param budgetPoints
     */
    public void setBudgetPoints(com.microsoft.bingads.v9.optimizer.entities.BudgetPoint[] budgetPoints) {
        this.budgetPoints = budgetPoints;
    }


    /**
     * Gets the campaignId value for this CampaignBudgetLandscape.
     * 
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignBudgetLandscape.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignBudgetLandscape)) return false;
        CampaignBudgetLandscape other = (CampaignBudgetLandscape) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.baseDate==null && other.getBaseDate()==null) || 
             (this.baseDate!=null &&
              this.baseDate.equals(other.getBaseDate()))) &&
            ((this.budgetPoints==null && other.getBudgetPoints()==null) || 
             (this.budgetPoints!=null &&
              java.util.Arrays.equals(this.budgetPoints, other.getBudgetPoints()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId())));
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
        if (getBaseDate() != null) {
            _hashCode += getBaseDate().hashCode();
        }
        if (getBudgetPoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBudgetPoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBudgetPoints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignBudgetLandscape.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CampaignBudgetLandscape"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPoint"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
