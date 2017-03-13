package edu.nju.monitor.heartbeat;

import java.util.List;

import edu.nju.broker.IBroker;

public class FaultMonitor {
	
	private static FaultMonitor instance;
	private List<IBroker> brokers;
	
	public static FaultMonitor getInstance() {
		if (instance == null) {
			synchronized (FaultMonitor.class) {
				if (instance == null)
					instance = new FaultMonitor();
			}
		}
		return instance;
	}
	
	/**
	 * ¥ÌŒÛ“Ï≥£¥¶¿Ì
	 */
	void doHandle(){
		//TODO
	}
}
