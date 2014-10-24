package helloWorld.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Toda interface RMI deve estender java.rmi.Remote e seus m�todos
 * devem lan�ar java.rmi.RemoteException.
 */
public interface HelloWorld extends Remote {

	String getMessage() throws RemoteException;
	
}
