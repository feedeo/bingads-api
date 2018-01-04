/**
 * SearchUserInvitationsResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public class SearchUserInvitationsResponse implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(SearchUserInvitationsResponse.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", ">SearchUserInvitationsResponse"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("userInvitations");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9", "UserInvitations"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "UserInvitation"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "UserInvitation"));
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v9.customermanagement.entities.UserInvitation[] userInvitations;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public SearchUserInvitationsResponse() {
  }

  public SearchUserInvitationsResponse(
          com.microsoft.bingads.v9.customermanagement.entities.UserInvitation[] userInvitations) {
    this.userInvitations = userInvitations;
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
   * Gets the userInvitations value for this SearchUserInvitationsResponse.
   *
   * @return userInvitations
   */
  public com.microsoft.bingads.v9.customermanagement.entities.UserInvitation[] getUserInvitations() {
    return userInvitations;
  }

  /**
   * Sets the userInvitations value for this SearchUserInvitationsResponse.
   *
   * @param userInvitations
   */
  public void setUserInvitations(com.microsoft.bingads.v9.customermanagement.entities.UserInvitation[] userInvitations) {
    this.userInvitations = userInvitations;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof SearchUserInvitationsResponse)) return false;
    SearchUserInvitationsResponse other = (SearchUserInvitationsResponse) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.userInvitations == null && other.getUserInvitations() == null) ||
                    (this.userInvitations != null &&
                            java.util.Arrays.equals(this.userInvitations, other.getUserInvitations())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getUserInvitations() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getUserInvitations());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getUserInvitations(), i);
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
