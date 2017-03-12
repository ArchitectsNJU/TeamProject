package edu.nju.service;

import java.rmi.Remote;
import java.util.List;



public interface GetScheduleService extends Remote{
	
	//查看列车调度
	public List getSchedules(String username);
}
