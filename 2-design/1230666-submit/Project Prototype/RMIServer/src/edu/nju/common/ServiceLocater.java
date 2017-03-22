package edu.nju.common;

import edu.nju.monitor.HeartbeatChecker;

public class ServiceLocater {

	private static ServiceLocater instance;
	
	private HeartbeatChecker heartbeatChecker;
	
	public static ServiceLocater getInstance() {
		if (instance == null) {
			synchronized (ServiceLocater.class) {
				if (instance == null)
					instance = new ServiceLocater();
			}
		}
		return instance;
	}
	
	/**
	 * ��λ����
	 * @param serviceName
	 */
	public void findService(String serviceName){
		//TODO
	}
}
