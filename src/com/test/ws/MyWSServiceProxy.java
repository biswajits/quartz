package com.test.ws;

public class MyWSServiceProxy implements com.test.ws.MyWSService_PortType {
  private String _endpoint = null;
  private com.test.ws.MyWSService_PortType myWSService_PortType = null;
  
  public MyWSServiceProxy() {
    _initMyWSServiceProxy();
  }
  
  public MyWSServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMyWSServiceProxy();
  }
  
  private void _initMyWSServiceProxy() {
    try {
      myWSService_PortType = (new com.test.ws.MyWSService_ServiceLocator()).getMyWSPort();
      if (myWSService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)myWSService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)myWSService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (myWSService_PortType != null)
      ((javax.xml.rpc.Stub)myWSService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.test.ws.MyWSService_PortType getMyWSService_PortType() {
    if (myWSService_PortType == null)
      _initMyWSServiceProxy();
    return myWSService_PortType;
  }
  
  public void sayHello() throws java.rmi.RemoteException{
    if (myWSService_PortType == null)
      _initMyWSServiceProxy();
    myWSService_PortType.sayHello();
  }
  
  
}