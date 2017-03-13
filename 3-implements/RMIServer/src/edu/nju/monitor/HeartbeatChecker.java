package edu.nju.monitor;

public class HeartbeatChecker {

	private static HeartbeatChecker instance;

	private int maxTimeInterval;

	private HeartbeatChecker() {
		maxTimeInterval = 100;
	}

	public static HeartbeatChecker getInstance() {
		if (instance == null) {
			synchronized (HeartbeatChecker.class) {
				if (instance == null)
					instance = new HeartbeatChecker();
			}
		}
		return instance;
	}

	/**
	 * ���Ź�
	 */
	public void cancelWarning() {
		//TODO
	}

	/**
	 * ����
	 */
	public void warning() {
		//TODO
	}
}
