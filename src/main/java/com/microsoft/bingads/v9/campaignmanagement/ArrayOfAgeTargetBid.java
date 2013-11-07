/**
 * ArrayOfAgeTargetBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfAgeTargetBid  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.AgeTargetBid[] ageTargetBid;

    public ArrayOfAgeTargetBid() {
    }

    public ArrayOfAgeTargetBid(
           com.microsoft.bingads.v9.campaignmanagement.AgeTargetBid[] ageTargetBid) {
           this.ageTargetBid = ageTargetBid;
    }


    /**
     * Gets the ageTargetBid value for this ArrayOfAgeTargetBid.
     * 
     * @return ageTargetBid
     */
    public com.microsoft.bingads.v9.campaignmanagement.AgeTargetBid[] getAgeTargetBid() {
        return ageTargetBid;
    }


    /**
     * Sets the ageTargetBid value for this ArrayOfAgeTargetBid.
     * 
     * @param ageTargetBid
     */
    public void setAgeTargetBid(com.microsoft.bingads.v9.campaignmanagement.AgeTargetBid[] ageTargetBid) {
        this.ageTargetBid = ageTargetBid;
    }

    public com.microsoft.bingads.v9.campaignmanagement.AgeTargetBid getAgeTargetBid(int i) {
        return this.ageTargetBid[i];
    }

    public void setAgeTargetBid(int i, com.microsoft.bingads.v9.campaignmanagement.AgeTargetBid _value) {
        this.ageTargetBid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAgeTargetBid)) return false;
        ArrayOfAgeTargetBid other = (ArrayOfAgeTargetBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ageTargetBid==null && other.getAgeTargetBid()==null) || 
             (this.ageTargetBid!=null &&
              java.util.Arrays.equals(this.ageTargetBid, other.getAgeTargetBid())));
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
        if (getAgeTargetBid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgeTargetBid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgeTargetBid(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAgeTargetBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfAgeTargetBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageTargetBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AgeTargetBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "AgeTargetBid"));
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
