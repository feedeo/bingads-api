/**
 * GetBroadMatchOpportunitiesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public class GetBroadMatchOpportunitiesResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.ArrayOfBroadMatchOpportunity opportunities;

    public GetBroadMatchOpportunitiesResponse() {
    }

    public GetBroadMatchOpportunitiesResponse(
           com.microsoft.bingads.v9.optimizer.entities.ArrayOfBroadMatchOpportunity opportunities) {
           this.opportunities = opportunities;
    }


    /**
     * Gets the opportunities value for this GetBroadMatchOpportunitiesResponse.
     * 
     * @return opportunities
     */
    public com.microsoft.bingads.v9.optimizer.entities.ArrayOfBroadMatchOpportunity getOpportunities() {
        return opportunities;
    }


    /**
     * Sets the opportunities value for this GetBroadMatchOpportunitiesResponse.
     * 
     * @param opportunities
     */
    public void setOpportunities(com.microsoft.bingads.v9.optimizer.entities.ArrayOfBroadMatchOpportunity opportunities) {
        this.opportunities = opportunities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBroadMatchOpportunitiesResponse)) return false;
        GetBroadMatchOpportunitiesResponse other = (GetBroadMatchOpportunitiesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        if (getOpportunities() != null) {
            _hashCode += getOpportunities().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBroadMatchOpportunitiesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBroadMatchOpportunitiesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "Opportunities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBroadMatchOpportunity"));
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
