package edu.nju.session.client;

import edu.nju.session.factory.EJBFactory;
import edu.nju.session.stateless.HelloWorld;

public class HelloWorldClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello = (HelloWorld) EJBFactory
				.getEJB("ejb:/HelloWorldEJB/HelloWorldBean!edu.nju.session.stateless.HelloWorld");
		if (hello != null)
			System.out
					.println("Obtained a remote stateless session bean helloBean for invocation");
		System.out.println(hello.SayHello("Mary2"));

	}

}
