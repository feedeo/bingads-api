/**
 * SearchClientLinksRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class SearchClientLinksRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SearchClientLinksRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchClientLinksRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predicates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "Predicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Predicate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Predicate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordering");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "Ordering"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "OrderBy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "OrderBy"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "PageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Paging"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.Predicate[] predicates;
    private com.microsoft.bingads.v11.customermanagement.entities.OrderBy[] ordering;
    private com.microsoft.bingads.v11.customermanagement.entities.Paging pageInfo;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public SearchClientLinksRequest() {
    }


    public SearchClientLinksRequest(
            com.microsoft.bingads.v11.customermanagement.entities.Predicate[] predicates,
            com.microsoft.bingads.v11.customermanagement.entities.OrderBy[] ordering,
            com.microsoft.bingads.v11.customermanagement.entities.Paging pageInfo) {
        this.predicates = predicates;
        this.ordering = ordering;
        this.pageInfo = pageInfo;
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
     * Gets the predicates value for this SearchClientLinksRequest.
     *
     * @return predicates
     */
    public com.microsoft.bingads.v11.customermanagement.entities.Predicate[] getPredicates() {
        return predicates;
    }

    /**
     * Sets the predicates value for this SearchClientLinksRequest.
     *
     * @param predicates
     */
    public void setPredicates(com.microsoft.bingads.v11.customermanagement.entities.Predicate[] predicates) {
        this.predicates = predicates;
    }

    /**
     * Gets the ordering value for this SearchClientLinksRequest.
     *
     * @return ordering
     */
    public com.microsoft.bingads.v11.customermanagement.entities.OrderBy[] getOrdering() {
        return ordering;
    }

    /**
     * Sets the ordering value for this SearchClientLinksRequest.
     *
     * @param ordering
     */
    public void setOrdering(com.microsoft.bingads.v11.customermanagement.entities.OrderBy[] ordering) {
        this.ordering = ordering;
    }

    /**
     * Gets the pageInfo value for this SearchClientLinksRequest.
     *
     * @return pageInfo
     */
    public com.microsoft.bingads.v11.customermanagement.entities.Paging getPageInfo() {
        return pageInfo;
    }

    /**
     * Sets the pageInfo value for this SearchClientLinksRequest.
     *
     * @param pageInfo
     */
    public void setPageInfo(com.microsoft.bingads.v11.customermanagement.entities.Paging pageInfo) {
        this.pageInfo = pageInfo;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchClientLinksRequest)) return false;
        SearchClientLinksRequest other = (SearchClientLinksRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.predicates == null && other.getPredicates() == null) ||
                        (this.predicates != null &&
                                java.util.Arrays.equals(this.predicates, other.getPredicates()))) &&
                ((this.ordering == null && other.getOrdering() == null) ||
                        (this.ordering != null &&
                                java.util.Arrays.equals(this.ordering, other.getOrdering()))) &&
                ((this.pageInfo == null && other.getPageInfo() == null) ||
                        (this.pageInfo != null &&
                                this.pageInfo.equals(other.getPageInfo())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPredicates() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPredicates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredicates(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrdering() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getOrdering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrdering(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageInfo() != null) {
            _hashCode += getPageInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
