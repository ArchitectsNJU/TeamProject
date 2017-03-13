package edu.nju.monitor.timer;

import java.util.List;

import edu.nju.broker.IBroker;

public class TimeoutMonitor {
	private static TimeoutMonitor instance;
	private List<IBroker> brokers;
	
	public static TimeoutMonitor getInstance() {
		if (instance == null) {
			synchronized (TimeoutMonitor.class) {
				if (instance == null)
					instance = new TimeoutMonitor();
			}
		}
		return instance;
	}
	
	/**
	 * ��ʱ�쳣����
	 */
	void reSchedule(){
		//TODO
	}
}
