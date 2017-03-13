package edu.nju.monitor.timer;

import java.util.Map;

import edu.nju.broker.IBroker;

public class TimeCheck {

	private static TimeCheck instance;

	Map<IBroker, Double> processTime;

	public static TimeCheck getInstance() {
		if (instance == null) {
			synchronized (TimeCheck.class) {
				if (instance == null)
					instance = new TimeCheck();
			}
		}
		return instance;
	}

	void check(IBroker broker, String process, double time) {
		// 参数待定意
	}
}
