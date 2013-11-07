/**
 * GetTargetsInfoFromLibraryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class GetTargetsInfoFromLibraryResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.TargetInfo[] targetsInfo;

    public GetTargetsInfoFromLibraryResponse() {
    }

    public GetTargetsInfoFromLibraryResponse(
           com.microsoft.bingads.v9.campaignmanagement.TargetInfo[] targetsInfo) {
           this.targetsInfo = targetsInfo;
    }


    /**
     * Gets the targetsInfo value for this GetTargetsInfoFromLibraryResponse.
     * 
     * @return targetsInfo
     */
    public com.microsoft.bingads.v9.campaignmanagement.TargetInfo[] getTargetsInfo() {
        return targetsInfo;
    }


    /**
     * Sets the targetsInfo value for this GetTargetsInfoFromLibraryResponse.
     * 
     * @param targetsInfo
     */
    public void setTargetsInfo(com.microsoft.bingads.v9.campaignmanagement.TargetInfo[] targetsInfo) {
        this.targetsInfo = targetsInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTargetsInfoFromLibraryResponse)) return false;
        GetTargetsInfoFromLibraryResponse other = (GetTargetsInfoFromLibraryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetsInfo==null && other.getTargetsInfo()==null) || 
             (this.targetsInfo!=null &&
              java.util.Arrays.equals(this.targetsInfo, other.getTargetsInfo())));
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
        if (getTargetsInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetsInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetsInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetTargetsInfoFromLibraryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetTargetsInfoFromLibraryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "TargetsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "TargetInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "TargetInfo"));
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
