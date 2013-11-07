/**
 * GetBroadMatchSearchQueriesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.optimizer;

public class GetBroadMatchSearchQueriesResponse  implements java.io.Serializable {
    private com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQuery[] searchQueries;

    public GetBroadMatchSearchQueriesResponse() {
    }

    public GetBroadMatchSearchQueriesResponse(
           com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQuery[] searchQueries) {
           this.searchQueries = searchQueries;
    }


    /**
     * Gets the searchQueries value for this GetBroadMatchSearchQueriesResponse.
     * 
     * @return searchQueries
     */
    public com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQuery[] getSearchQueries() {
        return searchQueries;
    }


    /**
     * Sets the searchQueries value for this GetBroadMatchSearchQueriesResponse.
     * 
     * @param searchQueries
     */
    public void setSearchQueries(com.microsoft.bingads.v9.optimizer.entities.BroadMatchSearchQuery[] searchQueries) {
        this.searchQueries = searchQueries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBroadMatchSearchQueriesResponse)) return false;
        GetBroadMatchSearchQueriesResponse other = (GetBroadMatchSearchQueriesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchQueries==null && other.getSearchQueries()==null) || 
             (this.searchQueries!=null &&
              java.util.Arrays.equals(this.searchQueries, other.getSearchQueries())));
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
        if (getSearchQueries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchQueries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchQueries(), i);
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
        new org.apache.axis.description.TypeDesc(GetBroadMatchSearchQueriesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", ">GetBroadMatchSearchQueriesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchQueries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Optimizer/v9", "SearchQueries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQuery"));
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
