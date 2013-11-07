/**
 * ArrayOfKeywordCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.datacontracts;

public class ArrayOfKeywordCategory  implements java.io.Serializable {
    private com.microsoft.bingads.v9.datacontracts.KeywordCategory[] keywordCategory;

    public ArrayOfKeywordCategory() {
    }

    public ArrayOfKeywordCategory(
           com.microsoft.bingads.v9.datacontracts.KeywordCategory[] keywordCategory) {
           this.keywordCategory = keywordCategory;
    }


    /**
     * Gets the keywordCategory value for this ArrayOfKeywordCategory.
     * 
     * @return keywordCategory
     */
    public com.microsoft.bingads.v9.datacontracts.KeywordCategory[] getKeywordCategory() {
        return keywordCategory;
    }


    /**
     * Sets the keywordCategory value for this ArrayOfKeywordCategory.
     * 
     * @param keywordCategory
     */
    public void setKeywordCategory(com.microsoft.bingads.v9.datacontracts.KeywordCategory[] keywordCategory) {
        this.keywordCategory = keywordCategory;
    }

    public com.microsoft.bingads.v9.datacontracts.KeywordCategory getKeywordCategory(int i) {
        return this.keywordCategory[i];
    }

    public void setKeywordCategory(int i, com.microsoft.bingads.v9.datacontracts.KeywordCategory _value) {
        this.keywordCategory[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeywordCategory)) return false;
        ArrayOfKeywordCategory other = (ArrayOfKeywordCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keywordCategory==null && other.getKeywordCategory()==null) || 
             (this.keywordCategory!=null &&
              java.util.Arrays.equals(this.keywordCategory, other.getKeywordCategory())));
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
        if (getKeywordCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordCategory(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeywordCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "ArrayOfKeywordCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts", "KeywordCategory"));
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
