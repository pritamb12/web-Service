/**
 * AddServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.demo.javabrains;

public class AddServiceLocator extends org.apache.axis.client.Service implements org.demo.javabrains.AddService {

    public AddServiceLocator() {
    }


    public AddServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for add
    private java.lang.String add_address = "http://localhost:8080/Testmart/services/add";

    public java.lang.String getaddAddress() {
        return add_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String addWSDDServiceName = "add";

    public java.lang.String getaddWSDDServiceName() {
        return addWSDDServiceName;
    }

    public void setaddWSDDServiceName(java.lang.String name) {
        addWSDDServiceName = name;
    }

    public org.demo.javabrains.Add getadd() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(add_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getadd(endpoint);
    }

    public org.demo.javabrains.Add getadd(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.demo.javabrains.AddSoapBindingStub _stub = new org.demo.javabrains.AddSoapBindingStub(portAddress, this);
            _stub.setPortName(getaddWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setaddEndpointAddress(java.lang.String address) {
        add_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.demo.javabrains.Add.class.isAssignableFrom(serviceEndpointInterface)) {
                org.demo.javabrains.AddSoapBindingStub _stub = new org.demo.javabrains.AddSoapBindingStub(new java.net.URL(add_address), this);
                _stub.setPortName(getaddWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("add".equals(inputPortName)) {
            return getadd();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://javabrains.demo.org", "addService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://javabrains.demo.org", "add"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("add".equals(portName)) {
            setaddEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
