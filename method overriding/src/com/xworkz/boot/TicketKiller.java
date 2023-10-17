package com.xworkz.boot;

import com.xworkz.app.EconomyTicket;
import com.xworkz.app.Ticket;

public class TicketKiller {

	public static void main(String[] args) {
		System.out.println("invoking in main method");
		Ticket ticket=new EconomyTicket();
		ticket.travel();
			}
	}

