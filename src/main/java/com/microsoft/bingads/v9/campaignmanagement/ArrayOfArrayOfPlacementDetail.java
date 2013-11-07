/**
 * ArrayOfArrayOfPlacementDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class ArrayOfArrayOfPlacementDetail  implements java.io.Serializable {
    private com.microsoft.bingads.v9.campaignmanagement.ArrayOfPlacementDetail[] arrayOfPlacementDetail;

    public ArrayOfArrayOfPlacementDetail() {
    }

    public ArrayOfArrayOfPlacementDetail(
           com.microsoft.bingads.v9.campaignmanagement.ArrayOfPlacementDetail[] arrayOfPlacementDetail) {
           this.arrayOfPlacementDetail = arrayOfPlacementDetail;
    }


    /**
     * Gets the arrayOfPlacementDetail value for this ArrayOfArrayOfPlacementDetail.
     * 
     * @return arrayOfPlacementDetail
     */
    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfPlacementDetail[] getArrayOfPlacementDetail() {
        return arrayOfPlacementDetail;
    }


    /**
     * Sets the arrayOfPlacementDetail value for this ArrayOfArrayOfPlacementDetail.
     * 
     * @param arrayOfPlacementDetail
     */
    public void setArrayOfPlacementDetail(com.microsoft.bingads.v9.campaignmanagement.ArrayOfPlacementDetail[] arrayOfPlacementDetail) {
        this.arrayOfPlacementDetail = arrayOfPlacementDetail;
    }

    public com.microsoft.bingads.v9.campaignmanagement.ArrayOfPlacementDetail getArrayOfPlacementDetail(int i) {
        return this.arrayOfPlacementDetail[i];
    }

    public void setArrayOfPlacementDetail(int i, com.microsoft.bingads.v9.campaignmanagement.ArrayOfPlacementDetail _value) {
        this.arrayOfPlacementDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfArrayOfPlacementDetail)) return false;
        ArrayOfArrayOfPlacementDetail other = (ArrayOfArrayOfPlacementDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrayOfPlacementDetail==null && other.getArrayOfPlacementDetail()==null) || 
             (this.arrayOfPlacementDetail!=null &&
              java.util.Arrays.equals(this.arrayOfPlacementDetail, other.getArrayOfPlacementDetail())));
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
        if (getArrayOfPlacementDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayOfPlacementDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayOfPlacementDetail(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfArrayOfPlacementDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfArrayOfPlacementDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayOfPlacementDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfPlacementDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ArrayOfPlacementDetail"));
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
