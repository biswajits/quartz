/**
 * MyWSService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.ws;

public class MyWSService_ServiceLocator extends org.apache.axis.client.Service implements com.test.ws.MyWSService_Service {

    public MyWSService_ServiceLocator() {
    }


    public MyWSService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MyWSService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MyWSPort
    private java.lang.String MyWSPort_address = "http://localhost:8080/TestWS/services/MyWSPort";

    public java.lang.String getMyWSPortAddress() {
        return MyWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MyWSPortWSDDServiceName = "MyWSPort";

    public java.lang.String getMyWSPortWSDDServiceName() {
        return MyWSPortWSDDServiceName;
    }

    public void setMyWSPortWSDDServiceName(java.lang.String name) {
        MyWSPortWSDDServiceName = name;
    }

    public com.test.ws.MyWSService_PortType getMyWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MyWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMyWSPort(endpoint);
    }

    public com.test.ws.MyWSService_PortType getMyWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.test.ws.MyWSServiceSoapBindingStub _stub = new com.test.ws.MyWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMyWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMyWSPortEndpointAddress(java.lang.String address) {
        MyWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.test.ws.MyWSService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.test.ws.MyWSServiceSoapBindingStub _stub = new com.test.ws.MyWSServiceSoapBindingStub(new java.net.URL(MyWSPort_address), this);
                _stub.setPortName(getMyWSPortWSDDServiceName());
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
        if ("MyWSPort".equals(inputPortName)) {
            return getMyWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.test.com/", "MyWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.test.com/", "MyWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MyWSPort".equals(portName)) {
            setMyWSPortEndpointAddress(address);
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
