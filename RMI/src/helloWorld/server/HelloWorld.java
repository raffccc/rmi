package helloWorld.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Toda interface RMI deve estender java.rmi.Remote e seus métodos
 * devem lançar java.rmi.RemoteException.
 */
public interface HelloWorld extends Remote {

	String getMessage() throws RemoteException;
	
}
