/**
 * AddListItemsToSharedListRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public class AddListItemsToSharedListRequest implements java.io.Serializable {
  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
          new org.apache.axis.description.TypeDesc(AddListItemsToSharedListRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", ">AddListItemsToSharedListRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("listItems");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "ListItems"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedListItem"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    elemField.setItemQName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedListItem"));
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("sharedList");
    elemField.setXmlName(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedList"));
    elemField.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedList"));
    elemField.setMinOccurs(0);
    elemField.setNillable(true);
    typeDesc.addFieldDesc(elemField);
  }

  private com.microsoft.bingads.v10.campaignmanagement.SharedListItem[] listItems;
  private com.microsoft.bingads.v10.campaignmanagement.SharedList sharedList;
  private java.lang.Object __equalsCalc = null;
  private boolean __hashCodeCalc = false;

  public AddListItemsToSharedListRequest() {
  }

  public AddListItemsToSharedListRequest(
          com.microsoft.bingads.v10.campaignmanagement.SharedListItem[] listItems,
          com.microsoft.bingads.v10.campaignmanagement.SharedList sharedList) {
    this.listItems = listItems;
    this.sharedList = sharedList;
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
   * Gets the listItems value for this AddListItemsToSharedListRequest.
   *
   * @return listItems
   */
  public com.microsoft.bingads.v10.campaignmanagement.SharedListItem[] getListItems() {
    return listItems;
  }

  /**
   * Sets the listItems value for this AddListItemsToSharedListRequest.
   *
   * @param listItems
   */
  public void setListItems(com.microsoft.bingads.v10.campaignmanagement.SharedListItem[] listItems) {
    this.listItems = listItems;
  }

  /**
   * Gets the sharedList value for this AddListItemsToSharedListRequest.
   *
   * @return sharedList
   */
  public com.microsoft.bingads.v10.campaignmanagement.SharedList getSharedList() {
    return sharedList;
  }

  /**
   * Sets the sharedList value for this AddListItemsToSharedListRequest.
   *
   * @param sharedList
   */
  public void setSharedList(com.microsoft.bingads.v10.campaignmanagement.SharedList sharedList) {
    this.sharedList = sharedList;
  }

  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof AddListItemsToSharedListRequest)) return false;
    AddListItemsToSharedListRequest other = (AddListItemsToSharedListRequest) obj;
    if (obj == null) return false;
    if (this == obj) return true;
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
            ((this.listItems == null && other.getListItems() == null) ||
                    (this.listItems != null &&
                            java.util.Arrays.equals(this.listItems, other.getListItems()))) &&
            ((this.sharedList == null && other.getSharedList() == null) ||
                    (this.sharedList != null &&
                            this.sharedList.equals(other.getSharedList())));
    __equalsCalc = null;
    return _equals;
  }

  public synchronized int hashCode() {
    if (__hashCodeCalc) {
      return 0;
    }
    __hashCodeCalc = true;
    int _hashCode = 1;
    if (getListItems() != null) {
      for (int i = 0;
           i < java.lang.reflect.Array.getLength(getListItems());
           i++) {
        java.lang.Object obj = java.lang.reflect.Array.get(getListItems(), i);
        if (obj != null &&
                !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      }
    }
    if (getSharedList() != null) {
      _hashCode += getSharedList().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

}
