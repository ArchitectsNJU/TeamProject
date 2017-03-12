package edu.nju.session.stateless;

import javax.ejb.Remote;

@Remote
public interface ScheduleServer {
	public String findRoute(String routeId);
}
