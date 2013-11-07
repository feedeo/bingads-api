/**
 * SearchCustomersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class SearchCustomersRequest  implements java.io.Serializable {
    private com.microsoft.bingads.v9.customermanagement.entities.ApplicationType applicationScope;

    private com.microsoft.bingads.v9.customermanagement.entities.Predicate[] predicates;

    private com.microsoft.bingads.v9.customermanagement.entities.DateRange dateRange;

    private com.microsoft.bingads.v9.customermanagement.entities.OrderBy[] ordering;

    private com.microsoft.bingads.v9.customermanagement.entities.Paging pageInfo;

    public SearchCustomersRequest() {
    }

    public SearchCustomersRequest(
           com.microsoft.bingads.v9.customermanagement.entities.ApplicationType applicationScope,
           com.microsoft.bingads.v9.customermanagement.entities.Predicate[] predicates,
           com.microsoft.bingads.v9.customermanagement.entities.DateRange dateRange,
           com.microsoft.bingads.v9.customermanagement.entities.OrderBy[] ordering,
           com.microsoft.bingads.v9.customermanagement.entities.Paging pageInfo) {
           this.applicationScope = applicationScope;
           this.predicates = predicates;
           this.dateRange = dateRange;
           this.ordering = ordering;
           this.pageInfo = pageInfo;
    }


    /**
     * Gets the applicationScope value for this SearchCustomersRequest.
     * 
     * @return applicationScope
     */
    public com.microsoft.bingads.v9.customermanagement.entities.ApplicationType getApplicationScope() {
        return applicationScope;
    }


    /**
     * Sets the applicationScope value for this SearchCustomersRequest.
     * 
     * @param applicationScope
     */
    public void setApplicationScope(com.microsoft.bingads.v9.customermanagement.entities.ApplicationType applicationScope) {
        this.applicationScope = applicationScope;
    }


    /**
     * Gets the predicates value for this SearchCustomersRequest.
     * 
     * @return predicates
     */
    public com.microsoft.bingads.v9.customermanagement.entities.Predicate[] getPredicates() {
        return predicates;
    }


    /**
     * Sets the predicates value for this SearchCustomersRequest.
     * 
     * @param predicates
     */
    public void setPredicates(com.microsoft.bingads.v9.customermanagement.entities.Predicate[] predicates) {
        this.predicates = predicates;
    }


    /**
     * Gets the dateRange value for this SearchCustomersRequest.
     * 
     * @return dateRange
     */
    public com.microsoft.bingads.v9.customermanagement.entities.DateRange getDateRange() {
        return dateRange;
    }


    /**
     * Sets the dateRange value for this SearchCustomersRequest.
     * 
     * @param dateRange
     */
    public void setDateRange(com.microsoft.bingads.v9.customermanagement.entities.DateRange dateRange) {
        this.dateRange = dateRange;
    }


    /**
     * Gets the ordering value for this SearchCustomersRequest.
     * 
     * @return ordering
     */
    public com.microsoft.bingads.v9.customermanagement.entities.OrderBy[] getOrdering() {
        return ordering;
    }


    /**
     * Sets the ordering value for this SearchCustomersRequest.
     * 
     * @param ordering
     */
    public void setOrdering(com.microsoft.bingads.v9.customermanagement.entities.OrderBy[] ordering) {
        this.ordering = ordering;
    }


    /**
     * Gets the pageInfo value for this SearchCustomersRequest.
     * 
     * @return pageInfo
     */
    public com.microsoft.bingads.v9.customermanagement.entities.Paging getPageInfo() {
        return pageInfo;
    }


    /**
     * Sets the pageInfo value for this SearchCustomersRequest.
     * 
     * @param pageInfo
     */
    public void setPageInfo(com.microsoft.bingads.v9.customermanagement.entities.Paging pageInfo) {
        this.pageInfo = pageInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchCustomersRequest)) return false;
        SearchCustomersRequest other = (SearchCustomersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationScope==null && other.getApplicationScope()==null) || 
             (this.applicationScope!=null &&
              this.applicationScope.equals(other.getApplicationScope()))) &&
            ((this.predicates==null && other.getPredicates()==null) || 
             (this.predicates!=null &&
              java.util.Arrays.equals(this.predicates, other.getPredicates()))) &&
            ((this.dateRange==null && other.getDateRange()==null) || 
             (this.dateRange!=null &&
              this.dateRange.equals(other.getDateRange()))) &&
            ((this.ordering==null && other.getOrdering()==null) || 
             (this.ordering!=null &&
              java.util.Arrays.equals(this.ordering, other.getOrdering()))) &&
            ((this.pageInfo==null && other.getPageInfo()==null) || 
             (this.pageInfo!=null &&
              this.pageInfo.equals(other.getPageInfo())));
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
        if (getApplicationScope() != null) {
            _hashCode += getApplicationScope().hashCode();
        }
        if (getPredicates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredicates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredicates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateRange() != null) {
            _hashCode += getDateRange().hashCode();
        }
        if (getOrdering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrdering());
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

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchCustomersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", ">SearchCustomersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "ApplicationScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ApplicationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predicates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "Predicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Predicate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Predicate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "DateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordering");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "Ordering"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "OrderBy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "OrderBy"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "PageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Paging"));
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
