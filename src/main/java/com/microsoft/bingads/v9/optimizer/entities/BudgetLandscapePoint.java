/**
 * BudgetLandscapePoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer.entities;

public class BudgetLandscapePoint  implements java.io.Serializable {
    private java.util.Calendar budgetLandscapePointDate;

    private java.lang.Double clicks;

    private java.lang.Double estimatedClicks;

    private java.lang.Long estimatedImpressions;

    private java.lang.Long impressions;

    public BudgetLandscapePoint() {
    }

    public BudgetLandscapePoint(
           java.util.Calendar budgetLandscapePointDate,
           java.lang.Double clicks,
           java.lang.Double estimatedClicks,
           java.lang.Long estimatedImpressions,
           java.lang.Long impressions) {
           this.budgetLandscapePointDate = budgetLandscapePointDate;
           this.clicks = clicks;
           this.estimatedClicks = estimatedClicks;
           this.estimatedImpressions = estimatedImpressions;
           this.impressions = impressions;
    }


    /**
     * Gets the budgetLandscapePointDate value for this BudgetLandscapePoint.
     * 
     * @return budgetLandscapePointDate
     */
    public java.util.Calendar getBudgetLandscapePointDate() {
        return budgetLandscapePointDate;
    }


    /**
     * Sets the budgetLandscapePointDate value for this BudgetLandscapePoint.
     * 
     * @param budgetLandscapePointDate
     */
    public void setBudgetLandscapePointDate(java.util.Calendar budgetLandscapePointDate) {
        this.budgetLandscapePointDate = budgetLandscapePointDate;
    }


    /**
     * Gets the clicks value for this BudgetLandscapePoint.
     * 
     * @return clicks
     */
    public java.lang.Double getClicks() {
        return clicks;
    }


    /**
     * Sets the clicks value for this BudgetLandscapePoint.
     * 
     * @param clicks
     */
    public void setClicks(java.lang.Double clicks) {
        this.clicks = clicks;
    }


    /**
     * Gets the estimatedClicks value for this BudgetLandscapePoint.
     * 
     * @return estimatedClicks
     */
    public java.lang.Double getEstimatedClicks() {
        return estimatedClicks;
    }


    /**
     * Sets the estimatedClicks value for this BudgetLandscapePoint.
     * 
     * @param estimatedClicks
     */
    public void setEstimatedClicks(java.lang.Double estimatedClicks) {
        this.estimatedClicks = estimatedClicks;
    }


    /**
     * Gets the estimatedImpressions value for this BudgetLandscapePoint.
     * 
     * @return estimatedImpressions
     */
    public java.lang.Long getEstimatedImpressions() {
        return estimatedImpressions;
    }


    /**
     * Sets the estimatedImpressions value for this BudgetLandscapePoint.
     * 
     * @param estimatedImpressions
     */
    public void setEstimatedImpressions(java.lang.Long estimatedImpressions) {
        this.estimatedImpressions = estimatedImpressions;
    }


    /**
     * Gets the impressions value for this BudgetLandscapePoint.
     * 
     * @return impressions
     */
    public java.lang.Long getImpressions() {
        return impressions;
    }


    /**
     * Sets the impressions value for this BudgetLandscapePoint.
     * 
     * @param impressions
     */
    public void setImpressions(java.lang.Long impressions) {
        this.impressions = impressions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetLandscapePoint)) return false;
        BudgetLandscapePoint other = (BudgetLandscapePoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.budgetLandscapePointDate==null && other.getBudgetLandscapePointDate()==null) || 
             (this.budgetLandscapePointDate!=null &&
              this.budgetLandscapePointDate.equals(other.getBudgetLandscapePointDate()))) &&
            ((this.clicks==null && other.getClicks()==null) || 
             (this.clicks!=null &&
              this.clicks.equals(other.getClicks()))) &&
            ((this.estimatedClicks==null && other.getEstimatedClicks()==null) || 
             (this.estimatedClicks!=null &&
              this.estimatedClicks.equals(other.getEstimatedClicks()))) &&
            ((this.estimatedImpressions==null && other.getEstimatedImpressions()==null) || 
             (this.estimatedImpressions!=null &&
              this.estimatedImpressions.equals(other.getEstimatedImpressions()))) &&
            ((this.impressions==null && other.getImpressions()==null) || 
             (this.impressions!=null &&
              this.impressions.equals(other.getImpressions())));
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
        if (getBudgetLandscapePointDate() != null) {
            _hashCode += getBudgetLandscapePointDate().hashCode();
        }
        if (getClicks() != null) {
            _hashCode += getClicks().hashCode();
        }
        if (getEstimatedClicks() != null) {
            _hashCode += getEstimatedClicks().hashCode();
        }
        if (getEstimatedImpressions() != null) {
            _hashCode += getEstimatedImpressions().hashCode();
        }
        if (getImpressions() != null) {
            _hashCode += getImpressions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetLandscapePoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetLandscapePoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetLandscapePointDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetLandscapePointDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clicks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "Clicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "EstimatedClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "EstimatedImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "Impressions"));
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
