package edu.nju.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import edu.nju.po.ticket.Ticket;

public interface UserTicketService extends Remote {

	/**
	 * 查看我的订单
	 * @param account 账户ID
	 * @return 我的订单
	 * @throws RemoteException
	 */
	List<Ticket> myTicket(String account) throws RemoteException;
}
