package com.xworkz.boot;

import com.xworkz.app.RoomSafe;
import com.xworkz.app.RoomSale;
import com.xworkz.tong.RoomLuxury;

public class RoomRunner {
	public static void main(String[] args) {
		System.out.println("invoking in main method");
		RoomSale sale = new RoomLuxury();
		sale.noOfRooms();
		RoomSale sale1 = new RoomLuxury();
		sale1.noOfRooms();
		RoomSafe sale2 = new RoomLuxury();
		sale2.noOfMembers();
		sale2.noOfRooms();
		RoomLuxury sale3 = new RoomLuxury();
		sale3.noOfMembers();

	}
}
