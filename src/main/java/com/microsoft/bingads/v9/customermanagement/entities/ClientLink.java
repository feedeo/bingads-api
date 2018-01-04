/**
 * ClientLink.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement.entities;

public class ClientLink implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(ClientLink.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ClientLink"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("clientAccountId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ClientAccountId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("clientAccountNumber");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ClientAccountNumber"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("managingCustomerId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ManagingCustomerId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("managingCustomerNumber");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ManagingCustomerNumber"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("note");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Note"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("name");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Name"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("inviterEmail");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "InviterEmail"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("inviterName");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "InviterName"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("inviterPhone");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "InviterPhone"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("isBillToClient");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "IsBillToClient"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("startDate");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "StartDate"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("status");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Status"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ClientLinkStatus"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("suppressNotification");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "SuppressNotification"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("lastModifiedDateTime");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "LastModifiedDateTime"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("lastModifiedByUserId");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "LastModifiedByUserId"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("timestamp");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "Timestamp"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("forwardCompatibilityMap");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/Customer/v9/Entities", "ForwardCompatibilityMap"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring"));
    typeDesc.addFieldDesc(elemField);
  }

  private java.lang.Long clientAccountId;
  private java.lang.String clientAccountNumber;
  private java.lang.Long managingCustomerId;
  private java.lang.String managingCustomerNumber;
  private java.lang.String note;
  private java.lang.String name;
  private java.lang.String inviterEmail;
  private java.lang.String inviterName;
  private java.lang.String inviterPhone;
  private java.lang.Boolean isBillToClient;
  private java.util.Calendar startDate;
  private com.microsoft.bingads.v9.customermanagement.entities.ClientLinkStatus status;
  private java.lang.Boolean suppressNotification;
  private java.util.Calendar lastModifiedDateTime;
  private java.lang.Long lastModifiedByUserId;
  private byte[] timestamp;
  private com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public ClientLink() {
  }

  public ClientLink(
          java.lang.Long clientAccountId,
          java.lang.String clientAccountNumber,
          java.lang.Long managingCustomerId,
          java.lang.String managingCustomerNumber,
          java.lang.String note,
          java.lang.String name,
          java.lang.String inviterEmail,
          java.lang.String inviterName,
          java.lang.String inviterPhone,
          java.lang.Boolean isBillToClient,
          java.util.Calendar startDate,
          com.microsoft.bingads.v9.customermanagement.entities.ClientLinkStatus status,
          java.lang.Boolean suppressNotification,
          java.util.Calendar lastModifiedDateTime,
          java.lang.Long lastModifiedByUserId,
          byte[] timestamp,
          com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
    this.clientAccountId = clientAccountId;
    this.clientAccountNumber = clientAccountNumber;
    this.managingCustomerId = managingCustomerId;
    this.managingCustomerNumber = managingCustomerNumber;
    this.note = note;
    this.name = name;
    this.inviterEmail = inviterEmail;
    this.inviterName = inviterName;
    this.inviterPhone = inviterPhone;
    this.isBillToClient = isBillToClient;
    this.startDate = startDate;
    this.status = status;
    this.suppressNotification = suppressNotification;
    this.lastModifiedDateTime = lastModifiedDateTime;
    this.lastModifiedByUserId = lastModifiedByUserId;
    this.timestamp = timestamp;
    this.forwardCompatibilityMap = forwardCompatibilityMap;
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
   * Gets the clientAccountId value for this ClientLink.
   *
   * @return clientAccountId
   */
  public java.lang.Long getClientAccountId() {
    return clientAccountId;
  }

  /**
   * Sets the clientAccountId value for this ClientLink.
   *
   * @param clientAccountId
   */
  public void setClientAccountId(java.lang.Long clientAccountId) {
    this.clientAccountId = clientAccountId;
  }

  /**
   * Gets the clientAccountNumber value for this ClientLink.
   *
   * @return clientAccountNumber
   */
  public java.lang.String getClientAccountNumber() {
    return clientAccountNumber;
  }

  /**
   * Sets the clientAccountNumber value for this ClientLink.
   *
   * @param clientAccountNumber
   */
  public void setClientAccountNumber(java.lang.String clientAccountNumber) {
    this.clientAccountNumber = clientAccountNumber;
  }

  /**
   * Gets the managingCustomerId value for this ClientLink.
   *
   * @return managingCustomerId
   */
  public java.lang.Long getManagingCustomerId() {
    return managingCustomerId;
  }

  /**
   * Sets the managingCustomerId value for this ClientLink.
   *
   * @param managingCustomerId
   */
  public void setManagingCustomerId(java.lang.Long managingCustomerId) {
    this.managingCustomerId = managingCustomerId;
  }

  /**
   * Gets the managingCustomerNumber value for this ClientLink.
   *
   * @return managingCustomerNumber
   */
  public java.lang.String getManagingCustomerNumber() {
    return managingCustomerNumber;
  }

  /**
   * Sets the managingCustomerNumber value for this ClientLink.
   *
   * @param managingCustomerNumber
   */
  public void setManagingCustomerNumber(java.lang.String managingCustomerNumber) {
    this.managingCustomerNumber = managingCustomerNumber;
  }

  /**
   * Gets the note value for this ClientLink.
   *
   * @return note
   */
  public java.lang.String getNote() {
    return note;
  }

  /**
   * Sets the note value for this ClientLink.
   *
   * @param note
   */
  public void setNote(java.lang.String note) {
    this.note = note;
  }

  /**
   * Gets the name value for this ClientLink.
   *
   * @return name
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the name value for this ClientLink.
   *
   * @param name
   */
  public void setName(java.lang.String name) {
    this.name = name;
  }

  /**
   * Gets the inviterEmail value for this ClientLink.
   *
   * @return inviterEmail
   */
  public java.lang.String getInviterEmail() {
    return inviterEmail;
  }

  /**
   * Sets the inviterEmail value for this ClientLink.
   *
   * @param inviterEmail
   */
  public void setInviterEmail(java.lang.String inviterEmail) {
    this.inviterEmail = inviterEmail;
  }

  /**
   * Gets the inviterName value for this ClientLink.
   *
   * @return inviterName
   */
  public java.lang.String getInviterName() {
    return inviterName;
  }

  /**
   * Sets the inviterName value for this ClientLink.
   *
   * @param inviterName
   */
  public void setInviterName(java.lang.String inviterName) {
    this.inviterName = inviterName;
  }

  /**
   * Gets the inviterPhone value for this ClientLink.
   *
   * @return inviterPhone
   */
  public java.lang.String getInviterPhone() {
    return inviterPhone;
  }

  /**
   * Sets the inviterPhone value for this ClientLink.
   *
   * @param inviterPhone
   */
  public void setInviterPhone(java.lang.String inviterPhone) {
    this.inviterPhone = inviterPhone;
  }

  /**
   * Gets the isBillToClient value for this ClientLink.
   *
   * @return isBillToClient
   */
  public java.lang.Boolean getIsBillToClient() {
    return isBillToClient;
  }

  /**
   * Sets the isBillToClient value for this ClientLink.
   *
   * @param isBillToClient
   */
  public void setIsBillToClient(java.lang.Boolean isBillToClient) {
    this.isBillToClient = isBillToClient;
  }

  /**
   * Gets the startDate value for this ClientLink.
   *
   * @return startDate
   */
  public java.util.Calendar getStartDate() {
    return startDate;
  }

  /**
   * Sets the startDate value for this ClientLink.
   *
   * @param startDate
   */
  public void setStartDate(java.util.Calendar startDate) {
    this.startDate = startDate;
  }

  /**
   * Gets the status value for this ClientLink.
   *
   * @return status
   */
  public com.microsoft.bingads.v9.customermanagement.entities.ClientLinkStatus getStatus() {
    return status;
  }

  /**
   * Sets the status value for this ClientLink.
   *
   * @param status
   */
  public void setStatus(com.microsoft.bingads.v9.customermanagement.entities.ClientLinkStatus status) {
    this.status = status;
  }

  /**
   * Gets the suppressNotification value for this ClientLink.
   *
   * @return suppressNotification
   */
  public java.lang.Boolean getSuppressNotification() {
    return suppressNotification;
  }

  /**
   * Sets the suppressNotification value for this ClientLink.
   *
   * @param suppressNotification
   */
  public void setSuppressNotification(java.lang.Boolean suppressNotification) {
    this.suppressNotification = suppressNotification;
  }

  /**
   * Gets the lastModifiedDateTime value for this ClientLink.
   *
   * @return lastModifiedDateTime
   */
  public java.util.Calendar getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  /**
   * Sets the lastModifiedDateTime value for this ClientLink.
   *
   * @param lastModifiedDateTime
   */
  public void setLastModifiedDateTime(java.util.Calendar lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  /**
   * Gets the lastModifiedByUserId value for this ClientLink.
   *
   * @return lastModifiedByUserId
   */
  public java.lang.Long getLastModifiedByUserId() {
    return lastModifiedByUserId;
  }

  /**
   * Sets the lastModifiedByUserId value for this ClientLink.
   *
   * @param lastModifiedByUserId
   */
  public void setLastModifiedByUserId(java.lang.Long lastModifiedByUserId) {
    this.lastModifiedByUserId = lastModifiedByUserId;
  }

  /**
   * Gets the timestamp value for this ClientLink.
   *
   * @return timestamp
   */
  public byte[] getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the timestamp value for this ClientLink.
   *
   * @param timestamp
   */
  public void setTimestamp(byte[] timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Gets the forwardCompatibilityMap value for this ClientLink.
   *
   * @return forwardCompatibilityMap
   */
  public com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] getForwardCompatibilityMap() {
    return forwardCompatibilityMap;
  }

  /**
   * Sets the forwardCompatibilityMap value for this ClientLink.
   *
   * @param forwardCompatibilityMap
   */
  public void setForwardCompatibilityMap(com.microsoft.bingads.v10.schemas.generic.KeyValuePairOfstringstring[] forwardCompatibilityMap) {
    this.forwardCompatibilityMap = forwardCompatibilityMap;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof ClientLink)) return false;
    ClientLink other = (ClientLink) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.clientAccountId == null && other.getClientAccountId() == null) ||
                    (this.clientAccountId != null &&
                            this.clientAccountId.equals(other.getClientAccountId()))) &&
            ((this.clientAccountNumber == null && other.getClientAccountNumber() == null) ||
                    (this.clientAccountNumber != null &&
                            this.clientAccountNumber.equals(other.getClientAccountNumber()))) &&
            ((this.managingCustomerId == null && other.getManagingCustomerId() == null) ||
                    (this.managingCustomerId != null &&
                            this.managingCustomerId.equals(other.getManagingCustomerId()))) &&
            ((this.managingCustomerNumber == null && other.getManagingCustomerNumber() == null) ||
                    (this.managingCustomerNumber != null &&
                            this.managingCustomerNumber.equals(other.getManagingCustomerNumber()))) &&
            ((this.note == null && other.getNote() == null) ||
                    (this.note != null &&
                            this.note.equals(other.getNote()))) &&
            ((this.name == null && other.getName() == null) ||
                    (this.name != null &&
                            this.name.equals(other.getName()))) &&
            ((this.inviterEmail == null && other.getInviterEmail() == null) ||
                    (this.inviterEmail != null &&
                            this.inviterEmail.equals(other.getInviterEmail()))) &&
            ((this.inviterName == null && other.getInviterName() == null) ||
                    (this.inviterName != null &&
                            this.inviterName.equals(other.getInviterName()))) &&
            ((this.inviterPhone == null && other.getInviterPhone() == null) ||
                    (this.inviterPhone != null &&
                            this.inviterPhone.equals(other.getInviterPhone()))) &&
            ((this.isBillToClient == null && other.getIsBillToClient() == null) ||
                    (this.isBillToClient != null &&
                            this.isBillToClient.equals(other.getIsBillToClient()))) &&
            ((this.startDate == null && other.getStartDate() == null) ||
                    (this.startDate != null &&
                            this.startDate.equals(other.getStartDate()))) &&
            ((this.status == null && other.getStatus() == null) ||
                    (this.status != null &&
                            this.status.equals(other.getStatus()))) &&
            ((this.suppressNotification == null && other.getSuppressNotification() == null) ||
                    (this.suppressNotification != null &&
                            this.suppressNotification.equals(other.getSuppressNotification()))) &&
            ((this.lastModifiedDateTime == null && other.getLastModifiedDateTime() == null) ||
                    (this.lastModifiedDateTime != null &&
                            this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.lastModifiedByUserId == null && other.getLastModifiedByUserId() == null) ||
                    (this.lastModifiedByUserId != null &&
                            this.lastModifiedByUserId.equals(other.getLastModifiedByUserId()))) &&
            ((this.timestamp == null && other.getTimestamp() == null) ||
                    (this.timestamp != null &&
                            java.util.Arrays.equals(this.timestamp, other.getTimestamp()))) &&
            ((this.forwardCompatibilityMap == null && other.getForwardCompatibilityMap() == null) ||
                    (this.forwardCompatibilityMap != null &&
                            java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getClientAccountId() != null) {
      _hashCode += getClientAccountId().hashCode();
    }
    if (getClientAccountNumber() != null) {
      _hashCode += getClientAccountNumber().hashCode();
    }
    if (getManagingCustomerId() != null) {
      _hashCode += getManagingCustomerId().hashCode();
    }
    if (getManagingCustomerNumber() != null) {
      _hashCode += getManagingCustomerNumber().hashCode();
    }
    if (getNote() != null) {
      _hashCode += getNote().hashCode();
    }
    if (getName() != null) {
      _hashCode += getName().hashCode();
    }
    if (getInviterEmail() != null) {
      _hashCode += getInviterEmail().hashCode();
    }
    if (getInviterName() != null) {
      _hashCode += getInviterName().hashCode();
    }
    if (getInviterPhone() != null) {
      _hashCode += getInviterPhone().hashCode();
    }
    if (getIsBillToClient() != null) {
      _hashCode += getIsBillToClient().hashCode();
    }
    if (getStartDate() != null) {
      _hashCode += getStartDate().hashCode();
    }
    if (getStatus() != null) {
      _hashCode += getStatus().hashCode();
    }
    if (getSuppressNotification() != null) {
      _hashCode += getSuppressNotification().hashCode();
    }
    if (getLastModifiedDateTime() != null) {
      _hashCode += getLastModifiedDateTime().hashCode();
    }
    if (getLastModifiedByUserId() != null) {
      _hashCode += getLastModifiedByUserId().hashCode();
    }
    if (getTimestamp() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getTimestamp());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getTimestamp(), i);
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
    __hashCodeCalc = false;
    return _hashCode;
  }

}
