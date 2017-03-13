package edu.nju.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import edu.nju.service.ConnectService;

public class Client {
	public static void main(String[] args) {
		 try {
			 ConnectService hello = (ConnectService) Naming.lookup("rmi://localhost:1098/broker");
	                System.out.println(hello.getSchedule("XINGANXIAN"));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
