/**
 * EmployeeImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.web.service;

public class EmployeeImpServiceLocator extends org.apache.axis.client.Service implements com.web.service.EmployeeImpService {

    public EmployeeImpServiceLocator() {
    }


    public EmployeeImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeeImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for employeeImp
    private java.lang.String employeeImp_address = "http://localhost:8080/Proj/services/employeeImp";

    public java.lang.String getemployeeImpAddress() {
        return employeeImp_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String employeeImpWSDDServiceName = "employeeImp";

    public java.lang.String getemployeeImpWSDDServiceName() {
        return employeeImpWSDDServiceName;
    }

    public void setemployeeImpWSDDServiceName(java.lang.String name) {
        employeeImpWSDDServiceName = name;
    }

    public com.web.service.EmployeeImp getemployeeImp() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(employeeImp_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getemployeeImp(endpoint);
    }

    public com.web.service.EmployeeImp getemployeeImp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.web.service.EmployeeImpSoapBindingStub _stub = new com.web.service.EmployeeImpSoapBindingStub(portAddress, this);
            _stub.setPortName(getemployeeImpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setemployeeImpEndpointAddress(java.lang.String address) {
        employeeImp_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.web.service.EmployeeImp.class.isAssignableFrom(serviceEndpointInterface)) {
                com.web.service.EmployeeImpSoapBindingStub _stub = new com.web.service.EmployeeImpSoapBindingStub(new java.net.URL(employeeImp_address), this);
                _stub.setPortName(getemployeeImpWSDDServiceName());
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
        if ("employeeImp".equals(inputPortName)) {
            return getemployeeImp();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.web.com", "employeeImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.web.com", "employeeImp"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("employeeImp".equals(portName)) {
            setemployeeImpEndpointAddress(address);
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
