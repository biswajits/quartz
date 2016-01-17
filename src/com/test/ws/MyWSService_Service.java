/**
 * MyWSService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.ws;

public interface MyWSService_Service extends javax.xml.rpc.Service {
    public java.lang.String getMyWSPortAddress();

    public com.test.ws.MyWSService_PortType getMyWSPort() throws javax.xml.rpc.ServiceException;

    public com.test.ws.MyWSService_PortType getMyWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
