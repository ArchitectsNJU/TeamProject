package edu.nju.service;

import java.rmi.Remote;
import java.util.List;



public interface GetScheduleService extends Remote{
	
	//�鿴�г�����
	public List getSchedules(String username);
}
