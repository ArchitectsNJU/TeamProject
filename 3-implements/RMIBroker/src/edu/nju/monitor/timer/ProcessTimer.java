package edu.nju.monitor.timer;

import java.util.Map;

import edu.nju.broker.IBroker;

public class ProcessTimer {

	private static ProcessTimer instance;

	Map<IBroker, String> brokerState;

	private ProcessTimer processTimer;
	private TimeoutMonitor timeoutMonitor;

	private ProcessTimer() {
		this.processTimer = ProcessTimer.getInstance();
		this.timeoutMonitor = TimeoutMonitor.getInstance();
	}

	public static ProcessTimer getInstance() {
		if (instance == null) {
			synchronized (ProcessTimer.class) {
				if (instance == null)
					instance = new ProcessTimer();
			}
		}
		return instance;
	}

	/**
	 * 出现超时异常，通知TimeoutMonitor
	 */
	void timeOut() {

	}
}
