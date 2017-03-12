package edu.nju.session.client;

import edu.nju.session.factory.EJBFactory;
import edu.nju.session.stateless.ScheduleService;

public class Client {

	public static void main(String[] args) {

		ScheduleService schedule = (ScheduleService) EJBFactory
				.getEJB("ejb:/HelloWorldBroker/ScheduleBean!edu.nju.session.stateless.ScheduleService");
		System.out.println(schedule.findRoute("test"));

	}

}
