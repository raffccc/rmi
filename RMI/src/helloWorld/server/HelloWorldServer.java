package helloWorld.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class HelloWorldServer {

	public static void main(String[] args) throws Exception {
		System.out.println("RMI server started");
		
		try {
			/*
			 * Creates and exports a registry where objects will be registered,
			 * I choosed here port 1099 which is the default port where
			 * RMI Registry runs
			 */
			LocateRegistry.createRegistry(1099);
			System.out.println("Java RMI registry created.");
		} catch (RemoteException e) {
			System.out.println("Java RMI registry already exists.");
		}
		
		HelloWorldImpl obj = new HelloWorldImpl();
		
		/*
		 * Bind obj instance to the name "RmiServer".
		 * Rebind replaces any existing object.
		 * 
		 * The main method doesn't end because this object will
		 * be published and the registry will still be alive until
		 * the object be unexported.
		 */
		Naming.rebind("//localhost/HelloWorld", obj);
//		UnicastRemoteObject.unexportObject(obj, true);
		System.out.println("RmiServer bound in registry");
	}
	
}
