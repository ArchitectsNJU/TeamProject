package edu.nju.service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import edu.nju.po.schedule.ScheduleFilter;
import edu.nju.rmi.ScheduleService;

public class ConnectServiceImpl extends UnicastRemoteObject implements ConnectService{

	public ConnectServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSchedule(String name)throws RemoteException  {
		// TODO Auto-generated method stub
//		return "Hi name";
//		ScheduleServerService schedule=new ScheduleServerService();
	
		
		
		ScheduleService hello = null;
//		try {
			try {
				hello = (ScheduleService) Naming.lookup("rmi://localhost:1099/hello");
				
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("broker get message");
			
			
			
			return hello.searchSchedule(new ScheduleFilter()).toString();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NotBoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		return null;
	}
	
	


}
