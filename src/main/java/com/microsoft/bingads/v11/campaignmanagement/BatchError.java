/**
 * BatchError.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public class BatchError implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BatchError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "BatchError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "FieldPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "ForwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v11", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Integer code;
    private java.lang.String details;
    private java.lang.String errorCode;
    private java.lang.String fieldPath;
    private com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
    private java.lang.Integer index;
    private java.lang.String message;
    private java.lang.String type;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public BatchError() {
    }


    public BatchError(
            java.lang.Integer code,
            java.lang.String details,
            java.lang.String errorCode,
            java.lang.String fieldPath,
            com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap,
            java.lang.Integer index,
            java.lang.String message,
            java.lang.String type) {
        this.code = code;
        this.details = details;
        this.errorCode = errorCode;
        this.fieldPath = fieldPath;
        this.forwardCompatibilityMap = forwardCompatibilityMap;
        this.index = index;
        this.message = message;
        this.type = type;
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
     * Gets the code value for this BatchError.
     *
     * @return code
     */
    public java.lang.Integer getCode() {
        return code;
    }

    /**
     * Sets the code value for this BatchError.
     *
     * @param code
     */
    public void setCode(java.lang.Integer code) {
        this.code = code;
    }

    /**
     * Gets the details value for this BatchError.
     *
     * @return details
     */
    public java.lang.String getDetails() {
        return details;
    }

    /**
     * Sets the details value for this BatchError.
     *
     * @param details
     */
    public void setDetails(java.lang.String details) {
        this.details = details;
    }

    /**
     * Gets the errorCode value for this BatchError.
     *
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the errorCode value for this BatchError.
     *
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets the fieldPath value for this BatchError.
     *
     * @return fieldPath
     */
    public java.lang.String getFieldPath() {
        return fieldPath;
    }

    /**
     * Sets the fieldPath value for this BatchError.
     *
     * @param fieldPath
     */
    public void setFieldPath(java.lang.String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * Gets the forwardCompatibilityMap value for this BatchError.
     *
     * @return forwardCompatibilityMap
     */
    public com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the forwardCompatibilityMap value for this BatchError.
     *
     * @param forwardCompatibilityMap
     */
    public void setForwardCompatibilityMap(com.microsoft.bingads.v11.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    /**
     * Gets the index value for this BatchError.
     *
     * @return index
     */
    public java.lang.Integer getIndex() {
        return index;
    }

    /**
     * Sets the index value for this BatchError.
     *
     * @param index
     */
    public void setIndex(java.lang.Integer index) {
        this.index = index;
    }

    /**
     * Gets the message value for this BatchError.
     *
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }

    /**
     * Sets the message value for this BatchError.
     *
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    /**
     * Gets the type value for this BatchError.
     *
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Sets the type value for this BatchError.
     *
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchError)) return false;
        BatchError other = (BatchError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.code == null && other.getCode() == null) ||
                        (this.code != null &&
                                this.code.equals(other.getCode()))) &&
                ((this.details == null && other.getDetails() == null) ||
                        (this.details != null &&
                                this.details.equals(other.getDetails()))) &&
                ((this.errorCode == null && other.getErrorCode() == null) ||
                        (this.errorCode != null &&
                                this.errorCode.equals(other.getErrorCode()))) &&
                ((this.fieldPath == null && other.getFieldPath() == null) ||
                        (this.fieldPath != null &&
                                this.fieldPath.equals(other.getFieldPath()))) &&
                ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                        (this.forwardCompatibilityMap != null &&
                                java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
                ((this.index == null && other.getIndex() == null) ||
                        (this.index != null &&
                                this.index.equals(other.getIndex()))) &&
                ((this.message == null && other.getMessage() == null) ||
                        (this.message != null &&
                                this.message.equals(other.getMessage()))) &&
                ((this.type == null && other.getType() == null) ||
                        (this.type != null &&
                                this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getFieldPath() != null) {
            _hashCode += getFieldPath().hashCode();
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
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
