/**
 * SearchUserInvitationsRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public class SearchUserInvitationsRequest implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SearchUserInvitationsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", ">SearchUserInvitationsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predicates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11", "Predicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Predicate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Predicate"));
        typeDesc.addFieldDesc(elemField);
    }

    private com.microsoft.bingads.v11.customermanagement.entities.Predicate[] predicates;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public SearchUserInvitationsRequest() {
    }

    public SearchUserInvitationsRequest(
            com.microsoft.bingads.v11.customermanagement.entities.Predicate[] predicates) {
        this.predicates = predicates;
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
     * Gets the predicates value for this SearchUserInvitationsRequest.
     *
     * @return predicates
     */
    public com.microsoft.bingads.v11.customermanagement.entities.Predicate[] getPredicates() {
        return predicates;
    }

    /**
     * Sets the predicates value for this SearchUserInvitationsRequest.
     *
     * @param predicates
     */
    public void setPredicates(com.microsoft.bingads.v11.customermanagement.entities.Predicate[] predicates) {
        this.predicates = predicates;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchUserInvitationsRequest)) return false;
        SearchUserInvitationsRequest other = (SearchUserInvitationsRequest) obj;
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
                                java.util.Arrays.equals(this.predicates, other.getPredicates())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
