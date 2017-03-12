package edu.nju.session.stateless;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
public class ScheduleServerBean implements ScheduleServer {

    /**
     * Default constructor. 
     */
    public ScheduleServerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String findRoute(String routeId) {
		return "This is the test result!";
	}

}
