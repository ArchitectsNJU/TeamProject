package edu.nju.service;

import java.rmi.Remote;


public interface GetTicketService extends Remote{
	
	//�������Ѿ��е�Ʊ��
	public String getMyTickets(String username);
	
}
