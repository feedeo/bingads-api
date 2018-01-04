/**
 * GetBulkDownloadStatusResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class GetBulkDownloadStatusResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(GetBulkDownloadStatusResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">GetBulkDownloadStatusResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("errors");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "Errors"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "OperationError"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "OperationError"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("forwardCompatibilityMap");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ForwardCompatibilityMap"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("percentComplete");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "PercentComplete"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("requestStatus");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "RequestStatus"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("resultFileUrl");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ResultFileUrl"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.OperationError[] errors;
  private com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
  private java.lang.Integer percentComplete;
  private java.lang.String requestStatus;
  private java.lang.String resultFileUrl;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public GetBulkDownloadStatusResponse() {
  }

  public GetBulkDownloadStatusResponse(
          com.microsoft.bingads.v10.campaignmanagement.OperationError[] errors,
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
          java.lang.Integer percentComplete,
          java.lang.String requestStatus,
          java.lang.String resultFileUrl) {
    this.errors = errors;
    this.forwardCompatibilityMap = forwardCompatibilityMap;
    this.percentComplete = percentComplete;
    this.requestStatus = requestStatus;
    this.resultFileUrl = resultFileUrl;
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
   * Gets the errors value for this GetBulkDownloadStatusResponse.
   *
   * @return errors
   */
  public com.microsoft.bingads.v10.campaignmanagement.OperationError[] getErrors() {
    return errors;
  }

  /**
   * Sets the errors value for this GetBulkDownloadStatusResponse.
   *
   * @param errors
   */
  public void setErrors(com.microsoft.bingads.v10.campaignmanagement.OperationError[] errors) {
    this.errors = errors;
  }

  /**
   * Gets the forwardCompatibilityMap value for this GetBulkDownloadStatusResponse.
   *
   * @return forwardCompatibilityMap
   */
  public com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
    return forwardCompatibilityMap;
  }

  /**
   * Sets the forwardCompatibilityMap value for this GetBulkDownloadStatusResponse.
   *
   * @param forwardCompatibilityMap
   */
  public void setForwardCompatibilityMap(com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
    this.forwardCompatibilityMap = forwardCompatibilityMap;
  }

  /**
   * Gets the percentComplete value for this GetBulkDownloadStatusResponse.
   *
   * @return percentComplete
   */
  public java.lang.Integer getPercentComplete() {
    return percentComplete;
  }

  /**
   * Sets the percentComplete value for this GetBulkDownloadStatusResponse.
   *
   * @param percentComplete
   */
  public void setPercentComplete(java.lang.Integer percentComplete) {
    this.percentComplete = percentComplete;
  }

  /**
   * Gets the requestStatus value for this GetBulkDownloadStatusResponse.
   *
   * @return requestStatus
   */
  public java.lang.String getRequestStatus() {
    return requestStatus;
  }

  /**
   * Sets the requestStatus value for this GetBulkDownloadStatusResponse.
   *
   * @param requestStatus
   */
  public void setRequestStatus(java.lang.String requestStatus) {
    this.requestStatus = requestStatus;
  }

  /**
   * Gets the resultFileUrl value for this GetBulkDownloadStatusResponse.
   *
   * @return resultFileUrl
   */
  public java.lang.String getResultFileUrl() {
    return resultFileUrl;
  }

  /**
   * Sets the resultFileUrl value for this GetBulkDownloadStatusResponse.
   *
   * @param resultFileUrl
   */
  public void setResultFileUrl(java.lang.String resultFileUrl) {
    this.resultFileUrl = resultFileUrl;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GetBulkDownloadStatusResponse)) return false;
    GetBulkDownloadStatusResponse other = (GetBulkDownloadStatusResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.errors == null && other.getErrors() == null) ||
                    (this.errors != null &&
                            java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                    (this.forwardCompatibilityMap != null &&
                            java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.percentComplete == null && other.getPercentComplete() == null) ||
                    (this.percentComplete != null &&
                            this.percentComplete.equals(other.getPercentComplete()))) &&
            ((this.requestStatus == null && other.getRequestStatus() == null) ||
                    (this.requestStatus != null &&
                            this.requestStatus.equals(other.getRequestStatus()))) &&
            ((this.resultFileUrl == null && other.getResultFileUrl() == null) ||
                    (this.resultFileUrl != null &&
                            this.resultFileUrl.equals(other.getResultFileUrl())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getErrors() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getErrors());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getForwardCompatibilityMap() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getPercentComplete() != null) {
      _hashCode += getPercentComplete().hashCode();
    }
    if (getRequestStatus() != null) {
      _hashCode += getRequestStatus().hashCode();
    }
    if (getResultFileUrl() != null) {
      _hashCode += getResultFileUrl().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
