package edu.nju.main;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import edu.nju.rmi.ScheduleImpl;
import edu.nju.rmi.ScheduleService;
import edu.nju.rmi.UserTicketImpl;
import edu.nju.rmi.UserTicketService;

public class Main {

	public final static String ip = "172.20.10.3";

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			ScheduleService scheduleService = new ScheduleImpl();
			UserTicketService userTicketService = new UserTicketImpl();
			java.rmi.Naming.rebind("rmi://" + ip + ":1099/hello", scheduleService);
			java.rmi.Naming.rebind("rmi://" + ip + ":1099/hello", userTicketService);

			System.out.println("Server is ready.");
		} catch (RemoteException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
