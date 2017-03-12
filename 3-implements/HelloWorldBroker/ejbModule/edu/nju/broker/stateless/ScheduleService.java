package edu.nju.broker.stateless;

import javax.ejb.Remote;

@Remote
public interface ScheduleService {
	public String findRoute(String routeId);
}
