package edu.nju.po.ticket;

import java.io.Serializable;

public class Ticket implements Serializable {

	String ticketId;

	public Ticket(String ticketId) {
		super();
		this.ticketId = ticketId;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

}
