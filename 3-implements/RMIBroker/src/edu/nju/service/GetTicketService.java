package edu.nju.service;

import java.rmi.Remote;


public interface GetTicketService extends Remote{
	
	//查找我已经有的票务
	public String getMyTickets(String username);
	
}
