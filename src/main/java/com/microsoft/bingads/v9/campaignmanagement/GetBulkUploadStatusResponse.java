/**
 * GetBulkUploadStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class GetBulkUploadStatusResponse  implements java.io.Serializable {
    private java.lang.String requestStatus;

    private java.lang.String resultFileUrl;

    public GetBulkUploadStatusResponse() {
    }

    public GetBulkUploadStatusResponse(
           java.lang.String requestStatus,
           java.lang.String resultFileUrl) {
           this.requestStatus = requestStatus;
           this.resultFileUrl = resultFileUrl;
    }


    /**
     * Gets the requestStatus value for this GetBulkUploadStatusResponse.
     * 
     * @return requestStatus
     */
    public java.lang.String getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this GetBulkUploadStatusResponse.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(java.lang.String requestStatus) {
        this.requestStatus = requestStatus;
    }


    /**
     * Gets the resultFileUrl value for this GetBulkUploadStatusResponse.
     * 
     * @return resultFileUrl
     */
    public java.lang.String getResultFileUrl() {
        return resultFileUrl;
    }


    /**
     * Sets the resultFileUrl value for this GetBulkUploadStatusResponse.
     * 
     * @param resultFileUrl
     */
    public void setResultFileUrl(java.lang.String resultFileUrl) {
        this.resultFileUrl = resultFileUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBulkUploadStatusResponse)) return false;
        GetBulkUploadStatusResponse other = (GetBulkUploadStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestStatus==null && other.getRequestStatus()==null) || 
             (this.requestStatus!=null &&
              this.requestStatus.equals(other.getRequestStatus()))) &&
            ((this.resultFileUrl==null && other.getResultFileUrl()==null) || 
             (this.resultFileUrl!=null &&
              this.resultFileUrl.equals(other.getResultFileUrl())));
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
        if (getRequestStatus() != null) {
            _hashCode += getRequestStatus().hashCode();
        }
        if (getResultFileUrl() != null) {
            _hashCode += getResultFileUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBulkUploadStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", ">GetBulkUploadStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "RequestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultFileUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "ResultFileUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
