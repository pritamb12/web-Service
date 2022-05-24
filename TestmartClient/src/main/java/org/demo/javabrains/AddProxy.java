package org.demo.javabrains;

public class AddProxy implements org.demo.javabrains.Add {
  private String _endpoint = null;
  private org.demo.javabrains.Add add = null;
  
  public AddProxy() {
    _initAddProxy();
  }
  
  public AddProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddProxy();
  }
  
  private void _initAddProxy() {
    try {
      add = (new org.demo.javabrains.AddServiceLocator()).getadd();
      if (add != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)add)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)add)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (add != null)
      ((javax.xml.rpc.Stub)add)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.demo.javabrains.Add getAdd() {
    if (add == null)
      _initAddProxy();
    return add;
  }
  
  public java.lang.String func(int a, int b) throws java.rmi.RemoteException{
    if (add == null)
      _initAddProxy();
    return add.func(a, b);
  }
  
  
}