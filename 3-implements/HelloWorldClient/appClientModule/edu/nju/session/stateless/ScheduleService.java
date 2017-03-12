package edu.nju.session.stateless;

import javax.ejb.Remote;

@Remote
public interface ScheduleService {
	public String findRoute(String routeId);
}
