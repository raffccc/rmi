package helloWorld.client;

import helloWorld.server.HelloWorld;

import java.rmi.Naming;

public class HelloWorldClient {

	public static void main(String[] args) throws Exception {
		HelloWorld obj = (HelloWorld)Naming.lookup("//localhost/HelloWorld");
		System.out.println(obj.getMessage());
	}
	
}
