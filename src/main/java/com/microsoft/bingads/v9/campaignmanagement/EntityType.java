/**
 * EntityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public class EntityType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EntityType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Campaign = "Campaign";
    public static final java.lang.String _AdGroup = "AdGroup";
    public static final java.lang.String _Target = "Target";
    public static final java.lang.String _Ad = "Ad";
    public static final java.lang.String _Keyword = "Keyword";
    public static final java.lang.String _AdExtension = "AdExtension";
    public static final java.lang.String _AdGroupCriterion = "AdGroupCriterion";
    public static final EntityType Campaign = new EntityType(_Campaign);
    public static final EntityType AdGroup = new EntityType(_AdGroup);
    public static final EntityType Target = new EntityType(_Target);
    public static final EntityType Ad = new EntityType(_Ad);
    public static final EntityType Keyword = new EntityType(_Keyword);
    public static final EntityType AdExtension = new EntityType(_AdExtension);
    public static final EntityType AdGroupCriterion = new EntityType(_AdGroupCriterion);
    public java.lang.String getValue() { return _value_;}
    public static EntityType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EntityType enumeration = (EntityType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EntityType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bingads.microsoft.com/CampaignManagement/v9", "EntityType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
