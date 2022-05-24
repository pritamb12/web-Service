package com.web.service;

public class EmployeeImpProxy implements com.web.service.EmployeeImp {
  private String _endpoint = null;
  private com.web.service.EmployeeImp employeeImp = null;
  
  public EmployeeImpProxy() {
    _initEmployeeImpProxy();
  }
  
  public EmployeeImpProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeImpProxy();
  }
  
  private void _initEmployeeImpProxy() {
    try {
      employeeImp = (new com.web.service.EmployeeImpServiceLocator()).getemployeeImp();
      if (employeeImp != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeImp)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeImp != null)
      ((javax.xml.rpc.Stub)employeeImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.web.service.EmployeeImp getEmployeeImp() {
    if (employeeImp == null)
      _initEmployeeImpProxy();
    return employeeImp;
  }
  
  public java.lang.String getName() throws java.rmi.RemoteException{
    if (employeeImp == null)
      _initEmployeeImpProxy();
    return employeeImp.getName();
  }
  
  public void setName(java.lang.String name) throws java.rmi.RemoteException{
    if (employeeImp == null)
      _initEmployeeImpProxy();
    employeeImp.setName(name);
  }
  
  public int getAge() throws java.rmi.RemoteException{
    if (employeeImp == null)
      _initEmployeeImpProxy();
    return employeeImp.getAge();
  }
  
  
}