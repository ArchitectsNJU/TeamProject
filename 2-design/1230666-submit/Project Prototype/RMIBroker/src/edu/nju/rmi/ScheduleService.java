package edu.nju.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import edu.nju.po.schedule.Schedule;
import edu.nju.po.schedule.ScheduleFilter;

public interface ScheduleService extends Remote {
	
	/**
	 * 查找列车时刻信息 
	 * @param filter 筛�?�信�? 
	 * @return 时刻信息
	 * @throws RemoteException
	 */
	Schedule searchSchedule(ScheduleFilter filter) throws RemoteException;

}
