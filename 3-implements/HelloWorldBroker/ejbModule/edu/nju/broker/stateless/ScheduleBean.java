package edu.nju.broker.stateless;

import javax.ejb.Stateless;

import edu.nju.broker.factory.EJBFactory;
import edu.nju.broker.server.ScheduleServer;

/**
 * Session Bean implementation class ScheduleBean
 */
@Stateless
public class ScheduleBean implements ScheduleService {

	@Override
	public String findRoute(String routeId) {
		ScheduleServer scheduleServer = (ScheduleServer) EJBFactory
				.getEJB("ejb:/HelloWorldEJB/ScheduleServerBean!edu.nju.session.stateless.ScheduleServer");
		return scheduleServer.findRoute(routeId);
		// return "why";
	}

}
