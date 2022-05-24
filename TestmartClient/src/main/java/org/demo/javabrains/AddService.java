/**
 * AddService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.demo.javabrains;

public interface AddService extends javax.xml.rpc.Service {
    public java.lang.String getaddAddress();

    public org.demo.javabrains.Add getadd() throws javax.xml.rpc.ServiceException;

    public org.demo.javabrains.Add getadd(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
