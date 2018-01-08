/**
 * GetListItemsBySharedListRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class GetListItemsBySharedListRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetListItemsBySharedListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", ">GetListItemsBySharedListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "SharedList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.campaignmanagement.SharedList sharedList;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public GetListItemsBySharedListRequest() {
    }

    public GetListItemsBySharedListRequest(
            com.microsoft.bingads.v11.campaignmanagement.SharedList sharedList) {
        this.sharedList = sharedList;
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
                new org.apache.axis.encoding.ser.BeanSerializer(
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
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the sharedList value for this GetListItemsBySharedListRequest.
     *
     * @return sharedList
     */
    public com.microsoft.bingads.v11.campaignmanagement.SharedList getSharedList() {
        return sharedList;
    }

    /**
     * Sets the sharedList value for this GetListItemsBySharedListRequest.
     *
     * @param sharedList
     */
    public void setSharedList(com.microsoft.bingads.v11.campaignmanagement.SharedList sharedList) {
        this.sharedList = sharedList;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetListItemsBySharedListRequest)) return false;
        GetListItemsBySharedListRequest other = (GetListItemsBySharedListRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.sharedList == null && other.getSharedList() == null) ||
                        (this.sharedList != null &&
                                this.sharedList.equals(other.getSharedList())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSharedList() != null) {
            _hashCode += getSharedList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
