/**
 * ArrayOfEstimatedPositionAndTraffic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfEstimatedPositionAndTraffic  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.EstimatedPositionAndTraffic[] estimatedPositionAndTraffic;

    public ArrayOfEstimatedPositionAndTraffic() {
    }

    public ArrayOfEstimatedPositionAndTraffic(
           com.microsoft.bingads.v9.datacontracts.EstimatedPositionAndTraffic[] estimatedPositionAndTraffic) {
           this.estimatedPositionAndTraffic = estimatedPositionAndTraffic;
    }


    /**
     * Gets the estimatedPositionAndTraffic value for this ArrayOfEstimatedPositionAndTraffic.
     * 
     * @return estimatedPositionAndTraffic
     */
    public com.microsoft.bingads.v9.datacontracts.EstimatedPositionAndTraffic[] getEstimatedPositionAndTraffic() {
        return estimatedPositionAndTraffic;
    }


    /**
     * Sets the estimatedPositionAndTraffic value for this ArrayOfEstimatedPositionAndTraffic.
     * 
     * @param estimatedPositionAndTraffic
     */
    public void setEstimatedPositionAndTraffic(com.microsoft.bingads.v9.datacontracts.EstimatedPositionAndTraffic[] estimatedPositionAndTraffic) {
        this.estimatedPositionAndTraffic = estimatedPositionAndTraffic;
    }

    public com.microsoft.bingads.v9.datacontracts.EstimatedPositionAndTraffic getEstimatedPositionAndTraffic(int i) {
        return this.estimatedPositionAndTraffic[i];
    }

    public void setEstimatedPositionAndTraffic(int i, com.microsoft.bingads.v9.datacontracts.EstimatedPositionAndTraffic _value) {
        this.estimatedPositionAndTraffic[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEstimatedPositionAndTraffic)) return false;
        ArrayOfEstimatedPositionAndTraffic other = (ArrayOfEstimatedPositionAndTraffic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estimatedPositionAndTraffic==null && other.getEstimatedPositionAndTraffic()==null) || 
             (this.estimatedPositionAndTraffic!=null &&
              java.util.Arrays.equals(this.estimatedPositionAndTraffic, other.getEstimatedPositionAndTraffic())));
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
        if (getEstimatedPositionAndTraffic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedPositionAndTraffic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedPositionAndTraffic(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfEstimatedPositionAndTraffic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfEstimatedPositionAndTraffic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedPositionAndTraffic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "EstimatedPositionAndTraffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "EstimatedPositionAndTraffic"));
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
