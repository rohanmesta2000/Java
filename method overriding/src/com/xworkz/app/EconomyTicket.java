package com.xworkz.app;

public class EconomyTicket extends Ticket {
	@Override
	public void travel() {
		System.out.println("invoking action in EconomyTicket");
		 super.travel();
	}
}
