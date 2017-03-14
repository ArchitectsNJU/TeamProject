package edu.nju.rmi;

import java.rmi.RemoteException;

import edu.nju.monitor.HeartbeatChecker;
import edu.nju.po.schedule.Route;
import edu.nju.po.schedule.Schedule;
import edu.nju.po.schedule.ScheduleFilter;
import edu.nju.security.DataEncryption;
import edu.nju.security.VisitAuthorityChecker;

public class ScheduleImpl implements ScheduleService {

	private VisitAuthorityChecker visitAuthorityChecker;
	private HeartbeatChecker heartbeatChecker;
	
	public ScheduleImpl(){
		this.visitAuthorityChecker = new VisitAuthorityChecker();
		this.heartbeatChecker = HeartbeatChecker.getInstance();
	}
	
	@Override
	public Schedule searchSchedule(ScheduleFilter filter) throws RemoteException {
		Schedule schedule = new Schedule();
		schedule.add(new Route("001", "����", "�Ͼ�"));
		schedule.add(new Route("002", "̩��", "�Ͼ�"));
		schedule.add(new Route("003", "�Ϻ�", "�Ͼ�"));
		return schedule;
	}

}
