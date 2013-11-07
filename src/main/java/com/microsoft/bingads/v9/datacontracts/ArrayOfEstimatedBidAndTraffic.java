/**
 * ArrayOfEstimatedBidAndTraffic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfEstimatedBidAndTraffic  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.EstimatedBidAndTraffic[] estimatedBidAndTraffic;

    public ArrayOfEstimatedBidAndTraffic() {
    }

    public ArrayOfEstimatedBidAndTraffic(
           com.microsoft.bingads.v9.datacontracts.EstimatedBidAndTraffic[] estimatedBidAndTraffic) {
           this.estimatedBidAndTraffic = estimatedBidAndTraffic;
    }


    /**
     * Gets the estimatedBidAndTraffic value for this ArrayOfEstimatedBidAndTraffic.
     * 
     * @return estimatedBidAndTraffic
     */
    public com.microsoft.bingads.v9.datacontracts.EstimatedBidAndTraffic[] getEstimatedBidAndTraffic() {
        return estimatedBidAndTraffic;
    }


    /**
     * Sets the estimatedBidAndTraffic value for this ArrayOfEstimatedBidAndTraffic.
     * 
     * @param estimatedBidAndTraffic
     */
    public void setEstimatedBidAndTraffic(com.microsoft.bingads.v9.datacontracts.EstimatedBidAndTraffic[] estimatedBidAndTraffic) {
        this.estimatedBidAndTraffic = estimatedBidAndTraffic;
    }

    public com.microsoft.bingads.v9.datacontracts.EstimatedBidAndTraffic getEstimatedBidAndTraffic(int i) {
        return this.estimatedBidAndTraffic[i];
    }

    public void setEstimatedBidAndTraffic(int i, com.microsoft.bingads.v9.datacontracts.EstimatedBidAndTraffic _value) {
        this.estimatedBidAndTraffic[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEstimatedBidAndTraffic)) return false;
        ArrayOfEstimatedBidAndTraffic other = (ArrayOfEstimatedBidAndTraffic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estimatedBidAndTraffic==null && other.getEstimatedBidAndTraffic()==null) || 
             (this.estimatedBidAndTraffic!=null &&
              java.util.Arrays.equals(this.estimatedBidAndTraffic, other.getEstimatedBidAndTraffic())));
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
        if (getEstimatedBidAndTraffic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedBidAndTraffic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedBidAndTraffic(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfEstimatedBidAndTraffic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfEstimatedBidAndTraffic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedBidAndTraffic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "EstimatedBidAndTraffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "EstimatedBidAndTraffic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
