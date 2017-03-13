package edu.nju.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConnectService extends Remote{
	public String  getSchedule(String name) throws RemoteException;
}
