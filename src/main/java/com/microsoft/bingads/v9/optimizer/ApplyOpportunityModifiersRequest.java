/**
 * ApplyOpportunityModifiersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public class ApplyOpportunityModifiersRequest  implements java.io.Serializable {
    private java.lang.Long accountId;

    private com.microsoft.bingads.v9.optimizer.entities.OpportunityAction action;

    private com.microsoft.bingads.v9.optimizer.entities.ArrayOfOpportunityModifier opportunities;

    public ApplyOpportunityModifiersRequest() {
    }

    public ApplyOpportunityModifiersRequest(
           java.lang.Long accountId,
           com.microsoft.bingads.v9.optimizer.entities.OpportunityAction action,
           com.microsoft.bingads.v9.optimizer.entities.ArrayOfOpportunityModifier opportunities) {
           this.accountId = accountId;
           this.action = action;
           this.opportunities = opportunities;
    }


    /**
     * Gets the accountId value for this ApplyOpportunityModifiersRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this ApplyOpportunityModifiersRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the action value for this ApplyOpportunityModifiersRequest.
     * 
     * @return action
     */
    public com.microsoft.bingads.v9.optimizer.entities.OpportunityAction getAction() {
        return action;
    }


    /**
     * Sets the action value for this ApplyOpportunityModifiersRequest.
     * 
     * @param action
     */
    public void setAction(com.microsoft.bingads.v9.optimizer.entities.OpportunityAction action) {
        this.action = action;
    }


    /**
     * Gets the opportunities value for this ApplyOpportunityModifiersRequest.
     * 
     * @return opportunities
     */
    public com.microsoft.bingads.v9.optimizer.entities.ArrayOfOpportunityModifier getOpportunities() {
        return opportunities;
    }


    /**
     * Sets the opportunities value for this ApplyOpportunityModifiersRequest.
     * 
     * @param opportunities
     */
    public void setOpportunities(com.microsoft.bingads.v9.optimizer.entities.ArrayOfOpportunityModifier opportunities) {
        this.opportunities = opportunities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyOpportunityModifiersRequest)) return false;
        ApplyOpportunityModifiersRequest other = (ApplyOpportunityModifiersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.opportunities==null && other.getOpportunities()==null) || 
             (this.opportunities!=null &&
              this.opportunities.equals(other.getOpportunities())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getOpportunities() != null) {
            _hashCode += getOpportunities().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyOpportunityModifiersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">ApplyOpportunityModifiersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "OpportunityAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "Opportunities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfOpportunityModifier"));
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
