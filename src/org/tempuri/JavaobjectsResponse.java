/**
 * JavaobjectsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class JavaobjectsResponse  implements java.io.Serializable {
    private java.lang.String[][] javaobjectsResult;

    public JavaobjectsResponse() {
    }

    public JavaobjectsResponse(
           java.lang.String[][] javaobjectsResult) {
           this.javaobjectsResult = javaobjectsResult;
    }


    /**
     * Gets the javaobjectsResult value for this JavaobjectsResponse.
     * 
     * @return javaobjectsResult
     */
    public java.lang.String[][] getJavaobjectsResult() {
        return javaobjectsResult;
    }


    /**
     * Sets the javaobjectsResult value for this JavaobjectsResponse.
     * 
     * @param javaobjectsResult
     */
    public void setJavaobjectsResult(java.lang.String[][] javaobjectsResult) {
        this.javaobjectsResult = javaobjectsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JavaobjectsResponse)) return false;
        JavaobjectsResponse other = (JavaobjectsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.javaobjectsResult==null && other.getJavaobjectsResult()==null) || 
             (this.javaobjectsResult!=null &&
              java.util.Arrays.equals(this.javaobjectsResult, other.getJavaobjectsResult())));
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
        if (getJavaobjectsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJavaobjectsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJavaobjectsResult(), i);
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
        new org.apache.axis.description.TypeDesc(JavaobjectsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">javaobjectsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("javaobjectsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "javaobjectsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
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
