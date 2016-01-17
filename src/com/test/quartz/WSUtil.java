package com.test.quartz;

import java.rmi.RemoteException;

import com.test.ws.MyWSServiceProxy;
import com.test.ws.MyWSServiceSoapBindingStub;
import com.test.ws.MyWSService_PortType;
import com.test.ws.MyWSService_Service;
import com.test.ws.MyWSService_ServiceLocator;

public class WSUtil {

	public void invokeWs() throws RemoteException{
		MyWSService_PortType service = new MyWSServiceProxy();
		service.sayHello();
	}
	
	public static void main(String[] args) throws RemoteException {
		
	}
}
