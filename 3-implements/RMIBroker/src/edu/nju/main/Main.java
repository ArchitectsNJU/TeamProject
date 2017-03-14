package edu.nju.main;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import edu.nju.service.ConnectService;
import edu.nju.service.ConnectServiceImpl;


public class Main {

	public static void main(String[] args) throws RemoteException {
        
        
        try {
        	

        	
        	LocateRegistry.createRegistry(1098);
 			ConnectService connect = new ConnectServiceImpl();
            java.rmi.Naming.rebind("rmi://localhost:1098/broker", connect);
            System.out.print("Broker Ready");   
 		} catch (RemoteException | MalformedURLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  
	}
}
