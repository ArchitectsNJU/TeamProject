package edu.nju.rmi;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import edu.nju.common.ServiceLocater;
import edu.nju.monitor.HeartbeatChecker;
import edu.nju.po.ticket.Ticket;
import edu.nju.security.DataEncryption;
import edu.nju.security.VisitAuthorityChecker;

public class UserTicketImpl implements UserTicketService{

	private HeartbeatChecker heartbeatChecker;
	
	private DataEncryption dataEncryption;
	private VisitAuthorityChecker visitAuthorityChecker;
	private ServiceLocater serviceLocater;
	
	
	public UserTicketImpl(){
		this.heartbeatChecker = HeartbeatChecker.getInstance();
		this.dataEncryption = new DataEncryption();
		this.visitAuthorityChecker = new VisitAuthorityChecker();
		this.serviceLocater = ServiceLocater.getInstance();
	}
	
	@Override
	public List<Ticket> myTicket(String account) throws RemoteException {
		List<Ticket> list = new ArrayList<>();
		list.add(new Ticket("000000005"));
		list.add(new Ticket("000000006"));
		return list;
	}

}
