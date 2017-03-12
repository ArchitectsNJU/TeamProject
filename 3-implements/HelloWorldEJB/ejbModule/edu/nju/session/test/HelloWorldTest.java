package edu.nju.session.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.nju.session.stateless.HelloWorld;

public class HelloWorldTest {
	protected static HelloWorld hello;
	@BeforeClass
	public static void setUpBeforeClass(){
	
	hello = (HelloWorld)EJBFactory.getEJB("ejb:/HelloWorldEJB/HelloWorldBean!edu.nju.session.stateless.HelloWorld");
	}
	@Test
	public void testSayHello(){
	assertEquals("Mary, Hello World.  Welcome to EJB3!", hello.SayHello("Mary"));
	}

}
