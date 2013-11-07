/**
 * BudgetPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class BudgetPoint  implements java.io.Serializable {
    private java.lang.Double budgetAmount;

    private com.microsoft.bingads.v9.optimizer.entities.BudgetLandscapePoint[] budgetLandscapePoints;

    private com.microsoft.bingads.v9.optimizer.entities.BudgetPointType budgetPointType;

    private java.lang.Double estimatedAvgDailyClicks;

    private java.lang.Double estimatedAvgDailyCost;

    private java.lang.Double estimatedAvgDailyImpressions;

    public BudgetPoint() {
    }

    public BudgetPoint(
           java.lang.Double budgetAmount,
           com.microsoft.bingads.v9.optimizer.entities.BudgetLandscapePoint[] budgetLandscapePoints,
           com.microsoft.bingads.v9.optimizer.entities.BudgetPointType budgetPointType,
           java.lang.Double estimatedAvgDailyClicks,
           java.lang.Double estimatedAvgDailyCost,
           java.lang.Double estimatedAvgDailyImpressions) {
           this.budgetAmount = budgetAmount;
           this.budgetLandscapePoints = budgetLandscapePoints;
           this.budgetPointType = budgetPointType;
           this.estimatedAvgDailyClicks = estimatedAvgDailyClicks;
           this.estimatedAvgDailyCost = estimatedAvgDailyCost;
           this.estimatedAvgDailyImpressions = estimatedAvgDailyImpressions;
    }


    /**
     * Gets the budgetAmount value for this BudgetPoint.
     * 
     * @return budgetAmount
     */
    public java.lang.Double getBudgetAmount() {
        return budgetAmount;
    }


    /**
     * Sets the budgetAmount value for this BudgetPoint.
     * 
     * @param budgetAmount
     */
    public void setBudgetAmount(java.lang.Double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }


    /**
     * Gets the budgetLandscapePoints value for this BudgetPoint.
     * 
     * @return budgetLandscapePoints
     */
    public com.microsoft.bingads.v9.optimizer.entities.BudgetLandscapePoint[] getBudgetLandscapePoints() {
        return budgetLandscapePoints;
    }


    /**
     * Sets the budgetLandscapePoints value for this BudgetPoint.
     * 
     * @param budgetLandscapePoints
     */
    public void setBudgetLandscapePoints(com.microsoft.bingads.v9.optimizer.entities.BudgetLandscapePoint[] budgetLandscapePoints) {
        this.budgetLandscapePoints = budgetLandscapePoints;
    }


    /**
     * Gets the budgetPointType value for this BudgetPoint.
     * 
     * @return budgetPointType
     */
    public com.microsoft.bingads.v9.optimizer.entities.BudgetPointType getBudgetPointType() {
        return budgetPointType;
    }


    /**
     * Sets the budgetPointType value for this BudgetPoint.
     * 
     * @param budgetPointType
     */
    public void setBudgetPointType(com.microsoft.bingads.v9.optimizer.entities.BudgetPointType budgetPointType) {
        this.budgetPointType = budgetPointType;
    }


    /**
     * Gets the estimatedAvgDailyClicks value for this BudgetPoint.
     * 
     * @return estimatedAvgDailyClicks
     */
    public java.lang.Double getEstimatedAvgDailyClicks() {
        return estimatedAvgDailyClicks;
    }


    /**
     * Sets the estimatedAvgDailyClicks value for this BudgetPoint.
     * 
     * @param estimatedAvgDailyClicks
     */
    public void setEstimatedAvgDailyClicks(java.lang.Double estimatedAvgDailyClicks) {
        this.estimatedAvgDailyClicks = estimatedAvgDailyClicks;
    }


    /**
     * Gets the estimatedAvgDailyCost value for this BudgetPoint.
     * 
     * @return estimatedAvgDailyCost
     */
    public java.lang.Double getEstimatedAvgDailyCost() {
        return estimatedAvgDailyCost;
    }


    /**
     * Sets the estimatedAvgDailyCost value for this BudgetPoint.
     * 
     * @param estimatedAvgDailyCost
     */
    public void setEstimatedAvgDailyCost(java.lang.Double estimatedAvgDailyCost) {
        this.estimatedAvgDailyCost = estimatedAvgDailyCost;
    }


    /**
     * Gets the estimatedAvgDailyImpressions value for this BudgetPoint.
     * 
     * @return estimatedAvgDailyImpressions
     */
    public java.lang.Double getEstimatedAvgDailyImpressions() {
        return estimatedAvgDailyImpressions;
    }


    /**
     * Sets the estimatedAvgDailyImpressions value for this BudgetPoint.
     * 
     * @param estimatedAvgDailyImpressions
     */
    public void setEstimatedAvgDailyImpressions(java.lang.Double estimatedAvgDailyImpressions) {
        this.estimatedAvgDailyImpressions = estimatedAvgDailyImpressions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetPoint)) return false;
        BudgetPoint other = (BudgetPoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.budgetAmount==null && other.getBudgetAmount()==null) || 
             (this.budgetAmount!=null &&
              this.budgetAmount.equals(other.getBudgetAmount()))) &&
            ((this.budgetLandscapePoints==null && other.getBudgetLandscapePoints()==null) || 
             (this.budgetLandscapePoints!=null &&
              java.util.Arrays.equals(this.budgetLandscapePoints, other.getBudgetLandscapePoints()))) &&
            ((this.budgetPointType==null && other.getBudgetPointType()==null) || 
             (this.budgetPointType!=null &&
              this.budgetPointType.equals(other.getBudgetPointType()))) &&
            ((this.estimatedAvgDailyClicks==null && other.getEstimatedAvgDailyClicks()==null) || 
             (this.estimatedAvgDailyClicks!=null &&
              this.estimatedAvgDailyClicks.equals(other.getEstimatedAvgDailyClicks()))) &&
            ((this.estimatedAvgDailyCost==null && other.getEstimatedAvgDailyCost()==null) || 
             (this.estimatedAvgDailyCost!=null &&
              this.estimatedAvgDailyCost.equals(other.getEstimatedAvgDailyCost()))) &&
            ((this.estimatedAvgDailyImpressions==null && other.getEstimatedAvgDailyImpressions()==null) || 
             (this.estimatedAvgDailyImpressions!=null &&
              this.estimatedAvgDailyImpressions.equals(other.getEstimatedAvgDailyImpressions())));
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
        if (getBudgetAmount() != null) {
            _hashCode += getBudgetAmount().hashCode();
        }
        if (getBudgetLandscapePoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBudgetLandscapePoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBudgetLandscapePoints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBudgetPointType() != null) {
            _hashCode += getBudgetPointType().hashCode();
        }
        if (getEstimatedAvgDailyClicks() != null) {
            _hashCode += getEstimatedAvgDailyClicks().hashCode();
        }
        if (getEstimatedAvgDailyCost() != null) {
            _hashCode += getEstimatedAvgDailyCost().hashCode();
        }
        if (getEstimatedAvgDailyImpressions() != null) {
            _hashCode += getEstimatedAvgDailyImpressions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetPoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetLandscapePoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetLandscapePoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetLandscapePoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetLandscapePoint"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetPointType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPointType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPointType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedAvgDailyClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "EstimatedAvgDailyClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedAvgDailyCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "EstimatedAvgDailyCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedAvgDailyImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "EstimatedAvgDailyImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
