package com.spring._04beanscoping;

public class Ticket {

	private String ticketId;

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public Ticket(String ticketId) {
		super();
		this.ticketId = ticketId;
	}

}
