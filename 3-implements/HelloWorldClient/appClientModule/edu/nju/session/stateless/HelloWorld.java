package edu.nju.session.stateless;

import javax.ejb.Remote;

@Remote
public interface HelloWorld {
	public String SayHello(String name);
}
