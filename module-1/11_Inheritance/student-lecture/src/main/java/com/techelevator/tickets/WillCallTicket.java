package com.techelevator.tickets;

import java.math.BigDecimal;

public class WillCallTicket extends Ticket {
	
	private String ticketHolderName;
	
	public WillCallTicket(double price, String ticketHolderName) {
		super(price);
		this.ticketHolderName = ticketHolderName;
	}
	
	public String getTicketHolderName() {
		return this.ticketHolderName;
	}
	
	public BigDecimal getFee() {
		return super.getPrice().multiply(new BigDecimal(.10));
	}
}