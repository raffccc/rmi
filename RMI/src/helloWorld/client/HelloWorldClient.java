package helloWorld.client;

import helloWorld.server.HelloWorld;

import java.rmi.Naming;

public class HelloWorldClient {

	public static void main(String[] args) throws Exception {
		/*
		 * I don't need to put ip since it is runing in localhost
		 * and I don't need to put the port, since it is runing in
		 * the default port 1099.
		 */
		HelloWorld obj = (HelloWorld)Naming.lookup("HelloWorld");
		System.out.println(obj.getMessage());
	}
	
}
