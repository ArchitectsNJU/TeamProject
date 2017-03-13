package edu.nju.service;

import java.rmi.Remote;

import edu.nju.vo.Ticket;

public interface GetTicketService extends Remote{
	public String getMyTickets(String username);
	
}
