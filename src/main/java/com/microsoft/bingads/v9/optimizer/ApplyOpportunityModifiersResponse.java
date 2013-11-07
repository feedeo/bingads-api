/**
 * ApplyOpportunityModifiersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public class ApplyOpportunityModifiersResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.ArrayOfAppliedResult appliedResults;

    public ApplyOpportunityModifiersResponse() {
    }

    public ApplyOpportunityModifiersResponse(
           com.microsoft.bingads.v9.optimizer.entities.ArrayOfAppliedResult appliedResults) {
           this.appliedResults = appliedResults;
    }


    /**
     * Gets the appliedResults value for this ApplyOpportunityModifiersResponse.
     * 
     * @return appliedResults
     */
    public com.microsoft.bingads.v9.optimizer.entities.ArrayOfAppliedResult getAppliedResults() {
        return appliedResults;
    }


    /**
     * Sets the appliedResults value for this ApplyOpportunityModifiersResponse.
     * 
     * @param appliedResults
     */
    public void setAppliedResults(com.microsoft.bingads.v9.optimizer.entities.ArrayOfAppliedResult appliedResults) {
        this.appliedResults = appliedResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyOpportunityModifiersResponse)) return false;
        ApplyOpportunityModifiersResponse other = (ApplyOpportunityModifiersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appliedResults==null && other.getAppliedResults()==null) || 
             (this.appliedResults!=null &&
              this.appliedResults.equals(other.getAppliedResults())));
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
        if (getAppliedResults() != null) {
            _hashCode += getAppliedResults().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyOpportunityModifiersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">ApplyOpportunityModifiersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedResults");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "AppliedResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfAppliedResult"));
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
