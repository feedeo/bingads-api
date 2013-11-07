/**
 * GetAdGroupBidLandscapeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.adintelligence;

public class GetAdGroupBidLandscapeResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.ArrayOfAdGroupBidLandscape bidLandscape;

    public GetAdGroupBidLandscapeResponse() {
    }

    public GetAdGroupBidLandscapeResponse(
           com.microsoft.bingads.v9.datacontracts.ArrayOfAdGroupBidLandscape bidLandscape) {
           this.bidLandscape = bidLandscape;
    }


    /**
     * Gets the bidLandscape value for this GetAdGroupBidLandscapeResponse.
     * 
     * @return bidLandscape
     */
    public com.microsoft.bingads.v9.datacontracts.ArrayOfAdGroupBidLandscape getBidLandscape() {
        return bidLandscape;
    }


    /**
     * Sets the bidLandscape value for this GetAdGroupBidLandscapeResponse.
     * 
     * @param bidLandscape
     */
    public void setBidLandscape(com.microsoft.bingads.v9.datacontracts.ArrayOfAdGroupBidLandscape bidLandscape) {
        this.bidLandscape = bidLandscape;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAdGroupBidLandscapeResponse)) return false;
        GetAdGroupBidLandscapeResponse other = (GetAdGroupBidLandscapeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bidLandscape==null && other.getBidLandscape()==null) || 
             (this.bidLandscape!=null &&
              this.bidLandscape.equals(other.getBidLandscape())));
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
        if (getBidLandscape() != null) {
            _hashCode += getBidLandscape().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAdGroupBidLandscapeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", ">GetAdGroupBidLandscapeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidLandscape");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/AdIntelligence/v9", "BidLandscape"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfAdGroupBidLandscape"));
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
