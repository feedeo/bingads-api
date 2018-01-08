/**
 * UserInvitation.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement.entities;

public class UserInvitation implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UserInvitation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserInvitation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Role"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "UserRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "AccountIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lcid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "Lcid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v11/Entities", "LCID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.Long id;
    private java.lang.String firstName;
    private java.lang.String lastName;
    private java.lang.String email;
    private java.lang.Long customerId;
    private com.microsoft.bingads.v11.customermanagement.entities.UserRole role;
    private long[] accountIds;
    private java.util.Calendar expirationDate;
    private com.microsoft.bingads.v11.customermanagement.entities.LCID lcid;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UserInvitation() {
    }


    public UserInvitation(
            java.lang.Long id,
            java.lang.String firstName,
            java.lang.String lastName,
            java.lang.String email,
            java.lang.Long customerId,
            com.microsoft.bingads.v11.customermanagement.entities.UserRole role,
            long[] accountIds,
            java.util.Calendar expirationDate,
            com.microsoft.bingads.v11.customermanagement.entities.LCID lcid) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.customerId = customerId;
        this.role = role;
        this.accountIds = accountIds;
        this.expirationDate = expirationDate;
        this.lcid = lcid;
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
     * Gets the id value for this UserInvitation.
     *
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the id value for this UserInvitation.
     *
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    /**
     * Gets the firstName value for this UserInvitation.
     *
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }

    /**
     * Sets the firstName value for this UserInvitation.
     *
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the lastName value for this UserInvitation.
     *
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }

    /**
     * Sets the lastName value for this UserInvitation.
     *
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the email value for this UserInvitation.
     *
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }

    /**
     * Sets the email value for this UserInvitation.
     *
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    /**
     * Gets the customerId value for this UserInvitation.
     *
     * @return customerId
     */
    public java.lang.Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the customerId value for this UserInvitation.
     *
     * @param customerId
     */
    public void setCustomerId(java.lang.Long customerId) {
        this.customerId = customerId;
    }

    /**
     * Gets the role value for this UserInvitation.
     *
     * @return role
     */
    public com.microsoft.bingads.v11.customermanagement.entities.UserRole getRole() {
        return role;
    }

    /**
     * Sets the role value for this UserInvitation.
     *
     * @param role
     */
    public void setRole(com.microsoft.bingads.v11.customermanagement.entities.UserRole role) {
        this.role = role;
    }

    /**
     * Gets the accountIds value for this UserInvitation.
     *
     * @return accountIds
     */
    public long[] getAccountIds() {
        return accountIds;
    }

    /**
     * Sets the accountIds value for this UserInvitation.
     *
     * @param accountIds
     */
    public void setAccountIds(long[] accountIds) {
        this.accountIds = accountIds;
    }

    /**
     * Gets the expirationDate value for this UserInvitation.
     *
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the expirationDate value for this UserInvitation.
     *
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Gets the lcid value for this UserInvitation.
     *
     * @return lcid
     */
    public com.microsoft.bingads.v11.customermanagement.entities.LCID getLcid() {
        return lcid;
    }

    /**
     * Sets the lcid value for this UserInvitation.
     *
     * @param lcid
     */
    public void setLcid(com.microsoft.bingads.v11.customermanagement.entities.LCID lcid) {
        this.lcid = lcid;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInvitation)) return false;
        UserInvitation other = (UserInvitation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.firstName == null && other.getFirstName() == null) ||
                        (this.firstName != null &&
                                this.firstName.equals(other.getFirstName()))) &&
                ((this.lastName == null && other.getLastName() == null) ||
                        (this.lastName != null &&
                                this.lastName.equals(other.getLastName()))) &&
                ((this.email == null && other.getEmail() == null) ||
                        (this.email != null &&
                                this.email.equals(other.getEmail()))) &&
                ((this.customerId == null && other.getCustomerId() == null) ||
                        (this.customerId != null &&
                                this.customerId.equals(other.getCustomerId()))) &&
                ((this.role == null && other.getRole() == null) ||
                        (this.role != null &&
                                this.role.equals(other.getRole()))) &&
                ((this.accountIds == null && other.getAccountIds() == null) ||
                        (this.accountIds != null &&
                                java.util.Arrays.equals(this.accountIds, other.getAccountIds()))) &&
                ((this.expirationDate == null && other.getExpirationDate() == null) ||
                        (this.expirationDate != null &&
                                this.expirationDate.equals(other.getExpirationDate()))) &&
                ((this.lcid == null && other.getLcid() == null) ||
                        (this.lcid != null &&
                                this.lcid.equals(other.getLcid())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getAccountIds() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAccountIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountIds(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getLcid() != null) {
            _hashCode += getLcid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
