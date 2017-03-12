package edu.nju.broker.server;

import javax.ejb.Remote;

@Remote
public interface ScheduleServer {
	public String findRoute(String routeId);
}
