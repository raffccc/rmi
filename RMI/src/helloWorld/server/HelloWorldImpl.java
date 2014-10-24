package helloWorld.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld {

	private static final long serialVersionUID = -231512405473655756L;

	//At� o construtor lan�a remoteException
	public HelloWorldImpl() throws RemoteException {
	}

	public String getMessage() throws RemoteException {
		return "Hello World!";
	}
	
}