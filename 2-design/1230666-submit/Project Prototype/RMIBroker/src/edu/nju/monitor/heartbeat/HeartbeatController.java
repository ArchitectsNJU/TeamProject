package edu.nju.monitor.heartbeat;



public class HeartbeatController {

	private static HeartbeatController instance;

	private IntervalCheck intervalCheck;
	private FaultMonitor faultMonitor;
	
	private HeartbeatController() {
		this.intervalCheck = IntervalCheck.getInstance();
		this.faultMonitor = FaultMonitor.getInstance();
	}

	public static HeartbeatController getInstance() {
		if (instance == null) {
			synchronized (HeartbeatController.class) {
				if (instance == null)
					instance = new HeartbeatController();
			}
		}
		return instance;
	}

	/**
	 * ¿´ÃÅ¹·
	 */
	public void cancelWarning() {
		// TODO
	}

	/**
	 * ±¨¾¯
	 */
	public void warning() {
		// TODO
	}
}
