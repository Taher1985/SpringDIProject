package com.spring._04beanscoping;

public class Viewer {

	private String viewerName;
	private Ticket ticket;

	public Viewer(String viewerName, Ticket ticket) {
		super();
		this.viewerName = viewerName;
		this.ticket = ticket;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public void viewerTicketNumber(Ticket ticket) {
		setTicket(ticket);
	}

	public void viewerTicketNumber() {
		System.out.println("Viewer Name is " + viewerName
				+ " and Ticket id is " + getTicket().getTicketId());
	}

}
