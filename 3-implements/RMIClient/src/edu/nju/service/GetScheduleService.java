package edu.nju.service;

import java.rmi.Remote;
import java.util.List;

import edu.nju.vo.Schedule;

public interface GetScheduleService extends Remote{
	public List getSchedules(String username);
}
