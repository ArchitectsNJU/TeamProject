package edu.nju.monitor.heartbeat;

import java.util.Map;

public class IntervalCheck {

	private static IntervalCheck instance;
	
	Map<String, Double> accetableSilence;
	
	public static IntervalCheck getInstance() {
		if (instance == null) {
			synchronized (IntervalCheck.class) {
				if (instance == null)
					instance = new IntervalCheck();
			}
		}
		return instance;
	}
	
	void check(String interval){
		//参数待定意
	}
	
}
