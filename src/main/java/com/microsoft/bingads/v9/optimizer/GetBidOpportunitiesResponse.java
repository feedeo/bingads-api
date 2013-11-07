/**
 * GetBidOpportunitiesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public class GetBidOpportunitiesResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.BidOpportunity[] opportunities;

    public GetBidOpportunitiesResponse() {
    }

    public GetBidOpportunitiesResponse(
           com.microsoft.bingads.v9.optimizer.entities.BidOpportunity[] opportunities) {
           this.opportunities = opportunities;
    }


    /**
     * Gets the opportunities value for this GetBidOpportunitiesResponse.
     * 
     * @return opportunities
     */
    public com.microsoft.bingads.v9.optimizer.entities.BidOpportunity[] getOpportunities() {
        return opportunities;
    }


    /**
     * Sets the opportunities value for this GetBidOpportunitiesResponse.
     * 
     * @param opportunities
     */
    public void setOpportunities(com.microsoft.bingads.v9.optimizer.entities.BidOpportunity[] opportunities) {
        this.opportunities = opportunities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBidOpportunitiesResponse)) return false;
        GetBidOpportunitiesResponse other = (GetBidOpportunitiesResponse) obj;
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
              java.util.Arrays.equals(this.opportunities, other.getOpportunities())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpportunities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpportunities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBidOpportunitiesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBidOpportunitiesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "Opportunities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BidOpportunity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BidOpportunity"));
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
