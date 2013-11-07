/**
 * ArrayOfRadiusTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfRadiusTargetBid  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.RadiusTargetBid[] radiusTargetBid;

    public ArrayOfRadiusTargetBid() {
    }

    public ArrayOfRadiusTargetBid(
           com.microsoft.bingads.v9.campaignmanagement.RadiusTargetBid[] radiusTargetBid) {
           this.radiusTargetBid = radiusTargetBid;
    }


    /**
     * Gets the radiusTargetBid value for this ArrayOfRadiusTargetBid.
     * 
     * @return radiusTargetBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.RadiusTargetBid[] getRadiusTargetBid() {
        return radiusTargetBid;
    }


    /**
     * Sets the radiusTargetBid value for this ArrayOfRadiusTargetBid.
     * 
     * @param radiusTargetBid
     */
    public void setRadiusTargetBid(com.microsoft.bingads.v9.campaignmanagement.RadiusTargetBid[] radiusTargetBid) {
        this.radiusTargetBid = radiusTargetBid;
    }

    public com.microsoft.bingads.v9.campaignmanagement.RadiusTargetBid getRadiusTargetBid(int i) {
        return this.radiusTargetBid[i];
    }

    public void setRadiusTargetBid(int i, com.microsoft.bingads.v9.campaignmanagement.RadiusTargetBid _value) {
        this.radiusTargetBid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfRadiusTargetBid)) return false;
        ArrayOfRadiusTargetBid other = (ArrayOfRadiusTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.radiusTargetBid==null && other.getRadiusTargetBid()==null) || 
             (this.radiusTargetBid!=null &&
              java.util.Arrays.equals(this.radiusTargetBid, other.getRadiusTargetBid())));
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
        if (getRadiusTargetBid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusTargetBid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusTargetBid(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfRadiusTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfRadiusTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusTargetBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "RadiusTargetBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "RadiusTargetBid"));
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
